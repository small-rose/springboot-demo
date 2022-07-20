package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_workplatform_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmWorkplatformTd {
    /**
     * 主键
     */
    private String workid;

    /**
     * 操作员工号
     */
    private String opcode;

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
     * 工作状态(00：待办，01已办）
     */
    private String workstatus;

    /**
     * 重要级别；告知：00、普通：01、加急：02（保费认领）
     */
    private String worklevel;

    /**
     * 对应数据字典表的 worktype
     */
    private String worktype;

    /**
     * 工作台关联id，不同的类型对应不同对方数据的id
     */
    private String workrelationid;

    /**
     * 当前处理人
     */
    private String currentcheckcode;

    /**
     * 描述
     */
    private String workreason;

    /**
     * 工作日
     */
    private Date workdate;

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
     * 工作台关联id对应的数据表
     */
    private String idtable;

    /**
     * 审核级别
     */
    private String checklevel;

    /**
     * 是否后补附件，00后补附件，01无需附件
     */
    private String ifattachment;

    /**
     * 上一条关联工作
     */
    private String preworkid;

    /**
     * 上传附件用的uuid
     */
    private String attachid;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 工作台00通知 01审核 02 上传附件
     */
    private String workplattype;

    /**
     * 对应业务类型物理主键
     */
    private String applydataid;

    /**
     * 审核状态（01待审核 02审核通过 03审核退回）
     */
    private String opstatus;

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
    * @return workid
     */
    public String getWorkid() {
        return workid;
    }

    /**
    * 设置-主键
    * @paramType java.lang.String
    * @param workid - 主键
     */
    public void setWorkid(String workid) {
        this.workid = workid;
    }

    /**
    * 获取-操作员工号
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作员工号
    * @paramType java.lang.String
    * @param opcode - 操作员工号
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
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
    * 获取-工作状态(00：待办，01已办）
    * @return workstatus
     */
    public String getWorkstatus() {
        return workstatus;
    }

    /**
    * 设置-工作状态(00：待办，01已办）
    * @paramType java.lang.String
    * @param workstatus - 工作状态(00：待办，01已办）
     */
    public void setWorkstatus(String workstatus) {
        this.workstatus = workstatus;
    }

    /**
    * 获取-重要级别；告知：00、普通：01、加急：02（保费认领）
    * @return worklevel
     */
    public String getWorklevel() {
        return worklevel;
    }

    /**
    * 设置-重要级别；告知：00、普通：01、加急：02（保费认领）
    * @paramType java.lang.String
    * @param worklevel - 重要级别；告知：00、普通：01、加急：02（保费认领）
     */
    public void setWorklevel(String worklevel) {
        this.worklevel = worklevel;
    }

    /**
    * 获取-对应数据字典表的 worktype
    * @return worktype
     */
    public String getWorktype() {
        return worktype;
    }

    /**
    * 设置-对应数据字典表的 worktype
    * @paramType java.lang.String
    * @param worktype - 对应数据字典表的 worktype
     */
    public void setWorktype(String worktype) {
        this.worktype = worktype;
    }

    /**
    * 获取-工作台关联id，不同的类型对应不同对方数据的id
    * @return workrelationid
     */
    public String getWorkrelationid() {
        return workrelationid;
    }

    /**
    * 设置-工作台关联id，不同的类型对应不同对方数据的id
    * @paramType java.lang.String
    * @param workrelationid - 工作台关联id，不同的类型对应不同对方数据的id
     */
    public void setWorkrelationid(String workrelationid) {
        this.workrelationid = workrelationid;
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
    * 获取-描述
    * @return workreason
     */
    public String getWorkreason() {
        return workreason;
    }

    /**
    * 设置-描述
    * @paramType java.lang.String
    * @param workreason - 描述
     */
    public void setWorkreason(String workreason) {
        this.workreason = workreason;
    }

    /**
    * 获取-工作日
    * @return workdate
     */
    public Date getWorkdate() {
        return workdate;
    }

    /**
    * 设置-工作日
    * @paramType java.util.Date
    * @param workdate - 工作日
     */
    public void setWorkdate(Date workdate) {
        this.workdate = workdate;
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
    * 获取-工作台关联id对应的数据表
    * @return idtable
     */
    public String getIdtable() {
        return idtable;
    }

    /**
    * 设置-工作台关联id对应的数据表
    * @paramType java.lang.String
    * @param idtable - 工作台关联id对应的数据表
     */
    public void setIdtable(String idtable) {
        this.idtable = idtable;
    }

    /**
    * 获取-审核级别
    * @return checklevel
     */
    public String getChecklevel() {
        return checklevel;
    }

    /**
    * 设置-审核级别
    * @paramType java.lang.String
    * @param checklevel - 审核级别
     */
    public void setChecklevel(String checklevel) {
        this.checklevel = checklevel;
    }

    /**
    * 获取-是否后补附件，00后补附件，01无需附件
    * @return ifattachment
     */
    public String getIfattachment() {
        return ifattachment;
    }

    /**
    * 设置-是否后补附件，00后补附件，01无需附件
    * @paramType java.lang.String
    * @param ifattachment - 是否后补附件，00后补附件，01无需附件
     */
    public void setIfattachment(String ifattachment) {
        this.ifattachment = ifattachment;
    }

    /**
    * 获取-上一条关联工作
    * @return preworkid
     */
    public String getPreworkid() {
        return preworkid;
    }

    /**
    * 设置-上一条关联工作
    * @paramType java.lang.String
    * @param preworkid - 上一条关联工作
     */
    public void setPreworkid(String preworkid) {
        this.preworkid = preworkid;
    }

    /**
    * 获取-上传附件用的uuid
    * @return attachid
     */
    public String getAttachid() {
        return attachid;
    }

    /**
    * 设置-上传附件用的uuid
    * @paramType java.lang.String
    * @param attachid - 上传附件用的uuid
     */
    public void setAttachid(String attachid) {
        this.attachid = attachid;
    }

    /**
    * 获取-金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-金额
    * @paramType java.math.BigDecimal
    * @param amount - 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
    * 获取-工作台00通知 01审核 02 上传附件
    * @return workplattype
     */
    public String getWorkplattype() {
        return workplattype;
    }

    /**
    * 设置-工作台00通知 01审核 02 上传附件
    * @paramType java.lang.String
    * @param workplattype - 工作台00通知 01审核 02 上传附件
     */
    public void setWorkplattype(String workplattype) {
        this.workplattype = workplattype;
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
    * 获取-审核状态（01待审核 02审核通过 03审核退回）
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-审核状态（01待审核 02审核通过 03审核退回）
    * @paramType java.lang.String
    * @param opstatus - 审核状态（01待审核 02审核通过 03审核退回）
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
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