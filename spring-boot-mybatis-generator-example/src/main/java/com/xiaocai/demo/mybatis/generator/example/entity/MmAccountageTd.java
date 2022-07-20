package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_accountage_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmAccountageTd {
    /**
     * 机构代码
     */
    private Long unitcode;

    /**
     * 账期名称
     */
    private Long periodname;

    /**
     * 账期代码
     */
    private Long accountcode;

    /**
     * 险种代码
     */
    private Long classescode;

    /**
     * 币种
     */
    private Long currencycode;

    /**
     * 账龄
     */
    private Long accountage;

    /**
     * 账龄类型
     */
    private Long agetype;

    /**
     * 系统名称（GL总帐系统、PA分摊、IO收付系统）
     */
    private String systemid;

    /**
     * 当期借方记账金额
     */
    private BigDecimal ptdEnteredDr;

    /**
     * 当期贷方记账金额
     */
    private BigDecimal ptdEnteredCr;

    /**
     * 累计借方记账金额
     */
    private BigDecimal ytdEnteredDr;

    /**
     * 累计贷方记账金额
     */
    private BigDecimal ytdEnteredCr;

    /**
     * 当期借方折算金额
     */
    private BigDecimal ptdAccountedDr;

    /**
     * 当期贷方折算金额
     */
    private BigDecimal ptdAccountedCr;

    /**
     * 累计借方折人民币金额
     */
    private BigDecimal ytdAccountedDr;

    /**
     * 累计贷方折人民币金额
     */
    private BigDecimal ytdAccountedCr;

    /**
     * 切片日期 日期型
     */
    private Date mirrordate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * HIBERNATEVERSION版本
     */
    private Integer hibernateversion;

    /**
    * 获取-机构代码
    * @return unitcode
     */
    public Long getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-机构代码
    * @paramType java.lang.Long
    * @param unitcode - 机构代码
     */
    public void setUnitcode(Long unitcode) {
        this.unitcode = unitcode;
    }

    /**
    * 获取-账期名称
    * @return periodname
     */
    public Long getPeriodname() {
        return periodname;
    }

    /**
    * 设置-账期名称
    * @paramType java.lang.Long
    * @param periodname - 账期名称
     */
    public void setPeriodname(Long periodname) {
        this.periodname = periodname;
    }

    /**
    * 获取-账期代码
    * @return accountcode
     */
    public Long getAccountcode() {
        return accountcode;
    }

    /**
    * 设置-账期代码
    * @paramType java.lang.Long
    * @param accountcode - 账期代码
     */
    public void setAccountcode(Long accountcode) {
        this.accountcode = accountcode;
    }

    /**
    * 获取-险种代码
    * @return classescode
     */
    public Long getClassescode() {
        return classescode;
    }

    /**
    * 设置-险种代码
    * @paramType java.lang.Long
    * @param classescode - 险种代码
     */
    public void setClassescode(Long classescode) {
        this.classescode = classescode;
    }

    /**
    * 获取-币种
    * @return currencycode
     */
    public Long getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种
    * @paramType java.lang.Long
    * @param currencycode - 币种
     */
    public void setCurrencycode(Long currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-账龄
    * @return accountage
     */
    public Long getAccountage() {
        return accountage;
    }

    /**
    * 设置-账龄
    * @paramType java.lang.Long
    * @param accountage - 账龄
     */
    public void setAccountage(Long accountage) {
        this.accountage = accountage;
    }

    /**
    * 获取-账龄类型
    * @return agetype
     */
    public Long getAgetype() {
        return agetype;
    }

    /**
    * 设置-账龄类型
    * @paramType java.lang.Long
    * @param agetype - 账龄类型
     */
    public void setAgetype(Long agetype) {
        this.agetype = agetype;
    }

    /**
    * 获取-系统名称（GL总帐系统、PA分摊、IO收付系统）
    * @return systemid
     */
    public String getSystemid() {
        return systemid;
    }

    /**
    * 设置-系统名称（GL总帐系统、PA分摊、IO收付系统）
    * @paramType java.lang.String
    * @param systemid - 系统名称（GL总帐系统、PA分摊、IO收付系统）
     */
    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    /**
    * 获取-当期借方记账金额
    * @return ptdEnteredDr
     */
    public BigDecimal getPtdEnteredDr() {
        return ptdEnteredDr;
    }

    /**
    * 设置-当期借方记账金额
    * @paramType java.math.BigDecimal
    * @param ptdEnteredDr - 当期借方记账金额
     */
    public void setPtdEnteredDr(BigDecimal ptdEnteredDr) {
        this.ptdEnteredDr = ptdEnteredDr;
    }

    /**
    * 获取-当期贷方记账金额
    * @return ptdEnteredCr
     */
    public BigDecimal getPtdEnteredCr() {
        return ptdEnteredCr;
    }

    /**
    * 设置-当期贷方记账金额
    * @paramType java.math.BigDecimal
    * @param ptdEnteredCr - 当期贷方记账金额
     */
    public void setPtdEnteredCr(BigDecimal ptdEnteredCr) {
        this.ptdEnteredCr = ptdEnteredCr;
    }

    /**
    * 获取-累计借方记账金额
    * @return ytdEnteredDr
     */
    public BigDecimal getYtdEnteredDr() {
        return ytdEnteredDr;
    }

    /**
    * 设置-累计借方记账金额
    * @paramType java.math.BigDecimal
    * @param ytdEnteredDr - 累计借方记账金额
     */
    public void setYtdEnteredDr(BigDecimal ytdEnteredDr) {
        this.ytdEnteredDr = ytdEnteredDr;
    }

    /**
    * 获取-累计贷方记账金额
    * @return ytdEnteredCr
     */
    public BigDecimal getYtdEnteredCr() {
        return ytdEnteredCr;
    }

    /**
    * 设置-累计贷方记账金额
    * @paramType java.math.BigDecimal
    * @param ytdEnteredCr - 累计贷方记账金额
     */
    public void setYtdEnteredCr(BigDecimal ytdEnteredCr) {
        this.ytdEnteredCr = ytdEnteredCr;
    }

    /**
    * 获取-当期借方折算金额
    * @return ptdAccountedDr
     */
    public BigDecimal getPtdAccountedDr() {
        return ptdAccountedDr;
    }

    /**
    * 设置-当期借方折算金额
    * @paramType java.math.BigDecimal
    * @param ptdAccountedDr - 当期借方折算金额
     */
    public void setPtdAccountedDr(BigDecimal ptdAccountedDr) {
        this.ptdAccountedDr = ptdAccountedDr;
    }

    /**
    * 获取-当期贷方折算金额
    * @return ptdAccountedCr
     */
    public BigDecimal getPtdAccountedCr() {
        return ptdAccountedCr;
    }

    /**
    * 设置-当期贷方折算金额
    * @paramType java.math.BigDecimal
    * @param ptdAccountedCr - 当期贷方折算金额
     */
    public void setPtdAccountedCr(BigDecimal ptdAccountedCr) {
        this.ptdAccountedCr = ptdAccountedCr;
    }

    /**
    * 获取-累计借方折人民币金额
    * @return ytdAccountedDr
     */
    public BigDecimal getYtdAccountedDr() {
        return ytdAccountedDr;
    }

    /**
    * 设置-累计借方折人民币金额
    * @paramType java.math.BigDecimal
    * @param ytdAccountedDr - 累计借方折人民币金额
     */
    public void setYtdAccountedDr(BigDecimal ytdAccountedDr) {
        this.ytdAccountedDr = ytdAccountedDr;
    }

    /**
    * 获取-累计贷方折人民币金额
    * @return ytdAccountedCr
     */
    public BigDecimal getYtdAccountedCr() {
        return ytdAccountedCr;
    }

    /**
    * 设置-累计贷方折人民币金额
    * @paramType java.math.BigDecimal
    * @param ytdAccountedCr - 累计贷方折人民币金额
     */
    public void setYtdAccountedCr(BigDecimal ytdAccountedCr) {
        this.ytdAccountedCr = ytdAccountedCr;
    }

    /**
    * 获取-切片日期 日期型
    * @return mirrordate
     */
    public Date getMirrordate() {
        return mirrordate;
    }

    /**
    * 设置-切片日期 日期型
    * @paramType java.util.Date
    * @param mirrordate - 切片日期 日期型
     */
    public void setMirrordate(Date mirrordate) {
        this.mirrordate = mirrordate;
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
    * 获取-HIBERNATEVERSION版本
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATEVERSION版本
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATEVERSION版本
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }
}