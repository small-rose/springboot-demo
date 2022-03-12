package com.xiaocai.demo.dynamic.service;

import com.xiaocai.demo.dynamic.common.annotation.DataSource;
import com.xiaocai.demo.dynamic.common.enums.DataSourcesType;
import com.xiaocai.demo.dynamic.entity.TOrder;
import com.xiaocai.demo.dynamic.mapper.TOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/3/12 15:52
 * @version: v1.0
 */
@Service
public class OrderService {

    @Autowired
    private TOrderMapper tOrderMapper ;


    @DataSource(source = DataSourcesType.MASTER)
    public List<TOrder> getMasterOrderList(){
        return tOrderMapper.selectByExample(null);
    }


    @DataSource(source = DataSourcesType.SLAVE)
    public List<TOrder> getOrderList(){
        return tOrderMapper.selectByExample(null);
    }


}
