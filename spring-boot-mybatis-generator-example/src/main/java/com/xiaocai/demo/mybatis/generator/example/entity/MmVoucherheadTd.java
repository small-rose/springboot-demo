package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_voucherhead_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmVoucherheadTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 凭证号
     */
    private String reference4;

    /**
     * 凭证批名
     */
    private String reference1;

    /**
     * 凭证类型id
     */
    private String jecategoryname;

    /**
     * 账期
     */
    private Date accountingdate;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 公司代码
     */
    private String segment1;

    /**
     * 凭证状态：00:未传送，10 发送中，11 已发送，90 回写中，99:总账已回写（已接受），Z1，发送总账失败，Z9 总账校验失败， Z8 总账回写失败，ZF:作废,ZZ较验失败
     */
    private String status;

    /**
     * 最后更新日期
     */
    private Date lastopdate;

    /**
     * 时间戳，插入的时间
     */
    private Date timestamp;

    /**
     * HIBERNATEVERSION版本号
     */
    private Integer hibernateversion;

    /**
     * 凭证号
     */
    private String voucherno;

    /**
     * 推送总账批次号
     */
    private String batchid;

    /**
     * sap凭证大类
     */
    private String erpvoucherkind;

    /**
     * 备用
     */
    private String attribute1;

    /**
     * 失败原因
     */
    private String errormsg;

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
    * 获取-凭证号
    * @return reference4
     */
    public String getReference4() {
        return reference4;
    }

    /**
    * 设置-凭证号
    * @paramType java.lang.String
    * @param reference4 - 凭证号
     */
    public void setReference4(String reference4) {
        this.reference4 = reference4;
    }

    /**
    * 获取-凭证批名
    * @return reference1
     */
    public String getReference1() {
        return reference1;
    }

    /**
    * 设置-凭证批名
    * @paramType java.lang.String
    * @param reference1 - 凭证批名
     */
    public void setReference1(String reference1) {
        this.reference1 = reference1;
    }

    /**
    * 获取-凭证类型id
    * @return jecategoryname
     */
    public String getJecategoryname() {
        return jecategoryname;
    }

    /**
    * 设置-凭证类型id
    * @paramType java.lang.String
    * @param jecategoryname - 凭证类型id
     */
    public void setJecategoryname(String jecategoryname) {
        this.jecategoryname = jecategoryname;
    }

    /**
    * 获取-账期
    * @return accountingdate
     */
    public Date getAccountingdate() {
        return accountingdate;
    }

    /**
    * 设置-账期
    * @paramType java.util.Date
    * @param accountingdate - 账期
     */
    public void setAccountingdate(Date accountingdate) {
        this.accountingdate = accountingdate;
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
    * 获取-公司代码
    * @return segment1
     */
    public String getSegment1() {
        return segment1;
    }

    /**
    * 设置-公司代码
    * @paramType java.lang.String
    * @param segment1 - 公司代码
     */
    public void setSegment1(String segment1) {
        this.segment1 = segment1;
    }

    /**
    * 获取-凭证状态：00:未传送，10 发送中，11 已发送，90 回写中，99:总账已回写（已接受），Z1，发送总账失败，Z9 总账校验失败， Z8 总账回写失败，ZF:作废,ZZ较验失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-凭证状态：00:未传送，10 发送中，11 已发送，90 回写中，99:总账已回写（已接受），Z1，发送总账失败，Z9 总账校验失败， Z8 总账回写失败，ZF:作废,ZZ较验失败
    * @paramType java.lang.String
    * @param status - 凭证状态：00:未传送，10 发送中，11 已发送，90 回写中，99:总账已回写（已接受），Z1，发送总账失败，Z9 总账校验失败， Z8 总账回写失败，ZF:作废,ZZ较验失败
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-最后更新日期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后更新日期
    * @paramType java.util.Date
    * @param lastopdate - 最后更新日期
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-时间戳，插入的时间
    * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
    * 设置-时间戳，插入的时间
    * @paramType java.util.Date
    * @param timestamp - 时间戳，插入的时间
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
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
    * 获取-凭证号
    * @return voucherno
     */
    public String getVoucherno() {
        return voucherno;
    }

    /**
    * 设置-凭证号
    * @paramType java.lang.String
    * @param voucherno - 凭证号
     */
    public void setVoucherno(String voucherno) {
        this.voucherno = voucherno;
    }

    /**
    * 获取-推送总账批次号
    * @return batchid
     */
    public String getBatchid() {
        return batchid;
    }

    /**
    * 设置-推送总账批次号
    * @paramType java.lang.String
    * @param batchid - 推送总账批次号
     */
    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    /**
    * 获取-sap凭证大类
    * @return erpvoucherkind
     */
    public String getErpvoucherkind() {
        return erpvoucherkind;
    }

    /**
    * 设置-sap凭证大类
    * @paramType java.lang.String
    * @param erpvoucherkind - sap凭证大类
     */
    public void setErpvoucherkind(String erpvoucherkind) {
        this.erpvoucherkind = erpvoucherkind;
    }

    /**
    * 获取-备用
    * @return attribute1
     */
    public String getAttribute1() {
        return attribute1;
    }

    /**
    * 设置-备用
    * @paramType java.lang.String
    * @param attribute1 - 备用
     */
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    /**
    * 获取-失败原因
    * @return errormsg
     */
    public String getErrormsg() {
        return errormsg;
    }

    /**
    * 设置-失败原因
    * @paramType java.lang.String
    * @param errormsg - 失败原因
     */
    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }
}