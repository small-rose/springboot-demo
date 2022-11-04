package com.xiaocai.demo.excel.easydrop.handler;

import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.util.StyleUtil;
import com.alibaba.excel.write.handler.CellWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.metadata.style.WriteFont;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.HashMap;
import java.util.List;

public class GxDetailExcelStyleHandler implements CellWriteHandler {


    private List<Integer> columnList;

    private List<Integer> columnLockedList;

    /**
     * 样式类
     */
    private CellStyle cellStyle;

    //颜色
    private Short colorIndex;

    /**
     * 隐藏索引数
     */
    private List<Integer> hiddenIndices;

    // 批注<列的下标,批注内容>
    private HashMap<Integer, String> annotationsMap;

    public GxDetailExcelStyleHandler(List<Integer> hiddenIndices, List<Integer> columnList, List<Integer> columnLockedList) {
        this.hiddenIndices = hiddenIndices;
        this.columnList = columnList;
        this.columnLockedList = columnLockedList;
    }

    public GxDetailExcelStyleHandler(List<Integer> hiddenIndices, Short colorIndex) {
        this.hiddenIndices = hiddenIndices;
        this.colorIndex = colorIndex;
    }

    @Override
    public void beforeCellCreate(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Row row, Head head, Integer integer, Integer integer1, Boolean aBoolean) {
        cellStyle = writeSheetHolder.getSheet().getWorkbook().createCellStyle();
    }

    @Override
    public void afterCellCreate(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Cell cell, Head head, Integer integer, Boolean aBoolean) {
        cellStyle.setLocked(false);
        cell.setCellStyle(cellStyle);

        if (!CollectionUtils.isEmpty(hiddenIndices) && hiddenIndices.contains(cell.getColumnIndex())) {
            // 设置隐藏列
            writeSheetHolder.getSheet().setColumnHidden(cell.getColumnIndex(), true);
        }

        if (!CollectionUtils.isEmpty(columnLockedList) && columnLockedList.contains(cell.getColumnIndex())) {
            writeSheetHolder.getSheet().protectSheet("password");
            this.cellStyle.setLocked(true);
//            writeSheetHolder.getSheet().createFreezePane(0,0);
//            writeSheetHolder.getSheet().createFreezePane(1,0);
//            writeSheetHolder.getSheet().createFreezePane(0,1,0,1);
        }
        // 填充单元格样式
        cell.setCellStyle(this.cellStyle);
    }

    @Override
    public void afterCellDataConverted(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, CellData cellData, Cell cell, Head head, Integer integer, Boolean aBoolean) {
        int m = 0;
    }

    @Override
    public void afterCellDispose(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, List<CellData> list, Cell cell, Head head, Integer integer, Boolean aBoolean) {
        // 设置列宽
        Sheet sheet = writeSheetHolder.getSheet();
        sheet.setColumnWidth(cell.getColumnIndex(), 25 * 256);
        sheet.getRow(0).setHeight((short) (1.8 * 256));
        Workbook workbook = writeSheetHolder.getSheet().getWorkbook();
        Drawing<?> drawing = sheet.createDrawingPatriarch();

        // 设置标题字体样式
        WriteCellStyle headWriteCellStyle = new WriteCellStyle();
        WriteFont headWriteFont = new WriteFont();
        headWriteFont.setFontName("宋体");
        headWriteFont.setFontHeightInPoints((short) 14);
        headWriteFont.setBold(true);
        if ((cell.getColumnIndex() == 2 || cell.getColumnIndex() == 3 || cell.getColumnIndex() == 4) && cell.getRowIndex() == 0) {
            // 设置字体颜色
            headWriteFont.setColor(IndexedColors.RED.getIndex());
        }
        headWriteCellStyle.setWriteFont(headWriteFont);
        headWriteCellStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
        CellStyle cellstyle = StyleUtil.buildHeadCellStyle(workbook, headWriteCellStyle);
        cell.setCellStyle(cellstyle);

        if (cell.getColumnIndex() == 1) {

            if (cell.getRowIndex() == 0) {
//            CellStyle cellStyle = workbook.createCellStyle();
                cellstyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
                cellstyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                cell.setCellStyle(cellstyle);
                sheet.setDefaultColumnStyle(1, cellstyle);
            }else{


                cellstyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
                cellstyle.setFillPattern(FillPatternType.NO_FILL);
                cell.setCellStyle(cellstyle);
                sheet.setDefaultColumnStyle(1, cellstyle);
            }
        }

    }


    /**
     * rgb转int
     */
    private static int getIntFromColor(int Red, int Green, int Blue) {
        Red = (Red << 16) & 0x00FF0000;
        Green = (Green << 8) & 0x0000FF00;
        Blue = Blue & 0x000000FF;
        return 0xFF000000 | Red | Green | Blue;
    }

    /**
     * int转byte[]
     */
    public static byte[] intToByteArray(int i) {
        byte[] result = new byte[4];
        result[0] = (byte) ((i >> 24) & 0xFF);
        result[1] = (byte) ((i >> 16) & 0xFF);
        result[2] = (byte) ((i >> 8) & 0xFF);
        result[3] = (byte) (i & 0xFF);
        return result;
    }


}
