package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_bankinpayment_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmBankinpaymentTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 接口表主键
     */
    private Long seqid;

    /**
     * 银企直联主键
     */
    private String yqid;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 财务账号，非实际账号
     */
    private String accountno;

    /**
     * 币种 人民币CNY
     */
    private String currencycode;

    /**
     * 资金传08
     */
    private String datasource;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 金额(单位元)
     */
    private BigDecimal amount;

    /**
     * 汇率
     */
    private BigDecimal rate;

    /**
     * 实际银行账号
     */
    private String custId;

    /**
     * 摘要  
     */
    private String abstracts;

    /**
     * 预留字段
     */
    private String free1;

    /**
     * 预留字段
     */
    private String free2;

    /**
     * 预留字段
     */
    private String free3;

    /**
     * 预留字段
     */
    private String free4;

    /**
     * 初始状态1  核对完成2 失败3
     */
    private String status;

    /**
     * 入库时间 yyyy-mm-dd hh24:mi:ss
     */
    private Date timestamp;

    /**
     * 最后操作时间 yyyy-mm-dd hh24:mi:ss
     */
    private Date lastopdate;

    /**
     * 异常信息
     */
    private String message;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 状态
     */
    private String accountstatus;

    /**
     * 财务机构
     */
    private String unitcode;

    /**
     * 缴款人名称
     */
    private String customername;

    /**
     * 缴款人代码
     */
    private String customercode;

    /**
     * 缴款人账户
     */
    private String custaccountno;

    /**
     * 对账码
     */
    private String bankabstract;

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
    * 获取-接口表主键
    * @return seqid
     */
    public Long getSeqid() {
        return seqid;
    }

    /**
    * 设置-接口表主键
    * @paramType java.lang.Long
    * @param seqid - 接口表主键
     */
    public void setSeqid(Long seqid) {
        this.seqid = seqid;
    }

    /**
    * 获取-银企直联主键
    * @return yqid
     */
    public String getYqid() {
        return yqid;
    }

    /**
    * 设置-银企直联主键
    * @paramType java.lang.String
    * @param yqid - 银企直联主键
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
    * 获取-财务账号，非实际账号
    * @return accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
    * 设置-财务账号，非实际账号
    * @paramType java.lang.String
    * @param accountno - 财务账号，非实际账号
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
    * 获取-币种 人民币CNY
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种 人民币CNY
    * @paramType java.lang.String
    * @param currencycode - 币种 人民币CNY
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-资金传08
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-资金传08
    * @paramType java.lang.String
    * @param datasource - 资金传08
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
    * 获取-金额(单位元)
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-金额(单位元)
    * @paramType java.math.BigDecimal
    * @param amount - 金额(单位元)
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
    * 获取-实际银行账号
    * @return custId
     */
    public String getCustId() {
        return custId;
    }

    /**
    * 设置-实际银行账号
    * @paramType java.lang.String
    * @param custId - 实际银行账号
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
    * 获取-摘要  
    * @return abstracts
     */
    public String getAbstracts() {
        return abstracts;
    }

    /**
    * 设置-摘要  
    * @paramType java.lang.String
    * @param abstracts - 摘要  
     */
    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    /**
    * 获取-预留字段
    * @return free1
     */
    public String getFree1() {
        return free1;
    }

    /**
    * 设置-预留字段
    * @paramType java.lang.String
    * @param free1 - 预留字段
     */
    public void setFree1(String free1) {
        this.free1 = free1;
    }

    /**
    * 获取-预留字段
    * @return free2
     */
    public String getFree2() {
        return free2;
    }

    /**
    * 设置-预留字段
    * @paramType java.lang.String
    * @param free2 - 预留字段
     */
    public void setFree2(String free2) {
        this.free2 = free2;
    }

    /**
    * 获取-预留字段
    * @return free3
     */
    public String getFree3() {
        return free3;
    }

    /**
    * 设置-预留字段
    * @paramType java.lang.String
    * @param free3 - 预留字段
     */
    public void setFree3(String free3) {
        this.free3 = free3;
    }

    /**
    * 获取-预留字段
    * @return free4
     */
    public String getFree4() {
        return free4;
    }

    /**
    * 设置-预留字段
    * @paramType java.lang.String
    * @param free4 - 预留字段
     */
    public void setFree4(String free4) {
        this.free4 = free4;
    }

    /**
    * 获取-初始状态1  核对完成2 失败3
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-初始状态1  核对完成2 失败3
    * @paramType java.lang.String
    * @param status - 初始状态1  核对完成2 失败3
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-入库时间 yyyy-mm-dd hh24:mi:ss
    * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
    * 设置-入库时间 yyyy-mm-dd hh24:mi:ss
    * @paramType java.util.Date
    * @param timestamp - 入库时间 yyyy-mm-dd hh24:mi:ss
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
    * 获取-最后操作时间 yyyy-mm-dd hh24:mi:ss
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作时间 yyyy-mm-dd hh24:mi:ss
    * @paramType java.util.Date
    * @param lastopdate - 最后操作时间 yyyy-mm-dd hh24:mi:ss
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-异常信息
    * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
    * 设置-异常信息
    * @paramType java.lang.String
    * @param message - 异常信息
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
    * 获取-分公司
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司
    * @paramType java.lang.String
    * @param subcompany - 分公司
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-状态
    * @return accountstatus
     */
    public String getAccountstatus() {
        return accountstatus;
    }

    /**
    * 设置-状态
    * @paramType java.lang.String
    * @param accountstatus - 状态
     */
    public void setAccountstatus(String accountstatus) {
        this.accountstatus = accountstatus;
    }

    /**
    * 获取-财务机构
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-财务机构
    * @paramType java.lang.String
    * @param unitcode - 财务机构
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    /**
    * 获取-缴款人名称
    * @return customername
     */
    public String getCustomername() {
        return customername;
    }

    /**
    * 设置-缴款人名称
    * @paramType java.lang.String
    * @param customername - 缴款人名称
     */
    public void setCustomername(String customername) {
        this.customername = customername;
    }

    /**
    * 获取-缴款人代码
    * @return customercode
     */
    public String getCustomercode() {
        return customercode;
    }

    /**
    * 设置-缴款人代码
    * @paramType java.lang.String
    * @param customercode - 缴款人代码
     */
    public void setCustomercode(String customercode) {
        this.customercode = customercode;
    }

    /**
    * 获取-缴款人账户
    * @return custaccountno
     */
    public String getCustaccountno() {
        return custaccountno;
    }

    /**
    * 设置-缴款人账户
    * @paramType java.lang.String
    * @param custaccountno - 缴款人账户
     */
    public void setCustaccountno(String custaccountno) {
        this.custaccountno = custaccountno;
    }

    /**
    * 获取-对账码
    * @return bankabstract
     */
    public String getBankabstract() {
        return bankabstract;
    }

    /**
    * 设置-对账码
    * @paramType java.lang.String
    * @param bankabstract - 对账码
     */
    public void setBankabstract(String bankabstract) {
        this.bankabstract = bankabstract;
    }
}