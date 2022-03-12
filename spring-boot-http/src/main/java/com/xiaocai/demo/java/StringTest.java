package com.xiaocai.demo.java;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
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


    @Test
    public void test(){
        String   paySuccessDate = "2021-11-25 10:02:18";
        System.out.println("---"+paySuccessDate.substring(0,10).replaceAll("-",""));
        System.out.println("---"+paySuccessDate.substring(11).replaceAll(":",""));
    }

    @Test
    public void test02(){
        String alipayResult = "000000|<form action='' />";
        String[] results = alipayResult.split("\\|");
        System.out.println("--results[0]-"+results[0]);
        System.out.println("--results[1]-"+results[1]);

        int i = alipayResult.lastIndexOf("|");
        String ms = alipayResult.substring(i+1,alipayResult.length());
        String mm = alipayResult.substring(0, i);
        System.out.println("--------------------");
        System.out.println("--ms-"+ms);
        System.out.println("--mm-"+mm);

    }


    @Test
    public void substring() {
        String aliForm = "<form action='' ></form><script>alert('test')</script>";
        String form = aliForm.substring(0, aliForm.indexOf("<script>"));
        System.out.println(form);
        form = form.concat("<script>document.forms[0].submit();</script>");
        System.out.println(form);

    }

    @Test
    public void substring02() {
        String aliForm = "https://qr.alipay.com/bax08692juhdbtp1bzki0087ALIPAYFTF";
        String form = aliForm.substring(0, aliForm.indexOf("ALIPAYFTF"));
        System.out.println(form);


    }


    @Test
    public void typeTest() {
        List<Student> studentList = new ArrayList<>();

        Student s1 = new Student("zz", 13);
        Student s2 = new Student("aa", 18);
        studentList.add(s1);
        studentList.add(s2);
        studentList.sort(Comparator.comparingInt(Student::getAge));

    }

    @Data
    @AllArgsConstructor
    class Student{
        private String name;
        private int age;
    }
}
