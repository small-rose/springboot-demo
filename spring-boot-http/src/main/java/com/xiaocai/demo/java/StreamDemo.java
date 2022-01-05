package com.xiaocai.demo.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

    public static void main(String[] args) {

        List<String> collect = Stream.of("1","2","3")
                .map(Arrays::asList).reduce(new ArrayList<String>(), (y, z)->{ y.addAll(z); return y;});
        System.out.println(collect);


    }
}
