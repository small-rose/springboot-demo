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
 * @function:  验证是否需要执行 限流
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
     *  解析限流注解，判断是否需要限流，如果需要就根据注解 实例化完成对应的 handler
     * @param point
     * @return
     * @throws Throwable
     */
    public boolean invoke(final ProceedingJoinPoint point) throws Throwable {
        final MethodSignature signature = (MethodSignature) point.getSignature();
        final Method method = signature.getMethod();
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
