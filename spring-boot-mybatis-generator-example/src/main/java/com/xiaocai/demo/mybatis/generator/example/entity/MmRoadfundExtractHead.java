package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_roadfund_extract_head
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmRoadfundExtractHead {
    /**
     * 主键
     */
    private Long id;

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
     * 审核标志,0:未审核,1:已审核,审核同时送业务表相应数据
     */
    private String auditStatus;

    /**
     * 审核人
     */
    private String auditCode;

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
     * 操作状态:0初始状态,3已取销,
     */
    private String opstatus;

    /**
     * 操作员代码
     */
    private String opcode;

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
    * 获取-审核标志,0:未审核,1:已审核,审核同时送业务表相应数据
    * @return auditStatus
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    /**
    * 设置-审核标志,0:未审核,1:已审核,审核同时送业务表相应数据
    * @paramType java.lang.String
    * @param auditStatus - 审核标志,0:未审核,1:已审核,审核同时送业务表相应数据
     */
    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
    * 获取-审核人
    * @return auditCode
     */
    public String getAuditCode() {
        return auditCode;
    }

    /**
    * 设置-审核人
    * @paramType java.lang.String
    * @param auditCode - 审核人
     */
    public void setAuditCode(String auditCode) {
        this.auditCode = auditCode;
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

    /**
    * 获取-操作状态:0初始状态,3已取销,
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-操作状态:0初始状态,3已取销,
    * @paramType java.lang.String
    * @param opstatus - 操作状态:0初始状态,3已取销,
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
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
}