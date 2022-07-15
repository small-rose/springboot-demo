package com.xiaocai.mybatis.test;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Slf4j
@MapperScan(basePackages = "com.xiaocai.mybatis.test.module.mapper")
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableTransactionManagement
public class MybatisTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisTestApplication.class, args);
    }

}
