package com.xiaocai.demo.dynamic.datasouce;

import com.xiaocai.demo.dynamic.MutilDynamicDatasourceApp;
import com.xiaocai.demo.dynamic.entity.TAccount;
import com.xiaocai.demo.dynamic.entity.TOrder;
import com.xiaocai.demo.dynamic.service.AccountService;
import com.xiaocai.demo.dynamic.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/3/12 15:31
 * @version: v1.0
 */

//@RunWith( SpringRunner.class)
@SpringBootTest(classes = {MutilDynamicDatasourceApp.class})
public class DynamicDsServiceTest {

    @Autowired
    AccountService accountService ;


    @Autowired
    OrderService orderService ;

    @Test
    public  void test0_1(){


        List<TAccount> slaveAccountList = accountService.getAccountList();
        System.out.println("---SLAVE 库--查询到 slaveAccountList  :" + slaveAccountList.size());
        //Assert.isTrue(accountList.size()==0 ,"SLAVE 数据源查不到账户数据");
        List<TAccount> accountList = accountService.getMasterAccountList();
        System.out.println("---master 库--查询到 accountList  :" + accountList.size());
    }

    @Test
    public  void test0_2(){
        List<TAccount> accountList = accountService.getMasterAccountList();
        System.out.println("---master 库--查询到 accountList  预期是 2 , 实际是:" + accountList.size());

        List<TAccount> slaveAccountList = accountService.getAccountList();
        System.out.println("---SLAVE 库--查询到 slaveAccountList  预期是 1 , 实际是:" + slaveAccountList.size());
        //Assert.isTrue(accountList.size()==0 ,"SLAVE 数据源查不到账户数据");
    }

    @Test
    public  void test0_3(){
        List<TAccount> accountList = accountService.getMasterAccountList();
        System.out.println("---master 库--查询到 accountList  预期是 2 , 实际是 :" + accountList.size());


        //Assert.isTrue(accountList.size()==0 ,"SLAVE 数据源查不到账户数据");
    }
    @Test
    public  void test0_4(){

        List<TAccount> slaveAccountList = accountService.getAccountList();
        System.out.println("---SLAVE 库--查询到 slaveAccountList 预期是 1 , 实际是  :" + slaveAccountList.size());
        //Assert.isTrue(accountList.size()==0 ,"SLAVE 数据源查不到账户数据");
    }


    @Test
    public  void test2(){
        List<TOrder> masterOrderList = orderService.getMasterOrderList();
        System.out.println("---master 库--查询到 masterOrderList  预期是 1 , 实际是 :" + masterOrderList.size());

        List<TOrder> orderList = orderService.getOrderList();
        System.out.println("---SLAVE 库--查询到 orderList  预期是 0 , 实际是 :" + orderList.size());

        //Assert.isTrue(orderList.size()>0 ,"查不到订单数据");
    }

    @Test
    public  void test3(){

        List<TOrder> masterOrderList = orderService.getMasterOrderList();
        System.out.println("---master 库--查询到 masterOrderList 预期是 1 , 实际是 " + masterOrderList.size());

        List<TAccount> slaveAccountList = accountService.getAccountList();
        System.out.println("---SLAVE 库--查询到 slaveAccountList   预期是 1 , 实际是 :" + slaveAccountList.size());
        //Assert.isTrue(orderList.size()>0 && accountList.size()>0  ,"查不到订单和账户数据");
    }
}
