package com.example.temp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class SpringBootTempApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTempApplication.class, args);
    }

}
