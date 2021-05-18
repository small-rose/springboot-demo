package com.example.temp.annotation;

import java.lang.annotation.*;

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

    int timeWindowPeriod() default 10;

    long maxLimited() default 10L;

    int blocks() default 10;


}
