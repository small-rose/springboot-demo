package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_applyfee_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmApplyfeeTd {
    /**
     * 主键
     */
    private Long seqfeelist;

    /**
     * 手续费接口主表序号
     */
    private Long seqfee;

    /**
     * 费用提取清单号
     */
    private String applyno;

    /**
     * 分公司代码
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
     * 报账清单号
     */
    private String renderno;

    /**
     * 状态
     */
    private String status;

    /**
     * 报销机构
     */
    private String unitcode;

    /**
     * 报销部门
     */
    private String deptcode;

    /**
     * 代理点代码
     */
    private String agentcode;

    /**
     * 代理点名称
     */
    private String agentname;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 费用类型
     */
    private String feetype;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 业务类型1
     */
    private String businesstype1;

    /**
     * 业务类型2
     */
    private String businesstype2;

    /**
     * 业务险种代码
     */
    private String classescode;

    /**
     * 风险类别
     */
    private String risktype;

    /**
     * 渠道
     */
    private String channel;

    /**
     * 总帐日期
     */
    private Date glDate;

    /**
     * 支付对象代码
     */
    private String handlercode;

    /**
     * 支付对象名称
     */
    private String handlername;

    /**
     * 提取人代码
     */
    private String applycode;

    /**
     * 提取日期
     */
    private Date applydate;

    /**
     * 核对人代码
     */
    private String checkcode;

    /**
     * 核对日期
     */
    private Date checkdate;

    /**
     * 复核标记
     */
    private String ifcheck;

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
     * 数据来源
     */
    private String datasource;

    /**
     * 生效日期
     */
    private Date effectdate;

    /**
     * 核销状态
     */
    private String opstatus;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 业务唯一主键
     */
    private String custseq;

    /**
     * 被保险人代码
     */
    private String insuredcode;

    /**
     * 被保险人名称（中文）
     */
    private String insuredname;

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
     * 境内/境外标识  0：境外  1：境内
     */
    private String domestic;

    /**
     * 进口/出口标识   1  内陆货运险  2  进口货运险  3  出口货运险 
     */
    private String porttype;

    /**
     * 账单号
     */
    private String billno;

    /**
     * 冲销号 为红冲数据，所红冲原记录的唯一流水号
     */
    private String offsetno;

    /**
     * 计划缴费日期
     */
    private Date plandate;

    /**
     * 收付交易数据的客户名称（英文
     */
    private String customernameen;

    /**
     * 客户partyno
     */
    private String customerpartyno;

    /**
     * 收付交易数据的客户是否为日系客户
     */
    private String custisjapan;

    /**
     * 代理点/经纪公司名称（中文）
     */
    private String agentnamecn;

    /**
     * 代理点/经纪公司名称（英文）
     */
    private String agentnameen;

    /**
     * 代理点/经纪公司partyno
     */
    private String agentpartyno;

    /**
     * 0无共保，2司外/共保（主保），3司外/共保（从保） 用于东京海上
     */
    private String contracttype;

    /**
     * 客户账户名称
     */
    private String custaccountname;

    /**
     * 客户账户名称(英文)
     */
    private String custaccountnameen;

    /**
     * 客户开户行代码（开户行联行号）
     */
    private String custbankno;

    /**
     * 银行名称
     */
    private String bankname;

    /**
     * 客户帐号
     */
    private String custaccountno;

    /**
     * 业务险类
     */
    private String classeskind;

    /**
     * 承保期限  000001   短期(一年以内) 000002  一年期 000003  一年以上定期   000004  不定期
     */
    private String insuranceterm;

    /**
     * 已核销金额
     */
    private BigDecimal usedamount;

    /**
     * 业务性质
     */
    private String datatype;

    /**
     * 是否做子险拆分 0 不拆分 1拆分
     */
    private String issplitted;

    /**
     * 纳税主体
     */
    private String taxorgtally;

    /**
     * 进项税额转出
     */
    private BigDecimal taxesamountout;

    /**
     * 税额
     */
    private BigDecimal taxesamount;

    /**
     * 业务来源
     */
    private String businesssource;

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
     * 纳税人身份
     */
    private String taxespayertype;

    /**
     * 纳税人证件类型
     */
    private String taxescertificatetype;

    /**
     * 纳税人证件号码
     */
    private String taxescertificateno;

    /**
     * 开具发票类型
     */
    private String invoicetype;

    /**
     * 发票备注信息
     */
    private String invoiceremark;

    /**
     * 代理人类型，0 专业代理 1 经纪公司  2 兼业代理 3 个人代理
     */
    private String agenttype;

    /**
     * 车辆使用性质
     */
    private String useporperty;

    /**
     * 车辆种类
     */
    private String vehkind;

    /**
     * 车辆规格特性
     */
    private String characteristics;

    /**
     * 车辆用途
     */
    private String carusetype;

    /**
     * 序号
     */
    private BigDecimal serialno;

    /**
     * 挂账兑换人民币汇率
     */
    private BigDecimal exchangerate;

    /**
    * 获取-主键
    * @return seqfeelist
     */
    public Long getSeqfeelist() {
        return seqfeelist;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param seqfeelist - 主键
     */
    public void setSeqfeelist(Long seqfeelist) {
        this.seqfeelist = seqfeelist;
    }

    /**
    * 获取-手续费接口主表序号
    * @return seqfee
     */
    public Long getSeqfee() {
        return seqfee;
    }

    /**
    * 设置-手续费接口主表序号
    * @paramType java.lang.Long
    * @param seqfee - 手续费接口主表序号
     */
    public void setSeqfee(Long seqfee) {
        this.seqfee = seqfee;
    }

    /**
    * 获取-费用提取清单号
    * @return applyno
     */
    public String getApplyno() {
        return applyno;
    }

    /**
    * 设置-费用提取清单号
    * @paramType java.lang.String
    * @param applyno - 费用提取清单号
     */
    public void setApplyno(String applyno) {
        this.applyno = applyno;
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
    * 获取-报账清单号
    * @return renderno
     */
    public String getRenderno() {
        return renderno;
    }

    /**
    * 设置-报账清单号
    * @paramType java.lang.String
    * @param renderno - 报账清单号
     */
    public void setRenderno(String renderno) {
        this.renderno = renderno;
    }

    /**
    * 获取-状态
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态
    * @paramType java.lang.String
    * @param status - 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-报销机构
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-报销机构
    * @paramType java.lang.String
    * @param unitcode - 报销机构
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    /**
    * 获取-报销部门
    * @return deptcode
     */
    public String getDeptcode() {
        return deptcode;
    }

    /**
    * 设置-报销部门
    * @paramType java.lang.String
    * @param deptcode - 报销部门
     */
    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
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
    * 获取-代理点名称
    * @return agentname
     */
    public String getAgentname() {
        return agentname;
    }

    /**
    * 设置-代理点名称
    * @paramType java.lang.String
    * @param agentname - 代理点名称
     */
    public void setAgentname(String agentname) {
        this.agentname = agentname;
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
    * 获取-费用类型
    * @return feetype
     */
    public String getFeetype() {
        return feetype;
    }

    /**
    * 设置-费用类型
    * @paramType java.lang.String
    * @param feetype - 费用类型
     */
    public void setFeetype(String feetype) {
        this.feetype = feetype;
    }

    /**
    * 获取-币种
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种
    * @paramType java.lang.String
    * @param currencycode - 币种
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-业务类型1
    * @return businesstype1
     */
    public String getBusinesstype1() {
        return businesstype1;
    }

    /**
    * 设置-业务类型1
    * @paramType java.lang.String
    * @param businesstype1 - 业务类型1
     */
    public void setBusinesstype1(String businesstype1) {
        this.businesstype1 = businesstype1;
    }

    /**
    * 获取-业务类型2
    * @return businesstype2
     */
    public String getBusinesstype2() {
        return businesstype2;
    }

    /**
    * 设置-业务类型2
    * @paramType java.lang.String
    * @param businesstype2 - 业务类型2
     */
    public void setBusinesstype2(String businesstype2) {
        this.businesstype2 = businesstype2;
    }

    /**
    * 获取-业务险种代码
    * @return classescode
     */
    public String getClassescode() {
        return classescode;
    }

    /**
    * 设置-业务险种代码
    * @paramType java.lang.String
    * @param classescode - 业务险种代码
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
    * 获取-渠道
    * @return channel
     */
    public String getChannel() {
        return channel;
    }

    /**
    * 设置-渠道
    * @paramType java.lang.String
    * @param channel - 渠道
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
    * 获取-总帐日期
    * @return glDate
     */
    public Date getGlDate() {
        return glDate;
    }

    /**
    * 设置-总帐日期
    * @paramType java.util.Date
    * @param glDate - 总帐日期
     */
    public void setGlDate(Date glDate) {
        this.glDate = glDate;
    }

    /**
    * 获取-支付对象代码
    * @return handlercode
     */
    public String getHandlercode() {
        return handlercode;
    }

    /**
    * 设置-支付对象代码
    * @paramType java.lang.String
    * @param handlercode - 支付对象代码
     */
    public void setHandlercode(String handlercode) {
        this.handlercode = handlercode;
    }

    /**
    * 获取-支付对象名称
    * @return handlername
     */
    public String getHandlername() {
        return handlername;
    }

    /**
    * 设置-支付对象名称
    * @paramType java.lang.String
    * @param handlername - 支付对象名称
     */
    public void setHandlername(String handlername) {
        this.handlername = handlername;
    }

    /**
    * 获取-提取人代码
    * @return applycode
     */
    public String getApplycode() {
        return applycode;
    }

    /**
    * 设置-提取人代码
    * @paramType java.lang.String
    * @param applycode - 提取人代码
     */
    public void setApplycode(String applycode) {
        this.applycode = applycode;
    }

    /**
    * 获取-提取日期
    * @return applydate
     */
    public Date getApplydate() {
        return applydate;
    }

    /**
    * 设置-提取日期
    * @paramType java.util.Date
    * @param applydate - 提取日期
     */
    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    /**
    * 获取-核对人代码
    * @return checkcode
     */
    public String getCheckcode() {
        return checkcode;
    }

    /**
    * 设置-核对人代码
    * @paramType java.lang.String
    * @param checkcode - 核对人代码
     */
    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }

    /**
    * 获取-核对日期
    * @return checkdate
     */
    public Date getCheckdate() {
        return checkdate;
    }

    /**
    * 设置-核对日期
    * @paramType java.util.Date
    * @param checkdate - 核对日期
     */
    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    /**
    * 获取-复核标记
    * @return ifcheck
     */
    public String getIfcheck() {
        return ifcheck;
    }

    /**
    * 设置-复核标记
    * @paramType java.lang.String
    * @param ifcheck - 复核标记
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
    * 获取-数据来源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-数据来源
    * @paramType java.lang.String
    * @param datasource - 数据来源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-生效日期
    * @return effectdate
     */
    public Date getEffectdate() {
        return effectdate;
    }

    /**
    * 设置-生效日期
    * @paramType java.util.Date
    * @param effectdate - 生效日期
     */
    public void setEffectdate(Date effectdate) {
        this.effectdate = effectdate;
    }

    /**
    * 获取-核销状态
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-核销状态
    * @paramType java.lang.String
    * @param opstatus - 核销状态
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
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
    * 获取-业务唯一主键
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-业务唯一主键
    * @paramType java.lang.String
    * @param custseq - 业务唯一主键
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
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
    * 获取-境内/境外标识  0：境外  1：境内
    * @return domestic
     */
    public String getDomestic() {
        return domestic;
    }

    /**
    * 设置-境内/境外标识  0：境外  1：境内
    * @paramType java.lang.String
    * @param domestic - 境内/境外标识  0：境外  1：境内
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
    * 获取-账单号
    * @return billno
     */
    public String getBillno() {
        return billno;
    }

    /**
    * 设置-账单号
    * @paramType java.lang.String
    * @param billno - 账单号
     */
    public void setBillno(String billno) {
        this.billno = billno;
    }

    /**
    * 获取-冲销号 为红冲数据，所红冲原记录的唯一流水号
    * @return offsetno
     */
    public String getOffsetno() {
        return offsetno;
    }

    /**
    * 设置-冲销号 为红冲数据，所红冲原记录的唯一流水号
    * @paramType java.lang.String
    * @param offsetno - 冲销号 为红冲数据，所红冲原记录的唯一流水号
     */
    public void setOffsetno(String offsetno) {
        this.offsetno = offsetno;
    }

    /**
    * 获取-计划缴费日期
    * @return plandate
     */
    public Date getPlandate() {
        return plandate;
    }

    /**
    * 设置-计划缴费日期
    * @paramType java.util.Date
    * @param plandate - 计划缴费日期
     */
    public void setPlandate(Date plandate) {
        this.plandate = plandate;
    }

    /**
    * 获取-收付交易数据的客户名称（英文
    * @return customernameen
     */
    public String getCustomernameen() {
        return customernameen;
    }

    /**
    * 设置-收付交易数据的客户名称（英文
    * @paramType java.lang.String
    * @param customernameen - 收付交易数据的客户名称（英文
     */
    public void setCustomernameen(String customernameen) {
        this.customernameen = customernameen;
    }

    /**
    * 获取-客户partyno
    * @return customerpartyno
     */
    public String getCustomerpartyno() {
        return customerpartyno;
    }

    /**
    * 设置-客户partyno
    * @paramType java.lang.String
    * @param customerpartyno - 客户partyno
     */
    public void setCustomerpartyno(String customerpartyno) {
        this.customerpartyno = customerpartyno;
    }

    /**
    * 获取-收付交易数据的客户是否为日系客户
    * @return custisjapan
     */
    public String getCustisjapan() {
        return custisjapan;
    }

    /**
    * 设置-收付交易数据的客户是否为日系客户
    * @paramType java.lang.String
    * @param custisjapan - 收付交易数据的客户是否为日系客户
     */
    public void setCustisjapan(String custisjapan) {
        this.custisjapan = custisjapan;
    }

    /**
    * 获取-代理点/经纪公司名称（中文）
    * @return agentnamecn
     */
    public String getAgentnamecn() {
        return agentnamecn;
    }

    /**
    * 设置-代理点/经纪公司名称（中文）
    * @paramType java.lang.String
    * @param agentnamecn - 代理点/经纪公司名称（中文）
     */
    public void setAgentnamecn(String agentnamecn) {
        this.agentnamecn = agentnamecn;
    }

    /**
    * 获取-代理点/经纪公司名称（英文）
    * @return agentnameen
     */
    public String getAgentnameen() {
        return agentnameen;
    }

    /**
    * 设置-代理点/经纪公司名称（英文）
    * @paramType java.lang.String
    * @param agentnameen - 代理点/经纪公司名称（英文）
     */
    public void setAgentnameen(String agentnameen) {
        this.agentnameen = agentnameen;
    }

    /**
    * 获取-代理点/经纪公司partyno
    * @return agentpartyno
     */
    public String getAgentpartyno() {
        return agentpartyno;
    }

    /**
    * 设置-代理点/经纪公司partyno
    * @paramType java.lang.String
    * @param agentpartyno - 代理点/经纪公司partyno
     */
    public void setAgentpartyno(String agentpartyno) {
        this.agentpartyno = agentpartyno;
    }

    /**
    * 获取-0无共保，2司外/共保（主保），3司外/共保（从保） 用于东京海上
    * @return contracttype
     */
    public String getContracttype() {
        return contracttype;
    }

    /**
    * 设置-0无共保，2司外/共保（主保），3司外/共保（从保） 用于东京海上
    * @paramType java.lang.String
    * @param contracttype - 0无共保，2司外/共保（主保），3司外/共保（从保） 用于东京海上
     */
    public void setContracttype(String contracttype) {
        this.contracttype = contracttype;
    }

    /**
    * 获取-客户账户名称
    * @return custaccountname
     */
    public String getCustaccountname() {
        return custaccountname;
    }

    /**
    * 设置-客户账户名称
    * @paramType java.lang.String
    * @param custaccountname - 客户账户名称
     */
    public void setCustaccountname(String custaccountname) {
        this.custaccountname = custaccountname;
    }

    /**
    * 获取-客户账户名称(英文)
    * @return custaccountnameen
     */
    public String getCustaccountnameen() {
        return custaccountnameen;
    }

    /**
    * 设置-客户账户名称(英文)
    * @paramType java.lang.String
    * @param custaccountnameen - 客户账户名称(英文)
     */
    public void setCustaccountnameen(String custaccountnameen) {
        this.custaccountnameen = custaccountnameen;
    }

    /**
    * 获取-客户开户行代码（开户行联行号）
    * @return custbankno
     */
    public String getCustbankno() {
        return custbankno;
    }

    /**
    * 设置-客户开户行代码（开户行联行号）
    * @paramType java.lang.String
    * @param custbankno - 客户开户行代码（开户行联行号）
     */
    public void setCustbankno(String custbankno) {
        this.custbankno = custbankno;
    }

    /**
    * 获取-银行名称
    * @return bankname
     */
    public String getBankname() {
        return bankname;
    }

    /**
    * 设置-银行名称
    * @paramType java.lang.String
    * @param bankname - 银行名称
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
    * 获取-客户帐号
    * @return custaccountno
     */
    public String getCustaccountno() {
        return custaccountno;
    }

    /**
    * 设置-客户帐号
    * @paramType java.lang.String
    * @param custaccountno - 客户帐号
     */
    public void setCustaccountno(String custaccountno) {
        this.custaccountno = custaccountno;
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
    * 获取-已核销金额
    * @return usedamount
     */
    public BigDecimal getUsedamount() {
        return usedamount;
    }

    /**
    * 设置-已核销金额
    * @paramType java.math.BigDecimal
    * @param usedamount - 已核销金额
     */
    public void setUsedamount(BigDecimal usedamount) {
        this.usedamount = usedamount;
    }

    /**
    * 获取-业务性质
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-业务性质
    * @paramType java.lang.String
    * @param datatype - 业务性质
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    /**
    * 获取-是否做子险拆分 0 不拆分 1拆分
    * @return issplitted
     */
    public String getIssplitted() {
        return issplitted;
    }

    /**
    * 设置-是否做子险拆分 0 不拆分 1拆分
    * @paramType java.lang.String
    * @param issplitted - 是否做子险拆分 0 不拆分 1拆分
     */
    public void setIssplitted(String issplitted) {
        this.issplitted = issplitted;
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
    * 获取-进项税额转出
    * @return taxesamountout
     */
    public BigDecimal getTaxesamountout() {
        return taxesamountout;
    }

    /**
    * 设置-进项税额转出
    * @paramType java.math.BigDecimal
    * @param taxesamountout - 进项税额转出
     */
    public void setTaxesamountout(BigDecimal taxesamountout) {
        this.taxesamountout = taxesamountout;
    }

    /**
    * 获取-税额
    * @return taxesamount
     */
    public BigDecimal getTaxesamount() {
        return taxesamount;
    }

    /**
    * 设置-税额
    * @paramType java.math.BigDecimal
    * @param taxesamount - 税额
     */
    public void setTaxesamount(BigDecimal taxesamount) {
        this.taxesamount = taxesamount;
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
    * 获取-纳税人身份
    * @return taxespayertype
     */
    public String getTaxespayertype() {
        return taxespayertype;
    }

    /**
    * 设置-纳税人身份
    * @paramType java.lang.String
    * @param taxespayertype - 纳税人身份
     */
    public void setTaxespayertype(String taxespayertype) {
        this.taxespayertype = taxespayertype;
    }

    /**
    * 获取-纳税人证件类型
    * @return taxescertificatetype
     */
    public String getTaxescertificatetype() {
        return taxescertificatetype;
    }

    /**
    * 设置-纳税人证件类型
    * @paramType java.lang.String
    * @param taxescertificatetype - 纳税人证件类型
     */
    public void setTaxescertificatetype(String taxescertificatetype) {
        this.taxescertificatetype = taxescertificatetype;
    }

    /**
    * 获取-纳税人证件号码
    * @return taxescertificateno
     */
    public String getTaxescertificateno() {
        return taxescertificateno;
    }

    /**
    * 设置-纳税人证件号码
    * @paramType java.lang.String
    * @param taxescertificateno - 纳税人证件号码
     */
    public void setTaxescertificateno(String taxescertificateno) {
        this.taxescertificateno = taxescertificateno;
    }

    /**
    * 获取-开具发票类型
    * @return invoicetype
     */
    public String getInvoicetype() {
        return invoicetype;
    }

    /**
    * 设置-开具发票类型
    * @paramType java.lang.String
    * @param invoicetype - 开具发票类型
     */
    public void setInvoicetype(String invoicetype) {
        this.invoicetype = invoicetype;
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
    * 获取-代理人类型，0 专业代理 1 经纪公司  2 兼业代理 3 个人代理
    * @return agenttype
     */
    public String getAgenttype() {
        return agenttype;
    }

    /**
    * 设置-代理人类型，0 专业代理 1 经纪公司  2 兼业代理 3 个人代理
    * @paramType java.lang.String
    * @param agenttype - 代理人类型，0 专业代理 1 经纪公司  2 兼业代理 3 个人代理
     */
    public void setAgenttype(String agenttype) {
        this.agenttype = agenttype;
    }

    /**
    * 获取-车辆使用性质
    * @return useporperty
     */
    public String getUseporperty() {
        return useporperty;
    }

    /**
    * 设置-车辆使用性质
    * @paramType java.lang.String
    * @param useporperty - 车辆使用性质
     */
    public void setUseporperty(String useporperty) {
        this.useporperty = useporperty;
    }

    /**
    * 获取-车辆种类
    * @return vehkind
     */
    public String getVehkind() {
        return vehkind;
    }

    /**
    * 设置-车辆种类
    * @paramType java.lang.String
    * @param vehkind - 车辆种类
     */
    public void setVehkind(String vehkind) {
        this.vehkind = vehkind;
    }

    /**
    * 获取-车辆规格特性
    * @return characteristics
     */
    public String getCharacteristics() {
        return characteristics;
    }

    /**
    * 设置-车辆规格特性
    * @paramType java.lang.String
    * @param characteristics - 车辆规格特性
     */
    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    /**
    * 获取-车辆用途
    * @return carusetype
     */
    public String getCarusetype() {
        return carusetype;
    }

    /**
    * 设置-车辆用途
    * @paramType java.lang.String
    * @param carusetype - 车辆用途
     */
    public void setCarusetype(String carusetype) {
        this.carusetype = carusetype;
    }

    /**
    * 获取-序号
    * @return serialno
     */
    public BigDecimal getSerialno() {
        return serialno;
    }

    /**
    * 设置-序号
    * @paramType java.math.BigDecimal
    * @param serialno - 序号
     */
    public void setSerialno(BigDecimal serialno) {
        this.serialno = serialno;
    }

    /**
    * 获取-挂账兑换人民币汇率
    * @return exchangerate
     */
    public BigDecimal getExchangerate() {
        return exchangerate;
    }

    /**
    * 设置-挂账兑换人民币汇率
    * @paramType java.math.BigDecimal
    * @param exchangerate - 挂账兑换人民币汇率
     */
    public void setExchangerate(BigDecimal exchangerate) {
        this.exchangerate = exchangerate;
    }
}