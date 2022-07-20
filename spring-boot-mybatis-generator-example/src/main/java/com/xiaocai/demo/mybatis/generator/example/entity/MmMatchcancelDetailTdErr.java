package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_matchcancel_detail_td_err
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmMatchcancelDetailTdErr {
    /**
     * 主键
     */
    private Long id;

    /**
     * 主表id
     */
    private Long mainid;

    /**
     * 交易流水表listno
     */
    private Long listno;

    /**
     * 取消的金额
     */
    private BigDecimal amount;

    /**
     * 取消的业务主键
     */
    private BigDecimal destno;

    /**
     * 取消的数据类型
     */
    private String datatype;

    /**
     * 批次号
     */
    private BigDecimal batchno;

    /**
     * 是dest(1非dest)
     */
    private String isdest;

    /**
     * 数据状态
     */
    private String status;

    /**
     * 最后修改日期
     */
    private Date lastopdate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 数据版本号
     */
    private Integer hibernateversion;

    /**
     * 手工修改数据说明(用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据)
     */
    private String modifydesc;

    /**
     * 结算单号
     */
    private String summaryno;

    /**
     * 取消的dest对应子险明细记录的id
     */
    private BigDecimal destdetailno;

    /**
     * 票据号
     */
    private String atsbillno;

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
    * 获取-主表id
    * @return mainid
     */
    public Long getMainid() {
        return mainid;
    }

    /**
    * 设置-主表id
    * @paramType java.lang.Long
    * @param mainid - 主表id
     */
    public void setMainid(Long mainid) {
        this.mainid = mainid;
    }

    /**
    * 获取-交易流水表listno
    * @return listno
     */
    public Long getListno() {
        return listno;
    }

    /**
    * 设置-交易流水表listno
    * @paramType java.lang.Long
    * @param listno - 交易流水表listno
     */
    public void setListno(Long listno) {
        this.listno = listno;
    }

    /**
    * 获取-取消的金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-取消的金额
    * @paramType java.math.BigDecimal
    * @param amount - 取消的金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-取消的业务主键
    * @return destno
     */
    public BigDecimal getDestno() {
        return destno;
    }

    /**
    * 设置-取消的业务主键
    * @paramType java.math.BigDecimal
    * @param destno - 取消的业务主键
     */
    public void setDestno(BigDecimal destno) {
        this.destno = destno;
    }

    /**
    * 获取-取消的数据类型
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-取消的数据类型
    * @paramType java.lang.String
    * @param datatype - 取消的数据类型
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    /**
    * 获取-批次号
    * @return batchno
     */
    public BigDecimal getBatchno() {
        return batchno;
    }

    /**
    * 设置-批次号
    * @paramType java.math.BigDecimal
    * @param batchno - 批次号
     */
    public void setBatchno(BigDecimal batchno) {
        this.batchno = batchno;
    }

    /**
    * 获取-是dest(1非dest)
    * @return isdest
     */
    public String getIsdest() {
        return isdest;
    }

    /**
    * 设置-是dest(1非dest)
    * @paramType java.lang.String
    * @param isdest - 是dest(1非dest)
     */
    public void setIsdest(String isdest) {
        this.isdest = isdest;
    }

    /**
    * 获取-数据状态
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-数据状态
    * @paramType java.lang.String
    * @param status - 数据状态
     */
    public void setStatus(String status) {
        this.status = status;
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
    * 获取-手工修改数据说明(用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据)
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改数据说明(用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据)
    * @paramType java.lang.String
    * @param modifydesc - 手工修改数据说明(用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据)
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-结算单号
    * @return summaryno
     */
    public String getSummaryno() {
        return summaryno;
    }

    /**
    * 设置-结算单号
    * @paramType java.lang.String
    * @param summaryno - 结算单号
     */
    public void setSummaryno(String summaryno) {
        this.summaryno = summaryno;
    }

    /**
    * 获取-取消的dest对应子险明细记录的id
    * @return destdetailno
     */
    public BigDecimal getDestdetailno() {
        return destdetailno;
    }

    /**
    * 设置-取消的dest对应子险明细记录的id
    * @paramType java.math.BigDecimal
    * @param destdetailno - 取消的dest对应子险明细记录的id
     */
    public void setDestdetailno(BigDecimal destdetailno) {
        this.destdetailno = destdetailno;
    }

    /**
    * 获取-票据号
    * @return atsbillno
     */
    public String getAtsbillno() {
        return atsbillno;
    }

    /**
    * 设置-票据号
    * @paramType java.lang.String
    * @param atsbillno - 票据号
     */
    public void setAtsbillno(String atsbillno) {
        this.atsbillno = atsbillno;
    }
}