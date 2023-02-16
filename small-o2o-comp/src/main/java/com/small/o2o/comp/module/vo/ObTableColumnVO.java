package com.small.o2o.comp.module.vo;


import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.small.o2o.comp.module.excel.SheetDataVO;
import lombok.Data;

@Data
public class ObTableColumnVO extends SheetDataVO {


    @ExcelProperty(value = "OB小计", index = 0)
    @ColumnWidth(value = 8)
    private String count1 ;

    @ExcelProperty(value = "序号", index = 1)
    @ColumnWidth(value = 8)
    private String no ;
    //SELECT  TC.TABLE_NAME,  TC.COLUMN_NAME, TC.DATA_TYPE,TC.DATA_LENGTH
    //FROM SYS.USER_TAB_COLUMNS TC  ORDER BY TC.TABLE_NAME  , TC.COLUMN_ID ASC;

    @ExcelProperty(value = "OB表名称", index = 2)
    @ColumnWidth(value = 35)
    private String tableName ;

    @ExcelProperty(value = "OB列名称", index = 3)
    @ColumnWidth(value = 18)
    private String columnName ;

    @ExcelProperty(value = "OB列类型", index = 4)
    @ColumnWidth(value = 15)
    private String dataType ;

    @ExcelProperty(value = "OB列长度", index = 5)
    @ColumnWidth(value = 10)
    private Long dataLength ;
}
