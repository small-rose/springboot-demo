package com.xiaocai.demo.excel.common;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-29 13:22
 **/
public class FileUtils {



    /**
     * 写入的内容很多，就
     * 应该使用更为高效的缓冲器流类BufferedWriter
     */
    public static void Write(String path, String content) {
        //创建一个字符缓冲输出流对象
        BufferedWriter bw = null;
        File file = new File(path);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            bw = new BufferedWriter(new FileWriter(new File(path), true)) ;

            //写数据
            bw.write(content);
            //注意\n不一定在各种计算机上都能产生换行的效果
            bw.newLine();

            //刷新流
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //关闭资源
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
