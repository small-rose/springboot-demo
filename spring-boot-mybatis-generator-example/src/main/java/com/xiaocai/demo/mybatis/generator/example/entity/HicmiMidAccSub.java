package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;

/**
 *  
 * @Table : hicmi_mid_acc_sub
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class HicmiMidAccSub {
    /**
     * 主键
     */
    private Long id;

    /**
     * 主表主键
     */
    private Long mainId;

    /**
     * 流水号
     */
    private String trdnm;

    /**
     * 外系统该凭证下分录数据唯一标识
     */
    private String detail;

    /**
     * 分录号
     */
    private Integer detailindex;

    /**
     * 凭证号
     */
    private String voucherno;

    /**
     * 年月
     */
    private String yearmonth;

    /**
     * 批次号
     */
    private String batchno;

    /**
     * 摘要
     */
    private String explanation;

    /**
     * 原币借方金额
     */
    private BigDecimal debitamount;

    /**
     * 本币借方金额
     */
    private BigDecimal localdebitamount;

    /**
     * 币种编码
     */
    private String pkCurrtype;

    /**
     * 科目编码
     */
    private String pkAccasoa;

    /**
     * 原币贷方金额
     */
    private BigDecimal creditamount;

    /**
     * 本币贷方金额
     */
    private BigDecimal localcreditamount;

    /**
     * 辅助核算1
     */
    private String freevalue1;

    /**
     * 辅助核算2
     */
    private String freevalue2;

    /**
     * 辅助核算3
     */
    private String freevalue3;

    /**
     * 辅助核算4
     */
    private String freevalue4;

    /**
     * 辅助核算5
     */
    private String freevalue5;

    /**
     * 辅助核算6
     */
    private String freevalue6;

    /**
     * 辅助核算7
     */
    private String freevalue7;

    /**
     * 辅助核算8
     */
    private String freevalue8;

    /**
     * 辅助核算9
     */
    private String freevalue9;

    /**
     * 辅助核算10
     */
    private String freevalue10;

    /**
     * EXCRATE1
     */
    private BigDecimal excrate1;

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
    * 获取-主表主键
    * @return mainId
     */
    public Long getMainId() {
        return mainId;
    }

    /**
    * 设置-主表主键
    * @paramType java.lang.Long
    * @param mainId - 主表主键
     */
    public void setMainId(Long mainId) {
        this.mainId = mainId;
    }

    /**
    * 获取-流水号
    * @return trdnm
     */
    public String getTrdnm() {
        return trdnm;
    }

    /**
    * 设置-流水号
    * @paramType java.lang.String
    * @param trdnm - 流水号
     */
    public void setTrdnm(String trdnm) {
        this.trdnm = trdnm;
    }

    /**
    * 获取-外系统该凭证下分录数据唯一标识
    * @return detail
     */
    public String getDetail() {
        return detail;
    }

    /**
    * 设置-外系统该凭证下分录数据唯一标识
    * @paramType java.lang.String
    * @param detail - 外系统该凭证下分录数据唯一标识
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
    * 获取-分录号
    * @return detailindex
     */
    public Integer getDetailindex() {
        return detailindex;
    }

    /**
    * 设置-分录号
    * @paramType java.lang.Integer
    * @param detailindex - 分录号
     */
    public void setDetailindex(Integer detailindex) {
        this.detailindex = detailindex;
    }

    /**
    * 获取-凭证号
    * @return voucherno
     */
    public String getVoucherno() {
        return voucherno;
    }

    /**
    * 设置-凭证号
    * @paramType java.lang.String
    * @param voucherno - 凭证号
     */
    public void setVoucherno(String voucherno) {
        this.voucherno = voucherno;
    }

    /**
    * 获取-年月
    * @return yearmonth
     */
    public String getYearmonth() {
        return yearmonth;
    }

    /**
    * 设置-年月
    * @paramType java.lang.String
    * @param yearmonth - 年月
     */
    public void setYearmonth(String yearmonth) {
        this.yearmonth = yearmonth;
    }

    /**
    * 获取-批次号
    * @return batchno
     */
    public String getBatchno() {
        return batchno;
    }

    /**
    * 设置-批次号
    * @paramType java.lang.String
    * @param batchno - 批次号
     */
    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    /**
    * 获取-摘要
    * @return explanation
     */
    public String getExplanation() {
        return explanation;
    }

    /**
    * 设置-摘要
    * @paramType java.lang.String
    * @param explanation - 摘要
     */
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    /**
    * 获取-原币借方金额
    * @return debitamount
     */
    public BigDecimal getDebitamount() {
        return debitamount;
    }

    /**
    * 设置-原币借方金额
    * @paramType java.math.BigDecimal
    * @param debitamount - 原币借方金额
     */
    public void setDebitamount(BigDecimal debitamount) {
        this.debitamount = debitamount;
    }

    /**
    * 获取-本币借方金额
    * @return localdebitamount
     */
    public BigDecimal getLocaldebitamount() {
        return localdebitamount;
    }

    /**
    * 设置-本币借方金额
    * @paramType java.math.BigDecimal
    * @param localdebitamount - 本币借方金额
     */
    public void setLocaldebitamount(BigDecimal localdebitamount) {
        this.localdebitamount = localdebitamount;
    }

    /**
    * 获取-币种编码
    * @return pkCurrtype
     */
    public String getPkCurrtype() {
        return pkCurrtype;
    }

    /**
    * 设置-币种编码
    * @paramType java.lang.String
    * @param pkCurrtype - 币种编码
     */
    public void setPkCurrtype(String pkCurrtype) {
        this.pkCurrtype = pkCurrtype;
    }

    /**
    * 获取-科目编码
    * @return pkAccasoa
     */
    public String getPkAccasoa() {
        return pkAccasoa;
    }

    /**
    * 设置-科目编码
    * @paramType java.lang.String
    * @param pkAccasoa - 科目编码
     */
    public void setPkAccasoa(String pkAccasoa) {
        this.pkAccasoa = pkAccasoa;
    }

    /**
    * 获取-原币贷方金额
    * @return creditamount
     */
    public BigDecimal getCreditamount() {
        return creditamount;
    }

    /**
    * 设置-原币贷方金额
    * @paramType java.math.BigDecimal
    * @param creditamount - 原币贷方金额
     */
    public void setCreditamount(BigDecimal creditamount) {
        this.creditamount = creditamount;
    }

    /**
    * 获取-本币贷方金额
    * @return localcreditamount
     */
    public BigDecimal getLocalcreditamount() {
        return localcreditamount;
    }

    /**
    * 设置-本币贷方金额
    * @paramType java.math.BigDecimal
    * @param localcreditamount - 本币贷方金额
     */
    public void setLocalcreditamount(BigDecimal localcreditamount) {
        this.localcreditamount = localcreditamount;
    }

    /**
    * 获取-辅助核算1
    * @return freevalue1
     */
    public String getFreevalue1() {
        return freevalue1;
    }

    /**
    * 设置-辅助核算1
    * @paramType java.lang.String
    * @param freevalue1 - 辅助核算1
     */
    public void setFreevalue1(String freevalue1) {
        this.freevalue1 = freevalue1;
    }

    /**
    * 获取-辅助核算2
    * @return freevalue2
     */
    public String getFreevalue2() {
        return freevalue2;
    }

    /**
    * 设置-辅助核算2
    * @paramType java.lang.String
    * @param freevalue2 - 辅助核算2
     */
    public void setFreevalue2(String freevalue2) {
        this.freevalue2 = freevalue2;
    }

    /**
    * 获取-辅助核算3
    * @return freevalue3
     */
    public String getFreevalue3() {
        return freevalue3;
    }

    /**
    * 设置-辅助核算3
    * @paramType java.lang.String
    * @param freevalue3 - 辅助核算3
     */
    public void setFreevalue3(String freevalue3) {
        this.freevalue3 = freevalue3;
    }

    /**
    * 获取-辅助核算4
    * @return freevalue4
     */
    public String getFreevalue4() {
        return freevalue4;
    }

    /**
    * 设置-辅助核算4
    * @paramType java.lang.String
    * @param freevalue4 - 辅助核算4
     */
    public void setFreevalue4(String freevalue4) {
        this.freevalue4 = freevalue4;
    }

    /**
    * 获取-辅助核算5
    * @return freevalue5
     */
    public String getFreevalue5() {
        return freevalue5;
    }

    /**
    * 设置-辅助核算5
    * @paramType java.lang.String
    * @param freevalue5 - 辅助核算5
     */
    public void setFreevalue5(String freevalue5) {
        this.freevalue5 = freevalue5;
    }

    /**
    * 获取-辅助核算6
    * @return freevalue6
     */
    public String getFreevalue6() {
        return freevalue6;
    }

    /**
    * 设置-辅助核算6
    * @paramType java.lang.String
    * @param freevalue6 - 辅助核算6
     */
    public void setFreevalue6(String freevalue6) {
        this.freevalue6 = freevalue6;
    }

    /**
    * 获取-辅助核算7
    * @return freevalue7
     */
    public String getFreevalue7() {
        return freevalue7;
    }

    /**
    * 设置-辅助核算7
    * @paramType java.lang.String
    * @param freevalue7 - 辅助核算7
     */
    public void setFreevalue7(String freevalue7) {
        this.freevalue7 = freevalue7;
    }

    /**
    * 获取-辅助核算8
    * @return freevalue8
     */
    public String getFreevalue8() {
        return freevalue8;
    }

    /**
    * 设置-辅助核算8
    * @paramType java.lang.String
    * @param freevalue8 - 辅助核算8
     */
    public void setFreevalue8(String freevalue8) {
        this.freevalue8 = freevalue8;
    }

    /**
    * 获取-辅助核算9
    * @return freevalue9
     */
    public String getFreevalue9() {
        return freevalue9;
    }

    /**
    * 设置-辅助核算9
    * @paramType java.lang.String
    * @param freevalue9 - 辅助核算9
     */
    public void setFreevalue9(String freevalue9) {
        this.freevalue9 = freevalue9;
    }

    /**
    * 获取-辅助核算10
    * @return freevalue10
     */
    public String getFreevalue10() {
        return freevalue10;
    }

    /**
    * 设置-辅助核算10
    * @paramType java.lang.String
    * @param freevalue10 - 辅助核算10
     */
    public void setFreevalue10(String freevalue10) {
        this.freevalue10 = freevalue10;
    }

    /**
    * 获取-EXCRATE1
    * @return excrate1
     */
    public BigDecimal getExcrate1() {
        return excrate1;
    }

    /**
    * 设置-EXCRATE1
    * @paramType java.math.BigDecimal
    * @param excrate1 - EXCRATE1
     */
    public void setExcrate1(BigDecimal excrate1) {
        this.excrate1 = excrate1;
    }
}