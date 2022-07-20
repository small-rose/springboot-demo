package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_reinsurance_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmReinsuranceTd {
    /**
     * 主键
     */
    private Long seqriinsurence;

    /**
     * 记录oracle接口表主键
     */
    private Long seqricontracttab;

    /**
     * 业务类型
     */
    private String datatype;

    /**
     * 帐单期,合同分保帐单期
     */
    private String tabperiod;

    /**
     * 合同代码 ,合同分保记录合同号，临分记录临分号
     */
    private String contractcode;

    /**
     * 合同层次,合同分保记录合同层次，临分保单记录序号，临分赔案记录估损序号
     */
    private BigDecimal layer;

    /**
     * 类别,S:溢额　Q:成数  C:超赔  Y:溢额成数,主要指合同分保的区分  
     */
    private String qstype;

    /**
     * 保单号,临分业务的保单号
     */
    private String policyno;

    /**
     * 批单号,临分业务的批单号
     */
    private String endorseno;

    /**
     * 赔案号,临分业务的赔案号
     */
    private String claimno;

    /**
     * 清单序号,临分赔案序号
     */
    private String listno;

    /**
     * 币种代码
     */
    private String currencycode;

    /**
     * 再保人代码
     */
    private String reinsurercode;

    /**
     * 公司代码
     */
    private String subcompany;

    /**
     * 单位代码
     */
    private String unitcode;

    /**
     * 部门代码
     */
    private String departmentcode;

    /**
     * 险种代码
     */
    private String classescode;

    /**
     * 分保类型,1 法定 2 合同 3 超赔(废弃) 4 临分
     */
    private String contracttype;

    /**
     * 实收实付金额
     */
    private BigDecimal realamount;

    /**
     * 账期
     */
    private Date opdate;

    /**
     * 核销标志,0 未核销 1 部分核销 2 核销完毕 3 被作废
     */
    private String opstatus;

    /**
     * 数据来源
     */
    private String source;

    /**
     * 最后修改时间
     */
    private Date lastopdate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 记录sqlserver接口表主键
     */
    private Long seqricontracttab1;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 账单号
     */
    private String accno;

    /**
     * 0分出原保险业务 1分入业务  2分出再保险
     */
    private String opttype;

    /**
     * 再保人中文名称
     */
    private String reinsurernamecn;

    /**
     * 再保人英文名称
     */
    private String reinsurernameen;

    /**
     * 再保人partyno
     */
    private String reinsurerpartyno;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 账单兑换人民币金额
     */
    private BigDecimal cnyamount;

    /**
     * 税额
     */
    private BigDecimal taxesamount;

    /**
     * 人民币税额
     */
    private BigDecimal cnytaxesamount;

    /**
     * 生成发票金额
     */
    private BigDecimal invoiceamount;

    /**
     * 生成发票人民币金额
     */
    private BigDecimal cnyinvoiceamount;

    /**
     * 生成发票税额
     */
    private BigDecimal invoicetaxesamount;

    /**
     * 生成发票人民币税额
     */
    private BigDecimal cnyinvoicetaxesamount;

    /**
     * 兑换人民币汇率
     */
    private BigDecimal cnyexchangerate;

    /**
     * 汇率
     */
    private BigDecimal exchangerate;

    /**
     * 展业方式编号
     */
    private String businesschannel;

    /**
     * 客户账户
     */
    private String custaccountno;

    /**
     * 银行名称
     */
    private String bankname;

    /**
     * 客户开户行代码（开户行联行号）
     */
    private String custbankno;

    /**
     * 账户名称
     */
    private String custaccountname;

    /**
     * 账户英文名称
     */
    private String custaccountnameen;

    /**
     * 境内/境外标识  0：境外  1：境内 可以为空
     */
    private String domestic;

    /**
     * 终保日期
     */
    private Date enddate;

    /**
     * 再保合同类型  100100 原保直保 ,100200 原保主保 ,100300 原保从保 ,200110 商业分入合约成数 ,200120 商业分入合约超赔 ,200130 商业分入合约溢额 ,200140 商业分入合约成数溢额 ,200210 商业分入临分成数 ,200220 商业分入临分超赔 ,200230 商业分入临分溢额 ,200240 商业分入临分成数溢额 ,300110 商业分出合约成数 ,300120 商业分出合约超赔 ,300130 商业分出合约溢额 ,300140 商业分出合约成数溢额 ,300211 商业分出临分成数原保 ,300212 商业分出临分成数再保 ,300221 商业分出临分超赔原保 ,300222 商业分出临分超赔再保 ,300231 商业分出临分溢额原保 ,300232 商业分出临分溢额再保 ,300241 商业分出临分成数溢额原保 ,300242 商业分出临分成数溢额再保 ,300300 法定分出 ,999999 共保代收代付 
     */
    private String reinsurancetype;

    /**
     * 投保人代码
     */
    private String applicantcode;

    /**
     * 投保人中文名字
     */
    private String applicantnamecn;

    /**
     * 投保人英文名字
     */
    private String applicantnameen;

    /**
     * 投保人partyno
     */
    private String applicantionpartyno;

    /**
     * 投保人日系非日系
     */
    private String appisjapan;

    /**
     * 承保期限
     */
    private String insuranceterm;

    /**
     * 代理点代码
     */
    private String agentcode;

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
     * 进出口标识
     */
    private String porttype;

    /**
     * 录入日期
     */
    private Date inputdate;

    /**
     * 起保日期
     */
    private Date startdate;

    /**
     * 用于计划账龄
     */
    private Date duedate;

    /**
     * 冲销号
     */
    private String offsetno;

    /**
     * 客户partyno
     */
    private String customerpartyno;

    /**
     * 客户名称（英文）
     */
    private String customernameen;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 客户代码
     */
    private String customercode;

    /**
     * 账单类型(0实际账单，1预估账单，2冲销预估账单)
     */
    private String protocolflag;

    /**
     * 是否分期
     */
    private String hasplan;

    /**
     * 账单号
     */
    private String ribillno;

    /**
     * 结算单号
     */
    private String summaryno;

    /**
     * 服务机构代码，用于上海航运中心业务拓展
     */
    private String inpaymentdepartment;

    /**
     * 农业险政策性  0 政策性-中央政策性、1 政策性-地方政策性、2 商业性
     */
    private String farpolicytype;

    /**
     * 涉农标志
     */
    private String farmflag;

    /**
     * 涉农标志代码
     */
    private String farmflagcode;

    /**
     * 是否做子险拆分 0 不拆分 1拆分
     */
    private String issplitted;

    /**
     * 车辆使用性质
     */
    private String useporperty;

    /**
     * 账期标识
     */
    private String periodflag;

    /**
     * 汇总标识
     */
    private String groupflag;

    /**
     * 保费来源
     */
    private String premiumsource;

    /**
     * 进项税转出
     */
    private BigDecimal taxesamountout;

    /**
     * 险别属性(0应税 1免税 2零税)
     */
    private String classesstype;

    /**
     * 税率
     */
    private BigDecimal taxesrate;

    /**
     * 发票归属机构
     */
    private String invoiceunit;

    /**
     * 涉海标识(01涉海 02非涉海)
     */
    private String marineflag;

    /**
     * 险种描述
     */
    private String classescodedesc;

    /**
     * 业务来源
     */
    private String businesssource;

    /**
     * 团队类型
     */
    private String grouptype;

    /**
    * 获取-主键
    * @return seqriinsurence
     */
    public Long getSeqriinsurence() {
        return seqriinsurence;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param seqriinsurence - 主键
     */
    public void setSeqriinsurence(Long seqriinsurence) {
        this.seqriinsurence = seqriinsurence;
    }

    /**
    * 获取-记录oracle接口表主键
    * @return seqricontracttab
     */
    public Long getSeqricontracttab() {
        return seqricontracttab;
    }

    /**
    * 设置-记录oracle接口表主键
    * @paramType java.lang.Long
    * @param seqricontracttab - 记录oracle接口表主键
     */
    public void setSeqricontracttab(Long seqricontracttab) {
        this.seqricontracttab = seqricontracttab;
    }

    /**
    * 获取-业务类型
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-业务类型
    * @paramType java.lang.String
    * @param datatype - 业务类型
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    /**
    * 获取-帐单期,合同分保帐单期
    * @return tabperiod
     */
    public String getTabperiod() {
        return tabperiod;
    }

    /**
    * 设置-帐单期,合同分保帐单期
    * @paramType java.lang.String
    * @param tabperiod - 帐单期,合同分保帐单期
     */
    public void setTabperiod(String tabperiod) {
        this.tabperiod = tabperiod;
    }

    /**
    * 获取-合同代码 ,合同分保记录合同号，临分记录临分号
    * @return contractcode
     */
    public String getContractcode() {
        return contractcode;
    }

    /**
    * 设置-合同代码 ,合同分保记录合同号，临分记录临分号
    * @paramType java.lang.String
    * @param contractcode - 合同代码 ,合同分保记录合同号，临分记录临分号
     */
    public void setContractcode(String contractcode) {
        this.contractcode = contractcode;
    }

    /**
    * 获取-合同层次,合同分保记录合同层次，临分保单记录序号，临分赔案记录估损序号
    * @return layer
     */
    public BigDecimal getLayer() {
        return layer;
    }

    /**
    * 设置-合同层次,合同分保记录合同层次，临分保单记录序号，临分赔案记录估损序号
    * @paramType java.math.BigDecimal
    * @param layer - 合同层次,合同分保记录合同层次，临分保单记录序号，临分赔案记录估损序号
     */
    public void setLayer(BigDecimal layer) {
        this.layer = layer;
    }

    /**
    * 获取-类别,S:溢额　Q:成数  C:超赔  Y:溢额成数,主要指合同分保的区分  
    * @return qstype
     */
    public String getQstype() {
        return qstype;
    }

    /**
    * 设置-类别,S:溢额　Q:成数  C:超赔  Y:溢额成数,主要指合同分保的区分  
    * @paramType java.lang.String
    * @param qstype - 类别,S:溢额　Q:成数  C:超赔  Y:溢额成数,主要指合同分保的区分  
     */
    public void setQstype(String qstype) {
        this.qstype = qstype;
    }

    /**
    * 获取-保单号,临分业务的保单号
    * @return policyno
     */
    public String getPolicyno() {
        return policyno;
    }

    /**
    * 设置-保单号,临分业务的保单号
    * @paramType java.lang.String
    * @param policyno - 保单号,临分业务的保单号
     */
    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    /**
    * 获取-批单号,临分业务的批单号
    * @return endorseno
     */
    public String getEndorseno() {
        return endorseno;
    }

    /**
    * 设置-批单号,临分业务的批单号
    * @paramType java.lang.String
    * @param endorseno - 批单号,临分业务的批单号
     */
    public void setEndorseno(String endorseno) {
        this.endorseno = endorseno;
    }

    /**
    * 获取-赔案号,临分业务的赔案号
    * @return claimno
     */
    public String getClaimno() {
        return claimno;
    }

    /**
    * 设置-赔案号,临分业务的赔案号
    * @paramType java.lang.String
    * @param claimno - 赔案号,临分业务的赔案号
     */
    public void setClaimno(String claimno) {
        this.claimno = claimno;
    }

    /**
    * 获取-清单序号,临分赔案序号
    * @return listno
     */
    public String getListno() {
        return listno;
    }

    /**
    * 设置-清单序号,临分赔案序号
    * @paramType java.lang.String
    * @param listno - 清单序号,临分赔案序号
     */
    public void setListno(String listno) {
        this.listno = listno;
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
    * 获取-再保人代码
    * @return reinsurercode
     */
    public String getReinsurercode() {
        return reinsurercode;
    }

    /**
    * 设置-再保人代码
    * @paramType java.lang.String
    * @param reinsurercode - 再保人代码
     */
    public void setReinsurercode(String reinsurercode) {
        this.reinsurercode = reinsurercode;
    }

    /**
    * 获取-公司代码
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-公司代码
    * @paramType java.lang.String
    * @param subcompany - 公司代码
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-单位代码
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-单位代码
    * @paramType java.lang.String
    * @param unitcode - 单位代码
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
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
    * 获取-险种代码
    * @return classescode
     */
    public String getClassescode() {
        return classescode;
    }

    /**
    * 设置-险种代码
    * @paramType java.lang.String
    * @param classescode - 险种代码
     */
    public void setClassescode(String classescode) {
        this.classescode = classescode;
    }

    /**
    * 获取-分保类型,1 法定 2 合同 3 超赔(废弃) 4 临分
    * @return contracttype
     */
    public String getContracttype() {
        return contracttype;
    }

    /**
    * 设置-分保类型,1 法定 2 合同 3 超赔(废弃) 4 临分
    * @paramType java.lang.String
    * @param contracttype - 分保类型,1 法定 2 合同 3 超赔(废弃) 4 临分
     */
    public void setContracttype(String contracttype) {
        this.contracttype = contracttype;
    }

    /**
    * 获取-实收实付金额
    * @return realamount
     */
    public BigDecimal getRealamount() {
        return realamount;
    }

    /**
    * 设置-实收实付金额
    * @paramType java.math.BigDecimal
    * @param realamount - 实收实付金额
     */
    public void setRealamount(BigDecimal realamount) {
        this.realamount = realamount;
    }

    /**
    * 获取-账期
    * @return opdate
     */
    public Date getOpdate() {
        return opdate;
    }

    /**
    * 设置-账期
    * @paramType java.util.Date
    * @param opdate - 账期
     */
    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }

    /**
    * 获取-核销标志,0 未核销 1 部分核销 2 核销完毕 3 被作废
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-核销标志,0 未核销 1 部分核销 2 核销完毕 3 被作废
    * @paramType java.lang.String
    * @param opstatus - 核销标志,0 未核销 1 部分核销 2 核销完毕 3 被作废
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
    }

    /**
    * 获取-数据来源
    * @return source
     */
    public String getSource() {
        return source;
    }

    /**
    * 设置-数据来源
    * @paramType java.lang.String
    * @param source - 数据来源
     */
    public void setSource(String source) {
        this.source = source;
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
    * 获取-记录sqlserver接口表主键
    * @return seqricontracttab1
     */
    public Long getSeqricontracttab1() {
        return seqricontracttab1;
    }

    /**
    * 设置-记录sqlserver接口表主键
    * @paramType java.lang.Long
    * @param seqricontracttab1 - 记录sqlserver接口表主键
     */
    public void setSeqricontracttab1(Long seqricontracttab1) {
        this.seqricontracttab1 = seqricontracttab1;
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
    * 获取-账单号
    * @return accno
     */
    public String getAccno() {
        return accno;
    }

    /**
    * 设置-账单号
    * @paramType java.lang.String
    * @param accno - 账单号
     */
    public void setAccno(String accno) {
        this.accno = accno;
    }

    /**
    * 获取-0分出原保险业务 1分入业务  2分出再保险
    * @return opttype
     */
    public String getOpttype() {
        return opttype;
    }

    /**
    * 设置-0分出原保险业务 1分入业务  2分出再保险
    * @paramType java.lang.String
    * @param opttype - 0分出原保险业务 1分入业务  2分出再保险
     */
    public void setOpttype(String opttype) {
        this.opttype = opttype;
    }

    /**
    * 获取-再保人中文名称
    * @return reinsurernamecn
     */
    public String getReinsurernamecn() {
        return reinsurernamecn;
    }

    /**
    * 设置-再保人中文名称
    * @paramType java.lang.String
    * @param reinsurernamecn - 再保人中文名称
     */
    public void setReinsurernamecn(String reinsurernamecn) {
        this.reinsurernamecn = reinsurernamecn;
    }

    /**
    * 获取-再保人英文名称
    * @return reinsurernameen
     */
    public String getReinsurernameen() {
        return reinsurernameen;
    }

    /**
    * 设置-再保人英文名称
    * @paramType java.lang.String
    * @param reinsurernameen - 再保人英文名称
     */
    public void setReinsurernameen(String reinsurernameen) {
        this.reinsurernameen = reinsurernameen;
    }

    /**
    * 获取-再保人partyno
    * @return reinsurerpartyno
     */
    public String getReinsurerpartyno() {
        return reinsurerpartyno;
    }

    /**
    * 设置-再保人partyno
    * @paramType java.lang.String
    * @param reinsurerpartyno - 再保人partyno
     */
    public void setReinsurerpartyno(String reinsurerpartyno) {
        this.reinsurerpartyno = reinsurerpartyno;
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
    * 获取-账单兑换人民币金额
    * @return cnyamount
     */
    public BigDecimal getCnyamount() {
        return cnyamount;
    }

    /**
    * 设置-账单兑换人民币金额
    * @paramType java.math.BigDecimal
    * @param cnyamount - 账单兑换人民币金额
     */
    public void setCnyamount(BigDecimal cnyamount) {
        this.cnyamount = cnyamount;
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
    * 获取-人民币税额
    * @return cnytaxesamount
     */
    public BigDecimal getCnytaxesamount() {
        return cnytaxesamount;
    }

    /**
    * 设置-人民币税额
    * @paramType java.math.BigDecimal
    * @param cnytaxesamount - 人民币税额
     */
    public void setCnytaxesamount(BigDecimal cnytaxesamount) {
        this.cnytaxesamount = cnytaxesamount;
    }

    /**
    * 获取-生成发票金额
    * @return invoiceamount
     */
    public BigDecimal getInvoiceamount() {
        return invoiceamount;
    }

    /**
    * 设置-生成发票金额
    * @paramType java.math.BigDecimal
    * @param invoiceamount - 生成发票金额
     */
    public void setInvoiceamount(BigDecimal invoiceamount) {
        this.invoiceamount = invoiceamount;
    }

    /**
    * 获取-生成发票人民币金额
    * @return cnyinvoiceamount
     */
    public BigDecimal getCnyinvoiceamount() {
        return cnyinvoiceamount;
    }

    /**
    * 设置-生成发票人民币金额
    * @paramType java.math.BigDecimal
    * @param cnyinvoiceamount - 生成发票人民币金额
     */
    public void setCnyinvoiceamount(BigDecimal cnyinvoiceamount) {
        this.cnyinvoiceamount = cnyinvoiceamount;
    }

    /**
    * 获取-生成发票税额
    * @return invoicetaxesamount
     */
    public BigDecimal getInvoicetaxesamount() {
        return invoicetaxesamount;
    }

    /**
    * 设置-生成发票税额
    * @paramType java.math.BigDecimal
    * @param invoicetaxesamount - 生成发票税额
     */
    public void setInvoicetaxesamount(BigDecimal invoicetaxesamount) {
        this.invoicetaxesamount = invoicetaxesamount;
    }

    /**
    * 获取-生成发票人民币税额
    * @return cnyinvoicetaxesamount
     */
    public BigDecimal getCnyinvoicetaxesamount() {
        return cnyinvoicetaxesamount;
    }

    /**
    * 设置-生成发票人民币税额
    * @paramType java.math.BigDecimal
    * @param cnyinvoicetaxesamount - 生成发票人民币税额
     */
    public void setCnyinvoicetaxesamount(BigDecimal cnyinvoicetaxesamount) {
        this.cnyinvoicetaxesamount = cnyinvoicetaxesamount;
    }

    /**
    * 获取-兑换人民币汇率
    * @return cnyexchangerate
     */
    public BigDecimal getCnyexchangerate() {
        return cnyexchangerate;
    }

    /**
    * 设置-兑换人民币汇率
    * @paramType java.math.BigDecimal
    * @param cnyexchangerate - 兑换人民币汇率
     */
    public void setCnyexchangerate(BigDecimal cnyexchangerate) {
        this.cnyexchangerate = cnyexchangerate;
    }

    /**
    * 获取-汇率
    * @return exchangerate
     */
    public BigDecimal getExchangerate() {
        return exchangerate;
    }

    /**
    * 设置-汇率
    * @paramType java.math.BigDecimal
    * @param exchangerate - 汇率
     */
    public void setExchangerate(BigDecimal exchangerate) {
        this.exchangerate = exchangerate;
    }

    /**
    * 获取-展业方式编号
    * @return businesschannel
     */
    public String getBusinesschannel() {
        return businesschannel;
    }

    /**
    * 设置-展业方式编号
    * @paramType java.lang.String
    * @param businesschannel - 展业方式编号
     */
    public void setBusinesschannel(String businesschannel) {
        this.businesschannel = businesschannel;
    }

    /**
    * 获取-客户账户
    * @return custaccountno
     */
    public String getCustaccountno() {
        return custaccountno;
    }

    /**
    * 设置-客户账户
    * @paramType java.lang.String
    * @param custaccountno - 客户账户
     */
    public void setCustaccountno(String custaccountno) {
        this.custaccountno = custaccountno;
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
    * 获取-账户名称
    * @return custaccountname
     */
    public String getCustaccountname() {
        return custaccountname;
    }

    /**
    * 设置-账户名称
    * @paramType java.lang.String
    * @param custaccountname - 账户名称
     */
    public void setCustaccountname(String custaccountname) {
        this.custaccountname = custaccountname;
    }

    /**
    * 获取-账户英文名称
    * @return custaccountnameen
     */
    public String getCustaccountnameen() {
        return custaccountnameen;
    }

    /**
    * 设置-账户英文名称
    * @paramType java.lang.String
    * @param custaccountnameen - 账户英文名称
     */
    public void setCustaccountnameen(String custaccountnameen) {
        this.custaccountnameen = custaccountnameen;
    }

    /**
    * 获取-境内/境外标识  0：境外  1：境内 可以为空
    * @return domestic
     */
    public String getDomestic() {
        return domestic;
    }

    /**
    * 设置-境内/境外标识  0：境外  1：境内 可以为空
    * @paramType java.lang.String
    * @param domestic - 境内/境外标识  0：境外  1：境内 可以为空
     */
    public void setDomestic(String domestic) {
        this.domestic = domestic;
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
    * 获取-再保合同类型  100100 原保直保 ,100200 原保主保 ,100300 原保从保 ,200110 商业分入合约成数 ,200120 商业分入合约超赔 ,200130 商业分入合约溢额 ,200140 商业分入合约成数溢额 ,200210 商业分入临分成数 ,200220 商业分入临分超赔 ,200230 商业分入临分溢额 ,200240 商业分入临分成数溢额 ,300110 商业分出合约成数 ,300120 商业分出合约超赔 ,300130 商业分出合约溢额 ,300140 商业分出合约成数溢额 ,300211 商业分出临分成数原保 ,300212 商业分出临分成数再保 ,300221 商业分出临分超赔原保 ,300222 商业分出临分超赔再保 ,300231 商业分出临分溢额原保 ,300232 商业分出临分溢额再保 ,300241 商业分出临分成数溢额原保 ,300242 商业分出临分成数溢额再保 ,300300 法定分出 ,999999 共保代收代付 
    * @return reinsurancetype
     */
    public String getReinsurancetype() {
        return reinsurancetype;
    }

    /**
    * 设置-再保合同类型  100100 原保直保 ,100200 原保主保 ,100300 原保从保 ,200110 商业分入合约成数 ,200120 商业分入合约超赔 ,200130 商业分入合约溢额 ,200140 商业分入合约成数溢额 ,200210 商业分入临分成数 ,200220 商业分入临分超赔 ,200230 商业分入临分溢额 ,200240 商业分入临分成数溢额 ,300110 商业分出合约成数 ,300120 商业分出合约超赔 ,300130 商业分出合约溢额 ,300140 商业分出合约成数溢额 ,300211 商业分出临分成数原保 ,300212 商业分出临分成数再保 ,300221 商业分出临分超赔原保 ,300222 商业分出临分超赔再保 ,300231 商业分出临分溢额原保 ,300232 商业分出临分溢额再保 ,300241 商业分出临分成数溢额原保 ,300242 商业分出临分成数溢额再保 ,300300 法定分出 ,999999 共保代收代付 
    * @paramType java.lang.String
    * @param reinsurancetype - 再保合同类型  100100 原保直保 ,100200 原保主保 ,100300 原保从保 ,200110 商业分入合约成数 ,200120 商业分入合约超赔 ,200130 商业分入合约溢额 ,200140 商业分入合约成数溢额 ,200210 商业分入临分成数 ,200220 商业分入临分超赔 ,200230 商业分入临分溢额 ,200240 商业分入临分成数溢额 ,300110 商业分出合约成数 ,300120 商业分出合约超赔 ,300130 商业分出合约溢额 ,300140 商业分出合约成数溢额 ,300211 商业分出临分成数原保 ,300212 商业分出临分成数再保 ,300221 商业分出临分超赔原保 ,300222 商业分出临分超赔再保 ,300231 商业分出临分溢额原保 ,300232 商业分出临分溢额再保 ,300241 商业分出临分成数溢额原保 ,300242 商业分出临分成数溢额再保 ,300300 法定分出 ,999999 共保代收代付 
     */
    public void setReinsurancetype(String reinsurancetype) {
        this.reinsurancetype = reinsurancetype;
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
    * 获取-投保人中文名字
    * @return applicantnamecn
     */
    public String getApplicantnamecn() {
        return applicantnamecn;
    }

    /**
    * 设置-投保人中文名字
    * @paramType java.lang.String
    * @param applicantnamecn - 投保人中文名字
     */
    public void setApplicantnamecn(String applicantnamecn) {
        this.applicantnamecn = applicantnamecn;
    }

    /**
    * 获取-投保人英文名字
    * @return applicantnameen
     */
    public String getApplicantnameen() {
        return applicantnameen;
    }

    /**
    * 设置-投保人英文名字
    * @paramType java.lang.String
    * @param applicantnameen - 投保人英文名字
     */
    public void setApplicantnameen(String applicantnameen) {
        this.applicantnameen = applicantnameen;
    }

    /**
    * 获取-投保人partyno
    * @return applicantionpartyno
     */
    public String getApplicantionpartyno() {
        return applicantionpartyno;
    }

    /**
    * 设置-投保人partyno
    * @paramType java.lang.String
    * @param applicantionpartyno - 投保人partyno
     */
    public void setApplicantionpartyno(String applicantionpartyno) {
        this.applicantionpartyno = applicantionpartyno;
    }

    /**
    * 获取-投保人日系非日系
    * @return appisjapan
     */
    public String getAppisjapan() {
        return appisjapan;
    }

    /**
    * 设置-投保人日系非日系
    * @paramType java.lang.String
    * @param appisjapan - 投保人日系非日系
     */
    public void setAppisjapan(String appisjapan) {
        this.appisjapan = appisjapan;
    }

    /**
    * 获取-承保期限
    * @return insuranceterm
     */
    public String getInsuranceterm() {
        return insuranceterm;
    }

    /**
    * 设置-承保期限
    * @paramType java.lang.String
    * @param insuranceterm - 承保期限
     */
    public void setInsuranceterm(String insuranceterm) {
        this.insuranceterm = insuranceterm;
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
    * 获取-进出口标识
    * @return porttype
     */
    public String getPorttype() {
        return porttype;
    }

    /**
    * 设置-进出口标识
    * @paramType java.lang.String
    * @param porttype - 进出口标识
     */
    public void setPorttype(String porttype) {
        this.porttype = porttype;
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
    * 获取-用于计划账龄
    * @return duedate
     */
    public Date getDuedate() {
        return duedate;
    }

    /**
    * 设置-用于计划账龄
    * @paramType java.util.Date
    * @param duedate - 用于计划账龄
     */
    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    /**
    * 获取-冲销号
    * @return offsetno
     */
    public String getOffsetno() {
        return offsetno;
    }

    /**
    * 设置-冲销号
    * @paramType java.lang.String
    * @param offsetno - 冲销号
     */
    public void setOffsetno(String offsetno) {
        this.offsetno = offsetno;
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
    * @return customername
     */
    public String getCustomername() {
        return customername;
    }

    /**
    * 设置-客户名称
    * @paramType java.lang.String
    * @param customername - 客户名称
     */
    public void setCustomername(String customername) {
        this.customername = customername;
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
    * 获取-账单类型(0实际账单，1预估账单，2冲销预估账单)
    * @return protocolflag
     */
    public String getProtocolflag() {
        return protocolflag;
    }

    /**
    * 设置-账单类型(0实际账单，1预估账单，2冲销预估账单)
    * @paramType java.lang.String
    * @param protocolflag - 账单类型(0实际账单，1预估账单，2冲销预估账单)
     */
    public void setProtocolflag(String protocolflag) {
        this.protocolflag = protocolflag;
    }

    /**
    * 获取-是否分期
    * @return hasplan
     */
    public String getHasplan() {
        return hasplan;
    }

    /**
    * 设置-是否分期
    * @paramType java.lang.String
    * @param hasplan - 是否分期
     */
    public void setHasplan(String hasplan) {
        this.hasplan = hasplan;
    }

    /**
    * 获取-账单号
    * @return ribillno
     */
    public String getRibillno() {
        return ribillno;
    }

    /**
    * 设置-账单号
    * @paramType java.lang.String
    * @param ribillno - 账单号
     */
    public void setRibillno(String ribillno) {
        this.ribillno = ribillno;
    }

    /**
    * 获取-结算单号
    * @return summaryno
     */
    public String getSummaryno() {
        return summaryno;
    }

    /**
    * 设置-结算单号
    * @paramType java.lang.String
    * @param summaryno - 结算单号
     */
    public void setSummaryno(String summaryno) {
        this.summaryno = summaryno;
    }

    /**
    * 获取-服务机构代码，用于上海航运中心业务拓展
    * @return inpaymentdepartment
     */
    public String getInpaymentdepartment() {
        return inpaymentdepartment;
    }

    /**
    * 设置-服务机构代码，用于上海航运中心业务拓展
    * @paramType java.lang.String
    * @param inpaymentdepartment - 服务机构代码，用于上海航运中心业务拓展
     */
    public void setInpaymentdepartment(String inpaymentdepartment) {
        this.inpaymentdepartment = inpaymentdepartment;
    }

    /**
    * 获取-农业险政策性  0 政策性-中央政策性、1 政策性-地方政策性、2 商业性
    * @return farpolicytype
     */
    public String getFarpolicytype() {
        return farpolicytype;
    }

    /**
    * 设置-农业险政策性  0 政策性-中央政策性、1 政策性-地方政策性、2 商业性
    * @paramType java.lang.String
    * @param farpolicytype - 农业险政策性  0 政策性-中央政策性、1 政策性-地方政策性、2 商业性
     */
    public void setFarpolicytype(String farpolicytype) {
        this.farpolicytype = farpolicytype;
    }

    /**
    * 获取-涉农标志
    * @return farmflag
     */
    public String getFarmflag() {
        return farmflag;
    }

    /**
    * 设置-涉农标志
    * @paramType java.lang.String
    * @param farmflag - 涉农标志
     */
    public void setFarmflag(String farmflag) {
        this.farmflag = farmflag;
    }

    /**
    * 获取-涉农标志代码
    * @return farmflagcode
     */
    public String getFarmflagcode() {
        return farmflagcode;
    }

    /**
    * 设置-涉农标志代码
    * @paramType java.lang.String
    * @param farmflagcode - 涉农标志代码
     */
    public void setFarmflagcode(String farmflagcode) {
        this.farmflagcode = farmflagcode;
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
    * 获取-账期标识
    * @return periodflag
     */
    public String getPeriodflag() {
        return periodflag;
    }

    /**
    * 设置-账期标识
    * @paramType java.lang.String
    * @param periodflag - 账期标识
     */
    public void setPeriodflag(String periodflag) {
        this.periodflag = periodflag;
    }

    /**
    * 获取-汇总标识
    * @return groupflag
     */
    public String getGroupflag() {
        return groupflag;
    }

    /**
    * 设置-汇总标识
    * @paramType java.lang.String
    * @param groupflag - 汇总标识
     */
    public void setGroupflag(String groupflag) {
        this.groupflag = groupflag;
    }

    /**
    * 获取-保费来源
    * @return premiumsource
     */
    public String getPremiumsource() {
        return premiumsource;
    }

    /**
    * 设置-保费来源
    * @paramType java.lang.String
    * @param premiumsource - 保费来源
     */
    public void setPremiumsource(String premiumsource) {
        this.premiumsource = premiumsource;
    }

    /**
    * 获取-进项税转出
    * @return taxesamountout
     */
    public BigDecimal getTaxesamountout() {
        return taxesamountout;
    }

    /**
    * 设置-进项税转出
    * @paramType java.math.BigDecimal
    * @param taxesamountout - 进项税转出
     */
    public void setTaxesamountout(BigDecimal taxesamountout) {
        this.taxesamountout = taxesamountout;
    }

    /**
    * 获取-险别属性(0应税 1免税 2零税)
    * @return classesstype
     */
    public String getClassesstype() {
        return classesstype;
    }

    /**
    * 设置-险别属性(0应税 1免税 2零税)
    * @paramType java.lang.String
    * @param classesstype - 险别属性(0应税 1免税 2零税)
     */
    public void setClassesstype(String classesstype) {
        this.classesstype = classesstype;
    }

    /**
    * 获取-税率
    * @return taxesrate
     */
    public BigDecimal getTaxesrate() {
        return taxesrate;
    }

    /**
    * 设置-税率
    * @paramType java.math.BigDecimal
    * @param taxesrate - 税率
     */
    public void setTaxesrate(BigDecimal taxesrate) {
        this.taxesrate = taxesrate;
    }

    /**
    * 获取-发票归属机构
    * @return invoiceunit
     */
    public String getInvoiceunit() {
        return invoiceunit;
    }

    /**
    * 设置-发票归属机构
    * @paramType java.lang.String
    * @param invoiceunit - 发票归属机构
     */
    public void setInvoiceunit(String invoiceunit) {
        this.invoiceunit = invoiceunit;
    }

    /**
    * 获取-涉海标识(01涉海 02非涉海)
    * @return marineflag
     */
    public String getMarineflag() {
        return marineflag;
    }

    /**
    * 设置-涉海标识(01涉海 02非涉海)
    * @paramType java.lang.String
    * @param marineflag - 涉海标识(01涉海 02非涉海)
     */
    public void setMarineflag(String marineflag) {
        this.marineflag = marineflag;
    }

    /**
    * 获取-险种描述
    * @return classescodedesc
     */
    public String getClassescodedesc() {
        return classescodedesc;
    }

    /**
    * 设置-险种描述
    * @paramType java.lang.String
    * @param classescodedesc - 险种描述
     */
    public void setClassescodedesc(String classescodedesc) {
        this.classescodedesc = classescodedesc;
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
}