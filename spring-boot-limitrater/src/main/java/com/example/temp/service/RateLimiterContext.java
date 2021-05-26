package com.example.temp.service;

import com.example.temp.annotation.LimitTypeEnum;
import com.example.temp.handler.FixPeriodCounterLimitHandler;
import com.example.temp.handler.LimitHandler;
import com.example.temp.handler.SlidedWindowRateLimitHandler;
import com.example.temp.handler.TokenBucketRateLimitHandler;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/20 20:21
 * @version: v1.0
 */
@Component
public class RateLimiterContext  implements ApplicationContextAware {


    public static final Map<String, Class<? extends LimitHandler>> handlerMap = new HashMap<>();

    static {
        handlerMap.put(LimitTypeEnum.RateLimitSWL.name(), SlidedWindowRateLimitHandler.class);
        handlerMap.put(LimitTypeEnum.RateLimitFCL.name(), FixPeriodCounterLimitHandler.class);
        handlerMap.put(LimitTypeEnum.RateLimitTBL.name(), TokenBucketRateLimitHandler.class);
    }


    public static  Map<Class<?>, Set<Method>> containsMap = new HashMap<>();

    private static ApplicationContext applicationContext;
    /**
     * 外部调用这个getBean方法就可以手动获取到bean
     * 用bean组件的name来获取bean
     * @param beanName
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T  getBean(String beanName){
        return (T) applicationContext.getBean(beanName);
    }

    @SuppressWarnings("unchecked")
    public static <T> T  getBean(Class<?> beanName){
        return (T) applicationContext.getBean(beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        RateLimiterContext.applicationContext = applicationContext;
    }

    /**
     * 从自己的 bean 管理器拿
     * @param name
     * @return
     */
    public static Object getBeanByName(String name) {
        return ServiceLocator.getService(name);
    }
}
