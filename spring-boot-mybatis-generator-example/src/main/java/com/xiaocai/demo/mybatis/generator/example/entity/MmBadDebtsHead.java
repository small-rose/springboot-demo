package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_bad_debts_head
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmBadDebtsHead {
    /**
     * 坏账提取日期
     */
    private Date extractDate;

    /**
     * 切片ID
     */
    private Long mirrorid;

    /**
     * 分公司代码
     */
    private String subcompany;

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
     * 操作状态:0初始状态,2已冲销,
     */
    private String opstatus;

    /**
     * 操作员代码
     */
    private String opcode;

    /**
    * 获取-坏账提取日期
    * @return extractDate
     */
    public Date getExtractDate() {
        return extractDate;
    }

    /**
    * 设置-坏账提取日期
    * @paramType java.util.Date
    * @param extractDate - 坏账提取日期
     */
    public void setExtractDate(Date extractDate) {
        this.extractDate = extractDate;
    }

    /**
    * 获取-切片ID
    * @return mirrorid
     */
    public Long getMirrorid() {
        return mirrorid;
    }

    /**
    * 设置-切片ID
    * @paramType java.lang.Long
    * @param mirrorid - 切片ID
     */
    public void setMirrorid(Long mirrorid) {
        this.mirrorid = mirrorid;
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
    * 获取-操作状态:0初始状态,2已冲销,
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-操作状态:0初始状态,2已冲销,
    * @paramType java.lang.String
    * @param opstatus - 操作状态:0初始状态,2已冲销,
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