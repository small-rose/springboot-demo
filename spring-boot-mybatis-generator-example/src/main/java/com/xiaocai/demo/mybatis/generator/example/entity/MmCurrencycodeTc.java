package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_currencycode_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmCurrencycodeTc {
    /**
     * 币种代码
     */
    private String currencycode;

    /**
     * 币种名称（中文）
     */
    private String currencyname;

    /**
     * 币种名称（业务）
     */
    private String currencynamebusiness;

    /**
     * 币种符号，诸如 HKD
     */
    private String currencysign;

    /**
     * 记账币种
     */
    private String acccurrencycode;

    /**
     * 汇率
     */
    private BigDecimal rate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 手工修改数据说明
     */
    private String modifydesc;

    /**
     * 控制每个币种在下拉框中的显示顺序
     */
    private BigDecimal displayorder;

    /**
     * Y启用 N 禁用（维护的是全部的币种信息，控制哪些币种在该家保险公司会使用或者禁用）
     */
    private String enabledflag;

    /**
    * 获取-币种代码
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种代码
    * @paramType java.lang.String
    * @param currencycode - 币种代码
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-币种名称（中文）
    * @return currencyname
     */
    public String getCurrencyname() {
        return currencyname;
    }

    /**
    * 设置-币种名称（中文）
    * @paramType java.lang.String
    * @param currencyname - 币种名称（中文）
     */
    public void setCurrencyname(String currencyname) {
        this.currencyname = currencyname;
    }

    /**
    * 获取-币种名称（业务）
    * @return currencynamebusiness
     */
    public String getCurrencynamebusiness() {
        return currencynamebusiness;
    }

    /**
    * 设置-币种名称（业务）
    * @paramType java.lang.String
    * @param currencynamebusiness - 币种名称（业务）
     */
    public void setCurrencynamebusiness(String currencynamebusiness) {
        this.currencynamebusiness = currencynamebusiness;
    }

    /**
    * 获取-币种符号，诸如
HKD
    * @return currencysign
     */
    public String getCurrencysign() {
        return currencysign;
    }

    /**
    * 设置-币种符号，诸如
HKD
    * @paramType java.lang.String
    * @param currencysign - 币种符号，诸如
HKD
     */
    public void setCurrencysign(String currencysign) {
        this.currencysign = currencysign;
    }

    /**
    * 获取-记账币种
    * @return acccurrencycode
     */
    public String getAcccurrencycode() {
        return acccurrencycode;
    }

    /**
    * 设置-记账币种
    * @paramType java.lang.String
    * @param acccurrencycode - 记账币种
     */
    public void setAcccurrencycode(String acccurrencycode) {
        this.acccurrencycode = acccurrencycode;
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
    * 获取-HIBERNATE版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATE版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATE版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-手工修改数据说明
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改数据说明
    * @paramType java.lang.String
    * @param modifydesc - 手工修改数据说明
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-控制每个币种在下拉框中的显示顺序
    * @return displayorder
     */
    public BigDecimal getDisplayorder() {
        return displayorder;
    }

    /**
    * 设置-控制每个币种在下拉框中的显示顺序
    * @paramType java.math.BigDecimal
    * @param displayorder - 控制每个币种在下拉框中的显示顺序
     */
    public void setDisplayorder(BigDecimal displayorder) {
        this.displayorder = displayorder;
    }

    /**
    * 获取-Y启用 N 禁用（维护的是全部的币种信息，控制哪些币种在该家保险公司会使用或者禁用）
    * @return enabledflag
     */
    public String getEnabledflag() {
        return enabledflag;
    }

    /**
    * 设置-Y启用 N 禁用（维护的是全部的币种信息，控制哪些币种在该家保险公司会使用或者禁用）
    * @paramType java.lang.String
    * @param enabledflag - Y启用 N 禁用（维护的是全部的币种信息，控制哪些币种在该家保险公司会使用或者禁用）
     */
    public void setEnabledflag(String enabledflag) {
        this.enabledflag = enabledflag;
    }
}