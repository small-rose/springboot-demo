package com.xiaocai.demo;

import com.xiaocai.demo.unirest.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ DemoTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/28 17:54
 * @Version ： 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTest {

    @Autowired
    DemoService demoService ;

    @Test
    public void test01(){
        demoService.hello();
    }

    @Test
    public void test02(){
        Integer a = 1000 , b =1000;
        Integer c = 100 , d = 100;

        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(Integer.MAX_VALUE);


        List<String> collect = Stream.of("1,2,3".split(",")).collect(Collectors.toList());
        System.out.println(collect);

    }
}
