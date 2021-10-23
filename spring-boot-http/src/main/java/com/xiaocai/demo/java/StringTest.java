package com.xiaocai.demo.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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

        //SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String result = formatter.format(date);


        formatter.setLenient(false);
        Date newDate= formatter.parse(result);

        System.out.println(newDate);
        //<CASH_DATE><![CDATA[Fri Oct 15 00:00:00 CST 2021]]></CASH_DATE>
        //String abc = "Fri Oct 15 00:00:00 CST 2021";
        //Date aaa= formatter.parse(abc);
        //System.out.println(aaa);

        long a = 0 ;
        long b = Long.parseLong("0");
        System.out.println(a==0);
        System.out.println(a==b);

        LocalDateTime now = LocalDateTime.now();
        String expiredTime = now.plusHours(24).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(expiredTime);

        String data = "Data=abcd" ;
        if (data.startsWith("Data=")){
            data = data.substring(4);
        }
        System.out.println("---"+data);
    }
}
