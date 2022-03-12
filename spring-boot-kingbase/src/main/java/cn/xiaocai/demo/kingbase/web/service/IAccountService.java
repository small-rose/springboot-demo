package cn.xiaocai.demo.kingbase.web.service;

import cn.xiaocai.demo.kingbase.web.model.kingbase.KbAccount;
import cn.xiaocai.demo.kingbase.web.model.mysql.MysqlAccount;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ IOrderService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/2/24 13:40
 * @Version ： 1.0
 **/
public interface IAccountService {

    int addMysqlAccount(MysqlAccount record);

    List<MysqlAccount> getMysqlAccounts();

    int addKbAccount(KbAccount record);

    List<KbAccount> getKbAccounts();
 }
