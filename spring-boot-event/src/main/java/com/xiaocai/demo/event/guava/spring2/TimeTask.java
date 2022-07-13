package com.xiaocai.demo.event.guava.spring2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ TimeTask ] 说明：无
 * @Function :  功能说明： 一个普通的PO类来装消息
 * @Date ：2022/7/13 10:31
 * @Version ： 1.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TimeTask {

    private String code ;
    private String message ;
    private LocalDateTime localDateTime ;


}
