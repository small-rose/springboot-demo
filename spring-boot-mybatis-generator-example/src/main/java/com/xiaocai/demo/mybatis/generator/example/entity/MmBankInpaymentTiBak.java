package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_bank_inpayment_ti_bak
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmBankInpaymentTiBak {
    /**
     * 主键
     */
    private String yqid;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 账号
     */
    private String accountno;

    /**
     * 币种,CNY 人民币（原币币种，基础档案）
     */
    private String currencycode;

    /**
     * 数据来源,资金传FUND
     */
    private String datasource;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 金额，单位元（原币金额）
     */
    private BigDecimal amount;

    /**
     * 汇率
     */
    private BigDecimal rate;

    /**
     * 账户性质,保费户 传1 、 业务支出户 传2 
     */
    private String accountflag;

    /**
     * 客户银行账号
     */
    private String custaccountno;

    /**
     * 客户代码,没有传0
     */
    private String customercode;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 票据类型：14 转账 15 现金 16 支票
     */
    private String checktype;

    /**
     * 票据日期
     */
    private Date checkdate;

    /**
     * 票据号码
     */
    private String checkno;

    /**
     * 出票人
     */
    private String remittername;

    /**
     * 摘要
     */
    private String description;

    /**
     * 客户账户名称
     */
    private String custaccountname;

    /**
     * 客户开户行名称
     */
    private String custaccountbankname;

    /**
     * 数据插入表的时间，精确时分秒
     */
    private Date timestamp;

    /**
     * 中间表交互时使用本字段，1 初始状态、2 收付接收成功、3收付接收失败
     */
    private String status;

    /**
     * 中间表交互时使用本字段。收付系统处理结果的描述
     */
    private String msg;

    /**
     * 对账码
     */
    private String reconciliationcode;

    /**
     * 余额
     */
    private String balance;

    /**
    * 获取-主键
    * @return yqid
     */
    public String getYqid() {
        return yqid;
    }

    /**
    * 设置-主键
    * @paramType java.lang.String
    * @param yqid - 主键
     */
    public void setYqid(String yqid) {
        this.yqid = yqid;
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
    * 获取-币种,CNY 人民币（原币币种，基础档案）
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种,CNY 人民币（原币币种，基础档案）
    * @paramType java.lang.String
    * @param currencycode - 币种,CNY 人民币（原币币种，基础档案）
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-数据来源,资金传FUND
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-数据来源,资金传FUND
    * @paramType java.lang.String
    * @param datasource - 数据来源,资金传FUND
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-操作日期
    * @return opdate
     */
    public Date getOpdate() {
        return opdate;
    }

    /**
    * 设置-操作日期
    * @paramType java.util.Date
    * @param opdate - 操作日期
     */
    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }

    /**
    * 获取-金额，单位元（原币金额）
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-金额，单位元（原币金额）
    * @paramType java.math.BigDecimal
    * @param amount - 金额，单位元（原币金额）
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-汇率
    * @return rate
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
    * 设置-汇率
    * @paramType java.math.BigDecimal
    * @param rate - 汇率
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
    * 获取-账户性质,保费户 传1 、 业务支出户 传2 
    * @return accountflag
     */
    public String getAccountflag() {
        return accountflag;
    }

    /**
    * 设置-账户性质,保费户 传1 、 业务支出户 传2 
    * @paramType java.lang.String
    * @param accountflag - 账户性质,保费户 传1 、 业务支出户 传2 
     */
    public void setAccountflag(String accountflag) {
        this.accountflag = accountflag;
    }

    /**
    * 获取-客户银行账号
    * @return custaccountno
     */
    public String getCustaccountno() {
        return custaccountno;
    }

    /**
    * 设置-客户银行账号
    * @paramType java.lang.String
    * @param custaccountno - 客户银行账号
     */
    public void setCustaccountno(String custaccountno) {
        this.custaccountno = custaccountno;
    }

    /**
    * 获取-客户代码,没有传0
    * @return customercode
     */
    public String getCustomercode() {
        return customercode;
    }

    /**
    * 设置-客户代码,没有传0
    * @paramType java.lang.String
    * @param customercode - 客户代码,没有传0
     */
    public void setCustomercode(String customercode) {
        this.customercode = customercode;
    }

    /**
    * 获取-客户名称
    * @return customername
     */
    public String getCustomername() {
        return customername;
    }

    /**
    * 设置-客户名称
    * @paramType java.lang.String
    * @param customername - 客户名称
     */
    public void setCustomername(String customername) {
        this.customername = customername;
    }

    /**
    * 获取-票据类型：14 转账 15 现金 16 支票
    * @return checktype
     */
    public String getChecktype() {
        return checktype;
    }

    /**
    * 设置-票据类型：14 转账 15 现金 16 支票
    * @paramType java.lang.String
    * @param checktype - 票据类型：14 转账 15 现金 16 支票
     */
    public void setChecktype(String checktype) {
        this.checktype = checktype;
    }

    /**
    * 获取-票据日期
    * @return checkdate
     */
    public Date getCheckdate() {
        return checkdate;
    }

    /**
    * 设置-票据日期
    * @paramType java.util.Date
    * @param checkdate - 票据日期
     */
    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    /**
    * 获取-票据号码
    * @return checkno
     */
    public String getCheckno() {
        return checkno;
    }

    /**
    * 设置-票据号码
    * @paramType java.lang.String
    * @param checkno - 票据号码
     */
    public void setCheckno(String checkno) {
        this.checkno = checkno;
    }

    /**
    * 获取-出票人
    * @return remittername
     */
    public String getRemittername() {
        return remittername;
    }

    /**
    * 设置-出票人
    * @paramType java.lang.String
    * @param remittername - 出票人
     */
    public void setRemittername(String remittername) {
        this.remittername = remittername;
    }

    /**
    * 获取-摘要
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-摘要
    * @paramType java.lang.String
    * @param description - 摘要
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    * 获取-客户账户名称
    * @return custaccountname
     */
    public String getCustaccountname() {
        return custaccountname;
    }

    /**
    * 设置-客户账户名称
    * @paramType java.lang.String
    * @param custaccountname - 客户账户名称
     */
    public void setCustaccountname(String custaccountname) {
        this.custaccountname = custaccountname;
    }

    /**
    * 获取-客户开户行名称
    * @return custaccountbankname
     */
    public String getCustaccountbankname() {
        return custaccountbankname;
    }

    /**
    * 设置-客户开户行名称
    * @paramType java.lang.String
    * @param custaccountbankname - 客户开户行名称
     */
    public void setCustaccountbankname(String custaccountbankname) {
        this.custaccountbankname = custaccountbankname;
    }

    /**
    * 获取-数据插入表的时间，精确时分秒
    * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
    * 设置-数据插入表的时间，精确时分秒
    * @paramType java.util.Date
    * @param timestamp - 数据插入表的时间，精确时分秒
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
    * 获取-中间表交互时使用本字段，1 初始状态、2 收付接收成功、3收付接收失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-中间表交互时使用本字段，1 初始状态、2 收付接收成功、3收付接收失败
    * @paramType java.lang.String
    * @param status - 中间表交互时使用本字段，1 初始状态、2 收付接收成功、3收付接收失败
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-中间表交互时使用本字段。收付系统处理结果的描述
    * @return msg
     */
    public String getMsg() {
        return msg;
    }

    /**
    * 设置-中间表交互时使用本字段。收付系统处理结果的描述
    * @paramType java.lang.String
    * @param msg - 中间表交互时使用本字段。收付系统处理结果的描述
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
    * 获取-对账码
    * @return reconciliationcode
     */
    public String getReconciliationcode() {
        return reconciliationcode;
    }

    /**
    * 设置-对账码
    * @paramType java.lang.String
    * @param reconciliationcode - 对账码
     */
    public void setReconciliationcode(String reconciliationcode) {
        this.reconciliationcode = reconciliationcode;
    }

    /**
    * 获取-余额
    * @return balance
     */
    public String getBalance() {
        return balance;
    }

    /**
    * 设置-余额
    * @paramType java.lang.String
    * @param balance - 余额
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }
}