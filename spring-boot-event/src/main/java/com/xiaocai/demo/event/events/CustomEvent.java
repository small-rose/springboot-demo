package com.xiaocai.demo.event.events;

import org.springframework.context.ApplicationEvent;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ CustomEvent ] 说明：无
 * @Function :  功能说明： 编写事件源
 *              注意：Spring中，事件源不强迫继承ApplicationEvent接口的，也就是可以直接发布任意一个对象类。
 *              但内部其实是使用PayloadApplicationEvent类进行包装了一层。这点和guava的eventBus类似。
 * @Date ：2022/7/13 8:15
 * @Version ： 1.0
 **/
public class CustomEvent extends ApplicationEvent {

    private MessageEntity messageEntity;

    public CustomEvent(Object source, MessageEntity messageEntity) {
        super(source);
        this.messageEntity = messageEntity;
    }

    public MessageEntity getMessageEntity() {
        return this.messageEntity;
    }
}
