package com.xiaocai.demo.mutilds.service.impl;

import com.xiaocai.demo.mutilds.mapper.kingbase.KbAccountMapper;
import com.xiaocai.demo.mutilds.mapper.mysql.MysqlAccountMapper;
import com.xiaocai.demo.mutilds.model.kingbase.KbAccount;
import com.xiaocai.demo.mutilds.model.mysql.MysqlAccount;
import com.xiaocai.demo.mutilds.service.IAccountService;
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

    @Autowired
    private KbAccountMapper kbAccountMapper ;

    @Override
    public int addMysqlAccount(MysqlAccount record) {
        return mysqlAccountMapper.insert(record);
    }

    @Override
    public List<MysqlAccount> getMysqlAccounts() {
        return mysqlAccountMapper.selectAll();
    }

    @Override
    public int addKbAccount(KbAccount record) {
        return kbAccountMapper.insert(record);
    }

    @Override
    public List<KbAccount> getKbAccounts() {
        return kbAccountMapper.selectAll();
    }
}
