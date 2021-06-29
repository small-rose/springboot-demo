package com.xiaocai.demo.excel.easyexcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.xiaocai.demo.excel.common.FileUtils;
import lombok.Data;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-29 14:02
 **/
@Data
public class SQLColumnsListener extends AnalysisEventListener<Map<Integer, String>> {


    private final List<String> tableColumnList = new ArrayList<>();
    private final List<String> checkList = new ArrayList<>();

    // 装表信息
    private Map<String, String> tableMap ;
    // 生成SQL路径
    private String sqlPath ;
    // 表注释修改SQL格式
    private String t_sql;
    // 表字段注释修改SQL格式
    private String c_sql;

    //扫描模式，检查缺失的注释
    private boolean check = false;
    // 扫描模式，生成扫描文件路径
    private String checkFile = "F:"+ File.separator+"check.txt";

    private int lineNum = 1 ;

    //结束sheet读取标记
    private boolean flag = false;

    public SQLColumnsListener() {
    }


    @Override
    public void invoke(Map<Integer, String> data, AnalysisContext context) {
        lineNum++;

        //System.out.println("解析到一条数据：" + JSON.toJSONString(data));
        if ("字段名称".equals(data.get(0))){
            return;
        }
        if (flag){
            return;
        }
        if (data.get(0)==null && data.get(1)==null && data.get(2)==null && data.get(3)==null){
            flag = true;
            return;
        }
        if ("索引".equals(data.get(0))){
            flag = true;
            return;
        }

        String sheetName = context.readSheetHolder().getSheetName();
        String tableName = sheetName.substring(0, sheetName.indexOf("（"));
        String tableComment = tableMap.get(tableName) ;

        if (check && data.get(0)!=null && data.get(3)==null){

            checkList.add(tableName.concat(" 第").concat(String.valueOf(lineNum)).concat("行 ").concat(data.get(0)));
        }

        /*
        if(!sheetName.endsWith("）")){
            tableComment = sheetName.substring(sheetName.indexOf("（")+1,sheetName.length());
        }else{
            tableComment = sheetName.substring(sheetName.indexOf("（")+1,sheetName.length()-1);
        }
         */

        String tc = String.format(t_sql, tableName, tableComment);
        if(!tableColumnList.contains(tc)){
            //System.out.println(tc);
            tableColumnList.add(tc);
        }

        //System.out.println("解析到一条数据：" + JSON.toJSONString(data));
        String comment = data.get(3);
        if (data.get(0).equalsIgnoreCase("CUSTSEQ") && null == comment){ comment = "业务唯一主键"; }
        if (data.get(0).equalsIgnoreCase("ID") && null == comment){ comment = "主键"; }
        if (data.get(0).equalsIgnoreCase("BATCHID") && null == comment){ comment = "批次号"; }
        if (data.get(0).equalsIgnoreCase("OPDATE") && null == comment){ comment = "操作日期"; }
        //System.out.println("解析到一条数据：" + JSON.toJSONString(data));
        /*if (comment.equals("ISPRIVATE")){
            System.out.println(data.get(4));
        }*/
        if (data.get(4)!=null){
            comment = comment.concat("(").concat(data.get(4).concat(")"));
            comment.replaceAll("(.*) - (.*)","-");
            comment.replaceAll("\"","");
            comment.replaceAll(" \"","");
        }

        String cc = String.format(c_sql, tableName, data.get(0), comment);
        //System.out.println(cc);
        tableColumnList.add(cc);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        String sheetName = context.readSheetHolder().getSheetName();
        System.out.println(String.format("-----------%s sheet 页解析完毕！--------------",sheetName));

        tableColumnList.stream().forEach((s)-> FileUtils.Write(sqlPath, s));
        FileUtils.Write(sqlPath, "");

        if (check){
            checkList.stream().forEach((s)-> FileUtils.Write(checkFile, s));
            FileUtils.Write(sqlPath, "");
            checkList.stream().forEach(System.out::println);
            checkList.clear();
        }

        lineNum = 1;
        tableColumnList.clear();
        flag = false;
    }


}
