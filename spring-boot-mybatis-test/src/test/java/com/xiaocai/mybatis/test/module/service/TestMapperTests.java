package com.xiaocai.mybatis.test.module.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ TestMapperTests ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/15 19:10
 * @Version ： 1.0
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMapperTests {

    @Autowired
    TestService testService ;

    @Test
    public void test_21(){


        testService.testMater();
    }
}
