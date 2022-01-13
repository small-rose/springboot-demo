package com.xiaocai.demo.http;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ IpNumUtil ] 说明：无
 * @Function :  功能说明：基本知识点
 *
 * IP ——> 整数：
 *
 * 把IP地址转化为字节数组
 *
 * 通过左移位(<
 *
 * 整数 ——> IP：
 *
 * 将整数值进行右移位操作(>>>)，右移24位，再进行与操作符(&)0xFF，得到的数字即为第一段IP。
 *
 * 将整数值进行右移位操作(>>>)，右移16位，再进行与操作符(&)0xFF，得到的数字即为第二段IP。
 *
 * 将整数值进行右移位操作(>>>)，右移8位，再进行与操作符(&)0xFF，得到的数字即为第三段IP。
 *
 * 将整数值进行与操作符(&)0xFF，得到的数字即为第四段IP。
 *
 * 思路ip地址转int类型，例如ip为“192.168.1.116”,相当于“.“将ip地址分为了4部分，各部分对应的权值为256^3, 256^2, 256, 1,相成即可
 *
 * int类型转ip地址，思路类似，除以权值即可
 *
 *
 * @Date ：2022/1/13 18:35
 * @Version ： 1.0
 **/
public class IpNumUtil {

    public static int Ip2Int(String strIp){
        String[] ss = strIp.split(".");
        if(ss.length != 4){
            return 0;
        }
        byte[] bytes = new byte[ss.length];
        for(int i = 0; i < bytes.length; i++){
            bytes[i] = (byte) Integer.parseInt(ss[i]);
        }
        return byte2Int(bytes);
    }


    public static String int2Ip(int intIp){
        byte[] bytes = int2byte(intIp);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 4; i++){
            sb.append(bytes[i] & 0xFF);
            if(i < 3){
                sb.append(".");
            }
        }
        return sb.toString();
    }

    private static byte[] int2byte(int i) {
        byte[] bytes = new byte[4];
        bytes[0] = (byte) (0xff & i);
        bytes[1] = (byte) ((0xff00 & i) >> 8);
        bytes[2] = (byte) ((0xff0000 & i) >> 16);
        bytes[3] = (byte) ((0xff000000 & i) >> 24);
        return bytes;
    }
    private static int byte2Int(byte[] bytes) {
        int n = bytes[0] & 0xFF;
        n |= ((bytes[1] << 8) & 0xFF00);
        n |= ((bytes[2] << 16) & 0xFF0000);
        n |= ((bytes[3] << 24) & 0xFF000000);
        return n;
    }

    public static void main(String[] args) {
        String ip1 = "192.168.0.1";
        int intIp = Ip2Int(ip1);
        String ip2 = int2Ip(intIp);
        System.out.println(ip2.equals(ip1));
    }
}
