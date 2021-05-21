package com.example.temp.limit;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 固定周期 限流 算法
 * @author: 张小菜
 * @date: 2021/5/20 22:59
 * @version: v1.0
 */
@Slf4j
public class FixPeriodCountRateLimiter implements IRateLimiter{


    /**
     *  默认-时间窗口内 最大访问阈值
     */
    private static final long DEFAULT_MAX_LIMIT =  1000L;
    /**
     * 默认时间窗口期 10s
     */
    private static final long DEFAULT_TIME_WINDOW_PERIOD = 10;

    /**
     *  时间窗口内 最大访问阈值
     */
    private long maxLimit = 0L;

    /**
     * 默认的时间单位
     */
    private TimeUnit timeUnit = TimeUnit.SECONDS;;

    /**
     * 默认时间窗口周期
     */
    private long timeWindowPeriod ;

    /**
     * 开始时间
     */
    private long startTime ;
    /**
     * 计数器
     */
    private AtomicLong counter ;

    public FixPeriodCountRateLimiter(){ }

    public FixPeriodCountRateLimiter(long maxLimit, long timeWindowPeriod, TimeUnit timeUnit) {
        this.maxLimit = maxLimit;
        this.timeUnit = timeUnit;
        this.timeWindowPeriod = timeUnit.toMillis(timeWindowPeriod);
        this.counter = new AtomicLong(0);
        init();
    }


    private void init() {
        startTime = System.currentTimeMillis();
        counter = new AtomicLong(0);
    }

    @Override
    public boolean isOverLimit() {
        reset();
        log.info("before current qps = "+currentQps() +" , maxLimit = "+maxLimit);
        if (currentQps() >= maxLimit){
            return true;
        }
        this.counter.addAndGet(1);
        log.info("after  current qps = "+currentQps() +" , maxLimit = "+maxLimit);
        return false;
    }

    /**
     * 验证本次请求是否在时间窗口期内
     */
    private synchronized void reset(){
        long now = System.currentTimeMillis();
        long period  =  now - startTime ;

        if (period > timeWindowPeriod){
            this.counter.set(0);
            this.startTime = now;
            log.info("reset counter = 0 , maxLimit = "+maxLimit);
        }
    }

    @Override
    public Long currentQps() {
        return this.counter.get();
    }
}
