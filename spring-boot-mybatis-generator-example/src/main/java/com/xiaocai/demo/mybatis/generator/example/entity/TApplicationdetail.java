package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : t_applicationdetail
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class TApplicationdetail {
    /**
     * 主键
     */
    private String appdetailno;

    /**
     * 前端系统数据唯一流水号
     */
    private String custseq;

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
     * 币种
     */
    private String currencytype;

    /**
     * 本单金额，单位为分
     */
    private String amount;

    /**
     * 业务经办人
     */
    private String transactorname;

    /**
     * 投保人名称
     */
    private String applicantname;

    /**
     * 被保险人名称
     */
    private String insuredname;

    /**
     * 起保/生效日期
     */
    private Date startdate;

    /**
     * 数据类型1保费，4车船税
     */
    private String datatype;

    /**
     * 数据来源 非车承保： UNDERWRITING 车险承保：AUTO 非车理赔： CLAIM 车险理赔： AUTOCLAIM
     */
    private String datasource;

    /**
     * 业务归属部门
     */
    private String departmentcode;

    /**
     * 分期缴费期次
     */
    private String installmentstimes;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 系统时间
     */
    private Date lastopdate;

    /**
     * 系统交易内部流水号
     */
    private String tano;

    /**
     * 支付申请号
     */
    private String applyno;

    /**
     * 投保人代码
     */
    private String applicantcode;

    /**
     * 被保险人代码
     */
    private String insuredcode;

    /**
     * 上海平台投保预确认码 备注，当支付申请为上海支付申请时，投保确认码或者批改查询码必传，且payway 不能为空（江苏的此值传投保查询码） 
     */
    private String proconfirmSequenceNo;

    /**
     * 上海平台批改查询码 备注，当支付申请为上海支付申请时，投保确认码或者批改查询码必传，且payway 不能为空（江苏的此值传批改查询码） 
     */
    private String amendQueryNo;

    /**
     * 出单类型
     */
    private String policytype;

    /**
     * 出单归属地（地市）
     */
    private String citycode;

    /**
     * 险种类型
     */
    private String coveragetype;

    /**
     * 号牌种类
     */
    private String licenseplatetype;

    /**
     * 号牌号码
     */
    private String licenseplateno;

    /**
     * 车架号
     */
    private String vin;

    /**
     * 发动机号
     */
    private String engineno;

    /**
     * 终保日期
     */
    private String expiredate;

    /**
     * 主投保单号
     */
    private String businessno;

    /**
     * 组合险种
     */
    private String unionclassescode;

    /**
     * 业务类型
     */
    private String businesstype;

    /**
     * MD5校验值
     */
    private String md5;

    /**
     * 状态值
     */
    private String status;

    /**
    * 获取-主键
    * @return appdetailno
     */
    public String getAppdetailno() {
        return appdetailno;
    }

    /**
    * 设置-主键
    * @paramType java.lang.String
    * @param appdetailno - 主键
     */
    public void setAppdetailno(String appdetailno) {
        this.appdetailno = appdetailno;
    }

    /**
    * 获取-前端系统数据唯一流水号
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-前端系统数据唯一流水号
    * @paramType java.lang.String
    * @param custseq - 前端系统数据唯一流水号
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
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
    * 获取-币种
    * @return currencytype
     */
    public String getCurrencytype() {
        return currencytype;
    }

    /**
    * 设置-币种
    * @paramType java.lang.String
    * @param currencytype - 币种
     */
    public void setCurrencytype(String currencytype) {
        this.currencytype = currencytype;
    }

    /**
    * 获取-本单金额，单位为分
    * @return amount
     */
    public String getAmount() {
        return amount;
    }

    /**
    * 设置-本单金额，单位为分
    * @paramType java.lang.String
    * @param amount - 本单金额，单位为分
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
    * 获取-业务经办人
    * @return transactorname
     */
    public String getTransactorname() {
        return transactorname;
    }

    /**
    * 设置-业务经办人
    * @paramType java.lang.String
    * @param transactorname - 业务经办人
     */
    public void setTransactorname(String transactorname) {
        this.transactorname = transactorname;
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
    * 获取-起保/生效日期
    * @return startdate
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
    * 设置-起保/生效日期
    * @paramType java.util.Date
    * @param startdate - 起保/生效日期
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
    * 获取-数据类型1保费，4车船税
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-数据类型1保费，4车船税
    * @paramType java.lang.String
    * @param datatype - 数据类型1保费，4车船税
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    /**
    * 获取-数据来源
非车承保：
UNDERWRITING
车险承保：AUTO
非车理赔：
CLAIM
车险理赔：
AUTOCLAIM
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-数据来源
非车承保：
UNDERWRITING
车险承保：AUTO
非车理赔：
CLAIM
车险理赔：
AUTOCLAIM
    * @paramType java.lang.String
    * @param datasource - 数据来源
非车承保：
UNDERWRITING
车险承保：AUTO
非车理赔：
CLAIM
车险理赔：
AUTOCLAIM
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-业务归属部门
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-业务归属部门
    * @paramType java.lang.String
    * @param departmentcode - 业务归属部门
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    /**
    * 获取-分期缴费期次
    * @return installmentstimes
     */
    public String getInstallmentstimes() {
        return installmentstimes;
    }

    /**
    * 设置-分期缴费期次
    * @paramType java.lang.String
    * @param installmentstimes - 分期缴费期次
     */
    public void setInstallmentstimes(String installmentstimes) {
        this.installmentstimes = installmentstimes;
    }

    /**
    * 获取-操作日期
    * @return opdate
     */
    public Date getOpdate() {
        return opdate;
    }

    /**
    * 设置-操作日期
    * @paramType java.util.Date
    * @param opdate - 操作日期
     */
    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }

    /**
    * 获取-系统时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-系统时间
    * @paramType java.util.Date
    * @param lastopdate - 系统时间
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-系统交易内部流水号
    * @return tano
     */
    public String getTano() {
        return tano;
    }

    /**
    * 设置-系统交易内部流水号
    * @paramType java.lang.String
    * @param tano - 系统交易内部流水号
     */
    public void setTano(String tano) {
        this.tano = tano;
    }

    /**
    * 获取-支付申请号
    * @return applyno
     */
    public String getApplyno() {
        return applyno;
    }

    /**
    * 设置-支付申请号
    * @paramType java.lang.String
    * @param applyno - 支付申请号
     */
    public void setApplyno(String applyno) {
        this.applyno = applyno;
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
    * 获取-上海平台投保预确认码
备注，当支付申请为上海支付申请时，投保确认码或者批改查询码必传，且payway 不能为空（江苏的此值传投保查询码）

    * @return proconfirmSequenceNo
     */
    public String getProconfirmSequenceNo() {
        return proconfirmSequenceNo;
    }

    /**
    * 设置-上海平台投保预确认码
备注，当支付申请为上海支付申请时，投保确认码或者批改查询码必传，且payway 不能为空（江苏的此值传投保查询码）

    * @paramType java.lang.String
    * @param proconfirmSequenceNo - 上海平台投保预确认码
备注，当支付申请为上海支付申请时，投保确认码或者批改查询码必传，且payway 不能为空（江苏的此值传投保查询码）

     */
    public void setProconfirmSequenceNo(String proconfirmSequenceNo) {
        this.proconfirmSequenceNo = proconfirmSequenceNo;
    }

    /**
    * 获取-上海平台批改查询码
备注，当支付申请为上海支付申请时，投保确认码或者批改查询码必传，且payway 不能为空（江苏的此值传批改查询码）

    * @return amendQueryNo
     */
    public String getAmendQueryNo() {
        return amendQueryNo;
    }

    /**
    * 设置-上海平台批改查询码
备注，当支付申请为上海支付申请时，投保确认码或者批改查询码必传，且payway 不能为空（江苏的此值传批改查询码）

    * @paramType java.lang.String
    * @param amendQueryNo - 上海平台批改查询码
备注，当支付申请为上海支付申请时，投保确认码或者批改查询码必传，且payway 不能为空（江苏的此值传批改查询码）

     */
    public void setAmendQueryNo(String amendQueryNo) {
        this.amendQueryNo = amendQueryNo;
    }

    /**
    * 获取-出单类型
    * @return policytype
     */
    public String getPolicytype() {
        return policytype;
    }

    /**
    * 设置-出单类型
    * @paramType java.lang.String
    * @param policytype - 出单类型
     */
    public void setPolicytype(String policytype) {
        this.policytype = policytype;
    }

    /**
    * 获取-出单归属地（地市）
    * @return citycode
     */
    public String getCitycode() {
        return citycode;
    }

    /**
    * 设置-出单归属地（地市）
    * @paramType java.lang.String
    * @param citycode - 出单归属地（地市）
     */
    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    /**
    * 获取-险种类型
    * @return coveragetype
     */
    public String getCoveragetype() {
        return coveragetype;
    }

    /**
    * 设置-险种类型
    * @paramType java.lang.String
    * @param coveragetype - 险种类型
     */
    public void setCoveragetype(String coveragetype) {
        this.coveragetype = coveragetype;
    }

    /**
    * 获取-号牌种类
    * @return licenseplatetype
     */
    public String getLicenseplatetype() {
        return licenseplatetype;
    }

    /**
    * 设置-号牌种类
    * @paramType java.lang.String
    * @param licenseplatetype - 号牌种类
     */
    public void setLicenseplatetype(String licenseplatetype) {
        this.licenseplatetype = licenseplatetype;
    }

    /**
    * 获取-号牌号码
    * @return licenseplateno
     */
    public String getLicenseplateno() {
        return licenseplateno;
    }

    /**
    * 设置-号牌号码
    * @paramType java.lang.String
    * @param licenseplateno - 号牌号码
     */
    public void setLicenseplateno(String licenseplateno) {
        this.licenseplateno = licenseplateno;
    }

    /**
    * 获取-车架号
    * @return vin
     */
    public String getVin() {
        return vin;
    }

    /**
    * 设置-车架号
    * @paramType java.lang.String
    * @param vin - 车架号
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
    * 获取-发动机号
    * @return engineno
     */
    public String getEngineno() {
        return engineno;
    }

    /**
    * 设置-发动机号
    * @paramType java.lang.String
    * @param engineno - 发动机号
     */
    public void setEngineno(String engineno) {
        this.engineno = engineno;
    }

    /**
    * 获取-终保日期
    * @return expiredate
     */
    public String getExpiredate() {
        return expiredate;
    }

    /**
    * 设置-终保日期
    * @paramType java.lang.String
    * @param expiredate - 终保日期
     */
    public void setExpiredate(String expiredate) {
        this.expiredate = expiredate;
    }

    /**
    * 获取-主投保单号
    * @return businessno
     */
    public String getBusinessno() {
        return businessno;
    }

    /**
    * 设置-主投保单号
    * @paramType java.lang.String
    * @param businessno - 主投保单号
     */
    public void setBusinessno(String businessno) {
        this.businessno = businessno;
    }

    /**
    * 获取-组合险种
    * @return unionclassescode
     */
    public String getUnionclassescode() {
        return unionclassescode;
    }

    /**
    * 设置-组合险种
    * @paramType java.lang.String
    * @param unionclassescode - 组合险种
     */
    public void setUnionclassescode(String unionclassescode) {
        this.unionclassescode = unionclassescode;
    }

    /**
    * 获取-业务类型
    * @return businesstype
     */
    public String getBusinesstype() {
        return businesstype;
    }

    /**
    * 设置-业务类型
    * @paramType java.lang.String
    * @param businesstype - 业务类型
     */
    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype;
    }

    /**
    * 获取-MD5校验值
    * @return md5
     */
    public String getMd5() {
        return md5;
    }

    /**
    * 设置-MD5校验值
    * @paramType java.lang.String
    * @param md5 - MD5校验值
     */
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    /**
    * 获取-状态值
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态值
    * @paramType java.lang.String
    * @param status - 状态值
     */
    public void setStatus(String status) {
        this.status = status;
    }
}