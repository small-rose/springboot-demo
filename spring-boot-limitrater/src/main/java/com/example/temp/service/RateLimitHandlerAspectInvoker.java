package com.example.temp.service;

import com.example.temp.annotation.RateLimiter;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * @program: springboot-redis
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-18 17:52
 **/
public class RateLimitHandlerAspectInvoker {

    private static final RateLimitHandlerAspectInvoker INSTANCE = new RateLimitHandlerAspectInvoker();


    private RateLimitHandlerAspectInvoker() {
    }


    public static RateLimitHandlerAspectInvoker getInstance() {
        return INSTANCE;
    }

    public boolean invoke(final ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        final RateLimiter rateLimiter = method.getAnnotation(RateLimiter.class);
        if(rateLimiter != null){
            return RateLimitHandler.getInstance().handler(method);
        }
        return  false;
    }


}
