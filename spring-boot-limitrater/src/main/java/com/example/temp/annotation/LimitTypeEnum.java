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

    RateLimiter("RateLimiter"),
    /**
     * 固定时间窗口
     */
    CountLimiter("CountLimiter");

    private final String name;


    public static LimitTypeEnum getName(String name){
        for(LimitTypeEnum  temp : LimitTypeEnum.values()){
            if (temp.name.equals(name)){
                return  temp;
            }
        }
        return null;
    }
}
