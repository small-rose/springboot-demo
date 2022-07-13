package com.xiaocai.demo.event.guava.spring.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ EvenMessage ] 说明：无
 * @Function :  功能说明： 消息事件-没有消息事件可以使用 string
 *              这里可以使用不同的事件来处理不同的业务，自动匹配事件调用
 * @Date ：2022/7/13 9:22
 * @Version ： 1.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BuzEvent implements MyEvent{

    String message;

    String code;
}
