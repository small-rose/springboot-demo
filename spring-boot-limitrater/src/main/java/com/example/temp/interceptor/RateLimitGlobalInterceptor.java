package com.example.temp.interceptor;

import com.example.temp.service.RateLimitHandlerAspectInvoker;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @program: springboot-demo
 * @description
 * @function:   限流拦截器，验证是否需要限流，然后传递到限流降级拦截器
 * @author: zzy
 * @create: 2021-05-21 13:47
 **/
@Slf4j
public class RateLimitGlobalInterceptor extends RateLimitInterceptor {

    @Override
    public Object invoke(final ProceedingJoinPoint joinPoint) throws Throwable {
        boolean result = RateLimitHandlerAspectInvoker.getInstance().invoke(joinPoint);
        log.info("RateLimitGlobalInterceptor invoke result : "+ true);
        // 责任链传递，看是否需要执行 RateLimitXXX的 failBack()降级方法
        this.setRateLimitInterceptor(new RateLimitFallBackMethodInterceptor(result));
        return rateLimitInterceptor.invoke(joinPoint);
    }

}
