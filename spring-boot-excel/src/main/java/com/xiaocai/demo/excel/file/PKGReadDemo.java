package com.xiaocai.demo.excel.file;

import com.xiaocai.demo.excel.common.FileUtils;

import java.io.File;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ PKGReadDemo ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/7/29 16:52
 * @Version ： 1.0
 **/
public class PKGReadDemo {

    private static String DIR = "D:" + File.separator + "onlyTest" ;
    
    private static String fileName =  DIR + File.separator +  "MM_INVATINVOICE_PKG_BAK.pck";
    
    public static void main(String[] args) {

        FileUtils.readFileByLines(fileName);
    }
}
