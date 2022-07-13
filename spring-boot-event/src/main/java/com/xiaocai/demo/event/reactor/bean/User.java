package com.xiaocai.demo.event.reactor.bean;

import lombok.*;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ User ] 说明：无
 * @Function :  功能说明： 领域数据
 * @Date ：2022/7/13 11:27
 * @Version ： 1.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private String firstName;

    private String lastName;

    private String address;

    private String city;


}
