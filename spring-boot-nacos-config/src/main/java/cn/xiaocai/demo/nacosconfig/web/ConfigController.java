package cn.xiaocai.demo.nacosconfig.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-04-30 16:28
 **/
@RestController
@RefreshScope
@Slf4j
public class ConfigController {

    @Resource
    private ApplicationContext applicationContext;
    /**
     *  方式一  @RefreshScope @Value 配和
     */
    @Value("${spring.application.name}")
    private String name ;

    @GetMapping("/name")
    public String name(){
        return name;
    }

    /**
     * 方式二 借助 applicationContext 环境实时获取
     * @return
     */
    @GetMapping("/conf")
    public String conf(){
        return applicationContext.getEnvironment().getProperty("config.addressPath");
    }
}
