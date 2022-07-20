package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_department_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmDepartmentTc {
    /**
     * 部门代码
     */
    private String departmentcode;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 保险公司原来的部门代码
     */
    private String realldept;

    /**
     * 业务部门名称
     */
    private String departmentname;

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
     * 传真
     */
    private String fax;

    /**
     * 邮编
     */
    private String postcode;

    /**
     * 客户服务电话
     */
    private String servicephone;

    /**
     * 固定电话
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 纳税人识别号
     */
    private String taxpayerid;

    /**
     * 组织结构代码，bm.org_num
     */
    private String orgcode;

    /**
     * 部门组代码，bm.bmzdm
     */
    private String deptgroupcode;

    /**
     * 0未生效，1生效，默认生效
     */
    private String ifvalid;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 组织结构名称
     */
    private String orgname;

    /**
     * 1.未更新分公司代码  2.已更新
     */
    private String status;

    /**
     * 县区级保险机构办理地税税务登记时，地税机关给与的管理编码
     */
    private String taxmanagementcode;

    /**
     * 部门组名称
     */
    private String deptgroupname;

    /**
     * 父机构代码
     */
    private String fathercode;

    /**
     * 机构级别
     */
    private BigDecimal levels;

    /**
     * 是否是分公司 0否 1是
     */
    private String issubcompany;

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
    * 获取-保险公司原来的部门代码
    * @return realldept
     */
    public String getRealldept() {
        return realldept;
    }

    /**
    * 设置-保险公司原来的部门代码
    * @paramType java.lang.String
    * @param realldept - 保险公司原来的部门代码
     */
    public void setRealldept(String realldept) {
        this.realldept = realldept;
    }

    /**
    * 获取-业务部门名称
    * @return departmentname
     */
    public String getDepartmentname() {
        return departmentname;
    }

    /**
    * 设置-业务部门名称
    * @paramType java.lang.String
    * @param departmentname - 业务部门名称
     */
    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
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
    * 获取-传真
    * @return fax
     */
    public String getFax() {
        return fax;
    }

    /**
    * 设置-传真
    * @paramType java.lang.String
    * @param fax - 传真
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
    * 获取-邮编
    * @return postcode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
    * 设置-邮编
    * @paramType java.lang.String
    * @param postcode - 邮编
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
    * 获取-客户服务电话
    * @return servicephone
     */
    public String getServicephone() {
        return servicephone;
    }

    /**
    * 设置-客户服务电话
    * @paramType java.lang.String
    * @param servicephone - 客户服务电话
     */
    public void setServicephone(String servicephone) {
        this.servicephone = servicephone;
    }

    /**
    * 获取-固定电话
    * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
    * 设置-固定电话
    * @paramType java.lang.String
    * @param phone - 固定电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
    * 获取-地址
    * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
    * 设置-地址
    * @paramType java.lang.String
    * @param address - 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
    * 获取-纳税人识别号
    * @return taxpayerid
     */
    public String getTaxpayerid() {
        return taxpayerid;
    }

    /**
    * 设置-纳税人识别号
    * @paramType java.lang.String
    * @param taxpayerid - 纳税人识别号
     */
    public void setTaxpayerid(String taxpayerid) {
        this.taxpayerid = taxpayerid;
    }

    /**
    * 获取-组织结构代码，bm.org_num
    * @return orgcode
     */
    public String getOrgcode() {
        return orgcode;
    }

    /**
    * 设置-组织结构代码，bm.org_num
    * @paramType java.lang.String
    * @param orgcode - 组织结构代码，bm.org_num
     */
    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    /**
    * 获取-部门组代码，bm.bmzdm
    * @return deptgroupcode
     */
    public String getDeptgroupcode() {
        return deptgroupcode;
    }

    /**
    * 设置-部门组代码，bm.bmzdm
    * @paramType java.lang.String
    * @param deptgroupcode - 部门组代码，bm.bmzdm
     */
    public void setDeptgroupcode(String deptgroupcode) {
        this.deptgroupcode = deptgroupcode;
    }

    /**
    * 获取-0未生效，1生效，默认生效
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-0未生效，1生效，默认生效
    * @paramType java.lang.String
    * @param ifvalid - 0未生效，1生效，默认生效
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
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
    * 获取-组织结构名称
    * @return orgname
     */
    public String getOrgname() {
        return orgname;
    }

    /**
    * 设置-组织结构名称
    * @paramType java.lang.String
    * @param orgname - 组织结构名称
     */
    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    /**
    * 获取-1.未更新分公司代码  2.已更新
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-1.未更新分公司代码  2.已更新
    * @paramType java.lang.String
    * @param status - 1.未更新分公司代码  2.已更新
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-县区级保险机构办理地税税务登记时，地税机关给与的管理编码
    * @return taxmanagementcode
     */
    public String getTaxmanagementcode() {
        return taxmanagementcode;
    }

    /**
    * 设置-县区级保险机构办理地税税务登记时，地税机关给与的管理编码
    * @paramType java.lang.String
    * @param taxmanagementcode - 县区级保险机构办理地税税务登记时，地税机关给与的管理编码
     */
    public void setTaxmanagementcode(String taxmanagementcode) {
        this.taxmanagementcode = taxmanagementcode;
    }

    /**
    * 获取-部门组名称
    * @return deptgroupname
     */
    public String getDeptgroupname() {
        return deptgroupname;
    }

    /**
    * 设置-部门组名称
    * @paramType java.lang.String
    * @param deptgroupname - 部门组名称
     */
    public void setDeptgroupname(String deptgroupname) {
        this.deptgroupname = deptgroupname;
    }

    /**
    * 获取-父机构代码
    * @return fathercode
     */
    public String getFathercode() {
        return fathercode;
    }

    /**
    * 设置-父机构代码
    * @paramType java.lang.String
    * @param fathercode - 父机构代码
     */
    public void setFathercode(String fathercode) {
        this.fathercode = fathercode;
    }

    /**
    * 获取-机构级别
    * @return levels
     */
    public BigDecimal getLevels() {
        return levels;
    }

    /**
    * 设置-机构级别
    * @paramType java.math.BigDecimal
    * @param levels - 机构级别
     */
    public void setLevels(BigDecimal levels) {
        this.levels = levels;
    }

    /**
    * 获取-是否是分公司 0否 1是
    * @return issubcompany
     */
    public String getIssubcompany() {
        return issubcompany;
    }

    /**
    * 设置-是否是分公司 0否 1是
    * @paramType java.lang.String
    * @param issubcompany - 是否是分公司 0否 1是
     */
    public void setIssubcompany(String issubcompany) {
        this.issubcompany = issubcompany;
    }
}