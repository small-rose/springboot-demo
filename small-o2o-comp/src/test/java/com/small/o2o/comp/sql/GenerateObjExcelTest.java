package com.small.o2o.comp.sql;


import com.small.o2o.comp.SpringBooTest;
import com.small.o2o.comp.module.facade.ExcelGenaratorService;
import com.small.o2o.comp.module.facade.ObCompareExcelService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class GenerateObjExcelTest extends SpringBooTest {

    @Autowired
    private ExcelGenaratorService excelGenaratorService ;
    @Autowired
    private ObCompareExcelService obCompareExcelService ;

    @Test
    public void generateExcel(){
        String path = "E:\\test\\MetaData_ALL_OB_".concat(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmm"))).concat(".xlsx");
        excelGenaratorService.doHandle(path);
    }

    @Test
    public void generateExcel02(){
        String path = "E:\\test\\MetaData_ALL_TAB_COLUMN_".concat(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmm"))).concat(".xlsx");
        excelGenaratorService.doHandleOnlyCol(path,"",false);
    }

    @Test
    public void generateExcelTable(){
        String path = "E:\\test\\MetaData_MM_REINFOREIGNINPAYMENT_TD_".concat(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmm"))).concat(".xlsx");
        excelGenaratorService.doHandleOnlyCol(path, "MM_REINFOREIGNINPAYMENT_TD", false);
    }



    @Test
    public void generateExcelChayi(){
        String path = "E:\\test\\MetaData_chayi_COLUMN_".concat(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmm"))).concat(".xlsx");
        excelGenaratorService.doHandleOnlyCol(path,"", true);
    }



    @Test
    public void generateOBchayi(){
        String path = "E:\\test\\MetaData_Ob_OB_".concat(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmm"))).concat(".xlsx");
        obCompareExcelService.doHandleOnlyCol(path,"", false);
    }


}
