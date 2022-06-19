package com.xiaocai.demo.mybatis.datascope.web.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaocai.demo.mybatis.datascope.core.support.ExecutorSwitchHelper;
import com.xiaocai.demo.mybatis.datascope.core.support.PrivilegeParam;
import com.xiaocai.demo.mybatis.datascope.core.support.PrivilegeParamHelper;
import com.xiaocai.demo.mybatis.datascope.web.mapper.MmPayableMoneyTdMapper;
import com.xiaocai.demo.mybatis.datascope.web.vo.PayableMoneyResultVO;
import com.xiaocai.demo.mybatis.datascope.web.vo.UsableMoneyCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/6/19 16:09
 * @version: v1.0
 */
@Service
public class PayableMoneyService {

    @Autowired
    private MmPayableMoneyTdMapper mmPayableMoneyTdMapper ;

    /**
     * 执行时包一层带上数据权限
     * @return
     */
    public Page<PayableMoneyResultVO> findPayableMoney(UsableMoneyCondition condition, int findType){
        PrivilegeParam param = new PrivilegeParam( "999", "=5");
        PrivilegeParamHelper.setPrivilegeParam(param);
        Page<PayableMoneyResultVO> page = new Page<>(1, 10);
        List<PayableMoneyResultVO> result = mmPayableMoneyTdMapper.findPayableMoney(page, condition, findType);
        PrivilegeParamHelper.clear();
        page.setRecords(result);
        return page;
    }


    /**
     * 获取SQL不执行
     * @return
     */
    public String findPayableMoneySQL(UsableMoneyCondition condition, int findType){

        ExecutorSwitchHelper.setNoExecute();
        mmPayableMoneyTdMapper.findPayableMoney(null, condition, findType);
        ExecutorSwitchHelper.clearNoExecute();
        String sql = ExecutorSwitchHelper.getSQL();
        ExecutorSwitchHelper.clearSQL();
        return sql;
    }
}
