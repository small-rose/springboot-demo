package com.xiaocai.demo.mutilds.common.annotation;

import com.xiaocai.demo.mutilds.common.enums.DataSourcesType;

import java.lang.annotation.*;

/**
 * 数据源自定义注解
 */

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention( RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface DataSource {

    DataSourcesType source() default DataSourcesType.MYSQL;

}