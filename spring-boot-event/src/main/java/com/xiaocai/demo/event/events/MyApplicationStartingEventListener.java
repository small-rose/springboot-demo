package com.xiaocai.demo.event.events;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ ApplicationStartingEvent ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/13 8:25
 * @Version ： 1.0
 **/
public class MyApplicationStartingEventListener implements ApplicationListener<ApplicationStartingEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        // TODO Auto-generated method stub
        //由于 log相关还未加载 使用了也输出不了的
//        log.info("ApplicationStartingEvent事件发布:{}", event);
        System.out.println("ApplicationStartingEvent事件发布:" + event.getTimestamp());
    }

}
