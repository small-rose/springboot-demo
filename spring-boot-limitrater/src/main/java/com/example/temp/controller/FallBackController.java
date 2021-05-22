package com.example.temp.controller;

import com.example.temp.annotation.RateLimitFCL;
import com.example.temp.annotation.RateLimitFallBack;
import com.example.temp.annotation.RateLimitTBL;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: springboot-redis
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-18 12:41
 **/
@RestController
public class FallBackController {

    @RateLimitFallBack
    @RequestMapping("/fb")
    public String fallBack(){
        return "SUCCESS api fallBack";
    }

    @RateLimitTBL(failBack = "f1FallBack",maxLimit=3 ,createPeriod = 5)
    @RequestMapping("/f1")
    public String f1(){
        return "SUCCESS api f1";
    }

    @RateLimitFCL(failBack = "f2FallBack")
    @RequestMapping("/f2")
    public Map<String, Object> f2(){
        Map<String, Object> result = new HashMap();
        result.put("code", 200);
        result.put("msg","处理成功！");
        result.put("data", new ArrayList<>());
        return result ;
    }
    public Map<String, Object> f2FallBack(){
        Map<String, Object> result = new HashMap();
        result.put("code", 900);
        result.put("msg","系统繁忙，稍后再试");
        result.put("data", null);
        return result ;
    }

    public String f1FallBack(){
        return "系统繁忙，请稍后再试！";
    }

}
