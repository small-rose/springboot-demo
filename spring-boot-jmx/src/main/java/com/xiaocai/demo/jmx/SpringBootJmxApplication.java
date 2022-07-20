package com.xiaocai.demo.jmx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJmxApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJmxApplication.class, args);
        System.out.println("springboot  jmx app is running ...");
    }

}
