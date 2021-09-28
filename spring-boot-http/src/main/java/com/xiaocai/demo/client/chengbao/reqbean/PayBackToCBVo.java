package com.xiaocai.demo.client.chengbao.reqbean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Project : bp-paystation
 * @Author : zhangzongyuan
 * @Description : [ PayBackToCBVo ] 说明：无
 * @Function :  功能说明： 安诚承保回写请求参数
 * @Date ：2021/9/22 13:55
 * @Version ： 1.0
 **/
@Data
public class PayBackToCBVo implements java.io.Serializable{


    @JSONField(name = "PayAppNo")
    private String payAppNo ; //支付申请号

    @JSONField(name = "CashNo")
    private String cashNo ; //票据号(支票缴费必传)

    @JSONField(name = "Status")
    private String status ; //支付状态0表示成功

    @JSONField(name = "PayType")
    private String payType ; //支付方式

    @JSONField(name = "BankAcctDate")
    private String bankAcctDate ; //支付时间YYYYMMDDHHMMSS

    @JSONField(name = "Amount")
    private String amount ; //总支付金额以分为单位

    @JSONField(name = "BankCode")
    private String bankCode ; //收单行号

    @JSONField(name = "TidNo")
    private String tidNo ; //终端号

    @JSONField(name = "BkSerial")
    private String bkSerial ; //银行交易流水

    @JSONField(name = "CardNo")
    private String cardNo ; //卡号

    @JSONField(name = "Remark")
    private String remark ; //备注

    @JSONField(name = "AuthenticAtionresult")
    private String authenticAtionresult ; //认证结果01通过，无需双录，02通过，需要双录，03不通过

    @JSONField(name = "BusinessNo")
    private String businessNo ; //支付单号（全国车险必传）

    @JSONField(name = "PayWayType")
    private String payWayType ; //收款方方式代码

    @JSONField(name = "PayAccount")
    private String payAccount ; //缴费账号 POS支付：银行卡号，微信支付：openid，支付宝支付：userid（全国车险必传/客户转账/pos必传）

    @JSONField(name = "InsuredName")
    private String insuredName ; //缴款人名称（现金/支票/转账必传）

    @JSONField(name = "CashDate")
    private String cashDate ; //票据日期（支票缴费必传）YYYYMMDDHHMMSS

    @JSONField(name = "AuthenticNo")
    private String authenticNo ; //实名认证编码

}
