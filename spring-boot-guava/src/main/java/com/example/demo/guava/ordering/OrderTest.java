package com.example.demo.guava.ordering;

import com.google.common.collect.Ordering;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
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
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(new Integer(5));
        numbers.add(new Integer(2));
        numbers.add(new Integer(15));
        numbers.add(new Integer(51));
        numbers.add(new Integer(53));
        numbers.add(new Integer(35));
        numbers.add(new Integer(45));
        numbers.add(new Integer(32));
        numbers.add(new Integer(99));
        numbers.add(new Integer(16));

        // 自然排序
        Ordering<Integer> ordering = Ordering.natural();
        System.out.println("List is sorted: " + ordering.isOrdered(numbers));
        System.out.println("Minimum: " + ordering.min(numbers));
        System.out.println("Maximum: " + ordering.max(numbers));

        Collections.sort(numbers, ordering.reverse());
        System.out.println("Reverse: " + numbers);

        numbers.add(null);
        System.out.println("Null added to Sorted List: ");
        System.out.println(numbers);

        Collections.sort(numbers, ordering.nullsFirst());
        System.out.println("Null first Sorted List: ");
        System.out.println(numbers);

    }

    @Test
    public void test03(){
        List<String> names = new ArrayList<String>();
        names.add("Ram");
        names.add("Shyam");
        names.add("Mohan");
        names.add("Sohan");
        names.add("Ramesh");
        names.add("Suresh");
        names.add("Naresh");
        names.add("Mahesh");
        names.add(null);
        names.add("Vikas");
        names.add("Deepak");

        System.out.println("Another List: ");
        System.out.println(names);

        // 自然排序
        Ordering<String> ordering = Ordering.natural();

        Collections.sort(names, ordering.nullsFirst().reverse());
        System.out.println("Null first then reverse sorted list: ");
        System.out.println(names);

    }
}
