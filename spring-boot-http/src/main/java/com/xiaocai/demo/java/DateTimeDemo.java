package com.xiaocai.demo.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ DateTimeDemo ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/11/2 10:15
 * @Version ： 1.0
 **/
public class DateTimeDemo {

    @Test
    public void test01() throws ParseException {
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

    }

    @Test
    public  void main01() {

        LocalDateTime now = LocalDateTime.now();
        String expiredTime = now.plusHours(24).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(expiredTime);
    }
}
