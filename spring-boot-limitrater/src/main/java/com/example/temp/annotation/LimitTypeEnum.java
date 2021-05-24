package com.example.temp.annotation;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @program: springboot-limiter
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-18 17:54
 **/
@Getter
@AllArgsConstructor
public enum LimitTypeEnum {
    /**
     * 滑动窗口限流
     */
    RateLimitSWL("slided window limit"),
    /**
     * 固定时间窗口
     */
    RateLimitFCL("fixed count and period limit"),
    /**
     * 漏斗桶算法
     */
    RateLimitLBL("leaky bucket"),
    /**
     * 令牌桶算法
     */
    RateLimitTBL( "token bucket");

    private final String desc;

}
