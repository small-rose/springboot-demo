package cn.small.demo.qlexpress.spring.service;

import cn.small.demo.qlexpress.spring.bean.PolicyData;
import cn.small.demo.qlexpress.spring.rule.RuleConfig;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ PolicyDataService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/11/5 15:24
 * @Version ： 1.0
 **/
public class PolicyDataService {


    /**
     * 是否是规则所属分公司
     * @param ruleConfig
     * @param data
     * @return
     */
    public static boolean isSubcompany(RuleConfig ruleConfig, PolicyData data){
        if (ruleConfig.getSubcompany().equals(data.getSubcompany())){
            return true;
        }
        return false;
    }

    /**
     * 是否在有效期
     * @param ruleConfig
     * @param data
     * @return
     */
    public static boolean countDays(RuleConfig ruleConfig, PolicyData data){


        if (ruleConfig.getCountDays() >0 && data.getExpriedTime()!=null){

            LocalDateTime limitTime = LocalDateTime.now().minusDays(ruleConfig.getCountDays());

            LocalDateTime expTime = LocalDateTime.parse(data.getExpriedTime(), DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
            int compareTo = limitTime.compareTo(expTime);
            if (compareTo <=  0){
                return true;
            }
            return false;
        }
        return false;
    }

    /**
     *  保费是否在区间内
     * @param ruleConfig
     * @param data
     * @return
     */
    public static boolean lastYearPolicyFeeCheck(RuleConfig ruleConfig, PolicyData data){
        if (ruleConfig.getPolicyFeeBegin().subtract(data.getLastYearPolicyFee()).doubleValue() < 0.0
        &&  ruleConfig.getPolicyFeeEnd().subtract(data.getLastYearPolicyFee()).doubleValue() >0.0){
             return true;
        }
        if (ruleConfig.isContainsBegin() && ruleConfig.getPolicyFeeBegin().subtract(data.getLastYearPolicyFee()).doubleValue() == 0.0) {
            return true;
        }
        if (ruleConfig.isContainsEnd() && ruleConfig.getPolicyFeeEnd().subtract(data.getLastYearPolicyFee()).doubleValue() == 0.0) {
            return true;
        }
        return false;
    }
}
