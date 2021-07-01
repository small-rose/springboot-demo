package com.xiaocai.demo.excel.easyexcel.bank;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-30 15:44
 **/
@Data
@ToString
public class BankGateWay {
    @ExcelProperty("SEQID")
    private String SEQID ;

    @ExcelProperty("ORDER_BANKCODE")
    private String ORDER_BANKCODE;

    @ExcelProperty("ORDER_BANKNAME")
    private String ORDER_BANKNAME;

    @ExcelProperty("BANKCODE")
    private String BANKCODE;

    @ExcelProperty("BANKNAME")
    private String BANKNAME;


    @ExcelProperty("GROUPTYPE")
    private String 	GROUPTYPE;
    @ExcelProperty("REQUEST_ID")
    private String REQUEST_ID;
    @ExcelProperty("REQUEST_URL")
    private String REQUEST_URL;
    @ExcelProperty("SIGNKEY")
    private String SIGNKEY;
    @ExcelProperty("SIGNTYPE")
    private String SIGNTYPE;

    @ExcelProperty("INSU_MIDNO")
    private String INSU_MIDNO;

    @ExcelProperty("ACCOUNTNO")
    private String ACCOUNTNO;
    @ExcelProperty("CURRENCYCODE")
    private String CURRENCYCODE;
    @ExcelProperty("PAYTYPE")
    private String PAYTYPE;
    @ExcelProperty("CHARSET")
    private String CHARSET;

    @ExcelProperty("SHOW_URL")
    private String SHOW_URL;
    @ExcelProperty("NOTIFY_URL")
    private String NOTIFY_URL;
    @ExcelProperty("RETURN_URL")
    private String RETURN_URL;
    @ExcelProperty("VERYFY_URL")
    private String VERYFY_URL;
    @ExcelProperty("TRANSPORT")
    private String TRANSPORT;

    @ExcelProperty("IFVALID")
    private String IFVALID;
    @ExcelProperty("PAYMETHOD")
    private String PAYMETHOD;
    @ExcelProperty("DEFAULT_LOGIN")
    private String DEFAULT_LOGIN;
    @ExcelProperty("TIMESTAMP")
    private String TIMESTAMP;
    @ExcelProperty("LASTOPDATE")
    private String LASTOPDATE;

    @ExcelProperty("HIBERNATEVERSION")
    private String HIBERNATEVERSION;
    @ExcelProperty("MODIFYDESC")
    private String MODIFYDESC;
    @ExcelProperty("POSID")
    private String POSID;
    @ExcelProperty("MOBILE_REQUEST_URL")
    private String MOBILE_REQUEST_URL;
    @ExcelProperty("CONTRACTID")
    private String CONTRACTID;

    @ExcelProperty("TYPENAME")
    private String TYPENAME;
    @ExcelProperty("USER_ID")
    private String USER_ID;
    @ExcelProperty("PASSWORD")
    private String PASSWORD;
    @ExcelProperty("CUST_ID")
    private String CUST_ID;
    @ExcelProperty("TYPE")
    private String TYPE;

    @ExcelProperty("ACCOUNTNAME")
    private String ACCOUNTNAME;
    @ExcelProperty("SINGLE_MAXAMOUNT")
    private String SINGLE_MAXAMOUNT;
    @ExcelProperty("PACKET_MAXAMOUNT")
    private String PACKET_MAXAMOUNT;
    @ExcelProperty("PACKET_MAXCOUNT")
    private String PACKET_MAXCOUNT;
    @ExcelProperty("IFCHECKRESULT")
    private String IFCHECKRESULT;


}
