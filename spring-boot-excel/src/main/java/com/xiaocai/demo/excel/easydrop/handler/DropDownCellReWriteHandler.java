package com.xiaocai.demo.excel.easydrop.handler;

import com.alibaba.excel.write.handler.SheetWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint;

import java.util.Arrays;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ DropDownCellReWriteHandler ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/10/24 13:51
 * @Version ： 1.0
 **/
public class DropDownCellReWriteHandler implements SheetWriteHandler {

    private Map<Integer, String[]> map = null;

    public DropDownCellReWriteHandler(Map<Integer, String[]> map) {
        this.map = map;
    }

    @Override
    public void beforeSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {
        int m = 0;
    }

    @Override
    public void afterSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {
        // 这里可以对cell进行任何操作
        Sheet sheet = writeSheetHolder.getSheet();
        DataValidationHelper helper = sheet.getDataValidationHelper();

        // 第二步：创建一个Sheet页
        String hiddenSheetName = "sheet1";
        Workbook workbook = writeWorkbookHolder.getWorkbook();
        Sheet sheet1 = workbook.createSheet(hiddenSheetName);
        // k 为存在下拉数据集的单元格下标 v为下拉数据集
        map.forEach((k, v) -> {
            String string = Arrays.deepToString(v);
            if (string.length() > 250) {
                //写入数据到新的sheet页
                Row row;
                for (int i = 0; i < v.length; i++) {
                    row = sheet1.createRow(i);
                    Cell cell = row.createCell(k);
                    cell.setCellValue(v[i]);
                }
                String strFormula = hiddenSheetName + "!$" + "B" + "$1:$" + "B" + "$" + v.length;
                XSSFDataValidationConstraint constraint = new XSSFDataValidationConstraint(DataValidationConstraint.ValidationType.LIST, strFormula);
                // 设置数据有效性加载在哪个单元格上,四个参数分别是：起始行、终止行、起始列、终止列
                CellRangeAddressList regions = new CellRangeAddressList(1, 65535, k, k);
                // 数据有效性对象
                DataValidation validation = helper.createValidation(constraint, regions);
                // 阻止输入非下拉选项的值
                validation.setErrorStyle(DataValidation.ErrorStyle.STOP);
                validation.setShowErrorBox(true);
                validation.setSuppressDropDownArrow(true);
                validation.createErrorBox("提示", "此值与单元格定义格式不一致");
                sheet.addValidationData(validation);
                //隐藏新创建的sheet  调试的时候可以放开
                //workbook.setSheetHidden(workbook.getSheetIndex(workbook.getSheet(hiddenSheetName)), true);
            } else {
                // 下拉列表约束数据
                DataValidationConstraint constraint = helper.createExplicitListConstraint(v);
                // 设置下拉单元格的首行 末行 首列 末列
                CellRangeAddressList rangeList = new CellRangeAddressList(1, 65536, k, k);
                // 设置约束
                DataValidation validation = helper.createValidation(constraint, rangeList);
                // 阻止输入非下拉选项的值
                validation.setErrorStyle(DataValidation.ErrorStyle.STOP);
                validation.setShowErrorBox(true);
                validation.setSuppressDropDownArrow(true);
                validation.createErrorBox("提示", "此值与单元格定义格式不一致");
                sheet.addValidationData(validation);
            }
        });
    }
}
