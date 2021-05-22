package com.example.temp.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-21 13:33
 **/
public abstract class RateLimitInterceptor {

    private boolean isOverLimit = false;

    //责任链中的下一个元素
    protected RateLimitInterceptor rateLimitInterceptor;

    public void setRateLimitInterceptor(RateLimitInterceptor rateLimitInterceptor){
        this.rateLimitInterceptor = rateLimitInterceptor;
    }

    /**
     * 告诉拦截器是 否执行 fallback 方法
     * @param isOverLimit
     */
     public void setOverLimit(boolean isOverLimit){
         this.isOverLimit = isOverLimit;
     }
    public boolean getOverLimit(){
        return this.isOverLimit ;
    }


    /**
     * 限流验证处理
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
