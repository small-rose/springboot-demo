package com.xiaocai.demo.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ StringTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/17 10:16
 * @Version ： 1.0
 **/
public class StringTest {

    public static void main(String[] args) throws ParseException {

        String str = "00000000131401314620";
        String newStr = str.replaceAll("^(0+)", "");
        System.out.println(newStr);


        long a = 0 ;
        long b = Long.parseLong("0");
        System.out.println(a==0);
        System.out.println(a==b);



        String data = "Data=abcd" ;
        if (data.startsWith("Data=")){
            data = data.substring(4);
        }
        System.out.println("---"+data);


    }
}
