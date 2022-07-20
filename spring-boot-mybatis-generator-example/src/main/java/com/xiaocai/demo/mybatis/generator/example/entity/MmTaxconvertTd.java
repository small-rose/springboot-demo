package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_taxconvert_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTaxconvertTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 核心代码
     */
    private String corenum;

    /**
     * 核心名称
     */
    private String corename;

    /**
     * 申报代码
     */
    private String reportnum;

    /**
     * 申报名称
     */
    private String reportname;

    /**
     * 是否有效0:无效,1:有效
     */
    private String ifvalid;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 备用字段
     */
    private String segment1;

    /**
     * 描述
     */
    private String description;

    /**
     * 类型(01:燃料种类转换,02:证件类型转换,03:使用性质转换,04:车辆种类,05:征收品目)
     */
    private String type;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 分公司名称
     */
    private String subcompanyname;

    /**
     * 年税额标准
     */
    private BigDecimal yeartaxstandard;

    /**
     * 计税单位：辆、吨、排气量
     */
    private String unit;

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
    * 获取-核心代码
    * @return corenum
     */
    public String getCorenum() {
        return corenum;
    }

    /**
    * 设置-核心代码
    * @paramType java.lang.String
    * @param corenum - 核心代码
     */
    public void setCorenum(String corenum) {
        this.corenum = corenum;
    }

    /**
    * 获取-核心名称
    * @return corename
     */
    public String getCorename() {
        return corename;
    }

    /**
    * 设置-核心名称
    * @paramType java.lang.String
    * @param corename - 核心名称
     */
    public void setCorename(String corename) {
        this.corename = corename;
    }

    /**
    * 获取-申报代码
    * @return reportnum
     */
    public String getReportnum() {
        return reportnum;
    }

    /**
    * 设置-申报代码
    * @paramType java.lang.String
    * @param reportnum - 申报代码
     */
    public void setReportnum(String reportnum) {
        this.reportnum = reportnum;
    }

    /**
    * 获取-申报名称
    * @return reportname
     */
    public String getReportname() {
        return reportname;
    }

    /**
    * 设置-申报名称
    * @paramType java.lang.String
    * @param reportname - 申报名称
     */
    public void setReportname(String reportname) {
        this.reportname = reportname;
    }

    /**
    * 获取-是否有效0:无效,1:有效
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否有效0:无效,1:有效
    * @paramType java.lang.String
    * @param ifvalid - 是否有效0:无效,1:有效
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
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
    * 获取-备用字段
    * @return segment1
     */
    public String getSegment1() {
        return segment1;
    }

    /**
    * 设置-备用字段
    * @paramType java.lang.String
    * @param segment1 - 备用字段
     */
    public void setSegment1(String segment1) {
        this.segment1 = segment1;
    }

    /**
    * 获取-描述
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-描述
    * @paramType java.lang.String
    * @param description - 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    * 获取-类型(01:燃料种类转换,02:证件类型转换,03:使用性质转换,04:车辆种类,05:征收品目)
    * @return type
     */
    public String getType() {
        return type;
    }

    /**
    * 设置-类型(01:燃料种类转换,02:证件类型转换,03:使用性质转换,04:车辆种类,05:征收品目)
    * @paramType java.lang.String
    * @param type - 类型(01:燃料种类转换,02:证件类型转换,03:使用性质转换,04:车辆种类,05:征收品目)
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
    * 获取-分公司代码
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司代码
    * @paramType java.lang.String
    * @param subcompany - 分公司代码
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-分公司名称
    * @return subcompanyname
     */
    public String getSubcompanyname() {
        return subcompanyname;
    }

    /**
    * 设置-分公司名称
    * @paramType java.lang.String
    * @param subcompanyname - 分公司名称
     */
    public void setSubcompanyname(String subcompanyname) {
        this.subcompanyname = subcompanyname;
    }

    /**
    * 获取-年税额标准
    * @return yeartaxstandard
     */
    public BigDecimal getYeartaxstandard() {
        return yeartaxstandard;
    }

    /**
    * 设置-年税额标准
    * @paramType java.math.BigDecimal
    * @param yeartaxstandard - 年税额标准
     */
    public void setYeartaxstandard(BigDecimal yeartaxstandard) {
        this.yeartaxstandard = yeartaxstandard;
    }

    /**
    * 获取-计税单位：辆、吨、排气量
    * @return unit
     */
    public String getUnit() {
        return unit;
    }

    /**
    * 设置-计税单位：辆、吨、排气量
    * @paramType java.lang.String
    * @param unit - 计税单位：辆、吨、排气量
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
}