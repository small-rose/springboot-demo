package com.xiaocai.demo.transaction.service.supports;

import com.xiaocai.demo.transaction.entity.AccountRecord;
import com.xiaocai.demo.transaction.entity.UserRecord;
import com.xiaocai.demo.transaction.mapper.AccountMapper;
import com.xiaocai.demo.transaction.mapper.UserMapper;
import com.xiaocai.demo.transaction.vo.AccountVO;
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
 * @create: 2021-07-02 09:49
 **/
@Service
@Slf4j
public class OneSupportsService {

    @Resource
    private AccountMapper accountMapper;
    @Resource
    private UserMapper userMapper;

    public void saveUserNoTransaction(AccountVO accountVO){
        boolean newTransaction = TransactionAspectSupport.currentTransactionStatus().isNewTransaction();
        log.info("SUPPORTS 模式测试 相同service 外层 非事务 是否开启新事务 ？ " + newTransaction);

        UserRecord record = new UserRecord();
        record.setName(accountVO.getName());
        record.setPhone(accountVO.getPhone());
        userMapper.insertUser(record);

        AccountRecord accountRecord = new AccountRecord();
        accountRecord.setNickName(accountVO.getNickName());
        accountRecord.setPass(accountVO.getPass());
        accountRecord.setUid(record.getId());
        // 在方法内调用
        this.saveAccountThrowException(accountRecord);

    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void saveUserWithTransaction(AccountVO accountVO){
        boolean newTransaction = TransactionAspectSupport.currentTransactionStatus().isNewTransaction();
        log.info("SUPPORTS 模式测试 相同service 外层 REQUIRES_NEW 是否开启新事务 ？ " + newTransaction);

        UserRecord record = new UserRecord();
        record.setName(accountVO.getName());
        record.setPhone(accountVO.getPhone());
        userMapper.insertUser(record);

        AccountRecord accountRecord = new AccountRecord();
        accountRecord.setNickName(accountVO.getNickName());
        accountRecord.setPass(accountVO.getPass());
        accountRecord.setUid(record.getId());
        // 在方法内调用
        this.saveAccountNormal(accountRecord);
        log.info("---------执行完毕---------");
    }


    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void saveUserWithTransactionOuterThrowException(AccountVO accountVO){
        boolean newTransaction = TransactionAspectSupport.currentTransactionStatus().isNewTransaction();
        log.info("SUPPORTS 模式测试 相同service 外层 REQUIRES_NEW 是否开启新事务 ？ " + newTransaction);

        UserRecord record = new UserRecord();
        record.setName(accountVO.getName());
        record.setPhone(accountVO.getPhone());
        userMapper.insertUser(record);

        AccountRecord accountRecord = new AccountRecord();
        accountRecord.setNickName(accountVO.getNickName());
        accountRecord.setPass(accountVO.getPass());
        accountRecord.setUid(record.getId());
        // 在方法内调用
        this.saveAccountNormal(accountRecord);

        throw new RuntimeException("SUPPORTS 内存正常，外层异常");
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.SUPPORTS)
    public void saveAccountNormal(AccountRecord accountRecord){
        boolean newTransaction = TransactionAspectSupport.currentTransactionStatus().isNewTransaction();
        log.info("SUPPORTS 模式测试 相同service 内层 SUPPORTS 是否开启新事务 ？ " + newTransaction);

        accountMapper.insertAccount(accountRecord);
        try {
            Thread.sleep(100);

            //throw new RuntimeException("相同Service 内层事务抛出异常");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }




    @Transactional(rollbackFor = Exception.class, propagation = Propagation.SUPPORTS)
    public void saveAccountThrowException(AccountRecord accountRecord){
        boolean newTransaction = TransactionAspectSupport.currentTransactionStatus().isNewTransaction();
        log.info("SUPPORTS 模式测试 相同service 内层 SUPPORTS 是否开启新事务 ？ " + newTransaction);

        accountMapper.insertAccount(accountRecord);
        try {
            Thread.sleep(100);

            throw new RuntimeException("相同Service 内层事务抛出异常");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
