package com.small.o2o.comp.module.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

@Data
public class OracleObjectInfoVO extends ObObjectInfoVO {

    @ExcelProperty(value = "ORA序号", index = 4)
    @ColumnWidth(value = 8)
    private String no2 ;

    // SELECT OBJECT_TYPE, OBJECT_NAME, PROCEDURE_NAME FROM user_procedures order by OBJECT_TYPE, OBJECT_NAME, SUBPROGRAM_ID;
    @ExcelProperty(value = "对象类型", index = 5)
    @ColumnWidth(value = 20)
    private String  objectType2;

    @ExcelProperty(value = "数量统计", index = 6)
    @ColumnWidth(value = 35)
    private Long  count2;
}
