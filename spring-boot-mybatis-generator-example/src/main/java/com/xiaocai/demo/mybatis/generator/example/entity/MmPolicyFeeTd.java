package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_policy_fee_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPolicyFeeTd {
    /**
     * 主键
     */
    private Long seqfeelist;

    /**
     * 手续费接口主表序号
     */
    private Long seqpolicy;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 保费
     */
    private BigDecimal amount;

    /**
     * 手续费
     */
    private BigDecimal feeamount;

    /**
     * 手续费税额
     */
    private BigDecimal taxesamount;

    /**
     * 实收/实付金额费用
     */
    private BigDecimal realamount;

    /**
     * 支付方式
     */
    private String paymentmethod;

    /**
     * 部门代码
     */
    private String departmentcode;

    /**
     * 财务机构
     */
    private String unitcode;

    /**
     * 客户序号
     */
    private String custseq;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 核销状态
     */
    private String opstatus;

    /**
     * 数据来源
     */
    private String datasource;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Long hibernateversion;

    /**
     * 手工修改数据说明，用于标识手工改过的数据
     */
    private String modifydesc;

    /**
    * 获取-主键
    * @return seqfeelist
     */
    public Long getSeqfeelist() {
        return seqfeelist;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param seqfeelist - 主键
     */
    public void setSeqfeelist(Long seqfeelist) {
        this.seqfeelist = seqfeelist;
    }

    /**
    * 获取-手续费接口主表序号
    * @return seqpolicy
     */
    public Long getSeqpolicy() {
        return seqpolicy;
    }

    /**
    * 设置-手续费接口主表序号
    * @paramType java.lang.Long
    * @param seqpolicy - 手续费接口主表序号
     */
    public void setSeqpolicy(Long seqpolicy) {
        this.seqpolicy = seqpolicy;
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
    * 获取-币种
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种
    * @paramType java.lang.String
    * @param currencycode - 币种
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-保费
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-保费
    * @paramType java.math.BigDecimal
    * @param amount - 保费
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-手续费
    * @return feeamount
     */
    public BigDecimal getFeeamount() {
        return feeamount;
    }

    /**
    * 设置-手续费
    * @paramType java.math.BigDecimal
    * @param feeamount - 手续费
     */
    public void setFeeamount(BigDecimal feeamount) {
        this.feeamount = feeamount;
    }

    /**
    * 获取-手续费税额
    * @return taxesamount
     */
    public BigDecimal getTaxesamount() {
        return taxesamount;
    }

    /**
    * 设置-手续费税额
    * @paramType java.math.BigDecimal
    * @param taxesamount - 手续费税额
     */
    public void setTaxesamount(BigDecimal taxesamount) {
        this.taxesamount = taxesamount;
    }

    /**
    * 获取-实收/实付金额费用
    * @return realamount
     */
    public BigDecimal getRealamount() {
        return realamount;
    }

    /**
    * 设置-实收/实付金额费用
    * @paramType java.math.BigDecimal
    * @param realamount - 实收/实付金额费用
     */
    public void setRealamount(BigDecimal realamount) {
        this.realamount = realamount;
    }

    /**
    * 获取-支付方式
    * @return paymentmethod
     */
    public String getPaymentmethod() {
        return paymentmethod;
    }

    /**
    * 设置-支付方式
    * @paramType java.lang.String
    * @param paymentmethod - 支付方式
     */
    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    /**
    * 获取-部门代码
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-部门代码
    * @paramType java.lang.String
    * @param departmentcode - 部门代码
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
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
    * 获取-客户序号
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-客户序号
    * @paramType java.lang.String
    * @param custseq - 客户序号
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
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
    * 获取-核销状态
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-核销状态
    * @paramType java.lang.String
    * @param opstatus - 核销状态
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
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

    /**
    * 获取-版本号
    * @return hibernateversion
     */
    public Long getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本号
    * @paramType java.lang.Long
    * @param hibernateversion - 版本号
     */
    public void setHibernateversion(Long hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-手工修改数据说明，用于标识手工改过的数据
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改数据说明，用于标识手工改过的数据
    * @paramType java.lang.String
    * @param modifydesc - 手工修改数据说明，用于标识手工改过的数据
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }
}