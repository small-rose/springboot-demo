package com.xiaocai.mybatis.test.module.service;

import com.xiaocai.mybatis.test.core.datasource.annotation.DataSourcesType;
import com.xiaocai.mybatis.test.core.datasource.annotation.TargetDataSource;
import com.xiaocai.mybatis.test.module.mapper.KBTestMapper;
import com.xiaocai.mybatis.test.module.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ TestService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/15 19:17
 * @Version ： 1.0
 **/

@Service
public class TestService {


    @Autowired
    TestMapper testMapper ;

    @Autowired
    KBTestMapper kbTestMapper ;


    @TargetDataSource(target = DataSourcesType.SLAVE)
    public Long testMater(){
       return testMapper.test();
    }


    @TargetDataSource(target = DataSourcesType.SLAVE)
    public Long testSlave(){
        return kbTestMapper.test();
    }


    @TargetDataSource(target = DataSourcesType.MASTER)
    public Long testMysqlUpdate(){
        return testMapper.updatePolicyTdTest();
    }

    @TargetDataSource(target = DataSourcesType.MASTER)
    public void testTemporaryTable() {
         kbTestMapper.testTemporaryTable();
    }
}
