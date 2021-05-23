package com.example.temp.interceptor;

import com.example.temp.service.FallBackHandlerAspectInvoker;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 注解  @ExceptionFallBack  异常降级验证
 * @author: 张小菜
 * @date: 2021/5/23 19:13
 * @version: v1.0
 */
@Slf4j
public class ExceptionFallBackCheckInterceptor extends  RateLimitInterceptor{

    @Override
    public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
        log.trace("----降级验证拦截器----");
        // 这里验证是否需要执行降级
        boolean isFallBack = FallBackHandlerAspectInvoker.getInstance().invoke(joinPoint);
        // 向下传递 到降级处理器
        this.setRateLimitInterceptor(new ExceptionFallBackInterceptor(isFallBack));
        return rateLimitInterceptor.invoke(joinPoint);
    }
}
