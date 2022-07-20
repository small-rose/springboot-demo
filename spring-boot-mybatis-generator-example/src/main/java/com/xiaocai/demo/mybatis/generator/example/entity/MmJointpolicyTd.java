package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_jointpolicy_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmJointpolicyTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 大保单号
     */
    private String bigpolicyno;

    /**
     * 小保单号
     */
    private String smallpolicyno;

    /**
     * 联保类型
     */
    private String jointtype;

    /**
     * 数据类型
     */
    private String datatype;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态
     */
    private String status;

    /**
     * 入库时间
     */
    private Date timestamp;

    /**
     * 最后更新时间
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

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
    * 获取-大保单号
    * @return bigpolicyno
     */
    public String getBigpolicyno() {
        return bigpolicyno;
    }

    /**
    * 设置-大保单号
    * @paramType java.lang.String
    * @param bigpolicyno - 大保单号
     */
    public void setBigpolicyno(String bigpolicyno) {
        this.bigpolicyno = bigpolicyno;
    }

    /**
    * 获取-小保单号
    * @return smallpolicyno
     */
    public String getSmallpolicyno() {
        return smallpolicyno;
    }

    /**
    * 设置-小保单号
    * @paramType java.lang.String
    * @param smallpolicyno - 小保单号
     */
    public void setSmallpolicyno(String smallpolicyno) {
        this.smallpolicyno = smallpolicyno;
    }

    /**
    * 获取-联保类型
    * @return jointtype
     */
    public String getJointtype() {
        return jointtype;
    }

    /**
    * 设置-联保类型
    * @paramType java.lang.String
    * @param jointtype - 联保类型
     */
    public void setJointtype(String jointtype) {
        this.jointtype = jointtype;
    }

    /**
    * 获取-数据类型
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-数据类型
    * @paramType java.lang.String
    * @param datatype - 数据类型
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    /**
    * 获取-操作日期
    * @return opdate
     */
    public Date getOpdate() {
        return opdate;
    }

    /**
    * 设置-操作日期
    * @paramType java.util.Date
    * @param opdate - 操作日期
     */
    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }

    /**
    * 获取-备注
    * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param remark - 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
    * 获取-状态
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态
    * @paramType java.lang.String
    * @param status - 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-入库时间
    * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
    * 设置-入库时间
    * @paramType java.util.Date
    * @param timestamp - 入库时间
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
    * 获取-最后更新时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后更新时间
    * @paramType java.util.Date
    * @param lastopdate - 最后更新时间
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
}