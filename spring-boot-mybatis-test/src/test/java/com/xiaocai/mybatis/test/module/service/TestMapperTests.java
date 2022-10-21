package com.xiaocai.mybatis.test.module.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    @Test
    public void testMysql_update(){


        testService.testMysqlUpdate();
    }



    @Test
    public void testTemporaryTable(){


        testService.testTemporaryTable();
    }



    @Test
    public void testKbDate() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = dateFormat.format(new Date());
        Date parse = dateFormat.parse(format);
        String val = testService.getNextDay(new Timestamp(parse.getTime()));
        System.out.println("val : "+val);

    }
    @Test
    public void testKbDate2(){

        String var = testService.getNextDay2("2022-07-26");
        System.out.println("var : "+var);

    }
}
