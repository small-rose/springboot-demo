package com.small.o2o.comp.sql;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DdlErrorLogTest {


    @Test
    public void handlerErrorsql() {
        String path = "E:\\test\\ddl_error_log.txt";
        String path2 = "E:\\test\\ddl_error.txt";
        FileReader fileReader = new FileReader(new File(path));
        List<String> allLines = fileReader.readLines();
        List<String> result = new ArrayList<>();
        result.add("-- 执行错误的DDL清单 --");
        String lastLine = "";
        int indexNo = 1 ;
        for (String line : allLines) {

            if (line.contains("ORA-")){
                result.add("第 "+indexNo +" 个错误");
                result.add(lastLine + " ;");
                result.add(line);
                result.add("---------------");
                indexNo++;
            }
            lastLine = line ;
        }
        result.forEach(System.out::println);

        File file = new File(path2);
        if (file.exists()){
            file.delete();
        }

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.appendLines(result);

        String excelpath2 = "E:\\Users\\small-rose\\Desktop\\1.xlsx";

    }
}
