package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_printableinvoice_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPrintableinvoiceTd {
    /**
     * 待打印发票表流水号
     */
    private Long printableno;

    /**
     * 核销生成的交易流水表的批次号
     */
    private BigDecimal tradebatno;

    /**
     * 发票类型：1 保单发票、2 赔款发票、 3 共保出单费发票
     */
    private String businesstype;

    /**
     * 核销业务数据的唯一流水号
     */
    private Long seqpolicy;

    /**
     * 业务数据的币种
     */
    private String currency;

    /**
     * 业务数据的被核销金额
     */
    private BigDecimal amount;

    /**
     * 开票汇率
     */
    private BigDecimal invoicerate;

    /**
     * 本次核销的币种
     */
    private String invoicecurrency;

    /**
     * 本次核销单金额
     */
    private BigDecimal invoiceamount;

    /**
     * 0：未生成发票、1：已生成发票、3：作废
     */
    private String status;

    /**
     * 业务数据的保单号
     */
    private String policyno;

    /**
     * 业务数据的批单号
     */
    private String endorseno;

    /**
     * 业务数据的客户代码
     */
    private String customercode;

    /**
     * 业务数据的客户名称
     */
    private String customername;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 操作人员
     */
    private String opcode;

    /**
     * 如果已生成发票，则该字段填入发票保单对照表的唯一流水号
     */
    private Long seqinvply;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * 最后操作人员
     */
    private String lastopcode;

    /**
     * 险别属性 0应税 1 免税 2 零税
     */
    private String classesstype;

    /**
     * 已生成发票金额(保单币种)
     */
    private BigDecimal handledamount;

    /**
     * 已生成发票金额(发票币种)
     */
    private BigDecimal invhandledamount;

    /**
     * 已开发票税额(保单币种)
     */
    private BigDecimal handletaxesdamount;

    /**
     * 已开发票税额(发票币种)
     */
    private BigDecimal invhandledtaxesamount;

    /**
    * 获取-待打印发票表流水号
    * @return printableno
     */
    public Long getPrintableno() {
        return printableno;
    }

    /**
    * 设置-待打印发票表流水号
    * @paramType java.lang.Long
    * @param printableno - 待打印发票表流水号
     */
    public void setPrintableno(Long printableno) {
        this.printableno = printableno;
    }

    /**
    * 获取-核销生成的交易流水表的批次号
    * @return tradebatno
     */
    public BigDecimal getTradebatno() {
        return tradebatno;
    }

    /**
    * 设置-核销生成的交易流水表的批次号
    * @paramType java.math.BigDecimal
    * @param tradebatno - 核销生成的交易流水表的批次号
     */
    public void setTradebatno(BigDecimal tradebatno) {
        this.tradebatno = tradebatno;
    }

    /**
    * 获取-发票类型：1 保单发票、2 赔款发票、 3 共保出单费发票
    * @return businesstype
     */
    public String getBusinesstype() {
        return businesstype;
    }

    /**
    * 设置-发票类型：1 保单发票、2 赔款发票、 3 共保出单费发票
    * @paramType java.lang.String
    * @param businesstype - 发票类型：1 保单发票、2 赔款发票、 3 共保出单费发票
     */
    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype;
    }

    /**
    * 获取-核销业务数据的唯一流水号
    * @return seqpolicy
     */
    public Long getSeqpolicy() {
        return seqpolicy;
    }

    /**
    * 设置-核销业务数据的唯一流水号
    * @paramType java.lang.Long
    * @param seqpolicy - 核销业务数据的唯一流水号
     */
    public void setSeqpolicy(Long seqpolicy) {
        this.seqpolicy = seqpolicy;
    }

    /**
    * 获取-业务数据的币种
    * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
    * 设置-业务数据的币种
    * @paramType java.lang.String
    * @param currency - 业务数据的币种
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
    * 获取-业务数据的被核销金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-业务数据的被核销金额
    * @paramType java.math.BigDecimal
    * @param amount - 业务数据的被核销金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-开票汇率
    * @return invoicerate
     */
    public BigDecimal getInvoicerate() {
        return invoicerate;
    }

    /**
    * 设置-开票汇率
    * @paramType java.math.BigDecimal
    * @param invoicerate - 开票汇率
     */
    public void setInvoicerate(BigDecimal invoicerate) {
        this.invoicerate = invoicerate;
    }

    /**
    * 获取-本次核销的币种
    * @return invoicecurrency
     */
    public String getInvoicecurrency() {
        return invoicecurrency;
    }

    /**
    * 设置-本次核销的币种
    * @paramType java.lang.String
    * @param invoicecurrency - 本次核销的币种
     */
    public void setInvoicecurrency(String invoicecurrency) {
        this.invoicecurrency = invoicecurrency;
    }

    /**
    * 获取-本次核销单金额
    * @return invoiceamount
     */
    public BigDecimal getInvoiceamount() {
        return invoiceamount;
    }

    /**
    * 设置-本次核销单金额
    * @paramType java.math.BigDecimal
    * @param invoiceamount - 本次核销单金额
     */
    public void setInvoiceamount(BigDecimal invoiceamount) {
        this.invoiceamount = invoiceamount;
    }

    /**
    * 获取-0：未生成发票、1：已生成发票、3：作废
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-0：未生成发票、1：已生成发票、3：作废
    * @paramType java.lang.String
    * @param status - 0：未生成发票、1：已生成发票、3：作废
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-业务数据的保单号
    * @return policyno
     */
    public String getPolicyno() {
        return policyno;
    }

    /**
    * 设置-业务数据的保单号
    * @paramType java.lang.String
    * @param policyno - 业务数据的保单号
     */
    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    /**
    * 获取-业务数据的批单号
    * @return endorseno
     */
    public String getEndorseno() {
        return endorseno;
    }

    /**
    * 设置-业务数据的批单号
    * @paramType java.lang.String
    * @param endorseno - 业务数据的批单号
     */
    public void setEndorseno(String endorseno) {
        this.endorseno = endorseno;
    }

    /**
    * 获取-业务数据的客户代码
    * @return customercode
     */
    public String getCustomercode() {
        return customercode;
    }

    /**
    * 设置-业务数据的客户代码
    * @paramType java.lang.String
    * @param customercode - 业务数据的客户代码
     */
    public void setCustomercode(String customercode) {
        this.customercode = customercode;
    }

    /**
    * 获取-业务数据的客户名称
    * @return customername
     */
    public String getCustomername() {
        return customername;
    }

    /**
    * 设置-业务数据的客户名称
    * @paramType java.lang.String
    * @param customername - 业务数据的客户名称
     */
    public void setCustomername(String customername) {
        this.customername = customername;
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
    * 获取-操作人员
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作人员
    * @paramType java.lang.String
    * @param opcode - 操作人员
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-如果已生成发票，则该字段填入发票保单对照表的唯一流水号
    * @return seqinvply
     */
    public Long getSeqinvply() {
        return seqinvply;
    }

    /**
    * 设置-如果已生成发票，则该字段填入发票保单对照表的唯一流水号
    * @paramType java.lang.Long
    * @param seqinvply - 如果已生成发票，则该字段填入发票保单对照表的唯一流水号
     */
    public void setSeqinvply(Long seqinvply) {
        this.seqinvply = seqinvply;
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
    * 获取-最后操作人员
    * @return lastopcode
     */
    public String getLastopcode() {
        return lastopcode;
    }

    /**
    * 设置-最后操作人员
    * @paramType java.lang.String
    * @param lastopcode - 最后操作人员
     */
    public void setLastopcode(String lastopcode) {
        this.lastopcode = lastopcode;
    }

    /**
    * 获取-险别属性 0应税 1 免税 2 零税
    * @return classesstype
     */
    public String getClassesstype() {
        return classesstype;
    }

    /**
    * 设置-险别属性 0应税 1 免税 2 零税
    * @paramType java.lang.String
    * @param classesstype - 险别属性 0应税 1 免税 2 零税
     */
    public void setClassesstype(String classesstype) {
        this.classesstype = classesstype;
    }

    /**
    * 获取-已生成发票金额(保单币种)
    * @return handledamount
     */
    public BigDecimal getHandledamount() {
        return handledamount;
    }

    /**
    * 设置-已生成发票金额(保单币种)
    * @paramType java.math.BigDecimal
    * @param handledamount - 已生成发票金额(保单币种)
     */
    public void setHandledamount(BigDecimal handledamount) {
        this.handledamount = handledamount;
    }

    /**
    * 获取-已生成发票金额(发票币种)
    * @return invhandledamount
     */
    public BigDecimal getInvhandledamount() {
        return invhandledamount;
    }

    /**
    * 设置-已生成发票金额(发票币种)
    * @paramType java.math.BigDecimal
    * @param invhandledamount - 已生成发票金额(发票币种)
     */
    public void setInvhandledamount(BigDecimal invhandledamount) {
        this.invhandledamount = invhandledamount;
    }

    /**
    * 获取-已开发票税额(保单币种)
    * @return handletaxesdamount
     */
    public BigDecimal getHandletaxesdamount() {
        return handletaxesdamount;
    }

    /**
    * 设置-已开发票税额(保单币种)
    * @paramType java.math.BigDecimal
    * @param handletaxesdamount - 已开发票税额(保单币种)
     */
    public void setHandletaxesdamount(BigDecimal handletaxesdamount) {
        this.handletaxesdamount = handletaxesdamount;
    }

    /**
    * 获取-已开发票税额(发票币种)
    * @return invhandledtaxesamount
     */
    public BigDecimal getInvhandledtaxesamount() {
        return invhandledtaxesamount;
    }

    /**
    * 设置-已开发票税额(发票币种)
    * @paramType java.math.BigDecimal
    * @param invhandledtaxesamount - 已开发票税额(发票币种)
     */
    public void setInvhandledtaxesamount(BigDecimal invhandledtaxesamount) {
        this.invhandledtaxesamount = invhandledtaxesamount;
    }
}