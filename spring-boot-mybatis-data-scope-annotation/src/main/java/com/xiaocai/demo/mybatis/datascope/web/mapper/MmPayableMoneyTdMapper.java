package com.xiaocai.demo.mybatis.datascope.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaocai.demo.mybatis.datascope.core.annotation.DataScopeMapping;
import com.xiaocai.demo.mybatis.datascope.web.entity.PayableMoney;
import com.xiaocai.demo.mybatis.datascope.web.vo.PayableMoneyResultVO;
import com.xiaocai.demo.mybatis.datascope.web.vo.UsableMoneyCondition;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * zfl 2022/04/13
 * 改造CentralizationGenerateDao
 */
@Repository
public interface MmPayableMoneyTdMapper extends BaseMapper<PayableMoney> {




    //todo zfl orm改造PayableMoneyDao 根据findPayableMoney逻辑分为两个方法findPayableMoney和findPayableMoneyplus
    @DataScopeMapping
    List<PayableMoneyResultVO> findPayableMoney(Page<PayableMoneyResultVO> page,
                                                @Param("condition") UsableMoneyCondition condition,
                                                @Param("findType")int findType);




}
