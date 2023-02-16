package com.small.o2o.comp.module.vo;


import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.small.o2o.comp.module.excel.SheetDataVO;
import lombok.Data;

/**
 *  包含了--函数、存过、存过包
 */
@Data
public class ObProcedureVO extends SheetDataVO {

    @ExcelProperty(value = "OB小计", index = 0)
    @ColumnWidth(value = 8)
    private String count1 ;

    @ExcelProperty(value = "序号", index = 1)
    @ColumnWidth(value = 8)
    private String no ;
    // SELECT OBJECT_TYPE, OBJECT_NAME, PROCEDURE_NAME FROM user_procedures order by OBJECT_TYPE, OBJECT_NAME, SUBPROGRAM_ID;
    @ExcelProperty(value = "OB对象类型", index = 2)
    @ColumnWidth(value = 20)
    private String  objectType;

    @ExcelProperty(value = "ORA存过(包)/函数名称", index = 3)
    @ColumnWidth(value = 30)
    private String  objectName;

    @ExcelProperty(value = "OB存过相关", index = 4)
    @ColumnWidth(value = 30)
    private String  procedureName;
}
