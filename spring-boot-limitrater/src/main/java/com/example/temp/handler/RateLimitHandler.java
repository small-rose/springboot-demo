package com.example.temp.handler;

import com.example.temp.annotation.RateLimiter;
import com.example.temp.limit.IRateLimiter;
import com.example.temp.limit.SlidingWindowRateLimiter;
import com.example.temp.service.RateLimiterContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/18 23:45
 * @version: v1.0
 */
@Slf4j
@Component
public class RateLimitHandler implements LimitHandler {

    private static final HashMap<String, IRateLimiter> CACHE_LIMIT = new HashMap<>();

    public RateLimitHandler(){
    }

    public RateLimitHandler(RateLimiterContext rateLimiterContext) {
        this.rateLimiterContext = rateLimiterContext;
    }
    private  RateLimiterContext rateLimiterContext;

    @Override
    public boolean handler(Method method){
        String methodName = method.getName();
        RateLimiter raLtAt = method.getAnnotation(RateLimiter.class);

        IRateLimiter rateLimiter = CACHE_LIMIT.get(methodName);
        if(null == rateLimiter){
            log.info("SlidingWindowRateLimiter is going ... ");
            IRateLimiter swrLimiter = new SlidingWindowRateLimiter(raLtAt.blocks(), raLtAt.maxLimited(), raLtAt.enableBlockAvg());
            CACHE_LIMIT.put(method.getName(), swrLimiter);
            rateLimiter = CACHE_LIMIT.get(methodName);
        }

        boolean overLimit = rateLimiter.isOverLimit();
        log.info("rateLimiter overLimit return = " + overLimit);
        return overLimit;
    }
}
