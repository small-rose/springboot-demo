package com.example.temp.service;

import com.example.temp.annotation.LimitTypeEnum;
import com.example.temp.annotation.RateLimiter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

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

    public Object invoke(final ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        final RateLimiter rateLimiter = method.getAnnotation(RateLimiter.class);
        return  null;
    }


}
