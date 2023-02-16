package com.small.o2o.comp.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;


@Data
public class DropTableVo {


    @ExcelProperty(index = 7)
    private String no ;

    @ExcelProperty(index = 8)
    private String tableName ;

    @ExcelProperty(index = 9)
    private String keep ;





    @Override
    public String toString() {
        return "DropTableVo{" +
                "no='" + no + '\'' +
                ", keep='" + keep + '\'' +
                ", tableName='" + tableName + '\'' +
                '}';
    }
}
