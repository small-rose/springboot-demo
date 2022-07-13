package com.xiaocai.demo.event.events;

import com.xiaocai.demo.event.EventApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ SpringEventsDemoTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/13 13:42
 * @Version ： 1.0
 **/
@Slf4j
public class SpringEventsDemoTest extends EventApplicationTests {
    /**
     * 注入 事件发布类
     */
    @Autowired
    ApplicationEventPublisher eventPublisher;


    @Test
    public void push() {
        String code = "001";
        String message = "001测试";
        log.info("发布applicationEvent事件:{},{}", "001","message");
        eventPublisher.publishEvent(new CustomEvent(this, MessageEntity.builder().code(code).message(message).build()));
        //return "事件发布成功!";
    }

    @Test
    public void pushObject() {
        String code = "002";
        String message = "002测试";
        log.info("发布对象事件:{},{}", code, message);
        eventPublisher.publishEvent(MessageEntity.builder().code(code).message(message).build());
        //return "对象事件发布成功!";
    }
}
