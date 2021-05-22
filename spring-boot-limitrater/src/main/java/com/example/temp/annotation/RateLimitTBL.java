package com.example.temp.annotation;

import com.example.temp.limit.TokenBucketRateLimiter;

import java.lang.annotation.*;
import java.util.concurrent.TimeUnit;

/**
 * @program: springboot-limiter
 * @description
 * @function:
 * @author: zhangxiaocai
 * @create: 2021-05-21 22:17
 **/
@Documented
@Retention( RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface RateLimitTBL {

    String failBack() default "";

    long maxLimit() default TokenBucketRateLimiter.DEFAULT_MAX_LIMIT;

    long timeout() default 100 ;

    TimeUnit timeUnit() default TimeUnit.MILLISECONDS;

    long createPerSecond() default 1;

    long createDelay() default 1 ;

    long createPeriod() default 1;

    TimeUnit createTimeUnit() default TimeUnit.SECONDS;


}
