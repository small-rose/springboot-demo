package com.example.demo.guava.beans;

import lombok.Data;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ Student ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/11/4 14:06
 * @Version ： 1.0
 **/
@Data
public class Student {

    private String firstName;
    private String lastName;
    private int className;
    private String rollNo ;

    public Student(String firstName, String lastName, int className, String rollNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.className = className;
        this.rollNo = rollNo;
    }

}
