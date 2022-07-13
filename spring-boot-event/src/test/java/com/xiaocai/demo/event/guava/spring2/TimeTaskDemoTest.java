package com.xiaocai.demo.event.guava.spring2;

import com.xiaocai.demo.event.EventApplicationTests;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ TimeTaskDemoTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/13 13:39
 * @Version ： 1.0
 **/
@Slf4j
public class TimeTaskDemoTest extends EventApplicationTests {

    public void timeExpiringEvent() {
        log.info("发布 TimeExpiringEvent 事件:{},{}");
        TimeEventBus.post(new TimeExpiringEvent(TimeTask.builder().code("t").message("timetask").build()));
        //return "事件发布成功!";
    }
}
