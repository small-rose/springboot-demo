package com.xiaocai.demo.client.chengbao.reqbean;

import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * @Project : bp-paystation
 * @Author : zhangzongyuan
 * @Description : [ PayBackHead ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/22 14:01
 * @Version ： 1.0
 **/
@Data
public class PayBackHead {

    /**
     * 接口标识 支付回写核心使用的是 1、缴费通知接口(新收付->保司) 值是 notifyPay
     */
    private String cmd = "notifyPay" ;

    /**
     * 渠道机构标识
     */
    private String fcid = "fnd";

    /**
     * Unix当前时间戳
     */
    private Long timestamp = Timestamp.valueOf(LocalDateTime.now()).getTime();;

    /**
     * 数据来源（字典表）
     */
    private String  datasource ;

}
