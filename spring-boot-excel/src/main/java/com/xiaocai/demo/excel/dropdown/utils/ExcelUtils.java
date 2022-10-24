package com.xiaocai.demo.excel.dropdown.utils;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.xiaocai.demo.excel.dropdown.annotation.ExcelDropDown;
import com.xiaocai.demo.excel.dropdown.annotation.ExcelFile;
import com.xiaocai.demo.excel.dropdown.service.RenewalSubDropDownImpl;
import com.xiaocai.demo.excel.dropdown.vo.ImportRenewalVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint;
import org.apache.poi.xssf.usermodel.XSSFDataValidationHelper;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.BindException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Project : businessVehicleIntelligent
 * @Author : zengfangling
 * @Description : [ ExcelUtils ] 说明：无
 * @Function :  功能说明：无
 * @Date : 2022/10/10 18:06
 * @Version ： 1.0
 **/
@Slf4j
public class ExcelUtils {

    /**
     * 样式列表
     */
    private static Map<String, CellStyle> styles;


    //直接下载文件到本地
    public static void createExcel(Object object, String title, Map<String, Boolean> dynamicMap, Map<String, Object> params) throws IOException {
        createExcel(null, object, title, dynamicMap, params);
    }

    /**
     *  直接返回文件流到前端
     * @param response
     * @param object 实体对象
     * @param title 文件表标题
     * @param dynamicMap 需要动态展示的数据
     * @param params 接口的参数
     * @throws IOException
     */
    public static void createExcel(HttpServletResponse response, Object object, String title, Map<String, Boolean> dynamicMap, Map<String, Object> params) throws IOException {
        // 获取改类声明的所有字段
        Field[] allFields = ImportRenewalVo.class.getDeclaredFields();
        List<Field> fields = Arrays.stream(allFields).filter(p->p.getAnnotation(ExcelProperty.class) != null).collect(Collectors.toList());

//        // 取到模板上的所有对象属性
//        Class<?> clazz = object.getClass();
//        List<Field> tempFields = new ArrayList<>();
//        tempFields.addAll(Arrays.asList(clazz.getSuperclass().getDeclaredFields()));
//        tempFields.addAll(Arrays.asList(clazz.getDeclaredFields()));

        //得到所有的字段名和模板名
        List<NameMapping> list = new ArrayList<>(16);
        //得到当前需要导出的列注解
        for (Field field : fields) {
            if (field.isAnnotationPresent(ExcelProperty.class)) {
                ExcelProperty attr = field.getAnnotation(ExcelProperty.class);
                ExcelDropDown att = field.getAnnotation(ExcelDropDown.class);
                if (attr != null) {
                    field.setAccessible(true);
//                    if (null != dynamicMap) {
//                        Boolean bl = dynamicMap.get(field.getName());
//                        if (attr.dynamic() && bl != null && !bl) {//支持动态，且为动态
//                            continue;
//                        }
//                    }
                    list.add(new NameMapping(field.getName(), attr,att));
                }
            }
        }
        log.info("{}",list);
        //将数据按order升序
//        list = list.stream().sorted(Comparator.comparing(x -> x.getExcel().order())).collect(Collectors.toList());
        //所有的参数顺序
        List<String> fieldList = list.stream().map(NameMapping::getFieldName).collect(Collectors.toList());
        //方法的参数
        if (params == null) {
            params = new HashMap<>(1);
        }
        boolean annotationPresent = ImportRenewalVo.class.isAnnotationPresent(ExcelFile.class);
        if (!annotationPresent) {
            throw new RuntimeException("不存在ExcelFile注解，不能生成Excel！");
        }
        ExcelFile excelFile = ImportRenewalVo.class.getAnnotation(ExcelFile.class);
        // 创建excel
        //Workbook workbook = WorkbookFactory.create(true);
        Workbook workbook = null;
        try {
            workbook = WorkbookFactory.create(new File("d:/temp.xlsx"));
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }

        // 创建excel页
        Sheet sheet = workbook.createSheet(excelFile.sheetName());
        // 创建数据页
        Sheet dataSheet = null;
        if (excelFile.enableDataValidation()) {
            // 创建数据页
            dataSheet = workbook.createSheet(excelFile.dataSheetName());
            // 设置隐藏属性
            //workbook.setSheetHidden(workbook.getSheetIndex(dataSheet), excelFile.datasheetHidden());
        }
        Map<String, Field> fieldMap = ReflectionUtil.getFieldMap(object);
        int rowIndex = 0, colIndex = 0;
        styles = createStyles(workbook);
//        //标题
//        Row titleRow = sheet.createRow(rowIndex);
//        titleRow.setHeightInPoints(50);
//        Cell titleCell = titleRow.createCell(0);
//        titleCell.setCellValue(title);
//        titleCell.setCellStyle(styles.get("title"));
//        sheet.addMergedRegion(new CellRangeAddress(titleRow.getRowNum(), titleRow.getRowNum(), titleRow.getRowNum(), list.size() - 1));
//        ++rowIndex;
        //创建表头和下拉
        for (NameMapping nameMapping : list) {
            String fieldName = nameMapping.getFieldName();
            ExcelDropDown excel = null;
            if(null != nameMapping.getExcel()){
                excel = nameMapping.getExcel();
                sheet.setColumnWidth(colIndex, excel.columnWidth());
            }
            log.info("输出excel：{}",excel);
            //创建级联的下拉
            if (excelFile.enableDataValidation() && excel != null) {
                log.info("级联下拉框开始！");
                createColumnValidation(fieldList, excel, fieldMap.get(fieldName), workbook, sheet, dataSheet, colIndex, params);
            }
            //创建表头
            ExcelProperty excelProperty = nameMapping.getExcelProperty();
            log.info("表头名称：{}",  excelProperty.value());
            String[] value = excelProperty.value();
            log.info("数组第一个:{}",value[0]);
            createCell(0, sheet, rowIndex, colIndex++, value[0]);
        }

        if(null != response){
            prepareResponds(excelFile.fileName(),response);
            try {
                workbook.write(response.getOutputStream());
            } catch (Exception e) {
                throw new BindException( e.getMessage());
            } finally {
                IOUtils.closeQuietly(workbook);
            }
        }else{
            FileOutputStream out = new FileOutputStream(excelFile.fileName());
            workbook.write(out);
            out.close();
        }

//        if (null != response) {
//            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
//            response.setCharacterEncoding("utf-8");
//            response.setHeader("Access-Control-Expose-Headers", "Content-Disposition");
//            response.setHeader("Content-Disposition", "attachment;filename=" + new String(URLEncoder.encode(excelFile.fileName(), "utf-8")));
//            response.setHeader("Access-Control-Allow-Origin", "*");
//            try {
//                workbook.write(response.getOutputStream());
//            } catch (Exception e) {
//                throw new BindException( e.getMessage());
//            } finally {
//                IOUtils.closeQuietly(workbook);
//            }
//        } else {
//            //若需要生成指定文件路径，在这里自定义即可
//            FileOutputStream out = new FileOutputStream(excelFile.fileName());
//            workbook.write(out);
//            out.close();
//        }

    }

