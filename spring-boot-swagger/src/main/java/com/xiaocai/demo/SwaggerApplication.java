package com.xiaocai.demo;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ SwaggerApplication ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/2/15 15:27
 * @Version ： 1.0
 **/

@SpringBootApplication
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class SwaggerApplication {

    public static void main(String[] args) {


        SpringApplication.run(SwaggerApplication.class, args);
    }

}
