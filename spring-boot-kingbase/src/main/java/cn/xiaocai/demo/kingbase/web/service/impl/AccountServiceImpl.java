package cn.xiaocai.demo.kingbase.web.service.impl;

import cn.xiaocai.demo.kingbase.web.mapper.mysql.MysqlAccountMapper;
import cn.xiaocai.demo.kingbase.web.model.mysql.MysqlAccount;
import cn.xiaocai.demo.kingbase.web.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private MysqlAccountMapper mysqlAccountMapper ;

    @Override
    public int addAccount(MysqlAccount record) {
        return mysqlAccountMapper.insert(record);
    }

    @Override
    public List<MysqlAccount> getAccounts() {
        return mysqlAccountMapper.selectAll();
    }
}
