package cn.xiaocai.demo.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 学习参考文章： https://blog.csdn.net/qq_35387940/article/details/100514134
 *
 * @author  zhangxiaocai.cn
 */
@SpringBootApplication
@EnableScheduling
public class SpringBootRabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRabbitmqApplication.class, args);
    }

}
