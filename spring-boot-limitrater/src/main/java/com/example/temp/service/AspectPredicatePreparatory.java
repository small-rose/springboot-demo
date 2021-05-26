package com.example.temp.service;

import com.example.temp.annotation.LimitTypeEnum;
import com.example.temp.fallback.ExceptionFallBackHandler;
import com.example.temp.handler.*;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：  抽象执行器
 * @author: 张小菜
 * @date: 2021/5/23 18:53
 * @version: v1.0
 */

public abstract class AspectPredicatePreparatory {


    public static final Map<String, Class<? extends LimitHandler>> handlerMap = new HashMap<>();
    static {
        handlerMap.put(LimitTypeEnum.RateLimitSWL.name(), SlidedWindowRateLimitHandler.class);
        handlerMap.put(LimitTypeEnum.RateLimitFCL.name(), FixPeriodCounterLimitHandler.class);
        handlerMap.put(LimitTypeEnum.RateLimitTBL.name(), TokenBucketRateLimitHandler.class);
        handlerMap.put(LimitTypeEnum.RateLimitLBL.name(), LeakyBucketRateLimitHandler.class);
    }

    /**
     *  异常降级缓存器
     */
    public static final Map<String, ExceptionFallBackHandler> ruleHandlerMap = new HashMap<>();

    /**
     *  执行主体流程
     * @param point
     * @return
     * @throws Throwable
     */
    protected abstract boolean invoke(final ProceedingJoinPoint point) throws Throwable;


}
