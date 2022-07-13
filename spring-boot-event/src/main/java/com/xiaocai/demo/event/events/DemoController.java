package com.xiaocai.demo.event.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ DemoController ] 说明：无
 * @Function :  功能说明：模拟触发事件，不一定要使用该种方式，此处只是个实例
 *              如定时任务执行触发，异步任务执行触发，工程启动触发，特定业务执行触发
 * @Date ：2022/7/13 8:22
 * @Version ： 1.0
 **/

@RestController
@RequestMapping("/push")
@Slf4j
public class DemoController {

    /**
     * 注入 事件发布类
     */
    @Autowired
    ApplicationEventPublisher eventPublisher;

    /**
     * http://127.0.0.1:8080/push?code=001&message=测试
     * http://127.0.0.1:8080/push?code=002&message=测试
     * @param message
     * @return
     */
    @GetMapping
    public String push(String code,String message) {
        log.info("发布applicationEvent事件:{},{}", code, message);
        eventPublisher.publishEvent(new CustomEvent(this, MessageEntity.builder().code(code).message(message).build()));
        return "事件发布成功!";
    }

    @GetMapping("/obj")
    public String pushObject(String code,String message) {
        log.info("发布对象事件:{},{}", code, message);
        eventPublisher.publishEvent(MessageEntity.builder().code(code).message(message).build());
        return "对象事件发布成功!";
    }
}
