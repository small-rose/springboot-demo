package com.example.temp.handler;

import com.example.temp.limit.IRateLimiter;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-21 15:08
 **/
@Slf4j
public abstract class AbstractRateLimitHandler {

    /**
     * 将方法 与 对应的限流算法绑定并缓存
     */
    final static Map<String, IRateLimiter> CACHE_LIMIT = new ConcurrentHashMap<>();

    /**
     *  对应的算法实例及验证 QPS
     * @param method
     * @return
     */
    protected boolean defaultHandler(Method method){
        IRateLimiter rateLimiter = registry(method);
        boolean overLimit = rateLimiter.isOverLimit();
        log.info("rateLimiter overLimit return = " + overLimit);
        return overLimit;
    }

    /**
     * 抽象 限流算法
     * @param method
     * @return
     */
    protected abstract IRateLimiter registry(Method method);

}
