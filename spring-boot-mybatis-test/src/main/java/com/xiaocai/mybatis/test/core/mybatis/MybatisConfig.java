package com.xiaocai.mybatis.test.core.mybatis;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.xiaocai.mybatis.test.core.mybatis.injector.CustomizedSqlInjector;
import com.xiaocai.mybatis.test.core.mybatis.plugin.DataPrivilegeInterceptor;
import com.xiaocai.mybatis.test.core.mybatis.plugin.ExecutorSwitchInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;

import java.util.HashMap;
import java.util.Map;

/**
 * Mybatis配置文件
 * 注意Interceptor的执行顺序：先加载的后执行
 */
@Configuration
public class MybatisConfig {

//    @Value("${system-conf.dao}")
//    private String dbType;
    @Autowired
    private Environment env;

    private static final Map<String,DbType> DB_TYPE = new HashMap<>();
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
     * 数据权限拦截器
     */
//    @Bean
//    @Order(999)
//    public DataSourceInterceptor dataSourceInterceptor() {
//        return new DataSourceInterceptor();
//    }
    /**
     * 注入自定义批量操作
     * @return
     */
    @Bean
    public CustomizedSqlInjector customizedSqlInjector() {
        return new CustomizedSqlInjector();
    }

}
