package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_taxpay_detail_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTaxpayDetailTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * mm_taxpay_td的主键
     */
    private Long payid;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 完税凭证号码
     */
    private String payNo;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 完税金额
     */
    private BigDecimal payTax;

    /**
     * 滞纳金
     */
    private BigDecimal lateFee;

    /**
     * 填票人
     */
    private String agent;

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
     * 投保确认码
     */
    private String confirmno;

    /**
     * 投保确认日期
     */
    private Date confirmdate;

    /**
     * 确认时间起期
     */
    private Date startDate;

    /**
     * 确认时间止期
     */
    private Date endDate;

    /**
     * 车辆识别代码
     */
    private String vehvin;

    /**
     * 车牌号码
     */
    private String brand;

    /**
     * 车牌型号
     */
    private String vehtype;

    /**
     * 纳税人名称/车辆所有(管理)人
     */
    private String payer;

    /**
     * 当年应缴
     */
    private BigDecimal taxpayable;

    /**
     * 往年补缴
     */
    private BigDecimal backtax;

    /**
     * 合计税额
     */
    private BigDecimal taxtotal;

    /**
     * 导入结果,0 失败,1 成功
     */
    private String result;

    /**
     * 失败原因
     */
    private String failreason;

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
    * 获取-mm_taxpay_td的主键
    * @return payid
     */
    public Long getPayid() {
        return payid;
    }

    /**
    * 设置-mm_taxpay_td的主键
    * @paramType java.lang.Long
    * @param payid - mm_taxpay_td的主键
     */
    public void setPayid(Long payid) {
        this.payid = payid;
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
    * 获取-完税凭证号码
    * @return payNo
     */
    public String getPayNo() {
        return payNo;
    }

    /**
    * 设置-完税凭证号码
    * @paramType java.lang.String
    * @param payNo - 完税凭证号码
     */
    public void setPayNo(String payNo) {
        this.payNo = payNo;
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
    * 获取-完税金额
    * @return payTax
     */
    public BigDecimal getPayTax() {
        return payTax;
    }

    /**
    * 设置-完税金额
    * @paramType java.math.BigDecimal
    * @param payTax - 完税金额
     */
    public void setPayTax(BigDecimal payTax) {
        this.payTax = payTax;
    }

    /**
    * 获取-滞纳金
    * @return lateFee
     */
    public BigDecimal getLateFee() {
        return lateFee;
    }

    /**
    * 设置-滞纳金
    * @paramType java.math.BigDecimal
    * @param lateFee - 滞纳金
     */
    public void setLateFee(BigDecimal lateFee) {
        this.lateFee = lateFee;
    }

    /**
    * 获取-填票人
    * @return agent
     */
    public String getAgent() {
        return agent;
    }

    /**
    * 设置-填票人
    * @paramType java.lang.String
    * @param agent - 填票人
     */
    public void setAgent(String agent) {
        this.agent = agent;
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
    * 获取-投保确认码
    * @return confirmno
     */
    public String getConfirmno() {
        return confirmno;
    }

    /**
    * 设置-投保确认码
    * @paramType java.lang.String
    * @param confirmno - 投保确认码
     */
    public void setConfirmno(String confirmno) {
        this.confirmno = confirmno;
    }

    /**
    * 获取-投保确认日期
    * @return confirmdate
     */
    public Date getConfirmdate() {
        return confirmdate;
    }

    /**
    * 设置-投保确认日期
    * @paramType java.util.Date
    * @param confirmdate - 投保确认日期
     */
    public void setConfirmdate(Date confirmdate) {
        this.confirmdate = confirmdate;
    }

    /**
    * 获取-确认时间起期
    * @return startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
    * 设置-确认时间起期
    * @paramType java.util.Date
    * @param startDate - 确认时间起期
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
    * 获取-确认时间止期
    * @return endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
    * 设置-确认时间止期
    * @paramType java.util.Date
    * @param endDate - 确认时间止期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
    * 获取-车辆识别代码
    * @return vehvin
     */
    public String getVehvin() {
        return vehvin;
    }

    /**
    * 设置-车辆识别代码
    * @paramType java.lang.String
    * @param vehvin - 车辆识别代码
     */
    public void setVehvin(String vehvin) {
        this.vehvin = vehvin;
    }

    /**
    * 获取-车牌号码
    * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
    * 设置-车牌号码
    * @paramType java.lang.String
    * @param brand - 车牌号码
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
    * 获取-车牌型号
    * @return vehtype
     */
    public String getVehtype() {
        return vehtype;
    }

    /**
    * 设置-车牌型号
    * @paramType java.lang.String
    * @param vehtype - 车牌型号
     */
    public void setVehtype(String vehtype) {
        this.vehtype = vehtype;
    }

    /**
    * 获取-纳税人名称/车辆所有(管理)人
    * @return payer
     */
    public String getPayer() {
        return payer;
    }

    /**
    * 设置-纳税人名称/车辆所有(管理)人
    * @paramType java.lang.String
    * @param payer - 纳税人名称/车辆所有(管理)人
     */
    public void setPayer(String payer) {
        this.payer = payer;
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
    * 获取-往年补缴
    * @return backtax
     */
    public BigDecimal getBacktax() {
        return backtax;
    }

    /**
    * 设置-往年补缴
    * @paramType java.math.BigDecimal
    * @param backtax - 往年补缴
     */
    public void setBacktax(BigDecimal backtax) {
        this.backtax = backtax;
    }

    /**
    * 获取-合计税额
    * @return taxtotal
     */
    public BigDecimal getTaxtotal() {
        return taxtotal;
    }

    /**
    * 设置-合计税额
    * @paramType java.math.BigDecimal
    * @param taxtotal - 合计税额
     */
    public void setTaxtotal(BigDecimal taxtotal) {
        this.taxtotal = taxtotal;
    }

    /**
    * 获取-导入结果,0 失败,1 成功
    * @return result
     */
    public String getResult() {
        return result;
    }

    /**
    * 设置-导入结果,0 失败,1 成功
    * @paramType java.lang.String
    * @param result - 导入结果,0 失败,1 成功
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
    * 获取-失败原因
    * @return failreason
     */
    public String getFailreason() {
        return failreason;
    }

    /**
    * 设置-失败原因
    * @paramType java.lang.String
    * @param failreason - 失败原因
     */
    public void setFailreason(String failreason) {
        this.failreason = failreason;
    }
}