package cn.xiaocai.js.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableScheduling;


@EntityScan(basePackages = {"cn.xiaocai.js.data.persistence.entity"})
@EnableScheduling
@SpringBootApplication
public class SmallRoseJsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallRoseJsApplication.class, args);
    }

}
