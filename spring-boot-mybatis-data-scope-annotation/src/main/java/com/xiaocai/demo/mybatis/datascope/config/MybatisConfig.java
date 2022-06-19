package com.xiaocai.demo.mybatis.datascope.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.xiaocai.demo.mybatis.datascope.interceptor.DataPrivilegeInterceptor;
import com.xiaocai.demo.mybatis.datascope.interceptor.ExecutorSwitchInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/4/19 9:42
 * @version: v1.0
 */
@Configuration
public class MybatisConfig {
    /*
    @Bean
    public String MyBatisInterceptor(SqlSessionFactory sqlSessionFactory) {
        MySqlInterceptor mySqlInterceptor = new MySqlInterceptor();
        Properties properties = new Properties();
        properties.setProperty("prop1", "value1");
        // 给拦截器添加自定义参数
        mySqlInterceptor.setProperties(properties);
        sqlSessionFactory.getConfiguration().addInterceptor(mySqlInterceptor);
        // sqlSessionFactory.getConfiguration().addInterceptor(new MySqlInterceptor());
        return "interceptor";
    }
    */

    // 与sqlSessionFactory.getConfiguration().addInterceptor(new SelectPlugin());效果一致
    @Bean
    public DataPrivilegeInterceptor  mySqlInterceptor() {
        DataPrivilegeInterceptor interceptor = new DataPrivilegeInterceptor();
        Properties properties = new Properties();
        properties.setProperty("dbType", "mysql");
        // 调用properties.setProperty方法给拦截器设置自定义参数
        interceptor.setProperties(properties);
        return interceptor;
    }
    @Autowired
    private Environment env;

    private static final Map<String, DbType> DB_TYPE = new HashMap<>();
    static{
        DB_TYPE.put("mysql", DbType.MYSQL);
        DB_TYPE.put("oracle", DbType.ORACLE);
        DB_TYPE.put("kingbase", DbType.KINGBASE_ES);
        DB_TYPE.put("oceanbase", DbType.OCEAN_BASE);
    }

    private DbType getDbType(String dbType){
        return DB_TYPE.get(dbType);
    }

    /**
     * 数据权限拦截器
     */
    @Bean
    @Order(1002)
    public DataPrivilegeInterceptor dataPrivilegeInterceptor() {
        return new DataPrivilegeInterceptor();
    }

    /**
     * MybatisPlus拦截器，包括分页插件
     */
    @Bean
    @Order(1001)
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        //分页
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(getDbType(env.getProperty("system-conf.dao"))));
        return interceptor;
    }

    /**
     * 控制executor是否执行，用于只生成sql不执行的场景
     */
    @Bean
    @Order(1000)
    public ExecutorSwitchInterceptor executorSwitchInterceptor() {
        return new ExecutorSwitchInterceptor();
    }


    /**
     * 注入自定义批量操作
     * @return
     */
/*    @Bean
    public CustomizedSqlInjector customizedSqlInjector() {
        return new CustomizedSqlInjector();
    }*/

}
