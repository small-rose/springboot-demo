package com.xiaocai.demo.transaction.controller;


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
import com.xiaocai.demo.transaction.service.requiredNew.*;
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
 * (1) 在相同的service内的两个事务方法
 * 如果在同一个service类中定义的两个方法， 内层REQUIRES_NEW并不会开启新的事务，save和update中回滚都会导致整个事务的回滚
 *
 * @function:
 * @author: zzy
 * @create: 2021-07-01 17:08
 **/
@RestController
@Slf4j
@Api(tags = "REQUIRES_NEW 1个Service 嵌套事务")
@RequestMapping("/reqNew")
public class RequiredNew1Controller {

    @Resource
    private UserBizService userBizService;

    @ApiOperation("1个service 中嵌套事务正常测试")
    @PostMapping(value = "/normal1", params = {"application/json"})
    public String requiredNew_normal(@RequestBody AccountVO accountVO){
        log.info("事务传播-- Propagation.REQUIRES_NEW  1个service 内部嵌套事务 正常测试");
        userBizService.saveUserBizNormal(accountVO);
        return "SUCCESS";
    }

    @ApiOperation("1个service 中嵌套事务,内层事务异常，外层不处理的 回滚测试")
    @PostMapping("/inner1")
    public String requiredNew_inner1(@RequestBody AccountVO accountVO){
        log.info("事务传播-- Propagation.REQUIRES_NEW -- 同一个Service 内部异常，外层不处理的 回滚测试");
        try {
            userBizService.saveUserBizInnerThrowException(accountVO);
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }

        return "SUCCESS";
    }

    @ApiOperation("1个service 中嵌套事务,内层事务异常，外层处理的 回滚测试")
    @PostMapping("/inner2")
    public String requiredNew_inner2(@RequestBody AccountVO accountVO){
        log.info("事务传播-- Propagation.REQUIRES_NEW -- 同一个Service 内部异常，外层处理的 回滚测试");
        try {
            userBizService.saveUserBizInnerTryThrowException(accountVO);
        }catch (Exception e){
            e.printStackTrace();
        }

        return "SUCCESS";
    }




}
