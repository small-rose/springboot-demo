package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : bfp_transaction_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class BfpTransactionTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 批次号
     */
    private BigDecimal balanceid;

    /**
     * 银行账号
     */
    private String accountno;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 数据源
     */
    private String datasource;

    /**
     * 对账状态，0-未对账、1-自动对账、2-人工对账、3-生成报表，默认为“0”
     */
    private String bstatus;

    /**
     * 对账码
     */
    private String abstractno;

    /**
     * 创建日期
     */
    private Date createdate;

    /**
     * 最后更新日期
     */
    private Date lastopdate;

    /**
     * hibernate版本号
     */
    private Integer hibernateversion;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 摘要
     */
    private String description;

    /**
     * 余额调节表生成状态,0-未生成,1-已生成,2-确认,4-未对账金额已进调节表，已确认,5-未对账金额已进调节表，已生成,3-作废
     */
    private String markstatus;

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
     * 币种
     */
    private String currencycode;

    /**
     * 未对账是否进入余额调节表: 1进入
     */
    private String ifbalance;

    /**
     * 对账时间
     */
    private Date balancedate;

    /**
     * 对账数据批次
     */
    private String balancesequence;

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
    * 获取-批次号
    * @return balanceid
     */
    public BigDecimal getBalanceid() {
        return balanceid;
    }

    /**
    * 设置-批次号
    * @paramType java.math.BigDecimal
    * @param balanceid - 批次号
     */
    public void setBalanceid(BigDecimal balanceid) {
        this.balanceid = balanceid;
    }

    /**
    * 获取-银行账号
    * @return accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
    * 设置-银行账号
    * @paramType java.lang.String
    * @param accountno - 银行账号
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
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
    * 获取-数据源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-数据源
    * @paramType java.lang.String
    * @param datasource - 数据源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-对账状态，0-未对账、1-自动对账、2-人工对账、3-生成报表，默认为“0”
    * @return bstatus
     */
    public String getBstatus() {
        return bstatus;
    }

    /**
    * 设置-对账状态，0-未对账、1-自动对账、2-人工对账、3-生成报表，默认为“0”
    * @paramType java.lang.String
    * @param bstatus - 对账状态，0-未对账、1-自动对账、2-人工对账、3-生成报表，默认为“0”
     */
    public void setBstatus(String bstatus) {
        this.bstatus = bstatus;
    }

    /**
    * 获取-对账码
    * @return abstractno
     */
    public String getAbstractno() {
        return abstractno;
    }

    /**
    * 设置-对账码
    * @paramType java.lang.String
    * @param abstractno - 对账码
     */
    public void setAbstractno(String abstractno) {
        this.abstractno = abstractno;
    }

    /**
    * 获取-创建日期
    * @return createdate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
    * 设置-创建日期
    * @paramType java.util.Date
    * @param createdate - 创建日期
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
    * 获取-最后更新日期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后更新日期
    * @paramType java.util.Date
    * @param lastopdate - 最后更新日期
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-hibernate版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-hibernate版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - hibernate版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
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
    * 获取-余额调节表生成状态,0-未生成,1-已生成,2-确认,4-未对账金额已进调节表，已确认,5-未对账金额已进调节表，已生成,3-作废
    * @return markstatus
     */
    public String getMarkstatus() {
        return markstatus;
    }

    /**
    * 设置-余额调节表生成状态,0-未生成,1-已生成,2-确认,4-未对账金额已进调节表，已确认,5-未对账金额已进调节表，已生成,3-作废
    * @paramType java.lang.String
    * @param markstatus - 余额调节表生成状态,0-未生成,1-已生成,2-确认,4-未对账金额已进调节表，已确认,5-未对账金额已进调节表，已生成,3-作废
     */
    public void setMarkstatus(String markstatus) {
        this.markstatus = markstatus;
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
    * 获取-未对账是否进入余额调节表: 1进入
    * @return ifbalance
     */
    public String getIfbalance() {
        return ifbalance;
    }

    /**
    * 设置-未对账是否进入余额调节表: 1进入
    * @paramType java.lang.String
    * @param ifbalance - 未对账是否进入余额调节表: 1进入
     */
    public void setIfbalance(String ifbalance) {
        this.ifbalance = ifbalance;
    }

    /**
    * 获取-对账时间
    * @return balancedate
     */
    public Date getBalancedate() {
        return balancedate;
    }

    /**
    * 设置-对账时间
    * @paramType java.util.Date
    * @param balancedate - 对账时间
     */
    public void setBalancedate(Date balancedate) {
        this.balancedate = balancedate;
    }

    /**
    * 获取-对账数据批次
    * @return balancesequence
     */
    public String getBalancesequence() {
        return balancesequence;
    }

    /**
    * 设置-对账数据批次
    * @paramType java.lang.String
    * @param balancesequence - 对账数据批次
     */
    public void setBalancesequence(String balancesequence) {
        this.balancesequence = balancesequence;
    }
}