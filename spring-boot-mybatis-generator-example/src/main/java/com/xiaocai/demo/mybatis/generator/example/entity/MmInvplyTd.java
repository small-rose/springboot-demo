package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_invply_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmInvplyTd {
    /**
     * 主键
     */
    private Long seqinvply;

    /**
     * 发票唯一号
     */
    private Long seqinvoice;

    /**
     * 即发票号，打印使用的单据号码或临时号
     */
    private String invoiceno;

    /**
     * 保批单分表流水号
     */
    private Long seqpolicy;

    /**
     * 业务性质 1:保费,2:储金,3:储金折保费,4:车船税,5:储金返还,6:储金利息,7:农业险保费中央财政补助,8:农业险保费省级财政补助,9:农业险保费地市县财政补助,A:农业险保费农民缴纳,B:农业险保费其他来源
     */
    private String businessattr;

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
     * 保单币种
     */
    private String currencycode;

    /**
     * 金额（保单币种）
     */
    private BigDecimal amount;

    /**
     * 已收金额（保单币种）
     */
    private BigDecimal incomeamount;

    /**
     * 操作员代码
     */
    private String opcode;

    /**
     * 核销状态
     */
    private String opstatus;

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
     * 数据来源
     */
    private String datasource;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 待生成发票表唯一号
     */
    private BigDecimal printableno;

    /**
     * 发票金额（发票币种）
     */
    private BigDecimal invoiceamount;

    /**
     * 发票币种
     */
    private String invoicecurrency;

    /**
     * 险种名称
     */
    private String classescode;

    /**
     * 保单已核销发票金额
     */
    private BigDecimal invincomeamount;

    /**
     * 生成发票税额
     */
    private BigDecimal invoicetaxesamount;

    /**
     * 生成发票人民币税额
     */
    private BigDecimal cnyinvoicetaxesamount;

    /**
    * 获取-主键
    * @return seqinvply
     */
    public Long getSeqinvply() {
        return seqinvply;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param seqinvply - 主键
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
    * 获取-即发票号，打印使用的单据号码或临时号
    * @return invoiceno
     */
    public String getInvoiceno() {
        return invoiceno;
    }

    /**
    * 设置-即发票号，打印使用的单据号码或临时号
    * @paramType java.lang.String
    * @param invoiceno - 即发票号，打印使用的单据号码或临时号
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
    * 获取-业务性质 1:保费,2:储金,3:储金折保费,4:车船税,5:储金返还,6:储金利息,7:农业险保费中央财政补助,8:农业险保费省级财政补助,9:农业险保费地市县财政补助,A:农业险保费农民缴纳,B:农业险保费其他来源
    * @return businessattr
     */
    public String getBusinessattr() {
        return businessattr;
    }

    /**
    * 设置-业务性质 1:保费,2:储金,3:储金折保费,4:车船税,5:储金返还,6:储金利息,7:农业险保费中央财政补助,8:农业险保费省级财政补助,9:农业险保费地市县财政补助,A:农业险保费农民缴纳,B:农业险保费其他来源
    * @paramType java.lang.String
    * @param businessattr - 业务性质 1:保费,2:储金,3:储金折保费,4:车船税,5:储金返还,6:储金利息,7:农业险保费中央财政补助,8:农业险保费省级财政补助,9:农业险保费地市县财政补助,A:农业险保费农民缴纳,B:农业险保费其他来源
     */
    public void setBusinessattr(String businessattr) {
        this.businessattr = businessattr;
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
    * 获取-已收金额（保单币种）
    * @return incomeamount
     */
    public BigDecimal getIncomeamount() {
        return incomeamount;
    }

    /**
    * 设置-已收金额（保单币种）
    * @paramType java.math.BigDecimal
    * @param incomeamount - 已收金额（保单币种）
     */
    public void setIncomeamount(BigDecimal incomeamount) {
        this.incomeamount = incomeamount;
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
    * 获取-核销状态
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-核销状态
    * @paramType java.lang.String
    * @param opstatus - 核销状态
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
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
    * 获取-数据来源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-数据来源
    * @paramType java.lang.String
    * @param datasource - 数据来源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
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
    * 获取-待生成发票表唯一号
    * @return printableno
     */
    public BigDecimal getPrintableno() {
        return printableno;
    }

    /**
    * 设置-待生成发票表唯一号
    * @paramType java.math.BigDecimal
    * @param printableno - 待生成发票表唯一号
     */
    public void setPrintableno(BigDecimal printableno) {
        this.printableno = printableno;
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
    * 获取-险种名称
    * @return classescode
     */
    public String getClassescode() {
        return classescode;
    }

    /**
    * 设置-险种名称
    * @paramType java.lang.String
    * @param classescode - 险种名称
     */
    public void setClassescode(String classescode) {
        this.classescode = classescode;
    }

    /**
    * 获取-保单已核销发票金额
    * @return invincomeamount
     */
    public BigDecimal getInvincomeamount() {
        return invincomeamount;
    }

    /**
    * 设置-保单已核销发票金额
    * @paramType java.math.BigDecimal
    * @param invincomeamount - 保单已核销发票金额
     */
    public void setInvincomeamount(BigDecimal invincomeamount) {
        this.invincomeamount = invincomeamount;
    }

    /**
    * 获取-生成发票税额
    * @return invoicetaxesamount
     */
    public BigDecimal getInvoicetaxesamount() {
        return invoicetaxesamount;
    }

    /**
    * 设置-生成发票税额
    * @paramType java.math.BigDecimal
    * @param invoicetaxesamount - 生成发票税额
     */
    public void setInvoicetaxesamount(BigDecimal invoicetaxesamount) {
        this.invoicetaxesamount = invoicetaxesamount;
    }

    /**
    * 获取-生成发票人民币税额
    * @return cnyinvoicetaxesamount
     */
    public BigDecimal getCnyinvoicetaxesamount() {
        return cnyinvoicetaxesamount;
    }

    /**
    * 设置-生成发票人民币税额
    * @paramType java.math.BigDecimal
    * @param cnyinvoicetaxesamount - 生成发票人民币税额
     */
    public void setCnyinvoicetaxesamount(BigDecimal cnyinvoicetaxesamount) {
        this.cnyinvoicetaxesamount = cnyinvoicetaxesamount;
    }
}