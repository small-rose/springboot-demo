package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_taxdeclare_to
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTaxdeclareTo {
    /**
     * 主键
     */
    private Long id;

    /**
     * 保单表流水号
     */
    private Long seqpolicy;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 分公司
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
     * 金额
     */
    private BigDecimal amount;

    /**
     * 回写次数
     */
    private BigDecimal count;

    /**
     * 申报人
     */
    private String opcode;

    /**
     * 申报单号
     */
    private String declareno;

    /**
     * 唯一流水号
     */
    private String custseq;

    /**
     * 申报日期
     */
    private Date declaredate;

    /**
     * 申报状态（00：初始；10：待确认，12：待申报，11：已申报，13：取消申报）
     */
    private String taxstate;

    /**
     * 状态（00：未发送；11：已发送；Z1：发送失败）
     */
    private String status;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后修改时间
     */
    private Date lastopdate;

    /**
     * 手动修改数据说明
     */
    private String modifydesc;

    /**
     * 错误信息
     */
    private String errmsg;

    /**
     * 业务归属部门
     */
    private String departmentcode;

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
    * 获取-保单表流水号
    * @return seqpolicy
     */
    public Long getSeqpolicy() {
        return seqpolicy;
    }

    /**
    * 设置-保单表流水号
    * @paramType java.lang.Long
    * @param seqpolicy - 保单表流水号
     */
    public void setSeqpolicy(Long seqpolicy) {
        this.seqpolicy = seqpolicy;
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
    * 获取-金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-金额
    * @paramType java.math.BigDecimal
    * @param amount - 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-回写次数
    * @return count
     */
    public BigDecimal getCount() {
        return count;
    }

    /**
    * 设置-回写次数
    * @paramType java.math.BigDecimal
    * @param count - 回写次数
     */
    public void setCount(BigDecimal count) {
        this.count = count;
    }

    /**
    * 获取-申报人
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-申报人
    * @paramType java.lang.String
    * @param opcode - 申报人
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-申报单号
    * @return declareno
     */
    public String getDeclareno() {
        return declareno;
    }

    /**
    * 设置-申报单号
    * @paramType java.lang.String
    * @param declareno - 申报单号
     */
    public void setDeclareno(String declareno) {
        this.declareno = declareno;
    }

    /**
    * 获取-唯一流水号
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-唯一流水号
    * @paramType java.lang.String
    * @param custseq - 唯一流水号
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
    }

    /**
    * 获取-申报日期
    * @return declaredate
     */
    public Date getDeclaredate() {
        return declaredate;
    }

    /**
    * 设置-申报日期
    * @paramType java.util.Date
    * @param declaredate - 申报日期
     */
    public void setDeclaredate(Date declaredate) {
        this.declaredate = declaredate;
    }

    /**
    * 获取-申报状态（00：初始；10：待确认，12：待申报，11：已申报，13：取消申报）
    * @return taxstate
     */
    public String getTaxstate() {
        return taxstate;
    }

    /**
    * 设置-申报状态（00：初始；10：待确认，12：待申报，11：已申报，13：取消申报）
    * @paramType java.lang.String
    * @param taxstate - 申报状态（00：初始；10：待确认，12：待申报，11：已申报，13：取消申报）
     */
    public void setTaxstate(String taxstate) {
        this.taxstate = taxstate;
    }

    /**
    * 获取-状态（00：未发送；11：已发送；Z1：发送失败）
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态（00：未发送；11：已发送；Z1：发送失败）
    * @paramType java.lang.String
    * @param status - 状态（00：未发送；11：已发送；Z1：发送失败）
     */
    public void setStatus(String status) {
        this.status = status;
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
    * 获取-最后修改时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后修改时间
    * @paramType java.util.Date
    * @param lastopdate - 最后修改时间
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-手动修改数据说明
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手动修改数据说明
    * @paramType java.lang.String
    * @param modifydesc - 手动修改数据说明
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-错误信息
    * @return errmsg
     */
    public String getErrmsg() {
        return errmsg;
    }

    /**
    * 设置-错误信息
    * @paramType java.lang.String
    * @param errmsg - 错误信息
     */
    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
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
}