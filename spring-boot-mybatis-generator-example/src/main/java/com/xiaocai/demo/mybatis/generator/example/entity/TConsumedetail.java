package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : t_consumedetail
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class TConsumedetail {
    /**
     * 主键
     */
    private Long circpaymentno;

    /**
     * 投保预确认码
     */
    private Long proconfirmsequenceno;

    /**
     * 系统参考号
     */
    private String referenceno;

    /**
     * 批改查询码
     */
    private String amendqueryno;

    /**
     * 银行账号
     */
    private String bankaccountsno;

    /**
     * 平台交易号
     */
    private String bankpaymentno;

    /**
     * 银行交易时间
     */
    private Date bankpaymenttime;

    /**
     * 号牌号码
     */
    private String carmark;

    /**
     * 平台缴费时间
     */
    private Date circpaymenttime;

    /**
     * 投保确认码
     */
    private String confirmsequenceno;

    /**
     * 缴费方式
     */
    private String paymethod;

    /**
     * 交易金额
     */
    private BigDecimal payment;

    /**
     * 到账状态
     */
    private String paymentstatus;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * pos机终端号
     */
    private String posno;

    /**
     * 车架号
     */
    private String rackno;

    /**
     * 应收保费
     */
    private BigDecimal sumpremium;

    /**
     * 号牌种类
     */
    private String vehicletype;

    /**
     * 凭证号码
     */
    private String warrantno;

    /**
    * 获取-主键
    * @return circpaymentno
     */
    public Long getCircpaymentno() {
        return circpaymentno;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param circpaymentno - 主键
     */
    public void setCircpaymentno(Long circpaymentno) {
        this.circpaymentno = circpaymentno;
    }

    /**
    * 获取-投保预确认码
    * @return proconfirmsequenceno
     */
    public Long getProconfirmsequenceno() {
        return proconfirmsequenceno;
    }

    /**
    * 设置-投保预确认码
    * @paramType java.lang.Long
    * @param proconfirmsequenceno - 投保预确认码
     */
    public void setProconfirmsequenceno(Long proconfirmsequenceno) {
        this.proconfirmsequenceno = proconfirmsequenceno;
    }

    /**
    * 获取-系统参考号
    * @return referenceno
     */
    public String getReferenceno() {
        return referenceno;
    }

    /**
    * 设置-系统参考号
    * @paramType java.lang.String
    * @param referenceno - 系统参考号
     */
    public void setReferenceno(String referenceno) {
        this.referenceno = referenceno;
    }

    /**
    * 获取-批改查询码
    * @return amendqueryno
     */
    public String getAmendqueryno() {
        return amendqueryno;
    }

    /**
    * 设置-批改查询码
    * @paramType java.lang.String
    * @param amendqueryno - 批改查询码
     */
    public void setAmendqueryno(String amendqueryno) {
        this.amendqueryno = amendqueryno;
    }

    /**
    * 获取-银行账号
    * @return bankaccountsno
     */
    public String getBankaccountsno() {
        return bankaccountsno;
    }

    /**
    * 设置-银行账号
    * @paramType java.lang.String
    * @param bankaccountsno - 银行账号
     */
    public void setBankaccountsno(String bankaccountsno) {
        this.bankaccountsno = bankaccountsno;
    }

    /**
    * 获取-平台交易号
    * @return bankpaymentno
     */
    public String getBankpaymentno() {
        return bankpaymentno;
    }

    /**
    * 设置-平台交易号
    * @paramType java.lang.String
    * @param bankpaymentno - 平台交易号
     */
    public void setBankpaymentno(String bankpaymentno) {
        this.bankpaymentno = bankpaymentno;
    }

    /**
    * 获取-银行交易时间
    * @return bankpaymenttime
     */
    public Date getBankpaymenttime() {
        return bankpaymenttime;
    }

    /**
    * 设置-银行交易时间
    * @paramType java.util.Date
    * @param bankpaymenttime - 银行交易时间
     */
    public void setBankpaymenttime(Date bankpaymenttime) {
        this.bankpaymenttime = bankpaymenttime;
    }

    /**
    * 获取-号牌号码
    * @return carmark
     */
    public String getCarmark() {
        return carmark;
    }

    /**
    * 设置-号牌号码
    * @paramType java.lang.String
    * @param carmark - 号牌号码
     */
    public void setCarmark(String carmark) {
        this.carmark = carmark;
    }

    /**
    * 获取-平台缴费时间
    * @return circpaymenttime
     */
    public Date getCircpaymenttime() {
        return circpaymenttime;
    }

    /**
    * 设置-平台缴费时间
    * @paramType java.util.Date
    * @param circpaymenttime - 平台缴费时间
     */
    public void setCircpaymenttime(Date circpaymenttime) {
        this.circpaymenttime = circpaymenttime;
    }

    /**
    * 获取-投保确认码
    * @return confirmsequenceno
     */
    public String getConfirmsequenceno() {
        return confirmsequenceno;
    }

    /**
    * 设置-投保确认码
    * @paramType java.lang.String
    * @param confirmsequenceno - 投保确认码
     */
    public void setConfirmsequenceno(String confirmsequenceno) {
        this.confirmsequenceno = confirmsequenceno;
    }

    /**
    * 获取-缴费方式
    * @return paymethod
     */
    public String getPaymethod() {
        return paymethod;
    }

    /**
    * 设置-缴费方式
    * @paramType java.lang.String
    * @param paymethod - 缴费方式
     */
    public void setPaymethod(String paymethod) {
        this.paymethod = paymethod;
    }

    /**
    * 获取-交易金额
    * @return payment
     */
    public BigDecimal getPayment() {
        return payment;
    }

    /**
    * 设置-交易金额
    * @paramType java.math.BigDecimal
    * @param payment - 交易金额
     */
    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    /**
    * 获取-到账状态
    * @return paymentstatus
     */
    public String getPaymentstatus() {
        return paymentstatus;
    }

    /**
    * 设置-到账状态
    * @paramType java.lang.String
    * @param paymentstatus - 到账状态
     */
    public void setPaymentstatus(String paymentstatus) {
        this.paymentstatus = paymentstatus;
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
    * 获取-pos机终端号
    * @return posno
     */
    public String getPosno() {
        return posno;
    }

    /**
    * 设置-pos机终端号
    * @paramType java.lang.String
    * @param posno - pos机终端号
     */
    public void setPosno(String posno) {
        this.posno = posno;
    }

    /**
    * 获取-车架号
    * @return rackno
     */
    public String getRackno() {
        return rackno;
    }

    /**
    * 设置-车架号
    * @paramType java.lang.String
    * @param rackno - 车架号
     */
    public void setRackno(String rackno) {
        this.rackno = rackno;
    }

    /**
    * 获取-应收保费
    * @return sumpremium
     */
    public BigDecimal getSumpremium() {
        return sumpremium;
    }

    /**
    * 设置-应收保费
    * @paramType java.math.BigDecimal
    * @param sumpremium - 应收保费
     */
    public void setSumpremium(BigDecimal sumpremium) {
        this.sumpremium = sumpremium;
    }

    /**
    * 获取-号牌种类
    * @return vehicletype
     */
    public String getVehicletype() {
        return vehicletype;
    }

    /**
    * 设置-号牌种类
    * @paramType java.lang.String
    * @param vehicletype - 号牌种类
     */
    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    /**
    * 获取-凭证号码
    * @return warrantno
     */
    public String getWarrantno() {
        return warrantno;
    }

    /**
    * 设置-凭证号码
    * @paramType java.lang.String
    * @param warrantno - 凭证号码
     */
    public void setWarrantno(String warrantno) {
        this.warrantno = warrantno;
    }
}