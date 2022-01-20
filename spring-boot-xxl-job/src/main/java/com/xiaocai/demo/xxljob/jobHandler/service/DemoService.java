package com.xiaocai.demo.xxljob.jobHandler.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ DemoService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/20 14:32
 * @Version ： 1.0
 **/

@Slf4j
@Service
public class DemoService {

    public String demoWork01(){
        log.info("执行 DemoService.demoWork01  ...");
        return "SUCCESS";
    }


    public String demoWork02(){
        log.info("执行 DemoService.demoWork02 ...");
        return "SUCCESS";
    }
}
