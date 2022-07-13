package com.xiaocai.demo.event.reactor.bean;

import lombok.*;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ Email ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/13 12:01
 * @Version ： 1.0
 **/

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Email {

    private String fromUser;

    private String toUser;

    private String host;
}
