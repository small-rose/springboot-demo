package com.xiaocai.demo.java.io.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ PipedStream ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/8 10:58
 * @Version ： 1.0
 **/
public class PrintStreamDemo {

    /**
     * 测试使用 PrintStream 将数据输出到指定的文件.
     */
    private static void testOutputByPrintStream() {
        System.out.println("Hello World!");
        File file = new File("G:/test/d.txt");
        try {
            System.setOut(new PrintStream(new FileOutputStream(file)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("这些内容在文件中才能看到哦！");
    }
}
