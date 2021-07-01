package com.xiaocai.demo.transaction.controller;

import com.xiaocai.demo.transaction.requiredNew.UserBizService;
import com.xiaocai.demo.transaction.requiredNew.UserService;
import com.xiaocai.demo.transaction.vo.AccountVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-07-01 17:08
 **/
@RestController
@Slf4j
public class RequiredNew2Controller {

    @Resource
    UserService userService;


    @RequestMapping("/reqNew/normal2")
    public String requiredNew_norma2(){
        log.info("事务传播-- Propagation.REQUIRES_NEW  2个service 正常测试");
        try {

        }catch (Exception e){
            e.printStackTrace();
        }
        return "SUCCESS";
    }



    @RequestMapping("/reqNew/outer1")
    public String requiredNew_outer1(){
        log.info("事务传播-- Propagation.REQUIRES_NEW -- 不同的2个Service 内部的 回滚测试");
        try {

        }catch (Exception e){
            e.printStackTrace();
        }
        return "SUCCESS";
    }


    @RequestMapping("/reqNew/outer2")
    public String requiredNew_outer2(){
        log.info("事务传播-- Propagation.REQUIRES_NEW -- 不同的2个Service 内部的 回滚测试");
        try {

        }catch (Exception e){
            e.printStackTrace();
        }
        return "SUCCESS";
    }
}
