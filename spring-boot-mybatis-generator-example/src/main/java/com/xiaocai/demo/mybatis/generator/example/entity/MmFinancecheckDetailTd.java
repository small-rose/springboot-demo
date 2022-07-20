package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_financecheck_detail_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmFinancecheckDetailTd {
    /**
     * 主键
     */
    private String applyno;

    /**
     * 对应业务类型物理主键
     */
    private String applydataid;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 账户对应的财务机构
     */
    private String unitcode;

    /**
     * 部门
     */
    private String departmentcode;

    /**
     * 审核状态(00：待接收，01 处理中，02审核成功，03审核失败）
     */
    private String opstatus;

    /**
     * 类型明细
     */
    private String applytypedetail;

    /**
     * 申请原因
     */
    private String applyreason;

    /**
     * 金额
     */
    private BigDecimal checkamount;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 00：后补附件，01：无需附件
     */
    private String ifattachment;

    /**
     * 后补附件的原因，无需后补附件的原因
     */
    private String attachmentreason;

    /**
     * 当前处理人
     */
    private String currentcheckcode;

    /**
     * 审批结果代码( 00：其他)
     */
    private String resultcode;

    /**
     * 审批结果描述
     */
    private String resultreason;

    /**
     * 催办标示(00初始，01被催办)跨越整个审批流程
     */
    private String pressflag;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 创建日期
     */
    private Date createtime;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 摘要
     */
    private String modifydesc;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 赔案号
     */
    private String claimno;

    /**
     * 支付申请号
     */
    private String paymentno;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 付款户名
     */
    private String payaccountname;

    /**
    * 获取-主键
    * @return applyno
     */
    public String getApplyno() {
        return applyno;
    }

    /**
    * 设置-主键
    * @paramType java.lang.String
    * @param applyno - 主键
     */
    public void setApplyno(String applyno) {
        this.applyno = applyno;
    }

    /**
    * 获取-对应业务类型物理主键
    * @return applydataid
     */
    public String getApplydataid() {
        return applydataid;
    }

    /**
    * 设置-对应业务类型物理主键
    * @paramType java.lang.String
    * @param applydataid - 对应业务类型物理主键
     */
    public void setApplydataid(String applydataid) {
        this.applydataid = applydataid;
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
    * 获取-账户对应的财务机构
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-账户对应的财务机构
    * @paramType java.lang.String
    * @param unitcode - 账户对应的财务机构
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
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
    * 获取-审核状态(00：待接收，01 处理中，02审核成功，03审核失败）
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-审核状态(00：待接收，01 处理中，02审核成功，03审核失败）
    * @paramType java.lang.String
    * @param opstatus - 审核状态(00：待接收，01 处理中，02审核成功，03审核失败）
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
    }

    /**
    * 获取-类型明细
    * @return applytypedetail
     */
    public String getApplytypedetail() {
        return applytypedetail;
    }

    /**
    * 设置-类型明细
    * @paramType java.lang.String
    * @param applytypedetail - 类型明细
     */
    public void setApplytypedetail(String applytypedetail) {
        this.applytypedetail = applytypedetail;
    }

    /**
    * 获取-申请原因
    * @return applyreason
     */
    public String getApplyreason() {
        return applyreason;
    }

    /**
    * 设置-申请原因
    * @paramType java.lang.String
    * @param applyreason - 申请原因
     */
    public void setApplyreason(String applyreason) {
        this.applyreason = applyreason;
    }

    /**
    * 获取-金额
    * @return checkamount
     */
    public BigDecimal getCheckamount() {
        return checkamount;
    }

    /**
    * 设置-金额
    * @paramType java.math.BigDecimal
    * @param checkamount - 金额
     */
    public void setCheckamount(BigDecimal checkamount) {
        this.checkamount = checkamount;
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
    * 获取-00：后补附件，01：无需附件
    * @return ifattachment
     */
    public String getIfattachment() {
        return ifattachment;
    }

    /**
    * 设置-00：后补附件，01：无需附件
    * @paramType java.lang.String
    * @param ifattachment - 00：后补附件，01：无需附件
     */
    public void setIfattachment(String ifattachment) {
        this.ifattachment = ifattachment;
    }

    /**
    * 获取-后补附件的原因，无需后补附件的原因
    * @return attachmentreason
     */
    public String getAttachmentreason() {
        return attachmentreason;
    }

    /**
    * 设置-后补附件的原因，无需后补附件的原因
    * @paramType java.lang.String
    * @param attachmentreason - 后补附件的原因，无需后补附件的原因
     */
    public void setAttachmentreason(String attachmentreason) {
        this.attachmentreason = attachmentreason;
    }

    /**
    * 获取-当前处理人
    * @return currentcheckcode
     */
    public String getCurrentcheckcode() {
        return currentcheckcode;
    }

    /**
    * 设置-当前处理人
    * @paramType java.lang.String
    * @param currentcheckcode - 当前处理人
     */
    public void setCurrentcheckcode(String currentcheckcode) {
        this.currentcheckcode = currentcheckcode;
    }

    /**
    * 获取-审批结果代码( 00：其他)
    * @return resultcode
     */
    public String getResultcode() {
        return resultcode;
    }

    /**
    * 设置-审批结果代码( 00：其他)
    * @paramType java.lang.String
    * @param resultcode - 审批结果代码( 00：其他)
     */
    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    /**
    * 获取-审批结果描述
    * @return resultreason
     */
    public String getResultreason() {
        return resultreason;
    }

    /**
    * 设置-审批结果描述
    * @paramType java.lang.String
    * @param resultreason - 审批结果描述
     */
    public void setResultreason(String resultreason) {
        this.resultreason = resultreason;
    }

    /**
    * 获取-催办标示(00初始，01被催办)跨越整个审批流程
    * @return pressflag
     */
    public String getPressflag() {
        return pressflag;
    }

    /**
    * 设置-催办标示(00初始，01被催办)跨越整个审批流程
    * @paramType java.lang.String
    * @param pressflag - 催办标示(00初始，01被催办)跨越整个审批流程
     */
    public void setPressflag(String pressflag) {
        this.pressflag = pressflag;
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
    * 获取-创建日期
    * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
    * 设置-创建日期
    * @paramType java.util.Date
    * @param createtime - 创建日期
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
    * 获取-摘要
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-摘要
    * @paramType java.lang.String
    * @param modifydesc - 摘要
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
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
    * 获取-支付申请号
    * @return paymentno
     */
    public String getPaymentno() {
        return paymentno;
    }

    /**
    * 设置-支付申请号
    * @paramType java.lang.String
    * @param paymentno - 支付申请号
     */
    public void setPaymentno(String paymentno) {
        this.paymentno = paymentno;
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
    * 获取-付款户名
    * @return payaccountname
     */
    public String getPayaccountname() {
        return payaccountname;
    }

    /**
    * 设置-付款户名
    * @paramType java.lang.String
    * @param payaccountname - 付款户名
     */
    public void setPayaccountname(String payaccountname) {
        this.payaccountname = payaccountname;
    }
}