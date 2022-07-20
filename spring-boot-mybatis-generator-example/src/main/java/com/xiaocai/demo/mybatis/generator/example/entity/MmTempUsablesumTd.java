package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_temp_usablesum_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTempUsablesumTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 暂收款流水号
     */
    private Long usableno;

    /**
     * 日结单号
     */
    private String dailyauditno;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 合计金额
     */
    private BigDecimal amount;

    /**
     * 合计已使用金额
     */
    private BigDecimal usedamount;

    /**
     * 业务类型
     */
    private String businestype;

    /**
     * 账期
     */
    private Date opdate;

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
    * 获取-暂收款流水号
    * @return usableno
     */
    public Long getUsableno() {
        return usableno;
    }

    /**
    * 设置-暂收款流水号
    * @paramType java.lang.Long
    * @param usableno - 暂收款流水号
     */
    public void setUsableno(Long usableno) {
        this.usableno = usableno;
    }

    /**
    * 获取-日结单号
    * @return dailyauditno
     */
    public String getDailyauditno() {
        return dailyauditno;
    }

    /**
    * 设置-日结单号
    * @paramType java.lang.String
    * @param dailyauditno - 日结单号
     */
    public void setDailyauditno(String dailyauditno) {
        this.dailyauditno = dailyauditno;
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
    * 获取-合计金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-合计金额
    * @paramType java.math.BigDecimal
    * @param amount - 合计金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-合计已使用金额
    * @return usedamount
     */
    public BigDecimal getUsedamount() {
        return usedamount;
    }

    /**
    * 设置-合计已使用金额
    * @paramType java.math.BigDecimal
    * @param usedamount - 合计已使用金额
     */
    public void setUsedamount(BigDecimal usedamount) {
        this.usedamount = usedamount;
    }

    /**
    * 获取-业务类型
    * @return businestype
     */
    public String getBusinestype() {
        return businestype;
    }

    /**
    * 设置-业务类型
    * @paramType java.lang.String
    * @param businestype - 业务类型
     */
    public void setBusinestype(String businestype) {
        this.businestype = businestype;
    }

    /**
    * 获取-账期
    * @return opdate
     */
    public Date getOpdate() {
        return opdate;
    }

    /**
    * 设置-账期
    * @paramType java.util.Date
    * @param opdate - 账期
     */
    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }
}