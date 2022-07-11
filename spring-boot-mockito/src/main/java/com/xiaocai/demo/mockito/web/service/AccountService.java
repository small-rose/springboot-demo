package com.xiaocai.demo.mockito.web.service;

import com.xiaocai.demo.mockito.web.entity.Account;

import java.util.List;

public interface AccountService {


    public List<Account> getList();


    public boolean addAccount(Account account) throws Exception;
}
