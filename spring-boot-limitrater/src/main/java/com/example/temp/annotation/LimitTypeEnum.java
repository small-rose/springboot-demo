package com.example.temp.annotation;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @program: springboot-redis
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
     * 令牌桶算法
     */
    RateLimitTBL( "token bucket");

    private final String desc;


    public static LimitTypeEnum getName(String name){
        for(LimitTypeEnum  temp : LimitTypeEnum.values()){
            if (temp.desc.equals(name)){
                return  temp;
            }
        }
        return null;
    }
}
