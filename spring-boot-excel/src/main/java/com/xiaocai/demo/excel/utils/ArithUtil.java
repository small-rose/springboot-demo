package com.xiaocai.demo.excel.utils;

import java.math.BigDecimal;

public class ArithUtil {
	private static final int DEF_DIV_SCALE=10;

    private ArithUtil(){}
    //相加
    public static double add(double d1,double d2){
        BigDecimal b1=new BigDecimal(Double.toString(d1));
        BigDecimal b2=new BigDecimal(Double.toString(d2));
        return b1.add(b2).doubleValue();

    }
    //相减
    public static double sub(double d1,double d2){
        BigDecimal b1=new BigDecimal(Double.toString(d1));
        BigDecimal b2=new BigDecimal(Double.toString(d2));
        return b1.subtract(b2).doubleValue();

    }
    //相乘
    public static double mul(double d1,double d2){
        BigDecimal b1=new BigDecimal(Double.toString(d1));
        BigDecimal b2=new BigDecimal(Double.toString(d2));
        return b1.multiply(b2).doubleValue();

    }
    //相除
    public static double div(double d1,double d2){

        return div(d1,d2,DEF_DIV_SCALE);

    }

    public static double div(double d1,double d2,int scale){
        if(scale<0){
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b1=new BigDecimal(Double.toString(d1));
        BigDecimal b2=new BigDecimal(Double.toString(d2));
        return b1.divide(b2,scale,BigDecimal.ROUND_HALF_UP).doubleValue();

    }
    
    //相加
    public static float add(float d1,float d2){
        BigDecimal b1=new BigDecimal(Float.toString(d1));
        BigDecimal b2=new BigDecimal(Float.toString(d2));
        return b1.add(b2).floatValue();

    }
    //相减
    public static float sub(float d1,float d2){
        BigDecimal b1=new BigDecimal(Float.toString(d1));
        BigDecimal b2=new BigDecimal(Float.toString(d2));
        return b1.subtract(b2).floatValue();

    }
    //相乘
    public static float mul(float d1,float d2){
        BigDecimal b1=new BigDecimal(Float.toString(d1));
        BigDecimal b2=new BigDecimal(Float.toString(d2));
        return b1.multiply(b2).floatValue();
    }
    //相除
    public static float div(float d1,float d2){

        return div(d1,d2,DEF_DIV_SCALE);

    }

    public static float div(float d1,float d2,int scale){
        if(scale<0){
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b1=new BigDecimal(Float.toString(d1));
        BigDecimal b2=new BigDecimal(Float.toString(d2));
        return b1.divide(b2,scale,BigDecimal.ROUND_HALF_UP).floatValue();
    }
    
    public static void main(String[] args) {
    	System.out.println(ArithUtil.add(0.01, 0.05));
        System.out.println(ArithUtil.sub(1.0, 0.42));
        System.out.println(ArithUtil.mul(4.015, 100));
        System.out.println(ArithUtil.div(123.3, 100));
        System.out.println(0.00==0);
	}
}
