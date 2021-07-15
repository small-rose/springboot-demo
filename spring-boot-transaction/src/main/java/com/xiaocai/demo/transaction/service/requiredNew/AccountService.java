package com.xiaocai.demo.transaction.service.requiredNew;

import com.xiaocai.demo.transaction.entity.AccountRecord;
import com.xiaocai.demo.transaction.mapper.AccountMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-07-01 17:46
 **/

@Service
@Slf4j
public class AccountService {

    @Resource
    private AccountMapper accountMapper;

    /**
     * 这里一定会开启新的事务，并且事务回滚独立
     * @param accountRecord
     */
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public void saveAccountNormal(AccountRecord accountRecord){

        boolean newTransaction = TransactionAspectSupport.currentTransactionStatus().isNewTransaction();
        log.info("不同service 内层 REQUIRES_NEW 是否开启新事务 ？ " + newTransaction);

        accountMapper.insertAccount(accountRecord);
        try {
            Thread.sleep(100);


        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    /**
     *
     * @param accountRecord
     */
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public void saveAccountInnerThrowException(AccountRecord accountRecord){
        accountMapper.insertAccount(accountRecord);
        try {
            Thread.sleep(100);

            throw new RuntimeException("不同Service 内层事务抛出异常");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
