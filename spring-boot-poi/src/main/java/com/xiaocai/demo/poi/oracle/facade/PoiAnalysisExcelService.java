package com.xiaocai.demo.poi.oracle.facade;

import com.xiaocai.demo.poi.oracle.vo.TableInfo;
import com.xiaocai.demo.poi.utils.PoiExcel07Util;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ PoiAnalysisExcelService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/20 17:57
 * @Version ： 1.0
 **/
@Service
public class PoiAnalysisExcelService {


    public void analysisExcel(String fileName, String sqlFile) throws Exception {

        File file = new File(fileName);
        String excelName = file.getName();

        //获取工作簿
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file));

        XSSFRow row =  null;
        XSSFCell tempCell = null;
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rowNum = sheet.getLastRowNum();
        String tableName = "", tableComment = "";
        // 解析表信息
        for (int i = 4; i < rowNum; i++) {
             row = sheet.getRow(i);
            tableName = row.getCell(9).getStringCellValue();
            tableComment = row.getCell(10 ).getStringCellValue();

         }
    }
}
