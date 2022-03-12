package com.xiaocai.demo.mutilds.service;


import com.xiaocai.demo.mutilds.model.kingbase.KbOrder;
import com.xiaocai.demo.mutilds.model.mysql.MysqlOrder;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ IOrderService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/2/24 13:40
 * @Version ： 1.0
 **/
public interface IOrderService {



    int addMysqlOrder(MysqlOrder record);

    List<MysqlOrder> getMysqlOrderListByAccount(String account);


    int addKbOrder(KbOrder record);

    List<KbOrder> getKbOrderListByAccount(String account);
}
