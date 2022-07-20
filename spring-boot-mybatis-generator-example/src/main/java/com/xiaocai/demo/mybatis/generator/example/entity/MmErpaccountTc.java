package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_erpaccount_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmErpaccountTc {
    /**
     * 会计科目代码
     */
    private Long erpaccountcode;

    /**
     * 会计科目名称
     */
    private String erpaccountname;

    /**
     * 启用标识 1启用 0失效
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
    * 获取-会计科目代码
    * @return erpaccountcode
     */
    public Long getErpaccountcode() {
        return erpaccountcode;
    }

    /**
    * 设置-会计科目代码
    * @paramType java.lang.Long
    * @param erpaccountcode - 会计科目代码
     */
    public void setErpaccountcode(Long erpaccountcode) {
        this.erpaccountcode = erpaccountcode;
    }

    /**
    * 获取-会计科目名称
    * @return erpaccountname
     */
    public String getErpaccountname() {
        return erpaccountname;
    }

    /**
    * 设置-会计科目名称
    * @paramType java.lang.String
    * @param erpaccountname - 会计科目名称
     */
    public void setErpaccountname(String erpaccountname) {
        this.erpaccountname = erpaccountname;
    }

    /**
    * 获取-启用标识 1启用 0失效
    * @return enabledflag
     */
    public String getEnabledflag() {
        return enabledflag;
    }

    /**
    * 设置-启用标识 1启用 0失效
    * @paramType java.lang.String
    * @param enabledflag - 启用标识 1启用 0失效
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
}