package com.xiaocai.demo.poi.utils;

import java.io.*;

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


    /**
     * 写入的内容很多，就
     * 应该使用更为高效的缓冲器流类BufferedWriter
     */
    public static boolean Delete(String path) {
        //创建一个字符缓冲输出流对象
        BufferedWriter bw = null;
        File file = new File(path);
        if (!file.exists() ){
            System.out.println(path +" --> 文件不存在！");
            return true;
        }
        if (file.delete()){
            System.out.println(path +" --> 文件删除成功！");
            return true;
        }
        return false;
    }



    /**
     * 以行为单位读取文件，常用于读面向行的格式化文件
     *
     * @param fileName
     *            文件名
     */
    public static void readFileByLines(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"GB2312"));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                System.out.println("line " + line + ": " + tempString);
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }
}
