package com.xiaocai.demo.java.io.stream;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ BufferedStream ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/8 10:57
 * @Version ： 1.0
 **/

@Slf4j
public class BufferedStream {


    /**
     *  BufferedInputStream 和 BufferedOutputStream
     *
     * 测试通过 BufferedInputStream 和 BufferedOutputStream 来复制文件a.txt中的内容到b.txt文件中.
     */
    private static void testCopyByBufferedStream() {
        try (
                InputStream in = new BufferedInputStream(new FileInputStream("G:/test/a.txt"));
                OutputStream out = new BufferedOutputStream(new FileOutputStream("G:/test/b.txt"))
        ) {
            int len;
            byte[] b = new byte[1024];
            while ((len = in.read(b)) != -1) {
                out.write(b, 0, len);
            }
        } catch (IOException e) {
            log.error("通过缓冲区的方式来做文件读取写入失败!", e);
        }
    }



    /**
     * 测试将内容写入到ByteArrayOutputStream中并打印出来，不需要关闭流.
     */
    private static void testByByteArrayStream() {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream(8);
        String str = "Hello World!";
        try {
            byteOut.write(str.getBytes());
        } catch (IOException e) {
            log.error("写入字节数据出错!", e);
        }

        byte[] buf = byteOut.toByteArray();
        for (byte b : buf) {
            log.info("{}", (char) b);
        }
    }

}
