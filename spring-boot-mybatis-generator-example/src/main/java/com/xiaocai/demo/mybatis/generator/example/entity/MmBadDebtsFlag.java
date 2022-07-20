package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_bad_debts_flag
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmBadDebtsFlag {
    /**
     * 坏账类型(1:保单,2:再保)
     */
    private Long badType;

    /**
     * 记录保单或再保接口主键
     */
    private Long seqcharge;

    /**
     * 是否坏账 Y:是,N:否
     */
    private String isBad;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
    * 获取-坏账类型(1:保单,2:再保)
    * @return badType
     */
    public Long getBadType() {
        return badType;
    }

    /**
    * 设置-坏账类型(1:保单,2:再保)
    * @paramType java.lang.Long
    * @param badType - 坏账类型(1:保单,2:再保)
     */
    public void setBadType(Long badType) {
        this.badType = badType;
    }

    /**
    * 获取-记录保单或再保接口主键
    * @return seqcharge
     */
    public Long getSeqcharge() {
        return seqcharge;
    }

    /**
    * 设置-记录保单或再保接口主键
    * @paramType java.lang.Long
    * @param seqcharge - 记录保单或再保接口主键
     */
    public void setSeqcharge(Long seqcharge) {
        this.seqcharge = seqcharge;
    }

    /**
    * 获取-是否坏账 Y:是,N:否
    * @return isBad
     */
    public String getIsBad() {
        return isBad;
    }

    /**
    * 设置-是否坏账 Y:是,N:否
    * @paramType java.lang.String
    * @param isBad - 是否坏账 Y:是,N:否
     */
    public void setIsBad(String isBad) {
        this.isBad = isBad;
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