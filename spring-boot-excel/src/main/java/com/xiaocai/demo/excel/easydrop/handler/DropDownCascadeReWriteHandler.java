package com.xiaocai.demo.excel.easydrop.handler;

import com.alibaba.excel.write.handler.SheetWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import com.xiaocai.demo.excel.easydrop.annotation.DropDownSetField;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import org.apache.poi.xssf.usermodel.XSSFSheet;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ DropDownCellReWriteHandler ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/10/24 13:51
 * @Version ： 1.0
 **/
public class DropDownCascadeReWriteHandler implements SheetWriteHandler {

    /**
     * 样式列表
     */
    private static Map<String, CellStyle> styles;


    private List<Field> fieldList ;
    private Map<Integer, Field> fieldMap ;
    private Map<Integer ,Map<String, List<String>>> caseCadeMap ;
    private  String formulaIndirectFormat = "=INDIRECT(%s!$%s$%s)";


    public DropDownCascadeReWriteHandler(List<Field> fieldList, Map<Integer, Field> fieldMap, Map<Integer ,Map<String, List<String>>> caseCadeMap) {
        this.fieldList = fieldList ;
        this.fieldMap = fieldMap ;
        this.caseCadeMap = caseCadeMap;
    }

    @Override
    public void beforeSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {
        int m = 0;
    }

    @Override
    public void afterSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {


        // 这里可以对cell进行任何操作
        Sheet sheet = writeSheetHolder.getSheet();
        //取出对应的  Workbook
        Workbook workbook = writeWorkbookHolder.getWorkbook();
        styles = createStyles(workbook);
        // 第二步：创建一个Sheet页
        String hiddenSheetName = "dataSheet";
        Sheet dataSheet = workbook.createSheet(hiddenSheetName);

        // k 为存在下拉数据集的单元格下标 v为下拉数据集
        fieldMap.forEach((k, v) -> {
            System.out.println("Excel 第 " + k  +" 列");
            Map<String, List<String>> vdata = caseCadeMap.get(k);

            int colIndex = k;

            DropDownSetField value = v.getAnnotation(DropDownSetField.class);

            if (value==null || !StringUtils.hasText(value.beforeFieldName()) ){

                int nameManage = createNameManage(workbook, dataSheet, v.getName(), vdata.get(v.getName()));
//                System.out.println(" getCellColumnFlag(1) = " + getCellColumnFlag(k+1) + " ,  nameManage + 1 = " +  (nameManage + 1));
                String formulaIndirect = String.format(formulaIndirectFormat, dataSheet.getSheetName(), getCellColumnFlag(1), nameManage + 1);
                createDataValidate(sheet, formulaIndirect, value.validationType(), value.firstRow(), value.lastRow(), colIndex, colIndex);

            }else {

                // 命名管理器数据
                vdata.forEach((name, data) -> {
                    createNameManage(workbook, dataSheet, name, data);
                });

                //得到前置字段在第几列
                int beforeColIndex = 0;
                for (int i = 0; i < fieldList.size(); i++) {
                    if (fieldList.get(i).getName().equals(value.beforeFieldName())) {
                        beforeColIndex = i;
                        break;
                    }
                }

                for (int rowIndex = value.firstRow(); rowIndex <= value.lastRow(); rowIndex++) {
                    //System.out.println(" beforeColIndex = " + beforeColIndex +" , rowIndex = "+rowIndex);
                    String formulaIndirect = String.format(formulaIndirectFormat, sheet.getSheetName(), getCellColumnFlag(beforeColIndex + 1), rowIndex + 1);
                    createDataValidate(sheet, formulaIndirect, value.validationType(), rowIndex, rowIndex, colIndex, colIndex);
                }


            }
        });
        //隐藏新创建的sheet  调试的时候可以放开
        workbook.setSheetHidden(workbook.getSheetIndex(workbook.getSheet(hiddenSheetName)), true);
    }





