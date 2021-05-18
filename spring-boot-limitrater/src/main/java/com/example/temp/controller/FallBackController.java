package com.example.temp.controller;

import com.example.temp.annotation.RateLimiter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-redis
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-18 12:41
 **/
@RestController
public class FallBackController {

    @RateLimiter
    @RequestMapping("/test")
    public String test(){
        return "111";
    }
}
