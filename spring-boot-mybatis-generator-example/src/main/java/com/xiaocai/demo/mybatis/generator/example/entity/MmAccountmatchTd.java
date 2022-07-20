package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_accountmatch_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmAccountmatchTd {
    /**
     * 主键
     */
    private Long matchid;

    /**
     * 对应申请数据物理主键
     */
    private String applydataid;

    /**
     * MM_USABLEMONEY_TD主键
     */
    private Long usableno;

    /**
     * 支付申请号
     */
    private String businessno;

    /**
     * 业务类型
     */
    private String businesstype;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * HIBERNATEVERSION版本号
     */
    private Integer hibernateversion;

    /**
     * 手工修改数据说明
     */
    private String modifydesc;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 状态
     */
    private String status;

    /**
     * 操作人
     */
    private String opcode;

    /**
    * 获取-主键
    * @return matchid
     */
    public Long getMatchid() {
        return matchid;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param matchid - 主键
     */
    public void setMatchid(Long matchid) {
        this.matchid = matchid;
    }

    /**
    * 获取-对应申请数据物理主键
    * @return applydataid
     */
    public String getApplydataid() {
        return applydataid;
    }

    /**
    * 设置-对应申请数据物理主键
    * @paramType java.lang.String
    * @param applydataid - 对应申请数据物理主键
     */
    public void setApplydataid(String applydataid) {
        this.applydataid = applydataid;
    }

    /**
    * 获取-MM_USABLEMONEY_TD主键
    * @return usableno
     */
    public Long getUsableno() {
        return usableno;
    }

    /**
    * 设置-MM_USABLEMONEY_TD主键
    * @paramType java.lang.Long
    * @param usableno - MM_USABLEMONEY_TD主键
     */
    public void setUsableno(Long usableno) {
        this.usableno = usableno;
    }

    /**
    * 获取-支付申请号
    * @return businessno
     */
    public String getBusinessno() {
        return businessno;
    }

    /**
    * 设置-支付申请号
    * @paramType java.lang.String
    * @param businessno - 支付申请号
     */
    public void setBusinessno(String businessno) {
        this.businessno = businessno;
    }

    /**
    * 获取-业务类型
    * @return businesstype
     */
    public String getBusinesstype() {
        return businesstype;
    }

    /**
    * 设置-业务类型
    * @paramType java.lang.String
    * @param businesstype - 业务类型
     */
    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype;
    }

    /**
    * 获取-创建时间
    * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
    * 设置-创建时间
    * @paramType java.util.Date
    * @param createtime - 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
    * 获取-手工修改数据说明
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改数据说明
    * @paramType java.lang.String
    * @param modifydesc - 手工修改数据说明
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-金额
    * @paramType java.math.BigDecimal
    * @param amount - 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
    * 获取-操作人
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作人
    * @paramType java.lang.String
    * @param opcode - 操作人
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }
}