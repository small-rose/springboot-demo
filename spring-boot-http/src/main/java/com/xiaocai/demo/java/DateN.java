package com.xiaocai.demo.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateN {
    private  Calendar current = null;
    private  Date currentDate = null;
    private  Calendar instance = null;

    public DateN(){
        current = Calendar.getInstance(Locale.SIMPLIFIED_CHINESE);
        currentDate = current.getTime();
    }
    public boolean isBefore(String date) throws ParseException {
        if (date==null || date.length()<=14){
            throw new RuntimeException("日期格式非法");
        }
        System.out.println("传值时间："+date);
        instance = Calendar.getInstance(Locale.SIMPLIFIED_CHINESE);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        Date time = dateFormat.parse(date);
        instance.setTime(time);
        yearCompare();
        System.out.println("当前时间："+dateFormat.format(currentDate));
        return time.before(currentDate);
    }

    private void yearCompare(){
        if (instance.get(Calendar.YEAR)< current.get(Calendar.YEAR)) {
            System.out.println("传值年份在当前年份之前");
        }
        monthCompare();
    }
    private void monthCompare(){
        if (instance.get(Calendar.MONTH)< current.get(Calendar.MONTH)) {
            System.out.println("传值月份在当前月份之前");
        }
        dayCompare();
    }
    private void dayCompare(){
        if (instance.get(Calendar.DAY_OF_MONTH)< current.get(Calendar.DAY_OF_MONTH)) {
            System.out.println("传值日期在当前日期之前");
        }
        hoursCompare();
    }
    private void hoursCompare(){
        if (instance.get(Calendar.HOUR_OF_DAY)< current.get(Calendar.HOUR_OF_DAY)) {
            System.out.println("传值小时在当前小时之前");
        }
        minCompare();
    }
    private void minCompare(){
        if (instance.get(Calendar.MINUTE)< current.get(Calendar.MINUTE)) {
            System.out.println("传值分钟在当前分钟之前");
        }
        secondCompare();
    }
    private void secondCompare(){
        if (instance.get(Calendar.YEAR)< current.get(Calendar.YEAR)) {
            System.out.println("传值秒数在当前秒数之前");
        }
    }

    @Test
    public void dateTest() throws ParseException {
        String str = "2021-12-23 21:20:54";


        DateN dateN = new DateN();

        boolean before = dateN.isBefore(str);
        System.out.println(before);
    }


    public static void main(String[] args) throws ParseException {
        String str = "2021-12-23 21:20:54";


        DateN dateN = new DateN();

//        boolean before = dateN.isBefore(str);
//        System.out.println(before);
//        int startYear = Integer.parseInt(str.substring(0, 4));
//        int nowYear = instance.get(Calendar.YEAR);
//
//        int startMonth = Integer.parseInt(str.substring(5, 7));
//        int nowMonth = instance.get(Calendar.MONTH) + 1;
//
//        int startDay = Integer.parseInt(str.substring(8,10));
//        int nowDay = instance.get(Calendar.DAY_OF_MONTH);
//
//        int startHour = Integer.parseInt(str.substring(11,13));
//        int nowHour = instance.get(Calendar.HOUR);
//
//        int startMinute = Integer.parseInt(str.substring(14,16));
//        int nowMinute = instance.get(Calendar.MINUTE);
//
//        int startSecond = Integer.parseInt(str.substring(17,19));
//        int nowSecond = instance.get(Calendar.SECOND);
//
//        if (startYear==nowYear){ // 同年继续判断
//            if (startMonth==nowMonth){ // 同月继续判断
//                if (startDay==nowDay){ // 同日继续判断
//                    if (startHour==nowHour){ // 同时继续判断
//                        if (startMinute==nowMinute){ //同分继续判断
//                            System.out.println("秒数"+ dateN.isMinuteOrScond(startSecond,nowSecond));
//                        }else {
//                            System.out.println("分钟"+ dateN.isMinuteOrScond(startMinute,nowMinute));
//                        }
//                    }else {
//                        System.out.println("小时"+ dateN.isHour(startHour,nowHour));
//                    }
//                }else {
//                    System.out.println("日期" + dateN.isDay(startYear, startMonth, startDay, nowDay));
//                }
//            }else {
//                System.out.println("月份"+dateN.isMonth(startMonth,nowMonth));
//            }
//        }else {
//            System.out.println("年份"+dateN.isYear(startYear,nowYear));
//        }

    }



    private boolean isMinuteOrScond(int start, int now) {
        // 判断当前分钟或者秒钟是否合法
        if (start<0||start>60){
            return false;
        }
        return start<now;
    }

    private boolean isHour(int startHour, int nowHour) {
        // 判断当前小时是否合法
        if (startHour<0||startHour>24){
            return false;
        }
        return startHour<nowHour;
    }

    private boolean isDay(int startYear, int startMonth, int startDay, int nowDay) {
        int[] DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
        // 判断当前年份是否为闰年
        if (startYear%4==0){
            DAYS[1]=29;
        }
        // 判断输入日期是否合法
        if (nowDay<0||nowDay>DAYS[(startMonth-1)]){
            System.out.println("日期不合法");
            return false;
        }
        return startDay<nowDay; // 为同一天同样返回 true
    }

    private  boolean isMonth(int startMonth, int nowMonth) {
        // 判断输入月份是否合法
        if (0>=startMonth || startMonth > 12){
            System.out.println("输入月份不合法");
            return  false;
        }
        return startMonth<nowMonth;
    }

    private  boolean isYear(int startYear, int nowYear) {
        return startYear<nowYear;
    }

}
