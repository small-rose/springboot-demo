package com.xiaocai.listener.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ DemoListener ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/10/12 10:57
 * @Version ： 1.0
 **/

@Slf4j
public class DemoListener implements SpringApplicationRunListener, ApplicationListener {

    // Spring 容器实例化使用
    public DemoListener(SpringApplication application, String[] args) {
    }


    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        log.info("onApplicationEvent --> {} " ,applicationEvent);
    }

    @Override
    public void starting() {
        log.info("starting --> " );

    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        log.info("environmentPrepared --> {}" , environment);

    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        log.info("contextPrepared --> {}" , context);
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        log.info("contextLoaded --> {}" , context);
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        log.info("started --> {}" , context);
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        log.info("running --> {}" , context);

    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        log.info("failed --> {}" , context);

    }
}
