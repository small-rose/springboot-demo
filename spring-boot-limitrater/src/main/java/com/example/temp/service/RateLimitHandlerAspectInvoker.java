package com.example.temp.service;

import com.example.temp.annotation.LimitTypeEnum;
import com.example.temp.handler.FixPeriodCounterLimitHandler;
import com.example.temp.handler.LimitHandler;
import com.example.temp.handler.SlidedWindowRateLimitHandler;
import com.example.temp.handler.TokenBucketRateLimitHandler;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

    public static final Map<String, Class<? extends LimitHandler>> handlerMap = new HashMap<>();

    static {
        handlerMap.put(LimitTypeEnum.RateLimitSWL.name(), SlidedWindowRateLimitHandler.class);
        handlerMap.put(LimitTypeEnum.RateLimitFCL.name(), FixPeriodCounterLimitHandler.class);
        handlerMap.put(LimitTypeEnum.RateLimitTBL.name(), TokenBucketRateLimitHandler.class);
    }

    private RateLimitHandlerAspectInvoker() {
    }




    public static RateLimitHandlerAspectInvoker getInstance() {
        return INSTANCE;
    }

    /**
     *  解析 限流注解，根据注解 实例化完成对应的 handler
     * @param point
     * @return
     * @throws Throwable
     */
    public boolean invoke(final ProceedingJoinPoint point) throws Throwable {
        final MethodSignature signature = (MethodSignature) point.getSignature();
        final Method method = signature.getMethod();
        return doHandler(method);
        /*
        final RateLimitFCL countLimiter = method.getAnnotation(RateLimitFCL.class);
        final RateLimitSWL rateLimiter = method.getAnnotation(RateLimitSWL.class);

        log.info("annotation : "+method.getReturnType());
        if (!Objects.isNull(countLimiter) && !Objects.isNull(rateLimiter)){
            throw new LimitConflictException("Limit Annotation must be only one ");
        }
        if(!Objects.isNull(countLimiter)){
            Class<?>  handler = handlerMap.get(countLimiter.annotationType().getSimpleName());
            FixPeriodCounterLimitHandler handlerInstance = (FixPeriodCounterLimitHandler) handler.newInstance();
            return handlerInstance.handler(method);
        }
        if(!Objects.isNull(rateLimiter)){
            log.info("--- rateLimiter RateLimitHandler is handler : "+  method);
            Class<?>  handler =  handlerMap.get(rateLimiter.annotationType().getSimpleName());
            System.out.println(method.toString());
            SlidedWindowRateLimitHandler handlerInstance = (SlidedWindowRateLimitHandler) handler.newInstance();
            return handlerInstance.handler(method);
        }
        return false;
        */
    }

    private boolean doHandler(Method method) throws IllegalAccessException, InstantiationException {
        Annotation[] annotations = method.getDeclaredAnnotations();
        for (Annotation annotation : annotations){
            Class<?> handler = handlerMap.get(annotation.annotationType().getSimpleName());
            log.info("--- rateLimiter LimitHandler is handler : "+  method);
            if (Objects.isNull(handler)){
                continue;
            }
            LimitHandler limitHandler = (LimitHandler) handler.newInstance();
            return limitHandler.handler(method);
        }
        return false;
    }

}
