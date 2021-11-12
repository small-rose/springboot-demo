package com.example.qrcode.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Slf4j
@SpringBootApplication
@EnableSwagger2
public class SpringBootQrcodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootQrcodeApplication.class, args);
        log.info("启动完成！");
    }

}
