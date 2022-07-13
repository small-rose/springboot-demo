package com.xiaocai.demo.event.reactor;

import com.xiaocai.demo.event.reactor.bean.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.Reactor;
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
public class AppListener<User> implements Consumer<Event<User>> {


    @Autowired
    private Reactor reactor;


    public void accept(Event<User> event) {
        System.out.println("Received user object with " +event.getData());

        Email email = Email.builder().fromUser("dev@qq.com").toUser("small@qq.com").host("127.0.0.1").build();
        // 通过reactor.notify发送事件
        reactor.notify("emailHandler", Event.wrap(email));

    }
}
