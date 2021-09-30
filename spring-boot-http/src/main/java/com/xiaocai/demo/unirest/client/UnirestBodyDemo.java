package com.xiaocai.demo.unirest.client;

import com.alibaba.fastjson.JSONObject;
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
 * @Date ：2021/9/28 21:02
 * @Version ： 1.0
 **/
public class UnirestBodyDemo {

    @Test
    public void body01() throws UnirestException {

        HttpRequestWithBody req = Unirest.post("http://localhost:9028/httpDemo/rest/BodyData");

        Map<String, String> bodyMap = new HashMap();
        bodyMap.put("requestId", UUID.randomUUID().toString());

        String data = JSONObject.toJSONString(bodyMap);

        HttpResponse<JsonNode> result = req
                .body("I am body data!")
                .body(data)
                .asJson();
        System.out.println("Status: " + result.getStatus());
        System.out.println("StatusText: " +result.getStatusText());
        System.out.println("Headers: " +result.getHeaders());
        System.out.println("Body: " +result.getBody());
        System.out.println("RawBody: " +result.getRawBody());
    }



}
