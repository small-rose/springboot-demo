package com.xiaocai.demo.client;

import com.xiaocai.demo.http.HttpClientUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ CancalApplication ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/10/8 10:46
 * @Version ： 1.0
 **/
public class CancalApplication {

    public static String requestMessage = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><PACKET TYPE=\"REQUEST\" > <HEAD><TRAN_CODE>C0</TRAN_CODE><USER>Hx04</USER><PASSWORD>Hx04pwd</PASSWORD></HEAD><BODY><BASE><PAY_APP_NO>220530000499</PAY_APP_NO><REMARK>null</REMARK></BASE></BODY></PACKET>";

    public static void main(String[] args) {
//        String url = "http://192.168.50.254:9090/bp-paystation/ApplicationsServlet";
        String url = "http://10.2.6.76:9090/bp-paystation/ApplicationsServlet";
        // 调收付 接口
        Map<String, String> params = new HashMap<>(2);
        params.put("param1", "cancelApplication");

        params.put("param2", requestMessage);

        String returnMessage = null;
        try {
            returnMessage = HttpClientUtil.postForm(url, params);
        } catch (Exception e) {
            //logger.error("调用接出错了！系统:"+dataSource+" 的URL是[ "+url+" ] ");
            e.printStackTrace();
        }
        System.out.println(returnMessage);
    }
}
