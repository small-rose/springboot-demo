package com.example.temp.aop;

import org.springframework.core.Ordered;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-21 13:56
 **/
public class SpringRateLimitAspect extends AbstractRateLimiterAop implements Ordered {

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}
