package cn.small.demo.qlexpress.spring.rule;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ RuleConig ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/11/5 11:30
 * @Version ： 1.0
 **/

@Data
public class RuleConfig {

    private String subcompany ;


    private BigDecimal policyFeeBegin ;

    private boolean containsBegin ;

    private BigDecimal policyFeeEnd ;

    private boolean containsEnd ;


    private int countDays ;
}
