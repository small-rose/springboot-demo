package com.xiaocai.demo.java;

import java.util.Calendar;

public class DateParseTest {
    public static void main(String[] args) {

        String str = "2020-05-22 08:03:20";

        int startYear = Integer.parseInt(str.substring(0, 4));
        int startMonth = Integer.parseInt(str.substring(5, 7));
        int startDay = Integer.parseInt(str.substring(8,10));
        int startHours = Integer.parseInt(str.substring(11,13));
        int startMinute = Integer.parseInt(str.substring(14,16));
        int startSecond = Integer.parseInt(str.substring(17,19));


        Calendar instance = Calendar.getInstance();
        int nowYear = instance.get(Calendar.YEAR);
        int nowMonth = instance.get(Calendar.MONTH) + 1;
        int nowDay = instance.get(Calendar.DAY_OF_MONTH);
        int nowHours = instance.get(Calendar.HOUR_OF_DAY);
        int nowMinute = instance.get(Calendar.MINUTE);
        int nowSecond = instance.get(Calendar.SECOND);


        System.out.println(startYear+"年 "+isYear(startYear,nowYear));

        System.out.println(startMonth+"月"+isMonth(startYear,nowYear,startMonth,nowMonth));

        System.out.println(startDay+"日"+isDay(startYear,startMonth,startDay,nowDay) );

        System.out.println(startHours+"时"+isHours(startHours,nowHours));

        System.out.println(startMinute+"分"+isMinute(startMinute,nowMinute));

        System.out.println(startSecond+"秒"+isSecond(startSecond,nowSecond));

    }
    //年份校验
    private static boolean isYear(int startYear, int nowYear) {
        return startYear<=nowYear;
    }

    //月份校验
    private static boolean isMonth(int startYear, int nowYear,int startMonth,int nowMonth){

        if (isYear(startYear,nowYear)){
            return true;
        }
        if (startYear == nowYear && 0 < startMonth && startMonth <= 12 ){
            return startMonth <= nowMonth;
        }
        return false;
    }
    //日期校验
    private static boolean isDay(int startYear,int startMonth,int startDay, int nowDay) {
        int[] DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
        // 判断当前年份是否为闰年
        if (startYear % 4 == 0){
            DAYS[1]=29;
        }
        if (nowDay>0 && nowDay <= DAYS[(startMonth-1)]){

            return startDay<=nowDay;
        }
        return false;
    }
    //时校验
    private static boolean isHours(int startHours, int nowHours){
        if (startHours >= 0 && startHours <= 23){
            return startHours <= nowHours;
        }
        return false;
    }
    //分校验
    private static boolean isMinute (int startMinute,int nowMinute){
        if (startMinute >=0 && startMinute <= 60){
            return startMinute <= nowMinute;
        }
        return false;
    }
    //秒校验
    private static boolean isSecond (int startSecond,int nowSecond){
        if (startSecond > 0 && startSecond < 60){
            return startSecond <= nowSecond;
        }
        return false;
    }
}




