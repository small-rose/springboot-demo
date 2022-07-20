package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;

/**
 *  
 * @Table : mm_temp_centralization_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTempCentralizationTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 手续费主键
     */
    private BigDecimal centralizationid;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 实收金额
     */
    private BigDecimal realamount;

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
    * 获取-手续费主键
    * @return centralizationid
     */
    public BigDecimal getCentralizationid() {
        return centralizationid;
    }

    /**
    * 设置-手续费主键
    * @paramType java.math.BigDecimal
    * @param centralizationid - 手续费主键
     */
    public void setCentralizationid(BigDecimal centralizationid) {
        this.centralizationid = centralizationid;
    }

    /**
    * 获取-金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-金额
    * @paramType java.math.BigDecimal
    * @param amount - 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-实收金额
    * @return realamount
     */
    public BigDecimal getRealamount() {
        return realamount;
    }

    /**
    * 设置-实收金额
    * @paramType java.math.BigDecimal
    * @param realamount - 实收金额
     */
    public void setRealamount(BigDecimal realamount) {
        this.realamount = realamount;
    }
}