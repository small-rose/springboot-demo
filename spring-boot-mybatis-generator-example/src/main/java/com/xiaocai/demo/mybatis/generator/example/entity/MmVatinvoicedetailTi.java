package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_vatinvoicedetail_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmVatinvoicedetailTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 关联mm_vatinvoice_ti主键
     */
    private Long seqinvoicedetail;

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
     * 险别属性： 0 应税 ，1 免税 ，2 零税
     */
    private String classtype;

    /**
     * 赔案号
     */
    private String claimno;

    /**
     * 预留字段
     */
    private String reserve1;

    /**
     * 预留字段
     */
    private String reserve2;

    /**
     * 预留字段
     */
    private String reserve3;

    /**
     * 预留字段
     */
    private Date reserve4;

    /**
     * mm_policy_td 表的seqpolicy
     */
    private Long seqpolicy2;

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
    * 获取-关联mm_vatinvoice_ti主键
    * @return seqinvoicedetail
     */
    public Long getSeqinvoicedetail() {
        return seqinvoicedetail;
    }

    /**
    * 设置-关联mm_vatinvoice_ti主键
    * @paramType java.lang.Long
    * @param seqinvoicedetail - 关联mm_vatinvoice_ti主键
     */
    public void setSeqinvoicedetail(Long seqinvoicedetail) {
        this.seqinvoicedetail = seqinvoicedetail;
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
    * 获取-预留字段
    * @return reserve1
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
    * 设置-预留字段
    * @paramType java.lang.String
    * @param reserve1 - 预留字段
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    /**
    * 获取-预留字段
    * @return reserve2
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
    * 设置-预留字段
    * @paramType java.lang.String
    * @param reserve2 - 预留字段
     */
    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

    /**
    * 获取-预留字段
    * @return reserve3
     */
    public String getReserve3() {
        return reserve3;
    }

    /**
    * 设置-预留字段
    * @paramType java.lang.String
    * @param reserve3 - 预留字段
     */
    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3;
    }

    /**
    * 获取-预留字段
    * @return reserve4
     */
    public Date getReserve4() {
        return reserve4;
    }

    /**
    * 设置-预留字段
    * @paramType java.util.Date
    * @param reserve4 - 预留字段
     */
    public void setReserve4(Date reserve4) {
        this.reserve4 = reserve4;
    }

    /**
    * 获取-mm_policy_td 表的seqpolicy
    * @return seqpolicy2
     */
    public Long getSeqpolicy2() {
        return seqpolicy2;
    }

    /**
    * 设置-mm_policy_td 表的seqpolicy
    * @paramType java.lang.Long
    * @param seqpolicy2 - mm_policy_td 表的seqpolicy
     */
    public void setSeqpolicy2(Long seqpolicy2) {
        this.seqpolicy2 = seqpolicy2;
    }
}