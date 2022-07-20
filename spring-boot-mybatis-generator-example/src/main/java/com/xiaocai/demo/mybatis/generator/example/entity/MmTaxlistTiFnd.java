package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_taxlist_ti_fnd
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTaxlistTiFnd {
    /**
     * 主键
     */
    private Long id;

    /**
     * MM_CENTRALIZATION_TD.id
     */
    private Long seqcentralization;

    /**
     * 业务来源
     */
    private String datasource;

    /**
     * 结算单号
     */
    private String summaryno;

    /**
     * 税金类型
     */
    private String taxtype;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 业务唯一号号
     */
    private String custseq;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * HIBERNATEVERSION版本号
     */
    private Integer hibernateversion;

    /**
     * 手动修改数据说明
     */
    private String modifydesc;

    /**
     * 1.初始状态,2落地成功,3.落地失败.4作废
     */
    private String status;

    /**
     * 数据错误日志
     */
    private String errmsg;

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
    * 获取-MM_CENTRALIZATION_TD.id
    * @return seqcentralization
     */
    public Long getSeqcentralization() {
        return seqcentralization;
    }

    /**
    * 设置-MM_CENTRALIZATION_TD.id
    * @paramType java.lang.Long
    * @param seqcentralization - MM_CENTRALIZATION_TD.id
     */
    public void setSeqcentralization(Long seqcentralization) {
        this.seqcentralization = seqcentralization;
    }

    /**
    * 获取-业务来源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-业务来源
    * @paramType java.lang.String
    * @param datasource - 业务来源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-结算单号
    * @return summaryno
     */
    public String getSummaryno() {
        return summaryno;
    }

    /**
    * 设置-结算单号
    * @paramType java.lang.String
    * @param summaryno - 结算单号
     */
    public void setSummaryno(String summaryno) {
        this.summaryno = summaryno;
    }

    /**
    * 获取-税金类型
    * @return taxtype
     */
    public String getTaxtype() {
        return taxtype;
    }

    /**
    * 设置-税金类型
    * @paramType java.lang.String
    * @param taxtype - 税金类型
     */
    public void setTaxtype(String taxtype) {
        this.taxtype = taxtype;
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
    * 获取-业务唯一号号
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-业务唯一号号
    * @paramType java.lang.String
    * @param custseq - 业务唯一号号
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
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

    /**
    * 获取-HIBERNATEVERSION版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATEVERSION版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATEVERSION版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
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
    * 获取-1.初始状态,2落地成功,3.落地失败.4作废
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-1.初始状态,2落地成功,3.落地失败.4作废
    * @paramType java.lang.String
    * @param status - 1.初始状态,2落地成功,3.落地失败.4作废
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-数据错误日志
    * @return errmsg
     */
    public String getErrmsg() {
        return errmsg;
    }

    /**
    * 设置-数据错误日志
    * @paramType java.lang.String
    * @param errmsg - 数据错误日志
     */
    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}