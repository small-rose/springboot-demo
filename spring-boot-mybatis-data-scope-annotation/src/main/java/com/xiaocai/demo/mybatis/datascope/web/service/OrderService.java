package com.xiaocai.demo.mybatis.datascope.web.service;

import com.xiaocai.demo.mybatis.datascope.core.support.ExecutorSwitchHelper;
import com.xiaocai.demo.mybatis.datascope.core.support.PrivilegeMode;
import com.xiaocai.demo.mybatis.datascope.core.support.PrivilegeParam;
import com.xiaocai.demo.mybatis.datascope.core.support.PrivilegeParamHelper;
import com.xiaocai.demo.mybatis.datascope.web.entity.Order;
import com.xiaocai.demo.mybatis.datascope.web.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/4/19 10:57
 * @version: v1.0
 */
@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper ;

    /**
     * 执行时包一层带上数据权限
     * @return
     */
    public List<Order> getAllOrderListWithDataPrivilege(){
        PrivilegeParam param = new PrivilegeParam( "999", "=5");
        param.setMode(PrivilegeMode.APPEND_CASE);
        param.setTableAlis("");
        PrivilegeParamHelper.setPrivilegeParam(param);
        List<Order> orders = orderMapper.selectAllOrderList();
        PrivilegeParamHelper.clear();
        return orders;
    }


    /**
     * 获取SQL不执行
     * @return
     */
    public String getAllOrderListSQL(){

        ExecutorSwitchHelper.setNoExecute();
        orderMapper.selectAllOrderList();
        ExecutorSwitchHelper.clearNoExecute();
        String sql = ExecutorSwitchHelper.getSQL();
        PrivilegeParamHelper.clear();
        return sql;
    }
}
