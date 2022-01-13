package com.xiaocai.demo.http;

import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ HttpNetUtil ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/13 17:57
 * @Version ： 1.0
 **/
public class HttpNetUtil {



    public String httpjson(String url, String data1, String sign, String customerNo) {
        if (null != url && !"".equals(url.trim())) {
            URL u = null;
            HttpURLConnection con = null;

            try {
                u = new URL(url);
                con = (HttpURLConnection)u.openConnection();
                con.setRequestMethod("POST");
                con.setDoOutput(true);
                con.setDoInput(true);
                con.setConnectTimeout(120000);
                con.setReadTimeout(120000);
                con.setUseCaches(false);
                con.setRequestProperty("Content-Type", "application/json");
                con.setRequestProperty("sign", sign);
                con.setRequestProperty("data", data1);
                con.setRequestProperty("customerNo", customerNo);
                OutputStreamWriter osw = new OutputStreamWriter(con.getOutputStream(), StandardCharsets.UTF_8.name());
                osw.write(data1);
                osw.flush();
                osw.close();
            } catch (Exception var13) {
                var13.printStackTrace();
            } finally {
                if (con != null) {
                    con.disconnect();
                }

            }

            StringBuffer buffer = new StringBuffer();

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8.name()));

                String temp;
                while((temp = br.readLine()) != null) {
                    buffer.append(temp);
                    buffer.append("\n");
                }
            } catch (Exception var15) {
                var15.printStackTrace();
            }

            return buffer.toString();
        } else {
            System.out.println("发送地址为空");
            return null;
        }
    }

    public String httpjsonKillIp(String url, String referer, String visitIP) {
        if (null != url && !"".equals(url.trim())) {
            URL u = null;
            HttpURLConnection con = null;

            try {
                u = new URL(url);
                con = (HttpURLConnection)u.openConnection();
                con.setRequestMethod("POST");
                con.setDoOutput(true);
                con.setDoInput(true);
                con.setConnectTimeout(120000);
                con.setReadTimeout(120000);
                con.setUseCaches(false);
                con.setRequestProperty("Content-Type", "application/json");
                //con.setRequestProperty("sign", sign);
                //con.setRequestProperty("data", data1);
                con.setRequestProperty("Referer", referer);



                if (!StringUtils.isEmpty(visitIP)) {
                    con.setRequestProperty("X-Forwarded-For",visitIP);
                    con.setRequestProperty("Proxy-Client-IP",visitIP);
                    con.setRequestProperty("WL-Proxy-Client-IP",visitIP);
                    con.setRequestProperty("HTTP_CLIENT_IP",visitIP);
                    con.setRequestProperty("HTTP_X_FORWARDED_FOR",visitIP);
                    con.setRequestProperty("REMOTE_ADDR",visitIP);
                    con.setRequestProperty("x-forwarded-for",visitIP);
                }

                OutputStreamWriter osw = new OutputStreamWriter(con.getOutputStream(), StandardCharsets.UTF_8.name());
                //osw.write(data1);
                osw.flush();
                osw.close();
            } catch (Exception var13) {
                var13.printStackTrace();
            } finally {
                if (con != null) {
                    con.disconnect();
                }

            }

            StringBuffer buffer = new StringBuffer();

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8.name()));

                String temp;
                while((temp = br.readLine()) != null) {
                    buffer.append(temp);
                    buffer.append("\n");
                }
            } catch (Exception var15) {
                var15.printStackTrace();
            }

            return buffer.toString();
        } else {
            System.out.println("发送地址为空");
            return null;
        }
    }
}
