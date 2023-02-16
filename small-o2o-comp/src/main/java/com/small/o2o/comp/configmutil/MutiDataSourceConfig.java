package com.small.o2o.comp.configmutil;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author xiaocai
 */
@Configuration
public class MutiDataSourceConfig {


    @Primary
    @Bean(name = "ob03DataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.druid.oceanbase03")
    public DataSourceProperties ob03DataSourceProperties() {
        return new DataSourceProperties();
    }

    /**
     *     主数据源 oceanbase 数据源
     */
    @Primary
    @Bean(name = "oceanbase03DataSource")
    public DataSource oceanbase03DataSource(@Qualifier("ob03DataSourceProperties") DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }

    @Primary
    @Bean(name = "obDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.druid.oceanbase")
    public DataSourceProperties mysqlDataSourceProperties() {
        return new DataSourceProperties();
    }

    /**
     *     主数据源 oceanbase 数据源
     */
    @Primary
    @Bean(name = "oceanbaseDataSource")
    public DataSource mysqlDataSource(@Qualifier("obDataSourceProperties") DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }


    /**
     * 数据源配置 oracleDataSourceProperties
     * @return
     */
    @Bean(name = "oracleDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.druid.oracle")
    public DataSourceProperties oracleDataSourceProperties() {
        return new DataSourceProperties();
    }

    /**
     * 第二个数据源 oracleDataSource
     * @param dataSourceProperties
     * @return
     */
    @Bean("oracleDataSource")
    public DataSource oracleDataSource(@Qualifier("oracleDataSourceProperties") DataSourceProperties dataSourceProperties) {
        DataSource dataSource = dataSourceProperties.initializeDataSourceBuilder().build();
        return dataSource;
    }
}
