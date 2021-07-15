package com.xiaocai.demo.transaction.service.requiredNew;

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
 * @create: 2021-07-01 17:16
 **/
@Service
@Slf4j
public class UserService {

    @Resource
    private AccountService accountService;
    @Resource
    private UserMapper userMapper;

    /**
     * 正常事务
     * @param accountVO
     */
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void saveUserNormal(AccountVO accountVO) {
        UserRecord user = new UserRecord();
        user.setName(accountVO.getName());
        user.setPhone(accountVO.getPhone());
        userMapper.insertUser(user);

        AccountRecord accountRecord = new AccountRecord();
        accountRecord.setNickName(accountVO.getNickName());
        accountRecord.setPass(accountVO.getPass());
        accountRecord.setUid(user.getId());
        // 在方法内调用
        accountService.saveAccountNormal(accountRecord);
        log.info("---------执行完毕---------");
    }

    /**
     * 外层事务抛异常
     * @param accountVO
     */
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void saveUserOuterThrowException(AccountVO accountVO) {
        UserRecord user = new UserRecord();
        user.setName(accountVO.getName());
        user.setPhone(accountVO.getPhone());
        userMapper.insertUser(user);

        AccountRecord accountRecord = new AccountRecord();
        accountRecord.setNickName(accountVO.getNickName());
        accountRecord.setPass(accountVO.getPass());
        accountRecord.setUid(user.getId());
        // 在方法内调用
        accountService.saveAccountNormal(accountRecord);

        throw new RuntimeException("不同Service 外层事务抛异常");
    }


    /**
     * 内层事务抛异常，外层不处理
     * @param accountVO
     */
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void saveUserInnerThrowException(AccountVO accountVO) {
        UserRecord user = new UserRecord();
        user.setName(accountVO.getName());
        user.setPhone(accountVO.getPhone());
        userMapper.insertUser(user);

        AccountRecord accountRecord = new AccountRecord();
        accountRecord.setNickName(accountVO.getNickName());
        accountRecord.setPass(accountVO.getPass());
        accountRecord.setUid(user.getId());
        // 在方法内调用
        accountService.saveAccountInnerThrowException(accountRecord);

    }

    /**
     * 内层事务抛异常，外层处理
     * @param accountVO
     */
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void saveUserInnerTryException(AccountVO accountVO) {
        UserRecord user = new UserRecord();
        user.setName(accountVO.getName());
        user.setPhone(accountVO.getPhone());
        userMapper.insertUser(user);

        AccountRecord accountRecord = new AccountRecord();
        accountRecord.setNickName(accountVO.getNickName());
        accountRecord.setPass(accountVO.getPass());
        accountRecord.setUid(user.getId());
        try {
            // 在方法内调用
            accountService.saveAccountInnerThrowException(accountRecord);
        }catch (Exception e){
            e.printStackTrace();
            log.info("内层事务异常被外层处理了...");
        }

    }
}
