package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_vatinvoicedetail_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmVatinvoicedetailTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 关联mm_invoice_td主键
     */
    private Long seqinvoice;

    /**
     * 发票号
     */
    private String invoiceno;

    /**
     * 销项接口表主键
     */
    private Long seqpolicy;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 开票币种
     */
    private String currencycode;

    /**
     * 开票金额
     */
    private BigDecimal amount;

    /**
     * 开票税额
     */
    private BigDecimal taxesamount;

    /**
     * 原币币种
     */
    private String basecurrencycode;

    /**
     * 原币金额
     */
    private BigDecimal baseamount;

    /**
     * 原币税额
     */
    private BigDecimal basetaxesamount;

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
     * 险种名称
     */
    private String classescode;

    /**
     * 税率
     */
    private BigDecimal taxesrate;

    /**
     * 汇率
     */
    private BigDecimal exchangerate;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 0发票开具 1发票作废 2发票红冲 3发票遗失
     */
    private String opstatus;

    /**
     * 险别属性： 0 应税 ，1 免税 ，2 零税
     */
    private String classtype;

    /**
     * 赔案号
     */
    private String claimno;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 部门
     */
    private String departmentcode;

    /**
     * mm_policy_td 表的seqpolicy
     */
    private BigDecimal seqpolicy2;

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
    * 获取-关联mm_invoice_td主键
    * @return seqinvoice
     */
    public Long getSeqinvoice() {
        return seqinvoice;
    }

    /**
    * 设置-关联mm_invoice_td主键
    * @paramType java.lang.Long
    * @param seqinvoice - 关联mm_invoice_td主键
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
    * 获取-销项接口表主键
    * @return seqpolicy
     */
    public Long getSeqpolicy() {
        return seqpolicy;
    }

    /**
    * 设置-销项接口表主键
    * @paramType java.lang.Long
    * @param seqpolicy - 销项接口表主键
     */
    public void setSeqpolicy(Long seqpolicy) {
        this.seqpolicy = seqpolicy;
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
    * 获取-开票币种
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-开票币种
    * @paramType java.lang.String
    * @param currencycode - 开票币种
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-开票金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-开票金额
    * @paramType java.math.BigDecimal
    * @param amount - 开票金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-开票税额
    * @return taxesamount
     */
    public BigDecimal getTaxesamount() {
        return taxesamount;
    }

    /**
    * 设置-开票税额
    * @paramType java.math.BigDecimal
    * @param taxesamount - 开票税额
     */
    public void setTaxesamount(BigDecimal taxesamount) {
        this.taxesamount = taxesamount;
    }

    /**
    * 获取-原币币种
    * @return basecurrencycode
     */
    public String getBasecurrencycode() {
        return basecurrencycode;
    }

    /**
    * 设置-原币币种
    * @paramType java.lang.String
    * @param basecurrencycode - 原币币种
     */
    public void setBasecurrencycode(String basecurrencycode) {
        this.basecurrencycode = basecurrencycode;
    }

    /**
    * 获取-原币金额
    * @return baseamount
     */
    public BigDecimal getBaseamount() {
        return baseamount;
    }

    /**
    * 设置-原币金额
    * @paramType java.math.BigDecimal
    * @param baseamount - 原币金额
     */
    public void setBaseamount(BigDecimal baseamount) {
        this.baseamount = baseamount;
    }

    /**
    * 获取-原币税额
    * @return basetaxesamount
     */
    public BigDecimal getBasetaxesamount() {
        return basetaxesamount;
    }

    /**
    * 设置-原币税额
    * @paramType java.math.BigDecimal
    * @param basetaxesamount - 原币税额
     */
    public void setBasetaxesamount(BigDecimal basetaxesamount) {
        this.basetaxesamount = basetaxesamount;
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
    * 获取-税率
    * @return taxesrate
     */
    public BigDecimal getTaxesrate() {
        return taxesrate;
    }

    /**
    * 设置-税率
    * @paramType java.math.BigDecimal
    * @param taxesrate - 税率
     */
    public void setTaxesrate(BigDecimal taxesrate) {
        this.taxesrate = taxesrate;
    }

    /**
    * 获取-汇率
    * @return exchangerate
     */
    public BigDecimal getExchangerate() {
        return exchangerate;
    }

    /**
    * 设置-汇率
    * @paramType java.math.BigDecimal
    * @param exchangerate - 汇率
     */
    public void setExchangerate(BigDecimal exchangerate) {
        this.exchangerate = exchangerate;
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
    * 获取-0发票开具 1发票作废 2发票红冲 3发票遗失
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-0发票开具 1发票作废 2发票红冲 3发票遗失
    * @paramType java.lang.String
    * @param opstatus - 0发票开具 1发票作废 2发票红冲 3发票遗失
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
    }

    /**
    * 获取-险别属性： 0 应税 ，1 免税 ，2 零税
    * @return classtype
     */
    public String getClasstype() {
        return classtype;
    }

    /**
    * 设置-险别属性： 0 应税 ，1 免税 ，2 零税
    * @paramType java.lang.String
    * @param classtype - 险别属性： 0 应税 ，1 免税 ，2 零税
     */
    public void setClasstype(String classtype) {
        this.classtype = classtype;
    }

    /**
    * 获取-赔案号
    * @return claimno
     */
    public String getClaimno() {
        return claimno;
    }

    /**
    * 设置-赔案号
    * @paramType java.lang.String
    * @param claimno - 赔案号
     */
    public void setClaimno(String claimno) {
        this.claimno = claimno;
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
    * 获取-部门
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-部门
    * @paramType java.lang.String
    * @param departmentcode - 部门
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    /**
    * 获取-mm_policy_td 表的seqpolicy
    * @return seqpolicy2
     */
    public BigDecimal getSeqpolicy2() {
        return seqpolicy2;
    }

    /**
    * 设置-mm_policy_td 表的seqpolicy
    * @paramType java.math.BigDecimal
    * @param seqpolicy2 - mm_policy_td 表的seqpolicy
     */
    public void setSeqpolicy2(BigDecimal seqpolicy2) {
        this.seqpolicy2 = seqpolicy2;
    }
}