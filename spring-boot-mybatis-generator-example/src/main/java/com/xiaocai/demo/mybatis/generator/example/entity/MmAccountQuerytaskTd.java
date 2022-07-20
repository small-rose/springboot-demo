package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_account_querytask_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmAccountQuerytaskTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 账户id
     */
    private Long accountid;

    /**
     * 账号
     */
    private String accountno;

    /**
     * 01 账户交易明细查询、02 账户余额查询
     */
    private String querytype;

    /**
     * 日期，格式YYYYMMDD
     */
    private Date balancedate;

    /**
     * 查询的起始日期
     */
    private Date begindate;

    /**
     * 查询的终止日期
     */
    private Date enddate;

    /**
     * 操作员 默认为SYSTEM，后续记录人工参与通讯处理的操作员代码
     */
    private String opcode;

    /**
     * 时间戳
     */
    private Date creationdate;

    /**
     * 最后修改时间
     */
    private Date lastopdate;

    /**
     * 备用字段1
     */
    private String reserved1;

    /**
     * 备用字段2
     */
    private String reserved2;

    /**
     * 备用字段3
     */
    private String reserved3;

    /**
     * 备用字段4
     */
    private String reserved4;

    /**
     * 备用字段5
     */
    private String reserved5;

    /**
     * 批次号，用于一次打包多条记录发送的情况
     */
    private String batchid;

    /**
     * 银行机构代码
     */
    private String bankunitcode;

    /**
     * 查询金额下限
     */
    private BigDecimal lowerlimt;

    /**
     * 查询金额上限
     */
    private BigDecimal upperlimt;

    /**
     * 币种代码
     */
    private String currencycode;

    /**
     * 账户银行代码
     */
    private String bankcode;

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
    * 获取-账户id
    * @return accountid
     */
    public Long getAccountid() {
        return accountid;
    }

    /**
    * 设置-账户id
    * @paramType java.lang.Long
    * @param accountid - 账户id
     */
    public void setAccountid(Long accountid) {
        this.accountid = accountid;
    }

    /**
    * 获取-账号
    * @return accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
    * 设置-账号
    * @paramType java.lang.String
    * @param accountno - 账号
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
    * 获取-01 账户交易明细查询、02 账户余额查询
    * @return querytype
     */
    public String getQuerytype() {
        return querytype;
    }

    /**
    * 设置-01 账户交易明细查询、02 账户余额查询
    * @paramType java.lang.String
    * @param querytype - 01 账户交易明细查询、02 账户余额查询
     */
    public void setQuerytype(String querytype) {
        this.querytype = querytype;
    }

    /**
    * 获取-日期，格式YYYYMMDD
    * @return balancedate
     */
    public Date getBalancedate() {
        return balancedate;
    }

    /**
    * 设置-日期，格式YYYYMMDD
    * @paramType java.util.Date
    * @param balancedate - 日期，格式YYYYMMDD
     */
    public void setBalancedate(Date balancedate) {
        this.balancedate = balancedate;
    }

    /**
    * 获取-查询的起始日期
    * @return begindate
     */
    public Date getBegindate() {
        return begindate;
    }

    /**
    * 设置-查询的起始日期
    * @paramType java.util.Date
    * @param begindate - 查询的起始日期
     */
    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    /**
    * 获取-查询的终止日期
    * @return enddate
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
    * 设置-查询的终止日期
    * @paramType java.util.Date
    * @param enddate - 查询的终止日期
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
    * 获取-操作员 默认为SYSTEM，后续记录人工参与通讯处理的操作员代码
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作员 默认为SYSTEM，后续记录人工参与通讯处理的操作员代码
    * @paramType java.lang.String
    * @param opcode - 操作员 默认为SYSTEM，后续记录人工参与通讯处理的操作员代码
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-时间戳
    * @return creationdate
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
    * 设置-时间戳
    * @paramType java.util.Date
    * @param creationdate - 时间戳
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
    * 获取-最后修改时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后修改时间
    * @paramType java.util.Date
    * @param lastopdate - 最后修改时间
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-备用字段1
    * @return reserved1
     */
    public String getReserved1() {
        return reserved1;
    }

    /**
    * 设置-备用字段1
    * @paramType java.lang.String
    * @param reserved1 - 备用字段1
     */
    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1;
    }

    /**
    * 获取-备用字段2
    * @return reserved2
     */
    public String getReserved2() {
        return reserved2;
    }

    /**
    * 设置-备用字段2
    * @paramType java.lang.String
    * @param reserved2 - 备用字段2
     */
    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    /**
    * 获取-备用字段3
    * @return reserved3
     */
    public String getReserved3() {
        return reserved3;
    }

    /**
    * 设置-备用字段3
    * @paramType java.lang.String
    * @param reserved3 - 备用字段3
     */
    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3;
    }

    /**
    * 获取-备用字段4
    * @return reserved4
     */
    public String getReserved4() {
        return reserved4;
    }

    /**
    * 设置-备用字段4
    * @paramType java.lang.String
    * @param reserved4 - 备用字段4
     */
    public void setReserved4(String reserved4) {
        this.reserved4 = reserved4;
    }

    /**
    * 获取-备用字段5
    * @return reserved5
     */
    public String getReserved5() {
        return reserved5;
    }

    /**
    * 设置-备用字段5
    * @paramType java.lang.String
    * @param reserved5 - 备用字段5
     */
    public void setReserved5(String reserved5) {
        this.reserved5 = reserved5;
    }

    /**
    * 获取-批次号，用于一次打包多条记录发送的情况
    * @return batchid
     */
    public String getBatchid() {
        return batchid;
    }

    /**
    * 设置-批次号，用于一次打包多条记录发送的情况
    * @paramType java.lang.String
    * @param batchid - 批次号，用于一次打包多条记录发送的情况
     */
    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    /**
    * 获取-银行机构代码
    * @return bankunitcode
     */
    public String getBankunitcode() {
        return bankunitcode;
    }

    /**
    * 设置-银行机构代码
    * @paramType java.lang.String
    * @param bankunitcode - 银行机构代码
     */
    public void setBankunitcode(String bankunitcode) {
        this.bankunitcode = bankunitcode;
    }

    /**
    * 获取-查询金额下限
    * @return lowerlimt
     */
    public BigDecimal getLowerlimt() {
        return lowerlimt;
    }

    /**
    * 设置-查询金额下限
    * @paramType java.math.BigDecimal
    * @param lowerlimt - 查询金额下限
     */
    public void setLowerlimt(BigDecimal lowerlimt) {
        this.lowerlimt = lowerlimt;
    }

    /**
    * 获取-查询金额上限
    * @return upperlimt
     */
    public BigDecimal getUpperlimt() {
        return upperlimt;
    }

    /**
    * 设置-查询金额上限
    * @paramType java.math.BigDecimal
    * @param upperlimt - 查询金额上限
     */
    public void setUpperlimt(BigDecimal upperlimt) {
        this.upperlimt = upperlimt;
    }

    /**
    * 获取-币种代码
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种代码
    * @paramType java.lang.String
    * @param currencycode - 币种代码
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-账户银行代码
    * @return bankcode
     */
    public String getBankcode() {
        return bankcode;
    }

    /**
    * 设置-账户银行代码
    * @paramType java.lang.String
    * @param bankcode - 账户银行代码
     */
    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }
}