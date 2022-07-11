package com.xiaocai.demo.mockito.jmockdata.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ UserInfo ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/11 19:09
 * @Version ： 1.0
 **/
@Data
public class UserInfo {

    private String id ;
    private String name ;
    private String age ;
    private Date birth ;
    private String job ;
}
