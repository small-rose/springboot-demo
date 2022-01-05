package com.example.qrcode.demo.core.constants;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ WeiXinConstants ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/11/12 16:00
 * @Version ： 1.0
 **/
@Component
@Data
public class WeiXinConstants {


    @Value("${alipay.alipay_accredit_url}")
    private String alipay_accredit_url ;


    @Value("${alipay.app_id}")
    private String app_id ;


    @Value("${alipay.alipay_redirect_uri}")
    private String alipay_redirect_uri ;


    @Value("${alipay.alipayuser_accredit_url}")
    private String alipayuser_accredit_url ;

    @Value("${alipay.alipay_private_key}")
    private String alipay_private_key ;


    @Value("${alipay.alipay_public_key}")
    private String alipay_public_key ;



}
