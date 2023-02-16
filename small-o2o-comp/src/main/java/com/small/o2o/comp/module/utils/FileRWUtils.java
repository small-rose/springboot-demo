package com.small.o2o.comp.module.utils;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;

import java.io.File;
import java.util.List;

public class FileRWUtils {

    /**
     * 生成文件
     * @param ddlpath
     * @param ddlList
     */
    public static void fileWriter(String ddlpath, List<String> ddlList){
        File ddl = new File(ddlpath);
        if (ddl.exists()) {
            ddl.delete();
        }
        FileWriter fileWriter = new FileWriter(ddl);
        fileWriter.appendLines(ddlList);
    }


    /**
     * 读取文件
     * @param ddlpath
     * @param
     */
    public static List<String> fileReader(String ddlpath){
        File ddl = new File(ddlpath);
        FileReader fileReader = new FileReader(ddl);
        return fileReader.readLines();
    }

}
