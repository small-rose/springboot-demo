package com.xiaocai.demo.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SpringBootQuartzApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootQuartzApplication.class, args);

    }

}
