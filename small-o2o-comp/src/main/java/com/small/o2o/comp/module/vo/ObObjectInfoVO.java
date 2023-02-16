package com.small.o2o.comp.module.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.small.o2o.comp.module.excel.SheetDataVO;
import lombok.Data;

@Data
public class ObObjectInfoVO extends SheetDataVO {

    @ExcelProperty(value = "序号", index = 1)
    @ColumnWidth(value = 8)
    private String no ;

    // SELECT OBJECT_TYPE, OBJECT_NAME, PROCEDURE_NAME FROM user_procedures order by OBJECT_TYPE, OBJECT_NAME, SUBPROGRAM_ID;
    @ExcelProperty(value = "OB对象类型", index = 2)
    @ColumnWidth(value = 20)
    private String  objectType;

    @ExcelProperty(value = "数量统计", index = 3)
    @ColumnWidth(value = 35)
    private Long  count;
}
