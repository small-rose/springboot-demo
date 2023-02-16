package com.small.o2o.comp.module.vo;


import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

/**
 *  包含了--函数、存过、存过包
 */
@Data
public class OracleTypesVO extends ObTypesVO {

    @ExcelProperty(value = "ORA小计", index = 5)
    @ColumnWidth(value = 8)
    private String count2 ;

    @ExcelProperty(value = "序号", index = 6)
    @ColumnWidth(value = 8)
    private String no2 ;
    // SELECT OBJECT_TYPE, OBJECT_NAME, PROCEDURE_NAME FROM user_procedures order by OBJECT_TYPE, OBJECT_NAME, SUBPROGRAM_ID;
    @ExcelProperty(value = "ORA类型名称", index = 7)
    @ColumnWidth(value = 20)
    private String  typeName2;

    @ExcelProperty(value = "ORA类型分类", index = 8)
    @ColumnWidth(value = 35)
    private String  typecode2;
}
