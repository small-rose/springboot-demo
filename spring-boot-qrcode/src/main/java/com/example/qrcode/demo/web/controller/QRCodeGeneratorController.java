package com.example.qrcode.demo.web.controller;

import com.example.qrcode.demo.core.utils.QRCodeUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ QrCodeController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/11/12 14:28
 * @Version ： 1.0
 **/
@RestController
@RequestMapping("/getQrCode")
public class QRCodeGeneratorController {

        @GetMapping("/generator")
        public void encodeQrCode(String codeContent, HttpServletResponse response) {
            // 嵌入二维码的图片路径
            String imgPath = "";
            try {
                QRCodeUtil.encode(codeContent, imgPath, true, response.getOutputStream());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }