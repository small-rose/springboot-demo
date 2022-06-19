package com.xiaocai.demo.mybatis.datascope.test;

import com.xiaocai.demo.mybatis.datascope.MybatisDataScopeApplication;
import com.xiaocai.demo.mybatis.datascope.web.entity.Order;
import com.xiaocai.demo.mybatis.datascope.web.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/4/19 11:43
 * @version: v1.0
 */
@RunWith( SpringRunner.class)
@SpringBootTest(classes = {MybatisDataScopeApplication.class})
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void test(){

        List<Order> allOrderList = orderService.getAllOrderListWithDataPrivilege();
        System.out.println("-----------"+allOrderList.size());
        System.out.println(allOrderList);
    }

    @Test
    public void test2(){

        String sql = orderService.getAllOrderListSQL();
        System.out.println("-----------");
        System.out.println(sql);
    }
}