    /**
     * 将文件输出到浏览器(导出)
     */
    private static void prepareResponds(String fileName, HttpServletResponse response) throws IOException {
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        fileName = URLEncoder.encode(fileName, "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename*=utf-8'zh_cn'" + fileName + ExcelTypeEnum.XLSX.getValue());
    }


    private static void createColumnValidation(List<String> fieldList, ExcelDropDown value, Field field, Workbook workbook, Sheet sheet, Sheet dataSheet, int colIndex,
                                               Map<String, Object> params) {
        if (field == null || dataSheet == null) {
            return;
        }
        field.setAccessible(true);
        String datasourceMethod = value.datasourceMethod();
        if ("".equals(datasourceMethod)) {
            return;
        }
        Object invoke;
        try {
            invoke = ReflectionUtil.getMethod(datasourceMethod, new RenewalSubDropDownImpl(), params);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            return;
        }

        String formulaIndirectFormat = "=INDIRECT(%s!$%s$%s)";
        // 判断是否有前置字段
        if (StringUtils.isBlank(value.beforeFieldName())) {
            if (!(invoke instanceof Collection)) {
                return;
            }
            Collection collection = (Collection) invoke;
            //创建下拉的名称管理器
            int nameManage = createNameManage(workbook, dataSheet, field.getName(), collection);
            System.out.println("nameManage " + nameManage);
            String formulaIndirect = String.format(formulaIndirectFormat, dataSheet.getSheetName(), getCellColumnFlag(1), nameManage + 1);
            System.out.println("formulaIndirect " + formulaIndirect);
            createDataValidate(sheet, formulaIndirect, value.validationType(), value.firstRow(), value.lastRow(), colIndex, colIndex);
        } else {
            if (!(invoke instanceof Map)) {
                return;
            }
            Map<String, Collection> map = (Map<String, Collection>) invoke;
            map.forEach((k, v) -> {
                 createNameManage(workbook, dataSheet, k, v);
            });
            //得到前置字段在第几列
            int beforeColIndex = 0;
            for (int i = 0; i < fieldList.size(); i++) {
                if (fieldList.get(i).equals(value.beforeFieldName())) {
                    beforeColIndex = i;
                    break;
                }
            }
            for (int rowIndex = value.firstRow(); rowIndex <= value.lastRow(); rowIndex++) {
                String formulaIndirect = String.format(formulaIndirectFormat, sheet.getSheetName(), getCellColumnFlag(beforeColIndex + 1), rowIndex + 1);
                createDataValidate(sheet, formulaIndirect, value.validationType(), rowIndex, rowIndex, colIndex, colIndex);
            }
        }
    }

