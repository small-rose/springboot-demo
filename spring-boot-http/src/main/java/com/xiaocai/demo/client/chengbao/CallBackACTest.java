package com.xiaocai.demo.client.chengbao;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.xiaocai.demo.client.chengbao.reqbean.PayBackBody;
import com.xiaocai.demo.client.chengbao.reqbean.PayBackHead;
import com.xiaocai.demo.client.chengbao.reqbean.PayBackToCBRequest;
import com.xiaocai.demo.client.chengbao.reqbean.PayBackToCBVo;
import com.xiaocai.demo.client.chengbao.utils.AesUtil;
import com.xiaocai.demo.client.chengbao.utils.MD5Util;
import org.junit.Test;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ CallBackACTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/28 10:14
 * @Version ： 1.0
 **/
public class CallBackACTest {

    @Test
    public void test01() throws UnirestException {
        //构建请求报文实体
        PayBackToCBRequest request = new PayBackToCBRequest();

        PayBackHead head = new PayBackHead();
        //车险和非车险的识别区分
        if ("1".equals(head.getCmd())){
            head.setDatasource("VHLPCIS");
        }else{
            head.setDatasource("NVHLPCIS");
        }
        request.setHead(head);

        PayBackBody body = new PayBackBody();
        System.out.println("head: "+ JSONObject.toJSONString(head));
        String sign = MD5Util.createSign(head);


        PayBackToCBVo pbtcb = new PayBackToCBVo();
        pbtcb.setPayAppNo(" ");// 支付申请号
        pbtcb.setCashNo("");
        pbtcb.setPayType(""); //
        pbtcb.setStatus("0");
        pbtcb.setBankAcctDate("2-");
        pbtcb.setTidNo("test");

        pbtcb.setBankCode("bankcodetest");
        pbtcb.setBkSerial("000");
        pbtcb.setCardNo("000");
        pbtcb.setAmount("1");
        pbtcb.setRemark("");
        pbtcb.setAuthenticAtionresult("01");
        pbtcb.setAuthenticNo("1234");
        // todo 待定
        pbtcb.setBusinessNo("");

        //if("WEIXIN".equals(app.getPaybkTranChnl())){
            pbtcb.setPayWayType("82");
        //}else if("ALIPAY".equals(app.getPaybkTranChnl())){
            pbtcb.setPayWayType("81");
        //}else if("POS".equals(app.getPaybkTranChnl())){
            pbtcb.setPayWayType("20");
        //}
        System.out.println("body: "+ JSONObject.toJSONString(pbtcb));

        String content = AesUtil.encry(pbtcb);
        body.setSign(sign);
        body.setContent(content);
        request.setBody(body);


        String url = "http://10.10.32.113:9090/unifypay/fndserver/api/outside/notify";
        String message = JSON.toJSONString(request);
        System.out.println("req："+message);
        String response = Unirest.post(url)
                .header("accept", "application/json")
                .body(message)
                .asString().getBody();

        JSONObject result = JSON.parseObject(response);//转换为实体类
        System.out.println(result);

    }
}
