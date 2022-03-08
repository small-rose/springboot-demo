package cn.xiaocai.demo.kingbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class KingbaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(KingbaseApplication.class, args);
    }

}
