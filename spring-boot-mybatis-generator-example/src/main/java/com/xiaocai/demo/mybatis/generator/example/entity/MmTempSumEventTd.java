package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_temp_sum_event_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTempSumEventTd {
    /**
     * 保单号
     */
    private Long policyno;

    /**
     * 保单币种
     */
    private String basecurrencycode;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 总储金
     */
    private BigDecimal totalreserve;

    /**
     * 储金余额
     */
    private BigDecimal reservebalance;

    /**
     * 已收款金额
     */
    private BigDecimal incomereserve;

    /**
     * 退储金额
     */
    private BigDecimal backreserve;

    /**
     * 返还本金金额
     */
    private BigDecimal returnreserve;

    /**
     * 财务机构代码
     */
    private String unitcode;

    /**
     * 代理点代码
     */
    private String agentcode;

    /**
     * 业务险种
     */
    private String classescode;

    /**
     * 业务部门代码
     */
    private String departmentcode;

    /**
     * 起保日期
     */
    private Date startdate;

    /**
     * 终保日期
     */
    private Date enddate;

    /**
     * 客户代码
     */
    private String customername;

    /**
     * 部门名称
     */
    private String departmentname;

    /**
     * 险种名称
     */
    private String classescodename;

    /**
     * 机构名称
     */
    private String unitname;

    /**
    * 获取-保单号
    * @return policyno
     */
    public Long getPolicyno() {
        return policyno;
    }

    /**
    * 设置-保单号
    * @paramType java.lang.Long
    * @param policyno - 保单号
     */
    public void setPolicyno(Long policyno) {
        this.policyno = policyno;
    }

    /**
    * 获取-保单币种
    * @return basecurrencycode
     */
    public String getBasecurrencycode() {
        return basecurrencycode;
    }

    /**
    * 设置-保单币种
    * @paramType java.lang.String
    * @param basecurrencycode - 保单币种
     */
    public void setBasecurrencycode(String basecurrencycode) {
        this.basecurrencycode = basecurrencycode;
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
    * 获取-总储金
    * @return totalreserve
     */
    public BigDecimal getTotalreserve() {
        return totalreserve;
    }

    /**
    * 设置-总储金
    * @paramType java.math.BigDecimal
    * @param totalreserve - 总储金
     */
    public void setTotalreserve(BigDecimal totalreserve) {
        this.totalreserve = totalreserve;
    }

    /**
    * 获取-储金余额
    * @return reservebalance
     */
    public BigDecimal getReservebalance() {
        return reservebalance;
    }

    /**
    * 设置-储金余额
    * @paramType java.math.BigDecimal
    * @param reservebalance - 储金余额
     */
    public void setReservebalance(BigDecimal reservebalance) {
        this.reservebalance = reservebalance;
    }

    /**
    * 获取-已收款金额
    * @return incomereserve
     */
    public BigDecimal getIncomereserve() {
        return incomereserve;
    }

    /**
    * 设置-已收款金额
    * @paramType java.math.BigDecimal
    * @param incomereserve - 已收款金额
     */
    public void setIncomereserve(BigDecimal incomereserve) {
        this.incomereserve = incomereserve;
    }

    /**
    * 获取-退储金额
    * @return backreserve
     */
    public BigDecimal getBackreserve() {
        return backreserve;
    }

    /**
    * 设置-退储金额
    * @paramType java.math.BigDecimal
    * @param backreserve - 退储金额
     */
    public void setBackreserve(BigDecimal backreserve) {
        this.backreserve = backreserve;
    }

    /**
    * 获取-返还本金金额
    * @return returnreserve
     */
    public BigDecimal getReturnreserve() {
        return returnreserve;
    }

    /**
    * 设置-返还本金金额
    * @paramType java.math.BigDecimal
    * @param returnreserve - 返还本金金额
     */
    public void setReturnreserve(BigDecimal returnreserve) {
        this.returnreserve = returnreserve;
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
    * 获取-代理点代码
    * @return agentcode
     */
    public String getAgentcode() {
        return agentcode;
    }

    /**
    * 设置-代理点代码
    * @paramType java.lang.String
    * @param agentcode - 代理点代码
     */
    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode;
    }

    /**
    * 获取-业务险种
    * @return classescode
     */
    public String getClassescode() {
        return classescode;
    }

    /**
    * 设置-业务险种
    * @paramType java.lang.String
    * @param classescode - 业务险种
     */
    public void setClassescode(String classescode) {
        this.classescode = classescode;
    }

    /**
    * 获取-业务部门代码
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-业务部门代码
    * @paramType java.lang.String
    * @param departmentcode - 业务部门代码
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
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
    * 获取-终保日期
    * @return enddate
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
    * 设置-终保日期
    * @paramType java.util.Date
    * @param enddate - 终保日期
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
    * 获取-客户代码
    * @return customername
     */
    public String getCustomername() {
        return customername;
    }

    /**
    * 设置-客户代码
    * @paramType java.lang.String
    * @param customername - 客户代码
     */
    public void setCustomername(String customername) {
        this.customername = customername;
    }

    /**
    * 获取-部门名称
    * @return departmentname
     */
    public String getDepartmentname() {
        return departmentname;
    }

    /**
    * 设置-部门名称
    * @paramType java.lang.String
    * @param departmentname - 部门名称
     */
    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    /**
    * 获取-险种名称
    * @return classescodename
     */
    public String getClassescodename() {
        return classescodename;
    }

    /**
    * 设置-险种名称
    * @paramType java.lang.String
    * @param classescodename - 险种名称
     */
    public void setClassescodename(String classescodename) {
        this.classescodename = classescodename;
    }

    /**
    * 获取-机构名称
    * @return unitname
     */
    public String getUnitname() {
        return unitname;
    }

    /**
    * 设置-机构名称
    * @paramType java.lang.String
    * @param unitname - 机构名称
     */
    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }
}