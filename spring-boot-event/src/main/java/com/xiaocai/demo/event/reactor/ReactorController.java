package com.xiaocai.demo.event.reactor;

import com.xiaocai.demo.event.reactor.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.Reactor;
import reactor.event.Event;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ ReactorController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/13 11:52
 * @Version ： 1.0
 **/

@RestController
@RequestMapping("/api")
public class ReactorController {

    @Autowired
    private Reactor reactor;

    @RequestMapping("/test")
    public void test() throws InterruptedException{
        User user = new User();
        user.setFirstName("Chetan");
        user.setLastName("Birajdar");
        user.setAddress("钦州北路");
        user.setCity("上海");

        // 通过reactor.notify发送事件
        reactor.notify("eventHandler", Event.wrap(user));
        System.out.println("yes, I sent something for you!!");
    }
}
