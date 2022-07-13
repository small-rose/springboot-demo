package com.xiaocai.demo.event.guava.original;

import com.google.common.eventbus.EventBus;
import org.junit.jupiter.api.Test;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ SimpleEventBusTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/13 13:17
 * @Version ： 1.0
 **/
public class SimpleEventBusTest {

    /**
     *  guava  event bus 订阅发布事件模型
     */
    @Test
    public  void main() {
        EventBus eventBus = new EventBus();
        eventBus.register(new SimpleListener());
        System.out.println("Post Simple EventBus Example");
        eventBus.post("Simple EventBus Example");
    }
}
