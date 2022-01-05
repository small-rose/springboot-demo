package com.xiaocai.demo.excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.util.ListUtils;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.xiaocai.demo.excel.bean.FillData;
import com.xiaocai.demo.excel.utils.TestFileUtil;
import org.junit.Test;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ EasyExcelListFillDemo ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/15 14:21
 * @Version ： 1.0
 **/
public class EasyExcelListFillDemo {

    /**
     * 填充列表
     *
     * @since 2.1.1
     */
    @Test
    public void listFill() {
        // 模板注意 用{} 来表示你要用的变量 如果本来就有"{","}" 特殊字符 用"\{","\}"代替
        // 填充list 的时候还要注意 模板中{.} 多了个点 表示list
        String templateFileName =
                TestFileUtil.getPath() + "demo" + File.separator + "fill" + File.separator + "list.xlsx";

        String datetime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));

        // 方案1 一下子全部放到内存里面 并填充
        String fileName = TestFileUtil.getPath() + "listFill01_" + datetime + ".xlsx";
        // 这里 会填充到第一个sheet， 然后文件流会自动关闭
        EasyExcel.write(fileName).withTemplate(templateFileName).sheet().doFill(data());

        datetime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        // 方案2 分多次 填充 会使用文件缓存（省内存） jdk8
        // since: 3.0.0-beta1
        fileName = TestFileUtil.getPath() + "listFill02_" + datetime + ".xlsx";
        EasyExcel.write(fileName)
                .withTemplate(templateFileName)
                .sheet()
                .doFill(() -> {
                    // 分页查询数据
                    return data();
                });

        // 方案3 分多次 填充 会使用文件缓存（省内存）
        fileName = TestFileUtil.getPath() + "listFill" + System.currentTimeMillis() + ".xlsx";
        ExcelWriter excelWriter = EasyExcel.write(fileName).withTemplate(templateFileName).build();
        WriteSheet writeSheet = EasyExcel.writerSheet().build();
        excelWriter.fill(data(), writeSheet);
        excelWriter.fill(data(), writeSheet);
        // 千万别忘记关闭流
        excelWriter.finish();
    }

    private List<FillData> data() {
        List<FillData> list = ListUtils.newArrayList();
        for (int i = 0; i < 10; i++) {
            FillData fillData = new FillData();
            list.add(fillData);
            fillData.setName("张三"+i);
            fillData.setNumber(5.2+i);
            fillData.setDate(new Date());
        }
        return list;
    }

}
