package com.xiaocai;

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
        SpringApplication app =new SpringApplication(MybatisTestApplication.class);
        //加入自定义的监听类
        //app.addListeners();
        app.run(args);
    }



}
