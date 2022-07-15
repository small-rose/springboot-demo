package com.xiaocai.mybatis.test.core.datasource.annotation;

import java.lang.annotation.*;

/**
 * 数据源动态切换设置的注解。设置到service方法上面，用于指定事务使用哪个数据源
 *
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface TargetDataSource {

    /**
     * 目标数据源key
     * @return
     */
    DataSourcesType target() default  DataSourcesType.MASTER;

    /**
     * 使用切换的方法对应的功能标志，用于从配置map中读取对应的目标数据源key
     * @return
     */
    String desc() default "" ;
}