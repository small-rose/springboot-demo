package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_bank_inpayment_history
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmBankInpaymentHistory {
    /**
     * 明细主键
     */
    private String urid;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 账号
     */
    private String accountno;

    /**
     * 发生额
     */
    private BigDecimal ledgeramount;

    /**
     * 交易日期
     */
    private Date postdate;

    /**
     * 交易时间
     */
    private Date postdatetime;

    /**
     * 起息日期
     */
    private Date valuedate;

    /**
     * 组织编码
     */
    private String orgcode;

    /**
     * 备注
     */
    private String comments;

    /**
     * 对账码
     */
    private String abstract;

    /**
     * 用途
     */
    private String purpose;

    /**
     * 对方账号
     */
    private String customerreference;

    /**
     * 对方银行
     */
    private String bankreference;

    /**
     * 对方账户户名
     */
    private String customerreferencename;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 交易代码： 27-借 22-贷
     */
    private String transactioncode;

    /**
     * 凭证号 长度64
     */
    private String vouchercode;

    /**
     * 明细与流水唯一关联码
     */
    private String transseq;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 落地状态 1:初始状态 2:落地成功 3:落地失败
     */
    private String status;

    /**
     * 落地信息
     */
    private String msg;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
    * 获取-明细主键
    * @return urid
     */
    public String getUrid() {
        return urid;
    }

    /**
    * 设置-明细主键
    * @paramType java.lang.String
    * @param urid - 明细主键
     */
    public void setUrid(String urid) {
        this.urid = urid;
    }

    /**
    * 获取-批次号
    * @return batchid
     */
    public String getBatchid() {
        return batchid;
    }

    /**
    * 设置-批次号
    * @paramType java.lang.String
    * @param batchid - 批次号
     */
    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    /**
    * 获取-账号
    * @return accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
    * 设置-账号
    * @paramType java.lang.String
    * @param accountno - 账号
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
    * 获取-发生额
    * @return ledgeramount
     */
    public BigDecimal getLedgeramount() {
        return ledgeramount;
    }

    /**
    * 设置-发生额
    * @paramType java.math.BigDecimal
    * @param ledgeramount - 发生额
     */
    public void setLedgeramount(BigDecimal ledgeramount) {
        this.ledgeramount = ledgeramount;
    }

    /**
    * 获取-交易日期
    * @return postdate
     */
    public Date getPostdate() {
        return postdate;
    }

    /**
    * 设置-交易日期
    * @paramType java.util.Date
    * @param postdate - 交易日期
     */
    public void setPostdate(Date postdate) {
        this.postdate = postdate;
    }

    /**
    * 获取-交易时间
    * @return postdatetime
     */
    public Date getPostdatetime() {
        return postdatetime;
    }

    /**
    * 设置-交易时间
    * @paramType java.util.Date
    * @param postdatetime - 交易时间
     */
    public void setPostdatetime(Date postdatetime) {
        this.postdatetime = postdatetime;
    }

    /**
    * 获取-起息日期
    * @return valuedate
     */
    public Date getValuedate() {
        return valuedate;
    }

    /**
    * 设置-起息日期
    * @paramType java.util.Date
    * @param valuedate - 起息日期
     */
    public void setValuedate(Date valuedate) {
        this.valuedate = valuedate;
    }

    /**
    * 获取-组织编码
    * @return orgcode
     */
    public String getOrgcode() {
        return orgcode;
    }

    /**
    * 设置-组织编码
    * @paramType java.lang.String
    * @param orgcode - 组织编码
     */
    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    /**
    * 获取-备注
    * @return comments
     */
    public String getComments() {
        return comments;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param comments - 备注
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
    * 获取-对账码
    * @return abstract
     */
    public String getAbstract() {
        return abstract;
    }

    /**
    * 设置-对账码
    * @paramType java.lang.String
    * @param abstract - 对账码
     */
    public void setAbstract(String abstract) {
        this.abstract = abstract;
    }

    /**
    * 获取-用途
    * @return purpose
     */
    public String getPurpose() {
        return purpose;
    }

    /**
    * 设置-用途
    * @paramType java.lang.String
    * @param purpose - 用途
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /**
    * 获取-对方账号
    * @return customerreference
     */
    public String getCustomerreference() {
        return customerreference;
    }

    /**
    * 设置-对方账号
    * @paramType java.lang.String
    * @param customerreference - 对方账号
     */
    public void setCustomerreference(String customerreference) {
        this.customerreference = customerreference;
    }

    /**
    * 获取-对方银行
    * @return bankreference
     */
    public String getBankreference() {
        return bankreference;
    }

    /**
    * 设置-对方银行
    * @paramType java.lang.String
    * @param bankreference - 对方银行
     */
    public void setBankreference(String bankreference) {
        this.bankreference = bankreference;
    }

    /**
    * 获取-对方账户户名
    * @return customerreferencename
     */
    public String getCustomerreferencename() {
        return customerreferencename;
    }

    /**
    * 设置-对方账户户名
    * @paramType java.lang.String
    * @param customerreferencename - 对方账户户名
     */
    public void setCustomerreferencename(String customerreferencename) {
        this.customerreferencename = customerreferencename;
    }

    /**
    * 获取-余额
    * @return balance
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
    * 设置-余额
    * @paramType java.math.BigDecimal
    * @param balance - 余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
    * 获取-交易代码： 27-借 22-贷
    * @return transactioncode
     */
    public String getTransactioncode() {
        return transactioncode;
    }

    /**
    * 设置-交易代码： 27-借 22-贷
    * @paramType java.lang.String
    * @param transactioncode - 交易代码： 27-借 22-贷
     */
    public void setTransactioncode(String transactioncode) {
        this.transactioncode = transactioncode;
    }

    /**
    * 获取-凭证号 长度64
    * @return vouchercode
     */
    public String getVouchercode() {
        return vouchercode;
    }

    /**
    * 设置-凭证号 长度64
    * @paramType java.lang.String
    * @param vouchercode - 凭证号 长度64
     */
    public void setVouchercode(String vouchercode) {
        this.vouchercode = vouchercode;
    }

    /**
    * 获取-明细与流水唯一关联码
    * @return transseq
     */
    public String getTransseq() {
        return transseq;
    }

    /**
    * 设置-明细与流水唯一关联码
    * @paramType java.lang.String
    * @param transseq - 明细与流水唯一关联码
     */
    public void setTransseq(String transseq) {
        this.transseq = transseq;
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
    * 获取-落地状态 1:初始状态 2:落地成功 3:落地失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-落地状态 1:初始状态 2:落地成功 3:落地失败
    * @paramType java.lang.String
    * @param status - 落地状态 1:初始状态 2:落地成功 3:落地失败
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-落地信息
    * @return msg
     */
    public String getMsg() {
        return msg;
    }

    /**
    * 设置-落地信息
    * @paramType java.lang.String
    * @param msg - 落地信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
    * 获取-最后操作时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作时间
    * @paramType java.util.Date
    * @param lastopdate - 最后操作时间
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }
}