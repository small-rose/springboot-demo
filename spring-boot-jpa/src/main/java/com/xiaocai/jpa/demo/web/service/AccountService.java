package com.xiaocai.jpa.demo.web.service;


import com.xiaocai.jpa.demo.web.entity.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AccountService {

    public List<Account> listAll();



    public Page<Account> selectAllByPages(Pageable pageable, Account account);
}
