package com.xiaocai.jpa.demo.web.service.impl;

import com.xiaocai.jpa.demo.web.dao.AccountRepository;
import com.xiaocai.jpa.demo.web.entity.Account;
import com.xiaocai.jpa.demo.web.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ AccountServiceImpl ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/6 11:08
 * @Version ： 1.0
 **/
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository ;

    @Override
    public List<Account> listAll() {
        return accountRepository.findAll();
    }

    @Override
    public Page<Account> selectAllByPages(Pageable pageable, Account account) {

        return null;
    }
}
