package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_largepremiumsrec_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmLargepremiumsrecTd {
    /**
     * 分公司代码
     */
    private Long subcompany;

    /**
     * 机构代码
     */
    private Long unitcode;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 切片日期
     */
    private Date mirrordate;

    /**
     * 被保人名称
     */
    private String insuredname;

    /**
     * 应收保费余额
     */
    private BigDecimal premiumsrecbalance;

    /**
     * 已到结算日余额
     */
    private BigDecimal settleddatebalance;

    /**
     * 未到结算日余额
     */
    private BigDecimal beforesettleddatebalance;

    /**
    * 获取-分公司代码
    * @return subcompany
     */
    public Long getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司代码
    * @paramType java.lang.Long
    * @param subcompany - 分公司代码
     */
    public void setSubcompany(Long subcompany) {
        this.subcompany = subcompany;
    }

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
    * 获取-切片日期
    * @return mirrordate
     */
    public Date getMirrordate() {
        return mirrordate;
    }

    /**
    * 设置-切片日期
    * @paramType java.util.Date
    * @param mirrordate - 切片日期
     */
    public void setMirrordate(Date mirrordate) {
        this.mirrordate = mirrordate;
    }

    /**
    * 获取-被保人名称
    * @return insuredname
     */
    public String getInsuredname() {
        return insuredname;
    }

    /**
    * 设置-被保人名称
    * @paramType java.lang.String
    * @param insuredname - 被保人名称
     */
    public void setInsuredname(String insuredname) {
        this.insuredname = insuredname;
    }

    /**
    * 获取-应收保费余额
    * @return premiumsrecbalance
     */
    public BigDecimal getPremiumsrecbalance() {
        return premiumsrecbalance;
    }

    /**
    * 设置-应收保费余额
    * @paramType java.math.BigDecimal
    * @param premiumsrecbalance - 应收保费余额
     */
    public void setPremiumsrecbalance(BigDecimal premiumsrecbalance) {
        this.premiumsrecbalance = premiumsrecbalance;
    }

    /**
    * 获取-已到结算日余额
    * @return settleddatebalance
     */
    public BigDecimal getSettleddatebalance() {
        return settleddatebalance;
    }

    /**
    * 设置-已到结算日余额
    * @paramType java.math.BigDecimal
    * @param settleddatebalance - 已到结算日余额
     */
    public void setSettleddatebalance(BigDecimal settleddatebalance) {
        this.settleddatebalance = settleddatebalance;
    }

    /**
    * 获取-未到结算日余额
    * @return beforesettleddatebalance
     */
    public BigDecimal getBeforesettleddatebalance() {
        return beforesettleddatebalance;
    }

    /**
    * 设置-未到结算日余额
    * @paramType java.math.BigDecimal
    * @param beforesettleddatebalance - 未到结算日余额
     */
    public void setBeforesettleddatebalance(BigDecimal beforesettleddatebalance) {
        this.beforesettleddatebalance = beforesettleddatebalance;
    }
}