    private static int createNameManage(Workbook workbook, Sheet sheet, String nameString, Collection data) {
        //数据在第几行
        final int size = workbook.getAllNames().size();
        int columnIndex = 0;
        String format = "%s!$%s$%s:$%s$%s";
        Name name = workbook.createName();
        name.setNameName(nameString);
        String cellColumnFlag = getCellColumnFlag(columnIndex + 2);
        int nameManageRegan = CollectionUtils.isEmpty(data) ? 1 : data.size() + 1;
        String nameManageScope = String.format(format, sheet.getSheetName(), cellColumnFlag, size + 1, getCellColumnFlag(nameManageRegan), size + 1);
//        System.out.println("name = "+nameString);
//        System.out.println("nameManageScope = "+nameManageScope);
        name.setRefersToFormula(nameManageScope);
        createCell(1, sheet, size, columnIndex, nameString);
        if (!CollectionUtils.isEmpty(data)) {
            for (Object val : data) {
                createCell(1, sheet, size, ++columnIndex, String.valueOf(val));
            }
        }
        return size;
    }

    private static String getCellColumnFlag(int num) {
        String colFiled = "";
        int chuNum = 0;
        int yuNum = 0;
        if (num >= 1 && num <= 26) {
            colFiled = doHandle(num);
        } else {
            chuNum = num / 26;
            yuNum = num % 26;
            yuNum = yuNum == 0 ? 1 : yuNum;
            colFiled += doHandle(chuNum);
            colFiled += doHandle(yuNum);
        }
        return colFiled;
    }

    private static String doHandle(int num) {
        return String.valueOf((char) (num + 64));
    }

    private static void createCell(int type, Sheet sheet, int rowIndex, int colIndex, String val) {
        Row row = sheet.getRow(rowIndex);
        if (row == null) {
            row = sheet.createRow(rowIndex);
        }
        Cell cell = row.getCell(colIndex);
        if (cell == null) {
            cell = row.createCell(colIndex);
        }
        if (type == 0) {
            cell.setCellStyle(styles.get("header"));
            row.setHeightInPoints(40);
        }
        cell.setCellValue(val == null ? "" : val);
    }


    private static void createDataValidate(Sheet sheet, String formula, int validationType, int firstRow, int lastRow, int firstCol, int lastCol) {
        CellRangeAddressList cellRangeAddressList = new CellRangeAddressList(firstRow, lastRow, firstCol, lastCol);

        DataValidationHelper helper = sheet.getDataValidationHelper();
        //XSSFDataValidationHelper helper = new XSSFDataValidationHelper((XSSFSheet) sheet);
        XSSFDataValidationConstraint xssfDataValidationConstraint = new XSSFDataValidationConstraint(validationType, formula);
        DataValidation validation = helper.createValidation(xssfDataValidationConstraint, cellRangeAddressList);
        validation.createErrorBox("输入有误！", "请选择下拉菜单里面的选项！");
        validation.setEmptyCellAllowed(false);
        validation.setShowErrorBox(true);
        sheet.addValidationData(validation);
    }


    private static Map<String, CellStyle> createStyles(Workbook wb) {
        // 标题
        Map<String, CellStyle> styles = new HashMap<String, CellStyle>();
//        CellStyle style = wb.createCellStyle();
//        style.setAlignment(HorizontalAlignment.CENTER);
//        style.setVerticalAlignment(VerticalAlignment.CENTER);
//        Font titleFont = wb.createFont();
//        titleFont.setFontName("Arial");
//        titleFont.setFontHeightInPoints((short) 16);
//        titleFont.setBold(true);
//        style.setFont(titleFont);
//        style.setWrapText(true);
//        styles.put("title", style);
        // 表头
        CellStyle style = wb.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setBorderRight(BorderStyle.THIN);
        style.setRightBorderColor(IndexedColors.GREY_25_PERCENT.getIndex());
        style.setBorderLeft(BorderStyle.THIN);
        style.setLeftBorderColor(IndexedColors.GREY_25_PERCENT.getIndex());
        style.setBorderTop(BorderStyle.THIN);
        style.setTopBorderColor(IndexedColors.GREY_25_PERCENT.getIndex());
        style.setBorderBottom(BorderStyle.THIN);
        style.setBottomBorderColor(IndexedColors.GREY_25_PERCENT.getIndex());
        style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        Font headerFont = wb.createFont();
        headerFont.setFontName("Arial");
        headerFont.setFontHeightInPoints((short) 10);
        headerFont.setBold(true);
        headerFont.setColor(IndexedColors.WHITE.getIndex());
        style.setFont(headerFont);
        style.setWrapText(true);//换行
        styles.put("header", style);
        return styles;
    }

}
