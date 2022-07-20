package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_taxoutback_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTaxoutbackTd {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * mm_taxdetail_td.id
     */
    private Long taxid;

    /**
     * 保单流水号
     */
    private Long seqpolicy;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 记账币种
     */
    private String currencycode;

    /**
     * 00 初始状态 01批单的数据 02处理中  03发送失败 12发送成功   22返回  EE天津免税数据初始状态
     */
    private String taxstatus;

    /**
     * 发送交易流水号
     */
    private String jylsh;

    /**
     * 批单时取原保单的流水号，不为批单为空
     */
    private String netno;

    /**
     * 地税返回交易流水号
     */
    private String backjylsh;

    /**
     * 回应报文编号
     */
    private String typeno;

    /**
     * 返回码
     */
    private String fhm;

    /**
     * 返回信息
     */
    private String fhxx;

    /**
     * 地税返回时间
     */
    private Date taxpaydate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     *  版本号
     */
    private Integer hibernateversion;

    /**
     * 手工标识
     */
    private String modifydesc;

    /**
     * 错误信息
     */
    private String errmsg;

    /**
     * 确认时间
     */
    private Date confirmdate;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 当年应缴
     */
    private BigDecimal taxpayable;

    /**
     * 往年补缴
     */
    private BigDecimal backtax;

    /**
     * 滞纳金
     */
    private BigDecimal latefee;

    /**
     * 完税凭证号/免税凭证号
     */
    private String taxcertno;

    /**
    * 获取-主键ID
    * @return id
     */
    public Long getId() {
        return id;
    }

    /**
    * 设置-主键ID
    * @paramType java.lang.Long
    * @param id - 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    * 获取-mm_taxdetail_td.id
    * @return taxid
     */
    public Long getTaxid() {
        return taxid;
    }

    /**
    * 设置-mm_taxdetail_td.id
    * @paramType java.lang.Long
    * @param taxid - mm_taxdetail_td.id
     */
    public void setTaxid(Long taxid) {
        this.taxid = taxid;
    }

    /**
    * 获取-保单流水号
    * @return seqpolicy
     */
    public Long getSeqpolicy() {
        return seqpolicy;
    }

    /**
    * 设置-保单流水号
    * @paramType java.lang.Long
    * @param seqpolicy - 保单流水号
     */
    public void setSeqpolicy(Long seqpolicy) {
        this.seqpolicy = seqpolicy;
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
    * 获取-保单号
    * @return policyno
     */
    public String getPolicyno() {
        return policyno;
    }

    /**
    * 设置-保单号
    * @paramType java.lang.String
    * @param policyno - 保单号
     */
    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    /**
    * 获取-批单号
    * @return endorseno
     */
    public String getEndorseno() {
        return endorseno;
    }

    /**
    * 设置-批单号
    * @paramType java.lang.String
    * @param endorseno - 批单号
     */
    public void setEndorseno(String endorseno) {
        this.endorseno = endorseno;
    }

    /**
    * 获取-记账币种
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-记账币种
    * @paramType java.lang.String
    * @param currencycode - 记账币种
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-00 初始状态 01批单的数据 02处理中  03发送失败 12发送成功   22返回  EE天津免税数据初始状态
    * @return taxstatus
     */
    public String getTaxstatus() {
        return taxstatus;
    }

    /**
    * 设置-00 初始状态 01批单的数据 02处理中  03发送失败 12发送成功   22返回  EE天津免税数据初始状态
    * @paramType java.lang.String
    * @param taxstatus - 00 初始状态 01批单的数据 02处理中  03发送失败 12发送成功   22返回  EE天津免税数据初始状态
     */
    public void setTaxstatus(String taxstatus) {
        this.taxstatus = taxstatus;
    }

    /**
    * 获取-发送交易流水号
    * @return jylsh
     */
    public String getJylsh() {
        return jylsh;
    }

    /**
    * 设置-发送交易流水号
    * @paramType java.lang.String
    * @param jylsh - 发送交易流水号
     */
    public void setJylsh(String jylsh) {
        this.jylsh = jylsh;
    }

    /**
    * 获取-批单时取原保单的流水号，不为批单为空
    * @return netno
     */
    public String getNetno() {
        return netno;
    }

    /**
    * 设置-批单时取原保单的流水号，不为批单为空
    * @paramType java.lang.String
    * @param netno - 批单时取原保单的流水号，不为批单为空
     */
    public void setNetno(String netno) {
        this.netno = netno;
    }

    /**
    * 获取-地税返回交易流水号
    * @return backjylsh
     */
    public String getBackjylsh() {
        return backjylsh;
    }

    /**
    * 设置-地税返回交易流水号
    * @paramType java.lang.String
    * @param backjylsh - 地税返回交易流水号
     */
    public void setBackjylsh(String backjylsh) {
        this.backjylsh = backjylsh;
    }

    /**
    * 获取-回应报文编号
    * @return typeno
     */
    public String getTypeno() {
        return typeno;
    }

    /**
    * 设置-回应报文编号
    * @paramType java.lang.String
    * @param typeno - 回应报文编号
     */
    public void setTypeno(String typeno) {
        this.typeno = typeno;
    }

    /**
    * 获取-返回码
    * @return fhm
     */
    public String getFhm() {
        return fhm;
    }

    /**
    * 设置-返回码
    * @paramType java.lang.String
    * @param fhm - 返回码
     */
    public void setFhm(String fhm) {
        this.fhm = fhm;
    }

    /**
    * 获取-返回信息
    * @return fhxx
     */
    public String getFhxx() {
        return fhxx;
    }

    /**
    * 设置-返回信息
    * @paramType java.lang.String
    * @param fhxx - 返回信息
     */
    public void setFhxx(String fhxx) {
        this.fhxx = fhxx;
    }

    /**
    * 获取-地税返回时间
    * @return taxpaydate
     */
    public Date getTaxpaydate() {
        return taxpaydate;
    }

    /**
    * 设置-地税返回时间
    * @paramType java.util.Date
    * @param taxpaydate - 地税返回时间
     */
    public void setTaxpaydate(Date taxpaydate) {
        this.taxpaydate = taxpaydate;
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
    * 获取-最后操作时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作时间
    * @paramType java.util.Date
    * @param lastopdate - 最后操作时间
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取- 版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置- 版本号
    * @paramType java.lang.Integer
    * @param hibernateversion -  版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-手工标识
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工标识
    * @paramType java.lang.String
    * @param modifydesc - 手工标识
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-错误信息
    * @return errmsg
     */
    public String getErrmsg() {
        return errmsg;
    }

    /**
    * 设置-错误信息
    * @paramType java.lang.String
    * @param errmsg - 错误信息
     */
    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    /**
    * 获取-确认时间
    * @return confirmdate
     */
    public Date getConfirmdate() {
        return confirmdate;
    }

    /**
    * 设置-确认时间
    * @paramType java.util.Date
    * @param confirmdate - 确认时间
     */
    public void setConfirmdate(Date confirmdate) {
        this.confirmdate = confirmdate;
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
    * 获取-当年应缴
    * @return taxpayable
     */
    public BigDecimal getTaxpayable() {
        return taxpayable;
    }

    /**
    * 设置-当年应缴
    * @paramType java.math.BigDecimal
    * @param taxpayable - 当年应缴
     */
    public void setTaxpayable(BigDecimal taxpayable) {
        this.taxpayable = taxpayable;
    }

    /**
    * 获取-往年补缴
    * @return backtax
     */
    public BigDecimal getBacktax() {
        return backtax;
    }

    /**
    * 设置-往年补缴
    * @paramType java.math.BigDecimal
    * @param backtax - 往年补缴
     */
    public void setBacktax(BigDecimal backtax) {
        this.backtax = backtax;
    }

    /**
    * 获取-滞纳金
    * @return latefee
     */
    public BigDecimal getLatefee() {
        return latefee;
    }

    /**
    * 设置-滞纳金
    * @paramType java.math.BigDecimal
    * @param latefee - 滞纳金
     */
    public void setLatefee(BigDecimal latefee) {
        this.latefee = latefee;
    }

    /**
    * 获取-完税凭证号/免税凭证号
    * @return taxcertno
     */
    public String getTaxcertno() {
        return taxcertno;
    }

    /**
    * 设置-完税凭证号/免税凭证号
    * @paramType java.lang.String
    * @param taxcertno - 完税凭证号/免税凭证号
     */
    public void setTaxcertno(String taxcertno) {
        this.taxcertno = taxcertno;
    }
}