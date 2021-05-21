package com.example.temp.aop;

import com.example.temp.annotation.RateLimitSWL;
import com.example.temp.interceptor.RateLimitGlobalInterceptor;
import com.example.temp.interceptor.RateLimitInterceptor;
import com.example.temp.service.RateLimitHandlerAspectInvoker;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBase;
import com.fasterxml.jackson.databind.type.TypeFactory;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @program: springboot-limitRater
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-18 17:36
 **/
@Aspect
public abstract class AbstractRateLimiterAop {

    private final RateLimitInterceptor interceptor = new RateLimitGlobalInterceptor();

    /**
     * Order 代表优先级，数字越小优先级越高
     */

    @Pointcut(value = "@annotation(com.example.temp.annotation.RateLimitSWL) || @annotation(com.example.temp.annotation.RateLimitFCL)")
    public void limitInterceptor(){};

    /**
     *   拦截处理限流注解
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around(value = "limitInterceptor()")
    public Object rateLimitMethod(final ProceedingJoinPoint joinPoint) throws Throwable {
        return interceptor.invoke(joinPoint);
        /* Object commonResult = null;
        // 获取方法名称
        Method method = ((MethodSignature)joinPoint.getSignature()).getMethod();;
        // 注解拦截处理
        boolean isOver = RateLimitHandlerAspectInvoker.getInstance().invoke(joinPoint);
        log.info("is over : " + isOver);
        if (isOver){
            return "API Limit ";
        }*/
        // 继续执行请求方法
        // return  joinPoint.proceed() ;
    }


}
