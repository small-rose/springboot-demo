package com.xiaocai.demo.poi.oracle.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/14 22:11
 * @version: v1.0
 */
@Data

public class TableColumn {
    @ColumnWidth(value = 60)
    @ExcelProperty("字段")
    private String columnName ;

    @ExcelProperty("类型")
    private String columnType;

    @ExcelProperty("注释")
    private String comments;

    @ExcelProperty("是否为空")
    private String nullable;

}
