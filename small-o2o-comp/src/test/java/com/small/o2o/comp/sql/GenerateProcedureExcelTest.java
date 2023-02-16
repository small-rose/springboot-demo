package com.small.o2o.comp.sql;


import com.small.o2o.comp.SpringBooTest;
import com.small.o2o.comp.module.facade.ExcelGenaratorService;
import com.small.o2o.comp.module.facade.ProcedureFacadeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class GenerateProcedureExcelTest extends SpringBooTest {

    @Autowired
    private ExcelGenaratorService excelGenaratorService ;
    @Autowired
    private ProcedureFacadeService procedureFacadeService ;

    @Test
    public void generateExcel(){
        String path = "E:\\test\\MetaData_ALL_PFP_".concat(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmm"))).concat(".xlsx");
        procedureFacadeService.doHandle(path);
    }



    @Test
    public void generatePkgNameListExcel(){
        String path = "E:\\test\\MetaData_PKG_".concat(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmm"))).concat(".xlsx");
        procedureFacadeService.doHandle2(path);
    }

}
