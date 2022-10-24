package com.xiaocai.demo.excel.dropdown.annotation;

import org.apache.poi.ss.usermodel.DataValidationConstraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Project : businessVehicleIntelligent
 * @Author : zengfangling
 * @Description : [ Excel ] 说明：无
 * @Function :  功能说明：无
 * @Date : 2022/10/10 17:47
 * @Version ： 1.0
 **/
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelDropDown {

    /**
     * 列名
     */
    String name() default "";

    int columnWidth() default (int) ((22 + 0.72) * 256);


    /**
     * 是否支持动态列
     */
    boolean dynamic() default false;


    /**
     * 数据源方法全名
     */
    String datasourceMethod() default "";

    /**
     * 前列字段
     * 当为空字符串时，认定无前列依赖
     */
    String beforeFieldName() default "";

    /**
     * 开始行
     */
    int firstRow() default 1;

    /**
     * 结束行
     */
    int lastRow() default 200;

    /**
     * 校验类型
     */
    int validationType() default DataValidationConstraint.ValidationType.LIST;
}
