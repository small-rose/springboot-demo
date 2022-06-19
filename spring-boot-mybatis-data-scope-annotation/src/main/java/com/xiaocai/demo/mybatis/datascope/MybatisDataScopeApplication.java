package com.xiaocai.demo.mybatis.datascope;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.xiaocai.demo.mybatis.datascope.web.mapper")
@SpringBootApplication
public class MybatisDataScopeApplication {

    public static void main(String[] args)
    {

        SpringApplication.run(MybatisDataScopeApplication.class, args);
    }

}
