package com.example.temp.controller;

import com.example.temp.annotation.RateLimitFCL;
import com.example.temp.annotation.RateLimitSWL;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @program: springboot-redis
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-18 12:41
 **/
@RestController
public class FallBackController {

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
}
