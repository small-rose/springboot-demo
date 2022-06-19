package com.xiaocai.demo.mockito.web.service.impl;

import com.alibaba.fastjson2.JSON;
import com.xiaocai.demo.mockito.web.entity.Account;
import com.xiaocai.demo.mockito.web.exception.ValidateException;
import com.xiaocai.demo.mockito.web.mapper.AccountMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.mockito.*;

import java.util.Date;

@Slf4j
class AccountServiceImplTest {

    @InjectMocks
    @Spy
    AccountServiceImpl accountService;
    @Mock
    AccountMapper accountMapper ;


    @BeforeEach
    void setUp() {
        //MockitoAnnotations.initMocks(this);
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("AccountServiceImpl 测试")
    public void addAccount(){
        Account account = new Account();
        account.setAddDate(new Date());
        account.setDescription("测试description");
        // 测试账户名为空
        account.setName("");
        account.setPass("123");
        try {
            accountService.addAccount(account);
        } catch (Exception  e) {
            Assertions.assertTrue(e instanceof ValidateException);
        }
        // 测试密码为空
        account.setName("jack");
        account.setPass("");
        try {
            accountService.addAccount(account);
            Assertions.fail("这里会有异常");
        } catch (Exception  e) {
            Assertions.assertTrue(e instanceof ValidateException);
        }
        account.setPass("123");
        // 工具类mock
        //MockedStatic<Md5Utils> md5UtilsMocked = Mockito.mockStatic(Md5Utils.class);
        //md5UtilsMocked.when(()->Md5Utils.string2MD5("123")).thenReturn("abc");

        try {
            String text = JSON.toJSONString(account); //序列化
            log.debug("account :" +text);
            boolean result = accountService.addAccount(account);
            log.debug("---result = " +result);
            Assertions.assertTrue(result);
        } catch (Exception  e) {
            Assertions.assertTrue(e instanceof ValidateException);
        }

        // mock  accountMapper.insert发生异常情况
        Mockito.when(accountMapper.insert(account)).thenThrow(new RuntimeException("mock exception"));
         try {
            boolean result = accountService.addAccount(account);
            log.debug("---mock mapper 异常 result = " +result);
            Assertions.assertFalse(result);
        } catch (Exception  e) {
            e.printStackTrace();
        }
    }

    @AfterEach
    void tearDown() {
        log.info("测试结束");
    }
}