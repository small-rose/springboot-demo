package com.small.o2o.comp.module.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

@Data
public class OracleTableInfoVO extends ObTableInfoVO {

    @ExcelProperty(value = "ORA小计", index = 6)
    @ColumnWidth(value = 8)
    private String count1 ;


    @ExcelProperty(value = "序号", index = 7)
    @ColumnWidth(value = 5)
    private String no2 ;


    @ExcelProperty(value = "ORA表名称", index = 8)
    @ColumnWidth(value = 30)
    private String tableName2 ;

    @ExcelProperty(value = "ORA表注释", index = 9)
    @ColumnWidth(value = 15)
    private String tableComment2 ;


    @ExcelIgnore
    private String status2 ;
    @ExcelIgnore
    private String temporary2 ;

    @ExcelProperty(value = "OB表分区数", index = 10)
    @ColumnWidth(value = 15)
    private Long partitions2 ;

    @ExcelProperty(value = "OB表记录数", index = 11)
    @ColumnWidth(value = 15)
    private Long countRows2 ;

    @ExcelProperty(value = "校验", index = 12)
    @ColumnWidth(value = 10)
    private String check = "" ;

}
