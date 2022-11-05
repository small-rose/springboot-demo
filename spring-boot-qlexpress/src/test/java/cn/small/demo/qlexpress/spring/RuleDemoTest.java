package cn.small.demo.qlexpress.spring;

import cn.small.demo.qlexpress.QlExpressApplicationTests;
import cn.small.demo.qlexpress.spring.bean.PolicyData;
import cn.small.demo.qlexpress.spring.engine.EngineFactory;
import cn.small.demo.qlexpress.spring.rule.RuleConfig;
import cn.small.demo.qlexpress.spring.service.PolicyDataService;
import com.ql.util.express.ExpressRunner;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ RuleDemoTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/11/5 15:43
 * @Version ： 1.0
 **/

public class RuleDemoTest extends QlExpressApplicationTests {

    @Autowired
    private EngineFactory engineFactory ;

    @Test
    public void test_14() throws Exception {

        RuleConfig ruleConfig = new RuleConfig();
        ruleConfig.setSubcompany("100010");
        ruleConfig.setPolicyFeeBegin(new BigDecimal("10000"));
        ruleConfig.setPolicyFeeEnd(new BigDecimal("30000"));
        ruleConfig.setCountDays(100);
        ruleConfig.setContainsBegin(false);
        ruleConfig.setContainsEnd(false);

        PolicyData policyData = new PolicyData();
        policyData.setSubcompany("100020");
        policyData.setLastYearPolicyFee(new BigDecimal("3800.00"));
        policyData.setExpriedTime("20221010-111221");

        ExpressRunner runner = EngineFactory.expressRunner;

        runner.addFunctionOfClassMethod("校验数据所属分公司", PolicyDataService.class.getName(), "isSubcompany",
                new Class[]{RuleConfig.class, PolicyData.class}, null);

        String express = "校验数据所属分公司(ruleConfig, policyData)";

        Map<String, Object> context = new HashMap<>();
        context.put("ruleConfig", ruleConfig);
        context.put("policyData", policyData);

        List<String> errorList =  new ArrayList<>();
        Object result = engineFactory.executeExpress(express, context, errorList);
        System.out.println("校验数据所属分公司 = " +result);
        errorList.forEach(System.out::println);
    }

    @Test
    public void test_74() throws Exception {

        RuleConfig ruleConfig = new RuleConfig();
        ruleConfig.setSubcompany("100010");
        ruleConfig.setPolicyFeeBegin(new BigDecimal("10000"));
        ruleConfig.setPolicyFeeEnd(new BigDecimal("30000"));
        ruleConfig.setCountDays(100);
        ruleConfig.setContainsBegin(false);
        ruleConfig.setContainsEnd(false);


        PolicyData policyData = new PolicyData();
        policyData.setSubcompany("100020");
        policyData.setLastYearPolicyFee(new BigDecimal("13800.00"));
        policyData.setExpriedTime("20221010-111221");

        ExpressRunner runner = EngineFactory.expressRunner;

        runner.addOperatorWithAlias("如果", "if", null);
        runner.addOperatorWithAlias("则", "then", null);
        runner.addOperatorWithAlias("否则", "else", null);

        runner.addFunctionOfClassMethod("校验数据所属分公司", PolicyDataService.class.getName(), "isSubcompany",
               new Class[]{RuleConfig.class, PolicyData.class}, null);

        runner.addFunctionOfClassMethod("校验保费范围", PolicyDataService.class.getName(), "lastYearPolicyFeeCheck",
                new Class[]{RuleConfig.class, PolicyData.class}, null);

//        runner.addFunctionOfClassMethod("校验倒计时范围", PolicyDataService.class.getName(), "CountDays",
//                new Class[]{RuleConfig.class, PolicyData.class}, null);

        //String express = "如果 ( 校验数据所属分公司(ruleConfig, policyData) && 校验保费范围(ruleConfig, policyData) ) 则 result true ; 否则 return false ;";
        String express = "校验数据所属分公司(ruleConfig, policyData) && 校验保费范围(ruleConfig, policyData);";

        Map<String, Object> context = new HashMap<>();
        context.put("ruleConfig", ruleConfig);
        context.put("policyData", policyData);

        List<String> errorList =  new ArrayList<>();
        Object result = engineFactory.executeExpress(express, context, errorList);
        System.out.println("数据是否符号要求 = " +result);
        errorList.forEach(System.out::println);
    }




    @Test
    public void test_114() throws Exception {

        //规则
        RuleConfig ruleConfig = new RuleConfig();
        ruleConfig.setSubcompany("100010");
        ruleConfig.setPolicyFeeBegin(new BigDecimal("10000"));
        ruleConfig.setPolicyFeeEnd(new BigDecimal("30000"));
        ruleConfig.setCountDays(100);
        ruleConfig.setContainsBegin(false);
        ruleConfig.setContainsEnd(false);

        // 数据
        PolicyData policyData = new PolicyData();
        policyData.setSubcompany("100010");
        policyData.setLastYearPolicyFee(new BigDecimal("13800.00"));
        policyData.setExpriedTime("20221010-111221");

        ExpressRunner runner = EngineFactory.expressRunner;

        runner.addOperatorWithAlias("如果", "if", null);
        runner.addOperatorWithAlias("则", "then", null);
        runner.addOperatorWithAlias("否则", "else", null);

        runner.addFunctionOfClassMethod("校验数据所属分公司", PolicyDataService.class.getName(), "isSubcompany",
                new Class[]{RuleConfig.class, PolicyData.class}, null);

        runner.addFunctionOfClassMethod("校验保费范围", PolicyDataService.class.getName(), "lastYearPolicyFeeCheck",
                new Class[]{RuleConfig.class, PolicyData.class}, null);

        runner.addFunctionOfClassMethod("校验倒计时范围", PolicyDataService.class.getName(), "countDays",
                new Class[]{RuleConfig.class, PolicyData.class}, null);

        //String express = "如果 ( 校验数据所属分公司(ruleConfig, policyData) && 校验保费范围(ruleConfig, policyData) ) 则 result true ; 否则 return false ;";
        String express = "如果 (校验数据所属分公司(ruleConfig, policyData) && 校验保费范围(ruleConfig, policyData) && 校验倒计时范围(ruleConfig, policyData)) 则 { return true; } 否则 { return false ;}";

        Map<String, Object> context = new HashMap<>();
        context.put("ruleConfig", ruleConfig);
        context.put("policyData", policyData);

        List<String> errorList =  new ArrayList<>();
        Object result = engineFactory.executeExpress(express, context, errorList);
        System.out.println("数据是否符号要求 = " +result);
        errorList.forEach(System.out::println);
    }
}
