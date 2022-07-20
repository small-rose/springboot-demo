package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_unit_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmUnitTc {
    /**
     * 机构代码
     */
    private String unitcode;

    /**
     * 财务机构名称
     */
    private String unitname;

    /**
     * 隶属分公司
     */
    private String subcompany;

    /**
     * 0 产险总公司 1 分公司 2 中心支公司 3 支公司
     */
    private String unitlevel;

    /**
     * 父机构代码
     */
    private String fatherunitcode;

    /**
     * 是否生效
     */
    private String ifvalid;

    /**
     * 描述
     */
    private String description;

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
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 财务机构联系电话 （打发票使用）
     */
    private String phone;

    /**
     * 财务机构地址 （打发票使用）
     */
    private String address;

    /**
     * 纳税人识别号 （打发票使用）
     */
    private String taxpayerno;

    /**
     * 开户行名称（保费收入户）（打发票使用）
     */
    private String bankname;

    /**
     * 开户银行帐号（保费收入户）（打发票使用）
     */
    private String bankaccount;

    /**
     * 财务机构名称
     */
    private String shortunitname;

    /**
     * 机构开票名称
     */
    private String invoiceunitname;

    /**
     * 开票人
     */
    private String drawer;

    /**
     * 复核人
     */
    private String checker;

    /**
     * 收款人
     */
    private String payeename;

    /**
    * 获取-机构代码
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-机构代码
    * @paramType java.lang.String
    * @param unitcode - 机构代码
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    /**
    * 获取-财务机构名称
    * @return unitname
     */
    public String getUnitname() {
        return unitname;
    }

    /**
    * 设置-财务机构名称
    * @paramType java.lang.String
    * @param unitname - 财务机构名称
     */
    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    /**
    * 获取-隶属分公司
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-隶属分公司
    * @paramType java.lang.String
    * @param subcompany - 隶属分公司
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-0 产险总公司 1 分公司 2 中心支公司 3 支公司
    * @return unitlevel
     */
    public String getUnitlevel() {
        return unitlevel;
    }

    /**
    * 设置-0 产险总公司 1 分公司 2 中心支公司 3 支公司
    * @paramType java.lang.String
    * @param unitlevel - 0 产险总公司 1 分公司 2 中心支公司 3 支公司
     */
    public void setUnitlevel(String unitlevel) {
        this.unitlevel = unitlevel;
    }

    /**
    * 获取-父机构代码
    * @return fatherunitcode
     */
    public String getFatherunitcode() {
        return fatherunitcode;
    }

    /**
    * 设置-父机构代码
    * @paramType java.lang.String
    * @param fatherunitcode - 父机构代码
     */
    public void setFatherunitcode(String fatherunitcode) {
        this.fatherunitcode = fatherunitcode;
    }

    /**
    * 获取-是否生效
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否生效
    * @paramType java.lang.String
    * @param ifvalid - 是否生效
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
    }

    /**
    * 获取-描述
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-描述
    * @paramType java.lang.String
    * @param description - 描述
     */
    public void setDescription(String description) {
        this.description = description;
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
    * 获取-财务机构联系电话 （打发票使用）
    * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
    * 设置-财务机构联系电话 （打发票使用）
    * @paramType java.lang.String
    * @param phone - 财务机构联系电话 （打发票使用）
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
    * 获取-财务机构地址 （打发票使用）
    * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
    * 设置-财务机构地址 （打发票使用）
    * @paramType java.lang.String
    * @param address - 财务机构地址 （打发票使用）
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
    * 获取-纳税人识别号 （打发票使用）
    * @return taxpayerno
     */
    public String getTaxpayerno() {
        return taxpayerno;
    }

    /**
    * 设置-纳税人识别号 （打发票使用）
    * @paramType java.lang.String
    * @param taxpayerno - 纳税人识别号 （打发票使用）
     */
    public void setTaxpayerno(String taxpayerno) {
        this.taxpayerno = taxpayerno;
    }

    /**
    * 获取-开户行名称（保费收入户）（打发票使用）
    * @return bankname
     */
    public String getBankname() {
        return bankname;
    }

    /**
    * 设置-开户行名称（保费收入户）（打发票使用）
    * @paramType java.lang.String
    * @param bankname - 开户行名称（保费收入户）（打发票使用）
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
    * 获取-开户银行帐号（保费收入户）（打发票使用）
    * @return bankaccount
     */
    public String getBankaccount() {
        return bankaccount;
    }

    /**
    * 设置-开户银行帐号（保费收入户）（打发票使用）
    * @paramType java.lang.String
    * @param bankaccount - 开户银行帐号（保费收入户）（打发票使用）
     */
    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    /**
    * 获取-财务机构名称
    * @return shortunitname
     */
    public String getShortunitname() {
        return shortunitname;
    }

    /**
    * 设置-财务机构名称
    * @paramType java.lang.String
    * @param shortunitname - 财务机构名称
     */
    public void setShortunitname(String shortunitname) {
        this.shortunitname = shortunitname;
    }

    /**
    * 获取-机构开票名称
    * @return invoiceunitname
     */
    public String getInvoiceunitname() {
        return invoiceunitname;
    }

    /**
    * 设置-机构开票名称
    * @paramType java.lang.String
    * @param invoiceunitname - 机构开票名称
     */
    public void setInvoiceunitname(String invoiceunitname) {
        this.invoiceunitname = invoiceunitname;
    }

    /**
    * 获取-开票人
    * @return drawer
     */
    public String getDrawer() {
        return drawer;
    }

    /**
    * 设置-开票人
    * @paramType java.lang.String
    * @param drawer - 开票人
     */
    public void setDrawer(String drawer) {
        this.drawer = drawer;
    }

    /**
    * 获取-复核人
    * @return checker
     */
    public String getChecker() {
        return checker;
    }

    /**
    * 设置-复核人
    * @paramType java.lang.String
    * @param checker - 复核人
     */
    public void setChecker(String checker) {
        this.checker = checker;
    }

    /**
    * 获取-收款人
    * @return payeename
     */
    public String getPayeename() {
        return payeename;
    }

    /**
    * 设置-收款人
    * @paramType java.lang.String
    * @param payeename - 收款人
     */
    public void setPayeename(String payeename) {
        this.payeename = payeename;
    }
}