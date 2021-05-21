package com.example.temp.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-21 13:33
 **/
public interface RateLimitInterceptor {

    /**
     * 限流验证处理
     * @param joinPoint
     * @return
     */
    Object invoke(ProceedingJoinPoint joinPoint) throws Throwable;
}
