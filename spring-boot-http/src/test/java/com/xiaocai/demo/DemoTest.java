package com.xiaocai.demo;

import com.xiaocai.demo.unirest.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
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
}
