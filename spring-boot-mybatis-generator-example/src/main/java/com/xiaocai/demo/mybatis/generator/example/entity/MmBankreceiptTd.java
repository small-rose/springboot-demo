package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_bankreceipt_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmBankreceiptTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 交易笔数
     */
    private BigDecimal linecount;

    /**
     * 银行回单流水号
     */
    private String banktransactionsno;

    /**
     * 银行账户
     */
    private String bankno;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 刷卡日期
     */
    private Date inpaymentdate;

    /**
     * 操作员
     */
    private String opcode;

    /**
     * 状态 ’0‘未确认 ’1‘ 已确认
     */
    private String status;

    /**
     * 上次修改时间
     */
    private Date lastopdate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 用于描述手工修改过数据
     */
    private String modifydesc;

    /**
     * 手续费率
     */
    private String sxfl;

    /**
     * 数据来源
     */
    private String banksource;

    /**
     * 进账时间
     */
    private Date inaccounttime;

    /**
     * 结算批次号，对应mm_inpayment_ti.batchid2
     */
    private String batchid;

    /**
     * 业务渠道.WEB: 表示网销 TEL: 表示电销 POS:表示POS销售 
     */
    private String busstype;

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
    * 获取-分公司
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司
    * @paramType java.lang.String
    * @param subcompany - 分公司
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
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
    * 获取-交易笔数
    * @return linecount
     */
    public BigDecimal getLinecount() {
        return linecount;
    }

    /**
    * 设置-交易笔数
    * @paramType java.math.BigDecimal
    * @param linecount - 交易笔数
     */
    public void setLinecount(BigDecimal linecount) {
        this.linecount = linecount;
    }

    /**
    * 获取-银行回单流水号
    * @return banktransactionsno
     */
    public String getBanktransactionsno() {
        return banktransactionsno;
    }

    /**
    * 设置-银行回单流水号
    * @paramType java.lang.String
    * @param banktransactionsno - 银行回单流水号
     */
    public void setBanktransactionsno(String banktransactionsno) {
        this.banktransactionsno = banktransactionsno;
    }

    /**
    * 获取-银行账户
    * @return bankno
     */
    public String getBankno() {
        return bankno;
    }

    /**
    * 设置-银行账户
    * @paramType java.lang.String
    * @param bankno - 银行账户
     */
    public void setBankno(String bankno) {
        this.bankno = bankno;
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
    * 获取-刷卡日期
    * @return inpaymentdate
     */
    public Date getInpaymentdate() {
        return inpaymentdate;
    }

    /**
    * 设置-刷卡日期
    * @paramType java.util.Date
    * @param inpaymentdate - 刷卡日期
     */
    public void setInpaymentdate(Date inpaymentdate) {
        this.inpaymentdate = inpaymentdate;
    }

    /**
    * 获取-操作员
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作员
    * @paramType java.lang.String
    * @param opcode - 操作员
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-状态 ’0‘未确认 ’1‘ 已确认
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态 ’0‘未确认 ’1‘ 已确认
    * @paramType java.lang.String
    * @param status - 状态 ’0‘未确认 ’1‘ 已确认
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-上次修改时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-上次修改时间
    * @paramType java.util.Date
    * @param lastopdate - 上次修改时间
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-时间戳
    * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
    * 设置-时间戳
    * @paramType java.util.Date
    * @param timestamp - 时间戳
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
    * 获取-用于描述手工修改过数据
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-用于描述手工修改过数据
    * @paramType java.lang.String
    * @param modifydesc - 用于描述手工修改过数据
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-手续费率
    * @return sxfl
     */
    public String getSxfl() {
        return sxfl;
    }

    /**
    * 设置-手续费率
    * @paramType java.lang.String
    * @param sxfl - 手续费率
     */
    public void setSxfl(String sxfl) {
        this.sxfl = sxfl;
    }

    /**
    * 获取-数据来源
    * @return banksource
     */
    public String getBanksource() {
        return banksource;
    }

    /**
    * 设置-数据来源
    * @paramType java.lang.String
    * @param banksource - 数据来源
     */
    public void setBanksource(String banksource) {
        this.banksource = banksource;
    }

    /**
    * 获取-进账时间
    * @return inaccounttime
     */
    public Date getInaccounttime() {
        return inaccounttime;
    }

    /**
    * 设置-进账时间
    * @paramType java.util.Date
    * @param inaccounttime - 进账时间
     */
    public void setInaccounttime(Date inaccounttime) {
        this.inaccounttime = inaccounttime;
    }

    /**
    * 获取-结算批次号，对应mm_inpayment_ti.batchid2
    * @return batchid
     */
    public String getBatchid() {
        return batchid;
    }

    /**
    * 设置-结算批次号，对应mm_inpayment_ti.batchid2
    * @paramType java.lang.String
    * @param batchid - 结算批次号，对应mm_inpayment_ti.batchid2
     */
    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    /**
    * 获取-业务渠道.WEB: 表示网销
TEL: 表示电销
POS:表示POS销售

    * @return busstype
     */
    public String getBusstype() {
        return busstype;
    }

    /**
    * 设置-业务渠道.WEB: 表示网销
TEL: 表示电销
POS:表示POS销售

    * @paramType java.lang.String
    * @param busstype - 业务渠道.WEB: 表示网销
TEL: 表示电销
POS:表示POS销售

     */
    public void setBusstype(String busstype) {
        this.busstype = busstype;
    }
}