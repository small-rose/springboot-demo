package com.example.temp.annotation;

import java.lang.annotation.*;

/**
 * @program: springboot-limiter
 * @description
 * @function:
 * @author: zhangxiaocai
 * @create: 2021-05-22 13:44
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface RateLimitFallBack {

    String defaultFail() default "defaultFail()" ;


}
