package com.xiaocai.demo.mockito.web.service.impl;

import com.xiaocai.demo.mockito.web.entity.Account;
import com.xiaocai.demo.mockito.web.exception.ServiceException;
import com.xiaocai.demo.mockito.web.exception.ValidateException;
import com.xiaocai.demo.mockito.web.mapper.AccountMapper;
import com.xiaocai.demo.mockito.web.service.AccountService;
import com.xiaocai.demo.mockito.web.utils.Md5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/5/15 14:34
 * @version: v1.0
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper ;

    public List<Account> getList() {

        return accountMapper.selectAll();
    }

    public boolean addAccount(Account account) throws Exception {
        boolean result = false;
        if (!StringUtils.hasText(account.getName())){
            throw new ValidateException("账户名称不能为空");
        }
        if (!StringUtils.hasText(account.getPass())){
            throw new ValidateException("账户密码不能为空");
        }

        String passwd = Md5Utils.string2MD5(account.getPass());
        account.setPass(passwd);
        try {
            int i = accountMapper.insert(account);
            if (i>0){
                result = true ;
            }
        }catch (Exception e){
            throw new ServiceException("账户保存发生错误");

        }
        return result;
    }

}
