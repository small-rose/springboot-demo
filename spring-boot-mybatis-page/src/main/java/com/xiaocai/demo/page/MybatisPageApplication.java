package com.xiaocai.demo.page;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@MapperScan(basePackages = {"com.xiaocai.demo.page.web.mapper"})
@EnableSwagger2
@EnableSwaggerBootstrapUI
@SpringBootApplication
public class MybatisPageApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPageApplication.class, args);
    }

}
