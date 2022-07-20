package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_invoice_printdetail_split_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmInvoicePrintdetailSplitTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 发票表主键
     */
    private Long seqinvoice;

    /**
     * 汇总维度代码（可以是险种代码，条款代码等）
     */
    private String detailcode;

    /**
     * 发票开具明细说明（可以是险种名称，条款名称等）
     */
    private String detailname;

    /**
     * 原币币种
     */
    private String basecurrencycode;

    /**
     * 原币含税金额
     */
    private BigDecimal baseamount;

    /**
     * 折币币种
     */
    private String currencycode;

    /**
     * 折币含税金额
     */
    private BigDecimal amount;

    /**
     * 税率
     */
    private BigDecimal taxesrate;

    /**
     * 汇总类型 1 根据税率汇总  2 根据险种+税率汇总 3 根据险种+条款+税率汇总 4 根据险种+条款+保单+税率汇总
     */
    private String grouptype;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 手动修改记录
     */
    private String modifydesc;

    /**
     * 不含税条款金额
     */
    private BigDecimal exclusivetaxamount;

    /**
     * 1明细，2保险费
     */
    private String isdetailorpremiums;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 税金金额，保留2位数
     */
    private BigDecimal taxamount1;

    /**
     * 原币税金金额，保留2位数
     */
    private BigDecimal taxbaseamount1;

    /**
     * 税金金额，保留2位数
     */
    private BigDecimal taxamount;

    /**
     * 原币税金金额，保留2位数
     */
    private BigDecimal taxbaseamount;

    /**
     * 规格型号
     */
    private String ggxh;

    /**
     * 计量单位
     */
    private String jldw;

    /**
     * 商品数量
     */
    private String spsl;

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
    * 获取-发票表主键
    * @return seqinvoice
     */
    public Long getSeqinvoice() {
        return seqinvoice;
    }

    /**
    * 设置-发票表主键
    * @paramType java.lang.Long
    * @param seqinvoice - 发票表主键
     */
    public void setSeqinvoice(Long seqinvoice) {
        this.seqinvoice = seqinvoice;
    }

    /**
    * 获取-汇总维度代码（可以是险种代码，条款代码等）
    * @return detailcode
     */
    public String getDetailcode() {
        return detailcode;
    }

    /**
    * 设置-汇总维度代码（可以是险种代码，条款代码等）
    * @paramType java.lang.String
    * @param detailcode - 汇总维度代码（可以是险种代码，条款代码等）
     */
    public void setDetailcode(String detailcode) {
        this.detailcode = detailcode;
    }

    /**
    * 获取-发票开具明细说明（可以是险种名称，条款名称等）
    * @return detailname
     */
    public String getDetailname() {
        return detailname;
    }

    /**
    * 设置-发票开具明细说明（可以是险种名称，条款名称等）
    * @paramType java.lang.String
    * @param detailname - 发票开具明细说明（可以是险种名称，条款名称等）
     */
    public void setDetailname(String detailname) {
        this.detailname = detailname;
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
    * 获取-原币含税金额
    * @return baseamount
     */
    public BigDecimal getBaseamount() {
        return baseamount;
    }

    /**
    * 设置-原币含税金额
    * @paramType java.math.BigDecimal
    * @param baseamount - 原币含税金额
     */
    public void setBaseamount(BigDecimal baseamount) {
        this.baseamount = baseamount;
    }

    /**
    * 获取-折币币种
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-折币币种
    * @paramType java.lang.String
    * @param currencycode - 折币币种
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-折币含税金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-折币含税金额
    * @paramType java.math.BigDecimal
    * @param amount - 折币含税金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
    * 获取-汇总类型 1 根据税率汇总  2 根据险种+税率汇总 3 根据险种+条款+税率汇总 4 根据险种+条款+保单+税率汇总
    * @return grouptype
     */
    public String getGrouptype() {
        return grouptype;
    }

    /**
    * 设置-汇总类型 1 根据税率汇总  2 根据险种+税率汇总 3 根据险种+条款+税率汇总 4 根据险种+条款+保单+税率汇总
    * @paramType java.lang.String
    * @param grouptype - 汇总类型 1 根据税率汇总  2 根据险种+税率汇总 3 根据险种+条款+税率汇总 4 根据险种+条款+保单+税率汇总
     */
    public void setGrouptype(String grouptype) {
        this.grouptype = grouptype;
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
    * 获取-版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - 版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-手动修改记录
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手动修改记录
    * @paramType java.lang.String
    * @param modifydesc - 手动修改记录
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-不含税条款金额
    * @return exclusivetaxamount
     */
    public BigDecimal getExclusivetaxamount() {
        return exclusivetaxamount;
    }

    /**
    * 设置-不含税条款金额
    * @paramType java.math.BigDecimal
    * @param exclusivetaxamount - 不含税条款金额
     */
    public void setExclusivetaxamount(BigDecimal exclusivetaxamount) {
        this.exclusivetaxamount = exclusivetaxamount;
    }

    /**
    * 获取-1明细，2保险费
    * @return isdetailorpremiums
     */
    public String getIsdetailorpremiums() {
        return isdetailorpremiums;
    }

    /**
    * 设置-1明细，2保险费
    * @paramType java.lang.String
    * @param isdetailorpremiums - 1明细，2保险费
     */
    public void setIsdetailorpremiums(String isdetailorpremiums) {
        this.isdetailorpremiums = isdetailorpremiums;
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
    * 获取-税金金额，保留2位数
    * @return taxamount1
     */
    public BigDecimal getTaxamount1() {
        return taxamount1;
    }

    /**
    * 设置-税金金额，保留2位数
    * @paramType java.math.BigDecimal
    * @param taxamount1 - 税金金额，保留2位数
     */
    public void setTaxamount1(BigDecimal taxamount1) {
        this.taxamount1 = taxamount1;
    }

    /**
    * 获取-原币税金金额，保留2位数
    * @return taxbaseamount1
     */
    public BigDecimal getTaxbaseamount1() {
        return taxbaseamount1;
    }

    /**
    * 设置-原币税金金额，保留2位数
    * @paramType java.math.BigDecimal
    * @param taxbaseamount1 - 原币税金金额，保留2位数
     */
    public void setTaxbaseamount1(BigDecimal taxbaseamount1) {
        this.taxbaseamount1 = taxbaseamount1;
    }

    /**
    * 获取-税金金额，保留2位数
    * @return taxamount
     */
    public BigDecimal getTaxamount() {
        return taxamount;
    }

    /**
    * 设置-税金金额，保留2位数
    * @paramType java.math.BigDecimal
    * @param taxamount - 税金金额，保留2位数
     */
    public void setTaxamount(BigDecimal taxamount) {
        this.taxamount = taxamount;
    }

    /**
    * 获取-原币税金金额，保留2位数
    * @return taxbaseamount
     */
    public BigDecimal getTaxbaseamount() {
        return taxbaseamount;
    }

    /**
    * 设置-原币税金金额，保留2位数
    * @paramType java.math.BigDecimal
    * @param taxbaseamount - 原币税金金额，保留2位数
     */
    public void setTaxbaseamount(BigDecimal taxbaseamount) {
        this.taxbaseamount = taxbaseamount;
    }

    /**
    * 获取-规格型号
    * @return ggxh
     */
    public String getGgxh() {
        return ggxh;
    }

    /**
    * 设置-规格型号
    * @paramType java.lang.String
    * @param ggxh - 规格型号
     */
    public void setGgxh(String ggxh) {
        this.ggxh = ggxh;
    }

    /**
    * 获取-计量单位
    * @return jldw
     */
    public String getJldw() {
        return jldw;
    }

    /**
    * 设置-计量单位
    * @paramType java.lang.String
    * @param jldw - 计量单位
     */
    public void setJldw(String jldw) {
        this.jldw = jldw;
    }

    /**
    * 获取-商品数量
    * @return spsl
     */
    public String getSpsl() {
        return spsl;
    }

    /**
    * 设置-商品数量
    * @paramType java.lang.String
    * @param spsl - 商品数量
     */
    public void setSpsl(String spsl) {
        this.spsl = spsl;
    }
}