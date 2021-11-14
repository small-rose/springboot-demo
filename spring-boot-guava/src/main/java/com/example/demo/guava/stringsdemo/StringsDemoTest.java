package com.example.demo.guava.stringsdemo;

import com.google.common.base.Strings;
import org.junit.Test;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：Strings 类主要提供了对字符串的一些操作。主要方法如下：
 *
 *     （1）nullToEmpty(String string) ：null字符串转空字符串
 *     （2）emptyToNull(String string)：空字符串转null字符串
 *     （3）isNullOrEmpty(String string)：判断字符串为null或空字符串
 *     （4）padStart(String string, int minLength, char padChar)：如果string的长度小于minLeng，在string前添加padChar，直到字符串长度为minLeng。
 *     （5）String padEnd(String string, int minLength, char padChar)：和padStart类似，不过是在尾部添加新字符串
 *     （6）commonPrefix(CharSequence a, CharSequence b)：返回共同的前缀
 *     （7）commonSuffix(CharSequence a, CharSequence b)：返回共同的后缀
 *
 * @author: 张小菜
 * @date: 2021/11/14 22:50
 * @version: v1.0
 */
public class StringsDemoTest {
    @Test
    public void nullToEmpty_emptyToNull(){
        String aa = " ";

        // A12345
        System.out.println(Strings.emptyToNull(aa));

        String bb = null;
        // 12345
        System.out.println(Strings.nullToEmpty(bb));
    }

    @Test
    public void StringTest_padStart(){
       String aa = "12345";

       // A12345
       System.out.println(Strings.padStart(aa, 6, 'A'));
        // 12345
        System.out.println(Strings.padStart(aa, 5, 'A'));
        //
        System.out.println(Strings.padStart(aa, 7, 'A'));
    }

    @Test
    public void StringTest_padEnd(){
        String aa = "12345";

        // A12345
        System.out.println(Strings.padEnd(aa, 6, 'A'));
        // 12345
        System.out.println(Strings.padEnd(aa, 5, 'A'));
        //
        System.out.println(Strings.padEnd(aa, 7, 'A'));
    }

    @Test
    public void commonPrefix_commonSuffix(){
        String aa = "abc123def";
        String bb = "abc789def";

        System.out.println(Strings.commonPrefix(aa, bb));
        System.out.println(Strings.commonSuffix(aa, bb));
    }

    @Test
    public void commonPrefix(){
        String aa = "abc123def";
        String bb = "abc789def";

        System.out.println(Strings.commonPrefix(aa, bb));
        System.out.println(Strings.commonSuffix(aa, bb));
    }
}
