package com.xiaocai.demo.event.guava.spring2;

import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ TimeTaskEventListener ] 说明：无
 * @Function :  功能说明：
 *                  （3）消息监听器用于注册、监听和处理从消息总线接收到订阅消息，
 * @Date ：2022/7/13 10:32
 * @Version ： 1.0
 **/
@Component
@Slf4j
public class TimeTaskEventListener {

    @PostConstruct
    public void init() {
        TimeEventBus.register(this);
    }

    @Subscribe
    public boolean processExpiringEvent(TimeExpiringEvent expiringEvent) {

        //TODO process code
        log.info("监听到 expiringEvent 事件  {}" ,expiringEvent);
        //如果涉及到其他事件，可以继续触发新的事件
        return true;
    }
}
