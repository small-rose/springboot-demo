package cn.xiaocai.demo.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ws.config.annotation.EnableWs;

@SpringBootApplication
@EnableWs
public class SpringBootWebserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebserviceApplication.class, args);
    }

}
