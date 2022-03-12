package com.xiaocai.demo.mutilds;

import com.xiaocai.demo.mutilds.model.kingbase.KbAccount;
import com.xiaocai.demo.mutilds.model.kingbase.KbOrder;
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
public class KingBaseServiceTest {
    
    @Autowired
    IAccountService iAccountService;

    @Autowired
    IOrderService iOrderService;
    
    @Test
    @Rollback
    public void kbTest_01(){
        KbAccount record = new KbAccount();
        iAccountService.addKbAccount(record);
    }

    @Test
    public void kbTest_02(){
        List<KbAccount> kbAccounts = iAccountService.getKbAccounts();
        System.out.println(" kbAccounts count is " + kbAccounts.size());
    }

    @Test
    @Rollback
    public void mysqlTest_03(){
        KbOrder record = new KbOrder();
        int i =iOrderService.addKbOrder(record);
        System.out.println("KbOrder insert count is " +i);
    }

    @Test
    @Rollback
    public void mysqlTest_04(){
        List<KbOrder> KbOrderList = iOrderService.getKbOrderListByAccount("");
        System.out.println(" KbOrderList count is " + KbOrderList.size());
    }
}
