package com.xiaocai.demo.event.boot.listener;


import com.xiaocai.demo.event.boot.event.DemoEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ MyListener1 ] 说明：四种创建事件监听的方式
 * @Function :  功能说明： 创建监听事件的方式 三
 *                      （1） 该类无需实现ApplicationListener接口类, @Component 装载到 spring 容器
 *                      （2） 使用 @EventListener 装饰具体方法
 *
 *
 * @Date ：2022/8/24 14:09
 * @Version ： 1.0
 **/
@Slf4j
@Component
public class DemoListener4 {

    @EventListener
    public void onEvent(DemoEvent event)
    {
        log.info(String.format("%s监听到事件源：%s.", DemoListener4.class.getName(), event.getSource()));
    }
}
