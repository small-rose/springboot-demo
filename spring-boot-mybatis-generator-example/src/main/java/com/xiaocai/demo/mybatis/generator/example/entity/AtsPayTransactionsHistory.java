package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : ats_pay_transactions_history
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class AtsPayTransactionsHistory {
    /**
     * 物理主键
     */
    private Long urid;

    /**
     * 来源系统。  分配的固定值
     */
    private String sourceName;

    /**
     * 来源批号。  批次控制，全局唯一
     */
    private String recordsourceBatno;

    /**
     * 来源单据流水号。  批次内控制，批内唯一
     */
    private String originNote;

    /**
     * 申请组织。  单据的业务发生组织
     */
    private String applyEntityCode;

    /**
     * 申请部门。  单据的业务发生部门
     */
    private String applyDeptCode;

    /**
     * 付款日期。  付款日期
     */
    private Date payDate;

    /**
     * 结算方式。  转账、支票、现金等付款方式
     */
    private String settlementMode;

    /**
     * 交易类型。  业务类型，如理赔、工资等
     */
    private String payTypeCode;

    /**
     * 资金类别。  资金流量维度分析
     */
    private String categoryCode;

    /**
     * 资金子类别。  资金流量维度分析
     */
    private String subCategoryCode;

    /**
     * 计划项目。  用于计划控制或按计划项目进行数据统计
     */
    private String budgetItemCode;

    /**
     * 付方组织。  付方组织，可空
     */
    private String payEntityCode;

    /**
     * 付方银行。  付方银行，可空
     */
    private String payBank;

    /**
     * 付方账户。  
     */
    private String payAccount;

    /**
     * 收方对象类型。  "3—员工 4－供应商 5—手工，对于一般业务代付填5"
     */
    private BigDecimal recObjectType;

    /**
     * 收方名称。  当收方对象类型为员工时,收方名称为员工姓名.收方对象类型为供应商时,收方名称为供应商名称,当收方对象类型为手工时,收方名称和收方户名一致
     */
    private String recName;

    /**
     * 收方银行区域。  直联支付必填
     */
    private String recBankArea;

    /**
     * 收方银行。  直联支付必填
     */
    private String recBank;

    /**
     * 收方银行开户行。  直联支付必填
     */
    private String recBankLocations;

    /**
     * 收方银行联行号。  直联支付必填
     */
    private String cnapscode;

    /**
     * 收方账户。  直联支付必填
     */
    private String recAccount;

    /**
     * 收方户名。  直联支付必填
     */
    private String recAccountName;

    /**
     * 交易币种。  "CNY-人民币 USD-美元 "
     */
    private String recCurrency;

    /**
     * 交易金额。  
     */
    private BigDecimal recMoney;

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
     * 来源系统单据号码。  外部系统需要在资金建立关系的可识别业务单据号
     */
    private String sourceNotecode;

    /**
     * 公私标志。  "1 - 对私 2 - 对公"
     */
    private Short isprivate;

    /**
     * 卡折标志。  "折：1 借记卡：2 贷记卡：3 准贷记卡：4 "
     */
    private BigDecimal cardFlag;

    /**
     * 加急标志。  "0 - 普通 1 - 加急"
     */
    private BigDecimal fastFlag;

    /**
     * 证件类型。  
     */
    private Short credentials;

    /**
     * 证件号码。  
     */
    private String idCard;

    /**
     * 信用卡CVV码。  填写信用卡反面的3位CVV码,如果没有的填“***”
     */
    private String cvvCode;

    /**
     * 信用卡有效期。  格式为：MMYY
     */
    private String validDate;

    /**
     * 资金系统抽档状态。  "1 - 未抽档 2 - 已抽档 3 - 抽档失败 4 - 抽档中"
     */
    private BigDecimal atsDealstate;

    /**
     * 资金系统抽档时间。  
     */
    private Date atsDealdate;

    /**
     * 资金系统处理错误信息。  抽档失败的错误信息，如：数据不全，数据格式不对
     */
    private String atsDealerrorinfo;

    /**
     * 资金系统返盘状态。  "1 - 未返盘 2 - 已返盘 3 - 返盘失败"
     */
    private BigDecimal atsReturnstate;

    /**
     * 资金系统返盘时间。  
     */
    private Date atsReturndate;

    /**
     * 资金系统返盘信息。  
     */
    private String atsReturninfo;

    /**
     * 支付状态。  "1 - 未支付 2 - 已支付 3 - 支付失败 4 - 支付中"
     */
    private BigDecimal payState;

    /**
     * 支付成功日期。  资金系统回写
     */
    private Date payMadeDate;

    /**
     * 支付信息。  交易支付信息（包含支付成功信息、支付失败信息）
     */
    private String payInfo;

    /**
     * 失败原因类型。  "0-空 1-抽档失败 2-直接作废 3-支付失败 注：失败原因类型代表了交易数据在哪一阶段作失败处理， 抽档失败发生在数据进资金系统之前， 直接作废发生在数据发银行之前， 支付失败发生在数据发银行之后。"
     */
    private BigDecimal failType;

    /**
     * 对账码。  对账码
     */
    private String abstract;

    /**
     * 核对批号。  核对批号
     */
    private String checkbatchno;

    /**
     * 退票状态。  "1 - 未退票 2 - 已退票"
     */
    private BigDecimal refundState;

    /**
     * 退票信息。  
     */
    private String refundInfo;

    /**
     * 退票日期。  
     */
    private Date refundTime;

    /**
     * 票据类型。  现金支票、转账支票等票据类型
     */
    private String billtype;

    /**
     * 票据号。  票据号
     */
    private String billcode;

    /**
     * 来源系统处理状态。  "1 - 未处理 2 - 已处理 3 - 处理失败 4 - 处理中"
     */
    private BigDecimal sourceDealstate;

    /**
     * 来源系统处理时间。  
     */
    private Date sourceDealdate;

    /**
     * 来源系统处理错误信息。  
     */
    private String sourceDealerrorinfo;

    /**
     * 来源系统退票处理状态。  "1 - 未处理 2 - 已处理 3 - 处理失败 4 - 处理中"
     */
    private BigDecimal sourceRefunddealstate;

    /**
     * 来源系统退票处理时间。  
     */
    private Date sourceRefunddealdate;

    /**
     * 来源系统退票处理错误信息。  
     */
    private String sourceRefunddealerrorinfo;

    /**
     * 创建者 。  
     */
    private BigDecimal createdBy;

    /**
     * 创建日期。  
     */
    private Date creationDate;

    /**
     * 最后更新者。  初始为创建者
     */
    private BigDecimal lastUpdatedBy;

    /**
     * 最后更新日期。  初始为创建日期
     */
    private Date lastUpdateDate;

    /**
     * 记录版本号。  数据记录版本号，每次更新加一
     */
    private BigDecimal rowVersion;

    /**
     * 数据分离时间
     */
    private Date movedate;

    /**
    * 获取-物理主键
    * @return urid
     */
    public Long getUrid() {
        return urid;
    }

    /**
    * 设置-物理主键
    * @paramType java.lang.Long
    * @param urid - 物理主键
     */
    public void setUrid(Long urid) {
        this.urid = urid;
    }

    /**
    * 获取-来源系统。  分配的固定值
    * @return sourceName
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
    * 设置-来源系统。  分配的固定值
    * @paramType java.lang.String
    * @param sourceName - 来源系统。  分配的固定值
     */
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
    * 获取-来源批号。  批次控制，全局唯一
    * @return recordsourceBatno
     */
    public String getRecordsourceBatno() {
        return recordsourceBatno;
    }

    /**
    * 设置-来源批号。  批次控制，全局唯一
    * @paramType java.lang.String
    * @param recordsourceBatno - 来源批号。  批次控制，全局唯一
     */
    public void setRecordsourceBatno(String recordsourceBatno) {
        this.recordsourceBatno = recordsourceBatno;
    }

    /**
    * 获取-来源单据流水号。  批次内控制，批内唯一
    * @return originNote
     */
    public String getOriginNote() {
        return originNote;
    }

    /**
    * 设置-来源单据流水号。  批次内控制，批内唯一
    * @paramType java.lang.String
    * @param originNote - 来源单据流水号。  批次内控制，批内唯一
     */
    public void setOriginNote(String originNote) {
        this.originNote = originNote;
    }

    /**
    * 获取-申请组织。  单据的业务发生组织
    * @return applyEntityCode
     */
    public String getApplyEntityCode() {
        return applyEntityCode;
    }

    /**
    * 设置-申请组织。  单据的业务发生组织
    * @paramType java.lang.String
    * @param applyEntityCode - 申请组织。  单据的业务发生组织
     */
    public void setApplyEntityCode(String applyEntityCode) {
        this.applyEntityCode = applyEntityCode;
    }

    /**
    * 获取-申请部门。  单据的业务发生部门
    * @return applyDeptCode
     */
    public String getApplyDeptCode() {
        return applyDeptCode;
    }

    /**
    * 设置-申请部门。  单据的业务发生部门
    * @paramType java.lang.String
    * @param applyDeptCode - 申请部门。  单据的业务发生部门
     */
    public void setApplyDeptCode(String applyDeptCode) {
        this.applyDeptCode = applyDeptCode;
    }

    /**
    * 获取-付款日期。  付款日期
    * @return payDate
     */
    public Date getPayDate() {
        return payDate;
    }

    /**
    * 设置-付款日期。  付款日期
    * @paramType java.util.Date
    * @param payDate - 付款日期。  付款日期
     */
    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    /**
    * 获取-结算方式。  转账、支票、现金等付款方式
    * @return settlementMode
     */
    public String getSettlementMode() {
        return settlementMode;
    }

    /**
    * 设置-结算方式。  转账、支票、现金等付款方式
    * @paramType java.lang.String
    * @param settlementMode - 结算方式。  转账、支票、现金等付款方式
     */
    public void setSettlementMode(String settlementMode) {
        this.settlementMode = settlementMode;
    }

    /**
    * 获取-交易类型。  业务类型，如理赔、工资等
    * @return payTypeCode
     */
    public String getPayTypeCode() {
        return payTypeCode;
    }

    /**
    * 设置-交易类型。  业务类型，如理赔、工资等
    * @paramType java.lang.String
    * @param payTypeCode - 交易类型。  业务类型，如理赔、工资等
     */
    public void setPayTypeCode(String payTypeCode) {
        this.payTypeCode = payTypeCode;
    }

    /**
    * 获取-资金类别。  资金流量维度分析
    * @return categoryCode
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
    * 设置-资金类别。  资金流量维度分析
    * @paramType java.lang.String
    * @param categoryCode - 资金类别。  资金流量维度分析
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    /**
    * 获取-资金子类别。  资金流量维度分析
    * @return subCategoryCode
     */
    public String getSubCategoryCode() {
        return subCategoryCode;
    }

    /**
    * 设置-资金子类别。  资金流量维度分析
    * @paramType java.lang.String
    * @param subCategoryCode - 资金子类别。  资金流量维度分析
     */
    public void setSubCategoryCode(String subCategoryCode) {
        this.subCategoryCode = subCategoryCode;
    }

    /**
    * 获取-计划项目。  用于计划控制或按计划项目进行数据统计
    * @return budgetItemCode
     */
    public String getBudgetItemCode() {
        return budgetItemCode;
    }

    /**
    * 设置-计划项目。  用于计划控制或按计划项目进行数据统计
    * @paramType java.lang.String
    * @param budgetItemCode - 计划项目。  用于计划控制或按计划项目进行数据统计
     */
    public void setBudgetItemCode(String budgetItemCode) {
        this.budgetItemCode = budgetItemCode;
    }

    /**
    * 获取-付方组织。  付方组织，可空
    * @return payEntityCode
     */
    public String getPayEntityCode() {
        return payEntityCode;
    }

    /**
    * 设置-付方组织。  付方组织，可空
    * @paramType java.lang.String
    * @param payEntityCode - 付方组织。  付方组织，可空
     */
    public void setPayEntityCode(String payEntityCode) {
        this.payEntityCode = payEntityCode;
    }

    /**
    * 获取-付方银行。  付方银行，可空
    * @return payBank
     */
    public String getPayBank() {
        return payBank;
    }

    /**
    * 设置-付方银行。  付方银行，可空
    * @paramType java.lang.String
    * @param payBank - 付方银行。  付方银行，可空
     */
    public void setPayBank(String payBank) {
        this.payBank = payBank;
    }

    /**
    * 获取-付方账户。  
    * @return payAccount
     */
    public String getPayAccount() {
        return payAccount;
    }

    /**
    * 设置-付方账户。  
    * @paramType java.lang.String
    * @param payAccount - 付方账户。  
     */
    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    /**
    * 获取-收方对象类型。  "3—员工 4－供应商 5—手工，对于一般业务代付填5"
    * @return recObjectType
     */
    public BigDecimal getRecObjectType() {
        return recObjectType;
    }

    /**
    * 设置-收方对象类型。  "3—员工 4－供应商 5—手工，对于一般业务代付填5"
    * @paramType java.math.BigDecimal
    * @param recObjectType - 收方对象类型。  "3—员工 4－供应商 5—手工，对于一般业务代付填5"
     */
    public void setRecObjectType(BigDecimal recObjectType) {
        this.recObjectType = recObjectType;
    }

    /**
    * 获取-收方名称。  当收方对象类型为员工时,收方名称为员工姓名.收方对象类型为供应商时,收方名称为供应商名称,当收方对象类型为手工时,收方名称和收方户名一致
    * @return recName
     */
    public String getRecName() {
        return recName;
    }

    /**
    * 设置-收方名称。  当收方对象类型为员工时,收方名称为员工姓名.收方对象类型为供应商时,收方名称为供应商名称,当收方对象类型为手工时,收方名称和收方户名一致
    * @paramType java.lang.String
    * @param recName - 收方名称。  当收方对象类型为员工时,收方名称为员工姓名.收方对象类型为供应商时,收方名称为供应商名称,当收方对象类型为手工时,收方名称和收方户名一致
     */
    public void setRecName(String recName) {
        this.recName = recName;
    }

    /**
    * 获取-收方银行区域。  直联支付必填
    * @return recBankArea
     */
    public String getRecBankArea() {
        return recBankArea;
    }

    /**
    * 设置-收方银行区域。  直联支付必填
    * @paramType java.lang.String
    * @param recBankArea - 收方银行区域。  直联支付必填
     */
    public void setRecBankArea(String recBankArea) {
        this.recBankArea = recBankArea;
    }

    /**
    * 获取-收方银行。  直联支付必填
    * @return recBank
     */
    public String getRecBank() {
        return recBank;
    }

    /**
    * 设置-收方银行。  直联支付必填
    * @paramType java.lang.String
    * @param recBank - 收方银行。  直联支付必填
     */
    public void setRecBank(String recBank) {
        this.recBank = recBank;
    }

    /**
    * 获取-收方银行开户行。  直联支付必填
    * @return recBankLocations
     */
    public String getRecBankLocations() {
        return recBankLocations;
    }

    /**
    * 设置-收方银行开户行。  直联支付必填
    * @paramType java.lang.String
    * @param recBankLocations - 收方银行开户行。  直联支付必填
     */
    public void setRecBankLocations(String recBankLocations) {
        this.recBankLocations = recBankLocations;
    }

    /**
    * 获取-收方银行联行号。  直联支付必填
    * @return cnapscode
     */
    public String getCnapscode() {
        return cnapscode;
    }

    /**
    * 设置-收方银行联行号。  直联支付必填
    * @paramType java.lang.String
    * @param cnapscode - 收方银行联行号。  直联支付必填
     */
    public void setCnapscode(String cnapscode) {
        this.cnapscode = cnapscode;
    }

    /**
    * 获取-收方账户。  直联支付必填
    * @return recAccount
     */
    public String getRecAccount() {
        return recAccount;
    }

    /**
    * 设置-收方账户。  直联支付必填
    * @paramType java.lang.String
    * @param recAccount - 收方账户。  直联支付必填
     */
    public void setRecAccount(String recAccount) {
        this.recAccount = recAccount;
    }

    /**
    * 获取-收方户名。  直联支付必填
    * @return recAccountName
     */
    public String getRecAccountName() {
        return recAccountName;
    }

    /**
    * 设置-收方户名。  直联支付必填
    * @paramType java.lang.String
    * @param recAccountName - 收方户名。  直联支付必填
     */
    public void setRecAccountName(String recAccountName) {
        this.recAccountName = recAccountName;
    }

    /**
    * 获取-交易币种。  "CNY-人民币 USD-美元 "
    * @return recCurrency
     */
    public String getRecCurrency() {
        return recCurrency;
    }

    /**
    * 设置-交易币种。  "CNY-人民币 USD-美元 "
    * @paramType java.lang.String
    * @param recCurrency - 交易币种。  "CNY-人民币 USD-美元 "
     */
    public void setRecCurrency(String recCurrency) {
        this.recCurrency = recCurrency;
    }

    /**
    * 获取-交易金额。  
    * @return recMoney
     */
    public BigDecimal getRecMoney() {
        return recMoney;
    }

    /**
    * 设置-交易金额。  
    * @paramType java.math.BigDecimal
    * @param recMoney - 交易金额。  
     */
    public void setRecMoney(BigDecimal recMoney) {
        this.recMoney = recMoney;
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
    * 获取-来源系统单据号码。  外部系统需要在资金建立关系的可识别业务单据号
    * @return sourceNotecode
     */
    public String getSourceNotecode() {
        return sourceNotecode;
    }

    /**
    * 设置-来源系统单据号码。  外部系统需要在资金建立关系的可识别业务单据号
    * @paramType java.lang.String
    * @param sourceNotecode - 来源系统单据号码。  外部系统需要在资金建立关系的可识别业务单据号
     */
    public void setSourceNotecode(String sourceNotecode) {
        this.sourceNotecode = sourceNotecode;
    }

    /**
    * 获取-公私标志。  "1 - 对私 2 - 对公"
    * @return isprivate
     */
    public Short getIsprivate() {
        return isprivate;
    }

    /**
    * 设置-公私标志。  "1 - 对私 2 - 对公"
    * @paramType java.lang.Short
    * @param isprivate - 公私标志。  "1 - 对私 2 - 对公"
     */
    public void setIsprivate(Short isprivate) {
        this.isprivate = isprivate;
    }

    /**
    * 获取-卡折标志。  "折：1 借记卡：2 贷记卡：3 准贷记卡：4 "
    * @return cardFlag
     */
    public BigDecimal getCardFlag() {
        return cardFlag;
    }

    /**
    * 设置-卡折标志。  "折：1 借记卡：2 贷记卡：3 准贷记卡：4 "
    * @paramType java.math.BigDecimal
    * @param cardFlag - 卡折标志。  "折：1 借记卡：2 贷记卡：3 准贷记卡：4 "
     */
    public void setCardFlag(BigDecimal cardFlag) {
        this.cardFlag = cardFlag;
    }

    /**
    * 获取-加急标志。  "0 - 普通 1 - 加急"
    * @return fastFlag
     */
    public BigDecimal getFastFlag() {
        return fastFlag;
    }

    /**
    * 设置-加急标志。  "0 - 普通 1 - 加急"
    * @paramType java.math.BigDecimal
    * @param fastFlag - 加急标志。  "0 - 普通 1 - 加急"
     */
    public void setFastFlag(BigDecimal fastFlag) {
        this.fastFlag = fastFlag;
    }

    /**
    * 获取-证件类型。  
    * @return credentials
     */
    public Short getCredentials() {
        return credentials;
    }

    /**
    * 设置-证件类型。  
    * @paramType java.lang.Short
    * @param credentials - 证件类型。  
     */
    public void setCredentials(Short credentials) {
        this.credentials = credentials;
    }

    /**
    * 获取-证件号码。  
    * @return idCard
     */
    public String getIdCard() {
        return idCard;
    }

    /**
    * 设置-证件号码。  
    * @paramType java.lang.String
    * @param idCard - 证件号码。  
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
    * 获取-信用卡CVV码。  填写信用卡反面的3位CVV码,如果没有的填“***”
    * @return cvvCode
     */
    public String getCvvCode() {
        return cvvCode;
    }

    /**
    * 设置-信用卡CVV码。  填写信用卡反面的3位CVV码,如果没有的填“***”
    * @paramType java.lang.String
    * @param cvvCode - 信用卡CVV码。  填写信用卡反面的3位CVV码,如果没有的填“***”
     */
    public void setCvvCode(String cvvCode) {
        this.cvvCode = cvvCode;
    }

    /**
    * 获取-信用卡有效期。  格式为：MMYY
    * @return validDate
     */
    public String getValidDate() {
        return validDate;
    }

    /**
    * 设置-信用卡有效期。  格式为：MMYY
    * @paramType java.lang.String
    * @param validDate - 信用卡有效期。  格式为：MMYY
     */
    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    /**
    * 获取-资金系统抽档状态。  "1 - 未抽档 2 - 已抽档 3 - 抽档失败 4 - 抽档中"
    * @return atsDealstate
     */
    public BigDecimal getAtsDealstate() {
        return atsDealstate;
    }

    /**
    * 设置-资金系统抽档状态。  "1 - 未抽档 2 - 已抽档 3 - 抽档失败 4 - 抽档中"
    * @paramType java.math.BigDecimal
    * @param atsDealstate - 资金系统抽档状态。  "1 - 未抽档 2 - 已抽档 3 - 抽档失败 4 - 抽档中"
     */
    public void setAtsDealstate(BigDecimal atsDealstate) {
        this.atsDealstate = atsDealstate;
    }

    /**
    * 获取-资金系统抽档时间。  
    * @return atsDealdate
     */
    public Date getAtsDealdate() {
        return atsDealdate;
    }

    /**
    * 设置-资金系统抽档时间。  
    * @paramType java.util.Date
    * @param atsDealdate - 资金系统抽档时间。  
     */
    public void setAtsDealdate(Date atsDealdate) {
        this.atsDealdate = atsDealdate;
    }

    /**
    * 获取-资金系统处理错误信息。  抽档失败的错误信息，如：数据不全，数据格式不对
    * @return atsDealerrorinfo
     */
    public String getAtsDealerrorinfo() {
        return atsDealerrorinfo;
    }

    /**
    * 设置-资金系统处理错误信息。  抽档失败的错误信息，如：数据不全，数据格式不对
    * @paramType java.lang.String
    * @param atsDealerrorinfo - 资金系统处理错误信息。  抽档失败的错误信息，如：数据不全，数据格式不对
     */
    public void setAtsDealerrorinfo(String atsDealerrorinfo) {
        this.atsDealerrorinfo = atsDealerrorinfo;
    }

    /**
    * 获取-资金系统返盘状态。  "1 - 未返盘 2 - 已返盘 3 - 返盘失败"
    * @return atsReturnstate
     */
    public BigDecimal getAtsReturnstate() {
        return atsReturnstate;
    }

    /**
    * 设置-资金系统返盘状态。  "1 - 未返盘 2 - 已返盘 3 - 返盘失败"
    * @paramType java.math.BigDecimal
    * @param atsReturnstate - 资金系统返盘状态。  "1 - 未返盘 2 - 已返盘 3 - 返盘失败"
     */
    public void setAtsReturnstate(BigDecimal atsReturnstate) {
        this.atsReturnstate = atsReturnstate;
    }

    /**
    * 获取-资金系统返盘时间。  
    * @return atsReturndate
     */
    public Date getAtsReturndate() {
        return atsReturndate;
    }

    /**
    * 设置-资金系统返盘时间。  
    * @paramType java.util.Date
    * @param atsReturndate - 资金系统返盘时间。  
     */
    public void setAtsReturndate(Date atsReturndate) {
        this.atsReturndate = atsReturndate;
    }

    /**
    * 获取-资金系统返盘信息。  
    * @return atsReturninfo
     */
    public String getAtsReturninfo() {
        return atsReturninfo;
    }

    /**
    * 设置-资金系统返盘信息。  
    * @paramType java.lang.String
    * @param atsReturninfo - 资金系统返盘信息。  
     */
    public void setAtsReturninfo(String atsReturninfo) {
        this.atsReturninfo = atsReturninfo;
    }

    /**
    * 获取-支付状态。  "1 - 未支付 2 - 已支付 3 - 支付失败 4 - 支付中"
    * @return payState
     */
    public BigDecimal getPayState() {
        return payState;
    }

    /**
    * 设置-支付状态。  "1 - 未支付 2 - 已支付 3 - 支付失败 4 - 支付中"
    * @paramType java.math.BigDecimal
    * @param payState - 支付状态。  "1 - 未支付 2 - 已支付 3 - 支付失败 4 - 支付中"
     */
    public void setPayState(BigDecimal payState) {
        this.payState = payState;
    }

    /**
    * 获取-支付成功日期。  资金系统回写
    * @return payMadeDate
     */
    public Date getPayMadeDate() {
        return payMadeDate;
    }

    /**
    * 设置-支付成功日期。  资金系统回写
    * @paramType java.util.Date
    * @param payMadeDate - 支付成功日期。  资金系统回写
     */
    public void setPayMadeDate(Date payMadeDate) {
        this.payMadeDate = payMadeDate;
    }

    /**
    * 获取-支付信息。  交易支付信息（包含支付成功信息、支付失败信息）
    * @return payInfo
     */
    public String getPayInfo() {
        return payInfo;
    }

    /**
    * 设置-支付信息。  交易支付信息（包含支付成功信息、支付失败信息）
    * @paramType java.lang.String
    * @param payInfo - 支付信息。  交易支付信息（包含支付成功信息、支付失败信息）
     */
    public void setPayInfo(String payInfo) {
        this.payInfo = payInfo;
    }

    /**
    * 获取-失败原因类型。  "0-空 1-抽档失败 2-直接作废 3-支付失败 注：失败原因类型代表了交易数据在哪一阶段作失败处理， 抽档失败发生在数据进资金系统之前， 直接作废发生在数据发银行之前， 支付失败发生在数据发银行之后。"
    * @return failType
     */
    public BigDecimal getFailType() {
        return failType;
    }

    /**
    * 设置-失败原因类型。  "0-空 1-抽档失败 2-直接作废 3-支付失败 注：失败原因类型代表了交易数据在哪一阶段作失败处理， 抽档失败发生在数据进资金系统之前， 直接作废发生在数据发银行之前， 支付失败发生在数据发银行之后。"
    * @paramType java.math.BigDecimal
    * @param failType - 失败原因类型。  "0-空 1-抽档失败 2-直接作废 3-支付失败 注：失败原因类型代表了交易数据在哪一阶段作失败处理， 抽档失败发生在数据进资金系统之前， 直接作废发生在数据发银行之前， 支付失败发生在数据发银行之后。"
     */
    public void setFailType(BigDecimal failType) {
        this.failType = failType;
    }

    /**
    * 获取-对账码。  对账码
    * @return abstract
     */
    public String getAbstract() {
        return abstract;
    }

    /**
    * 设置-对账码。  对账码
    * @paramType java.lang.String
    * @param abstract - 对账码。  对账码
     */
    public void setAbstract(String abstract) {
        this.abstract = abstract;
    }

    /**
    * 获取-核对批号。  核对批号
    * @return checkbatchno
     */
    public String getCheckbatchno() {
        return checkbatchno;
    }

    /**
    * 设置-核对批号。  核对批号
    * @paramType java.lang.String
    * @param checkbatchno - 核对批号。  核对批号
     */
    public void setCheckbatchno(String checkbatchno) {
        this.checkbatchno = checkbatchno;
    }

    /**
    * 获取-退票状态。  "1 - 未退票 2 - 已退票"
    * @return refundState
     */
    public BigDecimal getRefundState() {
        return refundState;
    }

    /**
    * 设置-退票状态。  "1 - 未退票 2 - 已退票"
    * @paramType java.math.BigDecimal
    * @param refundState - 退票状态。  "1 - 未退票 2 - 已退票"
     */
    public void setRefundState(BigDecimal refundState) {
        this.refundState = refundState;
    }

    /**
    * 获取-退票信息。  
    * @return refundInfo
     */
    public String getRefundInfo() {
        return refundInfo;
    }

    /**
    * 设置-退票信息。  
    * @paramType java.lang.String
    * @param refundInfo - 退票信息。  
     */
    public void setRefundInfo(String refundInfo) {
        this.refundInfo = refundInfo;
    }

    /**
    * 获取-退票日期。  
    * @return refundTime
     */
    public Date getRefundTime() {
        return refundTime;
    }

    /**
    * 设置-退票日期。  
    * @paramType java.util.Date
    * @param refundTime - 退票日期。  
     */
    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    /**
    * 获取-票据类型。  现金支票、转账支票等票据类型
    * @return billtype
     */
    public String getBilltype() {
        return billtype;
    }

    /**
    * 设置-票据类型。  现金支票、转账支票等票据类型
    * @paramType java.lang.String
    * @param billtype - 票据类型。  现金支票、转账支票等票据类型
     */
    public void setBilltype(String billtype) {
        this.billtype = billtype;
    }

    /**
    * 获取-票据号。  票据号
    * @return billcode
     */
    public String getBillcode() {
        return billcode;
    }

    /**
    * 设置-票据号。  票据号
    * @paramType java.lang.String
    * @param billcode - 票据号。  票据号
     */
    public void setBillcode(String billcode) {
        this.billcode = billcode;
    }

    /**
    * 获取-来源系统处理状态。  "1 - 未处理 2 - 已处理 3 - 处理失败 4 - 处理中"
    * @return sourceDealstate
     */
    public BigDecimal getSourceDealstate() {
        return sourceDealstate;
    }

    /**
    * 设置-来源系统处理状态。  "1 - 未处理 2 - 已处理 3 - 处理失败 4 - 处理中"
    * @paramType java.math.BigDecimal
    * @param sourceDealstate - 来源系统处理状态。  "1 - 未处理 2 - 已处理 3 - 处理失败 4 - 处理中"
     */
    public void setSourceDealstate(BigDecimal sourceDealstate) {
        this.sourceDealstate = sourceDealstate;
    }

    /**
    * 获取-来源系统处理时间。  
    * @return sourceDealdate
     */
    public Date getSourceDealdate() {
        return sourceDealdate;
    }

    /**
    * 设置-来源系统处理时间。  
    * @paramType java.util.Date
    * @param sourceDealdate - 来源系统处理时间。  
     */
    public void setSourceDealdate(Date sourceDealdate) {
        this.sourceDealdate = sourceDealdate;
    }

    /**
    * 获取-来源系统处理错误信息。  
    * @return sourceDealerrorinfo
     */
    public String getSourceDealerrorinfo() {
        return sourceDealerrorinfo;
    }

    /**
    * 设置-来源系统处理错误信息。  
    * @paramType java.lang.String
    * @param sourceDealerrorinfo - 来源系统处理错误信息。  
     */
    public void setSourceDealerrorinfo(String sourceDealerrorinfo) {
        this.sourceDealerrorinfo = sourceDealerrorinfo;
    }

    /**
    * 获取-来源系统退票处理状态。  "1 - 未处理 2 - 已处理 3 - 处理失败 4 - 处理中"
    * @return sourceRefunddealstate
     */
    public BigDecimal getSourceRefunddealstate() {
        return sourceRefunddealstate;
    }

    /**
    * 设置-来源系统退票处理状态。  "1 - 未处理 2 - 已处理 3 - 处理失败 4 - 处理中"
    * @paramType java.math.BigDecimal
    * @param sourceRefunddealstate - 来源系统退票处理状态。  "1 - 未处理 2 - 已处理 3 - 处理失败 4 - 处理中"
     */
    public void setSourceRefunddealstate(BigDecimal sourceRefunddealstate) {
        this.sourceRefunddealstate = sourceRefunddealstate;
    }

    /**
    * 获取-来源系统退票处理时间。  
    * @return sourceRefunddealdate
     */
    public Date getSourceRefunddealdate() {
        return sourceRefunddealdate;
    }

    /**
    * 设置-来源系统退票处理时间。  
    * @paramType java.util.Date
    * @param sourceRefunddealdate - 来源系统退票处理时间。  
     */
    public void setSourceRefunddealdate(Date sourceRefunddealdate) {
        this.sourceRefunddealdate = sourceRefunddealdate;
    }

    /**
    * 获取-来源系统退票处理错误信息。  
    * @return sourceRefunddealerrorinfo
     */
    public String getSourceRefunddealerrorinfo() {
        return sourceRefunddealerrorinfo;
    }

    /**
    * 设置-来源系统退票处理错误信息。  
    * @paramType java.lang.String
    * @param sourceRefunddealerrorinfo - 来源系统退票处理错误信息。  
     */
    public void setSourceRefunddealerrorinfo(String sourceRefunddealerrorinfo) {
        this.sourceRefunddealerrorinfo = sourceRefunddealerrorinfo;
    }

    /**
    * 获取-创建者 。  
    * @return createdBy
     */
    public BigDecimal getCreatedBy() {
        return createdBy;
    }

    /**
    * 设置-创建者 。  
    * @paramType java.math.BigDecimal
    * @param createdBy - 创建者 。  
     */
    public void setCreatedBy(BigDecimal createdBy) {
        this.createdBy = createdBy;
    }

    /**
    * 获取-创建日期。  
    * @return creationDate
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
    * 设置-创建日期。  
    * @paramType java.util.Date
    * @param creationDate - 创建日期。  
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
    * 获取-最后更新者。  初始为创建者
    * @return lastUpdatedBy
     */
    public BigDecimal getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
    * 设置-最后更新者。  初始为创建者
    * @paramType java.math.BigDecimal
    * @param lastUpdatedBy - 最后更新者。  初始为创建者
     */
    public void setLastUpdatedBy(BigDecimal lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
    * 获取-最后更新日期。  初始为创建日期
    * @return lastUpdateDate
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
    * 设置-最后更新日期。  初始为创建日期
    * @paramType java.util.Date
    * @param lastUpdateDate - 最后更新日期。  初始为创建日期
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
    * 获取-记录版本号。  数据记录版本号，每次更新加一
    * @return rowVersion
     */
    public BigDecimal getRowVersion() {
        return rowVersion;
    }

    /**
    * 设置-记录版本号。  数据记录版本号，每次更新加一
    * @paramType java.math.BigDecimal
    * @param rowVersion - 记录版本号。  数据记录版本号，每次更新加一
     */
    public void setRowVersion(BigDecimal rowVersion) {
        this.rowVersion = rowVersion;
    }

    /**
    * 获取-数据分离时间
    * @return movedate
     */
    public Date getMovedate() {
        return movedate;
    }

    /**
    * 设置-数据分离时间
    * @paramType java.util.Date
    * @param movedate - 数据分离时间
     */
    public void setMovedate(Date movedate) {
        this.movedate = movedate;
    }
}