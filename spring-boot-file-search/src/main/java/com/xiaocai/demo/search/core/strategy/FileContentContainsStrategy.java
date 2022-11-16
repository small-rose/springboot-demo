package com.xiaocai.demo.search.core.strategy;

import cn.hutool.core.io.file.FileWriter;
import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ FileContentContainsStrategy ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/2 17:58
 * @Version ： 1.0
 **/
public class FileContentContainsStrategy implements FilterStrategy{

    private File writeToFile ;

    private FileWriter fileWriter ;
    private List<String> lineList = null;

    public FileContentContainsStrategy() {
    }

    public FileContentContainsStrategy(File writeToFile) {
        this.writeToFile = writeToFile ;
    }

    @Override
    public List<File> execute(List<File> target, String... keys) {

        if (writeToFile!=null){
            lineList = new ArrayList<>();
            File file1 = FileUtils.getFile(writeToFile);
            if (file1.exists()){file1.delete();}
            fileWriter = new FileWriter(FileUtils.getFile(writeToFile));
        }

        List<File> result = new ArrayList<>();

        for (File file : target){
            if (isContainKeys(file, keys)){
                    result.add(file);
            }
        }
        return result;
    }

    private boolean isContainKeys(File file, String[] keys) {

        BufferedReader br = null;
        InputStreamReader isr = null;

        String line = "";
        Boolean flag = Boolean.FALSE ;
         try {
            int x = 1 ;
            // System.out.println(file.getAbsoluteFile());
            isr = new InputStreamReader(new FileInputStream(file), "UTF-8");
            br = new BufferedReader(isr);
             //System.out.println( file.getName() );
            while ((line = br.readLine()) != null) {

                //跳过注释
                if (line.startsWith("//")){
                    x++;
                    continue;
                }

                //x = 1 ;
                for (int i = 0; i < keys.length; i++){

                    if (line.contains(keys[i]) ){
                        System.out.println("\t - 内容：" +" - lineNum " +x);
                        System.out.println("\t - 内容：" + line +"\n");

                        flag = true ;

                        if (fileWriter!=null){
                            lineList.add(line);
                        }
                    }
                }
                x++;
            }
            if (flag){
                System.out.println("From "   +file.getName() );
                System.out.println( "---------------------------------------------");
                if (fileWriter!=null) {
                    lineList.add("From " + file.getName());
                }
            }
             if (lineList!=null){
                 fileWriter.appendLines(lineList);
             }

             return flag ;
        } catch(Exception e) {

            e.printStackTrace();
        }finally {
            try {
                if (br!=null){
                    br.close();
                }
                if (isr!=null){
                    isr.close();
                }
            } catch (IOException e) {
            }


        }
        return false;
    }
}
