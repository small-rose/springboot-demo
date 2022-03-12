package com.xiaocai.mybatis.generator;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

import java.sql.Types;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ MyJavaTypeResolverImpl ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/11 10:00
 * @Version ： 1.0
 **/
public class CustomerJavaTypeResolverImpl extends JavaTypeResolverDefaultImpl {

    public CustomerJavaTypeResolverImpl() {
        super();
        typeMap.put(Types.LONGVARCHAR, new JdbcTypeInformation("VARCHAR",
                new FullyQualifiedJavaType(String.class.getName())));

    }
}


