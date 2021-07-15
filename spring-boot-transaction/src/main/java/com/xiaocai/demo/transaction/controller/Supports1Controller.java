package com.xiaocai.demo.transaction.controller;

import com.xiaocai.demo.transaction.service.supports.UserSupportsService;
import com.xiaocai.demo.transaction.vo.AccountVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import com.xiaocai.demo.transaction.service.supports.OneSupportsService;
import javax.annotation.Resource;

/**
 * @program: springboot-demo
 * @description
 *
 * SUPPORTS:如果有事务在运行，当前的方法就在这个事务内运行，否则它可以不运行在事务中
 *
 * NOT_SUPPORTED ：以非事务方式执行操作，如果当前存在事务，就把当前事务挂起。
 *
 * NEVER：以非事务方式执行，如果当前存在事务，则抛出异常。
 *
 * MANDATORY：支持当前事务，如果当前没有事务，就抛出异常。
 *
 * NESTED：如果当前存在事务，则在嵌套事务内执行。如果当前没有事务，则进行与REQUIRED类似的操作。
 *         拥有多个可以回滚的保存点，内部回滚不会对外部事务产生影响。只对DataSourceTransactionManager有效
 *
 * @function:
 * @author: zzy
 * @create: 2021-07-02 09:48
 **/

@RestController
@Slf4j
@Api(tags = "SUPPORTS 事务测试")
@RequestMapping(value = "/supports1")
public class Supports1Controller {
    @Resource
    private UserSupportsService userSupportsService;
    @Resource
    private OneSupportsService oneSupportsService;

    @ApiOperation("1个service：非事务测试")
    @PostMapping(value = "/noTrans/normal", produces = "application/json;charset=utf-8")
    public String supports_no_transaction_normal(@RequestBody AccountVO accountVO){
        try {
            log.info("事务传播-- Propagation.SUPPORTS  1 个 service 正常测试");
            oneSupportsService.saveUserNoTransaction(accountVO);
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
        return "SUCCESS";
    }

    @ApiOperation("1个service：事务测试：正常测试")
    @PostMapping("/trans/normal")
    public String supports_transaction_normal(@RequestBody AccountVO accountVO){

        try {

            log.info("事务传播-- Propagation.SUPPORTS -- 1 个Service 正常测试");
            oneSupportsService.saveUserWithTransaction(accountVO);

        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }

        return "SUCCESS";
    }

    @ApiOperation("1个service：事务测试：内部异常，外层不处理，回滚测试")
    @PostMapping("/innerRollBack")
    public String supports_inner1(@RequestBody AccountVO accountVO){
        log.info("事务传播-- Propagation.SUPPORTS -- 同一个Service 内部异常，外层处理的 回滚测试");
        try {
            userSupportsService.saveUserNoTransactionInnerThrow(accountVO);
            oneSupportsService.saveUserWithTransactionOuterThrowException(accountVO);
        }catch (Exception e){
            e.printStackTrace();
        }

        return "SUCCESS";
    }
}
