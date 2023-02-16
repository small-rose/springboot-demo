package com.small.o2o.comp.module.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.small.o2o.comp.module.excel.SheetDataVO;
import lombok.Data;

@Data
public class ObTableInfoVO extends SheetDataVO {

    @ExcelProperty(value = "OB小计", index = 0)
    @ColumnWidth(value = 8)
    private String count1 ;


    @ExcelProperty(value = "OB序号", index = 1)
    @ColumnWidth(value = 5)
    private String no ;


    @ExcelProperty(value = "OB表名称", index = 2)
    @ColumnWidth(value = 30)
    private String tableName ;

    @ExcelProperty(value = "OB表注释", index = 3)
    @ColumnWidth(value = 15)
    private String tableComment ;

    @ExcelIgnore
    private String status ;
    @ExcelIgnore
    private String temporary ;
    @ExcelIgnore
    private String tableType ;

    @ExcelProperty(value = "OB表分区数", index = 4)
    @ColumnWidth(value = 15)
    private Long partitions ;

    @ExcelProperty(value = "OB表记录数", index = 5)
    @ColumnWidth(value = 15)
    private Long countRows ;


    @Override
    public String toString() {
        return "ObTableInfoVO{" +
                "count1='" + count1 + '\'' +
                ", no='" + no + '\'' +
                ", tableName='" + tableName + '\'' +
                ", tableComment='" + tableComment + '\'' +
                ", status='" + status + '\'' +
                ", temporary='" + temporary + '\'' +
                ", tableType='" + tableType + '\'' +
                ", partitions=" + partitions +
                ", countRows=" + countRows +
                '}';
    }
}
