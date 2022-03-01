package com.xiaocai.demo.page.sql;

import com.xiaocai.demo.page.web.mapper.AccountMapper;
import com.xiaocai.demo.page.web.model.Account;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ SqlService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/1 13:37
 * @Version ： 1.0
 **/
@Service
@AllArgsConstructor
public class SqlService {

    private final AccountMapper accountMapper ;


    /**
     *  SQL分页写在SQL语句中
     * @param account
     * @return
     */
    public List<Account> sqlPages(Account account) {

        return  accountMapper.selectAllByPages(account);
    }
}
