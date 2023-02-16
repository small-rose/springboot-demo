package com.small.o2o.comp.sql;

import com.small.o2o.comp.SpringBooTest;
import com.small.o2o.comp.module.facade.FilePickService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class FilePickTest extends SpringBooTest {

    @Autowired
    private FilePickService filePickService ;


    @Test
    public void testFiles(){
        filePickService.getAllFiles();
    }


    @Test
    public void testSearch(){

        String path = "E:\\test\\DDL\\";
        //String key = "coveragecode";
        String key = "AMS_TEMP_EVENT_TD";

        filePickService.search(path, key);
    }

    @Test
    public void testSearchChar(){

        String path = "E:\\test\\AMSDB01\\TABLE-schema.sql";


        filePickService.searchKeys(path, " VARCHAR2", "CHAR)");
    }


    @Test
    public void testCountPkg(){

        String path = "E:\\会计核算\\dbcat-88\\AMS\\PACKAGE BODY-schema.sql";

        filePickService.countPLSQLUNIT(path);
    }
}
