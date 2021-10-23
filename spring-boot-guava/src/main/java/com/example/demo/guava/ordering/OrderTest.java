package com.example.demo.guava.ordering;

import com.google.common.collect.Ordering;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ OrderTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/27 20:09
 * @Version ： 1.0
 **/
public class OrderTest {

    /**
     * 自然排序
     */
    @Test
    public void test01() {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(new Integer(5));
        numbers.add(new Integer(2));
        numbers.add(new Integer(15));
        numbers.add(new Integer(51));
        numbers.add(new Integer(53));
        numbers.add(new Integer(35));
        numbers.add(new Integer(45));
        numbers.add(new Integer(32));
        numbers.add(new Integer(43));
        numbers.add(new Integer(16));


        System.out.println("Input List: ");
        System.out.println(numbers);

        // 自然排序
        Ordering<Integer> ordering = Ordering.natural();
        Collections.sort(numbers, ordering );
        System.out.println("Sorted List: ");
        System.out.println(numbers);

        // 按字符串排序
        Collections.sort(numbers, Ordering.usingToString() );
        System.out.println("Sorted List: ");
        System.out.println(numbers);
    }

    /**
     * 自然排序
     */
    @Test
    public void test02() {

    }
}
