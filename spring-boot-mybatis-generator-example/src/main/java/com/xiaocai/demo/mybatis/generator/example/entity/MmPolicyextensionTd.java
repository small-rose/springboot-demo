package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_policyextension_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPolicyextensionTd {
    /**
     * 主键
     */
    private Long seqpolicy;

    /**
     * 保额
     */
    private BigDecimal assuredamount;

    /**
     * 投保人代码
     */
    private String applicantcode;

    /**
     * 投保人名称
     */
    private String applicantname;

    /**
     * 被保险人代码
     */
    private String insurantcode;

    /**
     * 被保险人名称
     */
    private String insurantname;

    /**
     * 科室代码（拼上分公司简码）
     */
    private String sectioncode;

    /**
     * 标的名称，同MM_POLICYSETTLEMENT_TD.OBJECTNAME
     */
    private String objectname;

    /**
     * 保单（MM_POLICY_TD）已结算金额
     */
    private BigDecimal settleamount;

    /**
     * pos银行卡号
     */
    private String posbankno;

    /**
     * 保单的打印时间
     */
    private Date printdate;

    /**
     * 救助基金
     */
    private BigDecimal aidingfund;

    /**
     * 救助基金比例
     */
    private String aidingfundproportion;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 销账清单中已经设置的保费累计金额
     */
    private BigDecimal handleamount;

    /**
     * 车牌号
     */
    private String brand;

    /**
     * 车辆类别代码
     */
    private String vehiclestyle;

    /**
     * 计税单位：辆、吨、排气量、载客人数
     */
    private String unit;

    /**
     * 计税数量
     */
    private String carnumber;

    /**
     * 使用性质
     */
    private String useproperty;

    /**
     * 识别代码（车架号）
     */
    private String vehvin;

    /**
     * 发动机号
     */
    private String engine;

    /**
     * 收款时是付款人证件号码，付款时是收款人证件号码
     */
    private String identify;

    /**
     * 是否有效
     */
    private String isactiveflag;

    /**
    * 获取-主键
    * @return seqpolicy
     */
    public Long getSeqpolicy() {
        return seqpolicy;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param seqpolicy - 主键
     */
    public void setSeqpolicy(Long seqpolicy) {
        this.seqpolicy = seqpolicy;
    }

    /**
    * 获取-保额
    * @return assuredamount
     */
    public BigDecimal getAssuredamount() {
        return assuredamount;
    }

    /**
    * 设置-保额
    * @paramType java.math.BigDecimal
    * @param assuredamount - 保额
     */
    public void setAssuredamount(BigDecimal assuredamount) {
        this.assuredamount = assuredamount;
    }

    /**
    * 获取-投保人代码
    * @return applicantcode
     */
    public String getApplicantcode() {
        return applicantcode;
    }

    /**
    * 设置-投保人代码
    * @paramType java.lang.String
    * @param applicantcode - 投保人代码
     */
    public void setApplicantcode(String applicantcode) {
        this.applicantcode = applicantcode;
    }

    /**
    * 获取-投保人名称
    * @return applicantname
     */
    public String getApplicantname() {
        return applicantname;
    }

    /**
    * 设置-投保人名称
    * @paramType java.lang.String
    * @param applicantname - 投保人名称
     */
    public void setApplicantname(String applicantname) {
        this.applicantname = applicantname;
    }

    /**
    * 获取-被保险人代码
    * @return insurantcode
     */
    public String getInsurantcode() {
        return insurantcode;
    }

    /**
    * 设置-被保险人代码
    * @paramType java.lang.String
    * @param insurantcode - 被保险人代码
     */
    public void setInsurantcode(String insurantcode) {
        this.insurantcode = insurantcode;
    }

    /**
    * 获取-被保险人名称
    * @return insurantname
     */
    public String getInsurantname() {
        return insurantname;
    }

    /**
    * 设置-被保险人名称
    * @paramType java.lang.String
    * @param insurantname - 被保险人名称
     */
    public void setInsurantname(String insurantname) {
        this.insurantname = insurantname;
    }

    /**
    * 获取-科室代码（拼上分公司简码）
    * @return sectioncode
     */
    public String getSectioncode() {
        return sectioncode;
    }

    /**
    * 设置-科室代码（拼上分公司简码）
    * @paramType java.lang.String
    * @param sectioncode - 科室代码（拼上分公司简码）
     */
    public void setSectioncode(String sectioncode) {
        this.sectioncode = sectioncode;
    }

    /**
    * 获取-标的名称，同MM_POLICYSETTLEMENT_TD.OBJECTNAME
    * @return objectname
     */
    public String getObjectname() {
        return objectname;
    }

    /**
    * 设置-标的名称，同MM_POLICYSETTLEMENT_TD.OBJECTNAME
    * @paramType java.lang.String
    * @param objectname - 标的名称，同MM_POLICYSETTLEMENT_TD.OBJECTNAME
     */
    public void setObjectname(String objectname) {
        this.objectname = objectname;
    }

    /**
    * 获取-保单（MM_POLICY_TD）已结算金额
    * @return settleamount
     */
    public BigDecimal getSettleamount() {
        return settleamount;
    }

    /**
    * 设置-保单（MM_POLICY_TD）已结算金额
    * @paramType java.math.BigDecimal
    * @param settleamount - 保单（MM_POLICY_TD）已结算金额
     */
    public void setSettleamount(BigDecimal settleamount) {
        this.settleamount = settleamount;
    }

    /**
    * 获取-pos银行卡号
    * @return posbankno
     */
    public String getPosbankno() {
        return posbankno;
    }

    /**
    * 设置-pos银行卡号
    * @paramType java.lang.String
    * @param posbankno - pos银行卡号
     */
    public void setPosbankno(String posbankno) {
        this.posbankno = posbankno;
    }

    /**
    * 获取-保单的打印时间
    * @return printdate
     */
    public Date getPrintdate() {
        return printdate;
    }

    /**
    * 设置-保单的打印时间
    * @paramType java.util.Date
    * @param printdate - 保单的打印时间
     */
    public void setPrintdate(Date printdate) {
        this.printdate = printdate;
    }

    /**
    * 获取-救助基金
    * @return aidingfund
     */
    public BigDecimal getAidingfund() {
        return aidingfund;
    }

    /**
    * 设置-救助基金
    * @paramType java.math.BigDecimal
    * @param aidingfund - 救助基金
     */
    public void setAidingfund(BigDecimal aidingfund) {
        this.aidingfund = aidingfund;
    }

    /**
    * 获取-救助基金比例
    * @return aidingfundproportion
     */
    public String getAidingfundproportion() {
        return aidingfundproportion;
    }

    /**
    * 设置-救助基金比例
    * @paramType java.lang.String
    * @param aidingfundproportion - 救助基金比例
     */
    public void setAidingfundproportion(String aidingfundproportion) {
        this.aidingfundproportion = aidingfundproportion;
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
    * 获取-销账清单中已经设置的保费累计金额
    * @return handleamount
     */
    public BigDecimal getHandleamount() {
        return handleamount;
    }

    /**
    * 设置-销账清单中已经设置的保费累计金额
    * @paramType java.math.BigDecimal
    * @param handleamount - 销账清单中已经设置的保费累计金额
     */
    public void setHandleamount(BigDecimal handleamount) {
        this.handleamount = handleamount;
    }

    /**
    * 获取-车牌号
    * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
    * 设置-车牌号
    * @paramType java.lang.String
    * @param brand - 车牌号
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
    * 获取-车辆类别代码
    * @return vehiclestyle
     */
    public String getVehiclestyle() {
        return vehiclestyle;
    }

    /**
    * 设置-车辆类别代码
    * @paramType java.lang.String
    * @param vehiclestyle - 车辆类别代码
     */
    public void setVehiclestyle(String vehiclestyle) {
        this.vehiclestyle = vehiclestyle;
    }

    /**
    * 获取-计税单位：辆、吨、排气量、载客人数
    * @return unit
     */
    public String getUnit() {
        return unit;
    }

    /**
    * 设置-计税单位：辆、吨、排气量、载客人数
    * @paramType java.lang.String
    * @param unit - 计税单位：辆、吨、排气量、载客人数
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
    * 获取-计税数量
    * @return carnumber
     */
    public String getCarnumber() {
        return carnumber;
    }

    /**
    * 设置-计税数量
    * @paramType java.lang.String
    * @param carnumber - 计税数量
     */
    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }

    /**
    * 获取-使用性质
    * @return useproperty
     */
    public String getUseproperty() {
        return useproperty;
    }

    /**
    * 设置-使用性质
    * @paramType java.lang.String
    * @param useproperty - 使用性质
     */
    public void setUseproperty(String useproperty) {
        this.useproperty = useproperty;
    }

    /**
    * 获取-识别代码（车架号）
    * @return vehvin
     */
    public String getVehvin() {
        return vehvin;
    }

    /**
    * 设置-识别代码（车架号）
    * @paramType java.lang.String
    * @param vehvin - 识别代码（车架号）
     */
    public void setVehvin(String vehvin) {
        this.vehvin = vehvin;
    }

    /**
    * 获取-发动机号
    * @return engine
     */
    public String getEngine() {
        return engine;
    }

    /**
    * 设置-发动机号
    * @paramType java.lang.String
    * @param engine - 发动机号
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
    * 获取-收款时是付款人证件号码，付款时是收款人证件号码
    * @return identify
     */
    public String getIdentify() {
        return identify;
    }

    /**
    * 设置-收款时是付款人证件号码，付款时是收款人证件号码
    * @paramType java.lang.String
    * @param identify - 收款时是付款人证件号码，付款时是收款人证件号码
     */
    public void setIdentify(String identify) {
        this.identify = identify;
    }

    /**
    * 获取-是否有效
    * @return isactiveflag
     */
    public String getIsactiveflag() {
        return isactiveflag;
    }

    /**
    * 设置-是否有效
    * @paramType java.lang.String
    * @param isactiveflag - 是否有效
     */
    public void setIsactiveflag(String isactiveflag) {
        this.isactiveflag = isactiveflag;
    }
}