package com.xiaocai.demo.java;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ FileDemoTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/9 16:20
 * @Version ： 1.0
 **/
@Slf4j
public class FileDemoTest {

    @Test
    public void file01(){
        String file = "D:\\当前任务文件夹\\安诚\\对账文件\\招行\\DZ_110001_20210910_JHZFB_04 - 副本.txt";
        File file1 = new File(file);
        File dest = new File("D:\\当前任务文件夹\\安诚\\对账文件\\招行\\bak\\DZ_110001_20210910_JHZFB_0111.txt");
        boolean bool = file1.renameTo(dest);
        System.out.println(bool);
    }

    @Test
    public void file02(){
        String filepath = "D:\\当前任务文件夹\\安诚\\对账文件\\招行";
        String filterPattern = "DZ_110001_20210910";
        File tmp = new File(filepath);
        File[] files = tmp.listFiles(new FileFilter(){
            @Override
            public boolean accept(File pathname) {
                Pattern pattern = Pattern.compile("^" + filterPattern +"[\\s\\S]*.txt");
                log.info("pattern" + pattern.pattern());
                log.info("pathname" + !pathname.isDirectory());
                log.info("pathname" + pathname.getName());
                log.info("matches" + pattern.matcher(pathname.getName()).matches());
                return !pathname.isDirectory() && pattern.matcher(pathname.getName()).matches();
            }
        });
        if (files==null || files.length == 0){
            log.info("File Not Found !");
        }else{
            for (File file : files){
                log.info(file.getAbsolutePath());
            }
        }
    }

}
