package com.example.temp.handler;

import com.example.temp.annotation.RateLimitFCL;
import com.example.temp.limit.FixPeriodCountRateLimiter;
import com.example.temp.limit.IRateLimiter;
import com.example.temp.service.RateLimiterContext;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 固定周期固定限流处理器
 * @author: 张小菜
 * @date: 2021/5/20 21:33
 * @version: v1.0
 */
@Slf4j
public class FixPeriodCounterLimitHandler extends AbstractRateLimitHandler implements LimitHandler {


    private RateLimiterContext rateLimiterContext;

    @Override
    public boolean handler(Method method) {
        return defaultHandler(method);
        /*
        IRateLimiter rateLimiter = registry(method);
        boolean overLimit = rateLimiter.isOverLimit();
        log.info("CountLimitHandler overLimit return = " + overLimit);
        return overLimit;
        */
    }

    @Override
    public IRateLimiter registry(Method method) {
        String methodName = method.toString();
        RateLimitFCL rateLimit = method.getAnnotation(RateLimitFCL.class);
        IRateLimiter rateLimiter = CACHE_LIMIT.get(methodName);
        if (Objects.isNull(rateLimiter)){
            synchronized(this) {
                log.info("FixPeriodRateLimiter will registry newInstance ... ");
                IRateLimiter fclLimiter = new FixPeriodCountRateLimiter(rateLimit.maxLimited(), rateLimit.period(), rateLimit.timeUnit()) ;
                CACHE_LIMIT.put(methodName, fclLimiter);
            }
        }
        log.info("cache map : " + CACHE_LIMIT.toString());
        return CACHE_LIMIT.get(methodName);
    }
}
