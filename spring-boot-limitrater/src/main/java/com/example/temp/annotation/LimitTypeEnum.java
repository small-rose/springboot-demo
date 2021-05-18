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

    SlidedWindowLimit("fix rate limit"),
    /**
     * 固定时间窗口
     */
    FixWindowLimit("fix rate limit");

    private final String desc;
}
