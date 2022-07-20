package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_policy_bill_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPolicyBillTi {
    /**
     * 主键
     */
    private Long seqbillno;

    /**
     * 保单主键
     */
    private Long seqpolicy;

    /**
     * 批次号
     */
    private Long batchno;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 业务归属部门
     */
    private String departmentcode;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 赔案号
     */
    private String claimno;

    /**
     * 业务类型
     */
    private String businesstype;

    /**
     * 业务性质
     */
    private String datatype;

    /**
     * 核销币种
     */
    private String currencycode;

    /**
     * 核销金额
     */
    private BigDecimal amount;

    /**
     * 支付方式
     */
    private String inpaymentmethod;

    /**
     * 数据来源
     */
    private String datasource;

    /**
     * 业务唯一标识
     */
    private String custseq;

    /**
     * 交易账号
     */
    private String accountno;

    /**
     * 交易日期
     */
    private Date transdate;

    /**
     * 落地状态,0初始 1成功 2失败
     */
    private String status;

    /**
     * 错误信息
     */
    private String errormsg;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
    * 获取-主键
    * @return seqbillno
     */
    public Long getSeqbillno() {
        return seqbillno;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param seqbillno - 主键
     */
    public void setSeqbillno(Long seqbillno) {
        this.seqbillno = seqbillno;
    }

    /**
    * 获取-保单主键
    * @return seqpolicy
     */
    public Long getSeqpolicy() {
        return seqpolicy;
    }

    /**
    * 设置-保单主键
    * @paramType java.lang.Long
    * @param seqpolicy - 保单主键
     */
    public void setSeqpolicy(Long seqpolicy) {
        this.seqpolicy = seqpolicy;
    }

    /**
    * 获取-批次号
    * @return batchno
     */
    public Long getBatchno() {
        return batchno;
    }

    /**
    * 设置-批次号
    * @paramType java.lang.Long
    * @param batchno - 批次号
     */
    public void setBatchno(Long batchno) {
        this.batchno = batchno;
    }

    /**
    * 获取-分公司代码
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司代码
    * @paramType java.lang.String
    * @param subcompany - 分公司代码
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-业务归属部门
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-业务归属部门
    * @paramType java.lang.String
    * @param departmentcode - 业务归属部门
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
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
    * 获取-批单号
    * @return endorseno
     */
    public String getEndorseno() {
        return endorseno;
    }

    /**
    * 设置-批单号
    * @paramType java.lang.String
    * @param endorseno - 批单号
     */
    public void setEndorseno(String endorseno) {
        this.endorseno = endorseno;
    }

    /**
    * 获取-赔案号
    * @return claimno
     */
    public String getClaimno() {
        return claimno;
    }

    /**
    * 设置-赔案号
    * @paramType java.lang.String
    * @param claimno - 赔案号
     */
    public void setClaimno(String claimno) {
        this.claimno = claimno;
    }

    /**
    * 获取-业务类型
    * @return businesstype
     */
    public String getBusinesstype() {
        return businesstype;
    }

    /**
    * 设置-业务类型
    * @paramType java.lang.String
    * @param businesstype - 业务类型
     */
    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype;
    }

    /**
    * 获取-业务性质
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-业务性质
    * @paramType java.lang.String
    * @param datatype - 业务性质
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    /**
    * 获取-核销币种
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-核销币种
    * @paramType java.lang.String
    * @param currencycode - 核销币种
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-核销金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-核销金额
    * @paramType java.math.BigDecimal
    * @param amount - 核销金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-支付方式
    * @return inpaymentmethod
     */
    public String getInpaymentmethod() {
        return inpaymentmethod;
    }

    /**
    * 设置-支付方式
    * @paramType java.lang.String
    * @param inpaymentmethod - 支付方式
     */
    public void setInpaymentmethod(String inpaymentmethod) {
        this.inpaymentmethod = inpaymentmethod;
    }

    /**
    * 获取-数据来源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-数据来源
    * @paramType java.lang.String
    * @param datasource - 数据来源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-业务唯一标识
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-业务唯一标识
    * @paramType java.lang.String
    * @param custseq - 业务唯一标识
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
    }

    /**
    * 获取-交易账号
    * @return accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
    * 设置-交易账号
    * @paramType java.lang.String
    * @param accountno - 交易账号
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
    * 获取-交易日期
    * @return transdate
     */
    public Date getTransdate() {
        return transdate;
    }

    /**
    * 设置-交易日期
    * @paramType java.util.Date
    * @param transdate - 交易日期
     */
    public void setTransdate(Date transdate) {
        this.transdate = transdate;
    }

    /**
    * 获取-落地状态,0初始 1成功 2失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-落地状态,0初始 1成功 2失败
    * @paramType java.lang.String
    * @param status - 落地状态,0初始 1成功 2失败
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-错误信息
    * @return errormsg
     */
    public String getErrormsg() {
        return errormsg;
    }

    /**
    * 设置-错误信息
    * @paramType java.lang.String
    * @param errormsg - 错误信息
     */
    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
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
    * 获取-最后操作日期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作日期
    * @paramType java.util.Date
    * @param lastopdate - 最后操作日期
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }
}