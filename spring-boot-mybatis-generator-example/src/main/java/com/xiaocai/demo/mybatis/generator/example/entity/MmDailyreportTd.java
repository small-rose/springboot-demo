package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_dailyreport_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmDailyreportTd {
    /**
     * 日结单号
     */
    private String dailyauditno;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 财务机构代码
     */
    private String unitcode;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 日结日期
     */
    private Date checkdate;

    /**
     * 复核日期
     */
    private Date auditdate;

    /**
     * 操作员代码
     */
    private String opcode;

    /**
     * 操作员名称
     */
    private String opname;

    /**
     * 日结员代码
     */
    private String checkercode;

    /**
     * 日结员名称
     */
    private String checkername;

    /**
     * 复核人代码
     */
    private String auditercode;

    /**
     * 复核人名称
     */
    private String auditername;

    /**
     * 日结单类型
     */
    private String reportkind;

    /**
     *  2 日结 4 日结复核
     */
    private String reportstatus;

    /**
     * P07财务(00 准备发送;11 正在发送;12 发送完成;A2 发送错误) webservice(00 初始化状态;10  进入准备处理队列;11 已发送;12 已接受;99 正常处理完毕;Z0 数;Z1数据发送错误;Z2 数据写错误;ZZ 错误)
     */
    private String transtoacc;

    /**
     * 0 未传送至业务系统 1 正在传送至业务系统 2 已传送至业务系统
     */
    private String transtobusiness;

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
     * 操作日期
     */
    private Date opdate;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 日结单是否合并过：ismerged=0，未合并；ismerged=1，合并过
     */
    private String ismerged;

    /**
    * 获取-日结单号
    * @return dailyauditno
     */
    public String getDailyauditno() {
        return dailyauditno;
    }

    /**
    * 设置-日结单号
    * @paramType java.lang.String
    * @param dailyauditno - 日结单号
     */
    public void setDailyauditno(String dailyauditno) {
        this.dailyauditno = dailyauditno;
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
    * 获取-日结日期
    * @return checkdate
     */
    public Date getCheckdate() {
        return checkdate;
    }

    /**
    * 设置-日结日期
    * @paramType java.util.Date
    * @param checkdate - 日结日期
     */
    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    /**
    * 获取-复核日期
    * @return auditdate
     */
    public Date getAuditdate() {
        return auditdate;
    }

    /**
    * 设置-复核日期
    * @paramType java.util.Date
    * @param auditdate - 复核日期
     */
    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
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
    * 获取-操作员名称
    * @return opname
     */
    public String getOpname() {
        return opname;
    }

    /**
    * 设置-操作员名称
    * @paramType java.lang.String
    * @param opname - 操作员名称
     */
    public void setOpname(String opname) {
        this.opname = opname;
    }

    /**
    * 获取-日结员代码
    * @return checkercode
     */
    public String getCheckercode() {
        return checkercode;
    }

    /**
    * 设置-日结员代码
    * @paramType java.lang.String
    * @param checkercode - 日结员代码
     */
    public void setCheckercode(String checkercode) {
        this.checkercode = checkercode;
    }

    /**
    * 获取-日结员名称
    * @return checkername
     */
    public String getCheckername() {
        return checkername;
    }

    /**
    * 设置-日结员名称
    * @paramType java.lang.String
    * @param checkername - 日结员名称
     */
    public void setCheckername(String checkername) {
        this.checkername = checkername;
    }

    /**
    * 获取-复核人代码
    * @return auditercode
     */
    public String getAuditercode() {
        return auditercode;
    }

    /**
    * 设置-复核人代码
    * @paramType java.lang.String
    * @param auditercode - 复核人代码
     */
    public void setAuditercode(String auditercode) {
        this.auditercode = auditercode;
    }

    /**
    * 获取-复核人名称
    * @return auditername
     */
    public String getAuditername() {
        return auditername;
    }

    /**
    * 设置-复核人名称
    * @paramType java.lang.String
    * @param auditername - 复核人名称
     */
    public void setAuditername(String auditername) {
        this.auditername = auditername;
    }

    /**
    * 获取-日结单类型
    * @return reportkind
     */
    public String getReportkind() {
        return reportkind;
    }

    /**
    * 设置-日结单类型
    * @paramType java.lang.String
    * @param reportkind - 日结单类型
     */
    public void setReportkind(String reportkind) {
        this.reportkind = reportkind;
    }

    /**
    * 获取- 2 日结 4 日结复核
    * @return reportstatus
     */
    public String getReportstatus() {
        return reportstatus;
    }

    /**
    * 设置- 2 日结 4 日结复核
    * @paramType java.lang.String
    * @param reportstatus -  2 日结 4 日结复核
     */
    public void setReportstatus(String reportstatus) {
        this.reportstatus = reportstatus;
    }

    /**
    * 获取-P07财务(00 准备发送;11 正在发送;12 发送完成;A2 发送错误) webservice(00 初始化状态;10  进入准备处理队列;11 已发送;12 已接受;99 正常处理完毕;Z0 数;Z1数据发送错误;Z2 数据写错误;ZZ 错误)
    * @return transtoacc
     */
    public String getTranstoacc() {
        return transtoacc;
    }

    /**
    * 设置-P07财务(00 准备发送;11 正在发送;12 发送完成;A2 发送错误) webservice(00 初始化状态;10  进入准备处理队列;11 已发送;12 已接受;99 正常处理完毕;Z0 数;Z1数据发送错误;Z2 数据写错误;ZZ 错误)
    * @paramType java.lang.String
    * @param transtoacc - P07财务(00 准备发送;11 正在发送;12 发送完成;A2 发送错误) webservice(00 初始化状态;10  进入准备处理队列;11 已发送;12 已接受;99 正常处理完毕;Z0 数;Z1数据发送错误;Z2 数据写错误;ZZ 错误)
     */
    public void setTranstoacc(String transtoacc) {
        this.transtoacc = transtoacc;
    }

    /**
    * 获取-0 未传送至业务系统 1 正在传送至业务系统 2 已传送至业务系统
    * @return transtobusiness
     */
    public String getTranstobusiness() {
        return transtobusiness;
    }

    /**
    * 设置-0 未传送至业务系统 1 正在传送至业务系统 2 已传送至业务系统
    * @paramType java.lang.String
    * @param transtobusiness - 0 未传送至业务系统 1 正在传送至业务系统 2 已传送至业务系统
     */
    public void setTranstobusiness(String transtobusiness) {
        this.transtobusiness = transtobusiness;
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
    * 获取-日结单是否合并过：ismerged=0，未合并；ismerged=1，合并过
    * @return ismerged
     */
    public String getIsmerged() {
        return ismerged;
    }

    /**
    * 设置-日结单是否合并过：ismerged=0，未合并；ismerged=1，合并过
    * @paramType java.lang.String
    * @param ismerged - 日结单是否合并过：ismerged=0，未合并；ismerged=1，合并过
     */
    public void setIsmerged(String ismerged) {
        this.ismerged = ismerged;
    }
}