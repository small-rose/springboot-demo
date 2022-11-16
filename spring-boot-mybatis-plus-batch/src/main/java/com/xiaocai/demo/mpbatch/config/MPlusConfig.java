package com.xiaocai.demo.mpbatch.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import com.xiaocai.demo.mpbatch.injector.CustomizedSqlInjector;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ MybatisPlusConfig ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/3 17:19
 * @Version ： 1.0
 **/

// 配置第一步、扫码Mapper
@MapperScan("com.xiaocai.demo.mpbatch.web.mapper")
@Configuration
@Slf4j
public class MPlusConfig {

    /**
     * 新的分页插件,一缓和二缓遵循mybatis的规则,需要设置
     * MybatisConfiguration#useDeprecatedExecutor = false 避免缓存出现问题
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }


    @Bean
    public CustomizedSqlInjector customizedSqlInjector() {
        return new CustomizedSqlInjector();
    }



    @Bean
    @ConfigurationProperties("spring.datasource")
    public DruidDataSource masterDataSource()  {
        DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
        log.info("------ 初始化 masterDataSource 数据源");
        return  dataSource ;
    }

    @Bean(name="sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(DruidDataSource masterDataSource, GlobalConfig globalConfig) throws Exception {
        log.info("--------------------  sqlSessionFactory init ---------------------");
        try {
            //SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
            MybatisSqlSessionFactoryBean sessionFactoryBean = new MybatisSqlSessionFactoryBean();
            sessionFactoryBean.setDataSource(masterDataSource);
            //sessionFactoryBean.setTransactionFactory(new MultiDataSourceTransactionFactory());
            // 读取配置

            //log.info("Mapper.xml location : " + mapper);
            //设置mapper.xml文件所在位置             R
            Resource[] resources = new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml");
            sessionFactoryBean.setMapperLocations(resources);

            //添加自定义sql注入接口
            sessionFactoryBean.setGlobalConfig(globalConfig);//添加自定义sql注入接口

            return sessionFactoryBean.getObject();
        } catch (IOException e) {
            log.error("mybatis resolver mapper*xml is error",e);
            return null;
        } catch (Exception e) {
            log.error("mybatis sqlSessionFactoryBean create error",e);
            return null;
        }
    }

    @Bean
    public GlobalConfig globalConfig(@Qualifier("customizedSqlInjector") ISqlInjector customizedSqlInjector){
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setSqlInjector(customizedSqlInjector);
        return globalConfig;
    }

}
