package com.xiaocai.demo.transaction.service.supports;

import com.xiaocai.demo.transaction.entity.AccountRecord;
import com.xiaocai.demo.transaction.entity.UserRecord;
import com.xiaocai.demo.transaction.mapper.UserMapper;
import com.xiaocai.demo.transaction.vo.AccountVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
public class UserSupportsService {


    @Resource
    private AccountSupportsService accountSupportsService;
    @Resource
    private UserMapper userMapper;
    /**
     * 正常事务运行
     * @param accountVO
     */
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void saveUserWithTransaction(AccountVO accountVO) {
        UserRecord user = new UserRecord();
        user.setName(accountVO.getName());
        user.setPhone(accountVO.getPhone());
        userMapper.insertUser(user);

        AccountRecord accountRecord = new AccountRecord();
        accountRecord.setNickName(accountVO.getNickName());
        accountRecord.setPass(accountVO.getPass());
        accountRecord.setUid(user.getId());

        accountSupportsService.saveAccountNormal(accountRecord);
        log.info("---------执行完毕---------");
    }

    /**
     * 非事务运行
     * @param accountVO
     */
    public void saveUserNoTransaction(AccountVO accountVO) {
        UserRecord user = new UserRecord();
        user.setName(accountVO.getName());
        user.setPhone(accountVO.getPhone());
        userMapper.insertUser(user);

        AccountRecord accountRecord = new AccountRecord();
        accountRecord.setNickName(accountVO.getNickName());
        accountRecord.setPass(accountVO.getPass());
        accountRecord.setUid(user.getId());

        accountSupportsService.saveAccountNormal(accountRecord);
        log.info("---------执行完毕---------");
    }


    public void saveUserNoTransactionInnerThrow(AccountVO accountVO) {
        UserRecord user = new UserRecord();
        user.setName(accountVO.getName());
        user.setPhone(accountVO.getPhone());
        userMapper.insertUser(user);

        AccountRecord accountRecord = new AccountRecord();
        accountRecord.setNickName(accountVO.getNickName());
        accountRecord.setPass(accountVO.getPass());
        accountRecord.setUid(user.getId());

        accountSupportsService.saveAccountInnerThrowException(accountRecord);
        log.info("---------执行完毕---------");
    }
}
