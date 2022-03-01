package com.xiaocai.demo.page.interceptor;

import com.xiaocai.demo.page.web.mapper.AccountMapper;
import com.xiaocai.demo.page.web.model.Account;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ AccountService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/1 14:17
 * @Version ： 1.0
 **/
@Service
@AllArgsConstructor
public class AccountService {

    private final AccountMapper accountMapper ;


    /**
     *  拦截器分页，注意和拦截器定义的规则一致，以 ByPage  结尾
     * @param account
     * @return
     */
    public List<Account> getAllAccountsByPage(Account account) {

        return accountMapper.getAllAccountsByPage(account.getPageNum(), account.getPageSize()) ;
    }
}
