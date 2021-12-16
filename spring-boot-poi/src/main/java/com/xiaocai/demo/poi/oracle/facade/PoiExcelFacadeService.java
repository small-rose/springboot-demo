package com.xiaocai.demo.poi.oracle.facade;


import com.xiaocai.demo.poi.oracle.service.OracleSelectService;
import com.xiaocai.demo.poi.oracle.vo.TableColumn;
import com.xiaocai.demo.poi.oracle.vo.TableInfo;
import com.xiaocai.demo.poi.utils.ExcelConstant;
import com.xiaocai.demo.poi.utils.PoiExcel07Util;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.formula.functions.Hyperlink;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ PoiExcelFacadeService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/15 17:24
 * @Version ： 1.0
 **/
@Slf4j
@Service
public class PoiExcelFacadeService {

    @Autowired
    private OracleSelectService oracleSelectService;

    private static List<String> headers = Arrays.asList("字段名称","类型","是否主键","含义","说明");


    XSSFCellStyle cs1 = null, cs2 = null, cs3 = null, cs4 = null, cs5 = null;


    public void appendSheet(String schema, String fileName) throws IOException {
        File file = new File(fileName);
        String excelName = file.getName();
        List<TableInfo> allTables = oracleSelectService.getAllTables(schema);

        Map<String, String> tablePrimaryKey = getTablePrimaryKey(schema);
        //获取工作簿
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file));

        workbook.getSheetAt(0);
        //第一个sheet页的处理
        fillTableInfo(workbook, allTables, excelName);

        XSSFSheet sheet = null;
        XSSFCell cell = null;

        //设置样式
        cs1 = PoiExcel07Util.getAXSSFCellStyle(workbook, ExcelConstant.Font_Position_Center,10, XSSFFont.BOLDWEIGHT_BOLD,true,ExcelConstant.BgColor_Pale_Blue);
        cs2 = PoiExcel07Util.getAXSSFCellStyle(workbook,ExcelConstant.Font_Position_Center,10,XSSFFont.BOLDWEIGHT_NORMAL,false, "");

        int bk = 0 ;
        for (TableInfo tableInfo : allTables){
            String tableName = tableInfo.getTableName();
            List<TableColumn> columnInfos = oracleSelectService.getColumnInfo(schema, tableInfo.getTableName());

            if (bk == 3){
                break;
            }

            sheet = PoiExcel07Util.createASheetInWorkbook(workbook, tableInfo.getTableName());

            for (int r=0; r< columnInfos.size()+2; r++){
                String shuoMing = "";
                String primaryKey = "";
                XSSFRow row = PoiExcel07Util.createARowInSheet(sheet, r, 0);
                XSSFCell tempCell = null;
                if (r == 0) {
                    cell = PoiExcel07Util.createACellInRow(row, 0, "表名称：" + tableName);
                    cell = PoiExcel07Util.createACellInRow(row, 2, "含义：" + tableInfo.getTableComment());
                    // 合并首行
                    sheet.addMergedRegion(new CellRangeAddress(r, r, 0, 1));
                    sheet.addMergedRegion(new CellRangeAddress(r, r, 2, 4));

                    cell = PoiExcel07Util.createACellInRow(row, 5, "返回首页：");
                    cell.setCellType(HSSFCell.CELL_TYPE_FORMULA);
                    cell.setCellFormula("HYPERLINK(\"["+excelName+"]'sheet1'!A1\",\"返回首页\")"); //HYPERLINK("#明细!A1","homepage"),#代表本工作簿

                }else if (r == 1) {
                    cell = PoiExcel07Util.createACellInRow(row, 0, "表名称：" + tableName);
                    for (int c = 0; c < headers.size(); c++) {
                        cell = PoiExcel07Util.createACellInRow(row, c, headers.get(c));
                    }
                    row.setHeight((short) 400);
                }else if (r > 1) {
                    TableColumn column = columnInfos.get(r - 2);
                    cell = PoiExcel07Util.createACellInRow(row, 0, column.getColumnName());
                    cell = PoiExcel07Util.createACellInRow(row, 1, column.getColumnType());
                    if (tableName.equals(tablePrimaryKey.get(tableInfo.getTableName()))){
                        primaryKey = "是";
                    }
                    cell = PoiExcel07Util.createACellInRow(row, 2, primaryKey);
                    cell = PoiExcel07Util.createACellInRow(row, 3, column.getComments());

                    if (!StringUtils.isEmpty(column.getNullable()) && "N".equals(column.getNullable())){
                        shuoMing = "不允许为空";
                    }
                    cell = PoiExcel07Util.createACellInRow(row, 4, shuoMing);

                    for (int c = 0; c < headers.size(); c++) {
                        tempCell = row.getCell(c);
                        tempCell.setCellStyle(cs2);
                        if (c == 36) {
                            tempCell.setCellStyle(cs1);
                        }
                    }

                }
            }

        }

        log.info("----开始处理考勤统计数据-----");
    }

    private void fillTableInfo(XSSFWorkbook workbook, List<TableInfo> allTables, String excelName) {
        XSSFSheet sheet = workbook.getSheetAt(0);

        XSSFRow row = null;
        XSSFCell cell = null;
        for (int i = 4; i <allTables.size() + 4 ; i++){
            row = sheet.getRow(i);
            TableInfo tableInfo = allTables.get(i - 4);

            System.out.println("i " + i);
            cell = row.getCell(9);
            cell.setCellValue(tableInfo.getTableName());

            cell = row.getCell(10);
            cell.setCellValue(tableInfo.getTableComment());

            cell = row.getCell(12);
            cell.setCellFormula("HYPERLINK(\"["+excelName+"]'sheet"+(i-3)+"'!A1\",\"点击前往\")");

        }

    }


    private Map<String, String> getTablePrimaryKey(String schema){
        return  oracleSelectService.getTablePrimaryKey(schema);
    }
}
