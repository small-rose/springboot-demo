package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_paymentmethod_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPaymentmethodTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 支付方式
     */
    private String paymethod;

    /**
     * 支付渠道
     */
    private String paychannel;

    /**
     * 银行名称
     */
    private String bankname;

    /**
     * 对公还是对私
     */
    private String ifpublic;

    /**
     * 父级id
     */
    private BigDecimal rootid;

    /**
     * 通知
     */
    private String displayorder;

    /**
     * 是否显示，1显示，0不显示
     */
    private String isdisplay;

    /**
     * 参数值
     */
    private String value;

    /**
     * 时间戳
     */
    private Date vTimestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * HIBERNATEVERSION
     */
    private Integer hibernateversion;

    /**
     * 备用字段
     */
    private String reserve;

    /**
     * 最高限额
     */
    private BigDecimal maxamount;

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
    * 获取-支付方式
    * @return paymethod
     */
    public String getPaymethod() {
        return paymethod;
    }

    /**
    * 设置-支付方式
    * @paramType java.lang.String
    * @param paymethod - 支付方式
     */
    public void setPaymethod(String paymethod) {
        this.paymethod = paymethod;
    }

    /**
    * 获取-支付渠道
    * @return paychannel
     */
    public String getPaychannel() {
        return paychannel;
    }

    /**
    * 设置-支付渠道
    * @paramType java.lang.String
    * @param paychannel - 支付渠道
     */
    public void setPaychannel(String paychannel) {
        this.paychannel = paychannel;
    }

    /**
    * 获取-银行名称
    * @return bankname
     */
    public String getBankname() {
        return bankname;
    }

    /**
    * 设置-银行名称
    * @paramType java.lang.String
    * @param bankname - 银行名称
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
    * 获取-对公还是对私
    * @return ifpublic
     */
    public String getIfpublic() {
        return ifpublic;
    }

    /**
    * 设置-对公还是对私
    * @paramType java.lang.String
    * @param ifpublic - 对公还是对私
     */
    public void setIfpublic(String ifpublic) {
        this.ifpublic = ifpublic;
    }

    /**
    * 获取-父级id
    * @return rootid
     */
    public BigDecimal getRootid() {
        return rootid;
    }

    /**
    * 设置-父级id
    * @paramType java.math.BigDecimal
    * @param rootid - 父级id
     */
    public void setRootid(BigDecimal rootid) {
        this.rootid = rootid;
    }

    /**
    * 获取-通知
    * @return displayorder
     */
    public String getDisplayorder() {
        return displayorder;
    }

    /**
    * 设置-通知
    * @paramType java.lang.String
    * @param displayorder - 通知
     */
    public void setDisplayorder(String displayorder) {
        this.displayorder = displayorder;
    }

    /**
    * 获取-是否显示，1显示，0不显示
    * @return isdisplay
     */
    public String getIsdisplay() {
        return isdisplay;
    }

    /**
    * 设置-是否显示，1显示，0不显示
    * @paramType java.lang.String
    * @param isdisplay - 是否显示，1显示，0不显示
     */
    public void setIsdisplay(String isdisplay) {
        this.isdisplay = isdisplay;
    }

    /**
    * 获取-参数值
    * @return value
     */
    public String getValue() {
        return value;
    }

    /**
    * 设置-参数值
    * @paramType java.lang.String
    * @param value - 参数值
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
    * 获取-时间戳
    * @return vTimestamp
     */
    public Date getvTimestamp() {
        return vTimestamp;
    }

    /**
    * 设置-时间戳
    * @paramType java.util.Date
    * @param vTimestamp - 时间戳
     */
    public void setvTimestamp(Date vTimestamp) {
        this.vTimestamp = vTimestamp;
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
    * 获取-HIBERNATEVERSION
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATEVERSION
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATEVERSION
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-备用字段
    * @return reserve
     */
    public String getReserve() {
        return reserve;
    }

    /**
    * 设置-备用字段
    * @paramType java.lang.String
    * @param reserve - 备用字段
     */
    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    /**
    * 获取-最高限额
    * @return maxamount
     */
    public BigDecimal getMaxamount() {
        return maxamount;
    }

    /**
    * 设置-最高限额
    * @paramType java.math.BigDecimal
    * @param maxamount - 最高限额
     */
    public void setMaxamount(BigDecimal maxamount) {
        this.maxamount = maxamount;
    }
}