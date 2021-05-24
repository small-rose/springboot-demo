package com.example.temp.handler;

import com.example.temp.annotation.RateLimitTBL;
import com.example.temp.limit.IRateLimiter;
import com.example.temp.limit.TokenBucketRateLimiter;
import com.example.temp.limit.TokenCooperating;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/22 0:25
 * @version: v1.0
 */
@Slf4j
public class TokenBucketRateLimitHandler extends AbstractRateLimitHandler implements LimitHandler{

    @Override
    public boolean handler(Method method) {
        return defaultHandler(method);
    }

    @Override
    IRateLimiter registry(Method method) {
        String methodName = method.toString();
        RateLimitTBL rateLimit = method.getAnnotation(RateLimitTBL.class);
        IRateLimiter rateLimiter = CACHE_LIMIT.get(methodName);
        if (Objects.isNull(rateLimiter)) {
            synchronized (this) {
                log.info("TokenBucketRateLimitHandler will registry newInstance ... ");
                IRateLimiter swrLimiter = new TokenBucketRateLimiter(rateLimit.maxLimit(),
                        rateLimit.createNumUnit(), rateLimit.timeout(), rateLimit.timeUnit(),
                        rateLimit.createDelay(), rateLimit.createPeriod(), rateLimit.createTimeUnit());
                CACHE_LIMIT.put(methodName, swrLimiter);
                // 创建一个补充令牌管理的
                TokenBucketRateLimiter.RATE_LIMITER_MAP.put(methodName, (TokenCooperating) swrLimiter);
            }
        }
        return CACHE_LIMIT.get(methodName);
    }
}
