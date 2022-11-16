package com.xiaocai.demo.mpbatch.web.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaocai.demo.mpbatch.web.entity.Account;
import com.xiaocai.demo.mpbatch.web.mapper.AccountMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ AccountService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/3 16:53
 * @Version ： 1.0
 **/
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
        Page page = new Page(current,pageSize);
        return accountMapper.selectAllWithParamsByPages(page, account);
    }


    public List<Account> selectList(Account account) {

        QueryWrapper<Account> queryWrapper = new QueryWrapper<>();
        queryWrapper//.isNull("description")
                .eq("pass", "456")
                .isNotNull("description")
        ;
        return accountMapper.selectList(queryWrapper);
    }

    /**
     * 自定义的批量写入
     * @param
     * @return
     */
    public int batchInsert() {
        List<Long> idList = new ArrayList<>();
        for (int i = 1; i< 10; i++) {
            idList.add(100L+i);
        }
        accountMapper.deleteBatchIds(idList);

        List<Account> list = new ArrayList<>();
        for (int i = 1; i< 10; i++) {
            Account a1 = new Account(100L+i, "测试"+String.format("%03d", i), "123", new Date(), new Date(), 22L, "test"+String.format("%03d", i));
            list.add(a1);
        }
        return accountMapper.insertBatchList(list);
    }

    /**
     * 自定义的批量更新
     * @param
     * @return
     */
    public int batchUpdate() {

        List<Account> list = new ArrayList<>();
        for (int i = 1; i< 101; i++) {
            Account a1 = new Account(100L+i, "测试"+String.format("%03d", i), "123", new Date(), new Date(), 22L, "这是我的修改的描述"+String.format("%03d", i));
            list.add(a1);
        }
        return accountMapper.updateBatchList(list);
    }



}
