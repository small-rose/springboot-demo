package com.small.o2o.comp.sql;

import com.small.o2o.comp.SpringBooTest;
import com.small.o2o.comp.module.facade.IndexFacadeService;
import com.small.o2o.comp.module.facade.OraclePkRepairService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GenerateIndexCompareTest extends SpringBooTest {

    @Autowired
    private IndexFacadeService indexFacadeService ;
    @Autowired
    private OraclePkRepairService oraclePkRepairService ;
    /**
     * OB 和 oracle 对比
     *  索引和主键
     */
    @Test
    public void generateIndex(){
        String path = "E:\\test\\MetaData_Index_".concat(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmm"))).concat(".xlsx");
        indexFacadeService.doHandle(path);
    }

    /**
     * 提取部分主键, 生成DDL
     */
    @Test
    public void queryIndex(){
        String path = "E:\\test\\Test_ORACLE_Index_".concat(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmm"))).concat(".xlsx");
        oraclePkRepairService.listPkList(path);
    }

}
