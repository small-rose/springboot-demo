package com.example.temp.annotation;

import java.lang.annotation.*;
import java.util.concurrent.TimeUnit;

/**
 * @program: springboot-redis
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-18 12:34
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Inherited
public @interface RateLimiter {

    int timeWindowPeriod() default 60;

    long maxLimited() default 30L;

    int blocks() default 10;

    boolean enableBlockAvg() default false;

    TimeUnit timeUnit() default TimeUnit.SECONDS;
}
