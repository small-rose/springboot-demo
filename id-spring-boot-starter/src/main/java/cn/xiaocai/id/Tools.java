package cn.xiaocai.id;

import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ Tools ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/2/17 16:11
 * @Version ： 1.0
 **/

public class Tools {
    public Tools() {
    }

    public static String getLocalMacAddress() {
        String macAddress = "";

        try {
            Enumeration var1 = NetworkInterface.getNetworkInterfaces();
            byte[] mac = null;

            while(var1.hasMoreElements()) {
                NetworkInterface var2 = (NetworkInterface)var1.nextElement();
                if (!var2.isVirtual()) {
                    mac = var2.getHardwareAddress();
                    if (mac != null) {
                        break;
                    }
                }
            }

            if (mac != null) {
                StringBuffer sb = new StringBuffer();

                for(int i = 0; i < mac.length; ++i) {
                    if (i != 0) {
                        sb.append("-");
                    }

                    String s = Integer.toHexString(mac[i] & 255);
                    sb.append(s.length() == 1 ? 0 + s : s);
                }

                macAddress = sb.toString().toUpperCase().replace("-", "");
            }
        } catch (Exception var6) {
        }

        return macAddress;
    }
}
