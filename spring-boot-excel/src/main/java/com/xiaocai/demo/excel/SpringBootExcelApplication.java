package com.xiaocai.demo.excel;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class SpringBootExcelApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootExcelApplication.class, args);
    }

}
