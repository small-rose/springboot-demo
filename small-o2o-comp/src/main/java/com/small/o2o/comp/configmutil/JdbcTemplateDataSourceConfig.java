package com.small.o2o.comp.configmutil;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class JdbcTemplateDataSourceConfig {
    /**
     * JdbcTemplate主数据源 oceanbase 数据源
     * @param dataSource
     * @return
     */
    @Primary
    @Bean(name = "ob03JdbcTemplate")
    public JdbcTemplate ob03JdbcTemplate(@Qualifier("oceanbase03DataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
    /**
     * JdbcTemplate主数据源 oceanbase 数据源
     * @param dataSource
     * @return
     */
    @Primary
    @Bean(name = "obJdbcTemplate")
    public JdbcTemplate obJdbcTemplate(@Qualifier("oceanbaseDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    /**
     * JdbcTemplate第二个 oracle 数据源
     * @param dataSource
     * @return
     */
    @Bean(name = "oracleJdbcTemplate")
    public JdbcTemplate oracleJdbcTemplate(@Qualifier("oracleDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
