package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_voucherno_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmVouchernoTd {
    /**
     * 凭证大类
     */
    private String voucherkind;

    /**
     * 财务机构代码
     */
    private String unitcode;

    /**
     * 账期
     */
    private Date periodname;

    /**
     * 凭证流水号，没有则插入
     */
    private BigDecimal voucherno;

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

    /**
    * 获取-财务机构代码
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-财务机构代码
    * @paramType java.lang.String
    * @param unitcode - 财务机构代码
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    /**
    * 获取-账期
    * @return periodname
     */
    public Date getPeriodname() {
        return periodname;
    }

    /**
    * 设置-账期
    * @paramType java.util.Date
    * @param periodname - 账期
     */
    public void setPeriodname(Date periodname) {
        this.periodname = periodname;
    }

    /**
    * 获取-凭证流水号，没有则插入
    * @return voucherno
     */
    public BigDecimal getVoucherno() {
        return voucherno;
    }

    /**
    * 设置-凭证流水号，没有则插入
    * @paramType java.math.BigDecimal
    * @param voucherno - 凭证流水号，没有则插入
     */
    public void setVoucherno(BigDecimal voucherno) {
        this.voucherno = voucherno;
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
}