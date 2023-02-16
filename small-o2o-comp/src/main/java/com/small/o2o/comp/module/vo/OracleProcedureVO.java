package com.small.o2o.comp.module.vo;


import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

/**
 *  包含了--函数、存过、存过包
 */
@Data
public class OracleProcedureVO extends ObProcedureVO {


    @ExcelProperty(value = "ORA小计", index = 5)
    @ColumnWidth(value = 8)
    private String count2 ;

    @ExcelProperty(value = "ORA序号", index = 6)
    @ColumnWidth(value = 10)
    private String no2 ;

    // SELECT OBJECT_TYPE, OBJECT_NAME, PROCEDURE_NAME FROM user_procedures order by OBJECT_TYPE, OBJECT_NAME, SUBPROGRAM_ID;
    @ExcelProperty(value = "ORA类型", index = 7)
    @ColumnWidth(value = 20)
    private String  objectType2;

    @ExcelProperty(value = "ORA存过(包)/函数名称", index = 8)
    @ColumnWidth(value = 30)
    private String  objectName2;

    @ExcelProperty(value = "ORA存过相关", index = 9)
    @ColumnWidth(value = 10)
    private String  procedureName2;


    @ExcelProperty(value = "对比结果", index = 10)
    @ColumnWidth(value = 10)
    private String  check = "";
}
