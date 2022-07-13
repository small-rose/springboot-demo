package com.xiaocai.demo.event.guava.spring.annotation;


import org.springframework.stereotype.Service;

import java.lang.annotation.*;

/**
 *  本质还是 spring bean 的注解，标记订阅者
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface EventSubscriber {

}
