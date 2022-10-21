package com.xiaocai.demo.event.boot.listener;


import com.xiaocai.demo.event.boot.event.DemoEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ MyListener1 ] 说明：四种创建事件监听的方式
 * @Function :  功能说明： 创建监听事件的方式 二
 *                      （1） 实现 ApplicationListener 类,使用 @Component 注解，装载到 spring 容器
 *
 * @Date ：2022/8/24 14:09
 * @Version ： 1.0
 **/
@Slf4j
@Component
public class DemoListener2 implements ApplicationListener<DemoEvent>{

    @Override
    public void onApplicationEvent(DemoEvent event)
    {
        log.info(String.format("%s监听到事件源：%s.", DemoListener2.class.getName(), event.getSource()));
    }
}
