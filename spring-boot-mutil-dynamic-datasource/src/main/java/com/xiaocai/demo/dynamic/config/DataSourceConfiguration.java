package com.xiaocai.demo.dynamic.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.xiaocai.demo.dynamic.common.enums.DataSourcesType;
import com.xiaocai.demo.dynamic.core.datasource.DynamicDataSource;
import com.xiaocai.demo.dynamic.core.transaction.MultiDataSourceTransactionFactory;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：  数据源配置类
 * @author: 张小菜
 * @date: 2022/3/12 15:26
 * @version: v1.0
 */
@Slf4j
@Configuration
public class DataSourceConfiguration {

    /**
     * 主库
     */
    @Bean
    @ConfigurationProperties("spring.datasource.druid.master")
    public DataSource masterDataSource(DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.setDataSource(DruidDataSourceBuilder.create().build());
    }


    /**
     * 从库
     */
    @Bean
    @ConditionalOnProperty( prefix = "spring.datasource.druid.slave", name = "enable", havingValue = "true")//是否开启数据源开关---若不开启 默认适用默认数据源
    @ConfigurationProperties("spring.datasource.druid.slave")
    public DataSource slaveDataSource(DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.setDataSource(DruidDataSourceBuilder.create().build());
    }

    /**
     * 设置数据源
     */
    @Bean(name = "dynamicDataSource")
    @Scope(value = "prototype")
    @Primary
    public DynamicDataSource dynamicDataSource(DataSource masterDataSource, DataSource slaveDataSource) {
        Map<Object, Object> targetDataSources = new HashMap<>();
        DynamicDataSource dynamicDataSource = DynamicDataSource.build();
        targetDataSources.put(DataSourcesType.MASTER.name(), masterDataSource);
        targetDataSources.put(DataSourcesType.SLAVE.name(), slaveDataSource);
        //默认数据源配置 DefaultTargetDataSource
        dynamicDataSource.setDefaultTargetDataSource(masterDataSource);
        //额外数据源配置 TargetDataSources
        dynamicDataSource.setTargetDataSources(targetDataSources);
        dynamicDataSource.afterPropertiesSet();
        return dynamicDataSource;
    }

    @Bean(name="sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactorys(DynamicDataSource dynamicDataSource) throws Exception {
        log.info("--------------------  sqlSessionFactory init ---------------------");
        try {
            SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
            sessionFactoryBean.setDataSource(dynamicDataSource);
            sessionFactoryBean.setTransactionFactory(new MultiDataSourceTransactionFactory());
            // 读取配置
            sessionFactoryBean.setTypeAliasesPackage("com.youjia.user.model");
            //设置mapper.xml文件所在位置             R
            Resource[] resources = new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml");
            sessionFactoryBean.setMapperLocations(resources);
            return sessionFactoryBean.getObject();
        } catch (IOException e) {
            log.error("mybatis resolver mapper*xml is error",e);
            return null;
        } catch (Exception e) {
            log.error("mybatis sqlSessionFactoryBean create error",e);
            return null;
        }
    }

}
