package com.small.o2o.comp.sql;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SkipTablespaceTest {


    @Test
    public void trimTableSpace(){
        String path = "E:\\test\\DDL\\20221216zhu-1-M_DDL.sql";
        String obPath = "E:\\test\\DDL\\20221216zhu-1-M_DDL_OB.sql";
        FileReader fileReader = new FileReader(new File(path));
        List<String> strings = fileReader.readLines();
        boolean delFlag = false ;

        List<String> result = new ArrayList<>();
        for (String l : strings){
            if ((l.endsWith("),") || l.endsWith(");"))&& delFlag ){
                delFlag = false ;
                l = l.endsWith("),") ? "," : l;
            }
            if (delFlag){
                continue;
            }
            if (l.contains("tablespace")){
                delFlag = true ;
                continue;
            }
            result.add(l);
        }

        result.forEach(System.out::println);

        FileWriter fileWriter = new FileWriter(new File(obPath));
        fileWriter.appendLines(result);
    }
}
