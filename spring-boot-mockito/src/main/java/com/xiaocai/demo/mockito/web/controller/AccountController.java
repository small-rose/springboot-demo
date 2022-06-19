package com.xiaocai.demo.mockito.web.controller;

import com.xiaocai.demo.mockito.web.entity.Account;
import com.xiaocai.demo.mockito.web.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/5/15 14:33
 * @version: v1.0
 */
@RestController
public class AccountController {

    @Autowired
    private AccountServiceImpl accountService ;
    @GetMapping
    public List<Account> getList(){
        return accountService.getList();
    }
}
