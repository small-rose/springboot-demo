package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_department_taxtype_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmDepartmentTaxtypeTc {
    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 部门
     */
    private String departmentcode;

    /**
     * 申报方式
     */
    private String createtype;

    /**
     * 申报日期
     */
    private Date opdate;

    /**
     * 是否生效 0否 1是
     */
    private String ifvalid;

    /**
     * 备注
     */
    private String remark;

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
    * 获取-申报方式
    * @return createtype
     */
    public String getCreatetype() {
        return createtype;
    }

    /**
    * 设置-申报方式
    * @paramType java.lang.String
    * @param createtype - 申报方式
     */
    public void setCreatetype(String createtype) {
        this.createtype = createtype;
    }

    /**
    * 获取-申报日期
    * @return opdate
     */
    public Date getOpdate() {
        return opdate;
    }

    /**
    * 设置-申报日期
    * @paramType java.util.Date
    * @param opdate - 申报日期
     */
    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }

    /**
    * 获取-是否生效 0否 1是
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否生效 0否 1是
    * @paramType java.lang.String
    * @param ifvalid - 是否生效 0否 1是
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
    }

    /**
    * 获取-备注
    * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param remark - 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}