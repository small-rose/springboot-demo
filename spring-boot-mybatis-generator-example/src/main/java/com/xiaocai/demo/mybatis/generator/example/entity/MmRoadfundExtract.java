package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_roadfund_extract
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmRoadfundExtract {
    /**
     * 主键
     */
    private Long id;

    /**
     * head表的id
     */
    private Long headid;

    /**
     * 财务机构代码
     */
    private String unitcode;

    /**
     * 提取时间
     */
    private String extractDate;

    /**
     * 提取日期起
     */
    private Date fromDate;

    /**
     * 提取日期止
     */
    private Date endDate;

    /**
     * 险种代码
     */
    private String classescode;

    /**
     * 成本中心
     */
    private String departmentcode;

    /**
     * 保费收入金额
     */
    private BigDecimal amount;

    /**
     * 提取比例
     */
    private BigDecimal extractpercent;

    /**
     * 提取金额
     */
    private BigDecimal extractamount;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 版本控制
     */
    private Short hibernateversion;

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
    * 获取-head表的id
    * @return headid
     */
    public Long getHeadid() {
        return headid;
    }

    /**
    * 设置-head表的id
    * @paramType java.lang.Long
    * @param headid - head表的id
     */
    public void setHeadid(Long headid) {
        this.headid = headid;
    }

    /**
    * 获取-财务机构代码
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-财务机构代码
    * @paramType java.lang.String
    * @param unitcode - 财务机构代码
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    /**
    * 获取-提取时间
    * @return extractDate
     */
    public String getExtractDate() {
        return extractDate;
    }

    /**
    * 设置-提取时间
    * @paramType java.lang.String
    * @param extractDate - 提取时间
     */
    public void setExtractDate(String extractDate) {
        this.extractDate = extractDate;
    }

    /**
    * 获取-提取日期起
    * @return fromDate
     */
    public Date getFromDate() {
        return fromDate;
    }

    /**
    * 设置-提取日期起
    * @paramType java.util.Date
    * @param fromDate - 提取日期起
     */
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    /**
    * 获取-提取日期止
    * @return endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
    * 设置-提取日期止
    * @paramType java.util.Date
    * @param endDate - 提取日期止
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
    * 获取-险种代码
    * @return classescode
     */
    public String getClassescode() {
        return classescode;
    }

    /**
    * 设置-险种代码
    * @paramType java.lang.String
    * @param classescode - 险种代码
     */
    public void setClassescode(String classescode) {
        this.classescode = classescode;
    }

    /**
    * 获取-成本中心
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-成本中心
    * @paramType java.lang.String
    * @param departmentcode - 成本中心
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    /**
    * 获取-保费收入金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-保费收入金额
    * @paramType java.math.BigDecimal
    * @param amount - 保费收入金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-提取比例
    * @return extractpercent
     */
    public BigDecimal getExtractpercent() {
        return extractpercent;
    }

    /**
    * 设置-提取比例
    * @paramType java.math.BigDecimal
    * @param extractpercent - 提取比例
     */
    public void setExtractpercent(BigDecimal extractpercent) {
        this.extractpercent = extractpercent;
    }

    /**
    * 获取-提取金额
    * @return extractamount
     */
    public BigDecimal getExtractamount() {
        return extractamount;
    }

    /**
    * 设置-提取金额
    * @paramType java.math.BigDecimal
    * @param extractamount - 提取金额
     */
    public void setExtractamount(BigDecimal extractamount) {
        this.extractamount = extractamount;
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
    * 获取-版本控制
    * @return hibernateversion
     */
    public Short getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本控制
    * @paramType java.lang.Short
    * @param hibernateversion - 版本控制
     */
    public void setHibernateversion(Short hibernateversion) {
        this.hibernateversion = hibernateversion;
    }
}