package com.example.temp.handler;

import com.example.temp.service.RateLimiterContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Method;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/20 21:33
 * @version: v1.0
 */
public class CountLimitHandler implements LimitHandler {

    private static final CountLimitHandler INSTANCE = new CountLimitHandler();

    @Autowired
    private RateLimiterContext rateLimiterContext;

    public static CountLimitHandler getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean handler(Method method) {

        return false;
    }
}
