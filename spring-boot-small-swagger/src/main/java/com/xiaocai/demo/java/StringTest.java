package com.xiaocai.demo.java;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ StringTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/17 10:16
 * @Version ： 1.0
 **/
public class StringTest {

    public static void main(String[] args) {

        String str = "000000001234034120";
        String newStr = str.replaceAll("^(0+)", "");
        System.out.println(newStr);
    }
}
