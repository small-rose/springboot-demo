package com.xiaocai.demo.excel.easydrop.annotation;


import org.apache.poi.ss.usermodel.DataValidationConstraint;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author SHFND-NOTE200001
 */
@Documented
// 作用在字段上
@Target(ElementType.FIELD)
// 运行时有效
@Retention(RetentionPolicy.RUNTIME)
public @interface DropDownSetField {
    /**
     * 固定下拉内容
     */

    String[] source() default {};

    /**
     * 动态下拉内容
     * @return
     */
    Class[] sourceClass() default {};

    /**
     * 前列依赖
     * @return
     */
    String beforeFieldName() default "";

    /**
     * 区分 单选下拉
     * @return
     */
    String methodName() default "";

    /**
     * 级联数据生效 开始行
     */
    int firstRow() default 1;

    /**
     * 级联数据生效  结束行
     */
    int lastRow() default 10;


    /**
     * 校验类型
     */
    int validationType() default DataValidationConstraint.ValidationType.LIST;
}
