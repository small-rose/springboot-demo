package com.example.temp.service;

import com.example.temp.annotation.CountLimiter;
import com.example.temp.annotation.LimitTypeEnum;
import com.example.temp.annotation.RateLimiter;
import com.example.temp.excepion.LimitConflictException;
import com.example.temp.handler.CountLimitHandler;
import com.example.temp.handler.LimitHandler;
import com.example.temp.handler.RateLimitHandler;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: springboot-redis
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-18 17:52
 **/
@Slf4j
public class RateLimitHandlerAspectInvoker {

    private static final RateLimitHandlerAspectInvoker INSTANCE = new RateLimitHandlerAspectInvoker();

    private static final Map<String, LimitHandler> handlerMap = new HashMap<>();

    static {
        handlerMap.put(LimitTypeEnum.RateLimiter.name(), new RateLimitHandler());
        handlerMap.put(LimitTypeEnum.CountLimiter.name(), CountLimitHandler.getInstance());
    }

    private RateLimitHandlerAspectInvoker() {
    }


    public static RateLimitHandlerAspectInvoker getInstance() {
        return INSTANCE;
    }

    public boolean invoke(final ProceedingJoinPoint point) throws Throwable {
        final MethodSignature signature = (MethodSignature) point.getSignature();
        final Method method = signature.getMethod();
        final CountLimiter countLimiter = method.getAnnotation(CountLimiter.class);
        final RateLimiter rateLimiter = method.getAnnotation(RateLimiter.class);

        if (countLimiter != null && rateLimiter != null ){
            throw new LimitConflictException("Limit Strategy must be only one Annotation");
        }
        if(countLimiter != null){
            return handlerMap.get(countLimiter.annotationType().getSimpleName()).handler(method);
        }

        if(rateLimiter != null){
            log.info("--- rateLimiter RateLimitHandler is handler : "+  method);
            LimitHandler handler = handlerMap.get(rateLimiter.annotationType().getSimpleName());
            System.out.println(handler);
            return handlerMap.get(rateLimiter.annotationType().getSimpleName()).handler(method);
        }
        return  false;
    }


}
