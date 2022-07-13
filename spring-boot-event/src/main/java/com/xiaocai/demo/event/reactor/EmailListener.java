package com.xiaocai.demo.event.reactor;

import org.springframework.stereotype.Component;
import reactor.event.Event;
import reactor.function.Consumer;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ AppListener ] 说明：无
 * @Function :  功能说明：
 *              事件的监听器，以便于接收发送的事件并处理。需要实现 Consumer<Event<T>> 接口，
 *              其中 T 是处理程序接收的数据类型，要根据具体业务设置
 * @Date ：2022/7/13 11:31
 * @Version ： 1.0
 **/
@Component
public class EmailListener<Email> implements Consumer<Event<Email>> {

    public void accept(Event<Email> event) {
        Email email = event.getData();
        System.out.println("Received email object with " +email);
    }
}
