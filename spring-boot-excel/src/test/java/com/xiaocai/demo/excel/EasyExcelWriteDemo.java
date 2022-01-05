package com.xiaocai.demo.excel;

import com.alibaba.excel.EasyExcel;
import com.xiaocai.demo.excel.bean.DemoData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ EasyexcelWriteDemo ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/15 13:33
 * @Version ： 1.0
 **/
public class EasyExcelWriteDemo {

    @Test
    public void simpleWrite() {
        String fileName = "D:\\onlyTest\\" + "write" + System.currentTimeMillis() + ".xlsx";
        // 这里 需要指定写用哪个class去读，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        // 如果这里想使用03 则 传入excelType参数即可
        EasyExcel.write(fileName, DemoData.class).sheet("模板").doWrite(data());
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
