package com.xiaocai.demo.client.chengbao.reqbean;

import lombok.Data;

/**
 * @Project : bp-paystation
 * @Author : zhangzongyuan
 * @Description : [ PayBackToCBRequest ] 说明：无
 * @Function :  功能说明：无  安诚回写承保核心系统发请求封装
 * @Date ：2021/9/22 13:59
 * @Version ： 1.0
 **/
@Data
public class PayBackToCBRequest {

    private PayBackHead head;

    private PayBackBody body;
}
