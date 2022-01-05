package com.xiaocai.demo.excel;

import com.alibaba.excel.EasyExcel;
import com.xiaocai.demo.excel.bean.DemoData;
import com.xiaocai.demo.excel.bean.FillData;
import com.xiaocai.demo.excel.utils.TestFileUtil;


import com.alibaba.excel.util.MapUtils;
import org.junit.Test;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ EasyexcelWriteDemo ] 说明： 模板填充
 * @Function :  功能说明：无
 * @Date ：2021/12/15 13:33
 * @Version ： 1.0
 **/
public class EasyExcelFillDemo {

    /**
     * 最简单的填充
     *
     * @since 2.1.1
     */
    @Test
    public void simpleFill() {
        // 模板注意 用{} 来表示你要用的变量 如果本来就有"{","}" 特殊字符 用"\{","\}"代替
        String templateFileName =
                TestFileUtil.getPath() + "demo" + File.separator + "fill" + File.separator + "simple.xlsx";
        System.out.println("模板路径："+ templateFileName);

        String datetime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        // 方案1 根据对象填充
        String fileName = TestFileUtil.getPath() + "simpleFill01_" + datetime + ".xlsx";
        // 这里 会填充到第一个sheet， 然后文件流会自动关闭
        FillData fillData = new FillData();
        fillData.setName("张三");
        fillData.setNumber(5.2);
        EasyExcel.write(fileName).withTemplate(templateFileName).sheet().doFill(fillData);

        // 方案2 根据Map填充
        fileName = TestFileUtil.getPath() + "simpleFill02_" + datetime + ".xlsx";
        // 这里 会填充到第一个sheet， 然后文件流会自动关闭
        Map<String, Object> map = MapUtils.newHashMap();
        map.put("name", "张三");
        map.put("number", 5.2);
        EasyExcel.write(fileName).withTemplate(templateFileName).sheet().doFill(map);
    }

    private List data() {
        final List result = new ArrayList();
        DemoData demoData = null;
        for (int i = 0; i < 10; i++) {
            demoData = new DemoData();
            demoData.setName("zzy0"+i);
            demoData.setComment("这个是注释0"+i);
            result.add(demoData);
        }
        return result;
    }
}
