package com.xiaocai.demo.excel.easydrop.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.google.common.collect.Lists;
import com.xiaocai.demo.excel.easydrop.annotation.DropDownSetField;
import com.xiaocai.demo.excel.easydrop.handler.DropDownCascadeReWriteHandler;
import com.xiaocai.demo.excel.easydrop.handler.DropDownCellReWriteHandler;
import com.xiaocai.demo.excel.easydrop.handler.GxDetailExcelStyleHandler;
import com.xiaocai.demo.excel.easydrop.service.EasyDropService;
import com.xiaocai.demo.excel.easydrop.util.ResoveDropAnnotationUtil;
import com.xiaocai.demo.excel.easydrop.vo.GXDetailListLogVO;
import com.xiaocai.demo.excel.easydrop.vo.GXDetailListVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ EasyDropService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/10/24 10:54
 * @Version ： 1.0
 **/

@Slf4j
@Service
public class EasyDropServiceImpl implements EasyDropService  {

    @Override
    public void exportDetailListTemplate(HttpServletResponse response) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String format = sdf.format(new Date());
        String fileName = format + "共享清单导入模板";
        exportExcel(fileName, response, null, 0);
    }

    /**
     * 导出excel
     *
     * @param fileName
     * @param response
     * @param data
     * @param flag     0 导出模板，1 导出错误信息，2 导出数据
     * @throws IOException
     */
    private void exportExcel(String fileName, HttpServletResponse response, List<GXDetailListVO> data, int flag) throws IOException {
        prepareResponds(fileName, response);
        ServletOutputStream outputStream = response.getOutputStream();
        // 获取改类声明的所有字段
        Field[] allFields = GXDetailListVO.class.getDeclaredFields();
        List<Field> fields = Arrays.stream(allFields).filter(p->p.getAnnotation(ExcelProperty.class) != null).collect(Collectors.toList());
        // 响应字段对应的下拉集合
        Map<Integer, String[]> map = new HashMap<>();
        Field field = null;


        Map<Integer ,Map<String, List<String>>> caseCadeMap = new HashMap<>();
        Map<Integer ,Field> fieldMap = new HashMap<>();

        // 循环判断哪些字段有下拉数据集，并获取
        for (int i = 0; i < fields.size(); i++) {
            field = fields.get(i);
            // 解析注解信息
            DropDownSetField dropDownSetField = field.getAnnotation(DropDownSetField.class);
            if (null != dropDownSetField) {
                log.info("下拉字段：" +field.getName());
                if (!"".equals(dropDownSetField.methodName())){
                    Map<String, List<String>> sourceMap = ResoveDropAnnotationUtil.resoveMethod(dropDownSetField);
                    if (null != sourceMap) {
                        caseCadeMap.put(i, sourceMap);
                        fieldMap.put(i, field);
                    }
                }else {
                    String[] sources = ResoveDropAnnotationUtil.resove(dropDownSetField);
                    if (null != sources && sources.length > 0) {
                        map.put(i, sources);
                    }
                }
            }
        }
        //多个sheet页写入
        ExcelWriterBuilder builder = new ExcelWriterBuilder();
        builder.autoCloseStream(true);
        if (flag == 0 || flag == 2) {
            List<Integer> columns = Lists.newArrayList();
            columns.add(0);
            columns.add(1);
            builder.registerWriteHandler(new GxDetailExcelStyleHandler(Lists.newArrayList(20), columns, null));
            builder.head(GXDetailListVO.class);
        } else {
            builder.registerWriteHandler(new GxDetailExcelStyleHandler(null, null, null));
            builder.head(GXDetailListLogVO.class);
        }
        WriteSheet sheet1 = EasyExcel.writerSheet(0, "共享明细清单").build();
        builder.registerWriteHandler(new DropDownCellReWriteHandler(map));
        builder.registerWriteHandler(new DropDownCascadeReWriteHandler(fields, fieldMap, caseCadeMap));
        builder.file(outputStream);
        builder.excelType(ExcelTypeEnum.XLSX);
        ExcelWriter writer = builder.build();

        writer.write(data, sheet1);
        writer.finish();
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
}
