package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_accountageset_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmAccountagesetTc {
    /**
     * 账龄类别
     */
    private Long agekind;

    /**
     * 账龄
     */
    private Long accountage;

    /**
     * 描述
     */
    private String description;

    /**
     * 起始时间长度
     */
    private Integer long1;

    /**
     * 终止时间 长度
     */
    private Integer long2;

    /**
     * 计提百分比
     */
    private BigDecimal extractPercent;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
    * 获取-账龄类别
    * @return agekind
     */
    public Long getAgekind() {
        return agekind;
    }

    /**
    * 设置-账龄类别
    * @paramType java.lang.Long
    * @param agekind - 账龄类别
     */
    public void setAgekind(Long agekind) {
        this.agekind = agekind;
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
    * 获取-起始时间长度
    * @return long1
     */
    public Integer getLong1() {
        return long1;
    }

    /**
    * 设置-起始时间长度
    * @paramType java.lang.Integer
    * @param long1 - 起始时间长度
     */
    public void setLong1(Integer long1) {
        this.long1 = long1;
    }

    /**
    * 获取-终止时间 长度
    * @return long2
     */
    public Integer getLong2() {
        return long2;
    }

    /**
    * 设置-终止时间 长度
    * @paramType java.lang.Integer
    * @param long2 - 终止时间 长度
     */
    public void setLong2(Integer long2) {
        this.long2 = long2;
    }

    /**
    * 获取-计提百分比
    * @return extractPercent
     */
    public BigDecimal getExtractPercent() {
        return extractPercent;
    }

    /**
    * 设置-计提百分比
    * @paramType java.math.BigDecimal
    * @param extractPercent - 计提百分比
     */
    public void setExtractPercent(BigDecimal extractPercent) {
        this.extractPercent = extractPercent;
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
}