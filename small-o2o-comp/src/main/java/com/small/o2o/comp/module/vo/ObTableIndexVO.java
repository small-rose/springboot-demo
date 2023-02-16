package com.small.o2o.comp.module.vo;


import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.small.o2o.comp.module.excel.SheetDataVO;
import lombok.Data;

@Data
public class ObTableIndexVO extends SheetDataVO {



    @ExcelProperty(value = "OB序号", index = 0)
    @ColumnWidth(value = 6)
    private String no ;
     //SELECT I.TABLE_NAME, I.INDEX_NAME, I.INDEX_TYPE, I.UNIQUENESS FROM USER_INDEXES I order by I.TABLE_NAME, I.INDEX_NAME;

    @ExcelProperty(value = "OB表名", index = 1)
    @ColumnWidth(value = 35)
    private String tableName ;

    @ExcelProperty(value = "OB表索引名称", index = 2)
    @ColumnWidth(value = 35)
    private String indexName ;

    @ExcelProperty(value = "OB关联列", index = 3)
    @ColumnWidth(value = 15)
    private String columnName ;

    @ExcelProperty(value = "OB索引类型", index = 4)
    @ColumnWidth(value = 15)
    private String indexType = "";

    @ExcelProperty(value = "唯一索引", index = 5)
    @ColumnWidth(value = 15)
    private String uniqueness ;

    @ExcelIgnore
    private String descend ;
}
