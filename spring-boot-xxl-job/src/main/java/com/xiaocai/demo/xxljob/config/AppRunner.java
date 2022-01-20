package com.xiaocai.demo.xxljob.config;

import com.xiaocai.demo.xxljob.jobHandler.demo.DemoJob01Handler;
import com.xxl.job.core.executor.XxlJobExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ AppRunner ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/20 14:39
 * @Version ： 1.0
 **/
@Slf4j
@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    private DemoJob01Handler demoJob01Handler;


    @Override
    public void run(String... args) throws Exception {

        log.info(">>> 注册自定义处理器 ...");
        XxlJobExecutor.registJobHandler("demoJob01Handler", demoJob01Handler);
        log.info(">>> 注册自定义处理器完成 ...");
    }
}
