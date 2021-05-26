package cn.xiaocai.spi.demo;

import org.dromara.hmily.spi.ScopeType;

import java.lang.annotation.*;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-26 17:55
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MySPI {

    /**
     * Value string.
     *
     * @return the string
     */
    String value();

    /**
     * Order int.
     *
     * @return the int
     */
    int order() default 0;

    /**
     * Scope type scope type.
     *
     * @return the scope type
     */
    ScopeType scopeType() default ScopeType.SINGLETON;
}
