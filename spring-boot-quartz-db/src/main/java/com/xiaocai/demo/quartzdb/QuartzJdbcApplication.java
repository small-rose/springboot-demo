package com.xiaocai.demo.quartzdb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class QuartzJdbcApplication {

    public static void main(String[] args) {

        SpringApplication.run(QuartzJdbcApplication.class, args);
        log.info("QuartzJdbcApplication 启动成功了--- +^_^+");
    }

}
