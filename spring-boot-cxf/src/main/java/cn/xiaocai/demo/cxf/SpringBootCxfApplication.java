package cn.xiaocai.demo.cxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangxiaocai.cn
 */
@SpringBootApplication
public class SpringBootCxfApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootCxfApplication.class, args);
        System.out.println("CXF Demo 启动成功");
    }

}
