package com.example.temp.annotation;


import java.lang.annotation.*;

@Documented
@Retention( RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
public @interface LimitStrategy {

    LimitTypeEnum value() default LimitTypeEnum.RateLimiter;

}
