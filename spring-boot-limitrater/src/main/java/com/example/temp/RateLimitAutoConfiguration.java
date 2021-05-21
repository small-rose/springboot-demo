package com.example.temp;

import com.example.temp.aop.SpringRateLimitAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-21 13:58
 **/
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class RateLimitAutoConfiguration {

    /**
     * rate limit  aspect spring boot rate limit  aspect.
     *
     * @return the spring boot rate limit aspect
     */
    @Bean
    public SpringRateLimitAspect springRateLimitAspect() {
        return new SpringRateLimitAspect();
    }
}
