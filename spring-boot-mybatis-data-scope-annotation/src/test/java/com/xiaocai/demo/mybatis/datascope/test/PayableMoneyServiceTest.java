package com.xiaocai.demo.mybatis.datascope.test;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaocai.demo.mybatis.datascope.MybatisDataScopeApplication;
import com.xiaocai.demo.mybatis.datascope.web.service.PayableMoneyService;
import com.xiaocai.demo.mybatis.datascope.web.vo.PayableMoneyResultVO;
import com.xiaocai.demo.mybatis.datascope.web.vo.UsableMoneyCondition;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/6/19 16:18
 * @version: v1.0
 */

@RunWith( SpringRunner.class)
@SpringBootTest(classes = {MybatisDataScopeApplication.class})
public class PayableMoneyServiceTest {

    @Autowired
    private PayableMoneyService payableMoneyService;

    @Test
    public void test(){

        UsableMoneyCondition condition = new UsableMoneyCondition();
        int findTyp = 2 ;
        Page<PayableMoneyResultVO> allOrderList = payableMoneyService.findPayableMoney(condition, findTyp);
        System.out.println("-----------"+allOrderList.getRecords().size());
        System.out.println(allOrderList);
    }

    @Test
    public void test2(){
        UsableMoneyCondition condition = new UsableMoneyCondition();
        int findTyp = 2 ;
        String sql = payableMoneyService.findPayableMoneySQL(condition, findTyp);
        System.out.println("-----------");
        System.out.println(sql);
    }
}
