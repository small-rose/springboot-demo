package com.example.temp.controller;

import com.example.temp.annotation.RateLimitFCL;
import com.example.temp.annotation.RateLimitSWL;
import com.example.temp.annotation.RateLimitTBL;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/22 16:48
 * @version: v1.0
 */
@RestController
public class LimitExampleController {


    @RateLimitSWL
    @RequestMapping("/test1")
    public String test(){
        return "SUCCESS API";
    }


    @RateLimitSWL
    @RequestMapping("/test2")
    public String test2(){
        return "SUCCESS API";
    }

    @RateLimitFCL(timeUnit = TimeUnit.SECONDS)
    @RequestMapping("/test3")
    public String test3(){
        return "SUCCESS API";
    }


    @RateLimitTBL(maxLimit=3 ,createPeriod = 5)
    @RequestMapping("/test4")
    public String test4(){
        return "SUCCESS api test4";
    }
}
