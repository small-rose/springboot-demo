package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : bfp_balancedetail_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class BfpBalancedetailTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 批次号，主表主键；此字段贯穿对账其他表
     */
    private BigDecimal balanceid;

    /**
     * 金额类型:sun_remains(SUN余额),sun_less(SUN负数金额),sun_less_sum(SUN负数金额汇总),sun_add(SUN正数金额),sun_add_sum(SUN正数金额汇总),sun_adjust(SUN调整后的金额);ats_remains(ATS余额),ats_less(ATS负数金额),ats_less_sum(ATS负数金额汇总),ats_add(ATS正数金额),ats_add_sum(ATS正数金额汇总),ats_adjust(ATS调整后的金额) 
     */
    private String balancetype;

    /**
     * 操作人
     */
    private String opcode;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 时间戳
     */
    private Date createdate;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * 摘要
     */
    private String description;

    /**
     * 客户名称
     */
    private String payname;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 财务机构
     */
    private String unitcode;

    /**
     * 关联对账表ID
     */
    private BigDecimal transid;

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
    * 获取-批次号，主表主键；此字段贯穿对账其他表
    * @return balanceid
     */
    public BigDecimal getBalanceid() {
        return balanceid;
    }

    /**
    * 设置-批次号，主表主键；此字段贯穿对账其他表
    * @paramType java.math.BigDecimal
    * @param balanceid - 批次号，主表主键；此字段贯穿对账其他表
     */
    public void setBalanceid(BigDecimal balanceid) {
        this.balanceid = balanceid;
    }

    /**
    * 获取-金额类型:sun_remains(SUN余额),sun_less(SUN负数金额),sun_less_sum(SUN负数金额汇总),sun_add(SUN正数金额),sun_add_sum(SUN正数金额汇总),sun_adjust(SUN调整后的金额);ats_remains(ATS余额),ats_less(ATS负数金额),ats_less_sum(ATS负数金额汇总),ats_add(ATS正数金额),ats_add_sum(ATS正数金额汇总),ats_adjust(ATS调整后的金额)

    * @return balancetype
     */
    public String getBalancetype() {
        return balancetype;
    }

    /**
    * 设置-金额类型:sun_remains(SUN余额),sun_less(SUN负数金额),sun_less_sum(SUN负数金额汇总),sun_add(SUN正数金额),sun_add_sum(SUN正数金额汇总),sun_adjust(SUN调整后的金额);ats_remains(ATS余额),ats_less(ATS负数金额),ats_less_sum(ATS负数金额汇总),ats_add(ATS正数金额),ats_add_sum(ATS正数金额汇总),ats_adjust(ATS调整后的金额)

    * @paramType java.lang.String
    * @param balancetype - 金额类型:sun_remains(SUN余额),sun_less(SUN负数金额),sun_less_sum(SUN负数金额汇总),sun_add(SUN正数金额),sun_add_sum(SUN正数金额汇总),sun_adjust(SUN调整后的金额);ats_remains(ATS余额),ats_less(ATS负数金额),ats_less_sum(ATS负数金额汇总),ats_add(ATS正数金额),ats_add_sum(ATS正数金额汇总),ats_adjust(ATS调整后的金额)

     */
    public void setBalancetype(String balancetype) {
        this.balancetype = balancetype;
    }

    /**
    * 获取-操作人
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作人
    * @paramType java.lang.String
    * @param opcode - 操作人
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
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
    * 获取-操作日期
    * @return opdate
     */
    public Date getOpdate() {
        return opdate;
    }

    /**
    * 设置-操作日期
    * @paramType java.util.Date
    * @param opdate - 操作日期
     */
    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }

    /**
    * 获取-时间戳
    * @return createdate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
    * 设置-时间戳
    * @paramType java.util.Date
    * @param createdate - 时间戳
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
    * 获取-最后操作日期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作日期
    * @paramType java.util.Date
    * @param lastopdate - 最后操作日期
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-摘要
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-摘要
    * @paramType java.lang.String
    * @param description - 摘要
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    * 获取-客户名称
    * @return payname
     */
    public String getPayname() {
        return payname;
    }

    /**
    * 设置-客户名称
    * @paramType java.lang.String
    * @param payname - 客户名称
     */
    public void setPayname(String payname) {
        this.payname = payname;
    }

    /**
    * 获取-分公司代码
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司代码
    * @paramType java.lang.String
    * @param subcompany - 分公司代码
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-财务机构
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-财务机构
    * @paramType java.lang.String
    * @param unitcode - 财务机构
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    /**
    * 获取-关联对账表ID
    * @return transid
     */
    public BigDecimal getTransid() {
        return transid;
    }

    /**
    * 设置-关联对账表ID
    * @paramType java.math.BigDecimal
    * @param transid - 关联对账表ID
     */
    public void setTransid(BigDecimal transid) {
        this.transid = transid;
    }
}