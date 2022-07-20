package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_printabledetail_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPrintabledetailTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 待打印表主键
     */
    private Long printableno;

    /**
     * 原币币种
     */
    private String currency;

    /**
     * 原币金额
     */
    private BigDecimal amount;

    /**
     * 发票币种
     */
    private String invoicecurrency;

    /**
     * 发票金额
     */
    private BigDecimal invoiceamount;

    /**
     * 1已生成发票、3作废
     */
    private String status;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 操作员代码
     */
    private String opcode;

    /**
     * mm_invply_td.SEQINVPLY
     */
    private Long seqinvply;

    /**
     * HIBERNATEVERSION版本号
     */
    private Integer hibernateversion;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 最后操作人
     */
    private String lastopcode;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

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
    * 获取-待打印表主键
    * @return printableno
     */
    public Long getPrintableno() {
        return printableno;
    }

    /**
    * 设置-待打印表主键
    * @paramType java.lang.Long
    * @param printableno - 待打印表主键
     */
    public void setPrintableno(Long printableno) {
        this.printableno = printableno;
    }

    /**
    * 获取-原币币种
    * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
    * 设置-原币币种
    * @paramType java.lang.String
    * @param currency - 原币币种
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
    * 获取-原币金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-原币金额
    * @paramType java.math.BigDecimal
    * @param amount - 原币金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-发票币种
    * @return invoicecurrency
     */
    public String getInvoicecurrency() {
        return invoicecurrency;
    }

    /**
    * 设置-发票币种
    * @paramType java.lang.String
    * @param invoicecurrency - 发票币种
     */
    public void setInvoicecurrency(String invoicecurrency) {
        this.invoicecurrency = invoicecurrency;
    }

    /**
    * 获取-发票金额
    * @return invoiceamount
     */
    public BigDecimal getInvoiceamount() {
        return invoiceamount;
    }

    /**
    * 设置-发票金额
    * @paramType java.math.BigDecimal
    * @param invoiceamount - 发票金额
     */
    public void setInvoiceamount(BigDecimal invoiceamount) {
        this.invoiceamount = invoiceamount;
    }

    /**
    * 获取-1已生成发票、3作废
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-1已生成发票、3作废
    * @paramType java.lang.String
    * @param status - 1已生成发票、3作废
     */
    public void setStatus(String status) {
        this.status = status;
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
    * 获取-操作员代码
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作员代码
    * @paramType java.lang.String
    * @param opcode - 操作员代码
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-mm_invply_td.SEQINVPLY
    * @return seqinvply
     */
    public Long getSeqinvply() {
        return seqinvply;
    }

    /**
    * 设置-mm_invply_td.SEQINVPLY
    * @paramType java.lang.Long
    * @param seqinvply - mm_invply_td.SEQINVPLY
     */
    public void setSeqinvply(Long seqinvply) {
        this.seqinvply = seqinvply;
    }

    /**
    * 获取-HIBERNATEVERSION版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATEVERSION版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATEVERSION版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
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
}