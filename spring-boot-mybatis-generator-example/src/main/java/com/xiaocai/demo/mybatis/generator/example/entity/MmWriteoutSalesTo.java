package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_writeout_sales_to
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmWriteoutSalesTo {
    /**
     * 主键
     */
    private Long id;

    /**
     * 结算单号
     */
    private String commno;

    /**
     * 调用类型 1:结算单确认回退/支付失败 2:结算单实收付回写 3：结算单实际收付后，银行退票。
     */
    private String operatetype;

    /**
     * 结算单实收付的日期
     */
    private Date realpaydate;

    /**
     * 退回、失败原因
     */
    private String errormessage;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后修改日期
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 传送状态：00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误
     */
    private String status;

    /**
     * 传送批次号
     */
    private String batchId;

    /**
     * 数据原始来源
     */
    private String datasource;

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
    * 获取-结算单号
    * @return commno
     */
    public String getCommno() {
        return commno;
    }

    /**
    * 设置-结算单号
    * @paramType java.lang.String
    * @param commno - 结算单号
     */
    public void setCommno(String commno) {
        this.commno = commno;
    }

    /**
    * 获取-调用类型
1:结算单确认回退/支付失败
2:结算单实收付回写
3：结算单实际收付后，银行退票。
    * @return operatetype
     */
    public String getOperatetype() {
        return operatetype;
    }

    /**
    * 设置-调用类型
1:结算单确认回退/支付失败
2:结算单实收付回写
3：结算单实际收付后，银行退票。
    * @paramType java.lang.String
    * @param operatetype - 调用类型
1:结算单确认回退/支付失败
2:结算单实收付回写
3：结算单实际收付后，银行退票。
     */
    public void setOperatetype(String operatetype) {
        this.operatetype = operatetype;
    }

    /**
    * 获取-结算单实收付的日期
    * @return realpaydate
     */
    public Date getRealpaydate() {
        return realpaydate;
    }

    /**
    * 设置-结算单实收付的日期
    * @paramType java.util.Date
    * @param realpaydate - 结算单实收付的日期
     */
    public void setRealpaydate(Date realpaydate) {
        this.realpaydate = realpaydate;
    }

    /**
    * 获取-退回、失败原因
    * @return errormessage
     */
    public String getErrormessage() {
        return errormessage;
    }

    /**
    * 设置-退回、失败原因
    * @paramType java.lang.String
    * @param errormessage - 退回、失败原因
     */
    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
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
    * 获取-最后修改日期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后修改日期
    * @paramType java.util.Date
    * @param lastopdate - 最后修改日期
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
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
    * 获取-传送状态：00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-传送状态：00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误
    * @paramType java.lang.String
    * @param status - 传送状态：00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-传送批次号
    * @return batchId
     */
    public String getBatchId() {
        return batchId;
    }

    /**
    * 设置-传送批次号
    * @paramType java.lang.String
    * @param batchId - 传送批次号
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    /**
    * 获取-数据原始来源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-数据原始来源
    * @paramType java.lang.String
    * @param datasource - 数据原始来源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }
}