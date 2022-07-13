package com.xiaocai.demo.event;

import com.xiaocai.demo.event.events.MyApplicationStartingEventListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class EventApplication {

    public static void main(String[] args) {

        //SpringApplication.run(SpringBootEventApplication.class, args);
        SpringApplication app =new SpringApplication(EventApplication.class);
        app.addListeners(new MyApplicationStartingEventListener());//加入自定义的监听类
        app.run(args);
        log.info("SpringBootEventApplication started success !");
    }

}
