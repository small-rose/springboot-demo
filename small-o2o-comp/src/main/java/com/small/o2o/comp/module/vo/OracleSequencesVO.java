package com.small.o2o.comp.module.vo;


import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

@Data
public class OracleSequencesVO extends ObSequencesVO {


    @ExcelProperty(value = "OB小计", index = 4)
    @ColumnWidth(value = 10)
    private String count2 ;


    @ExcelProperty(value = "序号", index = 5)
    @ColumnWidth(value = 12)
    private String no2 ;

    //SELECT T.SEQUENCE_NAME, T.LAST_NUMBER  FROM SYS.USER_SEQUENCES T ORDER BY T.SEQUENCE_NAME;

    @ExcelProperty(value = "序列每次", index = 6)
    @ColumnWidth(value = 35)
    private String sequenceName2 ;

    @ExcelProperty(value = "序列最大值", index = 7)
    @ColumnWidth(value = 35)
    private String lastNumber2 ;
}
