package com.xiaocai.demo.event.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ EventListenerConfig ] 说明：无
 * @Function :  功能说明： 事件监听的实现方式
 *                     （1） 监听配置类，即使用 @EventListener 实现事件监听。
 *                          使用@EventListener的condition可以实现更加精细的事件监听，condition支持SpEL表达式，
 *                          可根据事件源的参数来判断是否监听。
 *                     （2）实现 ApplicationListener 接口的方式
 * @Date ：2022/7/13 8:15
 * @Version ： 1.0
 **/

@Configuration
@Slf4j
public class EventListenerConfig {

    /**
     * 注入 事件发布类
     */
    @Autowired
    ApplicationEventPublisher eventPublisher;

    @EventListener
    public void handleEvent(Object event) {
        //监听所有事件 可以看看 系统各类时间 发布了哪些事件
        //可根据 instanceof 监听想要监听的事件
//        if(event instanceof CustomEvent) {
//
//        }
        log.info("事件：{}", event);
    }

    @EventListener
    public void handleCustomEvent(CustomEvent customEvent) {
        //监听 CustomEvent事件
        log.info("监听到CustomEvent事件，消息为：{}, 发布时间：{}", customEvent.getMessageEntity(), customEvent.getTimestamp());
    }

    /**
     * 监听 code为oKong的事件
     */
    @EventListener(condition="#customEvent.messageEntity.code == '001'")
    public void handleCustomEventByCondition(CustomEvent customEvent) {
        //监听 CustomEvent事件
        log.info("监听到code为'001'的CustomEvent事件，消息为：{}, 发布时间：{}", customEvent.getMessageEntity(), customEvent.getTimestamp());
    }

    /**
     * 监听 code为 测试 的事件
     * 如果事件需要涉及事务可以使用  @TransactionalEventListener  或者 TransactionSynchronizationManager 或 分解业务来实现
     */
    @EventListener(condition="#customEvent.messageEntity.code == '002'")
    @TransactionalEventListener
    public void handleCustomEvent002(CustomEvent customEvent) {
        //监听 CustomEvent事件
        log.info("监听到code为'002'的CustomEvent事件，消息为：{}, 发布时间：{}", customEvent.getMessageEntity(), customEvent.getTimestamp());
        eventPublisher.publishEvent(new CustomEvent(this, MessageEntity.builder().code("003").message("003事件触发").build()));
    }

    /**
     * 监听 code为 测试 的事件
     */
    // @Async // 也支持异步执行
    @EventListener(condition="#customEvent.messageEntity.code == '003'")
    public void handleCustomEvent003(CustomEvent customEvent) {
        //监听 CustomEvent事件
        log.info("监听到code为'003'的CustomEvent事件，消息为：{}, 发布时间：{}", customEvent.getMessageEntity(), customEvent.getTimestamp());
    }


    @EventListener
    public void handleObjectEvent(MessageEntity messageEntity) {
        //这个和eventbus post方法一样了
        log.info("监听到对象事件，消息为：{}", messageEntity);

    }
}
