package com.small.o2o.comp.module.vo;


import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.small.o2o.comp.module.excel.SheetDataVO;
import lombok.Data;

@Data
public class ORATablePrimaryKeyVO extends SheetDataVO {



    @ExcelProperty(value = "ORA序号", index = 0)
    @ColumnWidth(value = 6)
    protected String no ;

    @ExcelProperty(value = "ORA表名", index = 1)
    @ColumnWidth(value = 35)
    protected String tableName ;

    @ExcelProperty(value = "ORA主键名称", index = 2)
    @ColumnWidth(value = 35)
    protected String constraintName ;

    @ExcelProperty(value = "ORA主键列", index = 3)
    @ColumnWidth(value = 35)
    protected String columnName ;

    @ExcelProperty(value = "DDL", index = 4)
    @ColumnWidth(value = 80)
    protected String ddl ;
}
