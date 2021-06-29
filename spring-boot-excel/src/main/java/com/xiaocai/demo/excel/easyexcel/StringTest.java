package com.xiaocai.demo.excel.easyexcel;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-29 15:09
 **/
public class StringTest {

    public static void main(String[] args) {
        String name = "MM_CENTRALIZATIONLIST_TI（手续费结算单";
        System.out.println(name.substring(0, name.indexOf("（")));
        System.out.println(name.substring(name.indexOf("（")+1));

        String s = "ALTER TABLE ATS_PAY_TRANSACTIONS MODIFY COLUMN  REC_OBJECT_TYPE COMMENT '收方对象类型(3—员工 4－供应商 5—手工，对于一般业务代付填5\")' ; ";
        String result = s.replaceAll("\"","");
        System.out.println(result);
    }
}
