package com.xiaocai.demo.java.io.stream;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ FileStream ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/8 10:55
 * @Version ： 1.0
 **/
@Slf4j
public class FileStreamDemo {

    /**
     *  FileInputStream 和 FileOutputStream
     *
     * 测试复制文件a.txt中的内容到b.txt文件中.
     */
    private static void testCopyByFileStream() {
        try (
                InputStream in = new FileInputStream("G:/test/a.txt");
                OutputStream out = new FileOutputStream("G:/test/b.txt", true)
        ) {
            int len;
            byte[] b = new byte[1024];
            while ((len = in.read(b)) != -1) {
                out.write(b, 0, len);
            }
        } catch (IOException e) {
            log.error("文件读取写入失败!", e);
        }
    }



}
