package com.xiaocai.demo.client.chengbao.reqbean;

import lombok.Data;

/**
 * @Project : bp-paystation
 * @Author : zhangzongyuan
 * @Description : [ PayBackToCBResponse ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/22 15:15
 * @Version ： 1.0
 **/

@Data
public class PayBackToCBResponse {

    private String code ;
    private String message ;
    private PayBackToCBRespData data;

}
