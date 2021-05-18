package com.example.temp.aop;

import com.example.temp.annotation.RateLimiter;
import com.example.temp.service.RateLimitHandlerAspectInvoker;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

/**
 * @program: springboot-redis
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-18 17:36
 **/
@Slf4j
@Aspect
public class RateLimiterAop {

    public RateLimiterAop(){}

    /**
     * Order 代表优先级，数字越小优先级越高
     */
    @Order(100)
    @Pointcut(value = "@annotation(com.example.temp.annotation.RateLimiter)")
    public void checkedPoint(){};

    @Before(value = "checkedPoint()")
    public void checkBefore(){
        // log.info("--checked before ");
    }

    @After(value = "checkedPoint()")
    public void checkAfter(){
        // log.info("--checked After ");

    }

    @Around(value = "checkedPoint() && @annotation(rateLimiter)")
    public Object checkAround(ProceedingJoinPoint joinPoint, RateLimiter rateLimiter) throws Throwable {
        Object commonResult = null;
        // 获取方法名称
        String methodName = joinPoint.getSignature().getName();
        // 注解拦截处理
        RateLimitHandlerAspectInvoker.getInstance().invoke(joinPoint);
        // 继续执行请求方法
        try {
            commonResult = joinPoint.proceed();
        }catch (Exception e) {
            return "api occurred exception ...";
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }



        return  commonResult == null ? "API Limit ": commonResult ;
    }

}
