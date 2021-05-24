package com.example.temp.limit;

import com.example.temp.limit.factory.NamedThreadFactory;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import javax.annotation.PreDestroy;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：   令牌桶--限流算法
 * @author: 张小菜
 * @date: 2021/5/21 22:18
 * @version: v1.0
 */
@Slf4j
public class TokenBucketRateLimiter extends TokenCooperating implements IRateLimiter{

    // 抽象到父类
    //public final static Map<String, TokenCooperating> RATE_LIMITER_MAP = new ConcurrentHashMap<>();

    public final static TokenBucketManager tokenBucketManager = new TokenBucketManager();

    public static final long DEFAULT_MAX_LIMIT = 1000;

    private final long minLimit = 0;

    private final TokenBucket tokenBucket ;

    public TokenBucketRateLimiter(long maxLimit, long createNumUnit, long timeout, TimeUnit timeUnit,
                                  long createDelay, long createPeriod, TimeUnit createTimeUnit) {

        Assert.isTrue(maxLimit > 0 , "this attribute 'maxLimit' must be greater than 0 ");
        tokenBucket = new TokenBucket(maxLimit, createNumUnit, timeout, timeUnit,  createDelay,  createPeriod,  createTimeUnit);
    }

    @Override
    public boolean isOverLimit() {
        log.info("before total token = "+ tokenBucket.getToken().get());
        if (tokenBucket.tryAcquire()){
            // 拿到令牌就不限流
            log.info("total token = "+tokenBucket.getToken().get());
            return false;
        }
        return true;
    }

    @Override
    public Long currentQps() {
        return tokenBucket.getToken().get();
    }


    /**
     * 补充令牌
     */
    @Override
    public void cooperating(final ExecutorService executorService){
        // 按照指定的速率 放令牌
        long free = tokenBucket.getMaxLimit() - currentQps();
        if (log.isDebugEnabled()){
            log.info("supply maxLimit : "+tokenBucket.getMaxLimit() +" , current total token = "+currentQps());
        }

        if (free >= tokenBucket.getCreateNumUnit()){
            tokenBucket.getToken().getAndAdd(tokenBucket.getCreateNumUnit());
            log.info("supply token add : "+tokenBucket.getCreateNumUnit() +" , total token = "+currentQps());
        }else{
            if (log.isDebugEnabled()){
                log.info("the LeakyBucket  size [ "+currentQps()+" ] is full ! ");
            }
        }

        executorService.execute(() -> {
            synchronized (lock){
                lock.notifyAll();
            }
        });
    }


    @Data
    private class TokenBucket{
        /**
         *  桶内令牌个数
         */
        private volatile AtomicLong token ;
        /**
         * 桶中 令牌最大数目
         */
        private final long maxLimit ;
        /**
         * 获取令牌的超时时间
         */
        private final long timeout;
        /**
         *  获取令牌的超时时间 单位时间
         */
        private final TimeUnit timeUnit;

        /**
         *  桶内令牌 每个执行周期内 创建令牌个数
         */
        private final long createNumUnit ;
        /**
         *  执行周期延迟
         */
        private final long createDelay ;
        /**
         * 执行周期间隔 时间
         */
        private final long createPeriod ;
        /**
         * 执行周期间隔时间单位 （默认是秒）
         */
        private final TimeUnit createTimeUnit;


        public TokenBucket(long maxLimit, long createNumUnit,long timeout, TimeUnit timeUnit, long createDelay, long createPeriod, TimeUnit createTimeUnit) {
            this.maxLimit = maxLimit;
            this.createNumUnit = createNumUnit;
            this.timeUnit = timeUnit;
            this.timeout = this.timeUnit.toMillis(timeout);
            this.createDelay = createDelay;
            this.createPeriod = createPeriod;
            this.createTimeUnit = createTimeUnit;
            // 初始化，默认令牌数为最大令牌数
            token = new AtomicLong(maxLimit);
            // 启动添加令牌的调度
            tokenBucketManager.init(createDelay, createPeriod, createTimeUnit);
        }


        /**
         * 尝试 取到令牌
         * @return
         */
        private boolean tryAcquire(){

            if(tryGetToken()){
                return true;
            }
            long now = System.currentTimeMillis();
            long expire = timeUnit.toMillis(timeout);
            long future = now + expire;
            // 获取不到就 等待超时时间
            log.info("尝试获取令牌时，桶内剩余令牌数："+token.get());
            while (token.get() <= minLimit  && timeout > 0
                    && ( System.currentTimeMillis() <= future )){

                waitLock(lock, timeout);
                if (tryGetToken()){
                    // 在超时时间范围内,尝试拿到了令牌
                    return true;
                }
            }
            return false;
        }
        /**
         *  获取令牌操作
         * @return
         */
        private boolean tryGetToken(){
            if (token.get() > minLimit && token.decrementAndGet() >= 0){
                //获取到令牌了
                log.info("桶内剩余令牌数："+token.get());
                return true;
            }
            return false;
        }
    }


    @Data
    public static class TokenBucketManager{

        // 定时线程
        private final static ScheduledThreadPoolExecutor scheduledCheck = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),
                new NamedThreadFactory("token-bucket-group", "token-bucket-factory"));
        // 执行补充线程池
        private final ExecutorService executorService = new ThreadPoolExecutor(5, 200,
                60L, TimeUnit.SECONDS, new SynchronousQueue<>(),
                new NamedThreadFactory("token-bucket-group", "token-bucket-factory"),
                new ThreadPoolExecutor.DiscardPolicy());


        public void init(long createDelay,long createPeriod, TimeUnit createTimeUnit){
            scheduledCheck.scheduleAtFixedRate(new SupplementRateLimiter(), createDelay, createPeriod, createTimeUnit);
        }

        @PreDestroy
        public void destroy(){
            scheduledCheck.shutdown();
        }

        /**
         * 补充相应的令牌数
         */
        private class SupplementRateLimiter implements Runnable{
            @Override
            public void run(){
                RATE_LIMITER_MAP.values().forEach(rateLimiter -> rateLimiter.cooperating(executorService));
            }
        }

    }

}
