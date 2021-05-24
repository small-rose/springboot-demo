package com.example.temp.annotation;

import com.example.temp.fallback.FallBackHandler;
import com.example.temp.handler.LeakyBucketRateLimitHandler;
import com.example.temp.limit.LeakyBucketRateLimiter;
import com.example.temp.limit.TokenBucketRateLimiter;

import java.lang.annotation.*;
import java.util.concurrent.TimeUnit;
/**
 * springboot-limiter
 * TODO 限流注解--固定时间窗口期 period 内限流  maxLimited
 * @author ZHANGXIAOCAI
 * @create: 2021-05-24 13:47
 */
@Documented
@Retention( RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Inherited
public @interface RateLimitLBL {

    /**
     * 限流降级时执行的方法
     * @return
     */
    String failBack() default FallBackHandler.DEFAULT_FALL_BACK ;;

    /**
     * 令牌漏斗 最大令牌数量
     * @return
     */
    long maxLimit() default LeakyBucketRateLimiter.DEFAULT_MAX_LIMIT;

    /**
     * 存入令牌-可以接受的等待（超时）时间
     * @return
     */
    long timeout() default 100 ;

    /**
     * 获取令牌-可以接受的等待（超时）时间 单位
     * @return
     */
    TimeUnit timeUnit() default TimeUnit.MILLISECONDS;

    /**
     * 每时间单位 移出 N个令牌放
     * @return
     */
    long leakNum() default 1;

    /**
     * 移出 令牌的周期延迟
     * @return
     */
    long initialDelay() default 1 ;

    /**
     * 移出 令牌的 执行周期
     * @return
     */
    long period() default 1;

    /**
     * 移出 时的时间单位
     * @return
     */
    TimeUnit leakTimeUnit() default TimeUnit.SECONDS;
}
