package com.xiaocai.demo.transaction.requiredNew;

import com.xiaocai.demo.transaction.entity.AccountRecord;
import com.xiaocai.demo.transaction.entity.UserRecord;
import com.xiaocai.demo.transaction.mapper.AccountMapper;
import com.xiaocai.demo.transaction.mapper.UserMapper;
import com.xiaocai.demo.transaction.vo.AccountVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-07-01 17:58
 **/
@Service
public class UserBizService {

    @Resource
    AccountMapper accountMapper;
    @Resource
    UserMapper userMapper;


    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void saveUserBizNormal(AccountVO accountVO){
        UserRecord record = new UserRecord();
        record.setName(accountVO.getName());
        record.setPhone(accountVO.getPhone());
        userMapper.insertUser(record);

        AccountRecord accountRecord = new AccountRecord();
        accountRecord.setNickName(accountVO.getNickName());
        accountRecord.setPass(accountVO.getPass());
        accountRecord.setUid(record.getId());
        this.saveAccountNormal(accountRecord);

        throw new RuntimeException("相同Service 内层事务抛出异常");

    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public void saveAccountNormal(AccountRecord accountRecord){
        accountMapper.insertAccount(accountRecord);
        try {
            Thread.sleep(100);

            //throw new RuntimeException("相同Service 内层事务抛出异常");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    /** ---------------------------内层事务异常实例--start----------------------------------------  */

    /**
     * 外层不处理
     * @param accountVO
     */
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void saveUserBizInnerThrowException(AccountVO accountVO){
        UserRecord record = new UserRecord();
        record.setName(accountVO.getName());
        record.setPhone(accountVO.getPhone());
        userMapper.insertUser(record);

        AccountRecord accountRecord = new AccountRecord();
        accountRecord.setNickName(accountVO.getNickName());
        accountRecord.setPass(accountVO.getPass());
        accountRecord.setUid(record.getId());
        this.saveAccountInnerThrowException(accountRecord);
    }
    /**
     * 外层处理
     * @param accountVO
     */
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void saveUserBizInnerTryThrowException(AccountVO accountVO){
        UserRecord record = new UserRecord();
        record.setName(accountVO.getName());
        record.setPhone(accountVO.getPhone());
        userMapper.insertUser(record);

        AccountRecord accountRecord = new AccountRecord();
        accountRecord.setNickName(accountVO.getNickName());
        accountRecord.setPass(accountVO.getPass());
        accountRecord.setUid(record.getId());
        try {
            this.saveAccountInnerThrowException(accountRecord);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public void saveAccountInnerThrowException(AccountRecord accountRecord){
        accountMapper.insertAccount(accountRecord);
        try {
            Thread.sleep(100);

            throw new RuntimeException("相同Service 内层事务抛出异常");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    /** ---------------------------内异常实例--end----------------------------------------  */




    /** ------------------------外层异常实例------start---------------------------*/

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void saveUserBizOuterThrowException(AccountVO accountVO){
        UserRecord record = new UserRecord();
        record.setName(accountVO.getName());
        record.setPhone(accountVO.getPhone());
        userMapper.insertUser(record);

        AccountRecord accountRecord = new AccountRecord();
        accountRecord.setNickName(accountVO.getNickName());
        accountRecord.setPass(accountVO.getPass());
        accountRecord.setUid(record.getId());
        this.saveAccountNormal(accountRecord);

        throw new RuntimeException("相同Service 外层事务抛出异常");
    }

    /** ---------------------------外层异常实例-----end---------------------------*/

}
