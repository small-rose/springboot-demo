package com.small.o2o.comp.module.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

@Data
public class OracleTableViewVO extends ObTableViewVO {

    @ExcelProperty(value = "ORA小计", index = 6)
    @ColumnWidth(value = 8)
    private String count2 ;


    @ExcelProperty(value = "ORA序号", index = 7)
    @ColumnWidth(value = 5)
    private String no2 ;

    @ExcelProperty(value = "ORA视图名称", index = 8)
    @ColumnWidth(value = 30)
    private String viewName2 ;

    @ExcelProperty(value = "ORA视图文本长度", index = 9)
    @ColumnWidth(value = 10)
    private Long textLength2;

    @ExcelProperty(value = "ORA视图文本", index = 10)
    private String text2 ;



}
