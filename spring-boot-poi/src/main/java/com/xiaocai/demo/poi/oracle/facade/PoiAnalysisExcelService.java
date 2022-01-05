package com.xiaocai.demo.poi.oracle.facade;

import com.xiaocai.demo.poi.oracle.vo.TableInfo;
import com.xiaocai.demo.poi.utils.FileUtils;
import com.xiaocai.demo.poi.utils.PoiExcel07Util;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import static com.xiaocai.demo.poi.oracle.facade.PoiAnalysisExcelService.Options.COMMENT_TABLE;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ PoiAnalysisExcelService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/20 17:57
 * @Version ： 1.0
 **/
@Service
@Slf4j
public class PoiAnalysisExcelService {

    /**
     * 删除表
     */
    private static final String DROP_TABLE_SQL = "DROP TABLE  %s ;";

    /**
     * ALTER 改字段
     * tableName,  columnName,  dataType, dataDefault,  not null,  column comment
     */
    private static final String ALTER_COMMENT_SQL = "ALTER TABLE %s MODIFY  %s  %s  %s %s  ; ";


    /**
     * 组成批量改表字段-如类型、长度、注释
     */
    private static final String ALTER_SQL_HEAD = "ALTER TABLE %s MODIFY (";
    /**
     * columnName,  dataType, dataDefault,  not null,  column comment,  逗号
     */
    private static final String ALTER_SQL_BODY = "%s  %s  %s %s COMMENT '%s' %s";

    private static final String ALTER_SQL_TAIL = ");";

    /**
     *  添加表注释
     */
    private static final String COMMENT_TABLE_SQL = "COMMENT ON TABLE %s IS  '%s';";
    /**
     * 添加字段注释
     */
    private static final String COMMENT_COLUMN_SQL = "COMMENT ON COLUMN %s.%s\n" +
            "  IS '%s';" ;


    public void analysisExcel(String fileName, String sqlFile) throws Exception {

        File file = new File(fileName);
        String excelName = file.getName();
        FileInputStream inputStream = new FileInputStream(file);
        //获取工作簿
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        XSSFRow row =  null;
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rowNum = sheet.getLastRowNum();
        String tableName = "", tableComment = "", option = "", sql = "" ;
        // 解析表信息
        for (int i = 4; i < rowNum; i++) {
            row = sheet.getRow(i);
            tableName = row.getCell(9).getStringCellValue();
            tableComment = row.getCell(10 ).getStringCellValue();
            option = row.getCell(15 ).getStringCellValue();
            if (Options.DO_NOTHING.equals(option) || StringUtils.isEmpty(option)) {
                continue;
            }
            log.info("处理表---tableName ：" + tableName + ", option ："+option);

            // 删表
            if (Options.DROP_TABLE.equals(option)) {
                sql = String.format(DROP_TABLE_SQL, tableName);
                FileUtils.Write(sqlFile, sql);
            }else if (COMMENT_TABLE.equals(option)){
                sql = String.format(COMMENT_TABLE_SQL, tableName, tableComment);
                FileUtils.Write(sqlFile, sql);
            }else if (Options.COMMENT_TABLE_COLUMN.equals(option)){
                sql = String.format(COMMENT_TABLE_SQL, tableName, tableComment);
                FileUtils.Write(sqlFile, sql);
                appendCommentSQL(sqlFile, workbook, tableName);
            }else if (Options.UPDATE_TABLE_COLUMN.equals(option)){
                // 修改表注释
                sql = String.format(COMMENT_TABLE_SQL, tableName, tableComment);
                FileUtils.Write(sqlFile, sql);
                // 单个字段修改模式
                appendSheetComment(sqlFile, workbook, tableName);
                // 修改加字段注释
                appendCommentSQL(sqlFile, workbook, tableName);
                // 合并模式
                //appendAlterCommentSQL(sqlFile, workbook, tableName);
            }else{
                log.info("不能识别的标记---tableName ：" + tableName + ", option ："+option);
            }
        }

        inputStream.close();
    }

