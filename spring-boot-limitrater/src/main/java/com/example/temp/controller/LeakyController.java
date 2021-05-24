package com.example.temp.controller;

import com.example.temp.annotation.RateLimitFCL;
import com.example.temp.annotation.RateLimitLBL;
import com.example.temp.annotation.RateLimitTBL;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: springboot-limiter
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-24 15:06
 **/
@RestController
public class LeakyController {

    @RateLimitLBL(failBack = "leaky1FallBack", maxLimit=3 )
    @RequestMapping("/leaky1")
    public String leaky1(){
        return "SUCCESS api leaky1";
    }

    @RateLimitLBL(failBack = "f2FallBack" , maxLimit=5, initialDelay = 2, leakNum = 1, period = 10)
    @RequestMapping("/leaky2")
    public Map<String, Object> leaky2(){
        Map<String, Object> result = new HashMap(3);
        result.put("code", 200);
        result.put("msg","处理成功！");
        result.put("data", new ArrayList<>());
        return result ;
    }

    public Map<String, Object> f2FallBack(){
        Map<String, Object> result = new HashMap();
        result.put("code", 888);
        result.put("msg","系统繁忙，稍后再试");
        result.put("data", "降级返回的数据");
        return result ;
    }

    public String leaky1FallBack(){
        return "嘿嘿嘿~~~系统繁忙，请稍后再试！";
    }
}
