package com.xiaocai.demo.excel.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-29 11:09
 **/
@Data
public class IndexOrNameData {

    /**
     * 用名字去匹配，这里需要注意，如果名字重复，会导致只有一个字段读取到数据
     */
    @ExcelProperty("字段名称")
    private String columnName;

    @ExcelProperty("含义")
    private String comment;

    @ExcelProperty("说明")
    private String mark;
}
