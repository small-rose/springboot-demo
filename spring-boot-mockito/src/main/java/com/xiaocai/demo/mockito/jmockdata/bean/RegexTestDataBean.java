package com.xiaocai.demo.mockito.jmockdata.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ RegexTestDataBean ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/12 10:15
 * @Version ： 1.0
 **/

@Data
public class RegexTestDataBean {

    private String userEmail;
    private String userName;
    private String someThineDesc;
    private Integer userScore;
    private Integer userAge;
    private Double userValue;
    private BigDecimal userMoney;
}
