package com.xiaocai.demo.excel.easyexcel.bank;

import com.alibaba.excel.EasyExcel;

import java.io.File;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-30 15:39
 **/
public class SQLBankGateWay {

    public static void main(String[] args) {
        // 被读取的文件绝对路径
        String file = "F:"+ File.separator + "AnCheng-Docs" + File.separator + "D_BANKGATEWAY.xlsx";
        EasyExcel.read(file, BankGateWay.class, new BankGateWayListener()).sheet().doRead();
    }
}
