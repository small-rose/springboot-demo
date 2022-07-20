package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : d_bankmapping
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class DBankmapping {
    /**
     * 主键
     */
    private Long id;

    /**
     * 收单行代码
     */
    private String orderBankcode;

    /**
     * 源支付行代码
     */
    private String srcBankcode;

    /**
     * 目标支付行代码
     */
    private String descBankcode;

    /**
     * 支付行名称
     */
    private String bankname;

    /**
     * 是否启用 0停用 ，1启用
     */
    private String ifvalid;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 注释
     */
    private String modifydesc;

    /**
     * html显示银行id
     */
    private String bankId;

    /**
     * html显示银行特性
     */
    private String bankClass;

    /**
     * html显示银行值
     */
    private String bankValue;

    /**
     * html显示银行名称
     */
    private String bankName;

    /**
     * html显示银行名称
     */
    private String bankAlt;

    /**
     * html显示银行图标路径
     */
    private String bankSrc;

    /**
     * 排列顺序
     */
    private BigDecimal displayorder;

    /**
     *  支付机构号
     */
    private String bankinstno;

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
    * 获取-收单行代码
    * @return orderBankcode
     */
    public String getOrderBankcode() {
        return orderBankcode;
    }

    /**
    * 设置-收单行代码
    * @paramType java.lang.String
    * @param orderBankcode - 收单行代码
     */
    public void setOrderBankcode(String orderBankcode) {
        this.orderBankcode = orderBankcode;
    }

    /**
    * 获取-源支付行代码
    * @return srcBankcode
     */
    public String getSrcBankcode() {
        return srcBankcode;
    }

    /**
    * 设置-源支付行代码
    * @paramType java.lang.String
    * @param srcBankcode - 源支付行代码
     */
    public void setSrcBankcode(String srcBankcode) {
        this.srcBankcode = srcBankcode;
    }

    /**
    * 获取-目标支付行代码
    * @return descBankcode
     */
    public String getDescBankcode() {
        return descBankcode;
    }

    /**
    * 设置-目标支付行代码
    * @paramType java.lang.String
    * @param descBankcode - 目标支付行代码
     */
    public void setDescBankcode(String descBankcode) {
        this.descBankcode = descBankcode;
    }

    /**
    * 获取-支付行名称
    * @return bankname
     */
    public String getBankname() {
        return bankname;
    }

    /**
    * 设置-支付行名称
    * @paramType java.lang.String
    * @param bankname - 支付行名称
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
    * 获取-是否启用 0停用 ，1启用
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否启用 0停用 ，1启用
    * @paramType java.lang.String
    * @param ifvalid - 是否启用 0停用 ，1启用
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
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
    * 获取-注释
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-注释
    * @paramType java.lang.String
    * @param modifydesc - 注释
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-html显示银行id
    * @return bankId
     */
    public String getBankId() {
        return bankId;
    }

    /**
    * 设置-html显示银行id
    * @paramType java.lang.String
    * @param bankId - html显示银行id
     */
    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    /**
    * 获取-html显示银行特性
    * @return bankClass
     */
    public String getBankClass() {
        return bankClass;
    }

    /**
    * 设置-html显示银行特性
    * @paramType java.lang.String
    * @param bankClass - html显示银行特性
     */
    public void setBankClass(String bankClass) {
        this.bankClass = bankClass;
    }

    /**
    * 获取-html显示银行值
    * @return bankValue
     */
    public String getBankValue() {
        return bankValue;
    }

    /**
    * 设置-html显示银行值
    * @paramType java.lang.String
    * @param bankValue - html显示银行值
     */
    public void setBankValue(String bankValue) {
        this.bankValue = bankValue;
    }

    /**
    * 获取-html显示银行名称
    * @return bankName
     */
    public String getBankName() {
        return bankName;
    }

    /**
    * 设置-html显示银行名称
    * @paramType java.lang.String
    * @param bankName - html显示银行名称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
    * 获取-html显示银行名称
    * @return bankAlt
     */
    public String getBankAlt() {
        return bankAlt;
    }

    /**
    * 设置-html显示银行名称
    * @paramType java.lang.String
    * @param bankAlt - html显示银行名称
     */
    public void setBankAlt(String bankAlt) {
        this.bankAlt = bankAlt;
    }

    /**
    * 获取-html显示银行图标路径
    * @return bankSrc
     */
    public String getBankSrc() {
        return bankSrc;
    }

    /**
    * 设置-html显示银行图标路径
    * @paramType java.lang.String
    * @param bankSrc - html显示银行图标路径
     */
    public void setBankSrc(String bankSrc) {
        this.bankSrc = bankSrc;
    }

    /**
    * 获取-排列顺序
    * @return displayorder
     */
    public BigDecimal getDisplayorder() {
        return displayorder;
    }

    /**
    * 设置-排列顺序
    * @paramType java.math.BigDecimal
    * @param displayorder - 排列顺序
     */
    public void setDisplayorder(BigDecimal displayorder) {
        this.displayorder = displayorder;
    }

    /**
    * 获取- 支付机构号
    * @return bankinstno
     */
    public String getBankinstno() {
        return bankinstno;
    }

    /**
    * 设置- 支付机构号
    * @paramType java.lang.String
    * @param bankinstno -  支付机构号
     */
    public void setBankinstno(String bankinstno) {
        this.bankinstno = bankinstno;
    }
}