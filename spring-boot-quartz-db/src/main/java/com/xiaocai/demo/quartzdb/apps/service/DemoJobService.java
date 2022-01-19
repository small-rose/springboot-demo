package com.xiaocai.demo.quartzdb.apps.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ DemoJobService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/19 11:23
 * @Version ： 1.0
 **/
@Slf4j
@Service
public class DemoJobService {

    public String doWork01() {

        log.info("执行 doWork01 ...");
        return "SUCCESS";
    }


    public String doWork02() {

        log.info("执行 doWork02 ...");
        return "SUCCESS";
    }


    public String doFirstJobWork() {

        log.info("执行 doFirstJob Work ...");
        return "SUCCESS";
    }

    public String doSecondJobWork() {

        log.info("执行 doSecondJob Work...");
        return "SUCCESS";
    }

    public String doThirdJobWork() {

        log.info("执行 doThirdJob Work...");
        return "SUCCESS";
    }
}
