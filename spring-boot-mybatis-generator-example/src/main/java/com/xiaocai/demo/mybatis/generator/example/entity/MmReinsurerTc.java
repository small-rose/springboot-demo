package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_reinsurer_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmReinsurerTc {
    /**
     * 再保代码
     */
    private String reinsurercode;

    /**
     * 再保人名称
     */
    private String reinsurername;

    /**
     * 再保人英文名称
     */
    private String reinsurerenname;

    /**
     * 再保人地址
     */
    private String reinsureraddress;

    /**
     * 英文地址
     */
    private String reinsurerenaddress;

    /**
     * 联系电话
     */
    private String reinsurertel;

    /**
     * 联系人名称
     */
    private String linkman;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后修改时间
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 是否境外::0否 1是
     */
    private String ifoversea;

    /**
     * 是否有效:Y有效
     */
    private String ifvalid;

    /**
     * 偿付能力
     */
    private Long reinsurersolvency;

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
    * 获取-再保代码
    * @return reinsurercode
     */
    public String getReinsurercode() {
        return reinsurercode;
    }

    /**
    * 设置-再保代码
    * @paramType java.lang.String
    * @param reinsurercode - 再保代码
     */
    public void setReinsurercode(String reinsurercode) {
        this.reinsurercode = reinsurercode;
    }

    /**
    * 获取-再保人名称
    * @return reinsurername
     */
    public String getReinsurername() {
        return reinsurername;
    }

    /**
    * 设置-再保人名称
    * @paramType java.lang.String
    * @param reinsurername - 再保人名称
     */
    public void setReinsurername(String reinsurername) {
        this.reinsurername = reinsurername;
    }

    /**
    * 获取-再保人英文名称
    * @return reinsurerenname
     */
    public String getReinsurerenname() {
        return reinsurerenname;
    }

    /**
    * 设置-再保人英文名称
    * @paramType java.lang.String
    * @param reinsurerenname - 再保人英文名称
     */
    public void setReinsurerenname(String reinsurerenname) {
        this.reinsurerenname = reinsurerenname;
    }

    /**
    * 获取-再保人地址
    * @return reinsureraddress
     */
    public String getReinsureraddress() {
        return reinsureraddress;
    }

    /**
    * 设置-再保人地址
    * @paramType java.lang.String
    * @param reinsureraddress - 再保人地址
     */
    public void setReinsureraddress(String reinsureraddress) {
        this.reinsureraddress = reinsureraddress;
    }

    /**
    * 获取-英文地址
    * @return reinsurerenaddress
     */
    public String getReinsurerenaddress() {
        return reinsurerenaddress;
    }

    /**
    * 设置-英文地址
    * @paramType java.lang.String
    * @param reinsurerenaddress - 英文地址
     */
    public void setReinsurerenaddress(String reinsurerenaddress) {
        this.reinsurerenaddress = reinsurerenaddress;
    }

    /**
    * 获取-联系电话
    * @return reinsurertel
     */
    public String getReinsurertel() {
        return reinsurertel;
    }

    /**
    * 设置-联系电话
    * @paramType java.lang.String
    * @param reinsurertel - 联系电话
     */
    public void setReinsurertel(String reinsurertel) {
        this.reinsurertel = reinsurertel;
    }

    /**
    * 获取-联系人名称
    * @return linkman
     */
    public String getLinkman() {
        return linkman;
    }

    /**
    * 设置-联系人名称
    * @paramType java.lang.String
    * @param linkman - 联系人名称
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman;
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
    * 获取-是否境外::0否 1是
    * @return ifoversea
     */
    public String getIfoversea() {
        return ifoversea;
    }

    /**
    * 设置-是否境外::0否 1是
    * @paramType java.lang.String
    * @param ifoversea - 是否境外::0否 1是
     */
    public void setIfoversea(String ifoversea) {
        this.ifoversea = ifoversea;
    }

    /**
    * 获取-是否有效:Y有效
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否有效:Y有效
    * @paramType java.lang.String
    * @param ifvalid - 是否有效:Y有效
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
    }

    /**
    * 获取-偿付能力
    * @return reinsurersolvency
     */
    public Long getReinsurersolvency() {
        return reinsurersolvency;
    }

    /**
    * 设置-偿付能力
    * @paramType java.lang.Long
    * @param reinsurersolvency - 偿付能力
     */
    public void setReinsurersolvency(Long reinsurersolvency) {
        this.reinsurersolvency = reinsurersolvency;
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