package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_format_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmFormatTc {
    /**
     * 主键
     */
    private String formatid;

    /**
     * 格式名称
     */
    private String formatname;

    /**
     * 只适用于导出格式，放导出服务器的文件路径，备用，也可能是配置在xml配置文件中
     */
    private String filepath;

    /**
     * 文件后缀，主要是给导出用，原则上导入只能用excel
     */
    private String filesuffix;

    /**
     * 日期格式
     */
    private String dateformat;

    /**
     * 【备用字段】是否需要根据长度来填充 1是  0否，已经配置到具体单元格这个维度此字段备用
     */
    private BigDecimal isfill;

    /**
     * 【备用字段】填充物，已经配置到具体单元格这个维度此字段备用
     */
    private String filling;

    /**
     * 【备用字段】是否需要加格式代码 1是  0否
     */
    private BigDecimal isadd;

    /**
     * 【备用字段】格式与数据分隔符
     */
    private String split;

    /**
     * 【备用字段】前缀
     */
    private String prefix;

    /**
     * 【备用字段】后缀
     */
    private String suffix;

    /**
     * 操作员
     */
    private String opcode;

    /**
     * 最后操作人代码
     */
    private String lastopcode;

    /**
     * 创建时间
     */
    private Date createdate;

    /**
     * 操作日期
     */
    private Date lastopdate;

    /**
     * 人工修改数据描述
     */
    private String modifydesc;

    /**
     * HIBERNATEVERSION版本号
     */
    private Integer hibernateversion;

    /**
     * 格式类型： 0收款导入 1 出盘 2回盘
     */
    private String formattype;

    /**
     * 换行符格式，如果格式是xls时，换行符为空；如果是txt格式，windows表示windows换行符，unix表示unix换行符。
     */
    private String linetype;

    /**
    * 获取-主键
    * @return formatid
     */
    public String getFormatid() {
        return formatid;
    }

    /**
    * 设置-主键
    * @paramType java.lang.String
    * @param formatid - 主键
     */
    public void setFormatid(String formatid) {
        this.formatid = formatid;
    }

    /**
    * 获取-格式名称
    * @return formatname
     */
    public String getFormatname() {
        return formatname;
    }

    /**
    * 设置-格式名称
    * @paramType java.lang.String
    * @param formatname - 格式名称
     */
    public void setFormatname(String formatname) {
        this.formatname = formatname;
    }

    /**
    * 获取-只适用于导出格式，放导出服务器的文件路径，备用，也可能是配置在xml配置文件中
    * @return filepath
     */
    public String getFilepath() {
        return filepath;
    }

    /**
    * 设置-只适用于导出格式，放导出服务器的文件路径，备用，也可能是配置在xml配置文件中
    * @paramType java.lang.String
    * @param filepath - 只适用于导出格式，放导出服务器的文件路径，备用，也可能是配置在xml配置文件中
     */
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    /**
    * 获取-文件后缀，主要是给导出用，原则上导入只能用excel
    * @return filesuffix
     */
    public String getFilesuffix() {
        return filesuffix;
    }

    /**
    * 设置-文件后缀，主要是给导出用，原则上导入只能用excel
    * @paramType java.lang.String
    * @param filesuffix - 文件后缀，主要是给导出用，原则上导入只能用excel
     */
    public void setFilesuffix(String filesuffix) {
        this.filesuffix = filesuffix;
    }

    /**
    * 获取-日期格式
    * @return dateformat
     */
    public String getDateformat() {
        return dateformat;
    }

    /**
    * 设置-日期格式
    * @paramType java.lang.String
    * @param dateformat - 日期格式
     */
    public void setDateformat(String dateformat) {
        this.dateformat = dateformat;
    }

    /**
    * 获取-【备用字段】是否需要根据长度来填充 1是  0否，已经配置到具体单元格这个维度此字段备用
    * @return isfill
     */
    public BigDecimal getIsfill() {
        return isfill;
    }

    /**
    * 设置-【备用字段】是否需要根据长度来填充 1是  0否，已经配置到具体单元格这个维度此字段备用
    * @paramType java.math.BigDecimal
    * @param isfill - 【备用字段】是否需要根据长度来填充 1是  0否，已经配置到具体单元格这个维度此字段备用
     */
    public void setIsfill(BigDecimal isfill) {
        this.isfill = isfill;
    }

    /**
    * 获取-【备用字段】填充物，已经配置到具体单元格这个维度此字段备用
    * @return filling
     */
    public String getFilling() {
        return filling;
    }

    /**
    * 设置-【备用字段】填充物，已经配置到具体单元格这个维度此字段备用
    * @paramType java.lang.String
    * @param filling - 【备用字段】填充物，已经配置到具体单元格这个维度此字段备用
     */
    public void setFilling(String filling) {
        this.filling = filling;
    }

    /**
    * 获取-【备用字段】是否需要加格式代码 1是  0否
    * @return isadd
     */
    public BigDecimal getIsadd() {
        return isadd;
    }

    /**
    * 设置-【备用字段】是否需要加格式代码 1是  0否
    * @paramType java.math.BigDecimal
    * @param isadd - 【备用字段】是否需要加格式代码 1是  0否
     */
    public void setIsadd(BigDecimal isadd) {
        this.isadd = isadd;
    }

    /**
    * 获取-【备用字段】格式与数据分隔符
    * @return split
     */
    public String getSplit() {
        return split;
    }

    /**
    * 设置-【备用字段】格式与数据分隔符
    * @paramType java.lang.String
    * @param split - 【备用字段】格式与数据分隔符
     */
    public void setSplit(String split) {
        this.split = split;
    }

    /**
    * 获取-【备用字段】前缀
    * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    /**
    * 设置-【备用字段】前缀
    * @paramType java.lang.String
    * @param prefix - 【备用字段】前缀
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
    * 获取-【备用字段】后缀
    * @return suffix
     */
    public String getSuffix() {
        return suffix;
    }

    /**
    * 设置-【备用字段】后缀
    * @paramType java.lang.String
    * @param suffix - 【备用字段】后缀
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
    * 获取-操作员
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作员
    * @paramType java.lang.String
    * @param opcode - 操作员
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-最后操作人代码
    * @return lastopcode
     */
    public String getLastopcode() {
        return lastopcode;
    }

    /**
    * 设置-最后操作人代码
    * @paramType java.lang.String
    * @param lastopcode - 最后操作人代码
     */
    public void setLastopcode(String lastopcode) {
        this.lastopcode = lastopcode;
    }

    /**
    * 获取-创建时间
    * @return createdate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
    * 设置-创建时间
    * @paramType java.util.Date
    * @param createdate - 创建时间
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
    * 获取-操作日期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-操作日期
    * @paramType java.util.Date
    * @param lastopdate - 操作日期
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-人工修改数据描述
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-人工修改数据描述
    * @paramType java.lang.String
    * @param modifydesc - 人工修改数据描述
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
    * 获取-格式类型： 0收款导入 1 出盘 2回盘
    * @return formattype
     */
    public String getFormattype() {
        return formattype;
    }

    /**
    * 设置-格式类型： 0收款导入 1 出盘 2回盘
    * @paramType java.lang.String
    * @param formattype - 格式类型： 0收款导入 1 出盘 2回盘
     */
    public void setFormattype(String formattype) {
        this.formattype = formattype;
    }

    /**
    * 获取-换行符格式，如果格式是xls时，换行符为空；如果是txt格式，windows表示windows换行符，unix表示unix换行符。
    * @return linetype
     */
    public String getLinetype() {
        return linetype;
    }

    /**
    * 设置-换行符格式，如果格式是xls时，换行符为空；如果是txt格式，windows表示windows换行符，unix表示unix换行符。
    * @paramType java.lang.String
    * @param linetype - 换行符格式，如果格式是xls时，换行符为空；如果是txt格式，windows表示windows换行符，unix表示unix换行符。
     */
    public void setLinetype(String linetype) {
        this.linetype = linetype;
    }
}