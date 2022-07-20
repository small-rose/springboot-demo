package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_voucher_to_err
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmVoucherToErr {
    /**
     * 明细唯一号
     */
    private Long businessno;

    /**
     * 账套名
     */
    private String setofbooks;

    /**
     * 账期
     */
    private Date accountingdate;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 凭证类型
     */
    private String jecategoryname;

    /**
     * 凭证来源
     */
    private String userjesourcename;

    /**
     * 汇率
     */
    private String currencyconversionrate;

    /**
     * 公司段
     */
    private String segment1;

    /**
     * 成本中心段
     */
    private String segment2;

    /**
     * 会计科目段
     */
    private String segment3;

    /**
     * 明细科目段
     */
    private String segment4;

    /**
     * 产品段
     */
    private String segment5;

    /**
     * 渠道段
     */
    private String segment6;

    /**
     * 预算段
     */
    private String segment7;

    /**
     * 备用段2
     */
    private String segment8;

    /**
     * 输入币种借方
     */
    private BigDecimal entereddr;

    /**
     * 输入币种贷方
     */
    private BigDecimal enteredcr;

    /**
     * 本位币借方
     */
    private BigDecimal accounteddr;

    /**
     * 本位币贷方
     */
    private BigDecimal accountedcr;

    /**
     * 凭证批名
     */
    private String reference1;

    /**
     * 凭证名称
     */
    private String reference4;

    /**
     * 凭证摘要
     */
    private String reference5;

    /**
     * 凭证行摘要
     */
    private String reference10;

    /**
     * 日记帐行号
     */
    private Long jelinenum;

    /**
     * 支票号
     */
    private String attribute3;

    /**
     * 关联凭证明细表jelineno
     */
    private Long attribute4;

    /**
     * 备用
     */
    private String attribute5;

    /**
     * 备用
     */
    private String attribute6;

    /**
     * 备用
     */
    private String attribute7;

    /**
     * 备用
     */
    private String attribute8;

    /**
     * 备用
     */
    private String attribute9;

    /**
     * 备用
     */
    private String attribute10;

    /**
     * 备用
     */
    private String attribute11;

    /**
     * 状态
     */
    private String status;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 手工修改数据描述
     */
    private String modifydesc;

    /**
     * 服务机构
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
     * 票据号
     */
    private String atsbillno;

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
    * 获取-明细唯一号
    * @return businessno
     */
    public Long getBusinessno() {
        return businessno;
    }

    /**
    * 设置-明细唯一号
    * @paramType java.lang.Long
    * @param businessno - 明细唯一号
     */
    public void setBusinessno(Long businessno) {
        this.businessno = businessno;
    }

    /**
    * 获取-账套名
    * @return setofbooks
     */
    public String getSetofbooks() {
        return setofbooks;
    }

    /**
    * 设置-账套名
    * @paramType java.lang.String
    * @param setofbooks - 账套名
     */
    public void setSetofbooks(String setofbooks) {
        this.setofbooks = setofbooks;
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
    * 获取-凭证类型
    * @return jecategoryname
     */
    public String getJecategoryname() {
        return jecategoryname;
    }

    /**
    * 设置-凭证类型
    * @paramType java.lang.String
    * @param jecategoryname - 凭证类型
     */
    public void setJecategoryname(String jecategoryname) {
        this.jecategoryname = jecategoryname;
    }

    /**
    * 获取-凭证来源
    * @return userjesourcename
     */
    public String getUserjesourcename() {
        return userjesourcename;
    }

    /**
    * 设置-凭证来源
    * @paramType java.lang.String
    * @param userjesourcename - 凭证来源
     */
    public void setUserjesourcename(String userjesourcename) {
        this.userjesourcename = userjesourcename;
    }

    /**
    * 获取-汇率
    * @return currencyconversionrate
     */
    public String getCurrencyconversionrate() {
        return currencyconversionrate;
    }

    /**
    * 设置-汇率
    * @paramType java.lang.String
    * @param currencyconversionrate - 汇率
     */
    public void setCurrencyconversionrate(String currencyconversionrate) {
        this.currencyconversionrate = currencyconversionrate;
    }

    /**
    * 获取-公司段
    * @return segment1
     */
    public String getSegment1() {
        return segment1;
    }

    /**
    * 设置-公司段
    * @paramType java.lang.String
    * @param segment1 - 公司段
     */
    public void setSegment1(String segment1) {
        this.segment1 = segment1;
    }

    /**
    * 获取-成本中心段
    * @return segment2
     */
    public String getSegment2() {
        return segment2;
    }

    /**
    * 设置-成本中心段
    * @paramType java.lang.String
    * @param segment2 - 成本中心段
     */
    public void setSegment2(String segment2) {
        this.segment2 = segment2;
    }

    /**
    * 获取-会计科目段
    * @return segment3
     */
    public String getSegment3() {
        return segment3;
    }

    /**
    * 设置-会计科目段
    * @paramType java.lang.String
    * @param segment3 - 会计科目段
     */
    public void setSegment3(String segment3) {
        this.segment3 = segment3;
    }

    /**
    * 获取-明细科目段
    * @return segment4
     */
    public String getSegment4() {
        return segment4;
    }

    /**
    * 设置-明细科目段
    * @paramType java.lang.String
    * @param segment4 - 明细科目段
     */
    public void setSegment4(String segment4) {
        this.segment4 = segment4;
    }

    /**
    * 获取-产品段
    * @return segment5
     */
    public String getSegment5() {
        return segment5;
    }

    /**
    * 设置-产品段
    * @paramType java.lang.String
    * @param segment5 - 产品段
     */
    public void setSegment5(String segment5) {
        this.segment5 = segment5;
    }

    /**
    * 获取-渠道段
    * @return segment6
     */
    public String getSegment6() {
        return segment6;
    }

    /**
    * 设置-渠道段
    * @paramType java.lang.String
    * @param segment6 - 渠道段
     */
    public void setSegment6(String segment6) {
        this.segment6 = segment6;
    }

    /**
    * 获取-预算段
    * @return segment7
     */
    public String getSegment7() {
        return segment7;
    }

    /**
    * 设置-预算段
    * @paramType java.lang.String
    * @param segment7 - 预算段
     */
    public void setSegment7(String segment7) {
        this.segment7 = segment7;
    }

    /**
    * 获取-备用段2
    * @return segment8
     */
    public String getSegment8() {
        return segment8;
    }

    /**
    * 设置-备用段2
    * @paramType java.lang.String
    * @param segment8 - 备用段2
     */
    public void setSegment8(String segment8) {
        this.segment8 = segment8;
    }

    /**
    * 获取-输入币种借方
    * @return entereddr
     */
    public BigDecimal getEntereddr() {
        return entereddr;
    }

    /**
    * 设置-输入币种借方
    * @paramType java.math.BigDecimal
    * @param entereddr - 输入币种借方
     */
    public void setEntereddr(BigDecimal entereddr) {
        this.entereddr = entereddr;
    }

    /**
    * 获取-输入币种贷方
    * @return enteredcr
     */
    public BigDecimal getEnteredcr() {
        return enteredcr;
    }

    /**
    * 设置-输入币种贷方
    * @paramType java.math.BigDecimal
    * @param enteredcr - 输入币种贷方
     */
    public void setEnteredcr(BigDecimal enteredcr) {
        this.enteredcr = enteredcr;
    }

    /**
    * 获取-本位币借方
    * @return accounteddr
     */
    public BigDecimal getAccounteddr() {
        return accounteddr;
    }

    /**
    * 设置-本位币借方
    * @paramType java.math.BigDecimal
    * @param accounteddr - 本位币借方
     */
    public void setAccounteddr(BigDecimal accounteddr) {
        this.accounteddr = accounteddr;
    }

    /**
    * 获取-本位币贷方
    * @return accountedcr
     */
    public BigDecimal getAccountedcr() {
        return accountedcr;
    }

    /**
    * 设置-本位币贷方
    * @paramType java.math.BigDecimal
    * @param accountedcr - 本位币贷方
     */
    public void setAccountedcr(BigDecimal accountedcr) {
        this.accountedcr = accountedcr;
    }

    /**
    * 获取-凭证批名
    * @return reference1
     */
    public String getReference1() {
        return reference1;
    }

    /**
    * 设置-凭证批名
    * @paramType java.lang.String
    * @param reference1 - 凭证批名
     */
    public void setReference1(String reference1) {
        this.reference1 = reference1;
    }

    /**
    * 获取-凭证名称
    * @return reference4
     */
    public String getReference4() {
        return reference4;
    }

    /**
    * 设置-凭证名称
    * @paramType java.lang.String
    * @param reference4 - 凭证名称
     */
    public void setReference4(String reference4) {
        this.reference4 = reference4;
    }

    /**
    * 获取-凭证摘要
    * @return reference5
     */
    public String getReference5() {
        return reference5;
    }

    /**
    * 设置-凭证摘要
    * @paramType java.lang.String
    * @param reference5 - 凭证摘要
     */
    public void setReference5(String reference5) {
        this.reference5 = reference5;
    }

    /**
    * 获取-凭证行摘要
    * @return reference10
     */
    public String getReference10() {
        return reference10;
    }

    /**
    * 设置-凭证行摘要
    * @paramType java.lang.String
    * @param reference10 - 凭证行摘要
     */
    public void setReference10(String reference10) {
        this.reference10 = reference10;
    }

    /**
    * 获取-日记帐行号
    * @return jelinenum
     */
    public Long getJelinenum() {
        return jelinenum;
    }

    /**
    * 设置-日记帐行号
    * @paramType java.lang.Long
    * @param jelinenum - 日记帐行号
     */
    public void setJelinenum(Long jelinenum) {
        this.jelinenum = jelinenum;
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
    * 获取-关联凭证明细表jelineno
    * @return attribute4
     */
    public Long getAttribute4() {
        return attribute4;
    }

    /**
    * 设置-关联凭证明细表jelineno
    * @paramType java.lang.Long
    * @param attribute4 - 关联凭证明细表jelineno
     */
    public void setAttribute4(Long attribute4) {
        this.attribute4 = attribute4;
    }

    /**
    * 获取-备用
    * @return attribute5
     */
    public String getAttribute5() {
        return attribute5;
    }

    /**
    * 设置-备用
    * @paramType java.lang.String
    * @param attribute5 - 备用
     */
    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    /**
    * 获取-备用
    * @return attribute6
     */
    public String getAttribute6() {
        return attribute6;
    }

    /**
    * 设置-备用
    * @paramType java.lang.String
    * @param attribute6 - 备用
     */
    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    /**
    * 获取-备用
    * @return attribute7
     */
    public String getAttribute7() {
        return attribute7;
    }

    /**
    * 设置-备用
    * @paramType java.lang.String
    * @param attribute7 - 备用
     */
    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    /**
    * 获取-备用
    * @return attribute8
     */
    public String getAttribute8() {
        return attribute8;
    }

    /**
    * 设置-备用
    * @paramType java.lang.String
    * @param attribute8 - 备用
     */
    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    /**
    * 获取-备用
    * @return attribute9
     */
    public String getAttribute9() {
        return attribute9;
    }

    /**
    * 设置-备用
    * @paramType java.lang.String
    * @param attribute9 - 备用
     */
    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    /**
    * 获取-备用
    * @return attribute10
     */
    public String getAttribute10() {
        return attribute10;
    }

    /**
    * 设置-备用
    * @paramType java.lang.String
    * @param attribute10 - 备用
     */
    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }

    /**
    * 获取-备用
    * @return attribute11
     */
    public String getAttribute11() {
        return attribute11;
    }

    /**
    * 设置-备用
    * @paramType java.lang.String
    * @param attribute11 - 备用
     */
    public void setAttribute11(String attribute11) {
        this.attribute11 = attribute11;
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
    * 获取-手工修改数据描述
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改数据描述
    * @paramType java.lang.String
    * @param modifydesc - 手工修改数据描述
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-服务机构
    * @return segment9
     */
    public String getSegment9() {
        return segment9;
    }

    /**
    * 设置-服务机构
    * @paramType java.lang.String
    * @param segment9 - 服务机构
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
}