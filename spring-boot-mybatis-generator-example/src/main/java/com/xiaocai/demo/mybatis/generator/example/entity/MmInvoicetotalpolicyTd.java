package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_invoicetotalpolicy_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmInvoicetotalpolicyTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 待生成发票表唯一号
     */
    private Long printableno;

    /**
     * 保单发票表主键
     */
    private Long seqinvply;

    /**
     * 发票唯一号
     */
    private Long seqinvoice;

    /**
     * 发票号
     */
    private String invoiceno;

    /**
     * 保批单分表流水号
     */
    private Long seqpolicy;

    /**
     * 协议大保单号
     */
    private String totalprotocoltno;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 保单币种
     */
    private String currencycode;

    /**
     * 金额（保单币种）
     */
    private BigDecimal amount;

    /**
     * 税额（保单币种）
     */
    private BigDecimal taxessamount;

    /**
     * 开票状态 0未开票，1部分开票，2全部开票
     */
    private String opstatus;

    /**
     * 发票金额（发票币种）
     */
    private BigDecimal invoiceamount;

    /**
     * 发票税金金额（发票币种）
     */
    private BigDecimal invoicetaxessamount;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 小保单已起保挂账金额
     */
    private BigDecimal policystartamount;

    /**
     * 小保单已起保挂账税额
     */
    private BigDecimal policystarttaxessamount;

    /**
     * 冲销大保单挂账金额
     */
    private BigDecimal writeoffinvinceamount;

    /**
     * 冲销大保单挂账税额
     */
    private BigDecimal writeoffinvincetaxessamount;

    /**
     * 冲销状态 0未冲销，1部分冲销，2冲销完成
     */
    private String writeoffstatus;

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
    * 获取-待生成发票表唯一号
    * @return printableno
     */
    public Long getPrintableno() {
        return printableno;
    }

    /**
    * 设置-待生成发票表唯一号
    * @paramType java.lang.Long
    * @param printableno - 待生成发票表唯一号
     */
    public void setPrintableno(Long printableno) {
        this.printableno = printableno;
    }

    /**
    * 获取-保单发票表主键
    * @return seqinvply
     */
    public Long getSeqinvply() {
        return seqinvply;
    }

    /**
    * 设置-保单发票表主键
    * @paramType java.lang.Long
    * @param seqinvply - 保单发票表主键
     */
    public void setSeqinvply(Long seqinvply) {
        this.seqinvply = seqinvply;
    }

    /**
    * 获取-发票唯一号
    * @return seqinvoice
     */
    public Long getSeqinvoice() {
        return seqinvoice;
    }

    /**
    * 设置-发票唯一号
    * @paramType java.lang.Long
    * @param seqinvoice - 发票唯一号
     */
    public void setSeqinvoice(Long seqinvoice) {
        this.seqinvoice = seqinvoice;
    }

    /**
    * 获取-发票号
    * @return invoiceno
     */
    public String getInvoiceno() {
        return invoiceno;
    }

    /**
    * 设置-发票号
    * @paramType java.lang.String
    * @param invoiceno - 发票号
     */
    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    /**
    * 获取-保批单分表流水号
    * @return seqpolicy
     */
    public Long getSeqpolicy() {
        return seqpolicy;
    }

    /**
    * 设置-保批单分表流水号
    * @paramType java.lang.Long
    * @param seqpolicy - 保批单分表流水号
     */
    public void setSeqpolicy(Long seqpolicy) {
        this.seqpolicy = seqpolicy;
    }

    /**
    * 获取-协议大保单号
    * @return totalprotocoltno
     */
    public String getTotalprotocoltno() {
        return totalprotocoltno;
    }

    /**
    * 设置-协议大保单号
    * @paramType java.lang.String
    * @param totalprotocoltno - 协议大保单号
     */
    public void setTotalprotocoltno(String totalprotocoltno) {
        this.totalprotocoltno = totalprotocoltno;
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
    * 获取-保单币种
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-保单币种
    * @paramType java.lang.String
    * @param currencycode - 保单币种
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-金额（保单币种）
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-金额（保单币种）
    * @paramType java.math.BigDecimal
    * @param amount - 金额（保单币种）
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-税额（保单币种）
    * @return taxessamount
     */
    public BigDecimal getTaxessamount() {
        return taxessamount;
    }

    /**
    * 设置-税额（保单币种）
    * @paramType java.math.BigDecimal
    * @param taxessamount - 税额（保单币种）
     */
    public void setTaxessamount(BigDecimal taxessamount) {
        this.taxessamount = taxessamount;
    }

    /**
    * 获取-开票状态 0未开票，1部分开票，2全部开票
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-开票状态 0未开票，1部分开票，2全部开票
    * @paramType java.lang.String
    * @param opstatus - 开票状态 0未开票，1部分开票，2全部开票
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
    }

    /**
    * 获取-发票金额（发票币种）
    * @return invoiceamount
     */
    public BigDecimal getInvoiceamount() {
        return invoiceamount;
    }

    /**
    * 设置-发票金额（发票币种）
    * @paramType java.math.BigDecimal
    * @param invoiceamount - 发票金额（发票币种）
     */
    public void setInvoiceamount(BigDecimal invoiceamount) {
        this.invoiceamount = invoiceamount;
    }

    /**
    * 获取-发票税金金额（发票币种）
    * @return invoicetaxessamount
     */
    public BigDecimal getInvoicetaxessamount() {
        return invoicetaxessamount;
    }

    /**
    * 设置-发票税金金额（发票币种）
    * @paramType java.math.BigDecimal
    * @param invoicetaxessamount - 发票税金金额（发票币种）
     */
    public void setInvoicetaxessamount(BigDecimal invoicetaxessamount) {
        this.invoicetaxessamount = invoicetaxessamount;
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
    * 获取-HIBERNATE版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATE版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATE版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
    * @paramType java.lang.String
    * @param modifydesc - 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-小保单已起保挂账金额
    * @return policystartamount
     */
    public BigDecimal getPolicystartamount() {
        return policystartamount;
    }

    /**
    * 设置-小保单已起保挂账金额
    * @paramType java.math.BigDecimal
    * @param policystartamount - 小保单已起保挂账金额
     */
    public void setPolicystartamount(BigDecimal policystartamount) {
        this.policystartamount = policystartamount;
    }

    /**
    * 获取-小保单已起保挂账税额
    * @return policystarttaxessamount
     */
    public BigDecimal getPolicystarttaxessamount() {
        return policystarttaxessamount;
    }

    /**
    * 设置-小保单已起保挂账税额
    * @paramType java.math.BigDecimal
    * @param policystarttaxessamount - 小保单已起保挂账税额
     */
    public void setPolicystarttaxessamount(BigDecimal policystarttaxessamount) {
        this.policystarttaxessamount = policystarttaxessamount;
    }

    /**
    * 获取-冲销大保单挂账金额
    * @return writeoffinvinceamount
     */
    public BigDecimal getWriteoffinvinceamount() {
        return writeoffinvinceamount;
    }

    /**
    * 设置-冲销大保单挂账金额
    * @paramType java.math.BigDecimal
    * @param writeoffinvinceamount - 冲销大保单挂账金额
     */
    public void setWriteoffinvinceamount(BigDecimal writeoffinvinceamount) {
        this.writeoffinvinceamount = writeoffinvinceamount;
    }

    /**
    * 获取-冲销大保单挂账税额
    * @return writeoffinvincetaxessamount
     */
    public BigDecimal getWriteoffinvincetaxessamount() {
        return writeoffinvincetaxessamount;
    }

    /**
    * 设置-冲销大保单挂账税额
    * @paramType java.math.BigDecimal
    * @param writeoffinvincetaxessamount - 冲销大保单挂账税额
     */
    public void setWriteoffinvincetaxessamount(BigDecimal writeoffinvincetaxessamount) {
        this.writeoffinvincetaxessamount = writeoffinvincetaxessamount;
    }

    /**
    * 获取-冲销状态 0未冲销，1部分冲销，2冲销完成
    * @return writeoffstatus
     */
    public String getWriteoffstatus() {
        return writeoffstatus;
    }

    /**
    * 设置-冲销状态 0未冲销，1部分冲销，2冲销完成
    * @paramType java.lang.String
    * @param writeoffstatus - 冲销状态 0未冲销，1部分冲销，2冲销完成
     */
    public void setWriteoffstatus(String writeoffstatus) {
        this.writeoffstatus = writeoffstatus;
    }
}