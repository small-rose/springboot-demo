package com.small.o2o.comp.module.vo;


import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.small.o2o.comp.module.excel.SheetDataVO;
import lombok.Data;

@Data
public class ObTablePrimaryKeyVO extends SheetDataVO {



    @ExcelProperty(value = "OB序号", index = 0)
    @ColumnWidth(value = 6)
    protected String no ;

    @ExcelProperty(value = "OB表名", index = 1)
    @ColumnWidth(value = 35)
    protected String tableName ;

    @ExcelProperty(value = "OB主键名称", index = 2)
    @ColumnWidth(value = 35)
    protected String constraintName ;

    @ExcelProperty(value = "OB主键列", index = 3)
    @ColumnWidth(value = 15)
    protected String columnName ;


}
