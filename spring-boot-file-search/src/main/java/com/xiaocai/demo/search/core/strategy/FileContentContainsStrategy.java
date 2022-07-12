package com.xiaocai.demo.search.core.strategy;

import java.io.*;
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


    @Override
    public List<File> execute(List<File> target, String... keys) {
        List<File> result = new ArrayList<>();
        String fileName = "";
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
                    }
                }
                x++;
            }
            if (flag){
                System.out.println("From "   +file.getName() );
                System.out.println( "---------------------------------------------");
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
