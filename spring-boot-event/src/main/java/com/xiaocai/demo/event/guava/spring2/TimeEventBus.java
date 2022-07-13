package com.xiaocai.demo.event.guava.spring2;

import com.google.common.eventbus.EventBus;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ TimeEventBus ] 说明：无
 * @Function :  功能说明： 定义EventBus工具类
 *
 *       guava中的com.google.common.eventbus.EventBus提供了很多API，
 *       在spring中使用时最好能够定义了bean，方便同一个消息总线对象被多处功能公用，同时也便于代码维护。
 *       （1）TimeEventBus类封装了guava原始EventBus的api，并通过static方法对外提供常用的消费发送、消息订阅、取消订阅等方法。
 *
 * @Date ：2022/7/13 10:27
 * @Version ： 1.0
 **/
public class TimeEventBus {

    private final static EventBus tiemEventBus = new EventBus();


    public static void post(Object event) {
        tiemEventBus.post(event);
    }


    public static void register(Object handler) {
        tiemEventBus.register(handler);
    }


    public static void unregister(Object handler) {
        tiemEventBus.unregister(handler);
    }
}
