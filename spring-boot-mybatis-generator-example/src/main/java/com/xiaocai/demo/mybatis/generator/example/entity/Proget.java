package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : proget
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class Proget {
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
     * 实付号码
     */
    private String actugetno;

    /**
     * 付费类型
     */
    private String gettype;

    /**
     * 付费类型名称
     */
    private String getname;

    /**
     * 付费方式
     */
    private String getway;

    /**
     * 原币币别
     */
    private String currency;

    /**
     * 实付金额
     */
    private BigDecimal sumactugetmoney;

    /**
     * 实付金额
     */
    private BigDecimal sumactugetmoneycny;

    /**
     * 到帐日期
     */
    private Date enteraccdate;

    /**
     * 核销日期
     */
    private Date recogdate;

    /**
     * 领款人银行代码
     */
    private String payeebankcode;

    /**
     * 领款人银行名称
     */
    private String payeebankname;

    /**
     * 领款人银行账号
     */
    private String payeebankaccno;

    /**
     * 领款人账户名
     */
    private String payeeaccname;

    /**
     * 领款人证件类型代码
     */
    private String payeeidtype;

    /**
     * 领款人证件号码
     */
    private String payeeidno;

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
    * 获取-实付号码
    * @return actugetno
     */
    public String getActugetno() {
        return actugetno;
    }

    /**
    * 设置-实付号码
    * @paramType java.lang.String
    * @param actugetno - 实付号码
     */
    public void setActugetno(String actugetno) {
        this.actugetno = actugetno;
    }

    /**
    * 获取-付费类型
    * @return gettype
     */
    public String getGettype() {
        return gettype;
    }

    /**
    * 设置-付费类型
    * @paramType java.lang.String
    * @param gettype - 付费类型
     */
    public void setGettype(String gettype) {
        this.gettype = gettype;
    }

    /**
    * 获取-付费类型名称
    * @return getname
     */
    public String getGetname() {
        return getname;
    }

    /**
    * 设置-付费类型名称
    * @paramType java.lang.String
    * @param getname - 付费类型名称
     */
    public void setGetname(String getname) {
        this.getname = getname;
    }

    /**
    * 获取-付费方式
    * @return getway
     */
    public String getGetway() {
        return getway;
    }

    /**
    * 设置-付费方式
    * @paramType java.lang.String
    * @param getway - 付费方式
     */
    public void setGetway(String getway) {
        this.getway = getway;
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
    * 获取-实付金额
    * @return sumactugetmoney
     */
    public BigDecimal getSumactugetmoney() {
        return sumactugetmoney;
    }

    /**
    * 设置-实付金额
    * @paramType java.math.BigDecimal
    * @param sumactugetmoney - 实付金额
     */
    public void setSumactugetmoney(BigDecimal sumactugetmoney) {
        this.sumactugetmoney = sumactugetmoney;
    }

    /**
    * 获取-实付金额
    * @return sumactugetmoneycny
     */
    public BigDecimal getSumactugetmoneycny() {
        return sumactugetmoneycny;
    }

    /**
    * 设置-实付金额
    * @paramType java.math.BigDecimal
    * @param sumactugetmoneycny - 实付金额
     */
    public void setSumactugetmoneycny(BigDecimal sumactugetmoneycny) {
        this.sumactugetmoneycny = sumactugetmoneycny;
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
    * 获取-领款人银行代码
    * @return payeebankcode
     */
    public String getPayeebankcode() {
        return payeebankcode;
    }

    /**
    * 设置-领款人银行代码
    * @paramType java.lang.String
    * @param payeebankcode - 领款人银行代码
     */
    public void setPayeebankcode(String payeebankcode) {
        this.payeebankcode = payeebankcode;
    }

    /**
    * 获取-领款人银行名称
    * @return payeebankname
     */
    public String getPayeebankname() {
        return payeebankname;
    }

    /**
    * 设置-领款人银行名称
    * @paramType java.lang.String
    * @param payeebankname - 领款人银行名称
     */
    public void setPayeebankname(String payeebankname) {
        this.payeebankname = payeebankname;
    }

    /**
    * 获取-领款人银行账号
    * @return payeebankaccno
     */
    public String getPayeebankaccno() {
        return payeebankaccno;
    }

    /**
    * 设置-领款人银行账号
    * @paramType java.lang.String
    * @param payeebankaccno - 领款人银行账号
     */
    public void setPayeebankaccno(String payeebankaccno) {
        this.payeebankaccno = payeebankaccno;
    }

    /**
    * 获取-领款人账户名
    * @return payeeaccname
     */
    public String getPayeeaccname() {
        return payeeaccname;
    }

    /**
    * 设置-领款人账户名
    * @paramType java.lang.String
    * @param payeeaccname - 领款人账户名
     */
    public void setPayeeaccname(String payeeaccname) {
        this.payeeaccname = payeeaccname;
    }

    /**
    * 获取-领款人证件类型代码
    * @return payeeidtype
     */
    public String getPayeeidtype() {
        return payeeidtype;
    }

    /**
    * 设置-领款人证件类型代码
    * @paramType java.lang.String
    * @param payeeidtype - 领款人证件类型代码
     */
    public void setPayeeidtype(String payeeidtype) {
        this.payeeidtype = payeeidtype;
    }

    /**
    * 获取-领款人证件号码
    * @return payeeidno
     */
    public String getPayeeidno() {
        return payeeidno;
    }

    /**
    * 设置-领款人证件号码
    * @paramType java.lang.String
    * @param payeeidno - 领款人证件号码
     */
    public void setPayeeidno(String payeeidno) {
        this.payeeidno = payeeidno;
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