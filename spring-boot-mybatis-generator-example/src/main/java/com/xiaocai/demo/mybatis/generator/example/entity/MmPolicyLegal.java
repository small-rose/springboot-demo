package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_policy_legal
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPolicyLegal {
    /**
     * 主键
     */
    private Long id;

    /**
     * 数据源
     */
    private String datasource;

    /**
     * 业务类型,1:保单,2:赔案,3:手续费,5:准备金
     */
    private String certitype;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 赔案号
     */
    private String claimno;

    /**
     * 序号
     */
    private String serialno;

    /**
     * 起保日期
     */
    private Date startdate;

    /**
     * 终保日期
     */
    private Date enddate;

    /**
     * 签单日期
     */
    private Date signdate;

    /**
     * 录入日期
     */
    private Date inputdate;

    /**
     * 被保险人代码
     */
    private String insuredcode;

    /**
     * 被保险人名称（中文）
     */
    private String insuredname;

    /**
     * 业务员/经办人代码
     */
    private String transactorcode;

    /**
     * 业务险类
     */
    private String classeskind;

    /**
     * 业务险种
     */
    private String classescode;

    /**
     * 风险类别
     */
    private String risktype;

    /**
     * 批量处理号
     */
    private String summaryno;

    /**
     * 预约协议号
     */
    private String totalprotocoltno;

    /**
     * 是否分期缴费
     */
    private String hasplan;

    /**
     * 是否共保 0无共保，1司内/联保，2司外/共保 (东京海上：0无共保，2司外/共保（主保），3司外/共保（从保）)
     */
    private String iscoinsurance;

    /**
     * 共保协议号
     */
    private String masterprotocolno;

    /**
     * 承保数量
     */
    private BigDecimal insurencecount;

    /**
     * 核保员代码
     */
    private String underwritercode;

    /**
     * 展业方式
     */
    private String businesschannel;

    /**
     * 批单类型
     */
    private String endorsetype;

    /**
     * 立案号
     */
    private String caseno;

    /**
     * 车牌号
     */
    private String vehicleno;

    /**
     * 1.初始状态,2:落地成功,3:落地失败
     */
    private String status;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * HIBERNATEVERSION版本号
     */
    private Integer hibernateversion;

    /**
     * 见费出单标识  0：否  1 是
     */
    private String feeflag;

    /**
     * 自购赠予标识      0：否  1 自购 2 赠予 3 捐赠
     */
    private String donateflag;

    /**
     * 预约标识  0：普通 1 ：预约保单  2 ： 卡业务收款单
     */
    private String protocolflag;

    /**
     * 落地失败的日志
     */
    private String errmsg;

    /**
     * 机构代码
     */
    private String unitcode;

    /**
     * 收付交易数据的被保险人名称（英文）
     */
    private String insurednameen;

    /**
     * 保单上的被保险人partyno
     */
    private String insuredpartyno;

    /**
     * 保单上的投保人代码
     */
    private String applicantcode;

    /**
     * 收付交易数据的投保人中文名称
     */
    private String applicantnamecn;

    /**
     * 收付交易数据的投保人英文名称
     */
    private String applicantnameen;

    /**
     * 保单上的投保人partyno
     */
    private String applicantionpartyno;

    /**
     * 投保人是否为日系客户     0：非日系 1：日系
     */
    private String appisjapan;

    /**
     * 境内/境外标识  0 境外  1 境内
     */
    private String domestic;

    /**
     * 进口/出口标识   1  内陆货运险  2  进口货运险  3  出口货运险 
     */
    private String porttype;

    /**
     * 承保期限  000001   短期(一年以内) 000002  一年期 000003  一年以上定期   000004  不定期
     */
    private String insuranceterm;

    /**
     * 投保确认码
     */
    private String confirmsequenceno;

    /**
     * 上传标志 0 不上传 1上传
     */
    private String ifupload;

    /**
     * 出险时间
     */
    private Date damagedate;

    /**
     * 是否预付赔款,0不是预付，1是预付
     */
    private String claimtype;

    /**
     * 结案追加码
     */
    private String claimaddcode;

    /**
     * 经办人名称
     */
    private String transactorname;

    /**
     * 出单员代码
     */
    private String optcode;

    /**
     * 出单员名称
     */
    private String optname;

    /**
     * 单证类型
     */
    private String biztype;

    /**
     * 保险卡号
     */
    private String bizno;

    /**
     * 是否是视同销售：0 否 1 将服务用于非增值税应税项目 2将服务用于集体福利或个人消费 3将自产或购买的服务作为投资，提供给其他单位或个体经营者 4将自产或购买的服务分配给股东或投资者 5将自产或购买的服务无偿赠送给其他单位或个人
     */
    private String equalsale;

    /**
     * 客户类型 0非自然人 1自然人 
     */
    private String customertype;

    /**
     * 代收代付标识：0 否  1 是
     */
    private String ifagentbusiness;

    /**
     * 纳税主体
     */
    private String taxorgtally;

    /**
     * 纳税人代码
     */
    private String taxpayercode;

    /**
     * 纳税人名称
     */
    private String taxpayername;

    /**
     * 纳税人识别号
     */
    private String taxpayer;

    /**
     * 纳税人地址
     */
    private String taxesaddress;

    /**
     * 纳税人电话
     */
    private String taxesphone;

    /**
     * 纳税人手机号
     */
    private String taxesmobilephone;

    /**
     * 纳税人邮箱
     */
    private String taxesemail;

    /**
     * 纳税人开户银行
     */
    private String taxesbankname;

    /**
     * 纳税人开户银行账号
     */
    private String taxesaccountno;

    /**
     * 纳税人身份：01增值税一般纳税人 02增值税小规模纳税人 03非增值税纳税人 04个人 05其他
     */
    private String taxespayertype;

    /**
     * 纳税人证件类型 01身份证、02护照、03军官证、04士兵证、05港澳居民来往内地通行证、06台湾居民来往大陆通行证、07其他
     */
    private String taxescertificatetype;

    /**
     * 纳税人证件号
     */
    private String taxescertificateno;

    /**
     * 开具发票类型：004增值税专用发票 007增值税普通发票 026电子发票 000其他或暂不开票
     */
    private String invoicetype;

    /**
     * 发票代码
     */
    private String invoicecode;

    /**
     * 发票代码
     */
    private String invoiceno;

    /**
     * 开票日期
     */
    private Date invoicedate;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 批次序号
     */
    private String batchserialno;

    /**
     * 联保类型
     */
    private String isjointinsurance;

    /**
     * 联保关联单号
     */
    private String jointinsuranceno;

    /**
     * 业务来源
     */
    private String businesssource;

    /**
     * 团队类型
     */
    private String grouptype;

    /**
     * 发票备注信息
     */
    private String invoiceremark;

    /**
     * 个团标志
     */
    private String groupflag;

    /**
     * 年期标志
     */
    private String periodflag;

    /**
     * 报批号
     */
    private String batchnumber;

    /**
     * 外部系统来源
     */
    private String outdatasource;

    /**
     * 客户来源
     */
    private String customersource;

    /**
     * 投保单号/批改申请单号
     */
    private String businessno;

    /**
     * 报案号
     */
    private String reportno;

    /**
     * 发票开具方式0开全额发票 1 开我方份额发票
     */
    private String invoiceissueway;

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
    * 获取-数据源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-数据源
    * @paramType java.lang.String
    * @param datasource - 数据源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-业务类型,1:保单,2:赔案,3:手续费,5:准备金
    * @return certitype
     */
    public String getCertitype() {
        return certitype;
    }

    /**
    * 设置-业务类型,1:保单,2:赔案,3:手续费,5:准备金
    * @paramType java.lang.String
    * @param certitype - 业务类型,1:保单,2:赔案,3:手续费,5:准备金
     */
    public void setCertitype(String certitype) {
        this.certitype = certitype;
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
    * 获取-赔案号
    * @return claimno
     */
    public String getClaimno() {
        return claimno;
    }

    /**
    * 设置-赔案号
    * @paramType java.lang.String
    * @param claimno - 赔案号
     */
    public void setClaimno(String claimno) {
        this.claimno = claimno;
    }

    /**
    * 获取-序号
    * @return serialno
     */
    public String getSerialno() {
        return serialno;
    }

    /**
    * 设置-序号
    * @paramType java.lang.String
    * @param serialno - 序号
     */
    public void setSerialno(String serialno) {
        this.serialno = serialno;
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
    * 获取-签单日期
    * @return signdate
     */
    public Date getSigndate() {
        return signdate;
    }

    /**
    * 设置-签单日期
    * @paramType java.util.Date
    * @param signdate - 签单日期
     */
    public void setSigndate(Date signdate) {
        this.signdate = signdate;
    }

    /**
    * 获取-录入日期
    * @return inputdate
     */
    public Date getInputdate() {
        return inputdate;
    }

    /**
    * 设置-录入日期
    * @paramType java.util.Date
    * @param inputdate - 录入日期
     */
    public void setInputdate(Date inputdate) {
        this.inputdate = inputdate;
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
    * 获取-被保险人名称（中文）
    * @return insuredname
     */
    public String getInsuredname() {
        return insuredname;
    }

    /**
    * 设置-被保险人名称（中文）
    * @paramType java.lang.String
    * @param insuredname - 被保险人名称（中文）
     */
    public void setInsuredname(String insuredname) {
        this.insuredname = insuredname;
    }

    /**
    * 获取-业务员/经办人代码
    * @return transactorcode
     */
    public String getTransactorcode() {
        return transactorcode;
    }

    /**
    * 设置-业务员/经办人代码
    * @paramType java.lang.String
    * @param transactorcode - 业务员/经办人代码
     */
    public void setTransactorcode(String transactorcode) {
        this.transactorcode = transactorcode;
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
    * 获取-风险类别
    * @return risktype
     */
    public String getRisktype() {
        return risktype;
    }

    /**
    * 设置-风险类别
    * @paramType java.lang.String
    * @param risktype - 风险类别
     */
    public void setRisktype(String risktype) {
        this.risktype = risktype;
    }

    /**
    * 获取-批量处理号
    * @return summaryno
     */
    public String getSummaryno() {
        return summaryno;
    }

    /**
    * 设置-批量处理号
    * @paramType java.lang.String
    * @param summaryno - 批量处理号
     */
    public void setSummaryno(String summaryno) {
        this.summaryno = summaryno;
    }

    /**
    * 获取-预约协议号
    * @return totalprotocoltno
     */
    public String getTotalprotocoltno() {
        return totalprotocoltno;
    }

    /**
    * 设置-预约协议号
    * @paramType java.lang.String
    * @param totalprotocoltno - 预约协议号
     */
    public void setTotalprotocoltno(String totalprotocoltno) {
        this.totalprotocoltno = totalprotocoltno;
    }

    /**
    * 获取-是否分期缴费
    * @return hasplan
     */
    public String getHasplan() {
        return hasplan;
    }

    /**
    * 设置-是否分期缴费
    * @paramType java.lang.String
    * @param hasplan - 是否分期缴费
     */
    public void setHasplan(String hasplan) {
        this.hasplan = hasplan;
    }

    /**
    * 获取-是否共保 0无共保，1司内/联保，2司外/共保 (东京海上：0无共保，2司外/共保（主保），3司外/共保（从保）)
    * @return iscoinsurance
     */
    public String getIscoinsurance() {
        return iscoinsurance;
    }

    /**
    * 设置-是否共保 0无共保，1司内/联保，2司外/共保 (东京海上：0无共保，2司外/共保（主保），3司外/共保（从保）)
    * @paramType java.lang.String
    * @param iscoinsurance - 是否共保 0无共保，1司内/联保，2司外/共保 (东京海上：0无共保，2司外/共保（主保），3司外/共保（从保）)
     */
    public void setIscoinsurance(String iscoinsurance) {
        this.iscoinsurance = iscoinsurance;
    }

    /**
    * 获取-共保协议号
    * @return masterprotocolno
     */
    public String getMasterprotocolno() {
        return masterprotocolno;
    }

    /**
    * 设置-共保协议号
    * @paramType java.lang.String
    * @param masterprotocolno - 共保协议号
     */
    public void setMasterprotocolno(String masterprotocolno) {
        this.masterprotocolno = masterprotocolno;
    }

    /**
    * 获取-承保数量
    * @return insurencecount
     */
    public BigDecimal getInsurencecount() {
        return insurencecount;
    }

    /**
    * 设置-承保数量
    * @paramType java.math.BigDecimal
    * @param insurencecount - 承保数量
     */
    public void setInsurencecount(BigDecimal insurencecount) {
        this.insurencecount = insurencecount;
    }

    /**
    * 获取-核保员代码
    * @return underwritercode
     */
    public String getUnderwritercode() {
        return underwritercode;
    }

    /**
    * 设置-核保员代码
    * @paramType java.lang.String
    * @param underwritercode - 核保员代码
     */
    public void setUnderwritercode(String underwritercode) {
        this.underwritercode = underwritercode;
    }

    /**
    * 获取-展业方式
    * @return businesschannel
     */
    public String getBusinesschannel() {
        return businesschannel;
    }

    /**
    * 设置-展业方式
    * @paramType java.lang.String
    * @param businesschannel - 展业方式
     */
    public void setBusinesschannel(String businesschannel) {
        this.businesschannel = businesschannel;
    }

    /**
    * 获取-批单类型
    * @return endorsetype
     */
    public String getEndorsetype() {
        return endorsetype;
    }

    /**
    * 设置-批单类型
    * @paramType java.lang.String
    * @param endorsetype - 批单类型
     */
    public void setEndorsetype(String endorsetype) {
        this.endorsetype = endorsetype;
    }

    /**
    * 获取-立案号
    * @return caseno
     */
    public String getCaseno() {
        return caseno;
    }

    /**
    * 设置-立案号
    * @paramType java.lang.String
    * @param caseno - 立案号
     */
    public void setCaseno(String caseno) {
        this.caseno = caseno;
    }

    /**
    * 获取-车牌号
    * @return vehicleno
     */
    public String getVehicleno() {
        return vehicleno;
    }

    /**
    * 设置-车牌号
    * @paramType java.lang.String
    * @param vehicleno - 车牌号
     */
    public void setVehicleno(String vehicleno) {
        this.vehicleno = vehicleno;
    }

    /**
    * 获取-1.初始状态,2:落地成功,3:落地失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-1.初始状态,2:落地成功,3:落地失败
    * @paramType java.lang.String
    * @param status - 1.初始状态,2:落地成功,3:落地失败
     */
    public void setStatus(String status) {
        this.status = status;
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

    /**
    * 获取-HIBERNATEVERSION版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATEVERSION版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATEVERSION版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-见费出单标识  0：否  1 是
    * @return feeflag
     */
    public String getFeeflag() {
        return feeflag;
    }

    /**
    * 设置-见费出单标识  0：否  1 是
    * @paramType java.lang.String
    * @param feeflag - 见费出单标识  0：否  1 是
     */
    public void setFeeflag(String feeflag) {
        this.feeflag = feeflag;
    }

    /**
    * 获取-自购赠予标识      0：否  1 自购 2 赠予 3 捐赠
    * @return donateflag
     */
    public String getDonateflag() {
        return donateflag;
    }

    /**
    * 设置-自购赠予标识      0：否  1 自购 2 赠予 3 捐赠
    * @paramType java.lang.String
    * @param donateflag - 自购赠予标识      0：否  1 自购 2 赠予 3 捐赠
     */
    public void setDonateflag(String donateflag) {
        this.donateflag = donateflag;
    }

    /**
    * 获取-预约标识  0：普通 1 ：预约保单  2 ： 卡业务收款单
    * @return protocolflag
     */
    public String getProtocolflag() {
        return protocolflag;
    }

    /**
    * 设置-预约标识  0：普通 1 ：预约保单  2 ： 卡业务收款单
    * @paramType java.lang.String
    * @param protocolflag - 预约标识  0：普通 1 ：预约保单  2 ： 卡业务收款单
     */
    public void setProtocolflag(String protocolflag) {
        this.protocolflag = protocolflag;
    }

    /**
    * 获取-落地失败的日志
    * @return errmsg
     */
    public String getErrmsg() {
        return errmsg;
    }

    /**
    * 设置-落地失败的日志
    * @paramType java.lang.String
    * @param errmsg - 落地失败的日志
     */
    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

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
    * 获取-收付交易数据的被保险人名称（英文）
    * @return insurednameen
     */
    public String getInsurednameen() {
        return insurednameen;
    }

    /**
    * 设置-收付交易数据的被保险人名称（英文）
    * @paramType java.lang.String
    * @param insurednameen - 收付交易数据的被保险人名称（英文）
     */
    public void setInsurednameen(String insurednameen) {
        this.insurednameen = insurednameen;
    }

    /**
    * 获取-保单上的被保险人partyno
    * @return insuredpartyno
     */
    public String getInsuredpartyno() {
        return insuredpartyno;
    }

    /**
    * 设置-保单上的被保险人partyno
    * @paramType java.lang.String
    * @param insuredpartyno - 保单上的被保险人partyno
     */
    public void setInsuredpartyno(String insuredpartyno) {
        this.insuredpartyno = insuredpartyno;
    }

    /**
    * 获取-保单上的投保人代码
    * @return applicantcode
     */
    public String getApplicantcode() {
        return applicantcode;
    }

    /**
    * 设置-保单上的投保人代码
    * @paramType java.lang.String
    * @param applicantcode - 保单上的投保人代码
     */
    public void setApplicantcode(String applicantcode) {
        this.applicantcode = applicantcode;
    }

    /**
    * 获取-收付交易数据的投保人中文名称
    * @return applicantnamecn
     */
    public String getApplicantnamecn() {
        return applicantnamecn;
    }

    /**
    * 设置-收付交易数据的投保人中文名称
    * @paramType java.lang.String
    * @param applicantnamecn - 收付交易数据的投保人中文名称
     */
    public void setApplicantnamecn(String applicantnamecn) {
        this.applicantnamecn = applicantnamecn;
    }

    /**
    * 获取-收付交易数据的投保人英文名称
    * @return applicantnameen
     */
    public String getApplicantnameen() {
        return applicantnameen;
    }

    /**
    * 设置-收付交易数据的投保人英文名称
    * @paramType java.lang.String
    * @param applicantnameen - 收付交易数据的投保人英文名称
     */
    public void setApplicantnameen(String applicantnameen) {
        this.applicantnameen = applicantnameen;
    }

    /**
    * 获取-保单上的投保人partyno
    * @return applicantionpartyno
     */
    public String getApplicantionpartyno() {
        return applicantionpartyno;
    }

    /**
    * 设置-保单上的投保人partyno
    * @paramType java.lang.String
    * @param applicantionpartyno - 保单上的投保人partyno
     */
    public void setApplicantionpartyno(String applicantionpartyno) {
        this.applicantionpartyno = applicantionpartyno;
    }

    /**
    * 获取-投保人是否为日系客户     0：非日系 1：日系
    * @return appisjapan
     */
    public String getAppisjapan() {
        return appisjapan;
    }

    /**
    * 设置-投保人是否为日系客户     0：非日系 1：日系
    * @paramType java.lang.String
    * @param appisjapan - 投保人是否为日系客户     0：非日系 1：日系
     */
    public void setAppisjapan(String appisjapan) {
        this.appisjapan = appisjapan;
    }

    /**
    * 获取-境内/境外标识  0 境外  1 境内
    * @return domestic
     */
    public String getDomestic() {
        return domestic;
    }

    /**
    * 设置-境内/境外标识  0 境外  1 境内
    * @paramType java.lang.String
    * @param domestic - 境内/境外标识  0 境外  1 境内
     */
    public void setDomestic(String domestic) {
        this.domestic = domestic;
    }

    /**
    * 获取-进口/出口标识   1  内陆货运险  2  进口货运险  3  出口货运险 
    * @return porttype
     */
    public String getPorttype() {
        return porttype;
    }

    /**
    * 设置-进口/出口标识   1  内陆货运险  2  进口货运险  3  出口货运险 
    * @paramType java.lang.String
    * @param porttype - 进口/出口标识   1  内陆货运险  2  进口货运险  3  出口货运险 
     */
    public void setPorttype(String porttype) {
        this.porttype = porttype;
    }

    /**
    * 获取-承保期限  000001   短期(一年以内) 000002  一年期 000003  一年以上定期   000004  不定期
    * @return insuranceterm
     */
    public String getInsuranceterm() {
        return insuranceterm;
    }

    /**
    * 设置-承保期限  000001   短期(一年以内) 000002  一年期 000003  一年以上定期   000004  不定期
    * @paramType java.lang.String
    * @param insuranceterm - 承保期限  000001   短期(一年以内) 000002  一年期 000003  一年以上定期   000004  不定期
     */
    public void setInsuranceterm(String insuranceterm) {
        this.insuranceterm = insuranceterm;
    }

    /**
    * 获取-投保确认码
    * @return confirmsequenceno
     */
    public String getConfirmsequenceno() {
        return confirmsequenceno;
    }

    /**
    * 设置-投保确认码
    * @paramType java.lang.String
    * @param confirmsequenceno - 投保确认码
     */
    public void setConfirmsequenceno(String confirmsequenceno) {
        this.confirmsequenceno = confirmsequenceno;
    }

    /**
    * 获取-上传标志 0 不上传 1上传
    * @return ifupload
     */
    public String getIfupload() {
        return ifupload;
    }

    /**
    * 设置-上传标志 0 不上传 1上传
    * @paramType java.lang.String
    * @param ifupload - 上传标志 0 不上传 1上传
     */
    public void setIfupload(String ifupload) {
        this.ifupload = ifupload;
    }

    /**
    * 获取-出险时间
    * @return damagedate
     */
    public Date getDamagedate() {
        return damagedate;
    }

    /**
    * 设置-出险时间
    * @paramType java.util.Date
    * @param damagedate - 出险时间
     */
    public void setDamagedate(Date damagedate) {
        this.damagedate = damagedate;
    }

    /**
    * 获取-是否预付赔款,0不是预付，1是预付
    * @return claimtype
     */
    public String getClaimtype() {
        return claimtype;
    }

    /**
    * 设置-是否预付赔款,0不是预付，1是预付
    * @paramType java.lang.String
    * @param claimtype - 是否预付赔款,0不是预付，1是预付
     */
    public void setClaimtype(String claimtype) {
        this.claimtype = claimtype;
    }

    /**
    * 获取-结案追加码
    * @return claimaddcode
     */
    public String getClaimaddcode() {
        return claimaddcode;
    }

    /**
    * 设置-结案追加码
    * @paramType java.lang.String
    * @param claimaddcode - 结案追加码
     */
    public void setClaimaddcode(String claimaddcode) {
        this.claimaddcode = claimaddcode;
    }

    /**
    * 获取-经办人名称
    * @return transactorname
     */
    public String getTransactorname() {
        return transactorname;
    }

    /**
    * 设置-经办人名称
    * @paramType java.lang.String
    * @param transactorname - 经办人名称
     */
    public void setTransactorname(String transactorname) {
        this.transactorname = transactorname;
    }

    /**
    * 获取-出单员代码
    * @return optcode
     */
    public String getOptcode() {
        return optcode;
    }

    /**
    * 设置-出单员代码
    * @paramType java.lang.String
    * @param optcode - 出单员代码
     */
    public void setOptcode(String optcode) {
        this.optcode = optcode;
    }

    /**
    * 获取-出单员名称
    * @return optname
     */
    public String getOptname() {
        return optname;
    }

    /**
    * 设置-出单员名称
    * @paramType java.lang.String
    * @param optname - 出单员名称
     */
    public void setOptname(String optname) {
        this.optname = optname;
    }

    /**
    * 获取-单证类型
    * @return biztype
     */
    public String getBiztype() {
        return biztype;
    }

    /**
    * 设置-单证类型
    * @paramType java.lang.String
    * @param biztype - 单证类型
     */
    public void setBiztype(String biztype) {
        this.biztype = biztype;
    }

    /**
    * 获取-保险卡号
    * @return bizno
     */
    public String getBizno() {
        return bizno;
    }

    /**
    * 设置-保险卡号
    * @paramType java.lang.String
    * @param bizno - 保险卡号
     */
    public void setBizno(String bizno) {
        this.bizno = bizno;
    }

    /**
    * 获取-是否是视同销售：0 否 1 将服务用于非增值税应税项目 2将服务用于集体福利或个人消费 3将自产或购买的服务作为投资，提供给其他单位或个体经营者 4将自产或购买的服务分配给股东或投资者 5将自产或购买的服务无偿赠送给其他单位或个人
    * @return equalsale
     */
    public String getEqualsale() {
        return equalsale;
    }

    /**
    * 设置-是否是视同销售：0 否 1 将服务用于非增值税应税项目 2将服务用于集体福利或个人消费 3将自产或购买的服务作为投资，提供给其他单位或个体经营者 4将自产或购买的服务分配给股东或投资者 5将自产或购买的服务无偿赠送给其他单位或个人
    * @paramType java.lang.String
    * @param equalsale - 是否是视同销售：0 否 1 将服务用于非增值税应税项目 2将服务用于集体福利或个人消费 3将自产或购买的服务作为投资，提供给其他单位或个体经营者 4将自产或购买的服务分配给股东或投资者 5将自产或购买的服务无偿赠送给其他单位或个人
     */
    public void setEqualsale(String equalsale) {
        this.equalsale = equalsale;
    }

    /**
    * 获取-客户类型 0非自然人 1自然人 
    * @return customertype
     */
    public String getCustomertype() {
        return customertype;
    }

    /**
    * 设置-客户类型 0非自然人 1自然人 
    * @paramType java.lang.String
    * @param customertype - 客户类型 0非自然人 1自然人 
     */
    public void setCustomertype(String customertype) {
        this.customertype = customertype;
    }

    /**
    * 获取-代收代付标识：0 否  1 是
    * @return ifagentbusiness
     */
    public String getIfagentbusiness() {
        return ifagentbusiness;
    }

    /**
    * 设置-代收代付标识：0 否  1 是
    * @paramType java.lang.String
    * @param ifagentbusiness - 代收代付标识：0 否  1 是
     */
    public void setIfagentbusiness(String ifagentbusiness) {
        this.ifagentbusiness = ifagentbusiness;
    }

    /**
    * 获取-纳税主体
    * @return taxorgtally
     */
    public String getTaxorgtally() {
        return taxorgtally;
    }

    /**
    * 设置-纳税主体
    * @paramType java.lang.String
    * @param taxorgtally - 纳税主体
     */
    public void setTaxorgtally(String taxorgtally) {
        this.taxorgtally = taxorgtally;
    }

    /**
    * 获取-纳税人代码
    * @return taxpayercode
     */
    public String getTaxpayercode() {
        return taxpayercode;
    }

    /**
    * 设置-纳税人代码
    * @paramType java.lang.String
    * @param taxpayercode - 纳税人代码
     */
    public void setTaxpayercode(String taxpayercode) {
        this.taxpayercode = taxpayercode;
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
    * 获取-纳税人识别号
    * @return taxpayer
     */
    public String getTaxpayer() {
        return taxpayer;
    }

    /**
    * 设置-纳税人识别号
    * @paramType java.lang.String
    * @param taxpayer - 纳税人识别号
     */
    public void setTaxpayer(String taxpayer) {
        this.taxpayer = taxpayer;
    }

    /**
    * 获取-纳税人地址
    * @return taxesaddress
     */
    public String getTaxesaddress() {
        return taxesaddress;
    }

    /**
    * 设置-纳税人地址
    * @paramType java.lang.String
    * @param taxesaddress - 纳税人地址
     */
    public void setTaxesaddress(String taxesaddress) {
        this.taxesaddress = taxesaddress;
    }

    /**
    * 获取-纳税人电话
    * @return taxesphone
     */
    public String getTaxesphone() {
        return taxesphone;
    }

    /**
    * 设置-纳税人电话
    * @paramType java.lang.String
    * @param taxesphone - 纳税人电话
     */
    public void setTaxesphone(String taxesphone) {
        this.taxesphone = taxesphone;
    }

    /**
    * 获取-纳税人手机号
    * @return taxesmobilephone
     */
    public String getTaxesmobilephone() {
        return taxesmobilephone;
    }

    /**
    * 设置-纳税人手机号
    * @paramType java.lang.String
    * @param taxesmobilephone - 纳税人手机号
     */
    public void setTaxesmobilephone(String taxesmobilephone) {
        this.taxesmobilephone = taxesmobilephone;
    }

    /**
    * 获取-纳税人邮箱
    * @return taxesemail
     */
    public String getTaxesemail() {
        return taxesemail;
    }

    /**
    * 设置-纳税人邮箱
    * @paramType java.lang.String
    * @param taxesemail - 纳税人邮箱
     */
    public void setTaxesemail(String taxesemail) {
        this.taxesemail = taxesemail;
    }

    /**
    * 获取-纳税人开户银行
    * @return taxesbankname
     */
    public String getTaxesbankname() {
        return taxesbankname;
    }

    /**
    * 设置-纳税人开户银行
    * @paramType java.lang.String
    * @param taxesbankname - 纳税人开户银行
     */
    public void setTaxesbankname(String taxesbankname) {
        this.taxesbankname = taxesbankname;
    }

    /**
    * 获取-纳税人开户银行账号
    * @return taxesaccountno
     */
    public String getTaxesaccountno() {
        return taxesaccountno;
    }

    /**
    * 设置-纳税人开户银行账号
    * @paramType java.lang.String
    * @param taxesaccountno - 纳税人开户银行账号
     */
    public void setTaxesaccountno(String taxesaccountno) {
        this.taxesaccountno = taxesaccountno;
    }

    /**
    * 获取-纳税人身份：01增值税一般纳税人 02增值税小规模纳税人 03非增值税纳税人 04个人 05其他
    * @return taxespayertype
     */
    public String getTaxespayertype() {
        return taxespayertype;
    }

    /**
    * 设置-纳税人身份：01增值税一般纳税人 02增值税小规模纳税人 03非增值税纳税人 04个人 05其他
    * @paramType java.lang.String
    * @param taxespayertype - 纳税人身份：01增值税一般纳税人 02增值税小规模纳税人 03非增值税纳税人 04个人 05其他
     */
    public void setTaxespayertype(String taxespayertype) {
        this.taxespayertype = taxespayertype;
    }

    /**
    * 获取-纳税人证件类型 01身份证、02护照、03军官证、04士兵证、05港澳居民来往内地通行证、06台湾居民来往大陆通行证、07其他
    * @return taxescertificatetype
     */
    public String getTaxescertificatetype() {
        return taxescertificatetype;
    }

    /**
    * 设置-纳税人证件类型 01身份证、02护照、03军官证、04士兵证、05港澳居民来往内地通行证、06台湾居民来往大陆通行证、07其他
    * @paramType java.lang.String
    * @param taxescertificatetype - 纳税人证件类型 01身份证、02护照、03军官证、04士兵证、05港澳居民来往内地通行证、06台湾居民来往大陆通行证、07其他
     */
    public void setTaxescertificatetype(String taxescertificatetype) {
        this.taxescertificatetype = taxescertificatetype;
    }

    /**
    * 获取-纳税人证件号
    * @return taxescertificateno
     */
    public String getTaxescertificateno() {
        return taxescertificateno;
    }

    /**
    * 设置-纳税人证件号
    * @paramType java.lang.String
    * @param taxescertificateno - 纳税人证件号
     */
    public void setTaxescertificateno(String taxescertificateno) {
        this.taxescertificateno = taxescertificateno;
    }

    /**
    * 获取-开具发票类型：004增值税专用发票 007增值税普通发票 026电子发票 000其他或暂不开票
    * @return invoicetype
     */
    public String getInvoicetype() {
        return invoicetype;
    }

    /**
    * 设置-开具发票类型：004增值税专用发票 007增值税普通发票 026电子发票 000其他或暂不开票
    * @paramType java.lang.String
    * @param invoicetype - 开具发票类型：004增值税专用发票 007增值税普通发票 026电子发票 000其他或暂不开票
     */
    public void setInvoicetype(String invoicetype) {
        this.invoicetype = invoicetype;
    }

    /**
    * 获取-发票代码
    * @return invoicecode
     */
    public String getInvoicecode() {
        return invoicecode;
    }

    /**
    * 设置-发票代码
    * @paramType java.lang.String
    * @param invoicecode - 发票代码
     */
    public void setInvoicecode(String invoicecode) {
        this.invoicecode = invoicecode;
    }

    /**
    * 获取-发票代码
    * @return invoiceno
     */
    public String getInvoiceno() {
        return invoiceno;
    }

    /**
    * 设置-发票代码
    * @paramType java.lang.String
    * @param invoiceno - 发票代码
     */
    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    /**
    * 获取-开票日期
    * @return invoicedate
     */
    public Date getInvoicedate() {
        return invoicedate;
    }

    /**
    * 设置-开票日期
    * @paramType java.util.Date
    * @param invoicedate - 开票日期
     */
    public void setInvoicedate(Date invoicedate) {
        this.invoicedate = invoicedate;
    }

    /**
    * 获取-批次号
    * @return batchid
     */
    public String getBatchid() {
        return batchid;
    }

    /**
    * 设置-批次号
    * @paramType java.lang.String
    * @param batchid - 批次号
     */
    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    /**
    * 获取-批次序号
    * @return batchserialno
     */
    public String getBatchserialno() {
        return batchserialno;
    }

    /**
    * 设置-批次序号
    * @paramType java.lang.String
    * @param batchserialno - 批次序号
     */
    public void setBatchserialno(String batchserialno) {
        this.batchserialno = batchserialno;
    }

    /**
    * 获取-联保类型
    * @return isjointinsurance
     */
    public String getIsjointinsurance() {
        return isjointinsurance;
    }

    /**
    * 设置-联保类型
    * @paramType java.lang.String
    * @param isjointinsurance - 联保类型
     */
    public void setIsjointinsurance(String isjointinsurance) {
        this.isjointinsurance = isjointinsurance;
    }

    /**
    * 获取-联保关联单号
    * @return jointinsuranceno
     */
    public String getJointinsuranceno() {
        return jointinsuranceno;
    }

    /**
    * 设置-联保关联单号
    * @paramType java.lang.String
    * @param jointinsuranceno - 联保关联单号
     */
    public void setJointinsuranceno(String jointinsuranceno) {
        this.jointinsuranceno = jointinsuranceno;
    }

    /**
    * 获取-业务来源
    * @return businesssource
     */
    public String getBusinesssource() {
        return businesssource;
    }

    /**
    * 设置-业务来源
    * @paramType java.lang.String
    * @param businesssource - 业务来源
     */
    public void setBusinesssource(String businesssource) {
        this.businesssource = businesssource;
    }

    /**
    * 获取-团队类型
    * @return grouptype
     */
    public String getGrouptype() {
        return grouptype;
    }

    /**
    * 设置-团队类型
    * @paramType java.lang.String
    * @param grouptype - 团队类型
     */
    public void setGrouptype(String grouptype) {
        this.grouptype = grouptype;
    }

    /**
    * 获取-发票备注信息
    * @return invoiceremark
     */
    public String getInvoiceremark() {
        return invoiceremark;
    }

    /**
    * 设置-发票备注信息
    * @paramType java.lang.String
    * @param invoiceremark - 发票备注信息
     */
    public void setInvoiceremark(String invoiceremark) {
        this.invoiceremark = invoiceremark;
    }

    /**
    * 获取-个团标志
    * @return groupflag
     */
    public String getGroupflag() {
        return groupflag;
    }

    /**
    * 设置-个团标志
    * @paramType java.lang.String
    * @param groupflag - 个团标志
     */
    public void setGroupflag(String groupflag) {
        this.groupflag = groupflag;
    }

    /**
    * 获取-年期标志
    * @return periodflag
     */
    public String getPeriodflag() {
        return periodflag;
    }

    /**
    * 设置-年期标志
    * @paramType java.lang.String
    * @param periodflag - 年期标志
     */
    public void setPeriodflag(String periodflag) {
        this.periodflag = periodflag;
    }

    /**
    * 获取-报批号
    * @return batchnumber
     */
    public String getBatchnumber() {
        return batchnumber;
    }

    /**
    * 设置-报批号
    * @paramType java.lang.String
    * @param batchnumber - 报批号
     */
    public void setBatchnumber(String batchnumber) {
        this.batchnumber = batchnumber;
    }

    /**
    * 获取-外部系统来源
    * @return outdatasource
     */
    public String getOutdatasource() {
        return outdatasource;
    }

    /**
    * 设置-外部系统来源
    * @paramType java.lang.String
    * @param outdatasource - 外部系统来源
     */
    public void setOutdatasource(String outdatasource) {
        this.outdatasource = outdatasource;
    }

    /**
    * 获取-客户来源
    * @return customersource
     */
    public String getCustomersource() {
        return customersource;
    }

    /**
    * 设置-客户来源
    * @paramType java.lang.String
    * @param customersource - 客户来源
     */
    public void setCustomersource(String customersource) {
        this.customersource = customersource;
    }

    /**
    * 获取-投保单号/批改申请单号
    * @return businessno
     */
    public String getBusinessno() {
        return businessno;
    }

    /**
    * 设置-投保单号/批改申请单号
    * @paramType java.lang.String
    * @param businessno - 投保单号/批改申请单号
     */
    public void setBusinessno(String businessno) {
        this.businessno = businessno;
    }

    /**
    * 获取-报案号
    * @return reportno
     */
    public String getReportno() {
        return reportno;
    }

    /**
    * 设置-报案号
    * @paramType java.lang.String
    * @param reportno - 报案号
     */
    public void setReportno(String reportno) {
        this.reportno = reportno;
    }

    /**
    * 获取-发票开具方式0开全额发票 1 开我方份额发票
    * @return invoiceissueway
     */
    public String getInvoiceissueway() {
        return invoiceissueway;
    }

    /**
    * 设置-发票开具方式0开全额发票 1 开我方份额发票
    * @paramType java.lang.String
    * @param invoiceissueway - 发票开具方式0开全额发票 1 开我方份额发票
     */
    public void setInvoiceissueway(String invoiceissueway) {
        this.invoiceissueway = invoiceissueway;
    }
}