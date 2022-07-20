package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_accountageautolist_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmAccountageautolistTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * mm_accountageauto_td的主键
     */
    private String chageId;

    /**
     * 机构代码
     */
    private String unitcode;

    /**
     * 险种代码
     */
    private String classescode;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 账龄代码
     */
    private String accountcode;

    /**
     * 借方金额
     */
    private BigDecimal ytdEnteredDr;

    /**
     * 账龄
     */
    private String accountage;

    /**
     * 账龄类型
     */
    private String agetype;

    /**
     * 标志
     */
    private Integer flag;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 版本号
     */
    private Integer hibernateversion;

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
    * 获取-mm_accountageauto_td的主键
    * @return chageId
     */
    public String getChageId() {
        return chageId;
    }

    /**
    * 设置-mm_accountageauto_td的主键
    * @paramType java.lang.String
    * @param chageId - mm_accountageauto_td的主键
     */
    public void setChageId(String chageId) {
        this.chageId = chageId;
    }

    /**
    * 获取-机构代码
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-机构代码
    * @paramType java.lang.String
    * @param unitcode - 机构代码
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    /**
    * 获取-险种代码
    * @return classescode
     */
    public String getClassescode() {
        return classescode;
    }

    /**
    * 设置-险种代码
    * @paramType java.lang.String
    * @param classescode - 险种代码
     */
    public void setClassescode(String classescode) {
        this.classescode = classescode;
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
    * 获取-账龄代码
    * @return accountcode
     */
    public String getAccountcode() {
        return accountcode;
    }

    /**
    * 设置-账龄代码
    * @paramType java.lang.String
    * @param accountcode - 账龄代码
     */
    public void setAccountcode(String accountcode) {
        this.accountcode = accountcode;
    }

    /**
    * 获取-借方金额
    * @return ytdEnteredDr
     */
    public BigDecimal getYtdEnteredDr() {
        return ytdEnteredDr;
    }

    /**
    * 设置-借方金额
    * @paramType java.math.BigDecimal
    * @param ytdEnteredDr - 借方金额
     */
    public void setYtdEnteredDr(BigDecimal ytdEnteredDr) {
        this.ytdEnteredDr = ytdEnteredDr;
    }

    /**
    * 获取-账龄
    * @return accountage
     */
    public String getAccountage() {
        return accountage;
    }

    /**
    * 设置-账龄
    * @paramType java.lang.String
    * @param accountage - 账龄
     */
    public void setAccountage(String accountage) {
        this.accountage = accountage;
    }

    /**
    * 获取-账龄类型
    * @return agetype
     */
    public String getAgetype() {
        return agetype;
    }

    /**
    * 设置-账龄类型
    * @paramType java.lang.String
    * @param agetype - 账龄类型
     */
    public void setAgetype(String agetype) {
        this.agetype = agetype;
    }

    /**
    * 获取-标志
    * @return flag
     */
    public Integer getFlag() {
        return flag;
    }

    /**
    * 设置-标志
    * @paramType java.lang.Integer
    * @param flag - 标志
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
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