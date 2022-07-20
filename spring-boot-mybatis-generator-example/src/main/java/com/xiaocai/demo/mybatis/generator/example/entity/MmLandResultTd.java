package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;

/**
 *  
 * @Table : mm_land_result_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmLandResultTd {
    /**
     * 主键
     */
    private Long seqland;

    /**
     * 联共保表的数据类型
     */
    private String datatypeForcoinpay;

    /**
     * 保单表的数据类型
     */
    private String datatypePolicy;

    /**
     * 赔款表的数据类型
     */
    private String claimtype;

    /**
     * 赔款表的数据类型描述
     */
    private String feetype;

    /**
     * 映射到代付款的数据类型
     */
    private String businessattrPayable;

    /**
     * 插入代付款表时，金额正负是否反转，-1反转，1不反转
     */
    private BigDecimal signReversePayable;

    /**
     * 代付款表的PAYTYPE，是对应DATATYPE的大类。对于付款： 1=赔款、2=退保、3=退储、4=储金返还、5=其他应付款、 6=手续费
     */
    private String paytype;

    /**
     * paytype描述
     */
    private String paytypeDesc;

    /**
     * 业务类型，对应代付款表的datatype
     */
    private String datatypePayable;

    /**
     * 业务类型描述
     */
    private String datatypePayableDesc;

    /**
     * 业务流水-业务类型1
     */
    private String businessone;

    /**
     * 业务流水-业务类型1描述
     */
    private String businessoneDesc;

    /**
     * 业务流水-业务类型2
     */
    private String businesstwo;

    /**
     * 业务流水-业务类型1描述
     */
    private String businesstwoDesc;

    /**
     * 插入业务流水表时，金额正负是否反转，-1反转，1不反转
     */
    private BigDecimal signReversePolcyevents;

    /**
     * 1表示代扣税费，2表示应付税费。代扣税费记录要生成2条代付款表记录，1条代扣税费（扣减应付佣金），1条为应付税费（给税务局）
     */
    private String ifTaxforapplyfee;

    /**
    * 获取-主键
    * @return seqland
     */
    public Long getSeqland() {
        return seqland;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param seqland - 主键
     */
    public void setSeqland(Long seqland) {
        this.seqland = seqland;
    }

    /**
    * 获取-联共保表的数据类型
    * @return datatypeForcoinpay
     */
    public String getDatatypeForcoinpay() {
        return datatypeForcoinpay;
    }

    /**
    * 设置-联共保表的数据类型
    * @paramType java.lang.String
    * @param datatypeForcoinpay - 联共保表的数据类型
     */
    public void setDatatypeForcoinpay(String datatypeForcoinpay) {
        this.datatypeForcoinpay = datatypeForcoinpay;
    }

    /**
    * 获取-保单表的数据类型
    * @return datatypePolicy
     */
    public String getDatatypePolicy() {
        return datatypePolicy;
    }

    /**
    * 设置-保单表的数据类型
    * @paramType java.lang.String
    * @param datatypePolicy - 保单表的数据类型
     */
    public void setDatatypePolicy(String datatypePolicy) {
        this.datatypePolicy = datatypePolicy;
    }

    /**
    * 获取-赔款表的数据类型
    * @return claimtype
     */
    public String getClaimtype() {
        return claimtype;
    }

    /**
    * 设置-赔款表的数据类型
    * @paramType java.lang.String
    * @param claimtype - 赔款表的数据类型
     */
    public void setClaimtype(String claimtype) {
        this.claimtype = claimtype;
    }

    /**
    * 获取-赔款表的数据类型描述
    * @return feetype
     */
    public String getFeetype() {
        return feetype;
    }

    /**
    * 设置-赔款表的数据类型描述
    * @paramType java.lang.String
    * @param feetype - 赔款表的数据类型描述
     */
    public void setFeetype(String feetype) {
        this.feetype = feetype;
    }

    /**
    * 获取-映射到代付款的数据类型
    * @return businessattrPayable
     */
    public String getBusinessattrPayable() {
        return businessattrPayable;
    }

    /**
    * 设置-映射到代付款的数据类型
    * @paramType java.lang.String
    * @param businessattrPayable - 映射到代付款的数据类型
     */
    public void setBusinessattrPayable(String businessattrPayable) {
        this.businessattrPayable = businessattrPayable;
    }

    /**
    * 获取-插入代付款表时，金额正负是否反转，-1反转，1不反转
    * @return signReversePayable
     */
    public BigDecimal getSignReversePayable() {
        return signReversePayable;
    }

    /**
    * 设置-插入代付款表时，金额正负是否反转，-1反转，1不反转
    * @paramType java.math.BigDecimal
    * @param signReversePayable - 插入代付款表时，金额正负是否反转，-1反转，1不反转
     */
    public void setSignReversePayable(BigDecimal signReversePayable) {
        this.signReversePayable = signReversePayable;
    }

    /**
    * 获取-代付款表的PAYTYPE，是对应DATATYPE的大类。对于付款： 1=赔款、2=退保、3=退储、4=储金返还、5=其他应付款、 6=手续费
    * @return paytype
     */
    public String getPaytype() {
        return paytype;
    }

    /**
    * 设置-代付款表的PAYTYPE，是对应DATATYPE的大类。对于付款： 1=赔款、2=退保、3=退储、4=储金返还、5=其他应付款、 6=手续费
    * @paramType java.lang.String
    * @param paytype - 代付款表的PAYTYPE，是对应DATATYPE的大类。对于付款： 1=赔款、2=退保、3=退储、4=储金返还、5=其他应付款、 6=手续费
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    /**
    * 获取-paytype描述
    * @return paytypeDesc
     */
    public String getPaytypeDesc() {
        return paytypeDesc;
    }

    /**
    * 设置-paytype描述
    * @paramType java.lang.String
    * @param paytypeDesc - paytype描述
     */
    public void setPaytypeDesc(String paytypeDesc) {
        this.paytypeDesc = paytypeDesc;
    }

    /**
    * 获取-业务类型，对应代付款表的datatype
    * @return datatypePayable
     */
    public String getDatatypePayable() {
        return datatypePayable;
    }

    /**
    * 设置-业务类型，对应代付款表的datatype
    * @paramType java.lang.String
    * @param datatypePayable - 业务类型，对应代付款表的datatype
     */
    public void setDatatypePayable(String datatypePayable) {
        this.datatypePayable = datatypePayable;
    }

    /**
    * 获取-业务类型描述
    * @return datatypePayableDesc
     */
    public String getDatatypePayableDesc() {
        return datatypePayableDesc;
    }

    /**
    * 设置-业务类型描述
    * @paramType java.lang.String
    * @param datatypePayableDesc - 业务类型描述
     */
    public void setDatatypePayableDesc(String datatypePayableDesc) {
        this.datatypePayableDesc = datatypePayableDesc;
    }

    /**
    * 获取-业务流水-业务类型1
    * @return businessone
     */
    public String getBusinessone() {
        return businessone;
    }

    /**
    * 设置-业务流水-业务类型1
    * @paramType java.lang.String
    * @param businessone - 业务流水-业务类型1
     */
    public void setBusinessone(String businessone) {
        this.businessone = businessone;
    }

    /**
    * 获取-业务流水-业务类型1描述
    * @return businessoneDesc
     */
    public String getBusinessoneDesc() {
        return businessoneDesc;
    }

    /**
    * 设置-业务流水-业务类型1描述
    * @paramType java.lang.String
    * @param businessoneDesc - 业务流水-业务类型1描述
     */
    public void setBusinessoneDesc(String businessoneDesc) {
        this.businessoneDesc = businessoneDesc;
    }

    /**
    * 获取-业务流水-业务类型2
    * @return businesstwo
     */
    public String getBusinesstwo() {
        return businesstwo;
    }

    /**
    * 设置-业务流水-业务类型2
    * @paramType java.lang.String
    * @param businesstwo - 业务流水-业务类型2
     */
    public void setBusinesstwo(String businesstwo) {
        this.businesstwo = businesstwo;
    }

    /**
    * 获取-业务流水-业务类型1描述
    * @return businesstwoDesc
     */
    public String getBusinesstwoDesc() {
        return businesstwoDesc;
    }

    /**
    * 设置-业务流水-业务类型1描述
    * @paramType java.lang.String
    * @param businesstwoDesc - 业务流水-业务类型1描述
     */
    public void setBusinesstwoDesc(String businesstwoDesc) {
        this.businesstwoDesc = businesstwoDesc;
    }

    /**
    * 获取-插入业务流水表时，金额正负是否反转，-1反转，1不反转
    * @return signReversePolcyevents
     */
    public BigDecimal getSignReversePolcyevents() {
        return signReversePolcyevents;
    }

    /**
    * 设置-插入业务流水表时，金额正负是否反转，-1反转，1不反转
    * @paramType java.math.BigDecimal
    * @param signReversePolcyevents - 插入业务流水表时，金额正负是否反转，-1反转，1不反转
     */
    public void setSignReversePolcyevents(BigDecimal signReversePolcyevents) {
        this.signReversePolcyevents = signReversePolcyevents;
    }

    /**
    * 获取-1表示代扣税费，2表示应付税费。代扣税费记录要生成2条代付款表记录，1条代扣税费（扣减应付佣金），1条为应付税费（给税务局）
    * @return ifTaxforapplyfee
     */
    public String getIfTaxforapplyfee() {
        return ifTaxforapplyfee;
    }

    /**
    * 设置-1表示代扣税费，2表示应付税费。代扣税费记录要生成2条代付款表记录，1条代扣税费（扣减应付佣金），1条为应付税费（给税务局）
    * @paramType java.lang.String
    * @param ifTaxforapplyfee - 1表示代扣税费，2表示应付税费。代扣税费记录要生成2条代付款表记录，1条代扣税费（扣减应付佣金），1条为应付税费（给税务局）
     */
    public void setIfTaxforapplyfee(String ifTaxforapplyfee) {
        this.ifTaxforapplyfee = ifTaxforapplyfee;
    }
}