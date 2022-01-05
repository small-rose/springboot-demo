package com.xiaocai.demo.excel.oracle.facade;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.xiaocai.demo.excel.oracle.service.OracleSelectService;
import com.xiaocai.demo.excel.oracle.vo.TableColumn;
import com.xiaocai.demo.excel.oracle.vo.TableInfo;
import com.xiaocai.demo.excel.utils.TestFileUtil;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ ExcelFacadeService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/15 12:13
 * @Version ： 1.0
 **/
@Slf4j
@Service
public class ExcelFacadeService {

    @Autowired
    private OracleSelectService oracleSelectService;


    /**
     * 生成最终的Excel
     * @return
     */
    public String generatedExcel(String schema) {
        List<TableInfo> allTables = oracleSelectService.getAllTables(schema);
        // 表信息使用模板填充
        String fileName  = fillTableInfo(allTables);

        // 表列信息动态添加
        //addColumnInfos(schema, fileName, allTables);


        return "SUCCESS";
    }




    private void addColumnInfos(String schema, String fileName, List<TableInfo> allTables) {
        if (allTables.isEmpty()){
            log.info(" allTables size is 0 ");
        }


        int index = 2 ;
        for (TableInfo tableInfo : allTables){
            if (index == 4){
                break;
            }

            ExcelWriter excelWriter = EasyExcel.write(fileName, TableColumn.class).build();
            List<TableColumn> columnInfos = oracleSelectService.getColumnInfo(schema, tableInfo.getTableName());
            WriteSheet writeSheet = EasyExcel.writerSheet(index, tableInfo.getTableName()).head(TableColumn.class).build();

            excelWriter.write(columnInfos, writeSheet);
            excelWriter.finish();
            index++;
        }


        System.out.println("=====执行完成=====");
    }


    private String fillTableInfo(List<TableInfo> allTables){


        //模板路径
        String templateFileName = TestFileUtil.getPath() + "paymt" + File.separator + "db_table_template.xlsx";

        String datetime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));

        // 方案1 一下子全部放到内存里面 并填充
        String fileName =  "D:\\onlyTest\\paymt_" + datetime + ".xlsx";
        // 这里 会填充到第一个sheet， 然后文件流会自动关闭
        EasyExcel.write(fileName).withTemplate(templateFileName).sheet().doFill(allTables);
        return fileName ;
    }
}
