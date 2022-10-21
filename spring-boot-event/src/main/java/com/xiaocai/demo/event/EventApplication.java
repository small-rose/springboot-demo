package com.xiaocai.demo.event;

import com.xiaocai.demo.event.boot.event.DemoEvent;
import com.xiaocai.demo.event.boot.listener.DemoListener1;
import com.xiaocai.demo.event.events.MyApplicationStartingEventListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class EventApplication {

    public static void main(String[] args) {

        //SpringApplication.run(SpringBootEventApplication.class, args);
        SpringApplication app =new SpringApplication(EventApplication.class);
        app.addListeners(new MyApplicationStartingEventListener());//加入自定义的监听类

        ConfigurableApplicationContext context  = app.run(args);

        //boot 装载监听
        context.addApplicationListener(new DemoListener1());
        //发布事件
        context.publishEvent(new DemoEvent("测试事件."));
        log.info("SpringBootEventApplication started success !");
    }

}
