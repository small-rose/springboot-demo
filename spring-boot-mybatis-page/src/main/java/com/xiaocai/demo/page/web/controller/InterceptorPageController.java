package com.xiaocai.demo.page.web.controller;

import com.xiaocai.demo.page.interceptor.AccountService;
import com.xiaocai.demo.page.web.model.Account;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ InterceptorPageController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/1 14:28
 * @Version ： 1.0
 **/

@RestController
@AllArgsConstructor
public class InterceptorPageController {


    private final AccountService accountService;


    /**
     *  拦截器分页测试入口
     *
     * @param pageNum
     * @param pageSize
     * @param account
     * @return
     */
    @GetMapping(value = "interceptor/{pageNum}/{pageSize}")
    public Map<String, Object> interceptorList(@PathVariable(name="pageNum", required = false)int pageNum,
                                         @PathVariable(name="pageSize", required = false)int pageSize,
                                         Account account){
        if (pageNum==0 || pageSize==0){
            pageNum = 1 ;
            pageSize = 10 ;
        }
        Map<String,Object> response = new HashMap<>();
        response.put("pageNum", pageNum);
        response.put("pageSize", pageSize);

        account.setPageNum(pageNum);
        account.setPageSize(pageSize);
        List<Account> result = accountService.getAllAccountsByPage(account);


        response.put("data", result);
        return response ;
    }


}
