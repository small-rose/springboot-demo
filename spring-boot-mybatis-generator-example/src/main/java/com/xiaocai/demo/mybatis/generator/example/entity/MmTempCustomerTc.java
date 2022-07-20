package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_temp_customer_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTempCustomerTc {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 客户代码
     */
    private String customercode;

    /**
     * 客户party代码
     */
    private String partycode;

    /**
     * 客户名称（英文）
     */
    private String customernameen;

    /**
     * 客户名称
     */
    private String customernamecn;

    /**
     * 角色名称
     */
    private String rolename;

    /**
     * 是否日系
     */
    private String isjapan;

    /**
     * 境内/境外标识(0：境外  1：境内)
     */
    private String domestic;

    /**
     * 链接姓名
     */
    private String linkername;

    /**
     * 链接地址
     */
    private String linkeraddress;

    /**
     * 链接电话
     */
    private String linkerphone;

    /**
     * 实际客户代码
     */
    private String realcustomercode;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 客户名称ASCII码
     */
    private String nameascii;

    /**
     * 证件类型
     */
    private String certificatetype;

    /**
     * 证件号码
     */
    private String certificateno;

    /**
     * 纳税人类型
     */
    private String taxpayertype;

    /**
     * 纳税人识别号
     */
    private String taxpayernum;

    /**
     * 纳税登记地址
     */
    private String taxpayeraddr;

    /**
     * 纳税登记开户银行
     */
    private String taxpaybank;

    /**
     * 纳税登记开户银行账号
     */
    private String taxpayeraccountno;

    /**
     * 纳税人登记联系电话
     */
    private String taxpayertel;

    /**
     * 邮寄方式
     */
    private String posttype;

    /**
     * 邮寄收件人
     */
    private String postreceiver;

    /**
     * 邮寄联系电话
     */
    private String postreceivertel;

    /**
     * 邮寄地址
     */
    private String postaddr;

    /**
    * 获取-主键id
    * @return id
     */
    public Long getId() {
        return id;
    }

    /**
    * 设置-主键id
    * @paramType java.lang.Long
    * @param id - 主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    * 获取-客户代码
    * @return customercode
     */
    public String getCustomercode() {
        return customercode;
    }

    /**
    * 设置-客户代码
    * @paramType java.lang.String
    * @param customercode - 客户代码
     */
    public void setCustomercode(String customercode) {
        this.customercode = customercode;
    }

    /**
    * 获取-客户party代码
    * @return partycode
     */
    public String getPartycode() {
        return partycode;
    }

    /**
    * 设置-客户party代码
    * @paramType java.lang.String
    * @param partycode - 客户party代码
     */
    public void setPartycode(String partycode) {
        this.partycode = partycode;
    }

    /**
    * 获取-客户名称（英文）
    * @return customernameen
     */
    public String getCustomernameen() {
        return customernameen;
    }

    /**
    * 设置-客户名称（英文）
    * @paramType java.lang.String
    * @param customernameen - 客户名称（英文）
     */
    public void setCustomernameen(String customernameen) {
        this.customernameen = customernameen;
    }

    /**
    * 获取-客户名称
    * @return customernamecn
     */
    public String getCustomernamecn() {
        return customernamecn;
    }

    /**
    * 设置-客户名称
    * @paramType java.lang.String
    * @param customernamecn - 客户名称
     */
    public void setCustomernamecn(String customernamecn) {
        this.customernamecn = customernamecn;
    }

    /**
    * 获取-角色名称
    * @return rolename
     */
    public String getRolename() {
        return rolename;
    }

    /**
    * 设置-角色名称
    * @paramType java.lang.String
    * @param rolename - 角色名称
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    /**
    * 获取-是否日系
    * @return isjapan
     */
    public String getIsjapan() {
        return isjapan;
    }

    /**
    * 设置-是否日系
    * @paramType java.lang.String
    * @param isjapan - 是否日系
     */
    public void setIsjapan(String isjapan) {
        this.isjapan = isjapan;
    }

    /**
    * 获取-境内/境外标识(0：境外  1：境内)
    * @return domestic
     */
    public String getDomestic() {
        return domestic;
    }

    /**
    * 设置-境内/境外标识(0：境外  1：境内)
    * @paramType java.lang.String
    * @param domestic - 境内/境外标识(0：境外  1：境内)
     */
    public void setDomestic(String domestic) {
        this.domestic = domestic;
    }

    /**
    * 获取-链接姓名
    * @return linkername
     */
    public String getLinkername() {
        return linkername;
    }

    /**
    * 设置-链接姓名
    * @paramType java.lang.String
    * @param linkername - 链接姓名
     */
    public void setLinkername(String linkername) {
        this.linkername = linkername;
    }

    /**
    * 获取-链接地址
    * @return linkeraddress
     */
    public String getLinkeraddress() {
        return linkeraddress;
    }

    /**
    * 设置-链接地址
    * @paramType java.lang.String
    * @param linkeraddress - 链接地址
     */
    public void setLinkeraddress(String linkeraddress) {
        this.linkeraddress = linkeraddress;
    }

    /**
    * 获取-链接电话
    * @return linkerphone
     */
    public String getLinkerphone() {
        return linkerphone;
    }

    /**
    * 设置-链接电话
    * @paramType java.lang.String
    * @param linkerphone - 链接电话
     */
    public void setLinkerphone(String linkerphone) {
        this.linkerphone = linkerphone;
    }

    /**
    * 获取-实际客户代码
    * @return realcustomercode
     */
    public String getRealcustomercode() {
        return realcustomercode;
    }

    /**
    * 设置-实际客户代码
    * @paramType java.lang.String
    * @param realcustomercode - 实际客户代码
     */
    public void setRealcustomercode(String realcustomercode) {
        this.realcustomercode = realcustomercode;
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
    * 获取-客户名称ASCII码
    * @return nameascii
     */
    public String getNameascii() {
        return nameascii;
    }

    /**
    * 设置-客户名称ASCII码
    * @paramType java.lang.String
    * @param nameascii - 客户名称ASCII码
     */
    public void setNameascii(String nameascii) {
        this.nameascii = nameascii;
    }

    /**
    * 获取-证件类型
    * @return certificatetype
     */
    public String getCertificatetype() {
        return certificatetype;
    }

    /**
    * 设置-证件类型
    * @paramType java.lang.String
    * @param certificatetype - 证件类型
     */
    public void setCertificatetype(String certificatetype) {
        this.certificatetype = certificatetype;
    }

    /**
    * 获取-证件号码
    * @return certificateno
     */
    public String getCertificateno() {
        return certificateno;
    }

    /**
    * 设置-证件号码
    * @paramType java.lang.String
    * @param certificateno - 证件号码
     */
    public void setCertificateno(String certificateno) {
        this.certificateno = certificateno;
    }

    /**
    * 获取-纳税人类型
    * @return taxpayertype
     */
    public String getTaxpayertype() {
        return taxpayertype;
    }

    /**
    * 设置-纳税人类型
    * @paramType java.lang.String
    * @param taxpayertype - 纳税人类型
     */
    public void setTaxpayertype(String taxpayertype) {
        this.taxpayertype = taxpayertype;
    }

    /**
    * 获取-纳税人识别号
    * @return taxpayernum
     */
    public String getTaxpayernum() {
        return taxpayernum;
    }

    /**
    * 设置-纳税人识别号
    * @paramType java.lang.String
    * @param taxpayernum - 纳税人识别号
     */
    public void setTaxpayernum(String taxpayernum) {
        this.taxpayernum = taxpayernum;
    }

    /**
    * 获取-纳税登记地址
    * @return taxpayeraddr
     */
    public String getTaxpayeraddr() {
        return taxpayeraddr;
    }

    /**
    * 设置-纳税登记地址
    * @paramType java.lang.String
    * @param taxpayeraddr - 纳税登记地址
     */
    public void setTaxpayeraddr(String taxpayeraddr) {
        this.taxpayeraddr = taxpayeraddr;
    }

    /**
    * 获取-纳税登记开户银行
    * @return taxpaybank
     */
    public String getTaxpaybank() {
        return taxpaybank;
    }

    /**
    * 设置-纳税登记开户银行
    * @paramType java.lang.String
    * @param taxpaybank - 纳税登记开户银行
     */
    public void setTaxpaybank(String taxpaybank) {
        this.taxpaybank = taxpaybank;
    }

    /**
    * 获取-纳税登记开户银行账号
    * @return taxpayeraccountno
     */
    public String getTaxpayeraccountno() {
        return taxpayeraccountno;
    }

    /**
    * 设置-纳税登记开户银行账号
    * @paramType java.lang.String
    * @param taxpayeraccountno - 纳税登记开户银行账号
     */
    public void setTaxpayeraccountno(String taxpayeraccountno) {
        this.taxpayeraccountno = taxpayeraccountno;
    }

    /**
    * 获取-纳税人登记联系电话
    * @return taxpayertel
     */
    public String getTaxpayertel() {
        return taxpayertel;
    }

    /**
    * 设置-纳税人登记联系电话
    * @paramType java.lang.String
    * @param taxpayertel - 纳税人登记联系电话
     */
    public void setTaxpayertel(String taxpayertel) {
        this.taxpayertel = taxpayertel;
    }

    /**
    * 获取-邮寄方式
    * @return posttype
     */
    public String getPosttype() {
        return posttype;
    }

    /**
    * 设置-邮寄方式
    * @paramType java.lang.String
    * @param posttype - 邮寄方式
     */
    public void setPosttype(String posttype) {
        this.posttype = posttype;
    }

    /**
    * 获取-邮寄收件人
    * @return postreceiver
     */
    public String getPostreceiver() {
        return postreceiver;
    }

    /**
    * 设置-邮寄收件人
    * @paramType java.lang.String
    * @param postreceiver - 邮寄收件人
     */
    public void setPostreceiver(String postreceiver) {
        this.postreceiver = postreceiver;
    }

    /**
    * 获取-邮寄联系电话
    * @return postreceivertel
     */
    public String getPostreceivertel() {
        return postreceivertel;
    }

    /**
    * 设置-邮寄联系电话
    * @paramType java.lang.String
    * @param postreceivertel - 邮寄联系电话
     */
    public void setPostreceivertel(String postreceivertel) {
        this.postreceivertel = postreceivertel;
    }

    /**
    * 获取-邮寄地址
    * @return postaddr
     */
    public String getPostaddr() {
        return postaddr;
    }

    /**
    * 设置-邮寄地址
    * @paramType java.lang.String
    * @param postaddr - 邮寄地址
     */
    public void setPostaddr(String postaddr) {
        this.postaddr = postaddr;
    }
}