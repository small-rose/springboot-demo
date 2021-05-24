package com.example.temp.limit;

import com.example.temp.limit.factory.NamedThreadFactory;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.util.Assert;

import javax.annotation.PreDestroy;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-24 12:22
 **/
@Slf4j
public class LeakyBucketRateLimiter extends TokenCooperating implements IRateLimiter{
    // 抽象到父类
    //public final static Map<String, TokenCooperating> RATE_LIMITER_MAP = new ConcurrentHashMap<>();

    public final static TokenBucketManager TOKEN_BUCKET_MANAGER = new TokenBucketManager();

    /**
     *  漏斗内 最大令牌数量
     */
    public static final long DEFAULT_MAX_LIMIT = 100;
    /**
     * 存放令牌 允许超时时间
     */
    private long timeout = 100;

    private final LeakyBucket leakyBucket ;

    public LeakyBucketRateLimiter(long maxLimit,
                                  long timeout, TimeUnit timeoutUnit,
                                  long leakNum, long initialDelay, long perUnit, TimeUnit timeUnit){
        Assert.isTrue(maxLimit > 0 , "this attribute 'maxLimit' must be greater than 0 ");
        this.timeout = timeoutUnit.toMillis(timeout);
        this.leakyBucket = new LeakyBucket(maxLimit, leakNum, initialDelay, perUnit, timeUnit);

    }

    @Override
    public boolean isOverLimit() {
        if (tryAcquire()){
            // 放入令牌就不限流
            log.info("put token success ! total token = "+leakyBucket.getToken().get());
            return false;
        }
        return true;
    }

    /**
     * 尝试向漏斗添加令牌
     * @return
     */
    private boolean tryAcquire() {
        if(putToken()){
            return true;
        }
        long now = System.currentTimeMillis();
        long future = now + timeout;
        // 放入令牌，放不进去就等一下再试
        log.info("尝试获取令牌时，桶内剩余令牌数："+leakyBucket.getToken().get());
        while (leakyBucket.getToken().get() >= leakyBucket.getMaxLimit()
                && ( System.currentTimeMillis() <= future)){
            waitLock(lock,  timeout);
            if (putToken()){
                // 在超时时间范围内, 往漏斗放入了令牌
                return true;
            }
        }
        return false;
    }


    /**
     * 放入令牌操作
     * @return
     */
    private boolean putToken(){
        if(currentQps() < leakyBucket.getMaxLimit()
                && leakyBucket.getToken().incrementAndGet()< leakyBucket.getMaxLimit()){
            log.info("放入漏斗成功，漏斗内现有令牌数："+leakyBucket.getToken().get());
            return true;
        }
        return false;
    }

    @Override
    public Long currentQps() {
        return leakyBucket.getToken().get();
    }

    @Override
    public void cooperating(final ExecutorService executorService) {
        // 按照指定的速率 放令牌
        long free = leakyBucket.getToken().get();

        if (free > 0){
            leakyBucket.getToken().compareAndSet(leakyBucket.getToken().get(), (leakyBucket.getToken().get()- leakyBucket.getLeakNum()));
            log.info("leak token : "+leakyBucket.getLeakNum() +" , total token = "+leakyBucket.getToken().get());
        }else{
            if (log.isDebugEnabled()){
                log.info("the LeakyBucket  size [ "+leakyBucket.getToken().get()+" ] is empty ! ");
            }
        }
        executorService.execute(() -> {
            synchronized (lock){
                lock.notifyAll();
            }
        });
    }

    /**
     * 定义一个漏斗
     */
    @Data
    private static class LeakyBucket{
        /**
         * 漏斗 最大存储令牌数
         */
        private long maxLimit ;
        /**
         * 漏斗 移出令牌个数
         */
        private long leakNum ;

        /**
         * 令牌移出 执行延迟时间 ( 转成 毫秒)
         */
        private long initialDelay;
        /**
         * 令牌移出 执行间隔时间 ( 转成 毫秒)
         */
        private long perUnit ;
        /**
         * 令牌移出 时间单位（默认是秒） ( 转成 毫秒)
         */
        private TimeUnit timeUnit;
        /**
         *  漏斗内当前令牌数量
         */
        private AtomicLong token;

        public LeakyBucket(long maxLimit, long leakNum, long initialDelay, long perUnit, TimeUnit timeUnit) {
            this.maxLimit =  maxLimit;
            this.leakNum =  leakNum;
            this.timeUnit =  timeUnit;
            this.initialDelay = initialDelay;
            this.perUnit =  perUnit;

            // 初始化，漏斗中令牌数
            this.token = new AtomicLong(0);
            TOKEN_BUCKET_MANAGER.init(this.initialDelay, this.perUnit, this.timeUnit);
        }
    }


    @Data
    public static class TokenBucketManager{

        //public final static Map<String, TokenCooperating> rateLimiterMap = new ConcurrentHashMap<>();
        // 定时线程
        private static final ScheduledThreadPoolExecutor scheduledCheck = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),
                new NamedThreadFactory("token-bucket-group", "token-bucket-factory"));
        // 执行补充线程池
        private final ExecutorService executorService = new ThreadPoolExecutor(5, 200,
                60L, TimeUnit.SECONDS, new SynchronousQueue<>(),
                new NamedThreadFactory("leaky-bucket-group", "leaky-bucket-factory"),
                new ThreadPoolExecutor.DiscardPolicy());


        public void init(long initialDelay, long perUnit, TimeUnit timeUnit){
            //log.info("----初始化调度漏斗移除令牌调度---");
            scheduledCheck.scheduleAtFixedRate(new ConsumerRateLimiter(), initialDelay, perUnit, timeUnit);
        }


        @PreDestroy
        public void destroy(){
            scheduledCheck.shutdown();
        }

        /**
         * 移除相应的令牌数
         */
        private class ConsumerRateLimiter implements Runnable{
            @Override
            public void run(){
                RATE_LIMITER_MAP.values().forEach(rateLimiter -> rateLimiter.cooperating(executorService));
            }
        }

    }
}
