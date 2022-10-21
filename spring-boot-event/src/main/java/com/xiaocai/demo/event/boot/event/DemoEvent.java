package com.xiaocai.demo.event.boot.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ MyEvent ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/8/24 14:09
 * @Version ： 1.0
 **/
public class DemoEvent extends ApplicationEvent {
    public DemoEvent(Object source) {
        super(source);
    }
}
