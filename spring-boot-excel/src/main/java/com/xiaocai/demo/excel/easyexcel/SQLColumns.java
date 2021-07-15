package com.xiaocai.demo.excel.easyexcel;

import ch.qos.logback.core.rolling.helper.FileStoreUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.xiaocai.demo.excel.common.FileUtils;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-29 13:44
 **/
public class SQLColumns {

    static final String PathDir = "F:"+File.separator+ "onlyTest" +File.separator ;

    static Map<String, String> tableInfoMap = new LinkedHashMap<>();
    /**
     * 生成路径
     */
    static final String sqlPath = PathDir + "db_comment_all.sql";
    /**
     * 扫描模式生成路径
     */
    static final String checkFile = PathDir + "check.txt";

    static final String t_sql = "ALTER TABLE %s COMMENT '%s' ;";
    static final String c_sql = "ALTER TABLE %s MODIFY COLUMN  %s  %s  %s COMMENT '%s' ; ";

    public static void main(String[] args) {
        // 被读取的文件绝对路径
        String file = PathDir + "db_sql_all.xlsx";

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
        columnsListener.setCheck(true);
        columnsListener.setCheckFile(checkFile);
        columnsListener.setSqlPath(sqlPath);
        

        ExcelReader excelReader = EasyExcel.read(file, columnsListener).build();

        int MAX_INDEX = excelReader.excelExecutor().sheetList().size();
        System.out.println(" MAX_INDEX is " + MAX_INDEX);
        ReadSheet readSheet = null;
        for (int index = 1; index < 306 ; index++){

            //获取第 index  个 sheet 对象
            readSheet = EasyExcel.readSheet(index).build();
            //读取数据
            excelReader.read(readSheet);
        }

        excelReader.finish();
    }
}
