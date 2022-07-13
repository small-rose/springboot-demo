package com.xiaocai.demo.event.guava.spring2;

import lombok.extern.slf4j.Slf4j;
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
@RequestMapping("/task")
@Slf4j
public class TimeTaskDemoController {


    /**
     * http://127.0.0.1:8080/ebus/msg?code=002&message=test
     * @param code
     * @param message
     * @return
     */
    @GetMapping
    public String timeExpiringEvent(String code,String message) {
        log.info("发布 TimeExpiringEvent 事件:{},{}", code, message);
        TimeEventBus.post(new TimeExpiringEvent(TimeTask.builder().code("t").message("timetask").build()));
        return "事件发布成功!";
    }


}
