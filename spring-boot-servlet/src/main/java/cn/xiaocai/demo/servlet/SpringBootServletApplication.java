package cn.xiaocai.demo.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangxiaocai.cn
 */
@SpringBootApplication
public class SpringBootServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootServletApplication.class, args);
        System.out.println("启动成功 ^_^");
    }

}
