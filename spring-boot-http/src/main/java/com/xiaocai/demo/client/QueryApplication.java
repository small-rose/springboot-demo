package com.xiaocai.demo.client;

import com.xiaocai.demo.http.HttpClientUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ PostApplication ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/9 16:05
 * @Version ： 1.0
 **/
public class QueryApplication {

    public static String requestMessage = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<PACKET TYPE=\"REQUEST\" >\n" +
            "<HEAD>\n" +
            "<TRAN_CODE>B0</TRAN_CODE>\n" +
            "\n" +
            "\t\t<USER>\n" +
            "\t\t\t<![CDATA[Hx05]]>\n" +
            "\t\t</USER>\n" +
            "\t\t<PASSWORD>\n" +
            "\t\t\t<![CDATA[Hx05pwd]]>\n" +
            "\t\t</PASSWORD>\n" +
            "</HEAD>\n" +
            "<BODY>\n" +
            "<BASE>\n" +
            "<PAY_APP_NO>210102182588</PAY_APP_NO>\n" +
            "</BASE>\n" +
            "</BODY>\n" +
            "</PACKET>";

    public static void main(String[] args) {
        //String url = "http://192.168.120.21:9090/bp-paystation/ApplicationsServlet";
        String url = "http://10.2.6.76:9090/bp-paystation/ApplicationsServlet";
        //String url = "http://192.168.50.254:9090/bp-paystation/ApplicationsServlet";

        // 调收付 接口
        Map<String, String> params = new HashMap<>(2);
        params.put("param1", "queryApplicationStatus");
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
