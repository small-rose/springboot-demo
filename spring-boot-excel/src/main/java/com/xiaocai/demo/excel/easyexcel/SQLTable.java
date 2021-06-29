package com.xiaocai.demo.excel.easyexcel;

import com.alibaba.excel.EasyExcel;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-29 11:33
 **/
public class SQLTable {

    static Map<String, String> tableColumnMap = new LinkedHashMap<>();

    static final String sqlPath = "F:"+File.separator+"db_comment.sql";
    static String sql = "alter table %s comment '%s' ;";

    public static void main(String[] args) {
        // 被读取的文件绝对路径
        String file = "F:"+ File.separator+"db_sql.xlsx";
        EasyExcel.read(file, new SQLTableListener(tableColumnMap, sqlPath, sql)).sheet().doRead();
    }


}
