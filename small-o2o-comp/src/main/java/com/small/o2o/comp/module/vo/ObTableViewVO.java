package com.small.o2o.comp.module.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.small.o2o.comp.module.excel.SheetDataVO;
import lombok.Data;

@Data
public class ObTableViewVO extends SheetDataVO {

    @ExcelProperty(value = "OB小计", index = 0)
    @ColumnWidth(value = 8)
    private String count1 ;


    @ExcelProperty(value = "OB序号", index = 1)
    @ColumnWidth(value = 5)
    private String no ;

    @ExcelProperty(value = "OB视图名称", index = 2)
    @ColumnWidth(value = 30)
    private String viewName ;

    @ExcelProperty(value = "OB视图文本长度", index = 3)
    @ColumnWidth(value = 10)
    private Long textLength;

    @ExcelProperty(value = "OB视图文本", index = 4)
    private String text;

}
