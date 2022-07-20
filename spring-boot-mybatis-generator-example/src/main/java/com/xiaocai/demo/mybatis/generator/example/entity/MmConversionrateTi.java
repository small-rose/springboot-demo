package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_conversionrate_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmConversionrateTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 被兑换货币
     */
    private String currency1;

    /**
     * 兑换货币
     */
    private String currency2;

    /**
     * 生效时间
     */
    private Date startdate;

    /**
     * 失效时间
     */
    private Date enddate;

    /**
     * 汇率
     */
    private BigDecimal exchangerate;

    /**
     * 操作员
     */
    private String opcode;

    /**
     * 记录日期
     */
    private Date recorddate;

    /**
     * 状态，1 初始状态 2落地成功 3落地失败
     */
    private String status;

    /**
     * 数据版本号
     */
    private Integer hibernateversion;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 数据来源
     */
    private String source;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 批次序号
     */
    private String batchserialno;

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
    * 获取-被兑换货币
    * @return currency1
     */
    public String getCurrency1() {
        return currency1;
    }

    /**
    * 设置-被兑换货币
    * @paramType java.lang.String
    * @param currency1 - 被兑换货币
     */
    public void setCurrency1(String currency1) {
        this.currency1 = currency1;
    }

    /**
    * 获取-兑换货币
    * @return currency2
     */
    public String getCurrency2() {
        return currency2;
    }

    /**
    * 设置-兑换货币
    * @paramType java.lang.String
    * @param currency2 - 兑换货币
     */
    public void setCurrency2(String currency2) {
        this.currency2 = currency2;
    }

    /**
    * 获取-生效时间
    * @return startdate
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
    * 设置-生效时间
    * @paramType java.util.Date
    * @param startdate - 生效时间
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
    * 获取-失效时间
    * @return enddate
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
    * 设置-失效时间
    * @paramType java.util.Date
    * @param enddate - 失效时间
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
    * 获取-汇率
    * @return exchangerate
     */
    public BigDecimal getExchangerate() {
        return exchangerate;
    }

    /**
    * 设置-汇率
    * @paramType java.math.BigDecimal
    * @param exchangerate - 汇率
     */
    public void setExchangerate(BigDecimal exchangerate) {
        this.exchangerate = exchangerate;
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
    * 获取-记录日期
    * @return recorddate
     */
    public Date getRecorddate() {
        return recorddate;
    }

    /**
    * 设置-记录日期
    * @paramType java.util.Date
    * @param recorddate - 记录日期
     */
    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
    }

    /**
    * 获取-状态，1 初始状态 2落地成功 3落地失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态，1 初始状态 2落地成功 3落地失败
    * @paramType java.lang.String
    * @param status - 状态，1 初始状态 2落地成功 3落地失败
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-数据版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-数据版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - 数据版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
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
    * 获取-数据来源
    * @return source
     */
    public String getSource() {
        return source;
    }

    /**
    * 设置-数据来源
    * @paramType java.lang.String
    * @param source - 数据来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
    * 获取-批次号
    * @return batchid
     */
    public String getBatchid() {
        return batchid;
    }

    /**
    * 设置-批次号
    * @paramType java.lang.String
    * @param batchid - 批次号
     */
    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    /**
    * 获取-批次序号
    * @return batchserialno
     */
    public String getBatchserialno() {
        return batchserialno;
    }

    /**
    * 设置-批次序号
    * @paramType java.lang.String
    * @param batchserialno - 批次序号
     */
    public void setBatchserialno(String batchserialno) {
        this.batchserialno = batchserialno;
    }
}