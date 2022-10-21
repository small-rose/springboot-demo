package com.xiaocai.demo.unirest.client;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.HttpRequest;
import org.junit.Test;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ UnirestDemo ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/28 13:32
 * @Version ： 1.0
 **/
public class UnirestGetDemo {

    @Test
    public void test01() throws UnirestException {
        GetRequest getRequest = Unirest.get("http://localhost:9028/httpDemo/rest/getData");
        getRequest.queryString("name", "Mark");
        // getRequest.asString();
        HttpResponse<String> stringResult = getRequest.asString();

        System.out.println("Status: " + stringResult.getStatus());
        System.out.println("StatusText: " +stringResult.getStatusText());
        System.out.println("Headers: " +stringResult.getHeaders());
        System.out.println("Body: " +stringResult.getBody());
        System.out.println("RawBody: " +stringResult.getRawBody());
    }



    @Test
    public void test02() throws UnirestException {
        HttpResponse<String> stringResult = Unirest.get("http://localhost:9028/httpDemo/rest/getData")
                .queryString("name", "abcd")
                .asString();

        System.out.println("Status：" + stringResult.getStatus());
        System.out.println("StatusText：" +stringResult.getStatusText());
        System.out.println("Headers：" +stringResult.getHeaders());
        System.out.println("Body：" +stringResult.getBody());
        System.out.println("RawBody：" +stringResult.getRawBody());
    }


    @Test
    public void test02() throws UnirestException {
        HttpResponse<String> stringResult = Unirest.get("http://localhost:9028/httpDemo/rest/getData")
                .queryString("name", "abcd")
                .asString();

        System.out.println("Status：" + stringResult.getStatus());
        System.out.println("StatusText：" +stringResult.getStatusText());
        System.out.println("Headers：" +stringResult.getHeaders());
        System.out.println("Body：" +stringResult.getBody());
        System.out.println("RawBody：" +stringResult.getRawBody());
    }
}
