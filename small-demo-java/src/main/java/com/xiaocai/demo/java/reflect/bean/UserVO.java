package com.xiaocai.demo.java.reflect.bean;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ UserVO ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/6/28 14:22
 * @Version ： 1.0
 **/

@Data
public class UserVO {

    private Long id ;
    private int age ;
    private String userName ;
    private BigDecimal money ; // 金额
    private Date birth ; // 生日
    private List<AddressVO> addressList ; // 地址
    private Set<String> nickNames ;  // 昵称
    private School school ; //现在所在学校
    private Map<String, School>  learnResume; //时间 - 学校
}
