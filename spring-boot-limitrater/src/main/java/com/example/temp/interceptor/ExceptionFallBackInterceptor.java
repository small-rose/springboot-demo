package com.example.temp.interceptor;

import com.example.temp.fallback.ExceptionFallBackHandler;
import com.example.temp.service.FallBackHandlerPredicate;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 注解  @ExceptionFallBack  异常降级执行调用--对应的处理器
 * @author: 张小菜
 * @date: 2021/5/23 15:25
 * @version: v1.0
 */
@Slf4j
public class ExceptionFallBackInterceptor extends RateLimitInterceptor{

    private boolean isFallBack;

    public ExceptionFallBackInterceptor(boolean isFallBack) {
        this.isFallBack = isFallBack;
    }


    @Override
    public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
        log.trace("----降级处理拦截器----");
        final MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        final Method method = signature.getMethod();
        if (isFallBack){
            // 拿到之前构造的或者缓存的 降级规则处理器
            ExceptionFallBackHandler fallBackHandler = FallBackHandlerPredicate.ruleHandlerMap.get(method.toString());
            this.setRateLimitInterceptor(fallBackHandler);
            return rateLimitInterceptor.invoke(joinPoint);
        }
        return proceed(joinPoint);
    }


}
