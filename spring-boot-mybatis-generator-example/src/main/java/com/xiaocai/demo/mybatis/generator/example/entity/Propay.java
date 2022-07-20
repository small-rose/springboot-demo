package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : propay
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class Propay {
    /**
     * 主键
     */
    private Long id;

    /**
     * 交易编码
     */
    private String transactionno;

    /**
     * 公司编码
     */
    private String companycode;

    /**
     * 原业务数据交易编码
     */
    private String transactionnoorig;

    /**
     * 单证类型
     */
    private String visatype;

    /**
     * 单证编号
     */
    private String visacode;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 收据号码
     */
    private String prtno;

    /**
     * 收费类型
     */
    private String chargetype;

    /**
     * 收费类型名称
     */
    private String chargename;

    /**
     * 原币币别
     */
    private String currency;

    /**
     * 实收原币金额
     */
    private BigDecimal payamount;

    /**
     * 实收金额
     */
    private BigDecimal payamountcny;

    /**
     * 收费方式代码
     */
    private String payway;

    /**
     * 到帐日期
     */
    private Date enteraccdate;

    /**
     * 核销日期
     */
    private Date recogdate;

    /**
     * 保费期次
     */
    private Integer premiumno;

    /**
     * 付款人银行代码
     */
    private String payerbankcode;

    /**
     * 付款人银行名称
     */
    private String payerbankname;

    /**
     * 付款人银行账号
     */
    private String payerbankaccno;

    /**
     * 付款人账户名
     */
    private String payeraccname;

    /**
     * 付款人证件类型代码
     */
    private String payercerttype;

    /**
     * 付款人证件号码
     */
    private String payercertno;

    /**
     * 交易完成时间
     */
    private Date transactiondate;

    /**
     * 批次号
     */
    private String batchno;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
    * 获取-主键
    * @return id
     */
    public Long getId() {
        return id;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param id - 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    * 获取-交易编码
    * @return transactionno
     */
    public String getTransactionno() {
        return transactionno;
    }

    /**
    * 设置-交易编码
    * @paramType java.lang.String
    * @param transactionno - 交易编码
     */
    public void setTransactionno(String transactionno) {
        this.transactionno = transactionno;
    }

    /**
    * 获取-公司编码
    * @return companycode
     */
    public String getCompanycode() {
        return companycode;
    }

    /**
    * 设置-公司编码
    * @paramType java.lang.String
    * @param companycode - 公司编码
     */
    public void setCompanycode(String companycode) {
        this.companycode = companycode;
    }

    /**
    * 获取-原业务数据交易编码
    * @return transactionnoorig
     */
    public String getTransactionnoorig() {
        return transactionnoorig;
    }

    /**
    * 设置-原业务数据交易编码
    * @paramType java.lang.String
    * @param transactionnoorig - 原业务数据交易编码
     */
    public void setTransactionnoorig(String transactionnoorig) {
        this.transactionnoorig = transactionnoorig;
    }

    /**
    * 获取-单证类型
    * @return visatype
     */
    public String getVisatype() {
        return visatype;
    }

    /**
    * 设置-单证类型
    * @paramType java.lang.String
    * @param visatype - 单证类型
     */
    public void setVisatype(String visatype) {
        this.visatype = visatype;
    }

    /**
    * 获取-单证编号
    * @return visacode
     */
    public String getVisacode() {
        return visacode;
    }

    /**
    * 设置-单证编号
    * @paramType java.lang.String
    * @param visacode - 单证编号
     */
    public void setVisacode(String visacode) {
        this.visacode = visacode;
    }

    /**
    * 获取-保单号
    * @return policyno
     */
    public String getPolicyno() {
        return policyno;
    }

    /**
    * 设置-保单号
    * @paramType java.lang.String
    * @param policyno - 保单号
     */
    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    /**
    * 获取-收据号码
    * @return prtno
     */
    public String getPrtno() {
        return prtno;
    }

    /**
    * 设置-收据号码
    * @paramType java.lang.String
    * @param prtno - 收据号码
     */
    public void setPrtno(String prtno) {
        this.prtno = prtno;
    }

    /**
    * 获取-收费类型
    * @return chargetype
     */
    public String getChargetype() {
        return chargetype;
    }

    /**
    * 设置-收费类型
    * @paramType java.lang.String
    * @param chargetype - 收费类型
     */
    public void setChargetype(String chargetype) {
        this.chargetype = chargetype;
    }

    /**
    * 获取-收费类型名称
    * @return chargename
     */
    public String getChargename() {
        return chargename;
    }

    /**
    * 设置-收费类型名称
    * @paramType java.lang.String
    * @param chargename - 收费类型名称
     */
    public void setChargename(String chargename) {
        this.chargename = chargename;
    }

    /**
    * 获取-原币币别
    * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
    * 设置-原币币别
    * @paramType java.lang.String
    * @param currency - 原币币别
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
    * 获取-实收原币金额
    * @return payamount
     */
    public BigDecimal getPayamount() {
        return payamount;
    }

    /**
    * 设置-实收原币金额
    * @paramType java.math.BigDecimal
    * @param payamount - 实收原币金额
     */
    public void setPayamount(BigDecimal payamount) {
        this.payamount = payamount;
    }

    /**
    * 获取-实收金额
    * @return payamountcny
     */
    public BigDecimal getPayamountcny() {
        return payamountcny;
    }

    /**
    * 设置-实收金额
    * @paramType java.math.BigDecimal
    * @param payamountcny - 实收金额
     */
    public void setPayamountcny(BigDecimal payamountcny) {
        this.payamountcny = payamountcny;
    }

    /**
    * 获取-收费方式代码
    * @return payway
     */
    public String getPayway() {
        return payway;
    }

    /**
    * 设置-收费方式代码
    * @paramType java.lang.String
    * @param payway - 收费方式代码
     */
    public void setPayway(String payway) {
        this.payway = payway;
    }

    /**
    * 获取-到帐日期
    * @return enteraccdate
     */
    public Date getEnteraccdate() {
        return enteraccdate;
    }

    /**
    * 设置-到帐日期
    * @paramType java.util.Date
    * @param enteraccdate - 到帐日期
     */
    public void setEnteraccdate(Date enteraccdate) {
        this.enteraccdate = enteraccdate;
    }

    /**
    * 获取-核销日期
    * @return recogdate
     */
    public Date getRecogdate() {
        return recogdate;
    }

    /**
    * 设置-核销日期
    * @paramType java.util.Date
    * @param recogdate - 核销日期
     */
    public void setRecogdate(Date recogdate) {
        this.recogdate = recogdate;
    }

    /**
    * 获取-保费期次
    * @return premiumno
     */
    public Integer getPremiumno() {
        return premiumno;
    }

    /**
    * 设置-保费期次
    * @paramType java.lang.Integer
    * @param premiumno - 保费期次
     */
    public void setPremiumno(Integer premiumno) {
        this.premiumno = premiumno;
    }

    /**
    * 获取-付款人银行代码
    * @return payerbankcode
     */
    public String getPayerbankcode() {
        return payerbankcode;
    }

    /**
    * 设置-付款人银行代码
    * @paramType java.lang.String
    * @param payerbankcode - 付款人银行代码
     */
    public void setPayerbankcode(String payerbankcode) {
        this.payerbankcode = payerbankcode;
    }

    /**
    * 获取-付款人银行名称
    * @return payerbankname
     */
    public String getPayerbankname() {
        return payerbankname;
    }

    /**
    * 设置-付款人银行名称
    * @paramType java.lang.String
    * @param payerbankname - 付款人银行名称
     */
    public void setPayerbankname(String payerbankname) {
        this.payerbankname = payerbankname;
    }

    /**
    * 获取-付款人银行账号
    * @return payerbankaccno
     */
    public String getPayerbankaccno() {
        return payerbankaccno;
    }

    /**
    * 设置-付款人银行账号
    * @paramType java.lang.String
    * @param payerbankaccno - 付款人银行账号
     */
    public void setPayerbankaccno(String payerbankaccno) {
        this.payerbankaccno = payerbankaccno;
    }

    /**
    * 获取-付款人账户名
    * @return payeraccname
     */
    public String getPayeraccname() {
        return payeraccname;
    }

    /**
    * 设置-付款人账户名
    * @paramType java.lang.String
    * @param payeraccname - 付款人账户名
     */
    public void setPayeraccname(String payeraccname) {
        this.payeraccname = payeraccname;
    }

    /**
    * 获取-付款人证件类型代码
    * @return payercerttype
     */
    public String getPayercerttype() {
        return payercerttype;
    }

    /**
    * 设置-付款人证件类型代码
    * @paramType java.lang.String
    * @param payercerttype - 付款人证件类型代码
     */
    public void setPayercerttype(String payercerttype) {
        this.payercerttype = payercerttype;
    }

    /**
    * 获取-付款人证件号码
    * @return payercertno
     */
    public String getPayercertno() {
        return payercertno;
    }

    /**
    * 设置-付款人证件号码
    * @paramType java.lang.String
    * @param payercertno - 付款人证件号码
     */
    public void setPayercertno(String payercertno) {
        this.payercertno = payercertno;
    }

    /**
    * 获取-交易完成时间
    * @return transactiondate
     */
    public Date getTransactiondate() {
        return transactiondate;
    }

    /**
    * 设置-交易完成时间
    * @paramType java.util.Date
    * @param transactiondate - 交易完成时间
     */
    public void setTransactiondate(Date transactiondate) {
        this.transactiondate = transactiondate;
    }

    /**
    * 获取-批次号
    * @return batchno
     */
    public String getBatchno() {
        return batchno;
    }

    /**
    * 设置-批次号
    * @paramType java.lang.String
    * @param batchno - 批次号
     */
    public void setBatchno(String batchno) {
        this.batchno = batchno;
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
}