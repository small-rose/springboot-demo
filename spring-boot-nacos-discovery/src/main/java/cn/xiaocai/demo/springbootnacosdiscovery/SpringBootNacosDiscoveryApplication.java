package cn.xiaocai.demo.springbootnacosdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author  zhangxiaocai.cn
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootNacosDiscoveryApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootNacosDiscoveryApplication.class, args);
    }

}
