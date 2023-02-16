package com.small.o2o.comp.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class DropColumnVo {

    @ExcelProperty(index = 2)
    private String obTableName ;

    @ExcelProperty(index = 3)
    private String obColumnName ;

    @ExcelProperty(index = 7)
    private String no ;

    @ExcelProperty(index = 8)
    private String tableName ;

    @ExcelProperty(index = 9)
    private String columnName ;


    @Override
    public String toString() {
        return "DropColumnVo{" +
                "obTableName='" + obTableName + '\'' +
                ", obColumnName='" + obColumnName + '\'' +
                ", no='" + no + '\'' +
                ", tableName='" + tableName + '\'' +
                ", columnName='" + columnName + '\'' +
                '}';
    }
}
