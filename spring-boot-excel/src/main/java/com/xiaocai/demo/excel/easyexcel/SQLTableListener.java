package com.xiaocai.demo.excel.easyexcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.xiaocai.demo.excel.common.FileUtils;

import java.util.Map;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-29 14:02
 **/
public class SQLTableListener extends AnalysisEventListener<Map<Integer, String>> {

    private final Map<String, String> tableMap ;
    private final String sqlPath ;
    private final String sql;

    public SQLTableListener(Map<String, String> tableColumnMap, String sqlPath, String sql) {
        this.tableMap = tableColumnMap;
        this.sqlPath = sqlPath;
        this.sql = sql;
    }

    @Override
    public void invoke(Map<Integer, String> data, AnalysisContext context) {
        if (data.get(9) != null && !"表名".equals(data.get(9))) {
            System.out.println("解析到一条数据：" + JSON.toJSONString(data));
            tableMap.put(data.get(9), data.get(10));
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        System.out.println(String.format("%s sheet 页解析完毕！",context.readSheetHolder().getSheetName()));
        String content = null;
        for (String key : tableMap.keySet()) {
            content = String.format(sql, key, tableMap.get(key));
            System.out.println(content);
            FileUtils.Write(sqlPath, content);
        }
    }
}
