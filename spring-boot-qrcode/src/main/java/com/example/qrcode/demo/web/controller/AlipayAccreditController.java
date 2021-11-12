package com.example.qrcode.demo.web.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.response.AlipaySystemOauthTokenResponse;
import com.example.qrcode.demo.core.constants.AliPayConstants;
import com.example.qrcode.demo.web.service.AlipayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ AlipayAccreditController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/11/12 15:13
 * @Version ： 1.0
 **/
@Slf4j
@RestController
public class AlipayAccreditController {

    @Autowired
    AliPayConstants aliPayConstants ;

    @Autowired
    AlipayService alipayService ;

    @RequestMapping(value="accredit.do")
    public void accredit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        StringBuffer sb = new StringBuffer("");
        Map<String, String> parmMap = new LinkedHashMap<String, String>();
        Map reqMap = request.getParameterMap();
        for (Object key : reqMap.keySet()) {
            parmMap.put(key.toString(), ((String[]) reqMap.get(key))[0]);
            sb.append(key.toString()).append("=").append(((String[]) reqMap.get(key))[0]).append("&");
        }

        String orderId = (String)parmMap.get("state");
        String app_id = (String)parmMap.get("app_id");
        String code = (String)parmMap.get("auth_code");

        String access_token = "";
        String alipay_userId = "";
        try {
            AlipaySystemOauthTokenResponse responseToken = alipayService.getToken(code, app_id);
            if (responseToken != null && responseToken.isSuccess()) {
                access_token = responseToken.getAccessToken();
                alipay_userId = responseToken.getUserId();
                log.info("access_token : "+access_token);
                log.info("alipay_userId : "+alipay_userId);
            }
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }

        // 拿到 access_token 或 userid 就可以继续业务流程
    }
}
