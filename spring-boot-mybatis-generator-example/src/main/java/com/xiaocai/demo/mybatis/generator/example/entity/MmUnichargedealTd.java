package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_unichargedeal_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmUnichargedealTd {
    /**
     * 主键
     */
    private Long seqchargedeal;

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
     * 申请号
     */
    private String applyno;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 保单、储金和赔款实收实付的类型：保单实收A01，保单实付A02；车船税实收AA1，车船税实付AA2； 储金实收B01，储金实付（退储、储返）B02，储金红利B03；赔款实付C01；手续费实收D01；手续费实付D02
     */
    private String businessone;

    /**
     * 区分数据范围，001 预收，002 历史迁移，003预收销应收（付）
     */
    private String businesstwo;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 操作人
     */
    private String opcode;

    /**
     * 险种
     */
    private String classescode;

    /**
     * 部门代码
     */
    private String departmentcode;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 支付类型:911,921 现金;912,922 银行;... 其他
     */
    private String type;

    /**
     * 业务来源
     */
    private String datasource;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 手工修改数据说明
     */
    private String modifydesc;

    /**
     * HIBERNATEVERSION版本号
     */
    private Integer hibernateversion;

    /**
     * 记录交易流水表流水号
     */
    private Long fatherno;

    /**
     * 客户账号
     */
    private String custaccountno;

    /**
     * 日结单明细表的SEQREPORTNO
     */
    private Long seqreportno;

    /**
     * 见费出单商户号mm_bankinpay_td.businessno;账号mm_account_td.accountno
     */
    private String accountno;

    /**
     * 被保人名称
     */
    private String insuredname;

    /**
     * 例外状态：0正常，1支付至责任保险第三者，2法院判决，3共保业务，4交强险垫/预付，5车辆过户，6其他。
     */
    private String exstatus;

    /**
     * 针对“例外状态”的说明
     */
    private String exceptioncause;

    /**
     * 银行
     */
    private String banks;

    /**
     * 银行名称
     */
    private String bankname;

    /**
     * 业务唯一号
     */
    private String custseq;

    /**
     * 赔案数据类型：01标的赔款， 02核赔费，03查勘费，04代查勘费， 06其他费用，07预付赔款，08损余收回， 09代垫付，10代垫付追偿，11预付冲销，12垫付，14公估费计提，19公估费结算
     */
    private String claimtype;

    /**
     * 银行账户名
     */
    private String accountname;

    /**
     * 付款时间
     */
    private Date paydate;

    /**
     * 待付款流水号
     */
    private Long payableno;

    /**
     * 报送时间
     */
    private Date packdate;

    /**
    * 获取-主键
    * @return seqchargedeal
     */
    public Long getSeqchargedeal() {
        return seqchargedeal;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param seqchargedeal - 主键
     */
    public void setSeqchargedeal(Long seqchargedeal) {
        this.seqchargedeal = seqchargedeal;
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
    * 获取-申请号
    * @return applyno
     */
    public String getApplyno() {
        return applyno;
    }

    /**
    * 设置-申请号
    * @paramType java.lang.String
    * @param applyno - 申请号
     */
    public void setApplyno(String applyno) {
        this.applyno = applyno;
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
    * 获取-保单、储金和赔款实收实付的类型：保单实收A01，保单实付A02；车船税实收AA1，车船税实付AA2； 储金实收B01，储金实付（退储、储返）B02，储金红利B03；赔款实付C01；手续费实收D01；手续费实付D02
    * @return businessone
     */
    public String getBusinessone() {
        return businessone;
    }

    /**
    * 设置-保单、储金和赔款实收实付的类型：保单实收A01，保单实付A02；车船税实收AA1，车船税实付AA2； 储金实收B01，储金实付（退储、储返）B02，储金红利B03；赔款实付C01；手续费实收D01；手续费实付D02
    * @paramType java.lang.String
    * @param businessone - 保单、储金和赔款实收实付的类型：保单实收A01，保单实付A02；车船税实收AA1，车船税实付AA2； 储金实收B01，储金实付（退储、储返）B02，储金红利B03；赔款实付C01；手续费实收D01；手续费实付D02
     */
    public void setBusinessone(String businessone) {
        this.businessone = businessone;
    }

    /**
    * 获取-区分数据范围，001 预收，002 历史迁移，003预收销应收（付）
    * @return businesstwo
     */
    public String getBusinesstwo() {
        return businesstwo;
    }

    /**
    * 设置-区分数据范围，001 预收，002 历史迁移，003预收销应收（付）
    * @paramType java.lang.String
    * @param businesstwo - 区分数据范围，001 预收，002 历史迁移，003预收销应收（付）
     */
    public void setBusinesstwo(String businesstwo) {
        this.businesstwo = businesstwo;
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
    * 获取-操作人
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作人
    * @paramType java.lang.String
    * @param opcode - 操作人
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-险种
    * @return classescode
     */
    public String getClassescode() {
        return classescode;
    }

    /**
    * 设置-险种
    * @paramType java.lang.String
    * @param classescode - 险种
     */
    public void setClassescode(String classescode) {
        this.classescode = classescode;
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
    * 获取-支付类型:911,921 现金;912,922 银行;... 其他
    * @return type
     */
    public String getType() {
        return type;
    }

    /**
    * 设置-支付类型:911,921 现金;912,922 银行;... 其他
    * @paramType java.lang.String
    * @param type - 支付类型:911,921 现金;912,922 银行;... 其他
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
    * 获取-业务来源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-业务来源
    * @paramType java.lang.String
    * @param datasource - 业务来源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
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
    * 获取-手工修改数据说明
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改数据说明
    * @paramType java.lang.String
    * @param modifydesc - 手工修改数据说明
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
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
    * 获取-记录交易流水表流水号
    * @return fatherno
     */
    public Long getFatherno() {
        return fatherno;
    }

    /**
    * 设置-记录交易流水表流水号
    * @paramType java.lang.Long
    * @param fatherno - 记录交易流水表流水号
     */
    public void setFatherno(Long fatherno) {
        this.fatherno = fatherno;
    }

    /**
    * 获取-客户账号
    * @return custaccountno
     */
    public String getCustaccountno() {
        return custaccountno;
    }

    /**
    * 设置-客户账号
    * @paramType java.lang.String
    * @param custaccountno - 客户账号
     */
    public void setCustaccountno(String custaccountno) {
        this.custaccountno = custaccountno;
    }

    /**
    * 获取-日结单明细表的SEQREPORTNO
    * @return seqreportno
     */
    public Long getSeqreportno() {
        return seqreportno;
    }

    /**
    * 设置-日结单明细表的SEQREPORTNO
    * @paramType java.lang.Long
    * @param seqreportno - 日结单明细表的SEQREPORTNO
     */
    public void setSeqreportno(Long seqreportno) {
        this.seqreportno = seqreportno;
    }

    /**
    * 获取-见费出单商户号mm_bankinpay_td.businessno;账号mm_account_td.accountno
    * @return accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
    * 设置-见费出单商户号mm_bankinpay_td.businessno;账号mm_account_td.accountno
    * @paramType java.lang.String
    * @param accountno - 见费出单商户号mm_bankinpay_td.businessno;账号mm_account_td.accountno
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
    * 获取-被保人名称
    * @return insuredname
     */
    public String getInsuredname() {
        return insuredname;
    }

    /**
    * 设置-被保人名称
    * @paramType java.lang.String
    * @param insuredname - 被保人名称
     */
    public void setInsuredname(String insuredname) {
        this.insuredname = insuredname;
    }

    /**
    * 获取-例外状态：0正常，1支付至责任保险第三者，2法院判决，3共保业务，4交强险垫/预付，5车辆过户，6其他。
    * @return exstatus
     */
    public String getExstatus() {
        return exstatus;
    }

    /**
    * 设置-例外状态：0正常，1支付至责任保险第三者，2法院判决，3共保业务，4交强险垫/预付，5车辆过户，6其他。
    * @paramType java.lang.String
    * @param exstatus - 例外状态：0正常，1支付至责任保险第三者，2法院判决，3共保业务，4交强险垫/预付，5车辆过户，6其他。
     */
    public void setExstatus(String exstatus) {
        this.exstatus = exstatus;
    }

    /**
    * 获取-针对“例外状态”的说明
    * @return exceptioncause
     */
    public String getExceptioncause() {
        return exceptioncause;
    }

    /**
    * 设置-针对“例外状态”的说明
    * @paramType java.lang.String
    * @param exceptioncause - 针对“例外状态”的说明
     */
    public void setExceptioncause(String exceptioncause) {
        this.exceptioncause = exceptioncause;
    }

    /**
    * 获取-银行
    * @return banks
     */
    public String getBanks() {
        return banks;
    }

    /**
    * 设置-银行
    * @paramType java.lang.String
    * @param banks - 银行
     */
    public void setBanks(String banks) {
        this.banks = banks;
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
    * 获取-业务唯一号
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-业务唯一号
    * @paramType java.lang.String
    * @param custseq - 业务唯一号
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
    }

    /**
    * 获取-赔案数据类型：01标的赔款，
02核赔费，03查勘费，04代查勘费，
06其他费用，07预付赔款，08损余收回，
09代垫付，10代垫付追偿，11预付冲销，12垫付，14公估费计提，19公估费结算
    * @return claimtype
     */
    public String getClaimtype() {
        return claimtype;
    }

    /**
    * 设置-赔案数据类型：01标的赔款，
02核赔费，03查勘费，04代查勘费，
06其他费用，07预付赔款，08损余收回，
09代垫付，10代垫付追偿，11预付冲销，12垫付，14公估费计提，19公估费结算
    * @paramType java.lang.String
    * @param claimtype - 赔案数据类型：01标的赔款，
02核赔费，03查勘费，04代查勘费，
06其他费用，07预付赔款，08损余收回，
09代垫付，10代垫付追偿，11预付冲销，12垫付，14公估费计提，19公估费结算
     */
    public void setClaimtype(String claimtype) {
        this.claimtype = claimtype;
    }

    /**
    * 获取-银行账户名
    * @return accountname
     */
    public String getAccountname() {
        return accountname;
    }

    /**
    * 设置-银行账户名
    * @paramType java.lang.String
    * @param accountname - 银行账户名
     */
    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    /**
    * 获取-付款时间
    * @return paydate
     */
    public Date getPaydate() {
        return paydate;
    }

    /**
    * 设置-付款时间
    * @paramType java.util.Date
    * @param paydate - 付款时间
     */
    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    /**
    * 获取-待付款流水号
    * @return payableno
     */
    public Long getPayableno() {
        return payableno;
    }

    /**
    * 设置-待付款流水号
    * @paramType java.lang.Long
    * @param payableno - 待付款流水号
     */
    public void setPayableno(Long payableno) {
        this.payableno = payableno;
    }

    /**
    * 获取-报送时间
    * @return packdate
     */
    public Date getPackdate() {
        return packdate;
    }

    /**
    * 设置-报送时间
    * @paramType java.util.Date
    * @param packdate - 报送时间
     */
    public void setPackdate(Date packdate) {
        this.packdate = packdate;
    }
}