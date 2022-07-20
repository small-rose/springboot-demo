package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_rules_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmRulesTi {
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
     * 包括还是排除(I:包括,E:排除) 
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
     * 落地状态(2落地成功 3落地失败)
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
     * HIBERNATE版本
     */
    private Integer hibernateversion;

    /**
     * 备用段3从
     */
    private String segment9Low;

    /**
     * 备用段3至
     */
    private String segment9High;

    /**
     * 备用段4从
     */
    private String segment10Low;

    /**
     * 备用段4至
     */
    private String segment10High;

    /**
     * 备用段
     */
    private String segment11Low;

    /**
     * 备用段
     */
    private String segment11High;

    /**
     * 备用段
     */
    private String segment12Low;

    /**
     * 备用段
     */
    private String segment12High;

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
    * 获取-包括还是排除(I:包括,E:排除) 
    * @return includeExcludeIndicator
     */
    public String getIncludeExcludeIndicator() {
        return includeExcludeIndicator;
    }

    /**
    * 设置-包括还是排除(I:包括,E:排除) 
    * @paramType java.lang.String
    * @param includeExcludeIndicator - 包括还是排除(I:包括,E:排除) 
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
    * 获取-落地状态(2落地成功 3落地失败)
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-落地状态(2落地成功 3落地失败)
    * @paramType java.lang.String
    * @param status - 落地状态(2落地成功 3落地失败)
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
    * 获取-备用段3从
    * @return segment9Low
     */
    public String getSegment9Low() {
        return segment9Low;
    }

    /**
    * 设置-备用段3从
    * @paramType java.lang.String
    * @param segment9Low - 备用段3从
     */
    public void setSegment9Low(String segment9Low) {
        this.segment9Low = segment9Low;
    }

    /**
    * 获取-备用段3至
    * @return segment9High
     */
    public String getSegment9High() {
        return segment9High;
    }

    /**
    * 设置-备用段3至
    * @paramType java.lang.String
    * @param segment9High - 备用段3至
     */
    public void setSegment9High(String segment9High) {
        this.segment9High = segment9High;
    }

    /**
    * 获取-备用段4从
    * @return segment10Low
     */
    public String getSegment10Low() {
        return segment10Low;
    }

    /**
    * 设置-备用段4从
    * @paramType java.lang.String
    * @param segment10Low - 备用段4从
     */
    public void setSegment10Low(String segment10Low) {
        this.segment10Low = segment10Low;
    }

    /**
    * 获取-备用段4至
    * @return segment10High
     */
    public String getSegment10High() {
        return segment10High;
    }

    /**
    * 设置-备用段4至
    * @paramType java.lang.String
    * @param segment10High - 备用段4至
     */
    public void setSegment10High(String segment10High) {
        this.segment10High = segment10High;
    }

    /**
    * 获取-备用段
    * @return segment11Low
     */
    public String getSegment11Low() {
        return segment11Low;
    }

    /**
    * 设置-备用段
    * @paramType java.lang.String
    * @param segment11Low - 备用段
     */
    public void setSegment11Low(String segment11Low) {
        this.segment11Low = segment11Low;
    }

    /**
    * 获取-备用段
    * @return segment11High
     */
    public String getSegment11High() {
        return segment11High;
    }

    /**
    * 设置-备用段
    * @paramType java.lang.String
    * @param segment11High - 备用段
     */
    public void setSegment11High(String segment11High) {
        this.segment11High = segment11High;
    }

    /**
    * 获取-备用段
    * @return segment12Low
     */
    public String getSegment12Low() {
        return segment12Low;
    }

    /**
    * 设置-备用段
    * @paramType java.lang.String
    * @param segment12Low - 备用段
     */
    public void setSegment12Low(String segment12Low) {
        this.segment12Low = segment12Low;
    }

    /**
    * 获取-备用段
    * @return segment12High
     */
    public String getSegment12High() {
        return segment12High;
    }

    /**
    * 设置-备用段
    * @paramType java.lang.String
    * @param segment12High - 备用段
     */
    public void setSegment12High(String segment12High) {
        this.segment12High = segment12High;
    }
}