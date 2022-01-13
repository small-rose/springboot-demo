package com.xiaocai.demo.java;

import com.xiaocai.demo.http.HttpNetUtil;
import org.junit.Test;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ HttpNetDemoTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/13 18:01
 * @Version ： 1.0
 **/
public class HttpNetDemoTest {

    @Test
    public void http(){
        String url = "https://www.jianshu.com/";
        String referer = "https://www.jianshu.com/";
        HttpNetUtil http = new HttpNetUtil();
        //http.httpjsonKillIp(url, referer,visitIP);


    }
}
