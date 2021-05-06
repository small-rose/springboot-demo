package cn.xiaocai.demo.jsoup.common;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: springboot-redis
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-06 15:46
 **/
public class FileWriterDemo {
    /**
     * 使用FileWriter类写文本文件
     */
    public static void writeMethod1()
    {
        String fileName="C:\\kuka.txt";
        try
        {
            //使用这个构造函数时，如果存在kuka.txt文件，
            //则先把这个文件给删除掉，然后创建新的kuka.txt
            FileWriter writer=new FileWriter(fileName);
            writer.write("Hello jerry:\n");
            writer.write("  My name is  jack !\n");
            writer.write("  I like you and miss you。");
            writer.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    /**
     * 使用FileWriter类往文本文件中 追加信息
     */
    public static void writeMethod2()
    {
        String fileName="C:\\test.txt";
        try
        {
            //使用这个构造函数时，如果存在kuka.txt文件，
            //则直接往kuka.txt中追加字符串
            FileWriter writer = new FileWriter(fileName,true);
            SimpleDateFormat format=new SimpleDateFormat();
            String time=format.format(new Date());
            writer.write("\n\t"+time);
            writer.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * 写入的内容很多，就
     * 应该使用更为高效的缓冲器流类BufferedWriter
     */
    public static void bfWriter() {
        //创建一个字符缓冲输出流对象
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("bw.txt")) ;

            //写数据
            bw.write("hello");
            bw.write("world");
            bw.write("Hello :");
            bw.newLine();  //注意\n不一定在各种计算机上都能产生换行的效果
            bw.write("  My name is coolszy!\n");
            bw.write("  I like you and miss you。");
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
