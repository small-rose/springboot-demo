package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_user_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmUserTc {
    /**
     * 用户代码
     */
    private String opcode;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 人员姓名
     */
    private String opname;

    /**
     * 保险公司雇员表的人员代码
     */
    private String reallopcode;

    /**
     * 密码
     */
    private String password;

    /**
     * 代理点代码
     */
    private String agentcode;

    /**
     * 业务部门代码
     */
    private String departmentcode;

    /**
     * 固定电话
     */
    private String phone;

    /**
     * 移动电话
     */
    private String mobilephone;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 邮编
     */
    private String postcode;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * 作款单匹配是否需要审核之后才生效，柜面允许有业务人员进行预收和业务单据的匹配，但是他们所作的匹配需要出纳的审核，默认不需要  0 不需要审核 1 需要审核
     */
    private String ifcheck;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后密码修改日期
     */
    private Date passwordopdate;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 是否超级用户，0：否，1：是
     */
    private String issuper;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 是否有效
     */
    private String ifvalid;

    /**
     * 同步主键
     */
    private String id;

    /**
     * 机构主键
     */
    private String organid;

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
     * 用户类型
     */
    private String usertype;

    /**
     * 操作员，代码为基础信息平台分配的人员代码
     */
    private String operatorcode;

    /**
     * 用户有效起期
     */
    private Date validsdate;

    /**
     * 用户有效止期
     */
    private Date validedate;

    /**
     * 用户英文名称
     */
    private String userename;

    /**
    * 获取-用户代码
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-用户代码
    * @paramType java.lang.String
    * @param opcode - 用户代码
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
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
    * 获取-人员姓名
    * @return opname
     */
    public String getOpname() {
        return opname;
    }

    /**
    * 设置-人员姓名
    * @paramType java.lang.String
    * @param opname - 人员姓名
     */
    public void setOpname(String opname) {
        this.opname = opname;
    }

    /**
    * 获取-保险公司雇员表的人员代码
    * @return reallopcode
     */
    public String getReallopcode() {
        return reallopcode;
    }

    /**
    * 设置-保险公司雇员表的人员代码
    * @paramType java.lang.String
    * @param reallopcode - 保险公司雇员表的人员代码
     */
    public void setReallopcode(String reallopcode) {
        this.reallopcode = reallopcode;
    }

    /**
    * 获取-密码
    * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
    * 设置-密码
    * @paramType java.lang.String
    * @param password - 密码
     */
    public void setPassword(String password) {
        this.password = password;
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
    * 获取-移动电话
    * @return mobilephone
     */
    public String getMobilephone() {
        return mobilephone;
    }

    /**
    * 设置-移动电话
    * @paramType java.lang.String
    * @param mobilephone - 移动电话
     */
    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    /**
    * 获取-电子邮箱
    * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
    * 设置-电子邮箱
    * @paramType java.lang.String
    * @param email - 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
    * 获取-联系地址
    * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
    * 设置-联系地址
    * @paramType java.lang.String
    * @param address - 联系地址
     */
    public void setAddress(String address) {
        this.address = address;
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
    * 获取-作款单匹配是否需要审核之后才生效，柜面允许有业务人员进行预收和业务单据的匹配，但是他们所作的匹配需要出纳的审核，默认不需要

0 不需要审核
1 需要审核
    * @return ifcheck
     */
    public String getIfcheck() {
        return ifcheck;
    }

    /**
    * 设置-作款单匹配是否需要审核之后才生效，柜面允许有业务人员进行预收和业务单据的匹配，但是他们所作的匹配需要出纳的审核，默认不需要

0 不需要审核
1 需要审核
    * @paramType java.lang.String
    * @param ifcheck - 作款单匹配是否需要审核之后才生效，柜面允许有业务人员进行预收和业务单据的匹配，但是他们所作的匹配需要出纳的审核，默认不需要

0 不需要审核
1 需要审核
     */
    public void setIfcheck(String ifcheck) {
        this.ifcheck = ifcheck;
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
    * 获取-最后密码修改日期
    * @return passwordopdate
     */
    public Date getPasswordopdate() {
        return passwordopdate;
    }

    /**
    * 设置-最后密码修改日期
    * @paramType java.util.Date
    * @param passwordopdate - 最后密码修改日期
     */
    public void setPasswordopdate(Date passwordopdate) {
        this.passwordopdate = passwordopdate;
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
    * 获取-是否超级用户，0：否，1：是
    * @return issuper
     */
    public String getIssuper() {
        return issuper;
    }

    /**
    * 设置-是否超级用户，0：否，1：是
    * @paramType java.lang.String
    * @param issuper - 是否超级用户，0：否，1：是
     */
    public void setIssuper(String issuper) {
        this.issuper = issuper;
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
    * 获取-是否有效
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否有效
    * @paramType java.lang.String
    * @param ifvalid - 是否有效
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
    }

    /**
    * 获取-同步主键
    * @return id
     */
    public String getId() {
        return id;
    }

    /**
    * 设置-同步主键
    * @paramType java.lang.String
    * @param id - 同步主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
    * 获取-机构主键
    * @return organid
     */
    public String getOrganid() {
        return organid;
    }

    /**
    * 设置-机构主键
    * @paramType java.lang.String
    * @param organid - 机构主键
     */
    public void setOrganid(String organid) {
        this.organid = organid;
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
    * 获取-用户类型
    * @return usertype
     */
    public String getUsertype() {
        return usertype;
    }

    /**
    * 设置-用户类型
    * @paramType java.lang.String
    * @param usertype - 用户类型
     */
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    /**
    * 获取-操作员，代码为基础信息平台分配的人员代码
    * @return operatorcode
     */
    public String getOperatorcode() {
        return operatorcode;
    }

    /**
    * 设置-操作员，代码为基础信息平台分配的人员代码
    * @paramType java.lang.String
    * @param operatorcode - 操作员，代码为基础信息平台分配的人员代码
     */
    public void setOperatorcode(String operatorcode) {
        this.operatorcode = operatorcode;
    }

    /**
    * 获取-用户有效起期
    * @return validsdate
     */
    public Date getValidsdate() {
        return validsdate;
    }

    /**
    * 设置-用户有效起期
    * @paramType java.util.Date
    * @param validsdate - 用户有效起期
     */
    public void setValidsdate(Date validsdate) {
        this.validsdate = validsdate;
    }

    /**
    * 获取-用户有效止期
    * @return validedate
     */
    public Date getValidedate() {
        return validedate;
    }

    /**
    * 设置-用户有效止期
    * @paramType java.util.Date
    * @param validedate - 用户有效止期
     */
    public void setValidedate(Date validedate) {
        this.validedate = validedate;
    }

    /**
    * 获取-用户英文名称
    * @return userename
     */
    public String getUserename() {
        return userename;
    }

    /**
    * 设置-用户英文名称
    * @paramType java.lang.String
    * @param userename - 用户英文名称
     */
    public void setUserename(String userename) {
        this.userename = userename;
    }
}