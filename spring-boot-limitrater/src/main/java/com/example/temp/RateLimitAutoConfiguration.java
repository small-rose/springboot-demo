package com.example.temp;

import com.example.temp.aop.SpringFallBackAspect;
import com.example.temp.aop.SpringRateLimitAspect;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
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
        log.info("Initializing Spring RateLimitAspect");
        return new SpringRateLimitAspect();
    }

    /**
     * FallBack  aspect spring boot fall back  aspect.
     *
     * @return the spring boot fall back aspect
     */
    @Bean
    public SpringFallBackAspect springFallBackAspect() {
        log.info("Initializing Spring FallBackAspect");
        return new SpringFallBackAspect();
    }
}
