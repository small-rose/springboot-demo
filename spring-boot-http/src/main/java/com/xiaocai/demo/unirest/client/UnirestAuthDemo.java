package com.xiaocai.demo.unirest.client;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequestWithBody;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ UnirestAuthDemo ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/28 20:32
 * @Version ： 1.0
 **/
public class UnirestAuthDemo {
    /**
     * Basic Authentication 认证
     * Unirest 会自动处理Base64编码部分，此认证建议使用HTTPS。
     * 请求头 "Authorization: Basic dXNlcjpwYXNzd29yZDEh"
     * @throws UnirestException
     */
    @Test
    public void test01() throws UnirestException {

        HttpRequestWithBody req = Unirest.post("http://localhost:9028/httpDemo/rest/AuthData");

        HttpResponse<JsonNode> result = req.queryString("name", "Mark")
                .basicAuth("small","123456")
                .asJson();
        System.out.println("Status: " + result.getStatus());
        System.out.println("StatusText: " +result.getStatusText());
        System.out.println("Headers: " +result.getHeaders());
        System.out.println("Body: " +result.getBody());
        System.out.println("RawBody: " +result.getRawBody());
    }

    /**
     *
     * @throws UnirestException
     */
    @Test
    public void test02() throws UnirestException {

        HttpRequestWithBody req = Unirest.post("http://localhost:9028/httpDemo/rest/HeadData");

        Map<String, String> headerMap = new HashMap();
        headerMap.put("Accept", "application/json");
        headerMap.put("TraceId", UUID.randomUUID().toString());
        HttpResponse<JsonNode> result = req.queryString("name", "Mark")
                //.basicAuth("small","123456")\
                .header("Content-Type","application/json")
                .headers(headerMap)
                .asJson();
        System.out.println("Status: " + result.getStatus());
        System.out.println("StatusText: " +result.getStatusText());
        System.out.println("Headers: " +result.getHeaders());
        System.out.println("Body: " +result.getBody());
        System.out.println("RawBody: " +result.getRawBody());
    }
}
