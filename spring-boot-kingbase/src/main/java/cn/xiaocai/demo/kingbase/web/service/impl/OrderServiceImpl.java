package cn.xiaocai.demo.kingbase.web.service.impl;

import cn.xiaocai.demo.kingbase.web.mapper.kingbase.KbOrderMapper;
import cn.xiaocai.demo.kingbase.web.mapper.mysql.MysqlOrderMapper;
import cn.xiaocai.demo.kingbase.web.model.kingbase.KbOrder;
import cn.xiaocai.demo.kingbase.web.model.mysql.MysqlOrder;
import cn.xiaocai.demo.kingbase.web.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ IOrderService ] 说明：无
 * @Function :  功能说明：订单service
 * @Date ：2022/2/24 13:40
 * @Version ： 1.0
 **/
@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private KbOrderMapper kbOrderMapper ;
    @Autowired
    private MysqlOrderMapper mysqlOrderMapper ;


    @Override
    public int addMysqlOrder(MysqlOrder record) {
        return mysqlOrderMapper.insert(record);
    }

    @Override
    public List<MysqlOrder> getMysqlOrderListByAccount(String account) {
        return mysqlOrderMapper.selectAll();
    }

    @Override
    public int addKbOrder(KbOrder record) {
        return kbOrderMapper.insert(record);
    }

    @Override
    public List<KbOrder> getKbOrderListByAccount(String account) {
        return kbOrderMapper.selectAll();
    }
}
