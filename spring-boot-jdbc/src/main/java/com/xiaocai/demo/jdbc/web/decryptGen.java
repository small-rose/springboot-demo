package com.fndsoft.mm.boot;

import com.alibaba.druid.filter.config.ConfigTools;

public class decryptGen {
    public static void main(String[] args) throws Exception {
        String password = "123456";
        String[] arr = ConfigTools.genKeyPair(512);
        System.out.println(arr[1]);

        String encryptPassword = ConfigTools.encrypt(arr[0], password);
        System.out.println(encryptPassword);
    }
}
