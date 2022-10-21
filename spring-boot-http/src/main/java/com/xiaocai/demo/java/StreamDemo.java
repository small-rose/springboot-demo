package com.xiaocai.demo.java;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ StreamDemo ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/11/2 10:14
 * @Version ： 1.0
 **/
public class StreamDemo {
    @Test
    public void test_1(){
        List<String> list = new ArrayList<>(1000);
        for (int i = 0; i < 1000 ; i++) {
            list.add(i +"");
        }
        List<String> collect = list.stream().parallel().limit(500).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);

    }
    @Test
    public void test_26(){
        int szie =1 ;
        BigDecimal result = new BigDecimal(szie).multiply(new BigDecimal(0.20)).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(Math.ceil(result.doubleValue()));
        System.out.println((int)Math.ceil(result.doubleValue()));

    }

    @Test
    public  void main1() {

        List<String> collect = Stream.of("1","2","3")
                .map(Arrays::asList).reduce(new ArrayList<String>(), (y, z)->{ y.addAll(z); return y;});
        System.out.println(collect);


        /**
         * 先对名字进行分组，然后按照年龄进行分组
         */
        Map<String, Map<Object, List<Person>>> map = Stream.of(
                new Person("张三", 18, 175),
                new Person("李四", 22, 177),
                new Person("张三", 14, 165),
                new Person("李四", 15, 166),
                new Person("张三", 19, 182))
                .collect(Collectors.groupingBy(Person::getName,
                        Collectors.groupingBy(p -> p.getAge() >= 18 ? "成年" : "未成年")));
        map.forEach((k, v) -> System.out.println("k=" + k + "\t" + "v=" + v));
        /**
         * 先对年龄进行分组，然后按照身高进行分组
         */
        Map<String, Map<Object, List<Person>>> map1 = Stream.of(
                new Person("张三", 18, 175),
                new Person("李四", 22, 177),
                new Person("张三", 14, 165),
                new Person("李四", 15, 166),
                new Person("李四", 15, 176),
                new Person("李四", 15, 176),
                new Person("张三", 19, 182))
                .collect(Collectors.groupingBy(p -> p.getAge() >= 18 ? "成年" : "未成年",
                        Collectors.groupingBy(p -> p.getHeight() >= 175 ? "大高个儿" : "矮子儿")));
        map1.forEach((k, v) -> System.out.println("k=" + k + "\t" + "v=" + v));
    }


    @AllArgsConstructor
    @Data
    static class Person{
        String name ;
        int age ;
        int height ;
    }
}
