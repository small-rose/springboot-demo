package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : bfp_balance_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class BfpBalanceTd {
    /**
     * 主键
     */
    private Long balanceid;

    /**
     * 账户
     */
    private String accountno;

    /**
     * 余额调节表生成状态,0-未生成,1-已生成,2-确认,3-作废
     */
    private String markstatus;

    /**
     * 生成余额调节表的操作人
     */
    private String opcode;

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
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 最后操作人
     */
    private String lastopcode;

    /**
     * 币种，RMB，USD
     */
    private String currencycode;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 财务机构
     */
    private String unitcode;

    /**
    * 获取-主键
    * @return balanceid
     */
    public Long getBalanceid() {
        return balanceid;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param balanceid - 主键
     */
    public void setBalanceid(Long balanceid) {
        this.balanceid = balanceid;
    }

    /**
    * 获取-账户
    * @return accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
    * 设置-账户
    * @paramType java.lang.String
    * @param accountno - 账户
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
    * 获取-余额调节表生成状态,0-未生成,1-已生成,2-确认,3-作废
    * @return markstatus
     */
    public String getMarkstatus() {
        return markstatus;
    }

    /**
    * 设置-余额调节表生成状态,0-未生成,1-已生成,2-确认,3-作废
    * @paramType java.lang.String
    * @param markstatus - 余额调节表生成状态,0-未生成,1-已生成,2-确认,3-作废
     */
    public void setMarkstatus(String markstatus) {
        this.markstatus = markstatus;
    }

    /**
    * 获取-生成余额调节表的操作人
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-生成余额调节表的操作人
    * @paramType java.lang.String
    * @param opcode - 生成余额调节表的操作人
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
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
    * 获取-版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - 版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-最后操作人
    * @return lastopcode
     */
    public String getLastopcode() {
        return lastopcode;
    }

    /**
    * 设置-最后操作人
    * @paramType java.lang.String
    * @param lastopcode - 最后操作人
     */
    public void setLastopcode(String lastopcode) {
        this.lastopcode = lastopcode;
    }

    /**
    * 获取-币种，RMB，USD
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种，RMB，USD
    * @paramType java.lang.String
    * @param currencycode - 币种，RMB，USD
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
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
}