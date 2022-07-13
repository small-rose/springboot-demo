package com.xiaocai.demo.event.guava.spring;

import com.xiaocai.demo.event.EventApplicationTests;
import com.xiaocai.demo.event.guava.spring.event.BuzEvent;
import com.xiaocai.demo.event.guava.spring.event.MessageEvent;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ EventBuzDemoTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/13 13:19
 * @Version ： 1.0
 **/


@Slf4j
public class EventBuzDemoTest  extends EventApplicationTests {


    @Autowired
    EventBusService eventBusService ;

    @Test
    public void messageEvent() {
        log.info("发布Event buz 事件:{},{}");
        eventBusService.postEvent(MessageEvent.builder().code("A").message("TEST").build());
        //return "事件发布成功!";
    }


    @Test
    public void buzEvent() {
        log.info("发布Event buz 事件:{},{}");
        eventBusService.postEvent(BuzEvent.builder().code("B").message("TEST b").build());
        //return "事件发布成功!";
    }
}
