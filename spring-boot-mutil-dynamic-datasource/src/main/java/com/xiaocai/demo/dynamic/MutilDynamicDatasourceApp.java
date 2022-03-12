package com.xiaocai.demo.dynamic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})// 在启动类上面加注解可解决 数据源 循环依赖问题，
@MapperScan(basePackages = {"com.xiaocai.demo.dynamic.mapper"})
public class MutilDynamicDatasourceApp {

    public static void main(String[] args) {
        SpringApplication.run(MutilDynamicDatasourceApp.class, args);
    }

}
