package com.xiaocai.demo.poi;

import com.xiaocai.demo.poi.oracle.facade.ExcelFacadeService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ PoiExcelAnalysisTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/21 10:50
 * @Version ： 1.0
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PoiExcelTest {

    @Autowired
    private ExcelFacadeService excelFacadeService;

    /**
     * 生成EXCEL文件
     */
    @Test
    public void excelGeneratedExcel() {
        excelFacadeService.generatedExcel("PAYMT");
        log.info("----生成EXCEL执行完毕----game over");
    }

    /**
     * 生成SQL文件
     */
    @Test
    public void analysisExcel() {

        String datetime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        // 方案1 一下子全部放到内存里面 并填充
        String fileName =  "D:\\onlyTest\\paymt_" + datetime + ".xlsx";

        String sqlFile = "";
        excelFacadeService.analysisExcel(fileName, sqlFile);
        log.info("----生成SQL文件、执行完毕----路径："+sqlFile);

    }
}
