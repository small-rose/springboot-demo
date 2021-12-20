package com.xiaocai.demo.poi.oracle.facade;


import com.xiaocai.demo.poi.oracle.service.OracleSelectService;
import com.xiaocai.demo.poi.oracle.vo.TableInfo;
import com.xiaocai.demo.poi.utils.TestFileUtil;
import lombok.extern.slf4j.Slf4j;


import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
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
    @Autowired
    private PoiAnalysisExcelService poiAnalysisExcelService;

    /**
     * 生成最终的Excel
     * @return
     */
    public String generatedExcel(String schema) {
        // 复制模板 ，然后处理
        try {
            String fileName  = copyFile();

            poiExcelFacadeService.appendSheet(schema, fileName);
            System.out.println("poi追加sheet 成功！");
            log.info("生成文件路径："+fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "SUCCESS";
    }


    private String copyFile() throws IOException {

        //模板路径
        String templateFileName = TestFileUtil.getPath() + "paymt" + File.separator + "db_table_template.xlsx";

        String datetime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss"));

        // 方案1 一下子全部放到内存里面 并填充
        String fileName =  "D:\\onlyTest\\paymt_" + datetime + ".xlsx";
        FileUtils.copyFile(new File(templateFileName), new File(fileName));
        return fileName ;
    }

    /**
     * 使用Excel 生成SQL
     * @param fileName
     * @return
     */
    public String analysisExcel(String fileName, String sqlFile) {
        try {
            poiAnalysisExcelService.analysisExcel(fileName, sqlFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sqlFile;
    }
}
