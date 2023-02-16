package com.small.o2o.comp.module.excel;

import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.handler.AbstractCellWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;

import java.util.List;

public class CheckCellHandler  extends AbstractCellWriteHandler {

    List<String> whiteList ;
    CellStyle cellStyle = null;
    CellStyle whiteCellStyle = null;

    public CheckCellHandler(List<String> whiteList) {
        this.whiteList = whiteList;
    }

    @Override
    public void afterCellDispose(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder,
                                 List<CellData> cellDataList, Cell cell, Head head, Integer relativeRowIndex, Boolean isHead)
    {
        String sheetName = writeSheetHolder.getSheetName();
        switch (sheetName){
            case  "表索引" :
                compareTableIndex(cell);
                break;
            case  "表主键" :
                compareTablePrimaryKey(cell);
                break;
            case  "表信息" :
                compareTable(cell);
                break;
            case  "表对应的列" :
                compareTableColumn(cell);
                break;
            case  "函数" :
                comparePackage(cell);
                break;
            case  "存储过程" :
                comparePackage(cell);
                break;
            case  "存过包" :
                comparePackage(cell);
                break;
            case  "ORA表主键" :
                pkDDLFunction(cell);
                break;
            default:
        }
        if (cellStyle ==null) {
            cellStyle = cell.getSheet().getWorkbook().createCellStyle();

            //设置边框
            cellStyle.setBorderBottom(BorderStyle.THIN);
            cellStyle.setBorderLeft(BorderStyle.THIN);
            cellStyle.setBorderRight(BorderStyle.THIN);
            cellStyle.setBorderTop(BorderStyle.THIN);
        }

        cell.setCellStyle(cellStyle);

    }

    //

    private void pkDDLFunction(Cell cell) {
        if (cell.getRowIndex() >= 1 && 4 == cell.getColumnIndex() ) {
            // 总价 = 含税单价 * 数量
            // 以第4行数据为例：税价 = C5*D5
            int actualCellRowNum = cell.getRowIndex() + 1;
            String cake = "=\"ALTER TABLE \"&B2&\" DROP CONSTRAINT \"&C2&\"; ALTER TABLE \"&B2&\" ADD CONSTRAINT \"&C2&\" PRIMARY KEY( \"&D2&\");\"";
            cake = cake.replaceAll("2",  String.valueOf(cell.getRowIndex()+1));
            cell.setCellFormula(cake);
            //System.out.println("第" +  cell.getRowIndex() + "行,第" + cell.getColumnIndex() + "表对比写入公式完成");
        }
    }
    private void compareFunction(Cell cell) {
        if (cell.getRowIndex() >= 1 && 10 == cell.getColumnIndex() ) {
            // 总价 = 含税单价 * 数量
            // 以第4行数据为例：税价 = C5*D5
            int actualCellRowNum = cell.getRowIndex() + 1;
            String cake = "=IF(D2<>I2,\"异常\",IF(E2<>J2,\"异常\",\"正常\"))";
            cake = cake.replaceAll("2",  String.valueOf(cell.getRowIndex()+1));
            cell.setCellFormula(cake);
            //System.out.println("第" +  cell.getRowIndex() + "行,第" + cell.getColumnIndex() + "表对比写入公式完成");
        }
    }
    private void comparePackage(Cell cell) {
        if (cell.getRowIndex() >= 1 && 10 == cell.getColumnIndex() ) {
            // 总价 = 含税单价 * 数量
            // 以第4行数据为例：税价 = C5*D5
            int actualCellRowNum = cell.getRowIndex() + 1;
            String cake = "=IF(D2<>I2,\"异常\",IF(E2<>J2,\"异常\",\"正常\"))";
            cake = cake.replaceAll("2",  String.valueOf(cell.getRowIndex()+1));
            cell.setCellFormula(cake);
            //System.out.println("第" +  cell.getRowIndex() + "行,第" + cell.getColumnIndex() + "表对比写入公式完成");
        }
    }

    private void compareTablePrimaryKey(Cell cell) {
        if (cell.getRowIndex() >= 1 && 8 == cell.getColumnIndex() ) {
            // 总价 = 含税单价 * 数量
            // 以第4行数据为例：税价 = C5*D5
            int actualCellRowNum = cell.getRowIndex() + 1;
            String cake = "=IF(B2<>F2,\"异常\",IF(C2<>G2,\"异常\",IF(D2<>H2,\"异常\",\"正常\")))";
            cake = cake.replaceAll("2",  String.valueOf(cell.getRowIndex()+1));
            cell.setCellFormula(cake);
            //System.out.println("第" +  cell.getRowIndex() + "行,第" + cell.getColumnIndex() + "表对比写入公式完成");
        }
    }

