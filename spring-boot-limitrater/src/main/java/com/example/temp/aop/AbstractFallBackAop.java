package com.example.temp.aop;

import com.example.temp.interceptor.ExceptionFallBackCheckInterceptor;
import com.example.temp.interceptor.RateLimitInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：  服务降级切面处理
 * @author: 张小菜
 * @date: 2021/5/23 15:21
 * @version: v1.0
 */
@Slf4j
@Aspect
public class AbstractFallBackAop {

    /**
     *  降级验证
     */
    private final RateLimitInterceptor interceptor = new ExceptionFallBackCheckInterceptor();

    /**
     * 定义降级切面
     */
    @Pointcut(value = "@annotation(com.example.temp.annotation.ExceptionFallBack)")
    public void exceptionInterceptor(){};


    /**
     * 拦截处理 异常降级
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around(value="exceptionInterceptor()")
    public Object rateLimitMethod(final ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("----降级切面----");
        return interceptor.invoke(joinPoint);
    }
}
