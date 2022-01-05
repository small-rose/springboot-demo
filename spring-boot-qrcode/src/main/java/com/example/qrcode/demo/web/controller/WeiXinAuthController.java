package com.example.qrcode.demo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ WeiXinAuthController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/11/12 13:57
 *
 * #get auth code
 * weixin.weixin_accredit_url=https://open.weixin.qq.com/connect/oauth2/authorize
 * weixin.weixin_appid=wxf88f81e2bacf2761
 * weixin.weixin_redirect_uri=https://plytst.e-acic.com/bp-paystation/achieveTXC.do
 * # https://plytst.e-acic.com/bp-payonline/wxAuth.do
 * weixin.weixin_openid=
 *
 * weixin.weixin_authentication_url=https://payapp.weixin.qq.com/sandbox/carinsurance/getauthcode
 * weixin.weixin_mch_id=1265544501
 * weixin.authentication_redirect_url=http://plytst.e-acic.com/bp-payonline/wxAuth.do
 *
 * @Version ： 1.0
 **/

@RestController
@RequestMapping("/Wechat")
public class WeiXinAuthController {

    @RequestMapping(value="/auth")
    public void auth(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String weixinAuth = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxf88f81e2bacf2761&redirect_uri=https://plytst.e-acic.com/bp-paystation/achieveTXC.do&response_type=code&scope=snsapi_base&&state=210102185039#wechat_redirect";

        String weixin_accredit_url = "https://open.weixin.qq.com/connect/oauth2/authorize?" ;
        String app_id = "wxf88f81e2bacf2761";
        // 获取openid的回跳
        String weixin_redirect_uri = "https://plytst.e-acic.com/bp-paystation/achieveTXC.do";
        String orderId = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")).concat(String.valueOf((char)(Math.random() * 128))).concat(String.valueOf((int)(Math.random()*90 + 10)));


        String url = weixin_accredit_url.concat("appid=").concat(app_id)
                .concat("&redirect_uri=").concat(weixin_redirect_uri)
                .concat("&response_type=code&scope=snsapi_base&&state=").concat(orderId).concat("#wechat_redirect");

        response.sendRedirect(url);
    }

    @GetMapping(value="/authLink")
    public String authLink(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String weixinAuth = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxf88f81e2bacf2761&redirect_uri=https://plytst.e-acic.com/bp-paystation/achieveTXC.do&response_type=code&scope=snsapi_base&&state=210102185039#wechat_redirect";

        String weixin_accredit_url = "https://open.weixin.qq.com/connect/oauth2/authorize?" ;
        String app_id = "wxf88f81e2bacf2761";
        // 获取openid的回跳,需要公众号配置授权  下载txt文件放到项目目录验证
        String weixin_redirect_uri = "https://plytst.e-acic.com/bp-paystation/achieveTXC.do";
        String orderId = "210102185039";


        String url = weixin_accredit_url.concat("appid=").concat(app_id)
                .concat("&redirect_uri=").concat(weixin_redirect_uri)
                .concat("&response_type=code&scope=snsapi_base&state=").concat(orderId).concat("#wechat_redirect");


        return  url ;
    }
}
