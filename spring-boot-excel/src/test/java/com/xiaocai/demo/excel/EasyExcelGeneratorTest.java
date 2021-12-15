package com.xiaocai.demo.excel;

import com.xiaocai.demo.excel.oracle.facade.ExcelFacadeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ EasyExcelGenerater ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/15 16:06
 * @Version ： 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class EasyExcelGeneratorTest {

    @Autowired
    private ExcelFacadeService excelFacadeService;

    @Test
    public void excelGeneratedExcel() {

        excelFacadeService.generatedExcel("PAYMT");
    }
}