    private void compareTableIndex(Cell cell) {
        if (cell.getRowIndex() >= 1 && 12 == cell.getColumnIndex() ) {
            // 总价 = 含税单价 * 数量
            // 以第4行数据为例：税价 = C5*D5
            int actualCellRowNum = cell.getRowIndex() + 1;
            String cake = "=IF(B2<>H2,\"异常\",IF(C2<>I2,\"异常\",IF(D2<>J2,\"异常\",IF(E2<>K2,\"异常\",IF(F2<>L2,\"异常\",\"正常\")))))";
            cake = cake.replaceAll("2",  String.valueOf(cell.getRowIndex()+1));
            cell.setCellFormula(cake);
            //System.out.println("第" +  cell.getRowIndex() + "行,第" + cell.getColumnIndex() + "表对比写入公式完成");
        }
    }

    private void compareTableColumn(Cell cell) {

         if (cell.getRowIndex() >= 1 && 8 <= cell.getColumnIndex() && 12 <= cell.getColumnIndex()) {
            String tabName = cell.getStringCellValue();
            if (whiteList.contains(tabName)){
                if (whiteCellStyle==null) {
                    whiteCellStyle = cell.getSheet().getWorkbook().createCellStyle();
                    //设置边框
                    whiteCellStyle.cloneStyleFrom(cellStyle);
                    whiteCellStyle.setFillForegroundColor(IndexedColors.GREEN.getIndex());
                    whiteCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                }
                 cell.setCellStyle(whiteCellStyle);
            }
            // cell.setCellStyle(whiteCellStyle);
        }

        if (cell.getRowIndex() >= 1 && 12 == cell.getColumnIndex()) {
            // 总价 = 含税单价 * 数量
            // 以第4行数据为例：税价 = C5*D5
            int actualCellRowNum = cell.getRowIndex() + 1;
            //and(a1>20,a2<30)
            //String cake = "IF(C2<>I2,\"异常\",IF(D2<>J2,\"异常\",IF(E2<>K2,\"异常\",IF(F2=L2,\"正常\",IF(F2<L2,\"异常\",\"正常\")))))";
            String cake = "IF(C2<>I2,\"异常\",IF(D2<>J2,\"异常\",IF(E2<>K2,\"异常\",IF(F2<>L2,\"异常\",\"正常\"))))";
            cake = cake.replaceAll("2",  String.valueOf(cell.getRowIndex()+1));
            cell.setCellFormula(cake);
            //System.out.println("第" +  cell.getRowIndex() + "行,第" + cell.getColumnIndex() + "表的列对比写入公式完成");
        }
    }

    private void compareTable(Cell cell) {
         /*if (cell.getRowIndex() >= 1 && 8 == cell.getColumnIndex() ) {
            String tabName = cell.getStringCellValue();
            if (whiteList.contains(tabName)){
                if (whiteCellStyle==null) {
                    whiteCellStyle = cell.getSheet().getWorkbook().createCellStyle();
                    //设置边框
                    whiteCellStyle.cloneStyleFrom(cellStyle);
                    whiteCellStyle.setFillForegroundColor(IndexedColors.GREEN.getIndex());
                    whiteCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                }
                cell.setCellStyle(whiteCellStyle);
            }
            //cell.setCellStyle(whiteCellStyle);
        }*/
        if (cell.getRowIndex() >= 1 && 12 == cell.getColumnIndex() ) {
            // 总价 = 含税单价 * 数量
            // 以第4行数据为例：税价 = C5*D5
            int actualCellRowNum = cell.getRowIndex() + 1;
            String cake = "=IF(C2<>I2,\"异常\",IF(E2<>K2,\"异常\",\"正常\"))";
            cake = cake.replaceAll("2",  String.valueOf(cell.getRowIndex()+1));
            cell.setCellFormula(cake);
            //System.out.println("第" +  cell.getRowIndex() + "行,第" + cell.getColumnIndex() + "表对比写入公式完成");
        }
    }
}
