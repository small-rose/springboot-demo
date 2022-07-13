package com.xiaocai.demo.event.guava.spring;

import com.xiaocai.demo.event.guava.spring.event.MessageEvent;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ BuzSubscriber ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/13 9:26
 * @Version ： 1.0
 **/
public interface BuzSendMailSubscriber {


    public boolean sendMail(MessageEvent event);
}
