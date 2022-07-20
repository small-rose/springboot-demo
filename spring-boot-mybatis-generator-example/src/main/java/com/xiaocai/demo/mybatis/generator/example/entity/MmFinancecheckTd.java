package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_financecheck_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmFinancecheckTd {
    /**
     * 主键
     */
    private String applyno;

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
     * 是否后补附件（00后补附件 01无需后补附件02有附件）
     */
    private String ifattachment;

    /**
     * 附件代码
     */
    private String attachmentcode;

    /**
     * 申请状态（00：未处理，01部分 处理，02已处理 ）
     */
    private String opstatus;

    /**
     * 部门代码
     */
    private String departmentcode;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 总条数
     */
    private Long totalcount;

    /**
     * 总金额
     */
    private BigDecimal totalamount;

    /**
     * 成功条数
     */
    private Long successcount;

    /**
     * 成功金额
     */
    private BigDecimal successmount;

    /**
     * 失败条数
     */
    private Long failcount;

    /**
     * 失败金额
     */
    private BigDecimal failamount;

    /**
     * 审核层级
     */
    private String checklevel;

    /**
     * 申请类型
     */
    private String applytype;

    /**
     * 流程类型
     */
    private String processtype;

    /**
     * 下个审核人
     */
    private String currentcheckcode;

    /**
     * 审核代码
     */
    private String resultcode;

    /**
     * 审核原因
     */
    private String resultreason;

    /**
     * 催办标识
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
     * 上一次操作时间
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
     * 审核次数
     */
    private BigDecimal checktimes;

    /**
     *  A0:网址登录；A2：p13登录；A3：移动端登录；A4：移动端p13登录
     */
    private String optype;

    /**
     * 数据来源（用于后面的层级是否需要数据来源区分岗位）
     */
    private String datasource;

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
    * 获取-是否后补附件（00后补附件 01无需后补附件02有附件）
    * @return ifattachment
     */
    public String getIfattachment() {
        return ifattachment;
    }

    /**
    * 设置-是否后补附件（00后补附件 01无需后补附件02有附件）
    * @paramType java.lang.String
    * @param ifattachment - 是否后补附件（00后补附件 01无需后补附件02有附件）
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
    * 获取-申请状态（00：未处理，01部分 处理，02已处理 ）
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-申请状态（00：未处理，01部分 处理，02已处理 ）
    * @paramType java.lang.String
    * @param opstatus - 申请状态（00：未处理，01部分 处理，02已处理 ）
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
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
    * 获取-总条数
    * @return totalcount
     */
    public Long getTotalcount() {
        return totalcount;
    }

    /**
    * 设置-总条数
    * @paramType java.lang.Long
    * @param totalcount - 总条数
     */
    public void setTotalcount(Long totalcount) {
        this.totalcount = totalcount;
    }

    /**
    * 获取-总金额
    * @return totalamount
     */
    public BigDecimal getTotalamount() {
        return totalamount;
    }

    /**
    * 设置-总金额
    * @paramType java.math.BigDecimal
    * @param totalamount - 总金额
     */
    public void setTotalamount(BigDecimal totalamount) {
        this.totalamount = totalamount;
    }

    /**
    * 获取-成功条数
    * @return successcount
     */
    public Long getSuccesscount() {
        return successcount;
    }

    /**
    * 设置-成功条数
    * @paramType java.lang.Long
    * @param successcount - 成功条数
     */
    public void setSuccesscount(Long successcount) {
        this.successcount = successcount;
    }

    /**
    * 获取-成功金额
    * @return successmount
     */
    public BigDecimal getSuccessmount() {
        return successmount;
    }

    /**
    * 设置-成功金额
    * @paramType java.math.BigDecimal
    * @param successmount - 成功金额
     */
    public void setSuccessmount(BigDecimal successmount) {
        this.successmount = successmount;
    }

    /**
    * 获取-失败条数
    * @return failcount
     */
    public Long getFailcount() {
        return failcount;
    }

    /**
    * 设置-失败条数
    * @paramType java.lang.Long
    * @param failcount - 失败条数
     */
    public void setFailcount(Long failcount) {
        this.failcount = failcount;
    }

    /**
    * 获取-失败金额
    * @return failamount
     */
    public BigDecimal getFailamount() {
        return failamount;
    }

    /**
    * 设置-失败金额
    * @paramType java.math.BigDecimal
    * @param failamount - 失败金额
     */
    public void setFailamount(BigDecimal failamount) {
        this.failamount = failamount;
    }

    /**
    * 获取-审核层级
    * @return checklevel
     */
    public String getChecklevel() {
        return checklevel;
    }

    /**
    * 设置-审核层级
    * @paramType java.lang.String
    * @param checklevel - 审核层级
     */
    public void setChecklevel(String checklevel) {
        this.checklevel = checklevel;
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
    * 获取-流程类型
    * @return processtype
     */
    public String getProcesstype() {
        return processtype;
    }

    /**
    * 设置-流程类型
    * @paramType java.lang.String
    * @param processtype - 流程类型
     */
    public void setProcesstype(String processtype) {
        this.processtype = processtype;
    }

    /**
    * 获取-下个审核人
    * @return currentcheckcode
     */
    public String getCurrentcheckcode() {
        return currentcheckcode;
    }

    /**
    * 设置-下个审核人
    * @paramType java.lang.String
    * @param currentcheckcode - 下个审核人
     */
    public void setCurrentcheckcode(String currentcheckcode) {
        this.currentcheckcode = currentcheckcode;
    }

    /**
    * 获取-审核代码
    * @return resultcode
     */
    public String getResultcode() {
        return resultcode;
    }

    /**
    * 设置-审核代码
    * @paramType java.lang.String
    * @param resultcode - 审核代码
     */
    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    /**
    * 获取-审核原因
    * @return resultreason
     */
    public String getResultreason() {
        return resultreason;
    }

    /**
    * 设置-审核原因
    * @paramType java.lang.String
    * @param resultreason - 审核原因
     */
    public void setResultreason(String resultreason) {
        this.resultreason = resultreason;
    }

    /**
    * 获取-催办标识
    * @return pressflag
     */
    public String getPressflag() {
        return pressflag;
    }

    /**
    * 设置-催办标识
    * @paramType java.lang.String
    * @param pressflag - 催办标识
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
    * 获取-上一次操作时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-上一次操作时间
    * @paramType java.util.Date
    * @param lastopdate - 上一次操作时间
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
    * 获取-数据来源（用于后面的层级是否需要数据来源区分岗位）
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-数据来源（用于后面的层级是否需要数据来源区分岗位）
    * @paramType java.lang.String
    * @param datasource - 数据来源（用于后面的层级是否需要数据来源区分岗位）
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }
}