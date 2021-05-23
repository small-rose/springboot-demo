package com.example.temp.limit;

/**
 * @program:
 * @description
 * @function:  限流算法接口
 * @author: zzy
 * @create: 2021-05-18 16:55
 **/
public interface IRateLimiter {

    boolean isOverLimit();

    Long currentQps();
}
