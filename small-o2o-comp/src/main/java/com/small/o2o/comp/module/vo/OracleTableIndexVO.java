package com.small.o2o.comp.module.vo;


import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

@Data
public class OracleTableIndexVO extends ObTableIndexVO {



    @ExcelProperty(value = "序号", index = 6)
    @ColumnWidth(value = 5)
    private String no2 ;
     //SELECT I.TABLE_NAME, I.INDEX_NAME, I.INDEX_TYPE, I.UNIQUENESS FROM USER_INDEXES I order by I.TABLE_NAME, I.INDEX_NAME;

    @ExcelProperty(value = "ORA表名", index = 7)
    @ColumnWidth(value = 35)
    private String tableName2 ;

    @ExcelProperty(value = "ORA索引名", index = 8)
    @ColumnWidth(value = 35)
    private String indexName2 ;


    @ExcelProperty(value = "ORA列关联", index = 9)
    @ColumnWidth(value = 15)
    private String columnName2 ;

    @ExcelProperty(value = "ORA索引类型", index = 10)
    @ColumnWidth(value = 15)
    private String indexType2 = "";

    @ExcelProperty(value = "ORA唯一索引", index = 11)
    @ColumnWidth(value = 15)
    private String uniqueness2 ;

    @ExcelProperty(value = "对比结果", index = 12 )
    @ColumnWidth(value = 10)
    private String check = "" ;

    @ExcelProperty(value = "修正DDL", index = 13 )
    @ColumnWidth(value = 100)
    private String sql = "" ;
}
