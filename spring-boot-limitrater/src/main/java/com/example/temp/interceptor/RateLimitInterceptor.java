package com.example.temp.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @program: springboot-limiter
 * @description
 * @function:  限流处理抽象类
 * @author: zzy
 * @create: 2021-05-21 13:33
 **/
public abstract class RateLimitInterceptor {

    //责任链中的下一个元素
    protected RateLimitInterceptor rateLimitInterceptor;

    public void setRateLimitInterceptor(RateLimitInterceptor rateLimitInterceptor){
        this.rateLimitInterceptor = rateLimitInterceptor;
    }



    /**
     * 限流验证, 异常降级处理
     * @param joinPoint
     * @return
     */
    public abstract Object invoke(ProceedingJoinPoint joinPoint) throws Throwable;

    /**
     *  放行原有方法
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    public Object proceed(ProceedingJoinPoint joinPoint) throws Throwable{
        return joinPoint.proceed();
    }
}
