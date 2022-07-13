package com.xiaocai.demo.event.guava.spring;

import com.xiaocai.demo.event.guava.spring.event.BuzEvent;
import com.xiaocai.demo.event.guava.spring.event.MessageEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ EvenBuzDemoController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/13 9:34
 * @Version ： 1.0
 **/


@RestController
@RequestMapping("/ebus")
@Slf4j
public class EvenBuzDemoController {

    @Autowired
    EventBusService eventBusService ;
    /**
     * http://127.0.0.1:8080/ebus/msg?code=002&message=test
     * @param code
     * @param message
     * @return
     */
    @GetMapping("/msg")
    public String messageEvent(String code,String message) {
        log.info("发布Event buz 事件:{},{}", code, message);
        eventBusService.postEvent(MessageEvent.builder().code("A").message("TEST").build());
        return "事件发布成功!";
    }

    /**
     * http://127.0.0.1:8080/ebus/buz?code=002&message=test
     * @param code
     * @param message
     * @return
     */
    @GetMapping("/buz")
    public String buzEvent(String code,String message) {
        log.info("发布Event buz 事件:{},{}", code, message);
        eventBusService.postEvent(BuzEvent.builder().code("B").message("TEST b").build());
        return "事件发布成功!";
    }
}
