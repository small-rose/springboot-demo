package com.example.temp.limit;

/**
 * @program:
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-18 16:55
 **/
public interface RateLimiter {

    boolean isOverLimit();

    Long currentQPS();

    boolean visit();
}