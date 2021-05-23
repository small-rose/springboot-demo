package com.example.temp.annotation;

import com.example.temp.fallback.FallBackHandler;

import java.lang.annotation.*;
import java.util.concurrent.TimeUnit;

/**
 * @program: springboot-limiter
 * TODO  滑动窗口限流注解，
 * @function:
 * @author: zhangxiaocai
 * @create: 2021-05-18 12:34
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface RateLimitSWL {
    /**
     *  到达限流时的降级方法名
     * @return
     */
    String failBack() default FallBackHandler.DEFAULT_FALL_BACK ;;

    /**
     * 滑动窗口的周期
     * @return
     */
    int timeWindowPeriod() default 60;

    /**
     * 滑动窗口的周期内的最大QPS流量
     * @return
     */
    long maxLimited() default 30L;

    /**
     * 滑动窗口可以分割多少个小窗口
     * @return
     */
    int blocks() default 10;

    /**
     * 滑动窗口就是为了平滑区间与流量，因此此值不建议修改
     * 如果改成false, 将变成  多个固定小窗口周期进行求和总限流
     * @return
     */
    boolean enableBlockAvg() default true;

    /**
     *
     * @return
     */
    TimeUnit timeUnit() default TimeUnit.SECONDS;
}
