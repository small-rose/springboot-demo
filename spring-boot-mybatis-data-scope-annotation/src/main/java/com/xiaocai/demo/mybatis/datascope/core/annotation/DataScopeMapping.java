package com.xiaocai.demo.mybatis.datascope.core.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DataScopeMapping {

    String colSubCompany() default "subcompany";

    String colDepartmentCode() default "departmentcode";

}
