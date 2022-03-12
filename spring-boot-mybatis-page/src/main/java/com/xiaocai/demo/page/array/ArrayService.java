package com.xiaocai.demo.page.array;

import com.xiaocai.demo.page.web.mapper.AccountMapper;
import com.xiaocai.demo.page.web.model.Account;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ ArrayService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/1 13:36
 * @Version ： 1.0
 **/
@Service
@AllArgsConstructor
public class ArrayService {

    private final AccountMapper accountMapper ;

    /**
     * 使用数据进行逻辑分页
     * @param account
     * @return
     */
    public List<Account>  arrayPage(Account account) {

        //查出全部数据
        List<Account> accounts = accountMapper.selectAll();

        int currPage  = account.getPageNum();
        int pageSize  = account.getPageSize();

        //从第几条数据开始
        int firstIndex = (currPage - 1) * pageSize;
        //到第几条数据结束
        int lastIndex = currPage * pageSize;

        return   accounts.subList(firstIndex, lastIndex); //直接在list中截取
    }
}
