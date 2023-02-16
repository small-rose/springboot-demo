package com.small.o2o.comp.module.vo;


import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

@Data
public class OracleTableColumnVO extends ObTableColumnVO {


    @ExcelProperty(value = "ORA小计", index = 6)
    @ColumnWidth(value = 8)
    private String count1 ;

    @ExcelProperty(value = "序号", index = 7)
    @ColumnWidth(value = 5)
    private String no2 ;
    //SELECT  TC.TABLE_NAME,  TC.COLUMN_NAME, TC.DATA_TYPE,TC.DATA_LENGTH
    //FROM SYS.USER_TAB_COLUMNS TC  ORDER BY TC.TABLE_NAME  , TC.COLUMN_ID ASC;

    @ExcelProperty(value = "表名称", index = 8)
    @ColumnWidth(value = 35)
    private String tableName2 ;

    @ExcelProperty(value = "列名称", index = 9)
    @ColumnWidth(value = 18)
    private String columnName2 ;

    @ExcelProperty(value = "列类型", index = 10)
    @ColumnWidth(value = 15)
    private String dataType2 ;

    @ExcelProperty(value = "列长度", index = 11)
    @ColumnWidth(value = 10)
    private Long dataLength2 ;

    @ExcelProperty(value = "校验", index = 12)
    @ColumnWidth(value = 10)
    private String check = "" ;
}
