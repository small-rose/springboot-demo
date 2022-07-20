package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_taxpay_resultdetail_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTaxpayResultdetailTd {
    /**
     * 主键id
     */
    private Long id;

    /**
     * mm_taxpay_td主键ID
     */
    private Long payid;

    /**
     * 主键id
     */
    private Long resultno;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 当年应缴
     */
    private BigDecimal taxpayable;

    /**
     * 滞纳金
     */
    private BigDecimal latefee;

    /**
     * 对账结果 0：收付缺1：平台缺  2：收付金额多  3：平台金额多
     */
    private String checkresult;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 时间戳
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 手工标识
     */
    private String modifydesc;

    /**
     * 完税凭证号/免税凭证号
     */
    private String taxcertno;

    /**
    * 获取-主键id
    * @return id
     */
    public Long getId() {
        return id;
    }

    /**
    * 设置-主键id
    * @paramType java.lang.Long
    * @param id - 主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    * 获取-mm_taxpay_td主键ID
    * @return payid
     */
    public Long getPayid() {
        return payid;
    }

    /**
    * 设置-mm_taxpay_td主键ID
    * @paramType java.lang.Long
    * @param payid - mm_taxpay_td主键ID
     */
    public void setPayid(Long payid) {
        this.payid = payid;
    }

    /**
    * 获取-主键id
    * @return resultno
     */
    public Long getResultno() {
        return resultno;
    }

    /**
    * 设置-主键id
    * @paramType java.lang.Long
    * @param resultno - 主键id
     */
    public void setResultno(Long resultno) {
        this.resultno = resultno;
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
    * 获取-当年应缴
    * @return taxpayable
     */
    public BigDecimal getTaxpayable() {
        return taxpayable;
    }

    /**
    * 设置-当年应缴
    * @paramType java.math.BigDecimal
    * @param taxpayable - 当年应缴
     */
    public void setTaxpayable(BigDecimal taxpayable) {
        this.taxpayable = taxpayable;
    }

    /**
    * 获取-滞纳金
    * @return latefee
     */
    public BigDecimal getLatefee() {
        return latefee;
    }

    /**
    * 设置-滞纳金
    * @paramType java.math.BigDecimal
    * @param latefee - 滞纳金
     */
    public void setLatefee(BigDecimal latefee) {
        this.latefee = latefee;
    }

    /**
    * 获取-对账结果 0：收付缺1：平台缺  2：收付金额多  3：平台金额多
    * @return checkresult
     */
    public String getCheckresult() {
        return checkresult;
    }

    /**
    * 设置-对账结果 0：收付缺1：平台缺  2：收付金额多  3：平台金额多
    * @paramType java.lang.String
    * @param checkresult - 对账结果 0：收付缺1：平台缺  2：收付金额多  3：平台金额多
     */
    public void setCheckresult(String checkresult) {
        this.checkresult = checkresult;
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
    * 获取-时间戳
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-时间戳
    * @paramType java.util.Date
    * @param lastopdate - 时间戳
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - 版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-手工标识
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工标识
    * @paramType java.lang.String
    * @param modifydesc - 手工标识
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-完税凭证号/免税凭证号
    * @return taxcertno
     */
    public String getTaxcertno() {
        return taxcertno;
    }

    /**
    * 设置-完税凭证号/免税凭证号
    * @paramType java.lang.String
    * @param taxcertno - 完税凭证号/免税凭证号
     */
    public void setTaxcertno(String taxcertno) {
        this.taxcertno = taxcertno;
    }
}