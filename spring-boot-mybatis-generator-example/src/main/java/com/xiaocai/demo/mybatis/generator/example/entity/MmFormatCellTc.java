package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_format_cell_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmFormatCellTc {
    /**
     * 主键
     */
    private Long id;

    /**
     * 对应格式MM_FORMAT_TC.id
     */
    private BigDecimal formatid;

    /**
     * 组成部分类型：header 、body、tail
     */
    private String componenttype;

    /**
     * 格式序号,在组成部分中的排列顺序
     */
    private BigDecimal no;

    /**
     * 字段代码
     */
    private String columncode;

    /**
     * 字段名称，配置人员理解用，程序不使用
     */
    private String columnname;

    /**
     * 银行要求的格式中需要拼字段的名称的时候使用
     */
    private String objectname;

    /**
     * 对应格式长度
     */
    private BigDecimal objectlength;

    /**
     * 是否补充填充物，0不补齐 1右边补齐 2左边补齐 3先左补齐后右补齐 4先右补齐后左补齐
     */
    private BigDecimal isfill;

    /**
     * 填充物,用什么补齐，LIST，可能是0、空格
     */
    private String filling;

    /**
     * 是否使用:1使用, 0不使用
     */
    private String ifvalid;

    /**
     * 操作人
     */
    private String opcode;

    /**
     * 最近操作人
     */
    private String lastopcode;

    /**
     * 时间戳
     */
    private Date createdate;

    /**
     * 最近操作时间
     */
    private Date lastopdate;

    /**
     * HIBERNATEVERSION版本号
     */
    private Integer hibernateversion;

    /**
     * 修改说明
     */
    private String modifydesc;

    /**
     * 如果字段是日期，这里限定日期的显示格式
     */
    private String dateformat;

    /**
     * 如果字段对应的值是固定值，这里写固定值。
     */
    private String fixedvalue;

    /**
     * 格式组成部分id，对应mm_format_component_tc.componentid
     */
    private BigDecimal componentid;

    /**
     * 必填选填0代表选填1代表必填,用于生成盘片时校验
     */
    private String required;

    /**
     * 如果字段是数字，这里限定小数点后的精度, 0表示整数
     */
    private BigDecimal numberscale;

    /**
     * 第一次补齐时要达到长度，不得大于OBJECTLENGTH
     */
    private BigDecimal firstfilllength;

    /**
     * 第二次补齐的填充物，第一次补齐用FILLING字段
     */
    private String secondfilling;

    /**
     * 映射关系代码
     */
    private String codetype;

    /**
     * mm_codemapping_tc表中的参考信息1字段值对应本表中的字段名称，辅助定位映射关系的参考要素。
     */
    private String refrence1bycolumn;

    /**
     * mm_codemapping_tc表中的参考信息2字段值对应本表中的字段名称
     */
    private String refrence2bycolumn;

    /**
     * mm_codemapping_tc表中的参考信息3字段值对应本表中的字段名称
     */
    private String refrence3bycolumn;

    /**
     * mm_codemapping_tc表中的参考信息4字段值对应本表中的字段名称
     */
    private String refrence4bycolumn;

    /**
     * 前缀
     */
    private String prefix;

    /**
     * 后缀
     */
    private String suffix;

    /**
     * 单位比率，主要针对金额，收付系统金额单位为元，如：农行回盘文件的金额是没有小数点，金额以分为单位。
     */
    private BigDecimal ratio;

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
    * 获取-对应格式MM_FORMAT_TC.id
    * @return formatid
     */
    public BigDecimal getFormatid() {
        return formatid;
    }

    /**
    * 设置-对应格式MM_FORMAT_TC.id
    * @paramType java.math.BigDecimal
    * @param formatid - 对应格式MM_FORMAT_TC.id
     */
    public void setFormatid(BigDecimal formatid) {
        this.formatid = formatid;
    }

    /**
    * 获取-组成部分类型：header 、body、tail
    * @return componenttype
     */
    public String getComponenttype() {
        return componenttype;
    }

    /**
    * 设置-组成部分类型：header 、body、tail
    * @paramType java.lang.String
    * @param componenttype - 组成部分类型：header 、body、tail
     */
    public void setComponenttype(String componenttype) {
        this.componenttype = componenttype;
    }

    /**
    * 获取-格式序号,在组成部分中的排列顺序
    * @return no
     */
    public BigDecimal getNo() {
        return no;
    }

    /**
    * 设置-格式序号,在组成部分中的排列顺序
    * @paramType java.math.BigDecimal
    * @param no - 格式序号,在组成部分中的排列顺序
     */
    public void setNo(BigDecimal no) {
        this.no = no;
    }

    /**
    * 获取-字段代码
    * @return columncode
     */
    public String getColumncode() {
        return columncode;
    }

    /**
    * 设置-字段代码
    * @paramType java.lang.String
    * @param columncode - 字段代码
     */
    public void setColumncode(String columncode) {
        this.columncode = columncode;
    }

    /**
    * 获取-字段名称，配置人员理解用，程序不使用
    * @return columnname
     */
    public String getColumnname() {
        return columnname;
    }

    /**
    * 设置-字段名称，配置人员理解用，程序不使用
    * @paramType java.lang.String
    * @param columnname - 字段名称，配置人员理解用，程序不使用
     */
    public void setColumnname(String columnname) {
        this.columnname = columnname;
    }

    /**
    * 获取-银行要求的格式中需要拼字段的名称的时候使用
    * @return objectname
     */
    public String getObjectname() {
        return objectname;
    }

    /**
    * 设置-银行要求的格式中需要拼字段的名称的时候使用
    * @paramType java.lang.String
    * @param objectname - 银行要求的格式中需要拼字段的名称的时候使用
     */
    public void setObjectname(String objectname) {
        this.objectname = objectname;
    }

    /**
    * 获取-对应格式长度
    * @return objectlength
     */
    public BigDecimal getObjectlength() {
        return objectlength;
    }

    /**
    * 设置-对应格式长度
    * @paramType java.math.BigDecimal
    * @param objectlength - 对应格式长度
     */
    public void setObjectlength(BigDecimal objectlength) {
        this.objectlength = objectlength;
    }

    /**
    * 获取-是否补充填充物，0不补齐 1右边补齐 2左边补齐 3先左补齐后右补齐 4先右补齐后左补齐
    * @return isfill
     */
    public BigDecimal getIsfill() {
        return isfill;
    }

    /**
    * 设置-是否补充填充物，0不补齐 1右边补齐 2左边补齐 3先左补齐后右补齐 4先右补齐后左补齐
    * @paramType java.math.BigDecimal
    * @param isfill - 是否补充填充物，0不补齐 1右边补齐 2左边补齐 3先左补齐后右补齐 4先右补齐后左补齐
     */
    public void setIsfill(BigDecimal isfill) {
        this.isfill = isfill;
    }

    /**
    * 获取-填充物,用什么补齐，LIST，可能是0、空格
    * @return filling
     */
    public String getFilling() {
        return filling;
    }

    /**
    * 设置-填充物,用什么补齐，LIST，可能是0、空格
    * @paramType java.lang.String
    * @param filling - 填充物,用什么补齐，LIST，可能是0、空格
     */
    public void setFilling(String filling) {
        this.filling = filling;
    }

    /**
    * 获取-是否使用:1使用, 0不使用
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否使用:1使用, 0不使用
    * @paramType java.lang.String
    * @param ifvalid - 是否使用:1使用, 0不使用
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
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
    * 获取-最近操作人
    * @return lastopcode
     */
    public String getLastopcode() {
        return lastopcode;
    }

    /**
    * 设置-最近操作人
    * @paramType java.lang.String
    * @param lastopcode - 最近操作人
     */
    public void setLastopcode(String lastopcode) {
        this.lastopcode = lastopcode;
    }

    /**
    * 获取-时间戳
    * @return createdate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
    * 设置-时间戳
    * @paramType java.util.Date
    * @param createdate - 时间戳
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
    * 获取-最近操作时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最近操作时间
    * @paramType java.util.Date
    * @param lastopdate - 最近操作时间
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
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
    * 获取-修改说明
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-修改说明
    * @paramType java.lang.String
    * @param modifydesc - 修改说明
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-如果字段是日期，这里限定日期的显示格式
    * @return dateformat
     */
    public String getDateformat() {
        return dateformat;
    }

    /**
    * 设置-如果字段是日期，这里限定日期的显示格式
    * @paramType java.lang.String
    * @param dateformat - 如果字段是日期，这里限定日期的显示格式
     */
    public void setDateformat(String dateformat) {
        this.dateformat = dateformat;
    }

    /**
    * 获取-如果字段对应的值是固定值，这里写固定值。
    * @return fixedvalue
     */
    public String getFixedvalue() {
        return fixedvalue;
    }

    /**
    * 设置-如果字段对应的值是固定值，这里写固定值。
    * @paramType java.lang.String
    * @param fixedvalue - 如果字段对应的值是固定值，这里写固定值。
     */
    public void setFixedvalue(String fixedvalue) {
        this.fixedvalue = fixedvalue;
    }

    /**
    * 获取-格式组成部分id，对应mm_format_component_tc.componentid
    * @return componentid
     */
    public BigDecimal getComponentid() {
        return componentid;
    }

    /**
    * 设置-格式组成部分id，对应mm_format_component_tc.componentid
    * @paramType java.math.BigDecimal
    * @param componentid - 格式组成部分id，对应mm_format_component_tc.componentid
     */
    public void setComponentid(BigDecimal componentid) {
        this.componentid = componentid;
    }

    /**
    * 获取-必填选填0代表选填1代表必填,用于生成盘片时校验
    * @return required
     */
    public String getRequired() {
        return required;
    }

    /**
    * 设置-必填选填0代表选填1代表必填,用于生成盘片时校验
    * @paramType java.lang.String
    * @param required - 必填选填0代表选填1代表必填,用于生成盘片时校验
     */
    public void setRequired(String required) {
        this.required = required;
    }

    /**
    * 获取-如果字段是数字，这里限定小数点后的精度, 0表示整数
    * @return numberscale
     */
    public BigDecimal getNumberscale() {
        return numberscale;
    }

    /**
    * 设置-如果字段是数字，这里限定小数点后的精度, 0表示整数
    * @paramType java.math.BigDecimal
    * @param numberscale - 如果字段是数字，这里限定小数点后的精度, 0表示整数
     */
    public void setNumberscale(BigDecimal numberscale) {
        this.numberscale = numberscale;
    }

    /**
    * 获取-第一次补齐时要达到长度，不得大于OBJECTLENGTH
    * @return firstfilllength
     */
    public BigDecimal getFirstfilllength() {
        return firstfilllength;
    }

    /**
    * 设置-第一次补齐时要达到长度，不得大于OBJECTLENGTH
    * @paramType java.math.BigDecimal
    * @param firstfilllength - 第一次补齐时要达到长度，不得大于OBJECTLENGTH
     */
    public void setFirstfilllength(BigDecimal firstfilllength) {
        this.firstfilllength = firstfilllength;
    }

    /**
    * 获取-第二次补齐的填充物，第一次补齐用FILLING字段
    * @return secondfilling
     */
    public String getSecondfilling() {
        return secondfilling;
    }

    /**
    * 设置-第二次补齐的填充物，第一次补齐用FILLING字段
    * @paramType java.lang.String
    * @param secondfilling - 第二次补齐的填充物，第一次补齐用FILLING字段
     */
    public void setSecondfilling(String secondfilling) {
        this.secondfilling = secondfilling;
    }

    /**
    * 获取-映射关系代码
    * @return codetype
     */
    public String getCodetype() {
        return codetype;
    }

    /**
    * 设置-映射关系代码
    * @paramType java.lang.String
    * @param codetype - 映射关系代码
     */
    public void setCodetype(String codetype) {
        this.codetype = codetype;
    }

    /**
    * 获取-mm_codemapping_tc表中的参考信息1字段值对应本表中的字段名称，辅助定位映射关系的参考要素。
    * @return refrence1bycolumn
     */
    public String getRefrence1bycolumn() {
        return refrence1bycolumn;
    }

    /**
    * 设置-mm_codemapping_tc表中的参考信息1字段值对应本表中的字段名称，辅助定位映射关系的参考要素。
    * @paramType java.lang.String
    * @param refrence1bycolumn - mm_codemapping_tc表中的参考信息1字段值对应本表中的字段名称，辅助定位映射关系的参考要素。
     */
    public void setRefrence1bycolumn(String refrence1bycolumn) {
        this.refrence1bycolumn = refrence1bycolumn;
    }

    /**
    * 获取-mm_codemapping_tc表中的参考信息2字段值对应本表中的字段名称
    * @return refrence2bycolumn
     */
    public String getRefrence2bycolumn() {
        return refrence2bycolumn;
    }

    /**
    * 设置-mm_codemapping_tc表中的参考信息2字段值对应本表中的字段名称
    * @paramType java.lang.String
    * @param refrence2bycolumn - mm_codemapping_tc表中的参考信息2字段值对应本表中的字段名称
     */
    public void setRefrence2bycolumn(String refrence2bycolumn) {
        this.refrence2bycolumn = refrence2bycolumn;
    }

    /**
    * 获取-mm_codemapping_tc表中的参考信息3字段值对应本表中的字段名称
    * @return refrence3bycolumn
     */
    public String getRefrence3bycolumn() {
        return refrence3bycolumn;
    }

    /**
    * 设置-mm_codemapping_tc表中的参考信息3字段值对应本表中的字段名称
    * @paramType java.lang.String
    * @param refrence3bycolumn - mm_codemapping_tc表中的参考信息3字段值对应本表中的字段名称
     */
    public void setRefrence3bycolumn(String refrence3bycolumn) {
        this.refrence3bycolumn = refrence3bycolumn;
    }

    /**
    * 获取-mm_codemapping_tc表中的参考信息4字段值对应本表中的字段名称
    * @return refrence4bycolumn
     */
    public String getRefrence4bycolumn() {
        return refrence4bycolumn;
    }

    /**
    * 设置-mm_codemapping_tc表中的参考信息4字段值对应本表中的字段名称
    * @paramType java.lang.String
    * @param refrence4bycolumn - mm_codemapping_tc表中的参考信息4字段值对应本表中的字段名称
     */
    public void setRefrence4bycolumn(String refrence4bycolumn) {
        this.refrence4bycolumn = refrence4bycolumn;
    }

    /**
    * 获取-前缀
    * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    /**
    * 设置-前缀
    * @paramType java.lang.String
    * @param prefix - 前缀
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
    * 获取-后缀
    * @return suffix
     */
    public String getSuffix() {
        return suffix;
    }

    /**
    * 设置-后缀
    * @paramType java.lang.String
    * @param suffix - 后缀
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
    * 获取-单位比率，主要针对金额，收付系统金额单位为元，如：农行回盘文件的金额是没有小数点，金额以分为单位。
    * @return ratio
     */
    public BigDecimal getRatio() {
        return ratio;
    }

    /**
    * 设置-单位比率，主要针对金额，收付系统金额单位为元，如：农行回盘文件的金额是没有小数点，金额以分为单位。
    * @paramType java.math.BigDecimal
    * @param ratio - 单位比率，主要针对金额，收付系统金额单位为元，如：农行回盘文件的金额是没有小数点，金额以分为单位。
     */
    public void setRatio(BigDecimal ratio) {
        this.ratio = ratio;
    }
}