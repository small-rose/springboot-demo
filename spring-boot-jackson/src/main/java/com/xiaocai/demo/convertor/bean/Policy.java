package com.xiaocai.demo.convertor.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ Policy ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/21 13:59
 * @Version ： 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Policy {

    private String policyNo ;
    private String idNo ;
    private BigDecimal amount ;
    private String applyNo ;
}
