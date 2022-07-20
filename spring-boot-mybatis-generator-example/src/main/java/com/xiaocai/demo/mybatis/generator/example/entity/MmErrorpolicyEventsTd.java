package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_errorpolicy_events_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmErrorpolicyEventsTd {
    /**
     * 主键
     */
    private Long seqerror;

    /**
     * 对应记录的流水号
     */
    private String listno;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * LISTNO对应记录的POLICYNO
     */
    private String policyno;

    /**
     * LISTNO对应记录的ENDORSENO
     */
    private String endorseno;

    /**
     * LISTNO对应记录的CLAIMNO
     */
    private String claimno;

    /**
     * LISTNO对应记录的RETURNNO
     */
    private String returnno;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 录入时间
     */
    private Date timestamp;

    /**
     * 记录插入的原因
     */
    private String remarks;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
    * 获取-主键
    * @return seqerror
     */
    public Long getSeqerror() {
        return seqerror;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param seqerror - 主键
     */
    public void setSeqerror(Long seqerror) {
        this.seqerror = seqerror;
    }

    /**
    * 获取-对应记录的流水号
    * @return listno
     */
    public String getListno() {
        return listno;
    }

    /**
    * 设置-对应记录的流水号
    * @paramType java.lang.String
    * @param listno - 对应记录的流水号
     */
    public void setListno(String listno) {
        this.listno = listno;
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
    * 获取-LISTNO对应记录的POLICYNO
    * @return policyno
     */
    public String getPolicyno() {
        return policyno;
    }

    /**
    * 设置-LISTNO对应记录的POLICYNO
    * @paramType java.lang.String
    * @param policyno - LISTNO对应记录的POLICYNO
     */
    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    /**
    * 获取-LISTNO对应记录的ENDORSENO
    * @return endorseno
     */
    public String getEndorseno() {
        return endorseno;
    }

    /**
    * 设置-LISTNO对应记录的ENDORSENO
    * @paramType java.lang.String
    * @param endorseno - LISTNO对应记录的ENDORSENO
     */
    public void setEndorseno(String endorseno) {
        this.endorseno = endorseno;
    }

    /**
    * 获取-LISTNO对应记录的CLAIMNO
    * @return claimno
     */
    public String getClaimno() {
        return claimno;
    }

    /**
    * 设置-LISTNO对应记录的CLAIMNO
    * @paramType java.lang.String
    * @param claimno - LISTNO对应记录的CLAIMNO
     */
    public void setClaimno(String claimno) {
        this.claimno = claimno;
    }

    /**
    * 获取-LISTNO对应记录的RETURNNO
    * @return returnno
     */
    public String getReturnno() {
        return returnno;
    }

    /**
    * 设置-LISTNO对应记录的RETURNNO
    * @paramType java.lang.String
    * @param returnno - LISTNO对应记录的RETURNNO
     */
    public void setReturnno(String returnno) {
        this.returnno = returnno;
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
    * 获取-录入时间
    * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
    * 设置-录入时间
    * @paramType java.util.Date
    * @param timestamp - 录入时间
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
    * 获取-记录插入的原因
    * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
    * 设置-记录插入的原因
    * @paramType java.lang.String
    * @param remarks - 记录插入的原因
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
}