package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_bad_debts
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmBadDebts {
    /**
     * 主键
     */
    private Long id;

    /**
     * 坏账提取日期
     */
    private Date extractDate;

    /**
     * 切片ID
     */
    private BigDecimal mirrorid;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 币种代码
     */
    private String currencycode;

    /**
     * 机构代码
     */
    private String unitcode;

    /**
     * 部门代码
     */
    private String departmentcode;

    /**
     * 险种代码
     */
    private String classescode;

    /**
     * 坏账提取总金额
     */
    private BigDecimal extractAllAmount;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 渠道代码
     */
    private String businesschannel;

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
    * 获取-坏账提取日期
    * @return extractDate
     */
    public Date getExtractDate() {
        return extractDate;
    }

    /**
    * 设置-坏账提取日期
    * @paramType java.util.Date
    * @param extractDate - 坏账提取日期
     */
    public void setExtractDate(Date extractDate) {
        this.extractDate = extractDate;
    }

    /**
    * 获取-切片ID
    * @return mirrorid
     */
    public BigDecimal getMirrorid() {
        return mirrorid;
    }

    /**
    * 设置-切片ID
    * @paramType java.math.BigDecimal
    * @param mirrorid - 切片ID
     */
    public void setMirrorid(BigDecimal mirrorid) {
        this.mirrorid = mirrorid;
    }

    /**
    * 获取-分公司
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司
    * @paramType java.lang.String
    * @param subcompany - 分公司
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

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
    * 获取-部门代码
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-部门代码
    * @paramType java.lang.String
    * @param departmentcode - 部门代码
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
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
    * 获取-坏账提取总金额
    * @return extractAllAmount
     */
    public BigDecimal getExtractAllAmount() {
        return extractAllAmount;
    }

    /**
    * 设置-坏账提取总金额
    * @paramType java.math.BigDecimal
    * @param extractAllAmount - 坏账提取总金额
     */
    public void setExtractAllAmount(BigDecimal extractAllAmount) {
        this.extractAllAmount = extractAllAmount;
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
    * 获取-渠道代码
    * @return businesschannel
     */
    public String getBusinesschannel() {
        return businesschannel;
    }

    /**
    * 设置-渠道代码
    * @paramType java.lang.String
    * @param businesschannel - 渠道代码
     */
    public void setBusinesschannel(String businesschannel) {
        this.businesschannel = businesschannel;
    }
}