package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_account_transdetail_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmAccountTransdetailTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 接口表id
     */
    private Long seqid;

    /**
     * 对应的查询任务id
     */
    private String taskid;

    /**
     * 账户id
     */
    private Long accountid;

    /**
     * 本方帐号
     */
    private String accountno;

    /**
     * 交易日期
     */
    private Date transdate;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 借贷标志：贷方表示付款、借方表示银行收款
     */
    private String balancetype;

    /**
     * 发生额
     */
    private BigDecimal amount;

    /**
     * 凭证号
     */
    private String checkno;

    /**
     * 对方银行代码
     */
    private String custbankcode;

    /**
     * 对方账户号码
     */
    private String custaccountno;

    /**
     * 对方账户名称
     */
    private String custaccountnname;

    /**
     * 对方开户行联行号
     */
    private String custunitbankno;

    /**
     * 对方开户行名称
     */
    private String custbanklocal;

    /**
     * 业务种类
     */
    private String transtype;

    /**
     * 交易流水号
     */
    private String transno;

    /**
     * 描述、摘要
     */
    private String description;

    /**
     * 用途
     */
    private String purpose;

    /**
     * 备注、附言
     */
    private String memo;

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
     * 分公司代码
     */
    private String subcompany;

    /**
     * 机构代码
     */
    private String unitcode;

    /**
     * 账户名称
     */
    private String accountname;

    /**
     * 银行名称
     */
    private String bankname;

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
    * 获取-接口表id
    * @return seqid
     */
    public Long getSeqid() {
        return seqid;
    }

    /**
    * 设置-接口表id
    * @paramType java.lang.Long
    * @param seqid - 接口表id
     */
    public void setSeqid(Long seqid) {
        this.seqid = seqid;
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
    * 获取-本方帐号
    * @return accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
    * 设置-本方帐号
    * @paramType java.lang.String
    * @param accountno - 本方帐号
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
    * 获取-交易日期
    * @return transdate
     */
    public Date getTransdate() {
        return transdate;
    }

    /**
    * 设置-交易日期
    * @paramType java.util.Date
    * @param transdate - 交易日期
     */
    public void setTransdate(Date transdate) {
        this.transdate = transdate;
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
    * 获取-借贷标志：贷方表示付款、借方表示银行收款
    * @return balancetype
     */
    public String getBalancetype() {
        return balancetype;
    }

    /**
    * 设置-借贷标志：贷方表示付款、借方表示银行收款
    * @paramType java.lang.String
    * @param balancetype - 借贷标志：贷方表示付款、借方表示银行收款
     */
    public void setBalancetype(String balancetype) {
        this.balancetype = balancetype;
    }

    /**
    * 获取-发生额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-发生额
    * @paramType java.math.BigDecimal
    * @param amount - 发生额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-凭证号
    * @return checkno
     */
    public String getCheckno() {
        return checkno;
    }

    /**
    * 设置-凭证号
    * @paramType java.lang.String
    * @param checkno - 凭证号
     */
    public void setCheckno(String checkno) {
        this.checkno = checkno;
    }

    /**
    * 获取-对方银行代码
    * @return custbankcode
     */
    public String getCustbankcode() {
        return custbankcode;
    }

    /**
    * 设置-对方银行代码
    * @paramType java.lang.String
    * @param custbankcode - 对方银行代码
     */
    public void setCustbankcode(String custbankcode) {
        this.custbankcode = custbankcode;
    }

    /**
    * 获取-对方账户号码
    * @return custaccountno
     */
    public String getCustaccountno() {
        return custaccountno;
    }

    /**
    * 设置-对方账户号码
    * @paramType java.lang.String
    * @param custaccountno - 对方账户号码
     */
    public void setCustaccountno(String custaccountno) {
        this.custaccountno = custaccountno;
    }

    /**
    * 获取-对方账户名称
    * @return custaccountnname
     */
    public String getCustaccountnname() {
        return custaccountnname;
    }

    /**
    * 设置-对方账户名称
    * @paramType java.lang.String
    * @param custaccountnname - 对方账户名称
     */
    public void setCustaccountnname(String custaccountnname) {
        this.custaccountnname = custaccountnname;
    }

    /**
    * 获取-对方开户行联行号
    * @return custunitbankno
     */
    public String getCustunitbankno() {
        return custunitbankno;
    }

    /**
    * 设置-对方开户行联行号
    * @paramType java.lang.String
    * @param custunitbankno - 对方开户行联行号
     */
    public void setCustunitbankno(String custunitbankno) {
        this.custunitbankno = custunitbankno;
    }

    /**
    * 获取-对方开户行名称
    * @return custbanklocal
     */
    public String getCustbanklocal() {
        return custbanklocal;
    }

    /**
    * 设置-对方开户行名称
    * @paramType java.lang.String
    * @param custbanklocal - 对方开户行名称
     */
    public void setCustbanklocal(String custbanklocal) {
        this.custbanklocal = custbanklocal;
    }

    /**
    * 获取-业务种类
    * @return transtype
     */
    public String getTranstype() {
        return transtype;
    }

    /**
    * 设置-业务种类
    * @paramType java.lang.String
    * @param transtype - 业务种类
     */
    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }

    /**
    * 获取-交易流水号
    * @return transno
     */
    public String getTransno() {
        return transno;
    }

    /**
    * 设置-交易流水号
    * @paramType java.lang.String
    * @param transno - 交易流水号
     */
    public void setTransno(String transno) {
        this.transno = transno;
    }

    /**
    * 获取-描述、摘要
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-描述、摘要
    * @paramType java.lang.String
    * @param description - 描述、摘要
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    * 获取-用途
    * @return purpose
     */
    public String getPurpose() {
        return purpose;
    }

    /**
    * 设置-用途
    * @paramType java.lang.String
    * @param purpose - 用途
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /**
    * 获取-备注、附言
    * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
    * 设置-备注、附言
    * @paramType java.lang.String
    * @param memo - 备注、附言
     */
    public void setMemo(String memo) {
        this.memo = memo;
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
    * 获取-机构代码
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-机构代码
    * @paramType java.lang.String
    * @param unitcode - 机构代码
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    /**
    * 获取-账户名称
    * @return accountname
     */
    public String getAccountname() {
        return accountname;
    }

    /**
    * 设置-账户名称
    * @paramType java.lang.String
    * @param accountname - 账户名称
     */
    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    /**
    * 获取-银行名称
    * @return bankname
     */
    public String getBankname() {
        return bankname;
    }

    /**
    * 设置-银行名称
    * @paramType java.lang.String
    * @param bankname - 银行名称
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }
}