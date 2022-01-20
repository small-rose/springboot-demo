package com.xiaocai.demo.xxljob;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
public class SpringBootXxlJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootXxlJobApplication.class, args);
        log.info("SpringBootXxlJobApplication started successfully !");
    }

}
