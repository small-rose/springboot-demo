package com.xiaocai.demo.java.utils;

import com.xiaocai.demo.java.utils.strategy.FileKeyContext;
import com.xiaocai.demo.java.utils.strategy.FilterStrategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ FileUtils ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/2 16:51
 * @Version ： 1.0
 **/
public class FileFilterUtils {



    public static File[] getFileList(String path){
        File tmp  = new File(path);
        File[] files = tmp.listFiles();
        return files ;
    }


    public static List<File> listFilesDir(String path){
        List<File> list = new ArrayList<File>();
        File[] fileList = getFileList(path);
        for (File file : fileList){
            if (file.isDirectory()){
                List<File> tmpFiles = listFilesDir(file.getAbsolutePath());
                list.addAll(tmpFiles);
            }else{
                list.add(file);
            }
        }
        return list;
    }

    /**
     * 取所有文件
     * @param src
     * @return
     */
    public static List<File>  getAllList(String src){
        File[] fileList = getFileList(src);
        List<File> resultList = new ArrayList<File>();
        for (File file : fileList){
            if (file.isDirectory()){
                List<File> tmpFiles = listFilesDir(file.getAbsolutePath());
                resultList.addAll(tmpFiles);
            }else{
                resultList.add(file);
            }
        }
        return resultList;
    }


    public static List<File> getAllFilesByFileNameKeys(List<File> files , FilterStrategy strategy, String ... keys ){
        if (files==null || files.size()==0){
            return new ArrayList<File>();
        }
        if (keys==null || keys.length ==0){
            return files ;
        }

        FileKeyContext fileKeyContext = new FileKeyContext(strategy);
        return fileKeyContext.doFilterStrategy(files, keys);
    }

    public static  List<String> getFileNameList(List<File>  fileList ){

        return getFileNameList(fileList, true) ;
    }

    public static  List<String> getFileNameList(List<File>  fileList, boolean bool){
        List<String> list = new ArrayList<String>();
        String fileName = null;
        for (File file : fileList){
            fileName = file.getName();
            if (bool){
                list.add(fileName.substring(0, fileName.lastIndexOf(".java")));
            }else{
                list.add(fileName);
            }

        }
        return list ;
    }


    public static  List<String> getReplaceFileNameList(List<String>  fileList, String old, String newstr){
        List<String> list = new ArrayList<String>();
        String name = null;
        for (String fileName : fileList){
            name  = fileName.replace(old, newstr);
            list.add(name);
        }
        return list ;
    }

    public static List<File> getAllFilesByFileContentKeys(List<File> files , FilterStrategy strategy, String ... keys ){
        if (files==null || files.size()==0){
            return new ArrayList<File>();
        }
        if (keys==null || keys.length ==0){
            return files ;
        }

        FileKeyContext fileKeyContext = new FileKeyContext(strategy);
        return fileKeyContext.doFilterStrategy(files, keys);
    }
}