    /**
     * 仅追加注释
     * @param sqlFile
     * @param workbook
     * @param tableName
     */
    private void appendCommentSQL(String sqlFile, XSSFWorkbook workbook, String tableName) {
        XSSFSheet sheet = workbook.getSheet(tableName);
        int rowNum = sheet.getLastRowNum();
        String columnName = "", columnComment = "",sql = "";
        XSSFRow row = null;
        for (int r = 2; r < rowNum; r++) {
            row = sheet.getRow(r);

            columnName = row.getCell(0).getStringCellValue();
            if (StringUtils.isEmpty(columnName)){
                break;
            }
            columnComment = row.getCell(3).getStringCellValue();
            sql = String.format(COMMENT_COLUMN_SQL, tableName, columnName, columnComment);
            FileUtils.Write(sqlFile, sql);
        }
        log.info("Table "+tableName+"'s columns append only comments  success ! ");
    }

    private void appendSheetComment(String sqlFile, XSSFWorkbook workbook, String tableName) {

        XSSFSheet sheet = workbook.getSheet(tableName);
        int rowNum = sheet.getLastRowNum();
        String columnName = "", columnComment = "", dataType = "",
                defaultValue = "", isNull="", sql = "";
        XSSFRow row = null;
        for (int r = 2; r < rowNum; r++) {
            row = sheet.getRow(r);

            if (StringUtils.isEmpty(row.getCell(0))){
                break;
            }
            columnName = row.getCell(0).getStringCellValue();
            dataType = row.getCell(1).getStringCellValue();
            columnComment = row.getCell(3).getStringCellValue();
            defaultValue = row.getCell(5).getStringCellValue();
            isNull = row.getCell(6).getStringCellValue();
            sql = String.format(ALTER_COMMENT_SQL, tableName, columnName, dataType, defaultValue, isNull, columnComment);
            FileUtils.Write(sqlFile, sql);
        }
        log.info("Table "+tableName+"'s columns comment generated success ! ");
    }

    private void appendAlterCommentSQL(String sqlFile, XSSFWorkbook workbook, String tableName) {

        XSSFSheet sheet = workbook.getSheet(tableName);
        int rowNum = sheet.getLastRowNum();
        String columnName = "", columnComment = "", dataType = "",
                defaultValue = "", isNull="", sql = "", nextColumnName = "";
        XSSFRow row = null;

        FileUtils.Write(sqlFile, ALTER_SQL_HEAD);
        for (int r = 2; r < rowNum; r++) {
            row = sheet.getRow(r);

            if (StringUtils.isEmpty(row.getCell(0))){
                break;
            }
            nextColumnName = sheet.getRow(r+1).getCell(0).getStringCellValue();;

            columnName = row.getCell(0).getStringCellValue();
            dataType = row.getCell(1).getStringCellValue();
            columnComment = row.getCell(2).getStringCellValue();
            defaultValue = row.getCell(5).getStringCellValue();
            isNull = row.getCell(6).getStringCellValue();

            if (StringUtils.isEmpty(nextColumnName)){
                sql = String.format(ALTER_SQL_BODY, columnName, dataType, defaultValue, isNull, columnComment, "");
            }else{
                sql = String.format(ALTER_SQL_BODY, columnName, dataType, defaultValue, isNull, columnComment, ",");
            }
            FileUtils.Write(sqlFile, sql);
        }
        FileUtils.Write(sqlFile, ALTER_SQL_TAIL);
        log.info("Table "+tableName+"'s columns comment generated success ! ");
    }


    class Options{

        public static final String DO_NOTHING = "0";
        public static final String DROP_TABLE = "1";
        public static final String COMMENT_TABLE = "2";
        public static final String COMMENT_TABLE_COLUMN = "3";
        public static final String UPDATE_TABLE_COLUMN = "4";
    }
}
