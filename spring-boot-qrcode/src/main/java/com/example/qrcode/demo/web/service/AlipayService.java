package com.example.qrcode.demo.web.service;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipaySystemOauthTokenRequest;
import com.alipay.api.response.AlipaySystemOauthTokenResponse;
import com.example.qrcode.demo.core.constants.AliPayConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ AlipayService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/11/12 15:27
 * @Version ： 1.0
 **/

@Service
public class AlipayService {

    @Autowired
    private AliPayConstants aliPayConstants ;

    /**
     *  使用 auth_code 换取 access_token 及用户的 user_id；
     *  文档说明： https://opendocs.alipay.com/open/284/web
     * @param code
     * @param app_id
     * @return
     * @throws AlipayApiException
     */
    public AlipaySystemOauthTokenResponse getToken(String code, String app_id) throws AlipayApiException {
        // 第一步：通过code获取userid
        AlipayClient alipayClient = new DefaultAlipayClient(
                aliPayConstants.getAlipay_accredit_url(), app_id,
                aliPayConstants.getAlipay_private_key(), "json", "UTF-8",
                aliPayConstants.getAlipay_public_key(), "RSA2");
        AlipaySystemOauthTokenRequest alipayrequest = new AlipaySystemOauthTokenRequest();
        alipayrequest.setGrantType("authorization_code");
        alipayrequest.setCode(code);

        AlipaySystemOauthTokenResponse responseToken = null;
        try {
            responseToken = alipayClient.execute(alipayrequest);
        } catch (AlipayApiException e) {
            throw new AlipayApiException("支付宝授权获取token和userid链接失败");
        }
        return responseToken ;
    }
}
