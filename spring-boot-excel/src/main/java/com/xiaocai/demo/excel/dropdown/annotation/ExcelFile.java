package com.xiaocai.demo.excel.dropdown.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Project : businessVehicleIntelligent
 * @Author : zengfangling
 * @Description : [ ExcelFile ] 说明：无
 * @Function :  功能说明：无
 * @Date : 2022/10/10 17:47
 * @Version ： 1.0
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelFile {

    /**
     * 文件全名
     */
    String fileName() default "excel.xlsx";

    /**
     * 页名称
     */
    String sheetName() default "sheet1";

    /**
     * 为true时，创建数据页，当不存在级联下拉时可设置为不创建
     */
    boolean enableDataValidation() default false;

    /**
     * 数据页名称
     */
    String dataSheetName() default "dataSheet";

    /**
     * 隐藏数据页
     */
    boolean datasheetHidden() default true;
}
