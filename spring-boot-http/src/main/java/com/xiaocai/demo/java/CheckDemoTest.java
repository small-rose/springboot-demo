package com.xiaocai.demo.java;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ CheckDemoTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/6 20:18
 * @Version ： 1.0
 **/

@Slf4j
public class CheckDemoTest {


    public  boolean isInteger(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public  boolean isContainChinese(String str) {
        Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
        Matcher m = p.matcher(str);
        if (m.find()) {
            return true;
        }
        return false;
    }

    @Test
    public void checkTest(){
        String checkNo = "111给个中文试试" ;
        log.info(String.valueOf(isContainChinese(checkNo)));
    }
}
