package com.xiaocai.demo.transaction;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import sun.misc.Signal;
import sun.misc.SignalHandler;

@SpringBootApplication
@EnableSwagger2
@EnableSwaggerBootstrapUI
// # 配置版 ：扫描 xml使用 mybatis.mapper-locations; 注解版：使用 @MapperScan 注解 不需要配置此项
@MapperScan("com.xiaocai.demo.transaction.mapper")
public class SpringBootTransactionApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringBootTransactionApplication.class);

    public static void main(String[] args) {
        // 在Spring Boot应用中通过监听信号量和注册关闭钩子来实现在进程退出之前执行收尾工作
        // 监听信号量 配合 kill 15 关闭进程
        Signal sg = new Signal("TERM");
        Signal.handle(sg, new SignalHandler() {
            @Override
            public void handle(Signal signal) {
                logger.info("do signal handle: {}", signal.getName());
                System.exit(0);
            }
        });

        // 注册关闭钩子
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                // 在关闭钩子中执行收尾工作
                // 注意事项：
                // 1.在这里执行的动作不能耗时太久
                // 2.不能在这里再执行注册，移除关闭钩子的操作
                // 3 不能在这里调用System.exit()
                logger.info("do something on shutdown hook");
            }
        });

        SpringApplication.run(SpringBootTransactionApplication.class, args);
        logger.info("Start Successfully DONE.");

    }

}
