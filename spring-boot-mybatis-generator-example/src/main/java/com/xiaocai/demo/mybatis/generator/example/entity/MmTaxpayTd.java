package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_taxpay_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTaxpayTd {
    /**
     * 主键ID
     */
    private Long payid;

    /**
     * 确认时间起期
     */
    private Date startDate;

    /**
     * 确认时间止期
     */
    private Date endDate;

    /**
     * 操作员代码
     */
    private String opcode;

    /**
     * 请求类型:31日对账，月对账 ； 32 汇总完税凭证；33 生成缴款书 ；38汇总结果查询
     */
    private String requestType;

    /**
     * 返回类型代码: 00：初始状态；0： 失败； 1：成功；2：处理中，22已对账
     */
    private String responseCode;

    /**
     * 对账结果:0：账不平；1：账平,2:分公司确认账平
     */
    private String checkresult;

    /**
     * 总笔数
     */
    private String totalNo;

    /**
     * 汇总金额
     */
    private BigDecimal totalTaxamount;

    /**
     * 页长
     */
    private String pageLength;

    /**
     * 页码
     */
    private String pageNumber;

    /**
     * 类型 1：日对账； 2：月对账；3：汇总完税凭证；4：生成缴款书 5:汇总结果查询
     */
    private String type;

    /**
     * 申报序号
     */
    private String declareNo;

    /**
     * 申报编号
     */
    private String declareSequence;

    /**
     * 错误描述
     */
    private String errorMessage;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 对账完成时间
     */
    private Date finishdate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 时间戳
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 手工标识
     */
    private String modifydesc;

    /**
     * 错误信息
     */
    private String errmsg;

    /**
    * 获取-主键ID
    * @return payid
     */
    public Long getPayid() {
        return payid;
    }

    /**
    * 设置-主键ID
    * @paramType java.lang.Long
    * @param payid - 主键ID
     */
    public void setPayid(Long payid) {
        this.payid = payid;
    }

    /**
    * 获取-确认时间起期
    * @return startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
    * 设置-确认时间起期
    * @paramType java.util.Date
    * @param startDate - 确认时间起期
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
    * 获取-确认时间止期
    * @return endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
    * 设置-确认时间止期
    * @paramType java.util.Date
    * @param endDate - 确认时间止期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    /**
    * 获取-请求类型:31日对账，月对账 ； 32 汇总完税凭证；33 生成缴款书 ；38汇总结果查询
    * @return requestType
     */
    public String getRequestType() {
        return requestType;
    }

    /**
    * 设置-请求类型:31日对账，月对账 ； 32 汇总完税凭证；33 生成缴款书 ；38汇总结果查询
    * @paramType java.lang.String
    * @param requestType - 请求类型:31日对账，月对账 ； 32 汇总完税凭证；33 生成缴款书 ；38汇总结果查询
     */
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    /**
    * 获取-返回类型代码: 00：初始状态；0： 失败； 1：成功；2：处理中，22已对账
    * @return responseCode
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
    * 设置-返回类型代码: 00：初始状态；0： 失败； 1：成功；2：处理中，22已对账
    * @paramType java.lang.String
    * @param responseCode - 返回类型代码: 00：初始状态；0： 失败； 1：成功；2：处理中，22已对账
     */
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    /**
    * 获取-对账结果:0：账不平；1：账平,2:分公司确认账平
    * @return checkresult
     */
    public String getCheckresult() {
        return checkresult;
    }

    /**
    * 设置-对账结果:0：账不平；1：账平,2:分公司确认账平
    * @paramType java.lang.String
    * @param checkresult - 对账结果:0：账不平；1：账平,2:分公司确认账平
     */
    public void setCheckresult(String checkresult) {
        this.checkresult = checkresult;
    }

    /**
    * 获取-总笔数
    * @return totalNo
     */
    public String getTotalNo() {
        return totalNo;
    }

    /**
    * 设置-总笔数
    * @paramType java.lang.String
    * @param totalNo - 总笔数
     */
    public void setTotalNo(String totalNo) {
        this.totalNo = totalNo;
    }

    /**
    * 获取-汇总金额
    * @return totalTaxamount
     */
    public BigDecimal getTotalTaxamount() {
        return totalTaxamount;
    }

    /**
    * 设置-汇总金额
    * @paramType java.math.BigDecimal
    * @param totalTaxamount - 汇总金额
     */
    public void setTotalTaxamount(BigDecimal totalTaxamount) {
        this.totalTaxamount = totalTaxamount;
    }

    /**
    * 获取-页长
    * @return pageLength
     */
    public String getPageLength() {
        return pageLength;
    }

    /**
    * 设置-页长
    * @paramType java.lang.String
    * @param pageLength - 页长
     */
    public void setPageLength(String pageLength) {
        this.pageLength = pageLength;
    }

    /**
    * 获取-页码
    * @return pageNumber
     */
    public String getPageNumber() {
        return pageNumber;
    }

    /**
    * 设置-页码
    * @paramType java.lang.String
    * @param pageNumber - 页码
     */
    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
    * 获取-类型 1：日对账； 2：月对账；3：汇总完税凭证；4：生成缴款书 5:汇总结果查询
    * @return type
     */
    public String getType() {
        return type;
    }

    /**
    * 设置-类型 1：日对账； 2：月对账；3：汇总完税凭证；4：生成缴款书 5:汇总结果查询
    * @paramType java.lang.String
    * @param type - 类型 1：日对账； 2：月对账；3：汇总完税凭证；4：生成缴款书 5:汇总结果查询
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
    * 获取-申报序号
    * @return declareNo
     */
    public String getDeclareNo() {
        return declareNo;
    }

    /**
    * 设置-申报序号
    * @paramType java.lang.String
    * @param declareNo - 申报序号
     */
    public void setDeclareNo(String declareNo) {
        this.declareNo = declareNo;
    }

    /**
    * 获取-申报编号
    * @return declareSequence
     */
    public String getDeclareSequence() {
        return declareSequence;
    }

    /**
    * 设置-申报编号
    * @paramType java.lang.String
    * @param declareSequence - 申报编号
     */
    public void setDeclareSequence(String declareSequence) {
        this.declareSequence = declareSequence;
    }

    /**
    * 获取-错误描述
    * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
    * 设置-错误描述
    * @paramType java.lang.String
    * @param errorMessage - 错误描述
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
    * 获取-对账完成时间
    * @return finishdate
     */
    public Date getFinishdate() {
        return finishdate;
    }

    /**
    * 设置-对账完成时间
    * @paramType java.util.Date
    * @param finishdate - 对账完成时间
     */
    public void setFinishdate(Date finishdate) {
        this.finishdate = finishdate;
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
    * 获取-时间戳
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-时间戳
    * @paramType java.util.Date
    * @param lastopdate - 时间戳
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
    * 获取-手工标识
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工标识
    * @paramType java.lang.String
    * @param modifydesc - 手工标识
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-错误信息
    * @return errmsg
     */
    public String getErrmsg() {
        return errmsg;
    }

    /**
    * 设置-错误信息
    * @paramType java.lang.String
    * @param errmsg - 错误信息
     */
    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}