package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : t_consume
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class TConsume {
    /**
     * 主键
     */
    private Long tano;

    /**
     * 申请号
     */
    private String applyno;

    /**
     * 收单行号
     */
    private String bankCode;

    /**
     * 保险公司号
     */
    private String insureId;

    /**
     * 银行商户号
     */
    private String midno;

    /**
     * 银行终端号
     */
    private String tidno;

    /**
     * 银行交易日期
     */
    private String bkAcctDate;

    /**
     * 银行交易时间
     */
    private String bkAcctTime;

    /**
     * 银行交易流水号
     */
    private String bkSerial;

    /**
     * 银行交易渠道
     */
    private String bkTranChnl;

    /**
     * 银行收款金额
     */
    private String amount;

    /**
     * 支付次数
     */
    private BigDecimal paycount;

    /**
     * 平台用户
     */
    private String userid;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 支票操作员代码
     */
    private String checkOpcode;

    /**
     * 支票操作员名称
     */
    private String checkOpname;

    /**
     * 支付币种
     */
    private String currencytype;

    /**
    * 获取-主键
    * @return tano
     */
    public Long getTano() {
        return tano;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param tano - 主键
     */
    public void setTano(Long tano) {
        this.tano = tano;
    }

    /**
    * 获取-申请号
    * @return applyno
     */
    public String getApplyno() {
        return applyno;
    }

    /**
    * 设置-申请号
    * @paramType java.lang.String
    * @param applyno - 申请号
     */
    public void setApplyno(String applyno) {
        this.applyno = applyno;
    }

    /**
    * 获取-收单行号
    * @return bankCode
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
    * 设置-收单行号
    * @paramType java.lang.String
    * @param bankCode - 收单行号
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    /**
    * 获取-保险公司号
    * @return insureId
     */
    public String getInsureId() {
        return insureId;
    }

    /**
    * 设置-保险公司号
    * @paramType java.lang.String
    * @param insureId - 保险公司号
     */
    public void setInsureId(String insureId) {
        this.insureId = insureId;
    }

    /**
    * 获取-银行商户号
    * @return midno
     */
    public String getMidno() {
        return midno;
    }

    /**
    * 设置-银行商户号
    * @paramType java.lang.String
    * @param midno - 银行商户号
     */
    public void setMidno(String midno) {
        this.midno = midno;
    }

    /**
    * 获取-银行终端号
    * @return tidno
     */
    public String getTidno() {
        return tidno;
    }

    /**
    * 设置-银行终端号
    * @paramType java.lang.String
    * @param tidno - 银行终端号
     */
    public void setTidno(String tidno) {
        this.tidno = tidno;
    }

    /**
    * 获取-银行交易日期
    * @return bkAcctDate
     */
    public String getBkAcctDate() {
        return bkAcctDate;
    }

    /**
    * 设置-银行交易日期
    * @paramType java.lang.String
    * @param bkAcctDate - 银行交易日期
     */
    public void setBkAcctDate(String bkAcctDate) {
        this.bkAcctDate = bkAcctDate;
    }

    /**
    * 获取-银行交易时间
    * @return bkAcctTime
     */
    public String getBkAcctTime() {
        return bkAcctTime;
    }

    /**
    * 设置-银行交易时间
    * @paramType java.lang.String
    * @param bkAcctTime - 银行交易时间
     */
    public void setBkAcctTime(String bkAcctTime) {
        this.bkAcctTime = bkAcctTime;
    }

    /**
    * 获取-银行交易流水号
    * @return bkSerial
     */
    public String getBkSerial() {
        return bkSerial;
    }

    /**
    * 设置-银行交易流水号
    * @paramType java.lang.String
    * @param bkSerial - 银行交易流水号
     */
    public void setBkSerial(String bkSerial) {
        this.bkSerial = bkSerial;
    }

    /**
    * 获取-银行交易渠道
    * @return bkTranChnl
     */
    public String getBkTranChnl() {
        return bkTranChnl;
    }

    /**
    * 设置-银行交易渠道
    * @paramType java.lang.String
    * @param bkTranChnl - 银行交易渠道
     */
    public void setBkTranChnl(String bkTranChnl) {
        this.bkTranChnl = bkTranChnl;
    }

    /**
    * 获取-银行收款金额
    * @return amount
     */
    public String getAmount() {
        return amount;
    }

    /**
    * 设置-银行收款金额
    * @paramType java.lang.String
    * @param amount - 银行收款金额
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
    * 获取-支付次数
    * @return paycount
     */
    public BigDecimal getPaycount() {
        return paycount;
    }

    /**
    * 设置-支付次数
    * @paramType java.math.BigDecimal
    * @param paycount - 支付次数
     */
    public void setPaycount(BigDecimal paycount) {
        this.paycount = paycount;
    }

    /**
    * 获取-平台用户
    * @return userid
     */
    public String getUserid() {
        return userid;
    }

    /**
    * 设置-平台用户
    * @paramType java.lang.String
    * @param userid - 平台用户
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
    * 获取-时间戳
    * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
    * 设置-时间戳
    * @paramType java.util.Date
    * @param timestamp - 时间戳
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
    * 获取-支票操作员代码
    * @return checkOpcode
     */
    public String getCheckOpcode() {
        return checkOpcode;
    }

    /**
    * 设置-支票操作员代码
    * @paramType java.lang.String
    * @param checkOpcode - 支票操作员代码
     */
    public void setCheckOpcode(String checkOpcode) {
        this.checkOpcode = checkOpcode;
    }

    /**
    * 获取-支票操作员名称
    * @return checkOpname
     */
    public String getCheckOpname() {
        return checkOpname;
    }

    /**
    * 设置-支票操作员名称
    * @paramType java.lang.String
    * @param checkOpname - 支票操作员名称
     */
    public void setCheckOpname(String checkOpname) {
        this.checkOpname = checkOpname;
    }

    /**
    * 获取-支付币种
    * @return currencytype
     */
    public String getCurrencytype() {
        return currencytype;
    }

    /**
    * 设置-支付币种
    * @paramType java.lang.String
    * @param currencytype - 支付币种
     */
    public void setCurrencytype(String currencytype) {
        this.currencytype = currencytype;
    }
}