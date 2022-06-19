package com.xiaocai.demo.mockito;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringBootMockitoApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootMockitoApplication.class, args);

        log.info("启动成功");
    }

}
