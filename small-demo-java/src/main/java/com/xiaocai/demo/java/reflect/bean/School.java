package com.xiaocai.demo.java.reflect.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ School ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/6/28 14:26
 * @Version ： 1.0
 **/
@Data
public class School {

    private Long id ;
    private String name ;
    private Date birth ;
    private AddressVO address ;
}
