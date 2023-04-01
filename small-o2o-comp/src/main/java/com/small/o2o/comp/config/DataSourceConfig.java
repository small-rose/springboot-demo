package com.small.o2o.comp.config;


import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;

@Slf4j
//@Configuration
public class DataSourceConfig {


    @Value(value = "${spring.datasource.driver-class-name}")
    private String driverClassName ;
    @Value(value = "${spring.datasource.url}")
    private String url ;
    @Value(value = "${spring.datasource.username}")
    private String username ;
    @Value(value = "${spring.datasource.password}")
    private String password ;


    @Value(value = "${spring.datasource.obdriver-class-name}")
    private String obDriverClassName ;
    @Value(value = "${spring.datasource.oburl}")
    private String obUrl ;
    @Value(value = "${spring.datasource.obusername}")
    private String obName ;
    @Value(value = "${spring.datasource.obpassword}")
    private String obPass ;
    @Value(value = "${spring.datasource.obuse}")
    private String obUse ;


    //@Bean
    //@ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource dataSource(DataSourceProperties properties)  {
        DruidDataSource dataSource = new CustomDatasource(properties);
        System.out.println("obuse = " + obUse);
        if ("true".equalsIgnoreCase(obUse)){
            dataSource.setDriverClassName(obDriverClassName);
            dataSource.setUrl(obUrl);
            dataSource.setUsername(obName);
            dataSource.setPassword(obPass);
            log.info("------ 加载 oceanbase 数据源");
        }else{
            dataSource.setDriverClassName(driverClassName);
            dataSource.setUrl(url);
            dataSource.setUsername(username);
            dataSource.setPassword(password);
            log.info("------ 加载 oracle 数据源");
        }
        log.info("------ 初始化 DataSource 数据源 : "+dataSource.getUrl());
        return  dataSource;
    }
}
