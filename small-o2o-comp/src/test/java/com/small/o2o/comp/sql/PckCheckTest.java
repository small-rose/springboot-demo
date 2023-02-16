package com.small.o2o.comp.sql;

import cn.hutool.core.io.file.FileReader;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class PckCheckTest {

    @Test
    public void checkPck(){

        File fabu = new File("E:\\ideaWork\\PT17ACC-MA\\fisservice\\src\\main\\resources\\SQL\\2023\\20230113\\生产环境\\DQL生产发布");
        //File fabuTarget = new File("E:\\test\\Fabu\\prodbak_target\\");

        File[] files = fabu.listFiles();
        for (File f : files){
            FileReader reader = new FileReader(f);
            List<String> lines = reader.readLines();
            System.out.println("File Name: " +f.getName());
            int index = 0  ;
            for (String line : lines) {
                index++;
                if (check(line)){
                    System.out.println("No: "+index +" ,Line: "+line);
                }
            }

        }

        System.out.println("-------------------------结果----------------");

    }
    //List<String> keys = Arrays.asList("，","ams.",".count()","$$plsql_unit", "$$PLSQL_UNIT","(i - V_MONTH)");
    List<String> keys = Arrays.asList(".count()");
    private boolean check(String line){
        String lineTmp = line.toLowerCase();
        return keys.stream().anyMatch(x->lineTmp.contains(x));
    }
}
