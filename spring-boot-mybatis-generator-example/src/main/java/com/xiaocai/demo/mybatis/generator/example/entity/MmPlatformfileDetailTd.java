package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_platformfile_detail_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPlatformfileDetailTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 来源系统。分配的固定值
     */
    private String datasource;

    /**
     * 来源批号。批次控制，全局唯一
     */
    private String batchno;

    /**
     * 来源单据流水号。批次内控制，批内唯一
     */
    private String batchserialno;

    /**
     * 申请组织。单据的业务发生组织
     */
    private String subcompany;

    /**
     * 申请部门。单据的业务发生部门
     */
    private String departmentcode;

    /**
     * 付款日期。付款日期
     */
    private Date paydate;

    /**
     * 结算方式。转账、支票、现金等付款方式
     */
    private String settlementmode;

    /**
     * 交易类型。业务类型，如理赔、工资等
     */
    private String paytype;

    /**
     * 资金类别。资金流量维度分析
     */
    private String fundcategorycode;

    /**
     * 资金子类别。资金流量维度分析
     */
    private String fundsubcategorycode;

    /**
     * 计划项目。用于计划控制或按计划项目进行数据统计
     */
    private String budgetitemcode;

    /**
     * 付方组织。付方组织，可空
     */
    private String mmentitycode;

    /**
     * 公司账户银行代码。付方银行，可空
     */
    private String mmbankcode;

    /**
     * 公司账号。
     */
    private String mmaccountno;

    /**
     * 收付对象类型。"3—员工 4－供应商 5—手工，对于一般业务代付填5"
     */
    private Short customertype;

    /**
     * 收付名称。当收方对象类型为员工时,收方名称为员工姓名.收方对象类型为供应商时,收方名称为供应商名称,当收方对象类型为手工时,收方名称和收方户名一致
     */
    private String customername;

    /**
     * 收付银行区域。直联支付必填
     */
    private String custbankarea;

    /**
     * 收付银行。直联支付必填
     */
    private String custbankcode;

    /**
     * 收付银行开户行。直联支付必填
     */
    private String custbankname;

    /**
     * 收付银行联行号。直联支付必填
     */
    private String custunitbankno;

    /**
     * 收付账户。直联支付必填
     */
    private String custaccountno;

    /**
     * 非网银转账时可以为空
     */
    private String custaccountname;

    /**
     * 交易币种。
     */
    private String currencycode;

    /**
     * 交易金额。
     */
    private BigDecimal amount;

    /**
     * 用途。
     */
    private String purpose;

    /**
     * 备注。
     */
    private String memo;

    /**
     * 描述。
     */
    private String description;

    /**
     * 工号。
     */
    private String vendorCode;

    /**
     * 来源系统单据号码。外部系统需要在资金建立关系的可识别业务单据号
     */
    private String businessno;

    /**
     * 公私标志。"0 - 对私 1 - 对公"
     */
    private Short ispublic;

    /**
     * 卡折标志。"折：1 借记卡：2 贷记卡：3 准贷记卡：4 "
     */
    private Short cardflag;

    /**
     * 加急标志。"0 - 普通 1 - 加急"
     */
    private Short fastflag;

    /**
     * 证件号码。
     */
    private String certificateno;

    /**
     * 信用卡CVV码。填写信用卡反面的3位CVV码,如果没有的填“***”
     */
    private String cvvcode;

    /**
     * 信用卡有效期。格式为：mmyy
     */
    private String cvvvaliddate;

    /**
     * 资金系统抽档状态。"1 - 未抽档 2 - 已抽档 3 - 抽档失败 4 - 抽档中"
     */
    private Short atsdealstate;

    /**
     * 资金系统抽档时间。
     */
    private Date atsdealdate;

    /**
     * 资金系统处理错误信息。抽档失败的错误信息，如：数据不全，数据格式不对
     */
    private String atsdealerrorinfo;

    /**
     * 资金系统返盘状态。"1 - 未返盘 2 - 已返盘 3 - 返盘失败"
     */
    private Short atsreturnstate;

    /**
     * 资金系统返盘时间。
     */
    private Date atsreturndate;

    /**
     * 资金系统返盘信息。
     */
    private String atsreturninfo;

    /**
     * 支付状态。"1 - 未支付 2 - 已支付 3 - 支付失败 4 - 支付中"
     */
    private Short paystate;

    /**
     * 支付成功日期。资金系统回写
     */
    private Date paymadedate;

    /**
     * 支付信息。交易支付信息（包含支付成功信息、支付失败信息）
     */
    private String payresultinfo;

    /**
     * 失败原因类型（包含成功），详细分类见数据字典。
     */
    private String failtype;

    /**
     * 对账码。银行对账码
     */
    private String bankabstract;

    /**
     * 核对批号。核对批号
     */
    private String checkbatchno;

    /**
     * 退票状态。"1 - 未退票 2 - 已退票"
     */
    private Short refundstate;

    /**
     * 退票信息。
     */
    private String refundinfo;

    /**
     * 退票日期。
     */
    private Date refundtime;

    /**
     * 票据类型。现金支票、转账支票等票据类型
     */
    private String checktype;

    /**
     * 票据号。票据号
     */
    private String checkno;

    /**
     * 来源系统处理状态。"1 - 未处理 2 - 已处理 3 - 处理失败 4 - 处理中"
     */
    private Short sourcedealstate;

    /**
     * 来源系统处理时间。
     */
    private Date sourcedealdate;

    /**
     * 来源系统处理错误信息。
     */
    private String sourcedealerrorinfo;

    /**
     * 来源系统退票处理状态。"1 - 未处理 2 - 已处理 3 - 处理失败 4 - 处理中 5-前台退票确认待处理"
     */
    private Short sourcerefunddealstate;

    /**
     * 来源系统退票处理时间。
     */
    private Date sourcerefunddealdate;

    /**
     * 来源系统退票处理错误信息。
     */
    private String sourcerefunddealerrorinfo;

    /**
     * 创建者 。
     */
    private String opcode;

    /**
     * 创建日期。
     */
    private Date createdate;

    /**
     * 最后更新者。初始为创建者
     */
    private String lastopcode;

    /**
     * 最后更新日期。初始为创建日期
     */
    private Date lastopdate;

    /**
     * 记录版本号。数据记录版本号，每次更新加一
     */
    private Short rowversion;

    /**
     * 导出序号，明细记录在盘片中的序号
     */
    private BigDecimal displayorder;

    /**
     * 币种名称
     */
    private String currencyname;

    /**
     * 公司账户id
     */
    private BigDecimal mmaccountid;

    /**
     * 公司账户名称
     */
    private String mmaccountname;

    /**
     * 公司账户开户行名称，即网点名称
     */
    private String mmbankname;

    /**
     * 客户开户行所在省份
     */
    private String custbankprovince;

    /**
     * 客户开户行所在市
     */
    private String custbankcity;

    /**
     * 收付流水号,对应mm_inpayment_td的inpaymentid,注意：inpayment红冲记录和被红冲记录的盘片明细id是一样。
     */
    private Long inpaymentid;

    /**
     * 盘片号，对应mm_platformfile的id
     */
    private String platformfileid;

    /**
     * 借贷标志 0收款 1付款
     */
    private String inpaymentflag;

    /**
     * 保单号.
     */
    private String policyno;

    /**
     * 商户号，网银报盘时使用
     */
    private String merchantno;

    /**
     * 没转换过的失败原因类型（包含成功），详细分类见数据字典。
     */
    private String bankFailtype;

    /**
     * 没转换过的支付信息。交易支付信息（包含支付成功信息、支付失败信息）
     */
    private String bankPayresultinfo;

    /**
     * 客户电子邮箱
     */
    private String custemail;

    /**
     * 客户手机号
     */
    private String mobilenumber;

    /**
     * 短信通知标志。1：是 0：否
     */
    private String smsflag;

    /**
     * 邮件通知标志。1：是 0：否
     */
    private String mailflag;

    /**
     * 备用字段1
     */
    private String segment1;

    /**
     * 备用字段2
     */
    private String segment2;

    /**
     * 备用字段3
     */
    private String segment3;

    /**
     * 备用字段4
     */
    private String segment4;

    /**
     * 资金返回的票据号
     */
    private String atsbillno;

    /**
     * 客户账户区域，转账付款必填，默认为0。0 - 国内 1 - 国外
     */
    private String custaccountarea;

    /**
     * 客户银行地址，境外汇款时使用
     */
    private String custbankaddr;

    /**
     * Swift Code：即国际银行代码，境外汇款时使用
     */
    private String custbankswiftcode;

    /**
     * 国内外费用承担：1汇款人OUR、2收款人BEN、3共同SHA
     */
    private String custchargetype;

    /**
     * 原币种
     */
    private String bCurrencode;

    /**
     * 原金额
     */
    private BigDecimal bAmount;

    /**
     * 备用字段
     */
    private String segment5;

    /**
     * 资金系统开始支付时间
     */
    private Date begintime;

    /**
     * 证件类型
     */
    private String certificatetype;

    /**
     * 定时任务批次号
     */
    private String timingBatchno;

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
    * 获取-来源系统。分配的固定值
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-来源系统。分配的固定值
    * @paramType java.lang.String
    * @param datasource - 来源系统。分配的固定值
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-来源批号。批次控制，全局唯一
    * @return batchno
     */
    public String getBatchno() {
        return batchno;
    }

    /**
    * 设置-来源批号。批次控制，全局唯一
    * @paramType java.lang.String
    * @param batchno - 来源批号。批次控制，全局唯一
     */
    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    /**
    * 获取-来源单据流水号。批次内控制，批内唯一
    * @return batchserialno
     */
    public String getBatchserialno() {
        return batchserialno;
    }

    /**
    * 设置-来源单据流水号。批次内控制，批内唯一
    * @paramType java.lang.String
    * @param batchserialno - 来源单据流水号。批次内控制，批内唯一
     */
    public void setBatchserialno(String batchserialno) {
        this.batchserialno = batchserialno;
    }

    /**
    * 获取-申请组织。单据的业务发生组织
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-申请组织。单据的业务发生组织
    * @paramType java.lang.String
    * @param subcompany - 申请组织。单据的业务发生组织
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-申请部门。单据的业务发生部门
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-申请部门。单据的业务发生部门
    * @paramType java.lang.String
    * @param departmentcode - 申请部门。单据的业务发生部门
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    /**
    * 获取-付款日期。付款日期
    * @return paydate
     */
    public Date getPaydate() {
        return paydate;
    }

    /**
    * 设置-付款日期。付款日期
    * @paramType java.util.Date
    * @param paydate - 付款日期。付款日期
     */
    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    /**
    * 获取-结算方式。转账、支票、现金等付款方式
    * @return settlementmode
     */
    public String getSettlementmode() {
        return settlementmode;
    }

    /**
    * 设置-结算方式。转账、支票、现金等付款方式
    * @paramType java.lang.String
    * @param settlementmode - 结算方式。转账、支票、现金等付款方式
     */
    public void setSettlementmode(String settlementmode) {
        this.settlementmode = settlementmode;
    }

    /**
    * 获取-交易类型。业务类型，如理赔、工资等
    * @return paytype
     */
    public String getPaytype() {
        return paytype;
    }

    /**
    * 设置-交易类型。业务类型，如理赔、工资等
    * @paramType java.lang.String
    * @param paytype - 交易类型。业务类型，如理赔、工资等
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    /**
    * 获取-资金类别。资金流量维度分析
    * @return fundcategorycode
     */
    public String getFundcategorycode() {
        return fundcategorycode;
    }

    /**
    * 设置-资金类别。资金流量维度分析
    * @paramType java.lang.String
    * @param fundcategorycode - 资金类别。资金流量维度分析
     */
    public void setFundcategorycode(String fundcategorycode) {
        this.fundcategorycode = fundcategorycode;
    }

    /**
    * 获取-资金子类别。资金流量维度分析
    * @return fundsubcategorycode
     */
    public String getFundsubcategorycode() {
        return fundsubcategorycode;
    }

    /**
    * 设置-资金子类别。资金流量维度分析
    * @paramType java.lang.String
    * @param fundsubcategorycode - 资金子类别。资金流量维度分析
     */
    public void setFundsubcategorycode(String fundsubcategorycode) {
        this.fundsubcategorycode = fundsubcategorycode;
    }

    /**
    * 获取-计划项目。用于计划控制或按计划项目进行数据统计
    * @return budgetitemcode
     */
    public String getBudgetitemcode() {
        return budgetitemcode;
    }

    /**
    * 设置-计划项目。用于计划控制或按计划项目进行数据统计
    * @paramType java.lang.String
    * @param budgetitemcode - 计划项目。用于计划控制或按计划项目进行数据统计
     */
    public void setBudgetitemcode(String budgetitemcode) {
        this.budgetitemcode = budgetitemcode;
    }

    /**
    * 获取-付方组织。付方组织，可空
    * @return mmentitycode
     */
    public String getMmentitycode() {
        return mmentitycode;
    }

    /**
    * 设置-付方组织。付方组织，可空
    * @paramType java.lang.String
    * @param mmentitycode - 付方组织。付方组织，可空
     */
    public void setMmentitycode(String mmentitycode) {
        this.mmentitycode = mmentitycode;
    }

    /**
    * 获取-公司账户银行代码。付方银行，可空
    * @return mmbankcode
     */
    public String getMmbankcode() {
        return mmbankcode;
    }

    /**
    * 设置-公司账户银行代码。付方银行，可空
    * @paramType java.lang.String
    * @param mmbankcode - 公司账户银行代码。付方银行，可空
     */
    public void setMmbankcode(String mmbankcode) {
        this.mmbankcode = mmbankcode;
    }

    /**
    * 获取-公司账号。
    * @return mmaccountno
     */
    public String getMmaccountno() {
        return mmaccountno;
    }

    /**
    * 设置-公司账号。
    * @paramType java.lang.String
    * @param mmaccountno - 公司账号。
     */
    public void setMmaccountno(String mmaccountno) {
        this.mmaccountno = mmaccountno;
    }

    /**
    * 获取-收付对象类型。"3—员工 4－供应商 5—手工，对于一般业务代付填5"
    * @return customertype
     */
    public Short getCustomertype() {
        return customertype;
    }

    /**
    * 设置-收付对象类型。"3—员工 4－供应商 5—手工，对于一般业务代付填5"
    * @paramType java.lang.Short
    * @param customertype - 收付对象类型。"3—员工 4－供应商 5—手工，对于一般业务代付填5"
     */
    public void setCustomertype(Short customertype) {
        this.customertype = customertype;
    }

    /**
    * 获取-收付名称。当收方对象类型为员工时,收方名称为员工姓名.收方对象类型为供应商时,收方名称为供应商名称,当收方对象类型为手工时,收方名称和收方户名一致
    * @return customername
     */
    public String getCustomername() {
        return customername;
    }

    /**
    * 设置-收付名称。当收方对象类型为员工时,收方名称为员工姓名.收方对象类型为供应商时,收方名称为供应商名称,当收方对象类型为手工时,收方名称和收方户名一致
    * @paramType java.lang.String
    * @param customername - 收付名称。当收方对象类型为员工时,收方名称为员工姓名.收方对象类型为供应商时,收方名称为供应商名称,当收方对象类型为手工时,收方名称和收方户名一致
     */
    public void setCustomername(String customername) {
        this.customername = customername;
    }

    /**
    * 获取-收付银行区域。直联支付必填
    * @return custbankarea
     */
    public String getCustbankarea() {
        return custbankarea;
    }

    /**
    * 设置-收付银行区域。直联支付必填
    * @paramType java.lang.String
    * @param custbankarea - 收付银行区域。直联支付必填
     */
    public void setCustbankarea(String custbankarea) {
        this.custbankarea = custbankarea;
    }

    /**
    * 获取-收付银行。直联支付必填
    * @return custbankcode
     */
    public String getCustbankcode() {
        return custbankcode;
    }

    /**
    * 设置-收付银行。直联支付必填
    * @paramType java.lang.String
    * @param custbankcode - 收付银行。直联支付必填
     */
    public void setCustbankcode(String custbankcode) {
        this.custbankcode = custbankcode;
    }

    /**
    * 获取-收付银行开户行。直联支付必填
    * @return custbankname
     */
    public String getCustbankname() {
        return custbankname;
    }

    /**
    * 设置-收付银行开户行。直联支付必填
    * @paramType java.lang.String
    * @param custbankname - 收付银行开户行。直联支付必填
     */
    public void setCustbankname(String custbankname) {
        this.custbankname = custbankname;
    }

    /**
    * 获取-收付银行联行号。直联支付必填
    * @return custunitbankno
     */
    public String getCustunitbankno() {
        return custunitbankno;
    }

    /**
    * 设置-收付银行联行号。直联支付必填
    * @paramType java.lang.String
    * @param custunitbankno - 收付银行联行号。直联支付必填
     */
    public void setCustunitbankno(String custunitbankno) {
        this.custunitbankno = custunitbankno;
    }

    /**
    * 获取-收付账户。直联支付必填
    * @return custaccountno
     */
    public String getCustaccountno() {
        return custaccountno;
    }

    /**
    * 设置-收付账户。直联支付必填
    * @paramType java.lang.String
    * @param custaccountno - 收付账户。直联支付必填
     */
    public void setCustaccountno(String custaccountno) {
        this.custaccountno = custaccountno;
    }

    /**
    * 获取-非网银转账时可以为空
    * @return custaccountname
     */
    public String getCustaccountname() {
        return custaccountname;
    }

    /**
    * 设置-非网银转账时可以为空
    * @paramType java.lang.String
    * @param custaccountname - 非网银转账时可以为空
     */
    public void setCustaccountname(String custaccountname) {
        this.custaccountname = custaccountname;
    }

    /**
    * 获取-交易币种。
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-交易币种。
    * @paramType java.lang.String
    * @param currencycode - 交易币种。
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-交易金额。
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-交易金额。
    * @paramType java.math.BigDecimal
    * @param amount - 交易金额。
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-用途。
    * @return purpose
     */
    public String getPurpose() {
        return purpose;
    }

    /**
    * 设置-用途。
    * @paramType java.lang.String
    * @param purpose - 用途。
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /**
    * 获取-备注。
    * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
    * 设置-备注。
    * @paramType java.lang.String
    * @param memo - 备注。
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
    * 获取-描述。
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-描述。
    * @paramType java.lang.String
    * @param description - 描述。
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    * 获取-工号。
    * @return vendorCode
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
    * 设置-工号。
    * @paramType java.lang.String
    * @param vendorCode - 工号。
     */
    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    /**
    * 获取-来源系统单据号码。外部系统需要在资金建立关系的可识别业务单据号
    * @return businessno
     */
    public String getBusinessno() {
        return businessno;
    }

    /**
    * 设置-来源系统单据号码。外部系统需要在资金建立关系的可识别业务单据号
    * @paramType java.lang.String
    * @param businessno - 来源系统单据号码。外部系统需要在资金建立关系的可识别业务单据号
     */
    public void setBusinessno(String businessno) {
        this.businessno = businessno;
    }

    /**
    * 获取-公私标志。"0 - 对私 1 - 对公"
    * @return ispublic
     */
    public Short getIspublic() {
        return ispublic;
    }

    /**
    * 设置-公私标志。"0 - 对私 1 - 对公"
    * @paramType java.lang.Short
    * @param ispublic - 公私标志。"0 - 对私 1 - 对公"
     */
    public void setIspublic(Short ispublic) {
        this.ispublic = ispublic;
    }

    /**
    * 获取-卡折标志。"折：1 借记卡：2 贷记卡：3 准贷记卡：4 "
    * @return cardflag
     */
    public Short getCardflag() {
        return cardflag;
    }

    /**
    * 设置-卡折标志。"折：1 借记卡：2 贷记卡：3 准贷记卡：4 "
    * @paramType java.lang.Short
    * @param cardflag - 卡折标志。"折：1 借记卡：2 贷记卡：3 准贷记卡：4 "
     */
    public void setCardflag(Short cardflag) {
        this.cardflag = cardflag;
    }

    /**
    * 获取-加急标志。"0 - 普通 1 - 加急"
    * @return fastflag
     */
    public Short getFastflag() {
        return fastflag;
    }

    /**
    * 设置-加急标志。"0 - 普通 1 - 加急"
    * @paramType java.lang.Short
    * @param fastflag - 加急标志。"0 - 普通 1 - 加急"
     */
    public void setFastflag(Short fastflag) {
        this.fastflag = fastflag;
    }

    /**
    * 获取-证件号码。
    * @return certificateno
     */
    public String getCertificateno() {
        return certificateno;
    }

    /**
    * 设置-证件号码。
    * @paramType java.lang.String
    * @param certificateno - 证件号码。
     */
    public void setCertificateno(String certificateno) {
        this.certificateno = certificateno;
    }

    /**
    * 获取-信用卡CVV码。填写信用卡反面的3位CVV码,如果没有的填“***”
    * @return cvvcode
     */
    public String getCvvcode() {
        return cvvcode;
    }

    /**
    * 设置-信用卡CVV码。填写信用卡反面的3位CVV码,如果没有的填“***”
    * @paramType java.lang.String
    * @param cvvcode - 信用卡CVV码。填写信用卡反面的3位CVV码,如果没有的填“***”
     */
    public void setCvvcode(String cvvcode) {
        this.cvvcode = cvvcode;
    }

    /**
    * 获取-信用卡有效期。格式为：mmyy
    * @return cvvvaliddate
     */
    public String getCvvvaliddate() {
        return cvvvaliddate;
    }

    /**
    * 设置-信用卡有效期。格式为：mmyy
    * @paramType java.lang.String
    * @param cvvvaliddate - 信用卡有效期。格式为：mmyy
     */
    public void setCvvvaliddate(String cvvvaliddate) {
        this.cvvvaliddate = cvvvaliddate;
    }

    /**
    * 获取-资金系统抽档状态。"1 - 未抽档 2 - 已抽档 3 - 抽档失败 4 - 抽档中"
    * @return atsdealstate
     */
    public Short getAtsdealstate() {
        return atsdealstate;
    }

    /**
    * 设置-资金系统抽档状态。"1 - 未抽档 2 - 已抽档 3 - 抽档失败 4 - 抽档中"
    * @paramType java.lang.Short
    * @param atsdealstate - 资金系统抽档状态。"1 - 未抽档 2 - 已抽档 3 - 抽档失败 4 - 抽档中"
     */
    public void setAtsdealstate(Short atsdealstate) {
        this.atsdealstate = atsdealstate;
    }

    /**
    * 获取-资金系统抽档时间。
    * @return atsdealdate
     */
    public Date getAtsdealdate() {
        return atsdealdate;
    }

    /**
    * 设置-资金系统抽档时间。
    * @paramType java.util.Date
    * @param atsdealdate - 资金系统抽档时间。
     */
    public void setAtsdealdate(Date atsdealdate) {
        this.atsdealdate = atsdealdate;
    }

    /**
    * 获取-资金系统处理错误信息。抽档失败的错误信息，如：数据不全，数据格式不对
    * @return atsdealerrorinfo
     */
    public String getAtsdealerrorinfo() {
        return atsdealerrorinfo;
    }

    /**
    * 设置-资金系统处理错误信息。抽档失败的错误信息，如：数据不全，数据格式不对
    * @paramType java.lang.String
    * @param atsdealerrorinfo - 资金系统处理错误信息。抽档失败的错误信息，如：数据不全，数据格式不对
     */
    public void setAtsdealerrorinfo(String atsdealerrorinfo) {
        this.atsdealerrorinfo = atsdealerrorinfo;
    }

    /**
    * 获取-资金系统返盘状态。"1 - 未返盘 2 - 已返盘 3 - 返盘失败"
    * @return atsreturnstate
     */
    public Short getAtsreturnstate() {
        return atsreturnstate;
    }

    /**
    * 设置-资金系统返盘状态。"1 - 未返盘 2 - 已返盘 3 - 返盘失败"
    * @paramType java.lang.Short
    * @param atsreturnstate - 资金系统返盘状态。"1 - 未返盘 2 - 已返盘 3 - 返盘失败"
     */
    public void setAtsreturnstate(Short atsreturnstate) {
        this.atsreturnstate = atsreturnstate;
    }

    /**
    * 获取-资金系统返盘时间。
    * @return atsreturndate
     */
    public Date getAtsreturndate() {
        return atsreturndate;
    }

    /**
    * 设置-资金系统返盘时间。
    * @paramType java.util.Date
    * @param atsreturndate - 资金系统返盘时间。
     */
    public void setAtsreturndate(Date atsreturndate) {
        this.atsreturndate = atsreturndate;
    }

    /**
    * 获取-资金系统返盘信息。
    * @return atsreturninfo
     */
    public String getAtsreturninfo() {
        return atsreturninfo;
    }

    /**
    * 设置-资金系统返盘信息。
    * @paramType java.lang.String
    * @param atsreturninfo - 资金系统返盘信息。
     */
    public void setAtsreturninfo(String atsreturninfo) {
        this.atsreturninfo = atsreturninfo;
    }

    /**
    * 获取-支付状态。"1 - 未支付 2 - 已支付 3 - 支付失败 4 - 支付中"
    * @return paystate
     */
    public Short getPaystate() {
        return paystate;
    }

    /**
    * 设置-支付状态。"1 - 未支付 2 - 已支付 3 - 支付失败 4 - 支付中"
    * @paramType java.lang.Short
    * @param paystate - 支付状态。"1 - 未支付 2 - 已支付 3 - 支付失败 4 - 支付中"
     */
    public void setPaystate(Short paystate) {
        this.paystate = paystate;
    }

    /**
    * 获取-支付成功日期。资金系统回写
    * @return paymadedate
     */
    public Date getPaymadedate() {
        return paymadedate;
    }

    /**
    * 设置-支付成功日期。资金系统回写
    * @paramType java.util.Date
    * @param paymadedate - 支付成功日期。资金系统回写
     */
    public void setPaymadedate(Date paymadedate) {
        this.paymadedate = paymadedate;
    }

    /**
    * 获取-支付信息。交易支付信息（包含支付成功信息、支付失败信息）
    * @return payresultinfo
     */
    public String getPayresultinfo() {
        return payresultinfo;
    }

    /**
    * 设置-支付信息。交易支付信息（包含支付成功信息、支付失败信息）
    * @paramType java.lang.String
    * @param payresultinfo - 支付信息。交易支付信息（包含支付成功信息、支付失败信息）
     */
    public void setPayresultinfo(String payresultinfo) {
        this.payresultinfo = payresultinfo;
    }

    /**
    * 获取-失败原因类型（包含成功），详细分类见数据字典。
    * @return failtype
     */
    public String getFailtype() {
        return failtype;
    }

    /**
    * 设置-失败原因类型（包含成功），详细分类见数据字典。
    * @paramType java.lang.String
    * @param failtype - 失败原因类型（包含成功），详细分类见数据字典。
     */
    public void setFailtype(String failtype) {
        this.failtype = failtype;
    }

    /**
    * 获取-对账码。银行对账码
    * @return bankabstract
     */
    public String getBankabstract() {
        return bankabstract;
    }

    /**
    * 设置-对账码。银行对账码
    * @paramType java.lang.String
    * @param bankabstract - 对账码。银行对账码
     */
    public void setBankabstract(String bankabstract) {
        this.bankabstract = bankabstract;
    }

    /**
    * 获取-核对批号。核对批号
    * @return checkbatchno
     */
    public String getCheckbatchno() {
        return checkbatchno;
    }

    /**
    * 设置-核对批号。核对批号
    * @paramType java.lang.String
    * @param checkbatchno - 核对批号。核对批号
     */
    public void setCheckbatchno(String checkbatchno) {
        this.checkbatchno = checkbatchno;
    }

    /**
    * 获取-退票状态。"1 - 未退票 2 - 已退票"
    * @return refundstate
     */
    public Short getRefundstate() {
        return refundstate;
    }

    /**
    * 设置-退票状态。"1 - 未退票 2 - 已退票"
    * @paramType java.lang.Short
    * @param refundstate - 退票状态。"1 - 未退票 2 - 已退票"
     */
    public void setRefundstate(Short refundstate) {
        this.refundstate = refundstate;
    }

    /**
    * 获取-退票信息。
    * @return refundinfo
     */
    public String getRefundinfo() {
        return refundinfo;
    }

    /**
    * 设置-退票信息。
    * @paramType java.lang.String
    * @param refundinfo - 退票信息。
     */
    public void setRefundinfo(String refundinfo) {
        this.refundinfo = refundinfo;
    }

    /**
    * 获取-退票日期。
    * @return refundtime
     */
    public Date getRefundtime() {
        return refundtime;
    }

    /**
    * 设置-退票日期。
    * @paramType java.util.Date
    * @param refundtime - 退票日期。
     */
    public void setRefundtime(Date refundtime) {
        this.refundtime = refundtime;
    }

    /**
    * 获取-票据类型。现金支票、转账支票等票据类型
    * @return checktype
     */
    public String getChecktype() {
        return checktype;
    }

    /**
    * 设置-票据类型。现金支票、转账支票等票据类型
    * @paramType java.lang.String
    * @param checktype - 票据类型。现金支票、转账支票等票据类型
     */
    public void setChecktype(String checktype) {
        this.checktype = checktype;
    }

    /**
    * 获取-票据号。票据号
    * @return checkno
     */
    public String getCheckno() {
        return checkno;
    }

    /**
    * 设置-票据号。票据号
    * @paramType java.lang.String
    * @param checkno - 票据号。票据号
     */
    public void setCheckno(String checkno) {
        this.checkno = checkno;
    }

    /**
    * 获取-来源系统处理状态。"1 - 未处理 2 - 已处理 3 - 处理失败 4 - 处理中"
    * @return sourcedealstate
     */
    public Short getSourcedealstate() {
        return sourcedealstate;
    }

    /**
    * 设置-来源系统处理状态。"1 - 未处理 2 - 已处理 3 - 处理失败 4 - 处理中"
    * @paramType java.lang.Short
    * @param sourcedealstate - 来源系统处理状态。"1 - 未处理 2 - 已处理 3 - 处理失败 4 - 处理中"
     */
    public void setSourcedealstate(Short sourcedealstate) {
        this.sourcedealstate = sourcedealstate;
    }

    /**
    * 获取-来源系统处理时间。
    * @return sourcedealdate
     */
    public Date getSourcedealdate() {
        return sourcedealdate;
    }

    /**
    * 设置-来源系统处理时间。
    * @paramType java.util.Date
    * @param sourcedealdate - 来源系统处理时间。
     */
    public void setSourcedealdate(Date sourcedealdate) {
        this.sourcedealdate = sourcedealdate;
    }

    /**
    * 获取-来源系统处理错误信息。
    * @return sourcedealerrorinfo
     */
    public String getSourcedealerrorinfo() {
        return sourcedealerrorinfo;
    }

    /**
    * 设置-来源系统处理错误信息。
    * @paramType java.lang.String
    * @param sourcedealerrorinfo - 来源系统处理错误信息。
     */
    public void setSourcedealerrorinfo(String sourcedealerrorinfo) {
        this.sourcedealerrorinfo = sourcedealerrorinfo;
    }

    /**
    * 获取-来源系统退票处理状态。"1 - 未处理 2 - 已处理 3 - 处理失败 4 - 处理中 5-前台退票确认待处理"
    * @return sourcerefunddealstate
     */
    public Short getSourcerefunddealstate() {
        return sourcerefunddealstate;
    }

    /**
    * 设置-来源系统退票处理状态。"1 - 未处理 2 - 已处理 3 - 处理失败 4 - 处理中 5-前台退票确认待处理"
    * @paramType java.lang.Short
    * @param sourcerefunddealstate - 来源系统退票处理状态。"1 - 未处理 2 - 已处理 3 - 处理失败 4 - 处理中 5-前台退票确认待处理"
     */
    public void setSourcerefunddealstate(Short sourcerefunddealstate) {
        this.sourcerefunddealstate = sourcerefunddealstate;
    }

    /**
    * 获取-来源系统退票处理时间。
    * @return sourcerefunddealdate
     */
    public Date getSourcerefunddealdate() {
        return sourcerefunddealdate;
    }

    /**
    * 设置-来源系统退票处理时间。
    * @paramType java.util.Date
    * @param sourcerefunddealdate - 来源系统退票处理时间。
     */
    public void setSourcerefunddealdate(Date sourcerefunddealdate) {
        this.sourcerefunddealdate = sourcerefunddealdate;
    }

    /**
    * 获取-来源系统退票处理错误信息。
    * @return sourcerefunddealerrorinfo
     */
    public String getSourcerefunddealerrorinfo() {
        return sourcerefunddealerrorinfo;
    }

    /**
    * 设置-来源系统退票处理错误信息。
    * @paramType java.lang.String
    * @param sourcerefunddealerrorinfo - 来源系统退票处理错误信息。
     */
    public void setSourcerefunddealerrorinfo(String sourcerefunddealerrorinfo) {
        this.sourcerefunddealerrorinfo = sourcerefunddealerrorinfo;
    }

    /**
    * 获取-创建者 。
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-创建者 。
    * @paramType java.lang.String
    * @param opcode - 创建者 。
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-创建日期。
    * @return createdate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
    * 设置-创建日期。
    * @paramType java.util.Date
    * @param createdate - 创建日期。
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
    * 获取-最后更新者。初始为创建者
    * @return lastopcode
     */
    public String getLastopcode() {
        return lastopcode;
    }

    /**
    * 设置-最后更新者。初始为创建者
    * @paramType java.lang.String
    * @param lastopcode - 最后更新者。初始为创建者
     */
    public void setLastopcode(String lastopcode) {
        this.lastopcode = lastopcode;
    }

    /**
    * 获取-最后更新日期。初始为创建日期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后更新日期。初始为创建日期
    * @paramType java.util.Date
    * @param lastopdate - 最后更新日期。初始为创建日期
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-记录版本号。数据记录版本号，每次更新加一
    * @return rowversion
     */
    public Short getRowversion() {
        return rowversion;
    }

    /**
    * 设置-记录版本号。数据记录版本号，每次更新加一
    * @paramType java.lang.Short
    * @param rowversion - 记录版本号。数据记录版本号，每次更新加一
     */
    public void setRowversion(Short rowversion) {
        this.rowversion = rowversion;
    }

    /**
    * 获取-导出序号，明细记录在盘片中的序号
    * @return displayorder
     */
    public BigDecimal getDisplayorder() {
        return displayorder;
    }

    /**
    * 设置-导出序号，明细记录在盘片中的序号
    * @paramType java.math.BigDecimal
    * @param displayorder - 导出序号，明细记录在盘片中的序号
     */
    public void setDisplayorder(BigDecimal displayorder) {
        this.displayorder = displayorder;
    }

    /**
    * 获取-币种名称
    * @return currencyname
     */
    public String getCurrencyname() {
        return currencyname;
    }

    /**
    * 设置-币种名称
    * @paramType java.lang.String
    * @param currencyname - 币种名称
     */
    public void setCurrencyname(String currencyname) {
        this.currencyname = currencyname;
    }

    /**
    * 获取-公司账户id
    * @return mmaccountid
     */
    public BigDecimal getMmaccountid() {
        return mmaccountid;
    }

    /**
    * 设置-公司账户id
    * @paramType java.math.BigDecimal
    * @param mmaccountid - 公司账户id
     */
    public void setMmaccountid(BigDecimal mmaccountid) {
        this.mmaccountid = mmaccountid;
    }

    /**
    * 获取-公司账户名称
    * @return mmaccountname
     */
    public String getMmaccountname() {
        return mmaccountname;
    }

    /**
    * 设置-公司账户名称
    * @paramType java.lang.String
    * @param mmaccountname - 公司账户名称
     */
    public void setMmaccountname(String mmaccountname) {
        this.mmaccountname = mmaccountname;
    }

    /**
    * 获取-公司账户开户行名称，即网点名称
    * @return mmbankname
     */
    public String getMmbankname() {
        return mmbankname;
    }

    /**
    * 设置-公司账户开户行名称，即网点名称
    * @paramType java.lang.String
    * @param mmbankname - 公司账户开户行名称，即网点名称
     */
    public void setMmbankname(String mmbankname) {
        this.mmbankname = mmbankname;
    }

    /**
    * 获取-客户开户行所在省份
    * @return custbankprovince
     */
    public String getCustbankprovince() {
        return custbankprovince;
    }

    /**
    * 设置-客户开户行所在省份
    * @paramType java.lang.String
    * @param custbankprovince - 客户开户行所在省份
     */
    public void setCustbankprovince(String custbankprovince) {
        this.custbankprovince = custbankprovince;
    }

    /**
    * 获取-客户开户行所在市
    * @return custbankcity
     */
    public String getCustbankcity() {
        return custbankcity;
    }

    /**
    * 设置-客户开户行所在市
    * @paramType java.lang.String
    * @param custbankcity - 客户开户行所在市
     */
    public void setCustbankcity(String custbankcity) {
        this.custbankcity = custbankcity;
    }

    /**
    * 获取-收付流水号,对应mm_inpayment_td的inpaymentid,注意：inpayment红冲记录和被红冲记录的盘片明细id是一样。
    * @return inpaymentid
     */
    public Long getInpaymentid() {
        return inpaymentid;
    }

    /**
    * 设置-收付流水号,对应mm_inpayment_td的inpaymentid,注意：inpayment红冲记录和被红冲记录的盘片明细id是一样。
    * @paramType java.lang.Long
    * @param inpaymentid - 收付流水号,对应mm_inpayment_td的inpaymentid,注意：inpayment红冲记录和被红冲记录的盘片明细id是一样。
     */
    public void setInpaymentid(Long inpaymentid) {
        this.inpaymentid = inpaymentid;
    }

    /**
    * 获取-盘片号，对应mm_platformfile的id
    * @return platformfileid
     */
    public String getPlatformfileid() {
        return platformfileid;
    }

    /**
    * 设置-盘片号，对应mm_platformfile的id
    * @paramType java.lang.String
    * @param platformfileid - 盘片号，对应mm_platformfile的id
     */
    public void setPlatformfileid(String platformfileid) {
        this.platformfileid = platformfileid;
    }

    /**
    * 获取-借贷标志 0收款 1付款
    * @return inpaymentflag
     */
    public String getInpaymentflag() {
        return inpaymentflag;
    }

    /**
    * 设置-借贷标志 0收款 1付款
    * @paramType java.lang.String
    * @param inpaymentflag - 借贷标志 0收款 1付款
     */
    public void setInpaymentflag(String inpaymentflag) {
        this.inpaymentflag = inpaymentflag;
    }

    /**
    * 获取-保单号.
    * @return policyno
     */
    public String getPolicyno() {
        return policyno;
    }

    /**
    * 设置-保单号.
    * @paramType java.lang.String
    * @param policyno - 保单号.
     */
    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    /**
    * 获取-商户号，网银报盘时使用
    * @return merchantno
     */
    public String getMerchantno() {
        return merchantno;
    }

    /**
    * 设置-商户号，网银报盘时使用
    * @paramType java.lang.String
    * @param merchantno - 商户号，网银报盘时使用
     */
    public void setMerchantno(String merchantno) {
        this.merchantno = merchantno;
    }

    /**
    * 获取-没转换过的失败原因类型（包含成功），详细分类见数据字典。
    * @return bankFailtype
     */
    public String getBankFailtype() {
        return bankFailtype;
    }

    /**
    * 设置-没转换过的失败原因类型（包含成功），详细分类见数据字典。
    * @paramType java.lang.String
    * @param bankFailtype - 没转换过的失败原因类型（包含成功），详细分类见数据字典。
     */
    public void setBankFailtype(String bankFailtype) {
        this.bankFailtype = bankFailtype;
    }

    /**
    * 获取-没转换过的支付信息。交易支付信息（包含支付成功信息、支付失败信息）
    * @return bankPayresultinfo
     */
    public String getBankPayresultinfo() {
        return bankPayresultinfo;
    }

    /**
    * 设置-没转换过的支付信息。交易支付信息（包含支付成功信息、支付失败信息）
    * @paramType java.lang.String
    * @param bankPayresultinfo - 没转换过的支付信息。交易支付信息（包含支付成功信息、支付失败信息）
     */
    public void setBankPayresultinfo(String bankPayresultinfo) {
        this.bankPayresultinfo = bankPayresultinfo;
    }

    /**
    * 获取-客户电子邮箱
    * @return custemail
     */
    public String getCustemail() {
        return custemail;
    }

    /**
    * 设置-客户电子邮箱
    * @paramType java.lang.String
    * @param custemail - 客户电子邮箱
     */
    public void setCustemail(String custemail) {
        this.custemail = custemail;
    }

    /**
    * 获取-客户手机号
    * @return mobilenumber
     */
    public String getMobilenumber() {
        return mobilenumber;
    }

    /**
    * 设置-客户手机号
    * @paramType java.lang.String
    * @param mobilenumber - 客户手机号
     */
    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    /**
    * 获取-短信通知标志。1：是 0：否
    * @return smsflag
     */
    public String getSmsflag() {
        return smsflag;
    }

    /**
    * 设置-短信通知标志。1：是 0：否
    * @paramType java.lang.String
    * @param smsflag - 短信通知标志。1：是 0：否
     */
    public void setSmsflag(String smsflag) {
        this.smsflag = smsflag;
    }

    /**
    * 获取-邮件通知标志。1：是 0：否
    * @return mailflag
     */
    public String getMailflag() {
        return mailflag;
    }

    /**
    * 设置-邮件通知标志。1：是 0：否
    * @paramType java.lang.String
    * @param mailflag - 邮件通知标志。1：是 0：否
     */
    public void setMailflag(String mailflag) {
        this.mailflag = mailflag;
    }

    /**
    * 获取-备用字段1
    * @return segment1
     */
    public String getSegment1() {
        return segment1;
    }

    /**
    * 设置-备用字段1
    * @paramType java.lang.String
    * @param segment1 - 备用字段1
     */
    public void setSegment1(String segment1) {
        this.segment1 = segment1;
    }

    /**
    * 获取-备用字段2
    * @return segment2
     */
    public String getSegment2() {
        return segment2;
    }

    /**
    * 设置-备用字段2
    * @paramType java.lang.String
    * @param segment2 - 备用字段2
     */
    public void setSegment2(String segment2) {
        this.segment2 = segment2;
    }

    /**
    * 获取-备用字段3
    * @return segment3
     */
    public String getSegment3() {
        return segment3;
    }

    /**
    * 设置-备用字段3
    * @paramType java.lang.String
    * @param segment3 - 备用字段3
     */
    public void setSegment3(String segment3) {
        this.segment3 = segment3;
    }

    /**
    * 获取-备用字段4
    * @return segment4
     */
    public String getSegment4() {
        return segment4;
    }

    /**
    * 设置-备用字段4
    * @paramType java.lang.String
    * @param segment4 - 备用字段4
     */
    public void setSegment4(String segment4) {
        this.segment4 = segment4;
    }

    /**
    * 获取-资金返回的票据号
    * @return atsbillno
     */
    public String getAtsbillno() {
        return atsbillno;
    }

    /**
    * 设置-资金返回的票据号
    * @paramType java.lang.String
    * @param atsbillno - 资金返回的票据号
     */
    public void setAtsbillno(String atsbillno) {
        this.atsbillno = atsbillno;
    }

    /**
    * 获取-客户账户区域，转账付款必填，默认为0。0 - 国内 1 - 国外
    * @return custaccountarea
     */
    public String getCustaccountarea() {
        return custaccountarea;
    }

    /**
    * 设置-客户账户区域，转账付款必填，默认为0。0 - 国内 1 - 国外
    * @paramType java.lang.String
    * @param custaccountarea - 客户账户区域，转账付款必填，默认为0。0 - 国内 1 - 国外
     */
    public void setCustaccountarea(String custaccountarea) {
        this.custaccountarea = custaccountarea;
    }

    /**
    * 获取-客户银行地址，境外汇款时使用
    * @return custbankaddr
     */
    public String getCustbankaddr() {
        return custbankaddr;
    }

    /**
    * 设置-客户银行地址，境外汇款时使用
    * @paramType java.lang.String
    * @param custbankaddr - 客户银行地址，境外汇款时使用
     */
    public void setCustbankaddr(String custbankaddr) {
        this.custbankaddr = custbankaddr;
    }

    /**
    * 获取-Swift Code：即国际银行代码，境外汇款时使用
    * @return custbankswiftcode
     */
    public String getCustbankswiftcode() {
        return custbankswiftcode;
    }

    /**
    * 设置-Swift Code：即国际银行代码，境外汇款时使用
    * @paramType java.lang.String
    * @param custbankswiftcode - Swift Code：即国际银行代码，境外汇款时使用
     */
    public void setCustbankswiftcode(String custbankswiftcode) {
        this.custbankswiftcode = custbankswiftcode;
    }

    /**
    * 获取-国内外费用承担：1汇款人OUR、2收款人BEN、3共同SHA
    * @return custchargetype
     */
    public String getCustchargetype() {
        return custchargetype;
    }

    /**
    * 设置-国内外费用承担：1汇款人OUR、2收款人BEN、3共同SHA
    * @paramType java.lang.String
    * @param custchargetype - 国内外费用承担：1汇款人OUR、2收款人BEN、3共同SHA
     */
    public void setCustchargetype(String custchargetype) {
        this.custchargetype = custchargetype;
    }

    /**
    * 获取-原币种
    * @return bCurrencode
     */
    public String getbCurrencode() {
        return bCurrencode;
    }

    /**
    * 设置-原币种
    * @paramType java.lang.String
    * @param bCurrencode - 原币种
     */
    public void setbCurrencode(String bCurrencode) {
        this.bCurrencode = bCurrencode;
    }

    /**
    * 获取-原金额
    * @return bAmount
     */
    public BigDecimal getbAmount() {
        return bAmount;
    }

    /**
    * 设置-原金额
    * @paramType java.math.BigDecimal
    * @param bAmount - 原金额
     */
    public void setbAmount(BigDecimal bAmount) {
        this.bAmount = bAmount;
    }

    /**
    * 获取-备用字段
    * @return segment5
     */
    public String getSegment5() {
        return segment5;
    }

    /**
    * 设置-备用字段
    * @paramType java.lang.String
    * @param segment5 - 备用字段
     */
    public void setSegment5(String segment5) {
        this.segment5 = segment5;
    }

    /**
    * 获取-资金系统开始支付时间
    * @return begintime
     */
    public Date getBegintime() {
        return begintime;
    }

    /**
    * 设置-资金系统开始支付时间
    * @paramType java.util.Date
    * @param begintime - 资金系统开始支付时间
     */
    public void setBegintime(Date begintime) {
        this.begintime = begintime;
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
    * 获取-定时任务批次号
    * @return timingBatchno
     */
    public String getTimingBatchno() {
        return timingBatchno;
    }

    /**
    * 设置-定时任务批次号
    * @paramType java.lang.String
    * @param timingBatchno - 定时任务批次号
     */
    public void setTimingBatchno(String timingBatchno) {
        this.timingBatchno = timingBatchno;
    }
}