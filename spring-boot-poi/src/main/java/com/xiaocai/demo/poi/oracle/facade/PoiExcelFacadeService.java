package com.xiaocai.demo.poi.oracle.facade;


import com.xiaocai.demo.poi.oracle.service.OracleSelectService;
import com.xiaocai.demo.poi.oracle.vo.TableColumn;
import com.xiaocai.demo.poi.oracle.vo.TableInfo;
import com.xiaocai.demo.poi.utils.ExcelConstant;
import com.xiaocai.demo.poi.utils.PoiExcel07Util;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCreationHelper;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFHyperlink;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.*;
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

        Map<String, String> tablePrimaryKey = oracleSelectService.getTablePrimaryKey(schema);

        //获取工作簿
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file));

        workbook.getSheetAt(0);

        //XSSFCreationHelper helper = workbook.getCreationHelper();
        CreationHelper helper = workbook.getCreationHelper();
        //第一个sheet页的处理
        fillTableInfo(workbook, allTables, excelName, helper);

        XSSFSheet sheet = null;
        XSSFCell cell = null, cellCmt = null;

        //设置样式
        cs1 = PoiExcel07Util.getAXSSFCellStyle(workbook, ExcelConstant.Font_Position_Left,10, XSSFFont.BOLDWEIGHT_BOLD,true,ExcelConstant.BgColor_Pale_Blue);
        cs2 = PoiExcel07Util.getAXSSFCellStyle(workbook,ExcelConstant.Font_Position_Left,9,XSSFFont.BOLDWEIGHT_NORMAL,false, "");


        int bk = 0 ;
        for (TableInfo tableInfo : allTables){
            String tableName = tableInfo.getTableName();
            List<TableColumn> columnInfos = oracleSelectService.getColumnInfo(schema, tableInfo.getTableName());

            if (bk == 6){
                break;
            }
            bk++;

            sheet = PoiExcel07Util.createASheetInWorkbook(workbook, tableInfo.getTableName());

            for (int r=0; r< columnInfos.size()+2; r++){
                String shuoMing = "";
                String primaryKey = "";
                XSSFRow row = PoiExcel07Util.createARowInSheet(sheet, r, 0);
                XSSFCell tempCell = null;
                float max = 0f;
                if (r == 0) {
                    cell = PoiExcel07Util.createACellInRow(row, 0, "表名称：" + tableName);
                    cell.setCellStyle(cs1);
                    cell = PoiExcel07Util.createACellInRow(row, 2, "含义：" + tableInfo.getTableComment());
                    cell.setCellStyle(cs1);
                    // 合并首行
                    sheet.addMergedRegion(new CellRangeAddress(r, r, 0, 1));
                    sheet.addMergedRegion(new CellRangeAddress(r, r, 2, 4));

                    cell = PoiExcel07Util.createACellInRow(row, 5, "返回首页：");

                    //Hyperlink hyperlink = helper.createHyperlink(XSSFHyperlink.LINK_DOCUMENT);
                    int number = bk +4 ;
                    //hyperlink.setAddress("HYPERLINK(\"["+excelName+"]-首页 - J"+number +"\",\"返回首页\")");
                    cell.setCellType(HSSFCell.CELL_TYPE_FORMULA);
                    //cell.setHyperlink(hyperlink);
                    //cell.setCellFormula("HYPERLINK(\"["+excelName+"]-首页 - J"+number +"\",\"返回首页\")"); //HYPERLINK("#明细!A1","homepage"),#代表本工作簿
                    cell.setCellFormula("HYPERLINK(\"["+excelName+"]首页!J"+number +"\",\"返回首页\") \n"); //HYPERLINK("#明细!A1","homepage"),#代表本工作簿
                    cell.getCellStyle().setWrapText(true);
                }else if (r == 1) {
                    cell = PoiExcel07Util.createACellInRow(row, 0, "表名称：" + tableName);
                    for (int c = 0; c < headers.size(); c++) {
                        cell = PoiExcel07Util.createACellInRow(row, c, headers.get(c));
                        cell.setCellStyle(cs1);
                    }
                    row.setHeight((short) 400);

                }else if (r > 1) {
                    TableColumn column = columnInfos.get(r - 2);
                    cell = PoiExcel07Util.createACellInRow(row, 0, column.getColumnName());
                    cell = PoiExcel07Util.createACellInRow(row, 1, column.getColumnType());

                    if (column.getColumnName().equals(tablePrimaryKey.get(tableInfo.getTableName()))){
                        primaryKey = "Y";
                    }
                    cell = PoiExcel07Util.createACellInRow(row, 2, primaryKey);

                    cellCmt = PoiExcel07Util.createACellInRow(row, 3, column.getComments());

                    // 根据文字计算行高, 每行10个汉字
                    float f = PoiExcel07Util.getExcelCellAutoHeight(column.getComments()==null ? "" :column.getComments(), 10f);
                    if(f > max){
                        max = f ;
                    }
                    row.setHeight((short)(max*50));

                    if (!StringUtils.isEmpty(column.getNullable()) && "N".equals(column.getNullable())){
                        shuoMing = "NOT NULL";
                    }
                    cell = PoiExcel07Util.createACellInRow(row, 4, shuoMing);

                    for (int c = 0; c < headers.size(); c++) {
                        tempCell = row.getCell(c);
                        tempCell.setCellStyle(cs2);
                        if (c!=3) {
                            sheet.autoSizeColumn(c);
                        }else {
                            sheet.setColumnWidth(c, 50*256);
                        }
                    }

                }

            }

        }

        OutputStream output = new FileOutputStream(file);
        workbook.write(output);
        output.flush();
        output.close();
        log.info("----开始处理考勤统计数据-----");
    }

    /**
     * 第一个sheet页收集表信息
     * @param workbook
     * @param allTables
     * @param excelName
     * @param helper
     */
    private void fillTableInfo(XSSFWorkbook workbook, List<TableInfo> allTables, String excelName,CreationHelper helper) {
        Map<String, String> tableDDLTime = oracleSelectService.getTableLastDDLTime("");
        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFRow row = null;
        XSSFCell cell = null, cell2 = null;
        XSSFCellStyle cellstyle7 = null,  cellstyle8= null, cellstyle9= null,
                cellstyle10= null , cellstyle11= null , cellstyle12= null ;
        for (int i = 4; i <allTables.size() + 4 ; i++){
            row = sheet.getRow(i);

            TableInfo tableInfo = allTables.get(i - 4);
            String tableName = tableInfo.getTableName();
            if(null!=row){
                if (cellstyle7==null){
                    cellstyle7 = row.getCell(7).getCellStyle();
                    cellstyle8 = row.getCell(8).getCellStyle();
                    cellstyle9 = row.getCell(9).getCellStyle();
                    cellstyle10 = row.getCell(10).getCellStyle();
                    cellstyle11 = row.getCell(11).getCellStyle();
                    cellstyle12 = row.getCell(12).getCellStyle();
                }
                //System.out.println("i " + i);
                cell = row.getCell(9);
                cell.setCellValue(tableName);

                cell = row.getCell(10);
                cell.setCellValue(tableInfo.getTableComment());
                cell.setCellStyle(cellstyle10);

                cell = PoiExcel07Util.createACellInRow(row, 11, tableName.startsWith("D") ? "支付平台":"收付系统");
                cell.setCellStyle(cellstyle11);

                cell2 = row.getCell(12);
                cell2.setCellType(HSSFCell.CELL_TYPE_FORMULA);
                //cell2.setCellValue("点击前往");
                //XSSFHyperlink hyperlink = cell.getHyperlink();
                //if (hyperlink==null){
                //     hyperlink = (XSSFHyperlink) helper.createHyperlink(XSSFHyperlink.LINK_DOCUMENT);
                //}
                //hyperlink.setLocation("["+excelName+"] - "+tableName+"!A1");
                //cell2.setHyperlink(hyperlink);
                cell2.setCellFormula("HYPERLINK(\"["+excelName+"]"+tableName+"!A1\",\"点击前往\")");
                XSSFFont cellFont= workbook.createFont();
                cellFont.setFontHeight(9);
                cellFont.setFontName(ExcelConstant.Font_Name);
                cellFont.setUnderline((byte) 1);
                cellFont.setColor(HSSFColor.BLUE.index);
                cellstyle12.setFont(cellFont);
                cell2.setCellStyle(cellstyle12);

                //cell.setCellFormula("HYPERLINK(\"#"+tableName+" - A1\",\"点击前往\")\n");

                cell = row.getCell(13);
                cell.setCellValue(tableDDLTime.get(tableInfo.getTableName()));

            }else if (i>= 309){
                row = PoiExcel07Util.createARowInSheet(sheet, i, 400);

                cell = PoiExcel07Util.createACellInRow(row, 7, (i-3)+"");
                cell.setCellStyle(cellstyle7);

                cell = PoiExcel07Util.createACellInRow(row, 8, "收付");
                cell.setCellStyle(cellstyle8);

                cell = PoiExcel07Util.createACellInRow(row, 9, tableName);
                cell.setCellStyle(cellstyle9);

                cell = PoiExcel07Util.createACellInRow(row, 10, tableInfo.getTableComment());
                cell.setCellStyle(cellstyle10);

                cell = PoiExcel07Util.createACellInRow(row, 11, tableName.startsWith("D") ? "支付平台":"收付系统");
                cell.setCellStyle(cellstyle11);

                cell = PoiExcel07Util.createACellInRow(row, 12, "点击前往");
                cell.setCellFormula("HYPERLINK(\"["+excelName+"]- "+tableName+"- A1\",\"点击前往\")");
                cell.setCellStyle(cellstyle12);

                cell = PoiExcel07Util.createACellInRow(row, 12, tableDDLTime.get(tableName));


            }

        }

    }



}
