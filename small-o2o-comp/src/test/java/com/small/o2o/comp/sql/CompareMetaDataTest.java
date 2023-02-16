package com.small.o2o.comp.sql;


import com.small.o2o.comp.SpringBooTest;
import com.small.o2o.comp.module.facade.CompareMetaDataService;
import com.small.o2o.comp.module.facade.TableAndColumnService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CompareMetaDataTest extends SpringBooTest {

    @Autowired
    private CompareMetaDataService compareMetaDataService ;
    @Autowired
    private TableAndColumnService tableAndColumnService ;


    @Test
    public void compareTest(){
        compareMetaDataService.compareTable();
    }



    @Test
    public void comparePackageTest2(){
        compareMetaDataService.compareProcedures();
    }


    // 提出 Ob差表
    @Test
    public void chaBiaoOb(){
        tableAndColumnService.chaBiao_ObMore();
    }

    // 提出 oracle 差表
    @Test
    public void chaBiaoOracle(){
        tableAndColumnService.chaBiao_OracleMore();
    }


    // 提出ob差表SQL
    @Test
    public void chaBiaoSQL_ob(){
        tableAndColumnService.chaBiaoSQL("ob");
    }
    // 提出oracle差表SQL
    @Test
    public void chaBiaoSQL_oracle(){
        tableAndColumnService.chaBiaoSQL("oracle");
    }

    @Test
    public void test1(){

        boolean result = "CREATE TABLE \"AMSDB01\".\"AMS_COMMONMIRROR_BAK_QY\" (".toUpperCase().contains("AMS_COMMONMIRROR_BAK_QY".toUpperCase());
        System.out.println(result);
    }


    // 提出oracle差表SQL
    @Test
    public void chaBiaoSQL_90(){
        tableAndColumnService.chaBiaoSQL("90");
    }

}
