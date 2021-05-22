package com.example.temp.annotation;

import java.lang.annotation.*;
import java.util.concurrent.TimeUnit;

/**
 * springboot-limiter
 * @author ZHANGXIAOCAI
 */
@Documented
@Retention( RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Inherited
public  @interface RateLimitFCL {

    String failBack() default "";

    /**
     * 最大限流数
     * @return
     */
    long maxLimited() default 3;

    /**
     * 限流窗口周期
     * @return
     */
    long period() default 10;

    /**
     *  限流窗口周期-单位 默认是s
     * @return
     */
    TimeUnit timeUnit() default TimeUnit.SECONDS;
}
