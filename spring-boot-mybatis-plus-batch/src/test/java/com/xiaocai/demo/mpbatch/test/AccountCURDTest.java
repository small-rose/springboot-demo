package com.xiaocai.demo.mpbatch.test;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaocai.demo.mpbatch.MybatisPlusBatchApplication;
import com.xiaocai.demo.mpbatch.web.entity.Account;
import com.xiaocai.demo.mpbatch.web.service.AccountService;
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
@SpringBootTest(classes= MybatisPlusBatchApplication.class)
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

    /**
     * 自定义的批量插入测试
     */
    @Test
    public void testInsertBatch(){
        int update =  accountService.batchInsert();
        System.out.println("受影响行数--"+update);
    }
    /**
     * 自定义的批量更新测试
     */
    @Test
    public void testUpdateBatch(){
        int update =  accountService.batchUpdate();
        System.out.println("受影响行数--"+update);
    }



}
