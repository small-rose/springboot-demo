package com.small.o2o.comp.sql;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class OraMoreTest {

    @Test
    public void handler01sql() {
        String path = "E:\\test\\ora_ddl.sql";
        String path2 = "E:\\test\\ora_ddl_more.sql";
        FileReader fileReader = new FileReader(new File(path));
        List<String> allLines = fileReader.readLines();
        List<String> result = new ArrayList<>();
        result.add("-- OB（生产）环境中对应的表没有，但oracle测试（集成）环境对应的表有这些列清单 --");
        result.add("-- 需要确认这些列是否需要保留 --");
        for (String line : allLines) {
            if (line.contains("多列")){
                line = line.replace("-- 表 ","");
                line = line.replace(" 的列 ",".");
                line = line.replace("OB沒有 ORACLE 有 ！！！ 多列！！！","");

                result.add(line);
            }
        }
        result.forEach(System.out::println);

        File file = new File(path2);
        if (file.exists()){
            file.delete();
        }

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.appendLines(result);
    }

    @Test
    public void handler02sql() {
        String path = "E:\\test\\ora_ddl.sql";
        String path2 = "E:\\test\\ora_ddl_2.sql";
        FileReader fileReader = new FileReader(new File(path));
        List<String> allLines = fileReader.readLines();
        List<String> result = new ArrayList<>();
        for (String line : allLines) {
            if (line.startsWith("ALTER")){
                result.add(line);
            }
        }
        result.forEach(System.out::println);

        File file = new File(path2);
        if (file.exists()){
            file.delete();
        }

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.appendLines(result);
    }
}
