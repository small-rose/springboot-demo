package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_reinsurance_ti_fnd
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmReinsuranceTiFnd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 批次序号
     */
    private String batchserialno;

    /**
     * 数据源
     */
    private String datasource;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 部门
     */
    private String departmentcode;

    /**
     * 帐单期
     */
    private String tabperiod;

    /**
     * 合同代码
     */
    private String contractcode;

    /**
     * 合同层次
     */
    private BigDecimal layer;

    /**
     * 类别 Y:溢额/成数、 S:溢额、　Q:成数、 C:超赔、T:比例
     */
    private String qstype;

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
    private String listno;

    /**
     * 起保日期
     */
    private Date startdate;

    /**
     * 录入日期
     */
    private Date inputdate;

    /**
     * 再保人人代码
     */
    private String reinsurercode;

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
     * 分保类型:1法定（YAIC法定不传收付费），2合同，4临分
     */
    private String contracttype;

    /**
     * 分入分出 0：分出 1：分入
     */
    private String opttype;

    /**
     * 币种代码
     */
    private String currencycode;

    /**
     * 批量处理号
     */
    private String summaryno;

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
     * 业务唯一流水号，类似custseq
     */
    private String accno;

    /**
     * 状态,1:初始,2:落地成功:3:落地失败
     */
    private String status;

    /**
     * 数据错误日志
     */
    private String errmsg;

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
     * 数据类型　01  保费,02  赔款,03  代位追偿款,04  理赔费用,05  纯益手续费,06  手续费,07  经纪费,08  分保费用,09  存入（出）保费准备金,10  存入（出）保费准备金利息,11  未满期保费,12  营业税,13  教育费附加,14  城建税,15  河道及堤防维护税,16  其他税种,17  未决赔款(估损),18  印花税
     */
    private String datatype;

    /**
     * 展业方式编号
     */
    private String businesschannel;

    /**
     * 终保日期
     */
    private Date enddate;

    /**
     * 境内/境外标识(0：境外  1：境内)
     */
    private String domestic;

    /**
     * 客户账户名称（英文）
     */
    private String custaccountnameen;

    /**
     * 账户名称
     */
    private String custaccountname;

    /**
     * 客户开户行代码（开户行联行号）
     */
    private String custbankno;

    /**
     * 银行名称
     */
    private String bankname;

    /**
     * 账号
     */
    private String custaccountno;

    /**
     * 投保人代码
     */
    private String applicantcode;

    /**
     * 投保人名称
     */
    private String applicantnamecn;

    /**
     * 投保人名称（英文）
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
     * 是否分期
     */
    private String hasplan;

    /**
     * 账单号
     */
    private String ribillno;

    /**
     * 红冲流水号，此号对应被红冲数据的唯一流水号accno
     */
    private String offsetno;

    /**
     * 客户代码
     */
    private String customercode;

    /**
     * 客户名称
     */
    private String customernamecn;

    /**
     * 用于计划账龄
     */
    private Date duedate;

    /**
     * 约定币种
     */
    private String exchangecurrency;

    /**
     * 约定汇率
     */
    private BigDecimal exchangerate;

    /**
     * 约定金额
     */
    private BigDecimal exchangeamount;

    /**
     * 分出业务时，记录直保数据唯一流水号custseq（保单，赔款等分出业务），其他为空
     */
    private String originalbillno;

    /**
     * 保险经纪人名称
     */
    private String insurancebroker;

    /**
     * 保险经纪人代码
     */
    private String insurancebrokercode;

    /**
     * 客户开户行所在省份
     */
    private String bankprovince;

    /**
     * 客户开户行所在市
     */
    private String bankcity;

    /**
     * 客户开户行直联号：ICBC（工行）、ABC(农行）、 BOC（中国银行）、CITICIB(中信银行)、CCB（建行）
     */
    private String banktype;

    /**
     * 银行指令类型1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口)
     */
    private String ispaypublic;

    /**
     * 0实际账单，1预估账单，2冲销预估账单
     */
    private String protocolflag;

    /**
     * 分期缴费期次
     */
    private BigDecimal installmentstimes;

    /**
     * 计划缴费日期
     */
    private Date plandate;

    /**
     * 关联mm_policy_events_td表newno
     */
    private Long seqnewno;

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
    * 获取-部门
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-部门
    * @paramType java.lang.String
    * @param departmentcode - 部门
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    /**
    * 获取-帐单期
    * @return tabperiod
     */
    public String getTabperiod() {
        return tabperiod;
    }

    /**
    * 设置-帐单期
    * @paramType java.lang.String
    * @param tabperiod - 帐单期
     */
    public void setTabperiod(String tabperiod) {
        this.tabperiod = tabperiod;
    }

    /**
    * 获取-合同代码
    * @return contractcode
     */
    public String getContractcode() {
        return contractcode;
    }

    /**
    * 设置-合同代码
    * @paramType java.lang.String
    * @param contractcode - 合同代码
     */
    public void setContractcode(String contractcode) {
        this.contractcode = contractcode;
    }

    /**
    * 获取-合同层次
    * @return layer
     */
    public BigDecimal getLayer() {
        return layer;
    }

    /**
    * 设置-合同层次
    * @paramType java.math.BigDecimal
    * @param layer - 合同层次
     */
    public void setLayer(BigDecimal layer) {
        this.layer = layer;
    }

    /**
    * 获取-类别 Y:溢额/成数、 S:溢额、　Q:成数、 C:超赔、T:比例
    * @return qstype
     */
    public String getQstype() {
        return qstype;
    }

    /**
    * 设置-类别 Y:溢额/成数、 S:溢额、　Q:成数、 C:超赔、T:比例
    * @paramType java.lang.String
    * @param qstype - 类别 Y:溢额/成数、 S:溢额、　Q:成数、 C:超赔、T:比例
     */
    public void setQstype(String qstype) {
        this.qstype = qstype;
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
    * @return listno
     */
    public String getListno() {
        return listno;
    }

    /**
    * 设置-序号
    * @paramType java.lang.String
    * @param listno - 序号
     */
    public void setListno(String listno) {
        this.listno = listno;
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
    * 获取-再保人人代码
    * @return reinsurercode
     */
    public String getReinsurercode() {
        return reinsurercode;
    }

    /**
    * 设置-再保人人代码
    * @paramType java.lang.String
    * @param reinsurercode - 再保人人代码
     */
    public void setReinsurercode(String reinsurercode) {
        this.reinsurercode = reinsurercode;
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
    * 获取-分保类型:1法定（YAIC法定不传收付费），2合同，4临分
    * @return contracttype
     */
    public String getContracttype() {
        return contracttype;
    }

    /**
    * 设置-分保类型:1法定（YAIC法定不传收付费），2合同，4临分
    * @paramType java.lang.String
    * @param contracttype - 分保类型:1法定（YAIC法定不传收付费），2合同，4临分
     */
    public void setContracttype(String contracttype) {
        this.contracttype = contracttype;
    }

    /**
    * 获取-分入分出 0：分出 1：分入
    * @return opttype
     */
    public String getOpttype() {
        return opttype;
    }

    /**
    * 设置-分入分出 0：分出 1：分入
    * @paramType java.lang.String
    * @param opttype - 分入分出 0：分出 1：分入
     */
    public void setOpttype(String opttype) {
        this.opttype = opttype;
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
    * 获取-业务唯一流水号，类似custseq
    * @return accno
     */
    public String getAccno() {
        return accno;
    }

    /**
    * 设置-业务唯一流水号，类似custseq
    * @paramType java.lang.String
    * @param accno - 业务唯一流水号，类似custseq
     */
    public void setAccno(String accno) {
        this.accno = accno;
    }

    /**
    * 获取-状态,1:初始,2:落地成功:3:落地失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态,1:初始,2:落地成功:3:落地失败
    * @paramType java.lang.String
    * @param status - 状态,1:初始,2:落地成功:3:落地失败
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-数据错误日志
    * @return errmsg
     */
    public String getErrmsg() {
        return errmsg;
    }

    /**
    * 设置-数据错误日志
    * @paramType java.lang.String
    * @param errmsg - 数据错误日志
     */
    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
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
    * 获取-数据类型　01  保费,02  赔款,03  代位追偿款,04  理赔费用,05  纯益手续费,06  手续费,07  经纪费,08  分保费用,09  存入（出）保费准备金,10  存入（出）保费准备金利息,11  未满期保费,12  营业税,13  教育费附加,14  城建税,15  河道及堤防维护税,16  其他税种,17  未决赔款(估损),18  印花税
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-数据类型　01  保费,02  赔款,03  代位追偿款,04  理赔费用,05  纯益手续费,06  手续费,07  经纪费,08  分保费用,09  存入（出）保费准备金,10  存入（出）保费准备金利息,11  未满期保费,12  营业税,13  教育费附加,14  城建税,15  河道及堤防维护税,16  其他税种,17  未决赔款(估损),18  印花税
    * @paramType java.lang.String
    * @param datatype - 数据类型　01  保费,02  赔款,03  代位追偿款,04  理赔费用,05  纯益手续费,06  手续费,07  经纪费,08  分保费用,09  存入（出）保费准备金,10  存入（出）保费准备金利息,11  未满期保费,12  营业税,13  教育费附加,14  城建税,15  河道及堤防维护税,16  其他税种,17  未决赔款(估损),18  印花税
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
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
    * 获取-客户账户名称（英文）
    * @return custaccountnameen
     */
    public String getCustaccountnameen() {
        return custaccountnameen;
    }

    /**
    * 设置-客户账户名称（英文）
    * @paramType java.lang.String
    * @param custaccountnameen - 客户账户名称（英文）
     */
    public void setCustaccountnameen(String custaccountnameen) {
        this.custaccountnameen = custaccountnameen;
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
    * 获取-账号
    * @return custaccountno
     */
    public String getCustaccountno() {
        return custaccountno;
    }

    /**
    * 设置-账号
    * @paramType java.lang.String
    * @param custaccountno - 账号
     */
    public void setCustaccountno(String custaccountno) {
        this.custaccountno = custaccountno;
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
    * @return applicantnamecn
     */
    public String getApplicantnamecn() {
        return applicantnamecn;
    }

    /**
    * 设置-投保人名称
    * @paramType java.lang.String
    * @param applicantnamecn - 投保人名称
     */
    public void setApplicantnamecn(String applicantnamecn) {
        this.applicantnamecn = applicantnamecn;
    }

    /**
    * 获取-投保人名称（英文）
    * @return applicantnameen
     */
    public String getApplicantnameen() {
        return applicantnameen;
    }

    /**
    * 设置-投保人名称（英文）
    * @paramType java.lang.String
    * @param applicantnameen - 投保人名称（英文）
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
    * 获取-红冲流水号，此号对应被红冲数据的唯一流水号accno
    * @return offsetno
     */
    public String getOffsetno() {
        return offsetno;
    }

    /**
    * 设置-红冲流水号，此号对应被红冲数据的唯一流水号accno
    * @paramType java.lang.String
    * @param offsetno - 红冲流水号，此号对应被红冲数据的唯一流水号accno
     */
    public void setOffsetno(String offsetno) {
        this.offsetno = offsetno;
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
    * 获取-约定币种
    * @return exchangecurrency
     */
    public String getExchangecurrency() {
        return exchangecurrency;
    }

    /**
    * 设置-约定币种
    * @paramType java.lang.String
    * @param exchangecurrency - 约定币种
     */
    public void setExchangecurrency(String exchangecurrency) {
        this.exchangecurrency = exchangecurrency;
    }

    /**
    * 获取-约定汇率
    * @return exchangerate
     */
    public BigDecimal getExchangerate() {
        return exchangerate;
    }

    /**
    * 设置-约定汇率
    * @paramType java.math.BigDecimal
    * @param exchangerate - 约定汇率
     */
    public void setExchangerate(BigDecimal exchangerate) {
        this.exchangerate = exchangerate;
    }

    /**
    * 获取-约定金额
    * @return exchangeamount
     */
    public BigDecimal getExchangeamount() {
        return exchangeamount;
    }

    /**
    * 设置-约定金额
    * @paramType java.math.BigDecimal
    * @param exchangeamount - 约定金额
     */
    public void setExchangeamount(BigDecimal exchangeamount) {
        this.exchangeamount = exchangeamount;
    }

    /**
    * 获取-分出业务时，记录直保数据唯一流水号custseq（保单，赔款等分出业务），其他为空
    * @return originalbillno
     */
    public String getOriginalbillno() {
        return originalbillno;
    }

    /**
    * 设置-分出业务时，记录直保数据唯一流水号custseq（保单，赔款等分出业务），其他为空
    * @paramType java.lang.String
    * @param originalbillno - 分出业务时，记录直保数据唯一流水号custseq（保单，赔款等分出业务），其他为空
     */
    public void setOriginalbillno(String originalbillno) {
        this.originalbillno = originalbillno;
    }

    /**
    * 获取-保险经纪人名称
    * @return insurancebroker
     */
    public String getInsurancebroker() {
        return insurancebroker;
    }

    /**
    * 设置-保险经纪人名称
    * @paramType java.lang.String
    * @param insurancebroker - 保险经纪人名称
     */
    public void setInsurancebroker(String insurancebroker) {
        this.insurancebroker = insurancebroker;
    }

    /**
    * 获取-保险经纪人代码
    * @return insurancebrokercode
     */
    public String getInsurancebrokercode() {
        return insurancebrokercode;
    }

    /**
    * 设置-保险经纪人代码
    * @paramType java.lang.String
    * @param insurancebrokercode - 保险经纪人代码
     */
    public void setInsurancebrokercode(String insurancebrokercode) {
        this.insurancebrokercode = insurancebrokercode;
    }

    /**
    * 获取-客户开户行所在省份
    * @return bankprovince
     */
    public String getBankprovince() {
        return bankprovince;
    }

    /**
    * 设置-客户开户行所在省份
    * @paramType java.lang.String
    * @param bankprovince - 客户开户行所在省份
     */
    public void setBankprovince(String bankprovince) {
        this.bankprovince = bankprovince;
    }

    /**
    * 获取-客户开户行所在市
    * @return bankcity
     */
    public String getBankcity() {
        return bankcity;
    }

    /**
    * 设置-客户开户行所在市
    * @paramType java.lang.String
    * @param bankcity - 客户开户行所在市
     */
    public void setBankcity(String bankcity) {
        this.bankcity = bankcity;
    }

    /**
    * 获取-客户开户行直联号：ICBC（工行）、ABC(农行）、 BOC（中国银行）、CITICIB(中信银行)、CCB（建行）
    * @return banktype
     */
    public String getBanktype() {
        return banktype;
    }

    /**
    * 设置-客户开户行直联号：ICBC（工行）、ABC(农行）、 BOC（中国银行）、CITICIB(中信银行)、CCB（建行）
    * @paramType java.lang.String
    * @param banktype - 客户开户行直联号：ICBC（工行）、ABC(农行）、 BOC（中国银行）、CITICIB(中信银行)、CCB（建行）
     */
    public void setBanktype(String banktype) {
        this.banktype = banktype;
    }

    /**
    * 获取-银行指令类型1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口)
    * @return ispaypublic
     */
    public String getIspaypublic() {
        return ispaypublic;
    }

    /**
    * 设置-银行指令类型1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口)
    * @paramType java.lang.String
    * @param ispaypublic - 银行指令类型1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口)
     */
    public void setIspaypublic(String ispaypublic) {
        this.ispaypublic = ispaypublic;
    }

    /**
    * 获取-0实际账单，1预估账单，2冲销预估账单
    * @return protocolflag
     */
    public String getProtocolflag() {
        return protocolflag;
    }

    /**
    * 设置-0实际账单，1预估账单，2冲销预估账单
    * @paramType java.lang.String
    * @param protocolflag - 0实际账单，1预估账单，2冲销预估账单
     */
    public void setProtocolflag(String protocolflag) {
        this.protocolflag = protocolflag;
    }

    /**
    * 获取-分期缴费期次
    * @return installmentstimes
     */
    public BigDecimal getInstallmentstimes() {
        return installmentstimes;
    }

    /**
    * 设置-分期缴费期次
    * @paramType java.math.BigDecimal
    * @param installmentstimes - 分期缴费期次
     */
    public void setInstallmentstimes(BigDecimal installmentstimes) {
        this.installmentstimes = installmentstimes;
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
    * 获取-关联mm_policy_events_td表newno
    * @return seqnewno
     */
    public Long getSeqnewno() {
        return seqnewno;
    }

    /**
    * 设置-关联mm_policy_events_td表newno
    * @paramType java.lang.Long
    * @param seqnewno - 关联mm_policy_events_td表newno
     */
    public void setSeqnewno(Long seqnewno) {
        this.seqnewno = seqnewno;
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
}