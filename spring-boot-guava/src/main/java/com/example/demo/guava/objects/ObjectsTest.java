package com.example.demo.guava.objects;

import com.example.demo.guava.beans.Student;
import com.google.common.base.Objects;
import org.junit.Test;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ ObjectsTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/11/4 14:03
 * @Version ： 1.0
 **/
public class ObjectsTest {

    @Test
    public void test_01(){
        Student s1 = new Student("Mahesh", "Parashar", 1, "VI");
        Student s2 = new Student("Suresh", null, 3, null);

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
    }

    @Test
    public void test_02(){

    }

    @Test
    public void test_03(){

    }
}
