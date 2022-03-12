package com.xiaocai.demo.mutilds.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ MybatisMysqlConfig ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/2/22 18:01
 * @Version ： 1.0

 * Mybatis主数据源ds1配置
 * 多数据源配置依赖数据源配置
 */
@Configuration
@MapperScan(basePackages ="cn.xiaocai.demo.kingbase.web.mapper.mysql", sqlSessionTemplateRef  = "mysqlSqlSessionTemplate")
public class MybatisMysqlConfig {

    //主数据源 ds1数据源 mysql
    @Primary
    @Bean("mysqlSqlSessionFactory")
    public SqlSessionFactory ds1SqlSessionFactory(@Qualifier("mysqlDataSource") DataSource dataSource) throws Exception {
        //MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();  //mybatis-plus
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().
                getResources("classpath*:mapper/mysql/**/*.xml"));
        return sqlSessionFactory.getObject();
    }

    @Primary
    @Bean(name = "mysqlTransactionManager")
    public DataSourceTransactionManager ds1TransactionManager(@Qualifier("mysqlDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Primary
    @Bean(name = "mysqlSqlSessionTemplate")
    public SqlSessionTemplate ds1SqlSessionTemplate(@Qualifier("mysqlSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
