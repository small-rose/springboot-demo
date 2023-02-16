package com.small.o2o.comp.module.vo;


import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.small.o2o.comp.module.excel.SheetDataVO;
import lombok.Data;

@Data
public class ObSequencesVO extends SheetDataVO {


    @ExcelProperty(value = "OB小计", index = 0)
    @ColumnWidth(value = 10)
    private String count1 ;

    @ExcelProperty(value = "序号", index = 1)
    @ColumnWidth(value = 12)
    private String no ;

    //SELECT T.SEQUENCE_NAME, T.LAST_NUMBER  FROM SYS.USER_SEQUENCES T ORDER BY T.SEQUENCE_NAME;

    @ExcelProperty(value = "OB序列名称", index = 2)
    @ColumnWidth(value = 35)
    private String sequenceName ;

    @ExcelProperty(value = "OB序列最大值", index = 3)
    @ColumnWidth(value = 30)
    private String lastNumber ;
}
