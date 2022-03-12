package com.xiaocai.demo.java.io.stream;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ SequenceInputStream ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/8 11:01
 * @Version ： 1.0
 **/
@Slf4j
public class SequenceInputStreamDemo {

    /**
     * 测试使用 testBySequenceStream 合并输入流来统一读取写入.
     */
    private static void testBySequenceStream() {
        try (
                InputStream in1 = new FileInputStream("G:/test/a.txt");
                InputStream in2 = new FileInputStream("G:/test/b.txt");
                OutputStream out = new FileOutputStream("G:/test/c.txt");
                SequenceInputStream seqIn = new SequenceInputStream(in1, in2)
        ) {
            int len = 0;
            while ((len = seqIn.read()) != -1) {
                out.write(len);
            }
        } catch (IOException e) {
            log.error("合并输入流写入失败!", e);
        }
    }
}
