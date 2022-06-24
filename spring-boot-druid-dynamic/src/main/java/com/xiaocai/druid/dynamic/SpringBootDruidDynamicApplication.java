package com.xiaocai.druid.dynamic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.xiaocai.demo.mybatisplus.web.mapper")
@SpringBootApplication
public class SpringBootDruidDynamicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDruidDynamicApplication.class, args);
    }

}
