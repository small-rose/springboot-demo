package com.example.qrcode.demo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ AlipayAuthController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/11/12 13:57
 * @Version ： 1.0
 **/

@RestController
@RequestMapping("/Alipay")
public class AlipayAuthController {

    @RequestMapping(value="/auth")
    public void auth(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String alipayAuth = "https://openauth.alipay.com/oauth2/appToAppAuth.htm?app_id=2014042100005160&scope=auth_base&redirect_uri=https://plytst.e-acic.com/bp-payonline/accredit.do&state=210102185039";

        String alipay_accredit_url = "https://openauth.alipay.com/oauth2/appToAppAuth.htm?" ;
        String app_id = "2014042100005160";
        String alipay_redirect_uri = "https://plytst.e-acic.com/bp-payonline/accredit.do";
        String orderId = "";


        String url = alipay_accredit_url.concat("app_id=").concat(app_id)
                .concat("&scope=auth_base&redirect_uri=").concat(alipay_redirect_uri)
                .concat("&state=").concat(orderId);

        response.sendRedirect(url);
    }

    @GetMapping(value="/authLink")
    public String authLink(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String alipayAuth = "https://openauth.alipay.com/oauth2/appToAppAuth.htm?app_id=2014042100005160&scope=auth_base&redirect_uri=https://plytst.e-acic.com/bp-payonline/accredit.do&state=210102185039";

        String alipay_accredit_url = "https://openauth.alipay.com/oauth2/appToAppAuth.htm?" ;
        String app_id = "2014042100005160";
        String alipay_redirect_uri = "https://plytst.e-acic.com/bp-payonline/accredit.do";
        //回跳地址需要配置
        alipay_redirect_uri = "http://plytst.e-acic.com/qrCode/accredit.do";
        String orderId = "210102185039";

        //LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")).concat(String.valueOf((char)(Math.random() * 128))).concat(String.valueOf((int)(Math.random()*90 + 10)));


        String url = alipay_accredit_url.concat("app_id=").concat(app_id)
                .concat("&scope=auth_base&redirect_uri=").concat(alipay_redirect_uri)
                .concat("&state=").concat(orderId);

        return  url ;
    }
}
