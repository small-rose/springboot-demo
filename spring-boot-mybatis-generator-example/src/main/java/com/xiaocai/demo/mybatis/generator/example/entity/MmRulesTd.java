package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_rules_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmRulesTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 批号
     */
    private String batchId;

    /**
     * 交叉验证规则名称
     */
    private String flexValidationRuleName;

    /**
     * 交叉验证规则说明
     */
    private String flexValidationRuleDesc;

    /**
     * 错误信息
     */
    private String errorMessageText;

    /**
     * 是否有效
     */
    private String enabledFlag;

    /**
     * 包括还是排除 (I:包括,E:排除) 
     */
    private String includeExcludeIndicator;

    /**
     * 公司段从
     */
    private String segment1Low;

    /**
     * 成本中心段从
     */
    private String segment2Low;

    /**
     * 公司段至
     */
    private String segment1High;

    /**
     * 成本中心段至
     */
    private String segment2High;

    /**
     * 科目段从
     */
    private String segment3Low;

    /**
     * 科目段至
     */
    private String segment3High;

    /**
     * 明细科目段从
     */
    private String segment4Low;

    /**
     * 明细科目段至
     */
    private String segment4High;

    /**
     * 产品段从
     */
    private String segment5Low;

    /**
     * 产品段至
     */
    private String segment5High;

    /**
     * 渠道从
     */
    private String segment6Low;

    /**
     * 渠道至
     */
    private String segment6High;

    /**
     * 备用1从
     */
    private String segment7Low;

    /**
     * 备用1至
     */
    private String segment7High;

    /**
     * 备用2从
     */
    private String segment8Low;

    /**
     * 备用2至
     */
    private String segment8High;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * HIBERNATE版本
     */
    private Integer hibernateversion;

    /**
     * 核算段值9低位
     */
    private String segment9Low;

    /**
     * 核算段值9高位
     */
    private String segment9High;

    /**
     * 核算段值10低位
     */
    private String segment10Low;

    /**
     * 核算段值10高位
     */
    private String segment10High;

    /**
     * 核算段值11低位
     */
    private String segment11Low;

    /**
     * 核算段值11高位
     */
    private String segment11High;

    /**
     * 客户
     */
    private String segment12Low;

    /**
     * 客户
     */
    private String segment12High;

    /**
     * 现金流量
     */
    private String segment13Low;

    /**
     * 现金流量
     */
    private String segment13High;

    /**
     * 险类
     */
    private String segment14Low;

    /**
     * 险类
     */
    private String segment14High;

    /**
     * 险别
     */
    private String segment15Low;

    /**
     * 险别
     */
    private String segment15High;

    /**
     * 代理机构
     */
    private String segment16Low;

    /**
     * 代理机构
     */
    private String segment16High;

    /**
     * 核算段值12低位
     */
    private String segment17Low;

    /**
     * 核算段值12高位
     */
    private String segment17High;

    /**
     * 个险(团险)
     */
    private String segment18Low;

    /**
     * 个险(团险)
     */
    private String segment18High;

    /**
     * 车辆类型
     */
    private String segment19Low;

    /**
     * 车辆类型
     */
    private String segment19High;

    /**
     * 使用性质
     */
    private String segment20Low;

    /**
     * 使用性质
     */
    private String segment20High;

    /**
     * 规格特性
     */
    private String segment21Low;

    /**
     * 规格特性
     */
    private String segment21High;

    /**
     * 境内/境外
     */
    private String segment22Low;

    /**
     * 境内/境外
     */
    private String segment22High;

    /**
     * 农业险性质
     */
    private String segment23Low;

    /**
     * 农业险性质
     */
    private String segment23High;

    /**
     * 保费来源
     */
    private String segment24Low;

    /**
     * 保费来源
     */
    private String segment24High;

    /**
     * 涉农类别
     */
    private String segment25Low;

    /**
     * 涉农类别
     */
    private String segment25High;

    /**
     * 明细分类
     */
    private String segment26Low;

    /**
     * 明细分类
     */
    private String segment26High;

    /**
     * 承诺项目
     */
    private String segment27Low;

    /**
     * 承诺项目
     */
    private String segment27High;

    /**
     * 内部订单
     */
    private String segment28Low;

    /**
     * 内部订单
     */
    private String segment28High;

    /**
     * 管理渠道
     */
    private String segment29Low;

    /**
     * 管理渠道
     */
    private String segment29High;

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
    * 获取-批号
    * @return batchId
     */
    public String getBatchId() {
        return batchId;
    }

    /**
    * 设置-批号
    * @paramType java.lang.String
    * @param batchId - 批号
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    /**
    * 获取-交叉验证规则名称
    * @return flexValidationRuleName
     */
    public String getFlexValidationRuleName() {
        return flexValidationRuleName;
    }

    /**
    * 设置-交叉验证规则名称
    * @paramType java.lang.String
    * @param flexValidationRuleName - 交叉验证规则名称
     */
    public void setFlexValidationRuleName(String flexValidationRuleName) {
        this.flexValidationRuleName = flexValidationRuleName;
    }

    /**
    * 获取-交叉验证规则说明
    * @return flexValidationRuleDesc
     */
    public String getFlexValidationRuleDesc() {
        return flexValidationRuleDesc;
    }

    /**
    * 设置-交叉验证规则说明
    * @paramType java.lang.String
    * @param flexValidationRuleDesc - 交叉验证规则说明
     */
    public void setFlexValidationRuleDesc(String flexValidationRuleDesc) {
        this.flexValidationRuleDesc = flexValidationRuleDesc;
    }

    /**
    * 获取-错误信息
    * @return errorMessageText
     */
    public String getErrorMessageText() {
        return errorMessageText;
    }

    /**
    * 设置-错误信息
    * @paramType java.lang.String
    * @param errorMessageText - 错误信息
     */
    public void setErrorMessageText(String errorMessageText) {
        this.errorMessageText = errorMessageText;
    }

    /**
    * 获取-是否有效
    * @return enabledFlag
     */
    public String getEnabledFlag() {
        return enabledFlag;
    }

    /**
    * 设置-是否有效
    * @paramType java.lang.String
    * @param enabledFlag - 是否有效
     */
    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    /**
    * 获取-包括还是排除 (I:包括,E:排除) 
    * @return includeExcludeIndicator
     */
    public String getIncludeExcludeIndicator() {
        return includeExcludeIndicator;
    }

    /**
    * 设置-包括还是排除 (I:包括,E:排除) 
    * @paramType java.lang.String
    * @param includeExcludeIndicator - 包括还是排除 (I:包括,E:排除) 
     */
    public void setIncludeExcludeIndicator(String includeExcludeIndicator) {
        this.includeExcludeIndicator = includeExcludeIndicator;
    }

    /**
    * 获取-公司段从
    * @return segment1Low
     */
    public String getSegment1Low() {
        return segment1Low;
    }

    /**
    * 设置-公司段从
    * @paramType java.lang.String
    * @param segment1Low - 公司段从
     */
    public void setSegment1Low(String segment1Low) {
        this.segment1Low = segment1Low;
    }

    /**
    * 获取-成本中心段从
    * @return segment2Low
     */
    public String getSegment2Low() {
        return segment2Low;
    }

    /**
    * 设置-成本中心段从
    * @paramType java.lang.String
    * @param segment2Low - 成本中心段从
     */
    public void setSegment2Low(String segment2Low) {
        this.segment2Low = segment2Low;
    }

    /**
    * 获取-公司段至
    * @return segment1High
     */
    public String getSegment1High() {
        return segment1High;
    }

    /**
    * 设置-公司段至
    * @paramType java.lang.String
    * @param segment1High - 公司段至
     */
    public void setSegment1High(String segment1High) {
        this.segment1High = segment1High;
    }

    /**
    * 获取-成本中心段至
    * @return segment2High
     */
    public String getSegment2High() {
        return segment2High;
    }

    /**
    * 设置-成本中心段至
    * @paramType java.lang.String
    * @param segment2High - 成本中心段至
     */
    public void setSegment2High(String segment2High) {
        this.segment2High = segment2High;
    }

    /**
    * 获取-科目段从
    * @return segment3Low
     */
    public String getSegment3Low() {
        return segment3Low;
    }

    /**
    * 设置-科目段从
    * @paramType java.lang.String
    * @param segment3Low - 科目段从
     */
    public void setSegment3Low(String segment3Low) {
        this.segment3Low = segment3Low;
    }

    /**
    * 获取-科目段至
    * @return segment3High
     */
    public String getSegment3High() {
        return segment3High;
    }

    /**
    * 设置-科目段至
    * @paramType java.lang.String
    * @param segment3High - 科目段至
     */
    public void setSegment3High(String segment3High) {
        this.segment3High = segment3High;
    }

    /**
    * 获取-明细科目段从
    * @return segment4Low
     */
    public String getSegment4Low() {
        return segment4Low;
    }

    /**
    * 设置-明细科目段从
    * @paramType java.lang.String
    * @param segment4Low - 明细科目段从
     */
    public void setSegment4Low(String segment4Low) {
        this.segment4Low = segment4Low;
    }

    /**
    * 获取-明细科目段至
    * @return segment4High
     */
    public String getSegment4High() {
        return segment4High;
    }

    /**
    * 设置-明细科目段至
    * @paramType java.lang.String
    * @param segment4High - 明细科目段至
     */
    public void setSegment4High(String segment4High) {
        this.segment4High = segment4High;
    }

    /**
    * 获取-产品段从
    * @return segment5Low
     */
    public String getSegment5Low() {
        return segment5Low;
    }

    /**
    * 设置-产品段从
    * @paramType java.lang.String
    * @param segment5Low - 产品段从
     */
    public void setSegment5Low(String segment5Low) {
        this.segment5Low = segment5Low;
    }

    /**
    * 获取-产品段至
    * @return segment5High
     */
    public String getSegment5High() {
        return segment5High;
    }

    /**
    * 设置-产品段至
    * @paramType java.lang.String
    * @param segment5High - 产品段至
     */
    public void setSegment5High(String segment5High) {
        this.segment5High = segment5High;
    }

    /**
    * 获取-渠道从
    * @return segment6Low
     */
    public String getSegment6Low() {
        return segment6Low;
    }

    /**
    * 设置-渠道从
    * @paramType java.lang.String
    * @param segment6Low - 渠道从
     */
    public void setSegment6Low(String segment6Low) {
        this.segment6Low = segment6Low;
    }

    /**
    * 获取-渠道至
    * @return segment6High
     */
    public String getSegment6High() {
        return segment6High;
    }

    /**
    * 设置-渠道至
    * @paramType java.lang.String
    * @param segment6High - 渠道至
     */
    public void setSegment6High(String segment6High) {
        this.segment6High = segment6High;
    }

    /**
    * 获取-备用1从
    * @return segment7Low
     */
    public String getSegment7Low() {
        return segment7Low;
    }

    /**
    * 设置-备用1从
    * @paramType java.lang.String
    * @param segment7Low - 备用1从
     */
    public void setSegment7Low(String segment7Low) {
        this.segment7Low = segment7Low;
    }

    /**
    * 获取-备用1至
    * @return segment7High
     */
    public String getSegment7High() {
        return segment7High;
    }

    /**
    * 设置-备用1至
    * @paramType java.lang.String
    * @param segment7High - 备用1至
     */
    public void setSegment7High(String segment7High) {
        this.segment7High = segment7High;
    }

    /**
    * 获取-备用2从
    * @return segment8Low
     */
    public String getSegment8Low() {
        return segment8Low;
    }

    /**
    * 设置-备用2从
    * @paramType java.lang.String
    * @param segment8Low - 备用2从
     */
    public void setSegment8Low(String segment8Low) {
        this.segment8Low = segment8Low;
    }

    /**
    * 获取-备用2至
    * @return segment8High
     */
    public String getSegment8High() {
        return segment8High;
    }

    /**
    * 设置-备用2至
    * @paramType java.lang.String
    * @param segment8High - 备用2至
     */
    public void setSegment8High(String segment8High) {
        this.segment8High = segment8High;
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
    * 获取-HIBERNATE版本
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATE版本
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATE版本
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-核算段值9低位
    * @return segment9Low
     */
    public String getSegment9Low() {
        return segment9Low;
    }

    /**
    * 设置-核算段值9低位
    * @paramType java.lang.String
    * @param segment9Low - 核算段值9低位
     */
    public void setSegment9Low(String segment9Low) {
        this.segment9Low = segment9Low;
    }

    /**
    * 获取-核算段值9高位
    * @return segment9High
     */
    public String getSegment9High() {
        return segment9High;
    }

    /**
    * 设置-核算段值9高位
    * @paramType java.lang.String
    * @param segment9High - 核算段值9高位
     */
    public void setSegment9High(String segment9High) {
        this.segment9High = segment9High;
    }

    /**
    * 获取-核算段值10低位
    * @return segment10Low
     */
    public String getSegment10Low() {
        return segment10Low;
    }

    /**
    * 设置-核算段值10低位
    * @paramType java.lang.String
    * @param segment10Low - 核算段值10低位
     */
    public void setSegment10Low(String segment10Low) {
        this.segment10Low = segment10Low;
    }

    /**
    * 获取-核算段值10高位
    * @return segment10High
     */
    public String getSegment10High() {
        return segment10High;
    }

    /**
    * 设置-核算段值10高位
    * @paramType java.lang.String
    * @param segment10High - 核算段值10高位
     */
    public void setSegment10High(String segment10High) {
        this.segment10High = segment10High;
    }

    /**
    * 获取-核算段值11低位
    * @return segment11Low
     */
    public String getSegment11Low() {
        return segment11Low;
    }

    /**
    * 设置-核算段值11低位
    * @paramType java.lang.String
    * @param segment11Low - 核算段值11低位
     */
    public void setSegment11Low(String segment11Low) {
        this.segment11Low = segment11Low;
    }

    /**
    * 获取-核算段值11高位
    * @return segment11High
     */
    public String getSegment11High() {
        return segment11High;
    }

    /**
    * 设置-核算段值11高位
    * @paramType java.lang.String
    * @param segment11High - 核算段值11高位
     */
    public void setSegment11High(String segment11High) {
        this.segment11High = segment11High;
    }

    /**
    * 获取-客户
    * @return segment12Low
     */
    public String getSegment12Low() {
        return segment12Low;
    }

    /**
    * 设置-客户
    * @paramType java.lang.String
    * @param segment12Low - 客户
     */
    public void setSegment12Low(String segment12Low) {
        this.segment12Low = segment12Low;
    }

    /**
    * 获取-客户
    * @return segment12High
     */
    public String getSegment12High() {
        return segment12High;
    }

    /**
    * 设置-客户
    * @paramType java.lang.String
    * @param segment12High - 客户
     */
    public void setSegment12High(String segment12High) {
        this.segment12High = segment12High;
    }

    /**
    * 获取-现金流量
    * @return segment13Low
     */
    public String getSegment13Low() {
        return segment13Low;
    }

    /**
    * 设置-现金流量
    * @paramType java.lang.String
    * @param segment13Low - 现金流量
     */
    public void setSegment13Low(String segment13Low) {
        this.segment13Low = segment13Low;
    }

    /**
    * 获取-现金流量
    * @return segment13High
     */
    public String getSegment13High() {
        return segment13High;
    }

    /**
    * 设置-现金流量
    * @paramType java.lang.String
    * @param segment13High - 现金流量
     */
    public void setSegment13High(String segment13High) {
        this.segment13High = segment13High;
    }

    /**
    * 获取-险类
    * @return segment14Low
     */
    public String getSegment14Low() {
        return segment14Low;
    }

    /**
    * 设置-险类
    * @paramType java.lang.String
    * @param segment14Low - 险类
     */
    public void setSegment14Low(String segment14Low) {
        this.segment14Low = segment14Low;
    }

    /**
    * 获取-险类
    * @return segment14High
     */
    public String getSegment14High() {
        return segment14High;
    }

    /**
    * 设置-险类
    * @paramType java.lang.String
    * @param segment14High - 险类
     */
    public void setSegment14High(String segment14High) {
        this.segment14High = segment14High;
    }

    /**
    * 获取-险别
    * @return segment15Low
     */
    public String getSegment15Low() {
        return segment15Low;
    }

    /**
    * 设置-险别
    * @paramType java.lang.String
    * @param segment15Low - 险别
     */
    public void setSegment15Low(String segment15Low) {
        this.segment15Low = segment15Low;
    }

    /**
    * 获取-险别
    * @return segment15High
     */
    public String getSegment15High() {
        return segment15High;
    }

    /**
    * 设置-险别
    * @paramType java.lang.String
    * @param segment15High - 险别
     */
    public void setSegment15High(String segment15High) {
        this.segment15High = segment15High;
    }

    /**
    * 获取-代理机构
    * @return segment16Low
     */
    public String getSegment16Low() {
        return segment16Low;
    }

    /**
    * 设置-代理机构
    * @paramType java.lang.String
    * @param segment16Low - 代理机构
     */
    public void setSegment16Low(String segment16Low) {
        this.segment16Low = segment16Low;
    }

    /**
    * 获取-代理机构
    * @return segment16High
     */
    public String getSegment16High() {
        return segment16High;
    }

    /**
    * 设置-代理机构
    * @paramType java.lang.String
    * @param segment16High - 代理机构
     */
    public void setSegment16High(String segment16High) {
        this.segment16High = segment16High;
    }

    /**
    * 获取-核算段值12低位
    * @return segment17Low
     */
    public String getSegment17Low() {
        return segment17Low;
    }

    /**
    * 设置-核算段值12低位
    * @paramType java.lang.String
    * @param segment17Low - 核算段值12低位
     */
    public void setSegment17Low(String segment17Low) {
        this.segment17Low = segment17Low;
    }

    /**
    * 获取-核算段值12高位
    * @return segment17High
     */
    public String getSegment17High() {
        return segment17High;
    }

    /**
    * 设置-核算段值12高位
    * @paramType java.lang.String
    * @param segment17High - 核算段值12高位
     */
    public void setSegment17High(String segment17High) {
        this.segment17High = segment17High;
    }

    /**
    * 获取-个险(团险)
    * @return segment18Low
     */
    public String getSegment18Low() {
        return segment18Low;
    }

    /**
    * 设置-个险(团险)
    * @paramType java.lang.String
    * @param segment18Low - 个险(团险)
     */
    public void setSegment18Low(String segment18Low) {
        this.segment18Low = segment18Low;
    }

    /**
    * 获取-个险(团险)
    * @return segment18High
     */
    public String getSegment18High() {
        return segment18High;
    }

    /**
    * 设置-个险(团险)
    * @paramType java.lang.String
    * @param segment18High - 个险(团险)
     */
    public void setSegment18High(String segment18High) {
        this.segment18High = segment18High;
    }

    /**
    * 获取-车辆类型
    * @return segment19Low
     */
    public String getSegment19Low() {
        return segment19Low;
    }

    /**
    * 设置-车辆类型
    * @paramType java.lang.String
    * @param segment19Low - 车辆类型
     */
    public void setSegment19Low(String segment19Low) {
        this.segment19Low = segment19Low;
    }

    /**
    * 获取-车辆类型
    * @return segment19High
     */
    public String getSegment19High() {
        return segment19High;
    }

    /**
    * 设置-车辆类型
    * @paramType java.lang.String
    * @param segment19High - 车辆类型
     */
    public void setSegment19High(String segment19High) {
        this.segment19High = segment19High;
    }

    /**
    * 获取-使用性质
    * @return segment20Low
     */
    public String getSegment20Low() {
        return segment20Low;
    }

    /**
    * 设置-使用性质
    * @paramType java.lang.String
    * @param segment20Low - 使用性质
     */
    public void setSegment20Low(String segment20Low) {
        this.segment20Low = segment20Low;
    }

    /**
    * 获取-使用性质
    * @return segment20High
     */
    public String getSegment20High() {
        return segment20High;
    }

    /**
    * 设置-使用性质
    * @paramType java.lang.String
    * @param segment20High - 使用性质
     */
    public void setSegment20High(String segment20High) {
        this.segment20High = segment20High;
    }

    /**
    * 获取-规格特性
    * @return segment21Low
     */
    public String getSegment21Low() {
        return segment21Low;
    }

    /**
    * 设置-规格特性
    * @paramType java.lang.String
    * @param segment21Low - 规格特性
     */
    public void setSegment21Low(String segment21Low) {
        this.segment21Low = segment21Low;
    }

    /**
    * 获取-规格特性
    * @return segment21High
     */
    public String getSegment21High() {
        return segment21High;
    }

    /**
    * 设置-规格特性
    * @paramType java.lang.String
    * @param segment21High - 规格特性
     */
    public void setSegment21High(String segment21High) {
        this.segment21High = segment21High;
    }

    /**
    * 获取-境内/境外
    * @return segment22Low
     */
    public String getSegment22Low() {
        return segment22Low;
    }

    /**
    * 设置-境内/境外
    * @paramType java.lang.String
    * @param segment22Low - 境内/境外
     */
    public void setSegment22Low(String segment22Low) {
        this.segment22Low = segment22Low;
    }

    /**
    * 获取-境内/境外
    * @return segment22High
     */
    public String getSegment22High() {
        return segment22High;
    }

    /**
    * 设置-境内/境外
    * @paramType java.lang.String
    * @param segment22High - 境内/境外
     */
    public void setSegment22High(String segment22High) {
        this.segment22High = segment22High;
    }

    /**
    * 获取-农业险性质
    * @return segment23Low
     */
    public String getSegment23Low() {
        return segment23Low;
    }

    /**
    * 设置-农业险性质
    * @paramType java.lang.String
    * @param segment23Low - 农业险性质
     */
    public void setSegment23Low(String segment23Low) {
        this.segment23Low = segment23Low;
    }

    /**
    * 获取-农业险性质
    * @return segment23High
     */
    public String getSegment23High() {
        return segment23High;
    }

    /**
    * 设置-农业险性质
    * @paramType java.lang.String
    * @param segment23High - 农业险性质
     */
    public void setSegment23High(String segment23High) {
        this.segment23High = segment23High;
    }

    /**
    * 获取-保费来源
    * @return segment24Low
     */
    public String getSegment24Low() {
        return segment24Low;
    }

    /**
    * 设置-保费来源
    * @paramType java.lang.String
    * @param segment24Low - 保费来源
     */
    public void setSegment24Low(String segment24Low) {
        this.segment24Low = segment24Low;
    }

    /**
    * 获取-保费来源
    * @return segment24High
     */
    public String getSegment24High() {
        return segment24High;
    }

    /**
    * 设置-保费来源
    * @paramType java.lang.String
    * @param segment24High - 保费来源
     */
    public void setSegment24High(String segment24High) {
        this.segment24High = segment24High;
    }

    /**
    * 获取-涉农类别
    * @return segment25Low
     */
    public String getSegment25Low() {
        return segment25Low;
    }

    /**
    * 设置-涉农类别
    * @paramType java.lang.String
    * @param segment25Low - 涉农类别
     */
    public void setSegment25Low(String segment25Low) {
        this.segment25Low = segment25Low;
    }

    /**
    * 获取-涉农类别
    * @return segment25High
     */
    public String getSegment25High() {
        return segment25High;
    }

    /**
    * 设置-涉农类别
    * @paramType java.lang.String
    * @param segment25High - 涉农类别
     */
    public void setSegment25High(String segment25High) {
        this.segment25High = segment25High;
    }

    /**
    * 获取-明细分类
    * @return segment26Low
     */
    public String getSegment26Low() {
        return segment26Low;
    }

    /**
    * 设置-明细分类
    * @paramType java.lang.String
    * @param segment26Low - 明细分类
     */
    public void setSegment26Low(String segment26Low) {
        this.segment26Low = segment26Low;
    }

    /**
    * 获取-明细分类
    * @return segment26High
     */
    public String getSegment26High() {
        return segment26High;
    }

    /**
    * 设置-明细分类
    * @paramType java.lang.String
    * @param segment26High - 明细分类
     */
    public void setSegment26High(String segment26High) {
        this.segment26High = segment26High;
    }

    /**
    * 获取-承诺项目
    * @return segment27Low
     */
    public String getSegment27Low() {
        return segment27Low;
    }

    /**
    * 设置-承诺项目
    * @paramType java.lang.String
    * @param segment27Low - 承诺项目
     */
    public void setSegment27Low(String segment27Low) {
        this.segment27Low = segment27Low;
    }

    /**
    * 获取-承诺项目
    * @return segment27High
     */
    public String getSegment27High() {
        return segment27High;
    }

    /**
    * 设置-承诺项目
    * @paramType java.lang.String
    * @param segment27High - 承诺项目
     */
    public void setSegment27High(String segment27High) {
        this.segment27High = segment27High;
    }

    /**
    * 获取-内部订单
    * @return segment28Low
     */
    public String getSegment28Low() {
        return segment28Low;
    }

    /**
    * 设置-内部订单
    * @paramType java.lang.String
    * @param segment28Low - 内部订单
     */
    public void setSegment28Low(String segment28Low) {
        this.segment28Low = segment28Low;
    }

    /**
    * 获取-内部订单
    * @return segment28High
     */
    public String getSegment28High() {
        return segment28High;
    }

    /**
    * 设置-内部订单
    * @paramType java.lang.String
    * @param segment28High - 内部订单
     */
    public void setSegment28High(String segment28High) {
        this.segment28High = segment28High;
    }

    /**
    * 获取-管理渠道
    * @return segment29Low
     */
    public String getSegment29Low() {
        return segment29Low;
    }

    /**
    * 设置-管理渠道
    * @paramType java.lang.String
    * @param segment29Low - 管理渠道
     */
    public void setSegment29Low(String segment29Low) {
        this.segment29Low = segment29Low;
    }

    /**
    * 获取-管理渠道
    * @return segment29High
     */
    public String getSegment29High() {
        return segment29High;
    }

    /**
    * 设置-管理渠道
    * @paramType java.lang.String
    * @param segment29High - 管理渠道
     */
    public void setSegment29High(String segment29High) {
        this.segment29High = segment29High;
    }
}