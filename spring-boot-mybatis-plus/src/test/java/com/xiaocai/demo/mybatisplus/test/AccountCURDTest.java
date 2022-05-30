package com.xiaocai.demo.mybatisplus.test;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaocai.demo.mybatisplus.MybatisPlusDemoApplication;
import com.xiaocai.demo.mybatisplus.web.entity.Account;
import com.xiaocai.demo.mybatisplus.web.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ SelectTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/3 17:26
 * @Version ： 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes= MybatisPlusDemoApplication.class)
public class AccountCURDTest {

    @Autowired
    AccountService accountService ;

    @Test
    public void test01(){
        List<Account> list = accountService.list();
        System.out.println(list.size());
    }
    @Test
    public void test02(){
        Account account = new Account();
        account.setPass("123");
        IPage<Account> list = accountService.selectAllByPages(1,5, account);
        System.out.println(list.getSize());
    }

    @Test
    public void test02Count(){
        Account account = new Account();
        account.setPass("123");
        IPage<Account> list = accountService.selectAllByPagesCount(1,5, account);
        System.out.println(list.getSize());
    }

    @Test
    public void test03Params(){
        Account account = new Account();
        account.setPass("456");
        IPage<Account> list = accountService.selectAllWithParamsByPages(1,5, account);
        System.out.println(list.getSize());
    }


    @Test
    public void test03Wapper(){
        Account account = new Account();
        account.setPass("456");
        List<Account> list = accountService.selectList(account);
        System.out.println(list.size());
    }


    @Test
    public void test04(){
        Account account = accountService.selectOne(1L);
        System.out.println(account);
    }

    @Test
    public void test5(){
        Account account = new Account();
        account.setPass("456");
        Page<Account> page = new Page<Account>(1,2);
        List<Account> records = accountService.selectAllWithParamsByNoPagesTest(page, account);
        page.setRecords(records);
        System.out.println(page.getRecords().size());
    }

    @Test
    public void test6(){
        Account account = new Account();
        account.setPass("456");
        List<Account> pages = accountService.selectAllWithParamsByNoPagesTest(null, account);
        System.out.println(pages.size());
    }


    @Test
    public void test7(){
        Account account = new Account();
        account.setPass("456");
        Page<Account> page = new Page<Account>(1,2);
        accountService.selectAllWithParamsByPagesTest(null, account);
        System.out.println(page.getRecords().size());
    }
}
