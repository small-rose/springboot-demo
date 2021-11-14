package com.example.demo.guava.splitter;

import com.google.common.base.Splitter;
import org.junit.Test;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 拆分器 Splitter#

    Splitter 能将一个字符串按照分隔符生成字符串集合，是 Joiner的反向操作。

    常用方法如下：

    （1）on(String)：静态工厂方法，生成一个新的 Splitter 对象，参数为连接符
    （2）trimResults()：结果去除子串中的空格
    （3）omitEmptyStrings()：去除null的子串
    （4）split(String)：拆分字符串
    （5） withKeyValueSeparator(String)：得到 MapSplitter，拆分成Map的键、值。注意，这个对被拆分字符串格式有严格要求，否则会抛出异常
 * @author: 张小菜
 * @date: 2021/11/14 22:23
 * @version: v1.0
 */
public class SplitterDemoTest {

    @Test
    public void test1(){
        String string = " ,a,b,";
        System.out.println(Splitter.on(",").split(string));
        System.out.println(Splitter.on(",").trimResults().split(string));
        System.out.println(Splitter.on(",").omitEmptyStrings().split(string));
        System.out.println(Splitter.on(",").trimResults().omitEmptyStrings().split(string));



        // 拆分成Map
        System.out.println(Splitter.on("#").withKeyValueSeparator(":").split("1:2#3:4"));

        /*
        输出如下：
        [ , a, b, ]
        [, a, b, ]
        [ , a, b]
        [a, b]
        [12, 34, 56, 78]
        {1=2, 3=4}

         */
    }

    @Test
    public void test_on(){
        String string = " ,a,b,";
        System.out.println(Splitter.on("-").split(string));
    }


    @Test
    public void test_split(){
        String string = " ,a,b,";
        System.out.println(Splitter.on(",").trimResults().split(string));

        // 根据长度拆分
        string = "12345678";
        System.out.println(Splitter.fixedLength(2).split(string));
    }

}
