package com.xiaocai.demo.event.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ MessageEntity ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/13 8:14
 * @Version ： 1.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageEntity {

    String message;

    String code;
}
