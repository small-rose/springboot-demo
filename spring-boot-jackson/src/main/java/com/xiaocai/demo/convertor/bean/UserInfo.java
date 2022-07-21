package com.xiaocai.demo.convertor.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ UserInfo ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/21 13:02
 * @Version ： 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    private String name ;
    private Integer age ;
    private String sex ;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birth ;
    private List<String> friendList ;

}
