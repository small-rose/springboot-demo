package cn.xiaocai.demo.kingbase.web.service.impl;

import cn.xiaocai.demo.kingbase.web.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ IOrderService ] 说明：无
 * @Function :  功能说明： 账户service
 * @Date ：2022/2/24 13:40
 * @Version ： 1.0
 **/
@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountService {

    final AccountMapper accountMapper ;

    @Override
    public int addAccount(Account record) {
        return accountMapper.insert(record);
    }

    @Override
    public List<Account> getAccounts() {
        return accountMapper.selectAll();
    }
}
