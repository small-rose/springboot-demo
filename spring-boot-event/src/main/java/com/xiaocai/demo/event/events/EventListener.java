package com.xiaocai.demo.event.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ EventListener ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/13 8:19
 * @Version ： 1.0
 **/

@Component
@Slf4j
public class EventListener  implements ApplicationListener<CustomEvent> {

    @Override
    @ConditionalOnExpression
    public void onApplicationEvent(CustomEvent event) {
        //这里也可以监听所有事件 使用  ApplicationEvent 类即可
        //这里仅仅监听自定义事件 CustomEvent
        log.info("ApplicationListener方式监听事件：{}", event);
    }
}
