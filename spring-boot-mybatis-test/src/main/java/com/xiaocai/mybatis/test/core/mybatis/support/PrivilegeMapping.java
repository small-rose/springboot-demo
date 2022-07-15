package com.xiaocai.mybatis.test.core.mybatis.support;

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PrivilegeMapping {


    String colSubCompany() default "subcompany";

    String colDepartmentCode() default "departmentcode";

}
