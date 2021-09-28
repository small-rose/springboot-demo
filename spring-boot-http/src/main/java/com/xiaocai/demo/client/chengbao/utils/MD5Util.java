package com.xiaocai.demo.client.chengbao.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * @Project : bp-paystation
 * @Author : zhangzongyuan
 * @Description : [ MD5Util ] 说明：不是自己创建的类，是安诚承保系统提供
 * @Function :  功能说明： 承保对接时，文档中提供的加密相关的文件
 * @Date ：2021/9/22 14:18
 * @Version ： 1.0
 **/
public class MD5Util {

    private static final String APP_SECRET = "85848@qqq";

    public static String createSign(Object obj) {
        String jsonString = JSON.toJSONString(obj);
        String json = sortAsciiJson(jsonString);
        return Md5(json);
    }


    private static String Md5(String message) {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
        char[] charArray = message.toCharArray();
        byte[] byteArray = new byte[charArray.length];
        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] digest = md5.digest(byteArray);
        StringBuilder sb = new StringBuilder();
        for (byte by : digest) {
            int var = by & 0xff;
            if (var < 16)
                sb.append("0");
            sb.append(Integer.toHexString(var));
        }
        return sb.toString();
    }

    private static String sortAsciiJson(String json) {
        String res = "";
        try {
            JSONObject jsonObject = JSONObject.parseObject(json);
            jsonObject.put("appSecret", APP_SECRET);
            Set<String> set = jsonObject.keySet();
            List<String> nameList = new ArrayList<>(set);
            Collections.sort(nameList);
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            for (int i = 0; i < nameList.size(); i++) {
                String name = nameList.get(i);
                String value = jsonObject.getString(name);
                if (i != 0) sb.append(",");
                if (value.startsWith("{") || value.startsWith("[")) {
                    sb.append(String.format("\"%s\":%s", name, value));
                } else {
                    sb.append(String.format("\"%s\":\"%s\"", name, value));
                }
            }
            sb.append("}");
            res = sb.toString();
        } catch (JSONException e) {
            return "";
        }
        return res;
    }
}
