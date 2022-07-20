package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;

/**
 *  
 * @Table : mm_data_report
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmDataReport {
    /**
     * 机构代码
     */
    private Long subDeptCde;

    /**
     * 指标序号
     */
    private Long cItemNo;

    /**
     * 指标值
     */
    private BigDecimal cValue;

    /**
     * 指标名称
     */
    private String cItemNme;

    /**
     * 指标时间 如：201410
     */
    private String cTm;

    /**
     * 报送频度 1.快报 2.月报  3.季报  4.半年报  5.年报  6. 年度结算
     */
    private String cFrequency;

    /**
     * 指标渠道 1.核心  2.财务  3.收付
     */
    private String cChannel;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 响应信息
     */
    private String errormsg;

    /**
    * 获取-机构代码
    * @return subDeptCde
     */
    public Long getSubDeptCde() {
        return subDeptCde;
    }

    /**
    * 设置-机构代码
    * @paramType java.lang.Long
    * @param subDeptCde - 机构代码
     */
    public void setSubDeptCde(Long subDeptCde) {
        this.subDeptCde = subDeptCde;
    }

    /**
    * 获取-指标序号
    * @return cItemNo
     */
    public Long getcItemNo() {
        return cItemNo;
    }

    /**
    * 设置-指标序号
    * @paramType java.lang.Long
    * @param cItemNo - 指标序号
     */
    public void setcItemNo(Long cItemNo) {
        this.cItemNo = cItemNo;
    }

    /**
    * 获取-指标值
    * @return cValue
     */
    public BigDecimal getcValue() {
        return cValue;
    }

    /**
    * 设置-指标值
    * @paramType java.math.BigDecimal
    * @param cValue - 指标值
     */
    public void setcValue(BigDecimal cValue) {
        this.cValue = cValue;
    }

    /**
    * 获取-指标名称
    * @return cItemNme
     */
    public String getcItemNme() {
        return cItemNme;
    }

    /**
    * 设置-指标名称
    * @paramType java.lang.String
    * @param cItemNme - 指标名称
     */
    public void setcItemNme(String cItemNme) {
        this.cItemNme = cItemNme;
    }

    /**
    * 获取-指标时间 如：201410
    * @return cTm
     */
    public String getcTm() {
        return cTm;
    }

    /**
    * 设置-指标时间 如：201410
    * @paramType java.lang.String
    * @param cTm - 指标时间 如：201410
     */
    public void setcTm(String cTm) {
        this.cTm = cTm;
    }

    /**
    * 获取-报送频度 1.快报 2.月报  3.季报  4.半年报  5.年报  6. 年度结算
    * @return cFrequency
     */
    public String getcFrequency() {
        return cFrequency;
    }

    /**
    * 设置-报送频度 1.快报 2.月报  3.季报  4.半年报  5.年报  6. 年度结算
    * @paramType java.lang.String
    * @param cFrequency - 报送频度 1.快报 2.月报  3.季报  4.半年报  5.年报  6. 年度结算
     */
    public void setcFrequency(String cFrequency) {
        this.cFrequency = cFrequency;
    }

    /**
    * 获取-指标渠道 1.核心  2.财务  3.收付
    * @return cChannel
     */
    public String getcChannel() {
        return cChannel;
    }

    /**
    * 设置-指标渠道 1.核心  2.财务  3.收付
    * @paramType java.lang.String
    * @param cChannel - 指标渠道 1.核心  2.财务  3.收付
     */
    public void setcChannel(String cChannel) {
        this.cChannel = cChannel;
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
    * 获取-响应信息
    * @return errormsg
     */
    public String getErrormsg() {
        return errormsg;
    }

    /**
    * 设置-响应信息
    * @paramType java.lang.String
    * @param errormsg - 响应信息
     */
    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }
}