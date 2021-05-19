package com.example.temp.service;

import com.example.temp.annotation.RateLimiter;
import com.example.temp.limit.IRateLimiter;
import com.example.temp.limit.SlidingWindowRateLimiter;
import lombok.extern.slf4j.Slf4j;

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
public class RateLimitHandler {

    private static final HashMap<String, IRateLimiter> CACHE_LIMIT = new HashMap<>();

    private static final RateLimitHandler INSTANCE = new RateLimitHandler();


    public static RateLimitHandler getInstance() {
        return INSTANCE;
    }

    public boolean handler(Method method){
        String methodName = method.getName();
        RateLimiter raLtAt = method.getAnnotation(RateLimiter.class);
        SlidingWindowRateLimiter sliWinRateLimiter = (SlidingWindowRateLimiter) CACHE_LIMIT.get(methodName);
        if(null == sliWinRateLimiter){
            log.info("SlidingWindowRateLimiter is going ... ");
            IRateLimiter swrLimiter = new SlidingWindowRateLimiter(raLtAt.blocks(), raLtAt.maxLimited(), raLtAt.enableBlockAvg());
            CACHE_LIMIT.put(method.getName(), swrLimiter);
        }
        SlidingWindowRateLimiter rateLimiter = (SlidingWindowRateLimiter)CACHE_LIMIT.get(methodName);
        boolean isover = rateLimiter.isOverLimit();
        log.info("rateLimiter isOverLimit return " + isover);
        return isover;
    }
}