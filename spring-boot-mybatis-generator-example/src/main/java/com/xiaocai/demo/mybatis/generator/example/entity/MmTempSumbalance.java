package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;

/**
 *  
 * @Table : mm_temp_sumbalance
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTempSumbalance {
    /**
     * 主键
     */
    private Long id;

    /**
     * 切片主键
     */
    private BigDecimal mirrorid;

    /**
     * 保单业务主键
     */
    private BigDecimal seqpolicy;

    /**
     * 已到结算日余额
     */
    private BigDecimal remainsDued;

    /**
     * 未到结算日余额
     */
    private BigDecimal remainsUndued;

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
    * 获取-切片主键
    * @return mirrorid
     */
    public BigDecimal getMirrorid() {
        return mirrorid;
    }

    /**
    * 设置-切片主键
    * @paramType java.math.BigDecimal
    * @param mirrorid - 切片主键
     */
    public void setMirrorid(BigDecimal mirrorid) {
        this.mirrorid = mirrorid;
    }

    /**
    * 获取-保单业务主键
    * @return seqpolicy
     */
    public BigDecimal getSeqpolicy() {
        return seqpolicy;
    }

    /**
    * 设置-保单业务主键
    * @paramType java.math.BigDecimal
    * @param seqpolicy - 保单业务主键
     */
    public void setSeqpolicy(BigDecimal seqpolicy) {
        this.seqpolicy = seqpolicy;
    }

    /**
    * 获取-已到结算日余额
    * @return remainsDued
     */
    public BigDecimal getRemainsDued() {
        return remainsDued;
    }

    /**
    * 设置-已到结算日余额
    * @paramType java.math.BigDecimal
    * @param remainsDued - 已到结算日余额
     */
    public void setRemainsDued(BigDecimal remainsDued) {
        this.remainsDued = remainsDued;
    }

    /**
    * 获取-未到结算日余额
    * @return remainsUndued
     */
    public BigDecimal getRemainsUndued() {
        return remainsUndued;
    }

    /**
    * 设置-未到结算日余额
    * @paramType java.math.BigDecimal
    * @param remainsUndued - 未到结算日余额
     */
    public void setRemainsUndued(BigDecimal remainsUndued) {
        this.remainsUndued = remainsUndued;
    }
}