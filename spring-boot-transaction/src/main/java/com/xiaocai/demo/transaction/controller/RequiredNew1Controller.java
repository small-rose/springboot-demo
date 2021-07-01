package com.xiaocai.demo.transaction.controller;

import com.xiaocai.demo.transaction.requiredNew.UserBizService;
import com.xiaocai.demo.transaction.vo.AccountVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Propagation;
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
public class RequiredNew1Controller {

    @Resource
    UserBizService userBizService;

    @RequestMapping("/reqNew/normal1")
    public String requiredNew_normal(AccountVO accountVO){
        log.info("事务传播-- Propagation.REQUIRES_NEW  1个service 正常测试");
        userBizService.saveUserBizNormal(accountVO);
        return "SUCCESS";
    }


    @RequestMapping("/reqNew/inner1")
    public String requiredNew_inner1(AccountVO accountVO){
        log.info("事务传播-- Propagation.REQUIRES_NEW -- 同一个Service 内部异常，外层不处理的 回滚测试");
        try {
            userBizService.saveUserBizInnerThrowException(accountVO);
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }

        return "SUCCESS";
    }

    @RequestMapping("/reqNew/inner2")
    public String requiredNew_inner2(AccountVO accountVO){
        log.info("事务传播-- Propagation.REQUIRES_NEW -- 同一个Service 内部异常，外层处理的 回滚测试");
        try {
            userBizService.saveUserBizInnerTryThrowException(accountVO);
        }catch (Exception e){
            e.printStackTrace();
        }

        return "SUCCESS";
    }


}
