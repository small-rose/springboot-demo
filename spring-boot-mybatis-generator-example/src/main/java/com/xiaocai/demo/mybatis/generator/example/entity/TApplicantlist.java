package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : t_applicantlist
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class TApplicantlist {
    /**
     * 主键
     */
    private Long id;

    /**
     * T_APPLICANT表外键
     */
    private Long applicantid;

    /**
     * 投保单号
     */
    private String applicantno;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 业务险类
     */
    private String classeskind;

    /**
     * 业务险种
     */
    private String classescode;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 业务唯一流水号
     */
    private String custseq;

    /**
     * 数据类型
     */
    private String datatype;

    /**
     * 起保日期
     */
    private Date startdate;

    /**
     * 终保日期
     */
    private Date enddate;

    /**
     * 被保险人代码
     */
    private String insuredcode;

    /**
     * 被保险人名称
     */
    private String insuredname;

    /**
     * 个团险标识
     */
    private String groupflag;

    /**
     * 短信验证码
     */
    private String verificationcode;

    /**
     * 共保人代码
     */
    private String coinscompanycode;

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
    * 获取-T_APPLICANT表外键
    * @return applicantid
     */
    public Long getApplicantid() {
        return applicantid;
    }

    /**
    * 设置-T_APPLICANT表外键
    * @paramType java.lang.Long
    * @param applicantid - T_APPLICANT表外键
     */
    public void setApplicantid(Long applicantid) {
        this.applicantid = applicantid;
    }

    /**
    * 获取-投保单号
    * @return applicantno
     */
    public String getApplicantno() {
        return applicantno;
    }

    /**
    * 设置-投保单号
    * @paramType java.lang.String
    * @param applicantno - 投保单号
     */
    public void setApplicantno(String applicantno) {
        this.applicantno = applicantno;
    }

    /**
    * 获取-保单号
    * @return policyno
     */
    public String getPolicyno() {
        return policyno;
    }

    /**
    * 设置-保单号
    * @paramType java.lang.String
    * @param policyno - 保单号
     */
    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    /**
    * 获取-批单号
    * @return endorseno
     */
    public String getEndorseno() {
        return endorseno;
    }

    /**
    * 设置-批单号
    * @paramType java.lang.String
    * @param endorseno - 批单号
     */
    public void setEndorseno(String endorseno) {
        this.endorseno = endorseno;
    }

    /**
    * 获取-业务险类
    * @return classeskind
     */
    public String getClasseskind() {
        return classeskind;
    }

    /**
    * 设置-业务险类
    * @paramType java.lang.String
    * @param classeskind - 业务险类
     */
    public void setClasseskind(String classeskind) {
        this.classeskind = classeskind;
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
    * 获取-金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-金额
    * @paramType java.math.BigDecimal
    * @param amount - 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-业务唯一流水号
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-业务唯一流水号
    * @paramType java.lang.String
    * @param custseq - 业务唯一流水号
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
    }

    /**
    * 获取-数据类型
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-数据类型
    * @paramType java.lang.String
    * @param datatype - 数据类型
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
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
    * 获取-被保险人代码
    * @return insuredcode
     */
    public String getInsuredcode() {
        return insuredcode;
    }

    /**
    * 设置-被保险人代码
    * @paramType java.lang.String
    * @param insuredcode - 被保险人代码
     */
    public void setInsuredcode(String insuredcode) {
        this.insuredcode = insuredcode;
    }

    /**
    * 获取-被保险人名称
    * @return insuredname
     */
    public String getInsuredname() {
        return insuredname;
    }

    /**
    * 设置-被保险人名称
    * @paramType java.lang.String
    * @param insuredname - 被保险人名称
     */
    public void setInsuredname(String insuredname) {
        this.insuredname = insuredname;
    }

    /**
    * 获取-个团险标识
    * @return groupflag
     */
    public String getGroupflag() {
        return groupflag;
    }

    /**
    * 设置-个团险标识
    * @paramType java.lang.String
    * @param groupflag - 个团险标识
     */
    public void setGroupflag(String groupflag) {
        this.groupflag = groupflag;
    }

    /**
    * 获取-短信验证码
    * @return verificationcode
     */
    public String getVerificationcode() {
        return verificationcode;
    }

    /**
    * 设置-短信验证码
    * @paramType java.lang.String
    * @param verificationcode - 短信验证码
     */
    public void setVerificationcode(String verificationcode) {
        this.verificationcode = verificationcode;
    }

    /**
    * 获取-共保人代码
    * @return coinscompanycode
     */
    public String getCoinscompanycode() {
        return coinscompanycode;
    }

    /**
    * 设置-共保人代码
    * @paramType java.lang.String
    * @param coinscompanycode - 共保人代码
     */
    public void setCoinscompanycode(String coinscompanycode) {
        this.coinscompanycode = coinscompanycode;
    }
}