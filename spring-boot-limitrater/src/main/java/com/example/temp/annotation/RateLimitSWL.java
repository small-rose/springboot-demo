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
public @interface RateLimitSWL {

    int timeWindowPeriod() default 60;

    long maxLimited() default 30L;

    int blocks() default 10;

    /**
     * 滑动窗口就是为了平滑区间与流量，因此此值不建议修改
     * 如果改成false,
     * @return
     */
    boolean enableBlockAvg() default true;

    TimeUnit timeUnit() default TimeUnit.SECONDS;
}
