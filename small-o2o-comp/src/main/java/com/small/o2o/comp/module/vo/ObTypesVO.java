package com.small.o2o.comp.module.vo;


import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.small.o2o.comp.module.excel.SheetDataVO;
import lombok.Data;

/**
 *  包含了--函数、存过、存过包
 */
@Data
public class ObTypesVO extends SheetDataVO {

    @ExcelProperty(value = "OB小计", index = 0)
    @ColumnWidth(value = 8)
    private String count1 ;

    @ExcelProperty(value = "序号", index = 1)
    @ColumnWidth(value = 8)
    private String no ;
    // SELECT OBJECT_TYPE, OBJECT_NAME, PROCEDURE_NAME FROM user_procedures order by OBJECT_TYPE, OBJECT_NAME, SUBPROGRAM_ID;
    @ExcelProperty(value = "OB类型名称", index = 2)
    @ColumnWidth(value = 20)
    private String  typeName;

    @ExcelProperty(value = "OB类型分类", index = 3)
    @ColumnWidth(value = 35)
    private String  typecode;
}
