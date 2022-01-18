package com.xiaocai.demo.quartzdb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringBootQuartzDbApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootQuartzDbApplication.class, args);
        log.info("SpringBootQuartzDbApplication 启动成功了--- +^_^+");
    }

}
