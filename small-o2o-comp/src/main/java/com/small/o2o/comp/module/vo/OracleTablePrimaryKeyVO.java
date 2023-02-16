package com.small.o2o.comp.module.vo;


import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

@Data
public class OracleTablePrimaryKeyVO extends ObTablePrimaryKeyVO {



    @ExcelProperty(value = "Ora序号", index = 4)
    @ColumnWidth(value = 6)
    private String no2 ;

    @ExcelProperty(value = "Ora表名", index = 5)
    @ColumnWidth(value = 35)
    private String tableName2 ;

    @ExcelProperty(value = "Ora主键名称", index = 6)
    @ColumnWidth(value = 35)
    private String constraintName2 ;

    @ExcelProperty(value = "Ora主键列", index = 7)
    @ColumnWidth(value = 15)
    private String columnName2 ;


    @ExcelProperty(value = "对比结果", index = 8)
    @ColumnWidth(value = 10)
    private String check = "" ;


    @ExcelProperty(value = "修复DDL", index = 9)
    @ColumnWidth(value = 100)
    private String sql = "" ;
}
