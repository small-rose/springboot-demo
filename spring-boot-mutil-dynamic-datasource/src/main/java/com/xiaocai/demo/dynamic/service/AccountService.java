package com.xiaocai.demo.dynamic.service;

import com.xiaocai.demo.dynamic.common.annotation.DataSource;
import com.xiaocai.demo.dynamic.common.enums.DataSourcesType;
import com.xiaocai.demo.dynamic.entity.TAccount;
import com.xiaocai.demo.dynamic.mapper.TAccountMapper;
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
public class AccountService {

    @Autowired
    private TAccountMapper tAccountMapper ;


    @DataSource(source = DataSourcesType.MASTER)
    public List<TAccount> getMasterAccountList(){
        return tAccountMapper.selectByExample(null);
    }

    @DataSource(source = DataSourcesType.SLAVE)
    public List<TAccount> getAccountList(){
        return tAccountMapper.selectByExample(null);
    }
}
