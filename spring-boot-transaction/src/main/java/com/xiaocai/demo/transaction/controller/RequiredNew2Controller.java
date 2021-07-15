package com.xiaocai.demo.transaction.controller;

import com.xiaocai.demo.transaction.service.requiredNew.*;
import com.xiaocai.demo.transaction.vo.AccountVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: springboot-demo
 * @description  REQUIRED
 *
 * REQUIRED：支持当前事务，如果当前没有事务，就新建一个事务。这是最常见的选择。
 * REQUIRES_NEW
 *
 * 事务传播行为：REQUIRES_NEW
 *
 *(2) 在不同的service内的两个事务方法
 * 如果在不同的service中定义的两个方法， 内层REQUIRES_NEW会开启新的事务，并且二者独立，事务回滚互不影响。
 *
 * @function:
 * @author: zzy
 * @create: 2021-07-01 17:08
 **/
@RestController
@Slf4j
@Api(tags = "REQUIRES_NEW 2个Service 嵌套事务")
@RequestMapping("/reqNew2")
public class RequiredNew2Controller {

    @Resource
    private UserService userService;

    @ApiOperation("2个service 中嵌套事务：正常测试")
    @PostMapping("/normal2")
    public String requiredNew_norma2(@RequestBody AccountVO accountVO){
        log.info("事务传播-- Propagation.REQUIRES_NEW  2个service 正常测试");
        try {
            userService.saveUserNormal(accountVO);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "SUCCESS";
    }


    @ApiOperation("2个service 中嵌套事务：仅外层事务异常，回滚测试")
    @PostMapping("/outer1")
    public String requiredNew_outer1(@RequestBody AccountVO accountVO){
        log.info("事务传播-- Propagation.REQUIRES_NEW -- 不同的2个Service 外层事务异常 回滚测试");
        try {
            userService.saveUserOuterThrowException(accountVO);
        }catch (Exception e){
            e.printStackTrace();
            return  "FAILED - " + e.getMessage();
        }
        return "SUCCESS";
    }

    @ApiOperation("2个service 中嵌套事务：内层事务异常，外层不处理 回滚测试")
    @PostMapping("/outer2")
    public String requiredNew_outer2(@RequestBody AccountVO accountVO){
        log.info("事务传播-- Propagation.REQUIRES_NEW -- 不同的2个Service 内层事务异常，外层不处理 回滚测试");
        try {
            userService.saveUserInnerThrowException(accountVO);
        }catch (Exception e){
            e.printStackTrace();
            return "内层回滚，外层不处理 - " + e.getMessage();
        }
        return "SUCCESS";
    }

    @ApiOperation("2个service 中嵌套事务：内层事务异常，外层try处理 回滚测试")
    @PostMapping("/outer3")
    public String requiredNew_outer3(@RequestBody AccountVO accountVO){
        log.info("事务传播-- Propagation.REQUIRES_NEW -- 不同的2个Service 内层事务异常，外层try处理 回滚测试");
        try {
            userService.saveUserInnerTryException(accountVO);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "SUCCESS";
    }
}
