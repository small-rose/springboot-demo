package cn.xaiocai.limiter.distributed.annotation;

import cn.xaiocai.limiter.distributed.auto.RateLimiterAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

import java.lang.annotation.*;


/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-28 13:07
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ImportAutoConfiguration(RateLimiterAutoConfiguration.class)
@Documented
@Inherited
public @interface EnableDistributedRateLimiter {


}
