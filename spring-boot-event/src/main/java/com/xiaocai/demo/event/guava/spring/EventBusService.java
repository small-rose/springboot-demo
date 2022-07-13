package com.xiaocai.demo.event.guava.spring;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import com.xiaocai.demo.event.guava.spring.annotation.EventSubscriber;
import com.xiaocai.demo.event.guava.spring.event.MyEvent;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executors;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ EventBusService ] 说明：无
 * @Function :  功能说明：
 *              声明一个event bus的服务，并且在初始化之后，
 *              通过ApplicationContext的 getBeansWithAnnotation 的方法把所有的订阅者获取，
 *              并且注册到event bus中。
 * @Date ：2022/7/13 9:03
 * @Version ： 1.0
 **/

@Service
public class EventBusService implements InitializingBean {

    private EventBus innerBus;

    @Autowired
    private ApplicationContext appContext;

    public void unRegister(Object eventListener){
        innerBus.unregister(eventListener);
    }

    public void postEvent(MyEvent event){
        //String event
        innerBus.post(event);
    }

    public void register(Object eventListener){
        innerBus.register(eventListener);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        innerBus = new AsyncEventBus("Hidas-event-bus", Executors.newCachedThreadPool());
        appContext.getBeansWithAnnotation(EventSubscriber.class).forEach((name, bean) -> {
            innerBus.register(bean);
        });
    }
}
