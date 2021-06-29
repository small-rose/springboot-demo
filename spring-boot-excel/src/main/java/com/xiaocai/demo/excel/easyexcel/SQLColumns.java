package com.xiaocai.demo.excel.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.fastjson.JSON;
import com.xiaocai.demo.excel.common.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-29 13:44
 **/
public class SQLColumns {

    static Map<String, String> tableInfoMap = new LinkedHashMap<>();
    /**
     * 生成路径
     */
    static final String sqlPath = "F:"+File.separator+"db_comment_118.sql";
    /**
     * 扫描模式生成路径
     */
    static final String checkFile = "F:"+ File.separator+"check.txt";

    static final String t_sql = "ALTER TABLE %s COMMENT '%s' ;";
    static final String c_sql = "ALTER TABLE %s MODIFY COLUMN  %s COMMENT '%s' ; ";

    public static void main(String[] args) {
        // 被读取的文件绝对路径
        String file = "F:"+ File.separator+"db_sql.xlsx";

        // 取表信息
        selectTableInfo(file);

        // 取列信息
        excelHandler(file);
    }

    public static void  selectTableInfo(String file){
        EasyExcel.read(file, new AnalysisEventListener<Map<Integer, String>>(){
            @Override
            public void invoke(Map<Integer, String> data, AnalysisContext context) {
                if (data.get(9) != null && !"表名".equals(data.get(9))) {
                    //System.out.println("解析到一条数据：" + JSON.toJSONString(data));
                    tableInfoMap.put(data.get(9), data.get(10));
                }
            }
            @Override
            public void doAfterAllAnalysed(AnalysisContext context) {
                System.out.println(String.format("%s sheet 页解析完毕！get all table info",context.readSheetHolder().getSheetName()));
            }
        }).sheet().doRead();
    }


    public static void  excelHandler(String file){
        SQLColumnsListener columnsListener = new SQLColumnsListener();
        // 表名易首页为准
        columnsListener.setTableMap(tableInfoMap);
        columnsListener.setT_sql(t_sql);
        columnsListener.setC_sql(c_sql);
        columnsListener.setCheck(false);
        columnsListener.setCheckFile(checkFile);
        columnsListener.setSqlPath(sqlPath);

        ExcelReader excelReader = EasyExcel.read(file, columnsListener).build();

        int MAX_INDEX = excelReader.excelExecutor().sheetList().size();
        System.out.println(" MAX_INDEX is " + MAX_INDEX);
        ReadSheet readSheet = null;
        for (int index = 1; index < 119 ; index++){
            if (index < 20 && index > 16){
                continue;
            }
            //获取第 index  个 sheet 对象
            readSheet = EasyExcel.readSheet(index).build();
            //读取数据
            excelReader.read(readSheet);
        }

        excelReader.finish();
    }
}
