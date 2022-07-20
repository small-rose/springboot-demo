package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_organization_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmOrganizationTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 组织机构代码
     */
    private String organcode;

    /**
     * 组织机构名称
     */
    private String organname;

    /**
     * 级别
     */
    private Long organlevel;

    /**
     * 父级机构代码(最高级别的机构的父级机构代码为空)
     */
    private String fatherorgancode;

    /**
     * 机构代码简写
     */
    private String organshortcode;

    /**
     * 机构名称简写
     */
    private String organshortname;

    /**
     * 父级机构ID(最高级别的机构的父级机构ID写0)
     */
    private String superid;

    /**
     * 真实代码(数据迁移备用字段)
     */
    private String realcode;

    /**
     * 分公司(如果组织机构是分公司级别以下的，可以记录对应分公司代码)
     */
    private String subcompany;

    /**
     * 部门(如果组织机构是部门级别以下的，可以记录对应分公司代码)
     */
    private String departmentcode;

    /**
     * 城市代码
     */
    private String citycode;

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
     * 未生效(1生效，默认生效)
     */
    private String ifvalid;

    /**
     * 时间戳
     */
    private Date createdate;

    /**
     * 最后修改时间
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 手工修改
     */
    private String modifydesc;

    /**
     * 备用字段1
     */
    private String segment1;

    /**
     * 备用字段2
     */
    private String segment2;

    /**
     * 备用字段3
     */
    private String segment3;

    /**
     * 备用字段4
     */
    private String segment4;

    /**
     * 备用字段5
     */
    private String segment5;

    /**
     * 状态
     */
    private String status;

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
    * 获取-组织机构代码
    * @return organcode
     */
    public String getOrgancode() {
        return organcode;
    }

    /**
    * 设置-组织机构代码
    * @paramType java.lang.String
    * @param organcode - 组织机构代码
     */
    public void setOrgancode(String organcode) {
        this.organcode = organcode;
    }

    /**
    * 获取-组织机构名称
    * @return organname
     */
    public String getOrganname() {
        return organname;
    }

    /**
    * 设置-组织机构名称
    * @paramType java.lang.String
    * @param organname - 组织机构名称
     */
    public void setOrganname(String organname) {
        this.organname = organname;
    }

    /**
    * 获取-级别
    * @return organlevel
     */
    public Long getOrganlevel() {
        return organlevel;
    }

    /**
    * 设置-级别
    * @paramType java.lang.Long
    * @param organlevel - 级别
     */
    public void setOrganlevel(Long organlevel) {
        this.organlevel = organlevel;
    }

    /**
    * 获取-父级机构代码(最高级别的机构的父级机构代码为空)
    * @return fatherorgancode
     */
    public String getFatherorgancode() {
        return fatherorgancode;
    }

    /**
    * 设置-父级机构代码(最高级别的机构的父级机构代码为空)
    * @paramType java.lang.String
    * @param fatherorgancode - 父级机构代码(最高级别的机构的父级机构代码为空)
     */
    public void setFatherorgancode(String fatherorgancode) {
        this.fatherorgancode = fatherorgancode;
    }

    /**
    * 获取-机构代码简写
    * @return organshortcode
     */
    public String getOrganshortcode() {
        return organshortcode;
    }

    /**
    * 设置-机构代码简写
    * @paramType java.lang.String
    * @param organshortcode - 机构代码简写
     */
    public void setOrganshortcode(String organshortcode) {
        this.organshortcode = organshortcode;
    }

    /**
    * 获取-机构名称简写
    * @return organshortname
     */
    public String getOrganshortname() {
        return organshortname;
    }

    /**
    * 设置-机构名称简写
    * @paramType java.lang.String
    * @param organshortname - 机构名称简写
     */
    public void setOrganshortname(String organshortname) {
        this.organshortname = organshortname;
    }

    /**
    * 获取-父级机构ID(最高级别的机构的父级机构ID写0)
    * @return superid
     */
    public String getSuperid() {
        return superid;
    }

    /**
    * 设置-父级机构ID(最高级别的机构的父级机构ID写0)
    * @paramType java.lang.String
    * @param superid - 父级机构ID(最高级别的机构的父级机构ID写0)
     */
    public void setSuperid(String superid) {
        this.superid = superid;
    }

    /**
    * 获取-真实代码(数据迁移备用字段)
    * @return realcode
     */
    public String getRealcode() {
        return realcode;
    }

    /**
    * 设置-真实代码(数据迁移备用字段)
    * @paramType java.lang.String
    * @param realcode - 真实代码(数据迁移备用字段)
     */
    public void setRealcode(String realcode) {
        this.realcode = realcode;
    }

    /**
    * 获取-分公司(如果组织机构是分公司级别以下的，可以记录对应分公司代码)
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司(如果组织机构是分公司级别以下的，可以记录对应分公司代码)
    * @paramType java.lang.String
    * @param subcompany - 分公司(如果组织机构是分公司级别以下的，可以记录对应分公司代码)
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-部门(如果组织机构是部门级别以下的，可以记录对应分公司代码)
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-部门(如果组织机构是部门级别以下的，可以记录对应分公司代码)
    * @paramType java.lang.String
    * @param departmentcode - 部门(如果组织机构是部门级别以下的，可以记录对应分公司代码)
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    /**
    * 获取-城市代码
    * @return citycode
     */
    public String getCitycode() {
        return citycode;
    }

    /**
    * 设置-城市代码
    * @paramType java.lang.String
    * @param citycode - 城市代码
     */
    public void setCitycode(String citycode) {
        this.citycode = citycode;
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
    * 获取-未生效(1生效，默认生效)
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-未生效(1生效，默认生效)
    * @paramType java.lang.String
    * @param ifvalid - 未生效(1生效，默认生效)
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
    }

    /**
    * 获取-时间戳
    * @return createdate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
    * 设置-时间戳
    * @paramType java.util.Date
    * @param createdate - 时间戳
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
    * 获取-最后修改时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后修改时间
    * @paramType java.util.Date
    * @param lastopdate - 最后修改时间
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
    * 获取-手工修改
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改
    * @paramType java.lang.String
    * @param modifydesc - 手工修改
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-备用字段1
    * @return segment1
     */
    public String getSegment1() {
        return segment1;
    }

    /**
    * 设置-备用字段1
    * @paramType java.lang.String
    * @param segment1 - 备用字段1
     */
    public void setSegment1(String segment1) {
        this.segment1 = segment1;
    }

    /**
    * 获取-备用字段2
    * @return segment2
     */
    public String getSegment2() {
        return segment2;
    }

    /**
    * 设置-备用字段2
    * @paramType java.lang.String
    * @param segment2 - 备用字段2
     */
    public void setSegment2(String segment2) {
        this.segment2 = segment2;
    }

    /**
    * 获取-备用字段3
    * @return segment3
     */
    public String getSegment3() {
        return segment3;
    }

    /**
    * 设置-备用字段3
    * @paramType java.lang.String
    * @param segment3 - 备用字段3
     */
    public void setSegment3(String segment3) {
        this.segment3 = segment3;
    }

    /**
    * 获取-备用字段4
    * @return segment4
     */
    public String getSegment4() {
        return segment4;
    }

    /**
    * 设置-备用字段4
    * @paramType java.lang.String
    * @param segment4 - 备用字段4
     */
    public void setSegment4(String segment4) {
        this.segment4 = segment4;
    }

    /**
    * 获取-备用字段5
    * @return segment5
     */
    public String getSegment5() {
        return segment5;
    }

    /**
    * 设置-备用字段5
    * @paramType java.lang.String
    * @param segment5 - 备用字段5
     */
    public void setSegment5(String segment5) {
        this.segment5 = segment5;
    }

    /**
    * 获取-状态
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态
    * @paramType java.lang.String
    * @param status - 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }
}