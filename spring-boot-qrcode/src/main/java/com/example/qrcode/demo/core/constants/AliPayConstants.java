package com.example.qrcode.demo.core.constants;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ AliPayConstants ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/11/12 15:16
 * @Version ： 1.0
 **/
@Component
@Data
public class AliPayConstants {

    /**
     * 第一次 获取授权auth_code的地址，需要自己拼好，引导用户点击或扫码
     */
    @Value("${alipay.alipay_accredit_url}")
    private String alipay_accredit_url ;


    @Value("${alipay.app_id}")
    private String app_id ;

    /**
     * 用户在授权页面上确认授权后，将跳转到开发者指定的回调页，并且带上 auth_code；
     * 获取授权auth_code的地址回跳的地址，回自己带上 auth_code
     */
    @Value("${alipay.alipay_redirect_uri}")
    private String alipay_redirect_uri ;

    /**
     * 第二次 调用使用 auth_code 换取 access_token 及用户的 user_id；
     */
    @Value("${alipay.alipayuser_accredit_url}")
    private String alipayuser_accredit_url ;

    /**
     * 私钥
     */
    @Value("${alipay.alipay_private_key}")
    private String alipay_private_key ;

    /**
     * 公钥
     */
    @Value("${alipay.alipay_public_key}")
    private String alipay_public_key ;


    private String alipay_format = "json";
    private String alipay_charset = "UTF-8";
    private String alipay_sign_type = "RSA2";
}
