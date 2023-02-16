package com.small.o2o.comp.module.vo;


import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.small.o2o.comp.module.excel.SheetDataVO;
import lombok.Data;

@Data
public class ObTableColumnFullVO extends SheetDataVO {


    @ExcelProperty(value = "OB小计", index = 0)
    @ColumnWidth(value = 8)
    protected String count1 ;

    @ExcelProperty(value = "序号", index = 1)
    @ColumnWidth(value = 8)
    protected String no ;
    //SELECT  TC.TABLE_NAME,  TC.COLUMN_NAME, TC.DATA_TYPE,TC.DATA_LENGTH
    //FROM SYS.USER_TAB_COLUMNS TC  ORDER BY TC.TABLE_NAME  , TC.COLUMN_ID ASC;

    @ExcelProperty(value = "OB表名称", index = 2)
    @ColumnWidth(value = 35)
    protected String tableName ;

    @ExcelProperty(value = "OB列名称", index = 3)
    @ColumnWidth(value = 18)
    protected String columnName ;

    @ExcelProperty(value = "OB列类型", index = 4)
    @ColumnWidth(value = 15)
    protected String dataType ;

    @ExcelProperty(value = "OB列扩展", index = 5)
    @ColumnWidth(value = 10)
    protected String extend ;

    @ExcelIgnore
    protected String nullable;
    @ExcelIgnore
    protected String dataDefault;


}
