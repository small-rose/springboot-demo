package com.xiaocai.demo.event.guava.spring;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import com.xiaocai.demo.event.guava.spring.annotation.EventSubscriber;
import com.xiaocai.demo.event.guava.spring.event.MessageEvent;
import com.xiaocai.demo.event.guava.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ SimpleSubscriber ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/13 9:21
 * @Version ： 1.0
 **/
@EventSubscriber
public class SimpleSendMailSubscriber implements BuzSendMailSubscriber  {

    @Autowired
    UserService userService;

    @Subscribe
    @AllowConcurrentEvents
    public boolean sendMail(MessageEvent event) {
        System.out.println("receive a send Mail event:"+event);
        return  true ;
    }
}
