package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_unitmapping_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmUnitmappingTc {
    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 部门代码
     */
    private String departmentcode;

    /**
     * 币种代码
     */
    private String currencycode;

    /**
     * 财务机构代码
     */
    private String unitcode;

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
     * 主管税务机关名称
     */
    private String zgswjgmc;

    /**
     * 开户行名称（保费收入户）
     */
    private String bankname;

    /**
     * 开户银行帐号（保费收入户）
     */
    private String bankaccount;

    /**
     * 管理编码
     */
    private String glbm;

    /**
     * 税务登记证号
     */
    private String swdjzzh;

    /**
     * 纳税人名称
     */
    private String nsrmc;

    /**
     * 税务机关编码
     */
    private String swjgbm;

    /**
     * 工商登记证
     */
    private String gsdjzh;

    /**
     * 征管行业
     */
    private String hydm;

    /**
     * 项目地址
     */
    private String xmdz;

    /**
     * 银行编码
     */
    private String yhbm;

    /**
     * 开户名称
     */
    private String accountname;

    /**
     * 发票机构名称
     */
    private String invoiceunitname;

    /**
     * 联系电话
     */
    private String lxdh;

    /**
     * 销货单位识别号
     */
    private String xhdwsbh;

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
    * 获取-币种代码
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种代码
    * @paramType java.lang.String
    * @param currencycode - 币种代码
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
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
    * 获取-主管税务机关名称
    * @return zgswjgmc
     */
    public String getZgswjgmc() {
        return zgswjgmc;
    }

    /**
    * 设置-主管税务机关名称
    * @paramType java.lang.String
    * @param zgswjgmc - 主管税务机关名称
     */
    public void setZgswjgmc(String zgswjgmc) {
        this.zgswjgmc = zgswjgmc;
    }

    /**
    * 获取-开户行名称（保费收入户）
    * @return bankname
     */
    public String getBankname() {
        return bankname;
    }

    /**
    * 设置-开户行名称（保费收入户）
    * @paramType java.lang.String
    * @param bankname - 开户行名称（保费收入户）
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
    * 获取-开户银行帐号（保费收入户）
    * @return bankaccount
     */
    public String getBankaccount() {
        return bankaccount;
    }

    /**
    * 设置-开户银行帐号（保费收入户）
    * @paramType java.lang.String
    * @param bankaccount - 开户银行帐号（保费收入户）
     */
    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    /**
    * 获取-管理编码
    * @return glbm
     */
    public String getGlbm() {
        return glbm;
    }

    /**
    * 设置-管理编码
    * @paramType java.lang.String
    * @param glbm - 管理编码
     */
    public void setGlbm(String glbm) {
        this.glbm = glbm;
    }

    /**
    * 获取-税务登记证号
    * @return swdjzzh
     */
    public String getSwdjzzh() {
        return swdjzzh;
    }

    /**
    * 设置-税务登记证号
    * @paramType java.lang.String
    * @param swdjzzh - 税务登记证号
     */
    public void setSwdjzzh(String swdjzzh) {
        this.swdjzzh = swdjzzh;
    }

    /**
    * 获取-纳税人名称
    * @return nsrmc
     */
    public String getNsrmc() {
        return nsrmc;
    }

    /**
    * 设置-纳税人名称
    * @paramType java.lang.String
    * @param nsrmc - 纳税人名称
     */
    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    /**
    * 获取-税务机关编码
    * @return swjgbm
     */
    public String getSwjgbm() {
        return swjgbm;
    }

    /**
    * 设置-税务机关编码
    * @paramType java.lang.String
    * @param swjgbm - 税务机关编码
     */
    public void setSwjgbm(String swjgbm) {
        this.swjgbm = swjgbm;
    }

    /**
    * 获取-工商登记证
    * @return gsdjzh
     */
    public String getGsdjzh() {
        return gsdjzh;
    }

    /**
    * 设置-工商登记证
    * @paramType java.lang.String
    * @param gsdjzh - 工商登记证
     */
    public void setGsdjzh(String gsdjzh) {
        this.gsdjzh = gsdjzh;
    }

    /**
    * 获取-征管行业
    * @return hydm
     */
    public String getHydm() {
        return hydm;
    }

    /**
    * 设置-征管行业
    * @paramType java.lang.String
    * @param hydm - 征管行业
     */
    public void setHydm(String hydm) {
        this.hydm = hydm;
    }

    /**
    * 获取-项目地址
    * @return xmdz
     */
    public String getXmdz() {
        return xmdz;
    }

    /**
    * 设置-项目地址
    * @paramType java.lang.String
    * @param xmdz - 项目地址
     */
    public void setXmdz(String xmdz) {
        this.xmdz = xmdz;
    }

    /**
    * 获取-银行编码
    * @return yhbm
     */
    public String getYhbm() {
        return yhbm;
    }

    /**
    * 设置-银行编码
    * @paramType java.lang.String
    * @param yhbm - 银行编码
     */
    public void setYhbm(String yhbm) {
        this.yhbm = yhbm;
    }

    /**
    * 获取-开户名称
    * @return accountname
     */
    public String getAccountname() {
        return accountname;
    }

    /**
    * 设置-开户名称
    * @paramType java.lang.String
    * @param accountname - 开户名称
     */
    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    /**
    * 获取-发票机构名称
    * @return invoiceunitname
     */
    public String getInvoiceunitname() {
        return invoiceunitname;
    }

    /**
    * 设置-发票机构名称
    * @paramType java.lang.String
    * @param invoiceunitname - 发票机构名称
     */
    public void setInvoiceunitname(String invoiceunitname) {
        this.invoiceunitname = invoiceunitname;
    }

    /**
    * 获取-联系电话
    * @return lxdh
     */
    public String getLxdh() {
        return lxdh;
    }

    /**
    * 设置-联系电话
    * @paramType java.lang.String
    * @param lxdh - 联系电话
     */
    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    /**
    * 获取-销货单位识别号
    * @return xhdwsbh
     */
    public String getXhdwsbh() {
        return xhdwsbh;
    }

    /**
    * 设置-销货单位识别号
    * @paramType java.lang.String
    * @param xhdwsbh - 销货单位识别号
     */
    public void setXhdwsbh(String xhdwsbh) {
        this.xhdwsbh = xhdwsbh;
    }
}