package com.xiaocai.demo.java;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

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
 * @Author : small-rose/zhangxiaocai
 * @Description : [ DateTimeDemo ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/11/2 10:15
 * @Version ： 1.0
 **/
@Slf4j
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

    @Test
    public void test03() throws ParseException {
        String str = "20220108";
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date dateStr = format.parse(str);
        if (dateStr.after(format.parse("20220107"))) {
           log.info("----" + str +" 在 20220107 之后" );
        }
    }

    @Test
    public void test04() throws ParseException {
        String lastTime = "2022-01-11 19:00:10";
        // 上次的时间
        // 上次的时间
        log.info("上次时间："+lastTime);
        Date lastTimeDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(lastTime);
        Instant instant = lastTimeDate.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime lastTimeLocl = LocalDateTime.ofInstant(instant, zoneId).plusHours(2);
        // 上次实名时间+2小时，和现在比较
        String last = lastTimeLocl.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        log.info("上次时间+2小时："+last);
        String limit = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        log.info("本次时间："+limit);
        if(last.compareTo(limit) >0){
            //在2小时范围内
            log.info("本次实名在2小时内");
            //return true ;
        }else{
            // 超出2小时
            log.info("本次实名已经超出2小时");
            //return  false ;
        }

    }
}
