package com.xiaocai.mybatis.test.core.datasource.druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import com.xiaocai.mybatis.test.core.datasource.DynamicRoutingDataSource;
import com.xiaocai.mybatis.test.core.datasource.annotation.DataSourcesType;
import com.xiaocai.mybatis.test.core.datasource.transaction.MultiDataSourceTransactionFactory;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Project : bp
 * @Author : zhangzongyuan
 * @Description : [ DataSourceConfiguration ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/6/22 9:48
 * @Version ： 1.0
 **/
@Slf4j
@Configuration
public class DataSourceConfiguration {


    @Autowired
    DruidDataSource slaveDataSource ;
    @Autowired
    Environment environment ;

    /**
     * 主库
     */
    @Bean
    @ConfigurationProperties("spring.datasource.druid.master")
    public DruidDataSource masterDataSource(DataSourceProperties dataSourceProperties)  {
        DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
        log.info("------ 初始化 masterDataSource 数据源");
        return  dataSourceProperties.setDataSource(dataSource);
    }


    /**
     * 从库
     */
    @Bean
    @ConditionalOnProperty( prefix = "spring.datasource.druid.slave", name = "enable", havingValue = "true")//是否开启数据源开关---若不开启 默认适用默认数据源
    @ConfigurationProperties("spring.datasource.druid.slave")
    public DruidDataSource slaveDataSource(DataSourceProperties dataSourceProperties) {
        DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
        log.info("------ 初始化 slaveDataSource 数据源");
        return  dataSourceProperties.setDataSource(dataSource);
    }


    /**
     * 交易库
     */
    @Bean
    @ConditionalOnProperty( prefix = "spring.datasource.druid.bpjyopr", name = "enable", havingValue = "true")//是否开启数据源开关---若不开启 默认适用默认数据源
    @ConfigurationProperties("spring.datasource.druid.bpjyopr")
    public DruidDataSource bpjyoprDataSource(DataSourceProperties dataSourceProperties) {
        DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
        log.info("------ 初始化 bpjyoprDataSource 数据源");
        return  dataSourceProperties.setDataSource(dataSource);
    }


    /**
     * 凭证台账库
     */
    @Bean
    @ConditionalOnProperty( prefix = "spring.datasource.druid.bptzopr", name = "enable", havingValue = "true")//是否开启数据源开关---若不开启 默认适用默认数据源
    @ConfigurationProperties("spring.datasource.druid.bptzopr")
    public DruidDataSource bptzoprDataSource(DataSourceProperties dataSourceProperties) {
        DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
        log.info("------ 初始化 bptzoprDataSource 数据源");
        return  dataSourceProperties.setDataSource(dataSource);
    }


    /**
     * 报表对账库
     */
    @Bean
    @ConditionalOnProperty( prefix = "spring.datasource.druid.bpdzopr", name = "enable", havingValue = "true")//是否开启数据源开关---若不开启 默认适用默认数据源
    @ConfigurationProperties("spring.datasource.druid.bpdzopr")
    public DruidDataSource bpdzoprDataSource(DataSourceProperties dataSourceProperties) {
        DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
        log.info("------ 初始化 bpdzoprDataSource 数据源");
        return  dataSourceProperties.setDataSource(dataSource);
    }

    /**
     * 2022-06-23  zzy 改造
     * 设置动态数据源
     * 如果需要使用多数据源，可以将enable 设置成true
     * 并且参数和 targetDataSources.put()操作对应的放开即可
     *
     *  对应的测试类 com.fenet.insurance.datasource.DynamicDataSourceTest
     */
    @Bean(name = "dynamicDataSource")
    //@Scope(value = "prototype")
    @Primary
    public DynamicRoutingDataSource dynamicDataSource(@Qualifier("masterDataSource") DruidDataSource masterDataSource
                                                      ,@Qualifier("slaveDataSource") DruidDataSource slaveDataSource
//                                                    ,@Qualifier("bpjyoprDataSource") DruidDataSource bpjyoprDataSource
//                                                    ,@Qualifier("bptzoprDataSource") DruidDataSource bptzoprDataSource
//                                                    ,@Qualifier("bpdzoprDataSource") DruidDataSource bpdzoprDataSource
                                                      ) {
        log.info("------ 初始化 dynamicDataSource 数据源");
        Map<Object, Object> targetDataSources = new HashMap<>();
        DynamicRoutingDataSource dynamicDataSource = DynamicRoutingDataSource.build();
        targetDataSources.put(DataSourcesType.MASTER.name(), masterDataSource);
        targetDataSources.put(DataSourcesType.SLAVE.name(), slaveDataSource);
//        targetDataSources.put(DataSourcesType.BPJYOPR.name(), bpjyoprDataSource);
//        targetDataSources.put(DataSourcesType.BPTZOPR.name(), bptzoprDataSource);
//        targetDataSources.put(DataSourcesType.BPDZOPR.name(), bpdzoprDataSource);
        //默认数据源配置 DefaultTargetDataSource
        dynamicDataSource.setDefaultTargetDataSource(masterDataSource);
        //额外数据源配置 TargetDataSources
        dynamicDataSource.setTargetDataSources(targetDataSources);
        dynamicDataSource.afterPropertiesSet();
        return dynamicDataSource;
    }


    @Bean
    public GlobalConfig globalConfig(@Qualifier("customizedSqlInjector") ISqlInjector customizedSqlInjector){
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setSqlInjector(customizedSqlInjector);
        return globalConfig;
    }

    @Bean(name="sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactorys(DynamicRoutingDataSource dynamicDataSource, GlobalConfig globalConfig) throws Exception {
        log.info("--------------------  MybatisSqlSessionFactoryBean init ---------------------");
        try {
            //SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
            MybatisSqlSessionFactoryBean sessionFactoryBean = new MybatisSqlSessionFactoryBean();
            sessionFactoryBean.setDataSource(dynamicDataSource);
            sessionFactoryBean.setTransactionFactory(new MultiDataSourceTransactionFactory());
            // 读取配置
            String mapper = getMapper();
            //log.info("Mapper.xml location : " + mapper);
            //设置mapper.xml文件所在位置             R
            Resource[] resources = new PathMatchingResourcePatternResolver().getResources("classpath:mapper/**/*.xml");
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

    private String getMapper() {
        String dao = environment.getProperty("system-conf.dao");
        return dao;
    }
}
