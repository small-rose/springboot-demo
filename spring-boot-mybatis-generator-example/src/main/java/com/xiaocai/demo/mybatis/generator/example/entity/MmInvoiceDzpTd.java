package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_invoice_dzp_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmInvoiceDzpTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 发票唯一号
     */
    private Long seqinvoice;

    /**
     * 电子发票短连接
     */
    private String shortlink;

    /**
     * 是否有效：1有效 2无效 多次获取短连接时，将之前获取的均置为无效
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
     * HIBERNATEVERSION版本号
     */
    private Integer hibernateversion;

    /**
     * 手工修改
     */
    private String modifydesc;

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
    * 获取-发票唯一号
    * @return seqinvoice
     */
    public Long getSeqinvoice() {
        return seqinvoice;
    }

    /**
    * 设置-发票唯一号
    * @paramType java.lang.Long
    * @param seqinvoice - 发票唯一号
     */
    public void setSeqinvoice(Long seqinvoice) {
        this.seqinvoice = seqinvoice;
    }

    /**
    * 获取-电子发票短连接
    * @return shortlink
     */
    public String getShortlink() {
        return shortlink;
    }

    /**
    * 设置-电子发票短连接
    * @paramType java.lang.String
    * @param shortlink - 电子发票短连接
     */
    public void setShortlink(String shortlink) {
        this.shortlink = shortlink;
    }

    /**
    * 获取-是否有效：1有效 2无效 多次获取短连接时，将之前获取的均置为无效
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否有效：1有效 2无效 多次获取短连接时，将之前获取的均置为无效
    * @paramType java.lang.String
    * @param ifvalid - 是否有效：1有效 2无效 多次获取短连接时，将之前获取的均置为无效
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
    * 获取-手工修改
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改
    * @paramType java.lang.String
    * @param modifydesc - 手工修改
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }
}