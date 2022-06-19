package com.xiaocai.demo.mybatisplus.test;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaocai.demo.mybatisplus.MybatisPlusDemoApplication;
import com.xiaocai.demo.mybatisplus.web.entity.Account;
import com.xiaocai.demo.mybatisplus.web.service.AccountService;
import com.xiaocai.demo.mybatisplus.web.vo.AccountVo;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
        System.out.println(page.getTotal());
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
        System.out.println(page.getTotal());
    }



    @Test
    public void test8(){
        List<Long> passList = new ArrayList<>(3);
        passList.add(456L);
        passList.add(567L);
        passList.add(345L);
        Long[] pass = new Long[passList.size()];
        List<Account> result = accountService.selectAllByAccountPassList( passList.toArray(pass));
        System.out.println(result.size());
    }

    @Test
    public void test_date1() throws ParseException {
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date start = dateFormat1.parse("2022-03-22");
        Date end = dateFormat1.parse("2022-04-25");
        AccountVo accountVo = new AccountVo();
        accountVo.setStartDate(start);
        accountVo.setEndDate(end);
        List<Account> accounts = accountService.selectAllByAccountvoList(accountVo);
        System.out.println(accounts.size());

    }
    @Test
    public void testUpdateMoney() throws ParseException {
        BigDecimal money = new BigDecimal("1.10");
        Long id = 2L ;
        int result = accountService.updateMoneyByDecimal(money, id);
        Assertions.assertEquals(1,result);

    }

    @Test
    public void testUpdateMoney2() throws ParseException {
        String money = "1.50";
        Long id = 2L ;

        Account account = accountService.selectOne(id);
        System.out.println(" before : " +account.getBalance());
        int result = accountService.updateMoneyByString(money, id);
        Assertions.assertEquals(1,result);

        Account account1 = accountService.selectOne(id);
        System.out.println(" after : " +account1.getBalance());
    }
}
