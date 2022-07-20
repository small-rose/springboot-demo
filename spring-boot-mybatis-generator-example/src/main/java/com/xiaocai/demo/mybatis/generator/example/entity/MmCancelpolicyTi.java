package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_cancelpolicy_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmCancelpolicyTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 数据源
     */
    private String datasource;

    /**
     * 业务类型
     */
    private String certitype;

    /**
     * 业务数据主键
     */
    private String custseq;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 赔案号
     */
    private String claimno;

    /**
     * 批量处理号
     */
    private String summaryno;

    /**
     * 描述
     */
    private String description;

    /**
     * 业务系统发起时间
     */
    private Date optime;

    /**
     * 指令类型
     */
    private String optype;

    /**
     * 接口服务方返回码
     */
    private String rtncode;

    /**
     * 接口服务方返回描述
     */
    private String rtnmsg;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * HIBERNATE版本号
     */
    private Short hibernateversion;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 批次号
     */
    private BigDecimal batchid;

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
    * 获取-数据源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-数据源
    * @paramType java.lang.String
    * @param datasource - 数据源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-业务类型
    * @return certitype
     */
    public String getCertitype() {
        return certitype;
    }

    /**
    * 设置-业务类型
    * @paramType java.lang.String
    * @param certitype - 业务类型
     */
    public void setCertitype(String certitype) {
        this.certitype = certitype;
    }

    /**
    * 获取-业务数据主键
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-业务数据主键
    * @paramType java.lang.String
    * @param custseq - 业务数据主键
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
    }

    /**
    * 获取-保单号
    * @return policyno
     */
    public String getPolicyno() {
        return policyno;
    }

    /**
    * 设置-保单号
    * @paramType java.lang.String
    * @param policyno - 保单号
     */
    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    /**
    * 获取-批单号
    * @return endorseno
     */
    public String getEndorseno() {
        return endorseno;
    }

    /**
    * 设置-批单号
    * @paramType java.lang.String
    * @param endorseno - 批单号
     */
    public void setEndorseno(String endorseno) {
        this.endorseno = endorseno;
    }

    /**
    * 获取-赔案号
    * @return claimno
     */
    public String getClaimno() {
        return claimno;
    }

    /**
    * 设置-赔案号
    * @paramType java.lang.String
    * @param claimno - 赔案号
     */
    public void setClaimno(String claimno) {
        this.claimno = claimno;
    }

    /**
    * 获取-批量处理号
    * @return summaryno
     */
    public String getSummaryno() {
        return summaryno;
    }

    /**
    * 设置-批量处理号
    * @paramType java.lang.String
    * @param summaryno - 批量处理号
     */
    public void setSummaryno(String summaryno) {
        this.summaryno = summaryno;
    }

    /**
    * 获取-描述
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-描述
    * @paramType java.lang.String
    * @param description - 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    * 获取-业务系统发起时间
    * @return optime
     */
    public Date getOptime() {
        return optime;
    }

    /**
    * 设置-业务系统发起时间
    * @paramType java.util.Date
    * @param optime - 业务系统发起时间
     */
    public void setOptime(Date optime) {
        this.optime = optime;
    }

    /**
    * 获取-指令类型
    * @return optype
     */
    public String getOptype() {
        return optype;
    }

    /**
    * 设置-指令类型
    * @paramType java.lang.String
    * @param optype - 指令类型
     */
    public void setOptype(String optype) {
        this.optype = optype;
    }

    /**
    * 获取-接口服务方返回码
    * @return rtncode
     */
    public String getRtncode() {
        return rtncode;
    }

    /**
    * 设置-接口服务方返回码
    * @paramType java.lang.String
    * @param rtncode - 接口服务方返回码
     */
    public void setRtncode(String rtncode) {
        this.rtncode = rtncode;
    }

    /**
    * 获取-接口服务方返回描述
    * @return rtnmsg
     */
    public String getRtnmsg() {
        return rtnmsg;
    }

    /**
    * 设置-接口服务方返回描述
    * @paramType java.lang.String
    * @param rtnmsg - 接口服务方返回描述
     */
    public void setRtnmsg(String rtnmsg) {
        this.rtnmsg = rtnmsg;
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
    * 获取-最后操作日期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作日期
    * @paramType java.util.Date
    * @param lastopdate - 最后操作日期
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-HIBERNATE版本号
    * @return hibernateversion
     */
    public Short getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATE版本号
    * @paramType java.lang.Short
    * @param hibernateversion - HIBERNATE版本号
     */
    public void setHibernateversion(Short hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
    * @paramType java.lang.String
    * @param modifydesc - 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-批次号
    * @return batchid
     */
    public BigDecimal getBatchid() {
        return batchid;
    }

    /**
    * 设置-批次号
    * @paramType java.math.BigDecimal
    * @param batchid - 批次号
     */
    public void setBatchid(BigDecimal batchid) {
        this.batchid = batchid;
    }
}