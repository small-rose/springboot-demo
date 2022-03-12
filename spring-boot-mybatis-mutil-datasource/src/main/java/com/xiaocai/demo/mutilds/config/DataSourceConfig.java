package com.xiaocai.demo.mutilds.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ DataSourceConfig ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/2/22 18:04
 * @Version ： 1.0

 * 多数据源配置
 **/
@Configuration
public class DataSourceConfig {

    //主数据源配置 mysql 数据源
    @Primary
    @Bean(name = "mysqlDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.mysql")
    public DataSourceProperties mysqlDataSourceProperties() {
        return new DataSourceProperties();
    }

    //主数据源 mysql 数据源
    @Primary
    @Bean(name = "mysqlDataSource")
    public DataSource mysqlDataSource(@Qualifier("mysqlDataSourceProperties") DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }

    //第二个ds2数据源配置 kingbase
    @Bean(name = "kingbaseDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.kingbase")
    public DataSourceProperties kingbaseDataSourceProperties() {
        return new DataSourceProperties();
    }

    //第二个ds2数据源 kingbase
    @Bean("kingbaseDataSource")
    public DataSource kingbaseDataSource(@Qualifier("kingbaseDataSourceProperties") DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }

    //第3个ds3数据源配置 oracle
    @Bean(name = "oracleDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.oracle")
    public DataSourceProperties oracleDataSourceProperties() {
        return new DataSourceProperties();
    }

    //第3个ds3数据源 oracle
    @Bean("oracleDataSource")
    public DataSource oracleDataSource(@Qualifier("oracleDataSourceProperties") DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }
}
