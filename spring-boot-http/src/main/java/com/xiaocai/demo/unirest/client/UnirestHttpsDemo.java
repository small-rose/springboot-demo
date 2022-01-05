package com.xiaocai.demo.unirest.client;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.vbao.service.trade.VbaoChargeSystemHandler;
import com.vbao.service.trade.bean.request.OneQRCodePaymentRequest;
import com.vbao.service.trade.bean.request.TradeRequestXml;
import com.vbao.service.trade.utils.Base64;
import com.vbao.service.trade.utils.TradeCodeEnum;
import org.junit.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ UnirestHttpsDemo ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/11/22 16:45
 * @Version ： 1.0
 **/
public class UnirestHttpsDemo {


    @Test
    public void test01() throws UnirestException {


        String InputCharset = "UTF-8";
        String customerNo = "202109150001";
        String key = "htEv7C5m3smtGRtCr94Z";
        String goodNo = "ONEQRCODE";
        String requestMobilePayXmlurl = "http://120.27.167.200:8080/vbaoPay/cust/payService/GetOneQRCode";
        VbaoChargeSystemHandler vbaoChargeSystemHandler = new VbaoChargeSystemHandler();
        OneQRCodePaymentRequest oneQRCodeRequest = new OneQRCodePaymentRequest();
        oneQRCodeRequest.setVersion("6.2");
        oneQRCodeRequest.setCustomerNo(customerNo);
        oneQRCodeRequest.setGoodNo(goodNo);
        //oneQRCodeRequest.setOrderNo("huo" + System.currentTimeMillis());
        oneQRCodeRequest.setOrderNo("210102191207777");
        System.out.println("请求订单号" + oneQRCodeRequest.getOrderNo());
        oneQRCodeRequest.setOrderAmount("0.01");
        oneQRCodeRequest.setProductName("baoxian");
        oneQRCodeRequest.setProductDesc("baoxian");
        oneQRCodeRequest.setNotifyUrl("https://payprod.e-acic.com/bp-paystation/YeePayNotifyCallAction.do");
        oneQRCodeRequest.setExt1("");
        oneQRCodeRequest.setExt2("");
        oneQRCodeRequest.setExpiredTime("");
        oneQRCodeRequest.setIsAuthenti("00");
        oneQRCodeRequest.setPaymentNos("11");
        String extName = "邵";
        extName = URLEncoder.encode(extName);
        String extMobile = "1815202";
        String extCertType = "IDENTITY_CARD";
        String extCertNo = "13112419920112";
        String extFixBuyer = "T";
        String extUserInfo = String.format("{\"name\":\"%s\",\"mobile\":\"%s\",\"cert_type\":\"%s\",\"cert_no\":\"%s\",\"fix_buyer\":\"%s\"}", extName, extMobile, extCertType, extCertNo, extFixBuyer);
        oneQRCodeRequest.setRealName(extUserInfo);
        oneQRCodeRequest.setBranch1("分支结构1");
        oneQRCodeRequest.setBranch2("分支结构1");
        oneQRCodeRequest.setBranch3("分支结构1");
        oneQRCodeRequest.setSalesChannel("分支结构1");
        oneQRCodeRequest.setCustProductCode("产品aa");
        oneQRCodeRequest.setIsAuthenti("SH");
        oneQRCodeRequest.setPaymentNos("11111");
        oneQRCodeRequest.setPostBackUrl("2");
        TradeRequestXml tradeRequestXml = vbaoChargeSystemHandler.creatRequestXml(oneQRCodeRequest, key, InputCharset, TradeCodeEnum.ONEQRCOCE_PAY.getCode());
        System.out.println("发送明文报文:" + tradeRequestXml.getOriRequestXml());
        System.out.println("发送密文报文:" + tradeRequestXml.getRequestXml());
        if (tradeRequestXml.getErrMsg() == null) {
            String returnDKPayxml = http(requestMobilePayXmlurl, tradeRequestXml.getRequestXml(), InputCharset);
            System.out.println("返回密文报文11" + returnDKPayxml);
            if (null != returnDKPayxml && returnDKPayxml.length() > 0) {
                String returnOriDKPayxml = "";

                try {
                    returnOriDKPayxml = Base64.decode(returnDKPayxml, InputCharset);
                    System.out.println("解密后报文22" + returnOriDKPayxml);
                    if (null != returnOriDKPayxml && returnOriDKPayxml.length() > 0) {
                        boolean flag = vbaoChargeSystemHandler.verifySignature(returnOriDKPayxml, key, InputCharset);
                        if (flag) {
                            System.out.println("验签正确");
                            System.out.println("3333==" + URLDecoder.decode(returnOriDKPayxml, InputCharset));
                        }
                    }
                } catch (UnsupportedEncodingException var18) {
                    System.out.println("解析密文报文有误:" + var18.getMessage());
                }
            }
        } else {
            System.out.println("4444==" + tradeRequestXml.getErrMsg());
        }

    }


    String visitIP = "10.2.6.76";

    public String http(String url, String string1, String InputCharset) {
        if (null != url && !"".equals(url.trim())) {
            URL u = null;
            HttpURLConnection connection = null;

            try {
                u = new URL(url);
                connection = (HttpURLConnection)u.openConnection();
                connection.setRequestMethod("POST");
                connection.setDoOutput(true);
                connection.setDoInput(true);
                connection.setConnectTimeout(120000);
                connection.setReadTimeout(120000);
                connection.setUseCaches(false);
                connection.setRequestProperty("X-Forwarded-For",visitIP);
                connection.setRequestProperty("Proxy-Client-IP",visitIP);
                connection.setRequestProperty("WL-Proxy-Client-IP",visitIP);
                connection.setRequestProperty("HTTP_CLIENT_IP",visitIP);
                connection.setRequestProperty("HTTP_X_FORWARDED_FOR",visitIP);
                connection.setRequestProperty("REMOTE_ADDR",visitIP);
                connection.setRequestProperty("x-forwarded-for",visitIP);
                connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                OutputStreamWriter osw = new OutputStreamWriter(connection.getOutputStream(), InputCharset);
                osw.write(string1);
                osw.flush();
                osw.close();
            } catch (Exception var12) {
                var12.printStackTrace();
            } finally {
                if (connection != null) {
                    connection.disconnect();
                }

            }

            StringBuffer buffer = new StringBuffer();

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), InputCharset));

                String temp;
                while((temp = br.readLine()) != null) {
                    buffer.append(temp);
                    buffer.append("\n");
                }
            } catch (Exception var14) {
                var14.printStackTrace();
            }

            return buffer.toString();
        } else {
            System.out.println("发送地址为空");
            return null;
        }
    }
}
