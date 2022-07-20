package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_taxpayer_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTaxpayerTc {
    /**
     * 主键
     */
    private Long taxpayerid;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 纳税人名称
     */
    private String taxpayername;

    /**
     * 组织代码，可为部门，科室
     */
    private String orgcode;

    /**
     * 上一级代码，目前为部门代码
     */
    private String fathercode;

    /**
     * 组织级别，1为部门2为科室
     */
    private String orglevel;

    /**
     * 电脑编码
     */
    private String computercode;

    /**
     * 登录网上办税系统的用户名
     */
    private String username;

    /**
     * 登录网上办税系统的密码
     */
    private String password;

    /**
     * 主管税务机关代码
     */
    private String taxauthoritiescode;

    /**
     * 主管税务机关名称
     */
    private String taxauthoritiesname;

    /**
     * 代征标志,Y为代征 N为不代征
     */
    private String levyflag;

    /**
     * 所属地市
     */
    private String city;

    /**
     * 查验网址
     */
    private String website;

    /**
     * 登记日期
     */
    private Date registerdate;

    /**
     * 登记类型
     */
    private String registertype;

    /**
     * 登记状态
     */
    private String registerstatus;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 是否有效
     */
    private String ifvalid;

    /**
     * 投保地名称(非车险系统),对于车险系统使用policy_td表中的投保地
     */
    private String addrname;

    /**
     * 投保地代码(非车险系统),对于车险系统使用policy_td表中的投保地进行转换
     */
    private String addrcode;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
    * 获取-主键
    * @return taxpayerid
     */
    public Long getTaxpayerid() {
        return taxpayerid;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param taxpayerid - 主键
     */
    public void setTaxpayerid(Long taxpayerid) {
        this.taxpayerid = taxpayerid;
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
    * 获取-纳税人名称
    * @return taxpayername
     */
    public String getTaxpayername() {
        return taxpayername;
    }

    /**
    * 设置-纳税人名称
    * @paramType java.lang.String
    * @param taxpayername - 纳税人名称
     */
    public void setTaxpayername(String taxpayername) {
        this.taxpayername = taxpayername;
    }

    /**
    * 获取-组织代码，可为部门，科室
    * @return orgcode
     */
    public String getOrgcode() {
        return orgcode;
    }

    /**
    * 设置-组织代码，可为部门，科室
    * @paramType java.lang.String
    * @param orgcode - 组织代码，可为部门，科室
     */
    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    /**
    * 获取-上一级代码，目前为部门代码
    * @return fathercode
     */
    public String getFathercode() {
        return fathercode;
    }

    /**
    * 设置-上一级代码，目前为部门代码
    * @paramType java.lang.String
    * @param fathercode - 上一级代码，目前为部门代码
     */
    public void setFathercode(String fathercode) {
        this.fathercode = fathercode;
    }

    /**
    * 获取-组织级别，1为部门2为科室
    * @return orglevel
     */
    public String getOrglevel() {
        return orglevel;
    }

    /**
    * 设置-组织级别，1为部门2为科室
    * @paramType java.lang.String
    * @param orglevel - 组织级别，1为部门2为科室
     */
    public void setOrglevel(String orglevel) {
        this.orglevel = orglevel;
    }

    /**
    * 获取-电脑编码
    * @return computercode
     */
    public String getComputercode() {
        return computercode;
    }

    /**
    * 设置-电脑编码
    * @paramType java.lang.String
    * @param computercode - 电脑编码
     */
    public void setComputercode(String computercode) {
        this.computercode = computercode;
    }

    /**
    * 获取-登录网上办税系统的用户名
    * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
    * 设置-登录网上办税系统的用户名
    * @paramType java.lang.String
    * @param username - 登录网上办税系统的用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
    * 获取-登录网上办税系统的密码
    * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
    * 设置-登录网上办税系统的密码
    * @paramType java.lang.String
    * @param password - 登录网上办税系统的密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
    * 获取-主管税务机关代码
    * @return taxauthoritiescode
     */
    public String getTaxauthoritiescode() {
        return taxauthoritiescode;
    }

    /**
    * 设置-主管税务机关代码
    * @paramType java.lang.String
    * @param taxauthoritiescode - 主管税务机关代码
     */
    public void setTaxauthoritiescode(String taxauthoritiescode) {
        this.taxauthoritiescode = taxauthoritiescode;
    }

    /**
    * 获取-主管税务机关名称
    * @return taxauthoritiesname
     */
    public String getTaxauthoritiesname() {
        return taxauthoritiesname;
    }

    /**
    * 设置-主管税务机关名称
    * @paramType java.lang.String
    * @param taxauthoritiesname - 主管税务机关名称
     */
    public void setTaxauthoritiesname(String taxauthoritiesname) {
        this.taxauthoritiesname = taxauthoritiesname;
    }

    /**
    * 获取-代征标志,Y为代征 N为不代征
    * @return levyflag
     */
    public String getLevyflag() {
        return levyflag;
    }

    /**
    * 设置-代征标志,Y为代征 N为不代征
    * @paramType java.lang.String
    * @param levyflag - 代征标志,Y为代征 N为不代征
     */
    public void setLevyflag(String levyflag) {
        this.levyflag = levyflag;
    }

    /**
    * 获取-所属地市
    * @return city
     */
    public String getCity() {
        return city;
    }

    /**
    * 设置-所属地市
    * @paramType java.lang.String
    * @param city - 所属地市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
    * 获取-查验网址
    * @return website
     */
    public String getWebsite() {
        return website;
    }

    /**
    * 设置-查验网址
    * @paramType java.lang.String
    * @param website - 查验网址
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
    * 获取-登记日期
    * @return registerdate
     */
    public Date getRegisterdate() {
        return registerdate;
    }

    /**
    * 设置-登记日期
    * @paramType java.util.Date
    * @param registerdate - 登记日期
     */
    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    /**
    * 获取-登记类型
    * @return registertype
     */
    public String getRegistertype() {
        return registertype;
    }

    /**
    * 设置-登记类型
    * @paramType java.lang.String
    * @param registertype - 登记类型
     */
    public void setRegistertype(String registertype) {
        this.registertype = registertype;
    }

    /**
    * 获取-登记状态
    * @return registerstatus
     */
    public String getRegisterstatus() {
        return registerstatus;
    }

    /**
    * 设置-登记状态
    * @paramType java.lang.String
    * @param registerstatus - 登记状态
     */
    public void setRegisterstatus(String registerstatus) {
        this.registerstatus = registerstatus;
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
    * 获取-投保地名称(非车险系统),对于车险系统使用policy_td表中的投保地
    * @return addrname
     */
    public String getAddrname() {
        return addrname;
    }

    /**
    * 设置-投保地名称(非车险系统),对于车险系统使用policy_td表中的投保地
    * @paramType java.lang.String
    * @param addrname - 投保地名称(非车险系统),对于车险系统使用policy_td表中的投保地
     */
    public void setAddrname(String addrname) {
        this.addrname = addrname;
    }

    /**
    * 获取-投保地代码(非车险系统),对于车险系统使用policy_td表中的投保地进行转换
    * @return addrcode
     */
    public String getAddrcode() {
        return addrcode;
    }

    /**
    * 设置-投保地代码(非车险系统),对于车险系统使用policy_td表中的投保地进行转换
    * @paramType java.lang.String
    * @param addrcode - 投保地代码(非车险系统),对于车险系统使用policy_td表中的投保地进行转换
     */
    public void setAddrcode(String addrcode) {
        this.addrcode = addrcode;
    }

    /**
    * 获取-最后操作时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作时间
    * @paramType java.util.Date
    * @param lastopdate - 最后操作时间
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }
}