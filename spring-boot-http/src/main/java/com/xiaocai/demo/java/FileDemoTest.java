package com.xiaocai.demo.java;

import org.junit.Test;

import java.io.File;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ FileDemoTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/9 16:20
 * @Version ： 1.0
 **/
public class FileDemoTest {

    @Test
    public void file01(){
        String file = "D:\\当前任务文件夹\\安诚\\对账文件\\招行\\DZ_110001_20210910_JHZFB_04 - 副本.txt";
        File file1 = new File(file);
        File dest = new File("D:\\当前任务文件夹\\安诚\\对账文件\\招行\\bak\\DZ_110001_20210910_JHZFB_0111.txt");
        boolean bool = file1.renameTo(dest);
        System.out.println(bool);
    }
}
