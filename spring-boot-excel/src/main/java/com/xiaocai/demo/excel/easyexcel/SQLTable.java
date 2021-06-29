package com.xiaocai.demo.excel.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.fastjson.JSON;
import com.sun.applet2.AppletParameters;
import com.xiaocai.demo.excel.common.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
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
