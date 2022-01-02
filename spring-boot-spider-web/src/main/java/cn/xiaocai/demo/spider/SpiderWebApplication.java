package cn.xiaocai.demo.spider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangxiaocai.cn
 */

@Slf4j
@SpringBootApplication
public class SpiderWebApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpiderWebApplication.class, args);
        log.info("Sprider Web started success !");
    }

}
