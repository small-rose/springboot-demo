package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;

/**
 *  
 * @Table : mm_temp_sumpolicy_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTempSumpolicyTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 保单业务主键
     */
    private Long seqpolicy;

    /**
     * 汇总金额
     */
    private BigDecimal amount;

    /**
     * 汇总实收金额
     */
    private BigDecimal realamount;

    /**
     * 险种代码
     */
    private String classescode;

    /**
     * 消费渠道
     */
    private String paychannel;

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
    * 获取-保单业务主键
    * @return seqpolicy
     */
    public Long getSeqpolicy() {
        return seqpolicy;
    }

    /**
    * 设置-保单业务主键
    * @paramType java.lang.Long
    * @param seqpolicy - 保单业务主键
     */
    public void setSeqpolicy(Long seqpolicy) {
        this.seqpolicy = seqpolicy;
    }

    /**
    * 获取-汇总金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-汇总金额
    * @paramType java.math.BigDecimal
    * @param amount - 汇总金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-汇总实收金额
    * @return realamount
     */
    public BigDecimal getRealamount() {
        return realamount;
    }

    /**
    * 设置-汇总实收金额
    * @paramType java.math.BigDecimal
    * @param realamount - 汇总实收金额
     */
    public void setRealamount(BigDecimal realamount) {
        this.realamount = realamount;
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
    * 获取-消费渠道
    * @return paychannel
     */
    public String getPaychannel() {
        return paychannel;
    }

    /**
    * 设置-消费渠道
    * @paramType java.lang.String
    * @param paychannel - 消费渠道
     */
    public void setPaychannel(String paychannel) {
        this.paychannel = paychannel;
    }
}