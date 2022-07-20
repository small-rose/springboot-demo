package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_taxconfirmdetail_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTaxconfirmdetailTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 财务机构代码
     */
    private String unitcode;

    /**
     * 部门代码
     */
    private String departmentcode;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 业务类型1
     */
    private String businessone;

    /**
     * 业务类型2
     */
    private String businesstwo;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 原币币种
     */
    private String basecurrencycode;

    /**
     * 税额
     */
    private BigDecimal taxesamount;

    /**
     * 原币税额
     */
    private BigDecimal basetaxesamount;

    /**
     * 汇率
     */
    private BigDecimal exchangerate;

    /**
     * 税率
     */
    private BigDecimal taxesrate;

    /**
     * 险种名称
     */
    private String classescode;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 税金类型：1销项税,2进项税
     */
    private BigDecimal taxtype;

    /**
     * 数据来源
     */
    private String datasource;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

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
     * 保单生效申报记录mm_policy_events_td的listno，发票申报记录mm_invoicedetail_td的id
     */
    private String sourceno;

    /**
     * 结转类型：1保单生效结转，2发票结转
     */
    private String confirmtype;

    /**
     * 展业方式
     */
    private String businesschannel;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 客户代码
     */
    private String customercode;

    /**
     * 是否结转标示: 0未结转，1已结转
     */
    private String confirmstatus;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 业务类型1对应业务表主键
     */
    private BigDecimal newno;

    /**
     * 业务类型2对应业务表主键
     */
    private BigDecimal oldno;

    /**
     * 业务属性(1保单 4车船税)
     */
    private String businessattr;

    /**
     * 起保日期
     */
    private Date startdate;

    /**
     * 签单日期
     */
    private Date signdate;

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
    * 获取-财务机构代码
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-财务机构代码
    * @paramType java.lang.String
    * @param unitcode - 财务机构代码
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    /**
    * 获取-部门代码
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-部门代码
    * @paramType java.lang.String
    * @param departmentcode - 部门代码
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
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
    * 获取-业务类型1
    * @return businessone
     */
    public String getBusinessone() {
        return businessone;
    }

    /**
    * 设置-业务类型1
    * @paramType java.lang.String
    * @param businessone - 业务类型1
     */
    public void setBusinessone(String businessone) {
        this.businessone = businessone;
    }

    /**
    * 获取-业务类型2
    * @return businesstwo
     */
    public String getBusinesstwo() {
        return businesstwo;
    }

    /**
    * 设置-业务类型2
    * @paramType java.lang.String
    * @param businesstwo - 业务类型2
     */
    public void setBusinesstwo(String businesstwo) {
        this.businesstwo = businesstwo;
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
    * 获取-税额
    * @return taxesamount
     */
    public BigDecimal getTaxesamount() {
        return taxesamount;
    }

    /**
    * 设置-税额
    * @paramType java.math.BigDecimal
    * @param taxesamount - 税额
     */
    public void setTaxesamount(BigDecimal taxesamount) {
        this.taxesamount = taxesamount;
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
    * 获取-税金类型：1销项税,2进项税
    * @return taxtype
     */
    public BigDecimal getTaxtype() {
        return taxtype;
    }

    /**
    * 设置-税金类型：1销项税,2进项税
    * @paramType java.math.BigDecimal
    * @param taxtype - 税金类型：1销项税,2进项税
     */
    public void setTaxtype(BigDecimal taxtype) {
        this.taxtype = taxtype;
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
    * 获取-保单生效申报记录mm_policy_events_td的listno，发票申报记录mm_invoicedetail_td的id
    * @return sourceno
     */
    public String getSourceno() {
        return sourceno;
    }

    /**
    * 设置-保单生效申报记录mm_policy_events_td的listno，发票申报记录mm_invoicedetail_td的id
    * @paramType java.lang.String
    * @param sourceno - 保单生效申报记录mm_policy_events_td的listno，发票申报记录mm_invoicedetail_td的id
     */
    public void setSourceno(String sourceno) {
        this.sourceno = sourceno;
    }

    /**
    * 获取-结转类型：1保单生效结转，2发票结转
    * @return confirmtype
     */
    public String getConfirmtype() {
        return confirmtype;
    }

    /**
    * 设置-结转类型：1保单生效结转，2发票结转
    * @paramType java.lang.String
    * @param confirmtype - 结转类型：1保单生效结转，2发票结转
     */
    public void setConfirmtype(String confirmtype) {
        this.confirmtype = confirmtype;
    }

    /**
    * 获取-展业方式
    * @return businesschannel
     */
    public String getBusinesschannel() {
        return businesschannel;
    }

    /**
    * 设置-展业方式
    * @paramType java.lang.String
    * @param businesschannel - 展业方式
     */
    public void setBusinesschannel(String businesschannel) {
        this.businesschannel = businesschannel;
    }

    /**
    * 获取-客户名称
    * @return customername
     */
    public String getCustomername() {
        return customername;
    }

    /**
    * 设置-客户名称
    * @paramType java.lang.String
    * @param customername - 客户名称
     */
    public void setCustomername(String customername) {
        this.customername = customername;
    }

    /**
    * 获取-客户代码
    * @return customercode
     */
    public String getCustomercode() {
        return customercode;
    }

    /**
    * 设置-客户代码
    * @paramType java.lang.String
    * @param customercode - 客户代码
     */
    public void setCustomercode(String customercode) {
        this.customercode = customercode;
    }

    /**
    * 获取-是否结转标示: 0未结转，1已结转
    * @return confirmstatus
     */
    public String getConfirmstatus() {
        return confirmstatus;
    }

    /**
    * 设置-是否结转标示: 0未结转，1已结转
    * @paramType java.lang.String
    * @param confirmstatus - 是否结转标示: 0未结转，1已结转
     */
    public void setConfirmstatus(String confirmstatus) {
        this.confirmstatus = confirmstatus;
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
    * 获取-业务类型1对应业务表主键
    * @return newno
     */
    public BigDecimal getNewno() {
        return newno;
    }

    /**
    * 设置-业务类型1对应业务表主键
    * @paramType java.math.BigDecimal
    * @param newno - 业务类型1对应业务表主键
     */
    public void setNewno(BigDecimal newno) {
        this.newno = newno;
    }

    /**
    * 获取-业务类型2对应业务表主键
    * @return oldno
     */
    public BigDecimal getOldno() {
        return oldno;
    }

    /**
    * 设置-业务类型2对应业务表主键
    * @paramType java.math.BigDecimal
    * @param oldno - 业务类型2对应业务表主键
     */
    public void setOldno(BigDecimal oldno) {
        this.oldno = oldno;
    }

    /**
    * 获取-业务属性(1保单 4车船税)
    * @return businessattr
     */
    public String getBusinessattr() {
        return businessattr;
    }

    /**
    * 设置-业务属性(1保单 4车船税)
    * @paramType java.lang.String
    * @param businessattr - 业务属性(1保单 4车船税)
     */
    public void setBusinessattr(String businessattr) {
        this.businessattr = businessattr;
    }

    /**
    * 获取-起保日期
    * @return startdate
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
    * 设置-起保日期
    * @paramType java.util.Date
    * @param startdate - 起保日期
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
    * 获取-签单日期
    * @return signdate
     */
    public Date getSigndate() {
        return signdate;
    }

    /**
    * 设置-签单日期
    * @paramType java.util.Date
    * @param signdate - 签单日期
     */
    public void setSigndate(Date signdate) {
        this.signdate = signdate;
    }
}