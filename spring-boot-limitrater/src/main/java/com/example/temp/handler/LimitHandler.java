package com.example.temp.handler;

import com.example.temp.limit.IRateLimiter;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangzongyuan
 */
public interface LimitHandler {



    /**
     *  对应的算法实例及验证 QPS
     * @param method
     * @return
     */
    boolean handler(Method method);


}
