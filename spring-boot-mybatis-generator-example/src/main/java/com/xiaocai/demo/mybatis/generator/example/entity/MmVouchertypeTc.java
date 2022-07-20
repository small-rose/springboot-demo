package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_vouchertype_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmVouchertypeTc {
    /**
     * 类型id
     */
    private String typeid;

    /**
     * 凭证类型
     */
    private String vouchertype;

    /**
     * 描述
     */
    private String description;

    /**
     * 启用标识
     */
    private String enabledflag;

    /**
     * 失效日期
     */
    private Date disabledate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后更新日期
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 日结单类型
     */
    private String reportkind;

    /**
     * 凭证大类
     */
    private String voucherkind;

    /**
    * 获取-类型id
    * @return typeid
     */
    public String getTypeid() {
        return typeid;
    }

    /**
    * 设置-类型id
    * @paramType java.lang.String
    * @param typeid - 类型id
     */
    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    /**
    * 获取-凭证类型
    * @return vouchertype
     */
    public String getVouchertype() {
        return vouchertype;
    }

    /**
    * 设置-凭证类型
    * @paramType java.lang.String
    * @param vouchertype - 凭证类型
     */
    public void setVouchertype(String vouchertype) {
        this.vouchertype = vouchertype;
    }

    /**
    * 获取-描述
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-描述
    * @paramType java.lang.String
    * @param description - 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    * 获取-启用标识
    * @return enabledflag
     */
    public String getEnabledflag() {
        return enabledflag;
    }

    /**
    * 设置-启用标识
    * @paramType java.lang.String
    * @param enabledflag - 启用标识
     */
    public void setEnabledflag(String enabledflag) {
        this.enabledflag = enabledflag;
    }

    /**
    * 获取-失效日期
    * @return disabledate
     */
    public Date getDisabledate() {
        return disabledate;
    }

    /**
    * 设置-失效日期
    * @paramType java.util.Date
    * @param disabledate - 失效日期
     */
    public void setDisabledate(Date disabledate) {
        this.disabledate = disabledate;
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
    * 获取-日结单类型
    * @return reportkind
     */
    public String getReportkind() {
        return reportkind;
    }

    /**
    * 设置-日结单类型
    * @paramType java.lang.String
    * @param reportkind - 日结单类型
     */
    public void setReportkind(String reportkind) {
        this.reportkind = reportkind;
    }

    /**
    * 获取-凭证大类
    * @return voucherkind
     */
    public String getVoucherkind() {
        return voucherkind;
    }

    /**
    * 设置-凭证大类
    * @paramType java.lang.String
    * @param voucherkind - 凭证大类
     */
    public void setVoucherkind(String voucherkind) {
        this.voucherkind = voucherkind;
    }
}