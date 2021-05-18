package com.example.temp.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @HystrixCommand
    public String test(){
        return "111";
    }
}