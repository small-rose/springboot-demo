package com.xiaocai.demo.mybatisplus.web.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaocai.demo.mybatisplus.web.entity.Account;
import com.xiaocai.demo.mybatisplus.web.mapper.AccountMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ AccountService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/3 16:53
 * @Version ： 1.0
 **/
@Slf4j
@Service
@AllArgsConstructor
public class AccountService {


    private final AccountMapper accountMapper ;


    public  List<Account> list(){
        return accountMapper.selectAll();
    }



    public  Page<Account> selectAllByPages(int current, int pageSize, Account account){
        Page page = new Page(current,pageSize );
        return accountMapper.selectAllByPages(page, account);
    }

    public  IPage<Account> selectAllByPagesCount(int current, int pageSize, Account account){
        Page page = new Page(current,pageSize );
        // 执行自己写的count
        page.setCountId("selectAllByPagesCount");
        return accountMapper.selectAllByPages(page, account);
    }

    public  IPage<Account> selectAllWithParamsByPages(int current, int pageSize, Account account){
        //logm
        log.info("selectAllWithParamsByPages.params... current:{}, pageSize:{}, account:{}", current, pageSize, account);

        Page<Account> page = new Page<Account>(current,pageSize);
        page =  accountMapper.selectAllWithParamsByPages(page, account);
        //logr
        log.info("selectAllWithParamsByPages() returned: " +  page);
        return page;
    }


    public List<Account> selectList(Account account) {

        QueryWrapper<Account> queryWrapper = new QueryWrapper<>();
        queryWrapper//.isNull("description")
                .eq("pass", "456")
                .isNotNull("description")
        ;
        return accountMapper.selectList(queryWrapper);
    }



    public Account selectOne(Long id) {

        return accountMapper.selectAccountById(id);
    }
}
