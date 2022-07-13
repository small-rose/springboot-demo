package com.xiaocai.demo.event.guava.original;

import com.google.common.eventbus.EventBus;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ SimpleEventBusExample ] 说明：无
 * @Function :  功能说明：
 *              1. 声明一个event bus对象（线程安全，所以可以做到全局唯一，而且订阅者和发布者必须共享这个event bus对象）
 *              2. 对于订阅者，支持 @Subscribe，定义处理消息的回调函数。
 *              3. 对每一个订阅者，需要调用event bus的register方法，才能收到消息订阅
 *
 * @Date ：2022/7/13 9:01
 * @Version ： 1.0
 **/
public class SimpleEventBusExample {



    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new SimpleListener());
        System.out.println("Post Simple EventBus Example");
        eventBus.post("Simple EventBus Example");
    }
}
