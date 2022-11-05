package cn.small.demo.qlexpress.spring.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ PolicyData ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/11/5 11:34
 * @Version ： 1.0
 **/

@Data
public class PolicyData {

    private String subcompany ;

    private String midBranchCode ;

    private String subBranchCode ;

    private String expriedTime;

    private BigDecimal lastYearPolicyFee ;

    private String handleName ;

}
