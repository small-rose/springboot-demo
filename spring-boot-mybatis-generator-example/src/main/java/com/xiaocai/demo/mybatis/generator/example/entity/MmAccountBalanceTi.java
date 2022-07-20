package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_account_balance_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmAccountBalanceTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 对应的查询任务id
     */
    private String taskid;

    /**
     * 账户id
     */
    private Long accountid;

    /**
     * 账号
     */
    private String accountno;

    /**
     * 日期，格式YYYYMMDD
     */
    private Date balancedate;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 可用余额
     */
    private BigDecimal usableBalance;

    /**
     * 昨日余额
     */
    private BigDecimal oldBalance;

    /**
     * 时间戳
     */
    private Date creationdate;

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
    * @return batchid
     */
    public String getBatchid() {
        return batchid;
    }

    /**
    * 设置-批次号
    * @paramType java.lang.String
    * @param batchid - 批次号
     */
    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    /**
    * 获取-对应的查询任务id
    * @return taskid
     */
    public String getTaskid() {
        return taskid;
    }

    /**
    * 设置-对应的查询任务id
    * @paramType java.lang.String
    * @param taskid - 对应的查询任务id
     */
    public void setTaskid(String taskid) {
        this.taskid = taskid;
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
    * 获取-余额
    * @return balance
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
    * 设置-余额
    * @paramType java.math.BigDecimal
    * @param balance - 余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
    * 获取-可用余额
    * @return usableBalance
     */
    public BigDecimal getUsableBalance() {
        return usableBalance;
    }

    /**
    * 设置-可用余额
    * @paramType java.math.BigDecimal
    * @param usableBalance - 可用余额
     */
    public void setUsableBalance(BigDecimal usableBalance) {
        this.usableBalance = usableBalance;
    }

    /**
    * 获取-昨日余额
    * @return oldBalance
     */
    public BigDecimal getOldBalance() {
        return oldBalance;
    }

    /**
    * 设置-昨日余额
    * @paramType java.math.BigDecimal
    * @param oldBalance - 昨日余额
     */
    public void setOldBalance(BigDecimal oldBalance) {
        this.oldBalance = oldBalance;
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
}