package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_financecheckprocess_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmFinancecheckprocessTd {
    /**
     * 主键
     */
    private Long processid;

    /**
     * 申请号
     */
    private String applyno;

    /**
     * 对应申请数据物理主键
     */
    private String applydataid;

    /**
     * 申请人代码
     */
    private String applycode;

    /**
     * 申请人名称
     */
    private String applyname;

    /**
     * 申请日期
     */
    private Date applydate;

    /**
     * 申请类型
     */
    private String applytype;

    /**
     * 申请类型明细
     */
    private String applytypedetail;

    /**
     * 工作台ID
     */
    private String workid;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 机构
     */
    private String unitcode;

    /**
     * 部门
     */
    private String departmentcode;

    /**
     * 审核状态(01待审核 02审核通过 03审核退回)
     */
    private String opstatus;

    /**
     * 申请原因
     */
    private String applyreason;

    /**
     * 金额
     */
    private BigDecimal checkamount;

    /**
     * 层级
     */
    private String checklevel;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 是否后补附件
     */
    private String ifattachment;

    /**
     * 附件代码
     */
    private String attachmentcode;

    /**
     * 附件原因
     */
    private String attachmentreason;

    /**
     * 当前审核人
     */
    private String currentcheckcode;

    /**
     * 审核结果代码
     */
    private String resultcode;

    /**
     * 审核结果
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
     * 创建时间
     */
    private Date createtime;

    /**
     * 最后一次操作时间
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
     * 审核时间
     */
    private Date checktime;

    /**
     * 审核次数
     */
    private BigDecimal checktimes;

    /**
     * 上一次审核时间
     */
    private Date prechecktime;

    /**
     *  A0:网址登录；A2：p13登录；A3：移动端登录；A4：移动端p13登录
     */
    private String optype;

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
     * 岗位权限，若多个用英文逗号隔开
     */
    private String powerrole;

    /**
     * 机构权限
     */
    private String powerunit;

    /**
    * 获取-主键
    * @return processid
     */
    public Long getProcessid() {
        return processid;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param processid - 主键
     */
    public void setProcessid(Long processid) {
        this.processid = processid;
    }

    /**
    * 获取-申请号
    * @return applyno
     */
    public String getApplyno() {
        return applyno;
    }

    /**
    * 设置-申请号
    * @paramType java.lang.String
    * @param applyno - 申请号
     */
    public void setApplyno(String applyno) {
        this.applyno = applyno;
    }

    /**
    * 获取-对应申请数据物理主键
    * @return applydataid
     */
    public String getApplydataid() {
        return applydataid;
    }

    /**
    * 设置-对应申请数据物理主键
    * @paramType java.lang.String
    * @param applydataid - 对应申请数据物理主键
     */
    public void setApplydataid(String applydataid) {
        this.applydataid = applydataid;
    }

    /**
    * 获取-申请人代码
    * @return applycode
     */
    public String getApplycode() {
        return applycode;
    }

    /**
    * 设置-申请人代码
    * @paramType java.lang.String
    * @param applycode - 申请人代码
     */
    public void setApplycode(String applycode) {
        this.applycode = applycode;
    }

    /**
    * 获取-申请人名称
    * @return applyname
     */
    public String getApplyname() {
        return applyname;
    }

    /**
    * 设置-申请人名称
    * @paramType java.lang.String
    * @param applyname - 申请人名称
     */
    public void setApplyname(String applyname) {
        this.applyname = applyname;
    }

    /**
    * 获取-申请日期
    * @return applydate
     */
    public Date getApplydate() {
        return applydate;
    }

    /**
    * 设置-申请日期
    * @paramType java.util.Date
    * @param applydate - 申请日期
     */
    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    /**
    * 获取-申请类型
    * @return applytype
     */
    public String getApplytype() {
        return applytype;
    }

    /**
    * 设置-申请类型
    * @paramType java.lang.String
    * @param applytype - 申请类型
     */
    public void setApplytype(String applytype) {
        this.applytype = applytype;
    }

    /**
    * 获取-申请类型明细
    * @return applytypedetail
     */
    public String getApplytypedetail() {
        return applytypedetail;
    }

    /**
    * 设置-申请类型明细
    * @paramType java.lang.String
    * @param applytypedetail - 申请类型明细
     */
    public void setApplytypedetail(String applytypedetail) {
        this.applytypedetail = applytypedetail;
    }

    /**
    * 获取-工作台ID
    * @return workid
     */
    public String getWorkid() {
        return workid;
    }

    /**
    * 设置-工作台ID
    * @paramType java.lang.String
    * @param workid - 工作台ID
     */
    public void setWorkid(String workid) {
        this.workid = workid;
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
    * 获取-机构
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-机构
    * @paramType java.lang.String
    * @param unitcode - 机构
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
    * 获取-审核状态(01待审核 02审核通过 03审核退回)
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-审核状态(01待审核 02审核通过 03审核退回)
    * @paramType java.lang.String
    * @param opstatus - 审核状态(01待审核 02审核通过 03审核退回)
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
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
    * 获取-层级
    * @return checklevel
     */
    public String getChecklevel() {
        return checklevel;
    }

    /**
    * 设置-层级
    * @paramType java.lang.String
    * @param checklevel - 层级
     */
    public void setChecklevel(String checklevel) {
        this.checklevel = checklevel;
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
    * 获取-是否后补附件
    * @return ifattachment
     */
    public String getIfattachment() {
        return ifattachment;
    }

    /**
    * 设置-是否后补附件
    * @paramType java.lang.String
    * @param ifattachment - 是否后补附件
     */
    public void setIfattachment(String ifattachment) {
        this.ifattachment = ifattachment;
    }

    /**
    * 获取-附件代码
    * @return attachmentcode
     */
    public String getAttachmentcode() {
        return attachmentcode;
    }

    /**
    * 设置-附件代码
    * @paramType java.lang.String
    * @param attachmentcode - 附件代码
     */
    public void setAttachmentcode(String attachmentcode) {
        this.attachmentcode = attachmentcode;
    }

    /**
    * 获取-附件原因
    * @return attachmentreason
     */
    public String getAttachmentreason() {
        return attachmentreason;
    }

    /**
    * 设置-附件原因
    * @paramType java.lang.String
    * @param attachmentreason - 附件原因
     */
    public void setAttachmentreason(String attachmentreason) {
        this.attachmentreason = attachmentreason;
    }

    /**
    * 获取-当前审核人
    * @return currentcheckcode
     */
    public String getCurrentcheckcode() {
        return currentcheckcode;
    }

    /**
    * 设置-当前审核人
    * @paramType java.lang.String
    * @param currentcheckcode - 当前审核人
     */
    public void setCurrentcheckcode(String currentcheckcode) {
        this.currentcheckcode = currentcheckcode;
    }

    /**
    * 获取-审核结果代码
    * @return resultcode
     */
    public String getResultcode() {
        return resultcode;
    }

    /**
    * 设置-审核结果代码
    * @paramType java.lang.String
    * @param resultcode - 审核结果代码
     */
    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    /**
    * 获取-审核结果
    * @return resultreason
     */
    public String getResultreason() {
        return resultreason;
    }

    /**
    * 设置-审核结果
    * @paramType java.lang.String
    * @param resultreason - 审核结果
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
    * 获取-创建时间
    * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
    * 设置-创建时间
    * @paramType java.util.Date
    * @param createtime - 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
    * 获取-最后一次操作时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后一次操作时间
    * @paramType java.util.Date
    * @param lastopdate - 最后一次操作时间
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
    * 获取-审核时间
    * @return checktime
     */
    public Date getChecktime() {
        return checktime;
    }

    /**
    * 设置-审核时间
    * @paramType java.util.Date
    * @param checktime - 审核时间
     */
    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    /**
    * 获取-审核次数
    * @return checktimes
     */
    public BigDecimal getChecktimes() {
        return checktimes;
    }

    /**
    * 设置-审核次数
    * @paramType java.math.BigDecimal
    * @param checktimes - 审核次数
     */
    public void setChecktimes(BigDecimal checktimes) {
        this.checktimes = checktimes;
    }

    /**
    * 获取-上一次审核时间
    * @return prechecktime
     */
    public Date getPrechecktime() {
        return prechecktime;
    }

    /**
    * 设置-上一次审核时间
    * @paramType java.util.Date
    * @param prechecktime - 上一次审核时间
     */
    public void setPrechecktime(Date prechecktime) {
        this.prechecktime = prechecktime;
    }

    /**
    * 获取- A0:网址登录；A2：p13登录；A3：移动端登录；A4：移动端p13登录
    * @return optype
     */
    public String getOptype() {
        return optype;
    }

    /**
    * 设置- A0:网址登录；A2：p13登录；A3：移动端登录；A4：移动端p13登录
    * @paramType java.lang.String
    * @param optype -  A0:网址登录；A2：p13登录；A3：移动端登录；A4：移动端p13登录
     */
    public void setOptype(String optype) {
        this.optype = optype;
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

    /**
    * 获取-岗位权限，若多个用英文逗号隔开
    * @return powerrole
     */
    public String getPowerrole() {
        return powerrole;
    }

    /**
    * 设置-岗位权限，若多个用英文逗号隔开
    * @paramType java.lang.String
    * @param powerrole - 岗位权限，若多个用英文逗号隔开
     */
    public void setPowerrole(String powerrole) {
        this.powerrole = powerrole;
    }

    /**
    * 获取-机构权限
    * @return powerunit
     */
    public String getPowerunit() {
        return powerunit;
    }

    /**
    * 设置-机构权限
    * @paramType java.lang.String
    * @param powerunit - 机构权限
     */
    public void setPowerunit(String powerunit) {
        this.powerunit = powerunit;
    }
}