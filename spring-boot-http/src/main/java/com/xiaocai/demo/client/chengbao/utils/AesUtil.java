package com.xiaocai.demo.client.chengbao.utils;

import com.alibaba.fastjson.JSON;
import org.apache.commons.net.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;

/**
 * @Project : bp-paystation
 * @Author : zhangzongyuan
 * @Description : [ AesUtil ] 说明：不是自己创建的类，是安诚承保系统提供
 * @Function :  功能说明：承保对接时，文档中提供的加密相关的文件
 * @Date ：2021/9/22 14:17
 * @Version ： 1.0
 **/
public class AesUtil {

    private static final String key = "Zhong_Guo_Tou_Biao_Bao_Han_Wang";

    // 加密
    public static String encry(Object content) {
        String json = JSON.toJSONString(content);
        // IV为商户MD5密钥后16位
        String IV = key.substring(key.length() - 16);
        // RES的KEY 为商户MD5密钥的前16位
        String keys = key.substring(0, 16);
        return encryptData(json, keys, IV);
    }

    // 解密
    public static String desEncry(String content) {
        // IV为商户MD5密钥后16位
        String IV = key.substring(key.length() - 16);
        // RES的KEY 为商户MD5密钥的前16位
        String keys = key.substring(0, 16);
        return decryptData(content, keys, IV);
    }

    /**
     * aes 加密
     * @param data 明文
     */
    private static String encryptData(String data, String key, String IV){
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            byte[] dataBytes = data.getBytes(StandardCharsets.UTF_8);
            int plaintextLength = dataBytes.length;
            byte[] plaintext = new byte[plaintextLength];
            System.arraycopy(dataBytes, 0, plaintext, 0, dataBytes.length);
            SecretKeySpec keyspec = new SecretKeySpec(key.getBytes(), "AES");
            IvParameterSpec ivspec = new IvParameterSpec(IV.getBytes());
            cipher.init(Cipher.ENCRYPT_MODE, keyspec, ivspec);
            byte[] encrypted = cipher.doFinal(plaintext);
            return new String(Base64.encodeBase64(encrypted));
        } catch (Exception e) {
            return null;
        }

    }

    /**
     * 解密
     * @param data 密文
     */
    private static String decryptData(String data, String key, String IV) {
        try {
            byte[] encrypted1 = Base64.decodeBase64(data.getBytes(StandardCharsets.UTF_8));
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec keyspec = new SecretKeySpec(key.getBytes(), "AES");
            IvParameterSpec ivspec = new IvParameterSpec(IV.getBytes());
            cipher.init(Cipher.DECRYPT_MODE, keyspec, ivspec);
            byte[] original = cipher.doFinal(encrypted1);
            return new String(original, StandardCharsets.UTF_8);
        } catch (Exception e) {
            return null;
        }
    }
}

