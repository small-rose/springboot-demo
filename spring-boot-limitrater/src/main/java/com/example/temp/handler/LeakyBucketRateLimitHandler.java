package com.example.temp.handler;

import com.example.temp.annotation.RateLimitLBL;
import com.example.temp.annotation.RateLimitTBL;
import com.example.temp.limit.IRateLimiter;
import com.example.temp.limit.LeakyBucketRateLimiter;
import com.example.temp.limit.TokenBucketRateLimiter;
import com.example.temp.limit.TokenCooperating;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @program: springboot-limiter
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-24 13:45
 **/
@Slf4j
public class LeakyBucketRateLimitHandler  extends AbstractRateLimitHandler implements  LimitHandler{

    @Override
    public boolean handler(Method method) {
        return defaultHandler(method);
    }

    @Override
    protected IRateLimiter registry(Method method) {
        String methodName = method.toString();
        RateLimitLBL rateLimit = method.getAnnotation(RateLimitLBL.class);
        IRateLimiter rateLimiter = CACHE_LIMIT.get(methodName);
        if (Objects.isNull(rateLimiter)) {
            synchronized (this) {
                log.info("TokenBucketRateLimitHandler will registry newInstance ... ");
                IRateLimiter swrLimiter = new LeakyBucketRateLimiter(rateLimit.maxLimit(), rateLimit.timeout(),rateLimit.timeUnit(),
                        rateLimit.leakNum(),  rateLimit.initialDelay(), rateLimit.period(), rateLimit.leakTimeUnit());
                CACHE_LIMIT.put(methodName, swrLimiter);
                // 创建一个移出令牌执行对象的
                LeakyBucketRateLimiter.RATE_LIMITER_MAP.put(methodName, (TokenCooperating) swrLimiter);
            }
        }
        return CACHE_LIMIT.get(methodName);
    }
}
