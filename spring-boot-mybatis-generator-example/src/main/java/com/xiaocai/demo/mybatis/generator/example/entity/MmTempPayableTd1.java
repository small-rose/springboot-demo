package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;

/**
 *  
 * @Table : mm_temp_payable_td1
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTempPayableTd1 {
    /**
     * 主键
     */
    private Long id;

    /**
     * 待付款业务主键
     */
    private BigDecimal paymoneyno;

    /**
     * 数据类型
     */
    private Long datatype;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 已使用金额
     */
    private BigDecimal usedamount;

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
    * 获取-待付款业务主键
    * @return paymoneyno
     */
    public BigDecimal getPaymoneyno() {
        return paymoneyno;
    }

    /**
    * 设置-待付款业务主键
    * @paramType java.math.BigDecimal
    * @param paymoneyno - 待付款业务主键
     */
    public void setPaymoneyno(BigDecimal paymoneyno) {
        this.paymoneyno = paymoneyno;
    }

    /**
    * 获取-数据类型
    * @return datatype
     */
    public Long getDatatype() {
        return datatype;
    }

    /**
    * 设置-数据类型
    * @paramType java.lang.Long
    * @param datatype - 数据类型
     */
    public void setDatatype(Long datatype) {
        this.datatype = datatype;
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
    * 获取-已使用金额
    * @return usedamount
     */
    public BigDecimal getUsedamount() {
        return usedamount;
    }

    /**
    * 设置-已使用金额
    * @paramType java.math.BigDecimal
    * @param usedamount - 已使用金额
     */
    public void setUsedamount(BigDecimal usedamount) {
        this.usedamount = usedamount;
    }
}