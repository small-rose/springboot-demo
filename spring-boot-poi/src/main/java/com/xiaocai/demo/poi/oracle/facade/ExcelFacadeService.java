package com.xiaocai.demo.poi.oracle.facade;


import com.xiaocai.demo.poi.oracle.service.OracleSelectService;
import com.xiaocai.demo.poi.oracle.vo.TableInfo;
import com.xiaocai.demo.poi.utils.TestFileUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
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


    @Autowired
    private PoiExcelFacadeService poiExcelFacadeService;
    /**
     * 生成最终的Excel
     * @return
     */
    public String generatedExcel(String schema) {
        List<TableInfo> allTables = oracleSelectService.getAllTables(schema);
        // 表信息使用模板填充
        String fileName  = fillTableInfo(allTables);


        try {
            poiExcelFacadeService.appendSheet(schema, fileName, allTables);
            System.out.println("poi追加sheet 成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
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

        return fileName ;
    }
}
