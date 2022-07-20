package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_voucherdetail_td_err
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmVoucherdetailTdErr {
    /**
     * 日结单行号
     */
    private Long seqreport;

    /**
     * 日结单号
     */
    private String dailyauditno;

    /**
     * 日结单类型
     */
    private String reportkind;

    /**
     * 凭证类型
     */
    private String vouchertype;

    /**
     * 核算段值1
     */
    private String segment1;

    /**
     * 核算段值2
     */
    private String segment2;

    /**
     * 核算段值3
     */
    private String segment3;

    /**
     * 核算段值4
     */
    private String segment4;

    /**
     * 核算段值5
     */
    private String segment5;

    /**
     * 核算段值6
     */
    private String segment6;

    /**
     * 核算段值7
     */
    private String segment7;

    /**
     * 核算段值8
     */
    private String segment8;

    /**
     * 账期
     */
    private Date accountingdate;

    /**
     * 记账币种
     */
    private String currencycode;

    /**
     * 业务类型
     */
    private String businesstype;

    /**
     * 业务流水号
     */
    private Long businessno;

    /**
     * 记账币种借方金额
     */
    private BigDecimal enteredDr;

    /**
     * 记帐币种贷方金额
     */
    private BigDecimal enteredCr;

    /**
     * 折本位币借方金额(在明细表可以不计算）)
     */
    private BigDecimal accountedDr;

    /**
     * 折本位币贷方金额(在明细表可以不计算）)
     */
    private BigDecimal accountedCr;

    /**
     * 支票号
     */
    private String attribute3;

    /**
     * 客户代码
     */
    private String customercode;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 明细摘要
     */
    private String description;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 凭证处理状态(0待处理，1已处理，凭证批：修复使用)
     */
    private String status;

    /**
     * 关联到凭证汇总表唯一号
     */
    private Long jelineno;

    /**
     * 模板号(关联凭证模板)
     */
    private BigDecimal moduleno;

    /**
     * 核算段值9
     */
    private String segment9;

    /**
     * 核算段值10
     */
    private String segment10;

    /**
     * 核算段值11
     */
    private String segment11;

    /**
     * 核算段值12
     */
    private String segment12;

    /**
     * 操作员代码
     */
    private String opcode;

    /**
     * 现金流量段
     */
    private String segment13;

    /**
     * 子险拆分的业务明细记录id
     */
    private Long busidetailno;

    /**
     * 票据号
     */
    private String atsbillno;

    /**
     * 汇率
     */
    private BigDecimal conversionrate;

    /**
     * 消费渠道
     */
    private String paychannel;

    /**
     * 险类
     */
    private String segment14;

    /**
     * 险别
     */
    private String segment15;

    /**
     * 代理机构
     */
    private String segment16;

    /**
     * 分保单位
     */
    private String segment17;

    /**
     * 个险/团险
     */
    private String segment18;

    /**
     * 车辆类型
     */
    private String segment19;

    /**
     * 使用性质
     */
    private String segment20;

    /**
     * 规格特性
     */
    private String segment21;

    /**
     * 境内/境外
     */
    private String segment22;

    /**
     * 农业险性质
     */
    private String segment23;

    /**
     * 保费来源
     */
    private String segment24;

    /**
     * 涉农类别
     */
    private String segment25;

    /**
     * 明细分类
     */
    private String segment26;

    /**
     * 承诺项目
     */
    private String segment27;

    /**
     * 内部订单
     */
    private String segment28;

    /**
     * 管理渠道
     */
    private String segment29;

    /**
     * 对账码
     */
    private String bankabstract;

    /**
    * 获取-日结单行号
    * @return seqreport
     */
    public Long getSeqreport() {
        return seqreport;
    }

    /**
    * 设置-日结单行号
    * @paramType java.lang.Long
    * @param seqreport - 日结单行号
     */
    public void setSeqreport(Long seqreport) {
        this.seqreport = seqreport;
    }

    /**
    * 获取-日结单号
    * @return dailyauditno
     */
    public String getDailyauditno() {
        return dailyauditno;
    }

    /**
    * 设置-日结单号
    * @paramType java.lang.String
    * @param dailyauditno - 日结单号
     */
    public void setDailyauditno(String dailyauditno) {
        this.dailyauditno = dailyauditno;
    }

    /**
    * 获取-日结单类型
    * @return reportkind
     */
    public String getReportkind() {
        return reportkind;
    }

    /**
    * 设置-日结单类型
    * @paramType java.lang.String
    * @param reportkind - 日结单类型
     */
    public void setReportkind(String reportkind) {
        this.reportkind = reportkind;
    }

    /**
    * 获取-凭证类型
    * @return vouchertype
     */
    public String getVouchertype() {
        return vouchertype;
    }

    /**
    * 设置-凭证类型
    * @paramType java.lang.String
    * @param vouchertype - 凭证类型
     */
    public void setVouchertype(String vouchertype) {
        this.vouchertype = vouchertype;
    }

    /**
    * 获取-核算段值1
    * @return segment1
     */
    public String getSegment1() {
        return segment1;
    }

    /**
    * 设置-核算段值1
    * @paramType java.lang.String
    * @param segment1 - 核算段值1
     */
    public void setSegment1(String segment1) {
        this.segment1 = segment1;
    }

    /**
    * 获取-核算段值2
    * @return segment2
     */
    public String getSegment2() {
        return segment2;
    }

    /**
    * 设置-核算段值2
    * @paramType java.lang.String
    * @param segment2 - 核算段值2
     */
    public void setSegment2(String segment2) {
        this.segment2 = segment2;
    }

    /**
    * 获取-核算段值3
    * @return segment3
     */
    public String getSegment3() {
        return segment3;
    }

    /**
    * 设置-核算段值3
    * @paramType java.lang.String
    * @param segment3 - 核算段值3
     */
    public void setSegment3(String segment3) {
        this.segment3 = segment3;
    }

    /**
    * 获取-核算段值4
    * @return segment4
     */
    public String getSegment4() {
        return segment4;
    }

    /**
    * 设置-核算段值4
    * @paramType java.lang.String
    * @param segment4 - 核算段值4
     */
    public void setSegment4(String segment4) {
        this.segment4 = segment4;
    }

    /**
    * 获取-核算段值5
    * @return segment5
     */
    public String getSegment5() {
        return segment5;
    }

    /**
    * 设置-核算段值5
    * @paramType java.lang.String
    * @param segment5 - 核算段值5
     */
    public void setSegment5(String segment5) {
        this.segment5 = segment5;
    }

    /**
    * 获取-核算段值6
    * @return segment6
     */
    public String getSegment6() {
        return segment6;
    }

    /**
    * 设置-核算段值6
    * @paramType java.lang.String
    * @param segment6 - 核算段值6
     */
    public void setSegment6(String segment6) {
        this.segment6 = segment6;
    }

    /**
    * 获取-核算段值7
    * @return segment7
     */
    public String getSegment7() {
        return segment7;
    }

    /**
    * 设置-核算段值7
    * @paramType java.lang.String
    * @param segment7 - 核算段值7
     */
    public void setSegment7(String segment7) {
        this.segment7 = segment7;
    }

    /**
    * 获取-核算段值8
    * @return segment8
     */
    public String getSegment8() {
        return segment8;
    }

    /**
    * 设置-核算段值8
    * @paramType java.lang.String
    * @param segment8 - 核算段值8
     */
    public void setSegment8(String segment8) {
        this.segment8 = segment8;
    }

    /**
    * 获取-账期
    * @return accountingdate
     */
    public Date getAccountingdate() {
        return accountingdate;
    }

    /**
    * 设置-账期
    * @paramType java.util.Date
    * @param accountingdate - 账期
     */
    public void setAccountingdate(Date accountingdate) {
        this.accountingdate = accountingdate;
    }

    /**
    * 获取-记账币种
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-记账币种
    * @paramType java.lang.String
    * @param currencycode - 记账币种
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
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
    * 获取-业务流水号
    * @return businessno
     */
    public Long getBusinessno() {
        return businessno;
    }

    /**
    * 设置-业务流水号
    * @paramType java.lang.Long
    * @param businessno - 业务流水号
     */
    public void setBusinessno(Long businessno) {
        this.businessno = businessno;
    }

    /**
    * 获取-记账币种借方金额
    * @return enteredDr
     */
    public BigDecimal getEnteredDr() {
        return enteredDr;
    }

    /**
    * 设置-记账币种借方金额
    * @paramType java.math.BigDecimal
    * @param enteredDr - 记账币种借方金额
     */
    public void setEnteredDr(BigDecimal enteredDr) {
        this.enteredDr = enteredDr;
    }

    /**
    * 获取-记帐币种贷方金额
    * @return enteredCr
     */
    public BigDecimal getEnteredCr() {
        return enteredCr;
    }

    /**
    * 设置-记帐币种贷方金额
    * @paramType java.math.BigDecimal
    * @param enteredCr - 记帐币种贷方金额
     */
    public void setEnteredCr(BigDecimal enteredCr) {
        this.enteredCr = enteredCr;
    }

    /**
    * 获取-折本位币借方金额(在明细表可以不计算）)
    * @return accountedDr
     */
    public BigDecimal getAccountedDr() {
        return accountedDr;
    }

    /**
    * 设置-折本位币借方金额(在明细表可以不计算）)
    * @paramType java.math.BigDecimal
    * @param accountedDr - 折本位币借方金额(在明细表可以不计算）)
     */
    public void setAccountedDr(BigDecimal accountedDr) {
        this.accountedDr = accountedDr;
    }

    /**
    * 获取-折本位币贷方金额(在明细表可以不计算）)
    * @return accountedCr
     */
    public BigDecimal getAccountedCr() {
        return accountedCr;
    }

    /**
    * 设置-折本位币贷方金额(在明细表可以不计算）)
    * @paramType java.math.BigDecimal
    * @param accountedCr - 折本位币贷方金额(在明细表可以不计算）)
     */
    public void setAccountedCr(BigDecimal accountedCr) {
        this.accountedCr = accountedCr;
    }

    /**
    * 获取-支票号
    * @return attribute3
     */
    public String getAttribute3() {
        return attribute3;
    }

    /**
    * 设置-支票号
    * @paramType java.lang.String
    * @param attribute3 - 支票号
     */
    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
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
    * 获取-明细摘要
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-明细摘要
    * @paramType java.lang.String
    * @param description - 明细摘要
     */
    public void setDescription(String description) {
        this.description = description;
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
    * 获取-凭证处理状态(0待处理，1已处理，凭证批：修复使用)
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-凭证处理状态(0待处理，1已处理，凭证批：修复使用)
    * @paramType java.lang.String
    * @param status - 凭证处理状态(0待处理，1已处理，凭证批：修复使用)
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-关联到凭证汇总表唯一号
    * @return jelineno
     */
    public Long getJelineno() {
        return jelineno;
    }

    /**
    * 设置-关联到凭证汇总表唯一号
    * @paramType java.lang.Long
    * @param jelineno - 关联到凭证汇总表唯一号
     */
    public void setJelineno(Long jelineno) {
        this.jelineno = jelineno;
    }

    /**
    * 获取-模板号(关联凭证模板)
    * @return moduleno
     */
    public BigDecimal getModuleno() {
        return moduleno;
    }

    /**
    * 设置-模板号(关联凭证模板)
    * @paramType java.math.BigDecimal
    * @param moduleno - 模板号(关联凭证模板)
     */
    public void setModuleno(BigDecimal moduleno) {
        this.moduleno = moduleno;
    }

    /**
    * 获取-核算段值9
    * @return segment9
     */
    public String getSegment9() {
        return segment9;
    }

    /**
    * 设置-核算段值9
    * @paramType java.lang.String
    * @param segment9 - 核算段值9
     */
    public void setSegment9(String segment9) {
        this.segment9 = segment9;
    }

    /**
    * 获取-核算段值10
    * @return segment10
     */
    public String getSegment10() {
        return segment10;
    }

    /**
    * 设置-核算段值10
    * @paramType java.lang.String
    * @param segment10 - 核算段值10
     */
    public void setSegment10(String segment10) {
        this.segment10 = segment10;
    }

    /**
    * 获取-核算段值11
    * @return segment11
     */
    public String getSegment11() {
        return segment11;
    }

    /**
    * 设置-核算段值11
    * @paramType java.lang.String
    * @param segment11 - 核算段值11
     */
    public void setSegment11(String segment11) {
        this.segment11 = segment11;
    }

    /**
    * 获取-核算段值12
    * @return segment12
     */
    public String getSegment12() {
        return segment12;
    }

    /**
    * 设置-核算段值12
    * @paramType java.lang.String
    * @param segment12 - 核算段值12
     */
    public void setSegment12(String segment12) {
        this.segment12 = segment12;
    }

    /**
    * 获取-操作员代码
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作员代码
    * @paramType java.lang.String
    * @param opcode - 操作员代码
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-现金流量段
    * @return segment13
     */
    public String getSegment13() {
        return segment13;
    }

    /**
    * 设置-现金流量段
    * @paramType java.lang.String
    * @param segment13 - 现金流量段
     */
    public void setSegment13(String segment13) {
        this.segment13 = segment13;
    }

    /**
    * 获取-子险拆分的业务明细记录id
    * @return busidetailno
     */
    public Long getBusidetailno() {
        return busidetailno;
    }

    /**
    * 设置-子险拆分的业务明细记录id
    * @paramType java.lang.Long
    * @param busidetailno - 子险拆分的业务明细记录id
     */
    public void setBusidetailno(Long busidetailno) {
        this.busidetailno = busidetailno;
    }

    /**
    * 获取-票据号
    * @return atsbillno
     */
    public String getAtsbillno() {
        return atsbillno;
    }

    /**
    * 设置-票据号
    * @paramType java.lang.String
    * @param atsbillno - 票据号
     */
    public void setAtsbillno(String atsbillno) {
        this.atsbillno = atsbillno;
    }

    /**
    * 获取-汇率
    * @return conversionrate
     */
    public BigDecimal getConversionrate() {
        return conversionrate;
    }

    /**
    * 设置-汇率
    * @paramType java.math.BigDecimal
    * @param conversionrate - 汇率
     */
    public void setConversionrate(BigDecimal conversionrate) {
        this.conversionrate = conversionrate;
    }

    /**
    * 获取-消费渠道
    * @return paychannel
     */
    public String getPaychannel() {
        return paychannel;
    }

    /**
    * 设置-消费渠道
    * @paramType java.lang.String
    * @param paychannel - 消费渠道
     */
    public void setPaychannel(String paychannel) {
        this.paychannel = paychannel;
    }

    /**
    * 获取-险类
    * @return segment14
     */
    public String getSegment14() {
        return segment14;
    }

    /**
    * 设置-险类
    * @paramType java.lang.String
    * @param segment14 - 险类
     */
    public void setSegment14(String segment14) {
        this.segment14 = segment14;
    }

    /**
    * 获取-险别
    * @return segment15
     */
    public String getSegment15() {
        return segment15;
    }

    /**
    * 设置-险别
    * @paramType java.lang.String
    * @param segment15 - 险别
     */
    public void setSegment15(String segment15) {
        this.segment15 = segment15;
    }

    /**
    * 获取-代理机构
    * @return segment16
     */
    public String getSegment16() {
        return segment16;
    }

    /**
    * 设置-代理机构
    * @paramType java.lang.String
    * @param segment16 - 代理机构
     */
    public void setSegment16(String segment16) {
        this.segment16 = segment16;
    }

    /**
    * 获取-分保单位
    * @return segment17
     */
    public String getSegment17() {
        return segment17;
    }

    /**
    * 设置-分保单位
    * @paramType java.lang.String
    * @param segment17 - 分保单位
     */
    public void setSegment17(String segment17) {
        this.segment17 = segment17;
    }

    /**
    * 获取-个险/团险
    * @return segment18
     */
    public String getSegment18() {
        return segment18;
    }

    /**
    * 设置-个险/团险
    * @paramType java.lang.String
    * @param segment18 - 个险/团险
     */
    public void setSegment18(String segment18) {
        this.segment18 = segment18;
    }

    /**
    * 获取-车辆类型
    * @return segment19
     */
    public String getSegment19() {
        return segment19;
    }

    /**
    * 设置-车辆类型
    * @paramType java.lang.String
    * @param segment19 - 车辆类型
     */
    public void setSegment19(String segment19) {
        this.segment19 = segment19;
    }

    /**
    * 获取-使用性质
    * @return segment20
     */
    public String getSegment20() {
        return segment20;
    }

    /**
    * 设置-使用性质
    * @paramType java.lang.String
    * @param segment20 - 使用性质
     */
    public void setSegment20(String segment20) {
        this.segment20 = segment20;
    }

    /**
    * 获取-规格特性
    * @return segment21
     */
    public String getSegment21() {
        return segment21;
    }

    /**
    * 设置-规格特性
    * @paramType java.lang.String
    * @param segment21 - 规格特性
     */
    public void setSegment21(String segment21) {
        this.segment21 = segment21;
    }

    /**
    * 获取-境内/境外
    * @return segment22
     */
    public String getSegment22() {
        return segment22;
    }

    /**
    * 设置-境内/境外
    * @paramType java.lang.String
    * @param segment22 - 境内/境外
     */
    public void setSegment22(String segment22) {
        this.segment22 = segment22;
    }

    /**
    * 获取-农业险性质
    * @return segment23
     */
    public String getSegment23() {
        return segment23;
    }

    /**
    * 设置-农业险性质
    * @paramType java.lang.String
    * @param segment23 - 农业险性质
     */
    public void setSegment23(String segment23) {
        this.segment23 = segment23;
    }

    /**
    * 获取-保费来源
    * @return segment24
     */
    public String getSegment24() {
        return segment24;
    }

    /**
    * 设置-保费来源
    * @paramType java.lang.String
    * @param segment24 - 保费来源
     */
    public void setSegment24(String segment24) {
        this.segment24 = segment24;
    }

    /**
    * 获取-涉农类别
    * @return segment25
     */
    public String getSegment25() {
        return segment25;
    }

    /**
    * 设置-涉农类别
    * @paramType java.lang.String
    * @param segment25 - 涉农类别
     */
    public void setSegment25(String segment25) {
        this.segment25 = segment25;
    }

    /**
    * 获取-明细分类
    * @return segment26
     */
    public String getSegment26() {
        return segment26;
    }

    /**
    * 设置-明细分类
    * @paramType java.lang.String
    * @param segment26 - 明细分类
     */
    public void setSegment26(String segment26) {
        this.segment26 = segment26;
    }

    /**
    * 获取-承诺项目
    * @return segment27
     */
    public String getSegment27() {
        return segment27;
    }

    /**
    * 设置-承诺项目
    * @paramType java.lang.String
    * @param segment27 - 承诺项目
     */
    public void setSegment27(String segment27) {
        this.segment27 = segment27;
    }

    /**
    * 获取-内部订单
    * @return segment28
     */
    public String getSegment28() {
        return segment28;
    }

    /**
    * 设置-内部订单
    * @paramType java.lang.String
    * @param segment28 - 内部订单
     */
    public void setSegment28(String segment28) {
        this.segment28 = segment28;
    }

    /**
    * 获取-管理渠道
    * @return segment29
     */
    public String getSegment29() {
        return segment29;
    }

    /**
    * 设置-管理渠道
    * @paramType java.lang.String
    * @param segment29 - 管理渠道
     */
    public void setSegment29(String segment29) {
        this.segment29 = segment29;
    }

    /**
    * 获取-对账码
    * @return bankabstract
     */
    public String getBankabstract() {
        return bankabstract;
    }

    /**
    * 设置-对账码
    * @paramType java.lang.String
    * @param bankabstract - 对账码
     */
    public void setBankabstract(String bankabstract) {
        this.bankabstract = bankabstract;
    }
}