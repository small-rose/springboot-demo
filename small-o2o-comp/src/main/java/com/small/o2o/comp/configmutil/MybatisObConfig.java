package com.small.o2o.comp.configmutil;


import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages ="com.small.o2o.comp.module.mapper.ob", sqlSessionTemplateRef  = "obSqlSessionTemplate")
public class MybatisObConfig {
    /**
     * 数据源 oracle 数据源 oracle
     */
    @Bean("obSqlSessionFactory")
    public SqlSessionFactory obSqlSessionFactory(@Qualifier("oceanbaseDataSource") DataSource dataSource) throws Exception {
        MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();  //mybatis-plus
        //SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().
                getResources("classpath*:mapper/ob/**/*.xml"));
        return sqlSessionFactory.getObject();
    }

    @Bean(name = "oceanbaseTransactionManager")
    public DataSourceTransactionManager oceanbaseTransactionManager(@Qualifier("oceanbaseDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "obSqlSessionTemplate")
    public SqlSessionTemplate obSqlSessionTemplate(@Qualifier("obSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