    private static void createDataValidate(Sheet sheet, String formula, int validationType, int firstRow, int lastRow, int firstCol, int lastCol) {
        CellRangeAddressList cellRangeAddressList = new CellRangeAddressList(firstRow, lastRow, firstCol, lastCol);
        XSSFDataValidationHelper xssfDataValidationHelper = new XSSFDataValidationHelper((XSSFSheet) sheet);
        XSSFDataValidationConstraint xssfDataValidationConstraint = new XSSFDataValidationConstraint(validationType, formula);
        DataValidation validation = xssfDataValidationHelper.createValidation(xssfDataValidationConstraint, cellRangeAddressList);
        validation.createErrorBox("输入有误！", "请选择下拉菜单里面的选项！");
        validation.setEmptyCellAllowed(false);
        validation.setShowErrorBox(true);
        sheet.addValidationData(validation);
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
        System.out.println("name = "+nameString);
        System.out.println("nameManageScope = "+nameManageScope);
        name.setRefersToFormula(nameManageScope);
        createCell(1, sheet, size, columnIndex, nameString);
        if (CollectionUtils.isNotEmpty(data)) {
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

    private static class NameMapping {
        private String fieldName;
        private ExcelDropDown excel;
        private ExcelProperty excelProperty;

//        public NameMapping(String fieldName, Excel excel) {
//            this.fieldName = fieldName;
//            this.excel = excel;
//        }

        public NameMapping(String fieldName, ExcelProperty excelProperty, ExcelDropDown excel) {
            this.fieldName = fieldName;
            this.excelProperty = excelProperty;
            this.excel = excel;
        }

        public String getFieldName() {
            return fieldName;
        }

        public void setFieldName(String fieldName) {
            this.fieldName = fieldName;
        }

        public ExcelDropDown getExcel() {
            return excel;
        }

        public void setExcel(ExcelDropDown excel) {
            this.excel = excel;
        }

        public ExcelProperty getExcelProperty() {
            return excelProperty;
        }

        public void setExcelProperty(ExcelProperty excelProperty) {
            this.excelProperty = excelProperty;
        }
    }
}
