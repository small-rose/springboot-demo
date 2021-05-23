package com.example.temp.annotation;

import com.example.temp.fallback.FallBackHandler;

import java.lang.annotation.*;

/**
 * @program: springboot-limiter
 * @description
 * @function:  异常降级注解
 * @author: zhangxiaocai
 * @create: 2021-05-22 13:44
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface ExceptionFallBack {
    /**
     *  发生异常时，降级执行的方法
     *  一般与api 方法与参数， 返回类型一致
     * @return
     */
    String fallback() default FallBackHandler.DEFAULT_FALL_BACK ;

    /**
     *  允许执行降级的异常 默认是 RuntimeException 和 Error
     *  写法类型 事务注解遇到某些异常会回滚
     * @return
     */
    Class<? extends Throwable>[] fallbackFor() default {};

    /**
     *  允许执行降级的异常的名字 如 "NullPointException"
     * @return
     */
    String[] fallbackForClassName() default {};

    /**
     *  不允许执行降级的异常类 如 NullPointException.class
     * @return
     */
    Class<? extends Throwable>[] noFallbackFor() default {};

    /**
     *  不允许执行降级的异常的名字 如 "NullPointException"
     * @return
     */
    String[] noFallbackForClassName() default {};
}
