package com.example.temp.handler;

import java.lang.reflect.Method;

/**
 * TODO 限流处理抽象接口
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
