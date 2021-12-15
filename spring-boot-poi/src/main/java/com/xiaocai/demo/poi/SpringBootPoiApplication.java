package com.xiaocai.demo.poi;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class SpringBootPoiApplication {

    public static void main(String[] args) {


        SpringApplication.run(SpringBootPoiApplication.class, args);
    }

}
