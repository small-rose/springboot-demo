package com.xiaocai.demo.unirest.client;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequestWithBody;
import org.junit.Test;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ UnirestPostDemo ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/28 14:17
 * @Version ： 1.0
 **/
public class UnirestPostDemo {

    @Test
    public void test01() throws UnirestException {

        HttpRequestWithBody req = Unirest.post("http://localhost:9028/httpDemo/rest/postData");

        HttpResponse<String> result = req.queryString("name", "Mark")
                .field("user", "xiaocai")
                .field("pass", "123456")
                .asString();
        System.out.println("Status: " + result.getStatus());
        System.out.println("StatusText: " +result.getStatusText());
        System.out.println("Headers: " +result.getHeaders());
        System.out.println("Body: " +result.getBody());
        System.out.println("RawBody: " +result.getRawBody());
    }

    @Test
    public void test02() throws UnirestException {
        HttpResponse<JsonNode> result = Unirest.post("http://localhost:9028/httpDemo/rest/postData")
                .queryString("name", "Mark")
                .field("user","xiaocai")
                .field("pass", "123456")
                .asJson();
        System.out.println("Status: " + result.getStatus());
        System.out.println("StatusText: " +result.getStatusText());
        System.out.println("Headers: " +result.getHeaders());
        System.out.println("Body: " +result.getBody());
        System.out.println("RawBody: " +result.getRawBody());
    }
}
