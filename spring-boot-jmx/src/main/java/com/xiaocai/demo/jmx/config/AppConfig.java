package com.xiaocai.demo.jmx.config;

import com.xiaocai.demo.jmx.properties.MySQLDBProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ AppConfig ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/6 15:19
 * @Version ： 1.0
 **/
@Configuration
@PropertySource(value = {"mysqldb.properties"})
@EnableConfigurationProperties(value = { MySQLDBProperties.class})
public class AppConfig {
}
