package com.xiaocai.demo.mutilds;

import com.xiaocai.demo.mutilds.model.mysql.MysqlAccount;
import com.xiaocai.demo.mutilds.model.mysql.MysqlOrder;
import com.xiaocai.demo.mutilds.service.IAccountService;
import com.xiaocai.demo.mutilds.service.IOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/3/12 22:07
 * @version: v1.0
 */

@SpringBootTest(classes = {MutilDatasourceApplication.class})
@Transactional
public class MysqlServiceTest {

    @Autowired
    IAccountService iAccountService;

    @Autowired
    IOrderService iOrderService;

    @Test
    @Rollback
    public void mysqlTest_01(){
        MysqlAccount record = new MysqlAccount();
        int i = iAccountService.addMysqlAccount(record);
        System.out.println("MysqlAccount insert count is " +i);
    }

    @Test
    public void mysqlTest_02(){
        List<MysqlAccount> mysqlAccounts = iAccountService.getMysqlAccounts();
        System.out.println(" mysqlAccounts count is " + mysqlAccounts.size());
    }

    @Test
    @Rollback
    public void mysqlTest_03(){
        MysqlOrder record = new MysqlOrder();
        int i =iOrderService.addMysqlOrder(record);
        System.out.println("MysqlOrder insert count is " +i);
    }

    @Test
    @Rollback
    public void mysqlTest_04(){
        List<MysqlOrder> mysqlOrderList = iOrderService.getMysqlOrderListByAccount("");
        System.out.println(" mysqlOrderList count is " + mysqlOrderList.size());
    }
}
