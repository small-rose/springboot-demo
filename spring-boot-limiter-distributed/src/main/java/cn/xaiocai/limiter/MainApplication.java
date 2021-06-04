package cn.xaiocai.limiter;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-02 10:50
 **/
@SpringBootApplication
public class MainApplication {

    private static final Logger logger = Logger.getLogger(MainApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
        logger.info("MainApplication start up! 启动完毕! ^_^ ");
    }
}
