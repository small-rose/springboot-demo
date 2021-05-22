package com.example.temp.limit;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

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
public class TokenBucketRateLimiter implements TokenSupply, IRateLimiter{

    public final static TokenBucketManager tokenBucketManager = new TokenBucketManager();
    private final Object lock = new Object();

    public static final long DEFAULT_MAX_LIMIT = 1000;
    /**
     *  桶内令牌个数
     */
    private volatile AtomicLong token ;
    /**
     * 桶中 令牌最大数目
     */
    private long maxLimit ;
    /**
     * 获取令牌的超时时间
     */
    private long timeout;
    /**
     *  获取令牌的超时时间 单位时间
     */
    private TimeUnit timeUnit;

    /**
     *  桶内令牌每秒创建个数
     */
    private long createNumPerSecond ;

    private long createDelay ;

    private long createPeriod ;

    private TimeUnit createTimeUnit;

    private long minLimit = 0;

    public TokenBucketRateLimiter(long maxLimit, long createNumPerSecond, long timeout, TimeUnit timeUnit,
                                  long createDelay, long createPeriod, TimeUnit createTimeUnit) {
        this.maxLimit = maxLimit;
        this.createNumPerSecond = createNumPerSecond;

        this.timeUnit = timeUnit;
        this.timeout = this.timeUnit.toMillis(timeout);

        this.createDelay = createDelay;
        this.createPeriod = createPeriod;
        this.createTimeUnit = createTimeUnit;
        long expire = timeUnit.toMillis(timeout);
        init();
    }

    private void init() {
        // 初始化，默认令牌数为最大令牌数
        token = new AtomicLong(maxLimit);
        TokenBucketManager.rateLimiterMap.put("",this);
        tokenBucketManager.init(createDelay, createPeriod, createTimeUnit);
    }



    @Override
    public boolean isOverLimit() {
        log.info("before total token = "+token.get());
        if (tryAcquire()){
            // 拿到令牌就不限流
            log.info("total token = "+token.get());
            return false;
        }
        return true;
    }

    @Override
    public Long currentQps() {
        return token.get();
    }

    private boolean tryAcquire(){

        if(getToken()){
            return true;
        }

        long now = System.currentTimeMillis();
        long future = now + timeout;
        // 获取不到就
        log.info("尝试获取令牌时，桶内剩余令牌数："+token.get());
        while (token.get() <= minLimit  && timeout > 0){

            synchronized (lock) {
                try {
                    log.info(Thread.currentThread().getName()+" will wait ---");
                    lock.wait(timeout);
                    log.info(Thread.currentThread().getName()+" will start ---");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }

            if (future >= System.currentTimeMillis() && getToken()){
                // 在超时时间范围内,拿到了令牌
                return true;
            } else{
                return false;
            }
        }
        return false;
    }

    private boolean getToken(){
        if (token.get() > minLimit && token.decrementAndGet() >= 0){
            //获取到令牌了
            log.info("桶内剩余令牌数："+token.get());
            return true;
        }
        return false;
    }

    /**
     * 补充令牌
     */
    public void supplement(final ExecutorService executorService){
        // 按照指定的速率 放令牌
        long free = maxLimit - token.get();
        log.info("supply maxLimit : "+maxLimit +" , total token = "+token.get());
        if (free >= createNumPerSecond){
            token.getAndAdd(this.createNumPerSecond);
            log.info("supply token add : "+createNumPerSecond +" , total token = "+token.get());
        }

        executorService.execute(() -> {
            synchronized (lock){
                lock.notifyAll();
            }
        });
    }


    @Data
    public static class TokenBucketManager{

        public final static Map<String, TokenSupply> rateLimiterMap = new ConcurrentHashMap<>();
        // 定时线程
        private final ScheduledThreadPoolExecutor scheduledCheck = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors());
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
                rateLimiterMap.values().forEach(rateLimiter -> rateLimiter.supplement(executorService));
            }
        }

        /**
         * 自定义工厂池
         */
        static class NamedThreadFactory implements ThreadFactory{
            private final AtomicInteger poolNumber = new AtomicInteger(1);
            private final ThreadGroup group;
            private final AtomicInteger threadNumber = new AtomicInteger(1);
            private final String namePrefix;
            private final String factoryName;

            public NamedThreadFactory(String group,String factoryName) {
                this.group = new ThreadGroup(group);
                this.factoryName = factoryName;
                namePrefix = factoryName + "-pool-" +
                        poolNumber.getAndIncrement() +
                        "-thread-";
            }

            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(group, r,
                        namePrefix + threadNumber.getAndIncrement(),
                        0);
                return t;
            }
        }
    }

}
