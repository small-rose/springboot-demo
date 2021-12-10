package com.xiaocai.demo.java;

import org.junit.Test;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
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

    @Test
    public  void main02() {
        
        Date  date = new Date();
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();

        //方式二 直接使用LocalDateTime.ofInstant
        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(instant, zoneId).minusHours(2).minusSeconds(5);
        System.out.println(localDateTime1);
        String a = localDateTime1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("--------------------" +a);
        LocalDateTime dtLocal = LocalDateTime.now(); //.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(dtLocal);
        LocalDateTime limit = dtLocal.minusHours(2);
        System.out.println(limit);
        String b = limit.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("--------------------" +b);

        System.out.println(a.compareTo(b));

        if (a.compareTo(b) > 0 ){
            System.out.println("a > b");
            //return true ;
        }else if (a.compareTo(b) < 0 ){
            System.out.println("a < b");
        }else{
            System.out.println("a = b");
        }
        //那么这个时间就会存储：2020-01-01 02:00:00，提前8个小时

        LocalDateTime dtUtc = LocalDateTime.now(ZoneOffset.UTC);
        System.out.println(dtUtc);

    }



    @Test
    public void test(){
        LocalDateTime now = LocalDateTime.now();
        //long hours = Long.parseLong("0.5") ;
        double hours = Double.parseDouble("0.5") ;
        System.out.println(hours);
        String expiredTime = now.plusHours(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Test
    public void test02() throws ParseException {
        String test = "20210910173958";
        String date = test.substring(0,8);
        System.out.println(date);
        String inPaymentTime = test.substring(8);
        System.out.println(inPaymentTime);


        Date inPaymentDate = new SimpleDateFormat("yyyyMMdd").parse(date);
        System.out.println(inPaymentDate);
    }
}
