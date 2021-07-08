package com.xiaocai.demo.excel.easyexcel.bank;

import com.alibaba.excel.EasyExcel;
import com.xiaocai.demo.excel.common.DBType;

import java.io.File;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-30 15:39
 **/
public class SQLBankGateWay {

    private static String sqlPath = "F:" + File.separator + "bankgateway.sql";

    public static void main(String[] args) {
        // 被读取的文件绝对路径
        String file = "F:"+ File.separator + "AnCheng-Docs" + File.separator + "D_BANKGATEWAY.xlsx";

        BankGateWayListener bankGateWayListener = new BankGateWayListener();
        // 设置生成SQL的数据库类型
        bankGateWayListener.setDbType(DBType.MYSQL);
        bankGateWayListener.setSqlPath(sqlPath);

        EasyExcel.read(file, BankGateWay.class, bankGateWayListener).sheet().doRead();
    }

}
