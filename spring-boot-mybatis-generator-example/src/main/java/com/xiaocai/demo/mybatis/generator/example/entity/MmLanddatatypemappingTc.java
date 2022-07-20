package com.xiaocai.demo.mybatis.generator.example.entity;

/**
 *  
 * @Table : mm_landdatatypemapping_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmLanddatatypemappingTc {
    /**
     * 业务流水-业务类型1
     */
    private String businessone;

    /**
     * 业务流水-业务类型2
     */
    private String businesstwo;

    /**
     * 共保代收处理方式  true 为只有F 司外共保代收 ，false 为F 司外共保代收 + G 应付司外共保代收
     */
    private String oldcoinsType;

    /**
     * 业务类型,1:保单,2:赔案,3:手续费,5:准备金
     */
    private String certitype;

    /**
     * policylist表的datatype
     */
    private String datatypeTi;

    /**
     * policylist表的datatype描述
     */
    private String datatypeTiDesc;

    /**
     * 共保场景时，最终客户相关数据的本字段对应共保人相关数据的ti表datatype
     */
    private String datatypeForcoinpay;

    /**
     * 接口表中的金额正负
     */
    private Integer signTi;

    /**
     * 保单起保期的标志,1为起保，0未起保, 不做区分时为空
     */
    private String ifstart;

    /**
     * 有无批单，有批单为TRUE，无批单为FALSE, 不做区分时为空
     */
    private String noEndorse;

    /**
     * 共保处理标志，默认为TRUE，TRUE表示和最终客户结算，FALSE表示和共保人结算
     */
    private String coinpay;

    /**
     * 映射到policy_td的数据类型
     */
    private String businessattrPolicy;

    /**
     * 保单表的数据类型
     */
    private String datatypePolicy;

    /**
     * 保单表的数据类型描述
     */
    private String datatypePolicyDesc;

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
    private Integer signReversePayable;

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
     * 业务流水-业务类型1描述
     */
    private String businessoneDesc;

    /**
     * 业务流水-业务类型1描述
     */
    private String businesstwoDesc;

    /**
     * 插入业务流水表时，金额正负是否反转，-1反转，1不反转
     */
    private Integer signReversePolcyevents;

    /**
     * 1表示代扣税费，2表示应付税费。代扣税费记录要生成2条代付款表记录，1条代扣税费（扣减应付佣金），1条为应付税费（给税务局）
     */
    private String ifTaxforapplyfee;

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
    * 获取-共保代收处理方式  true 为只有F 司外共保代收 ，false 为F 司外共保代收 + G 应付司外共保代收
    * @return oldcoinsType
     */
    public String getOldcoinsType() {
        return oldcoinsType;
    }

    /**
    * 设置-共保代收处理方式  true 为只有F 司外共保代收 ，false 为F 司外共保代收 + G 应付司外共保代收
    * @paramType java.lang.String
    * @param oldcoinsType - 共保代收处理方式  true 为只有F 司外共保代收 ，false 为F 司外共保代收 + G 应付司外共保代收
     */
    public void setOldcoinsType(String oldcoinsType) {
        this.oldcoinsType = oldcoinsType;
    }

    /**
    * 获取-业务类型,1:保单,2:赔案,3:手续费,5:准备金
    * @return certitype
     */
    public String getCertitype() {
        return certitype;
    }

    /**
    * 设置-业务类型,1:保单,2:赔案,3:手续费,5:准备金
    * @paramType java.lang.String
    * @param certitype - 业务类型,1:保单,2:赔案,3:手续费,5:准备金
     */
    public void setCertitype(String certitype) {
        this.certitype = certitype;
    }

    /**
    * 获取-policylist表的datatype
    * @return datatypeTi
     */
    public String getDatatypeTi() {
        return datatypeTi;
    }

    /**
    * 设置-policylist表的datatype
    * @paramType java.lang.String
    * @param datatypeTi - policylist表的datatype
     */
    public void setDatatypeTi(String datatypeTi) {
        this.datatypeTi = datatypeTi;
    }

    /**
    * 获取-policylist表的datatype描述
    * @return datatypeTiDesc
     */
    public String getDatatypeTiDesc() {
        return datatypeTiDesc;
    }

    /**
    * 设置-policylist表的datatype描述
    * @paramType java.lang.String
    * @param datatypeTiDesc - policylist表的datatype描述
     */
    public void setDatatypeTiDesc(String datatypeTiDesc) {
        this.datatypeTiDesc = datatypeTiDesc;
    }

    /**
    * 获取-共保场景时，最终客户相关数据的本字段对应共保人相关数据的ti表datatype
    * @return datatypeForcoinpay
     */
    public String getDatatypeForcoinpay() {
        return datatypeForcoinpay;
    }

    /**
    * 设置-共保场景时，最终客户相关数据的本字段对应共保人相关数据的ti表datatype
    * @paramType java.lang.String
    * @param datatypeForcoinpay - 共保场景时，最终客户相关数据的本字段对应共保人相关数据的ti表datatype
     */
    public void setDatatypeForcoinpay(String datatypeForcoinpay) {
        this.datatypeForcoinpay = datatypeForcoinpay;
    }

    /**
    * 获取-接口表中的金额正负
    * @return signTi
     */
    public Integer getSignTi() {
        return signTi;
    }

    /**
    * 设置-接口表中的金额正负
    * @paramType java.lang.Integer
    * @param signTi - 接口表中的金额正负
     */
    public void setSignTi(Integer signTi) {
        this.signTi = signTi;
    }

    /**
    * 获取-保单起保期的标志,1为起保，0未起保, 不做区分时为空
    * @return ifstart
     */
    public String getIfstart() {
        return ifstart;
    }

    /**
    * 设置-保单起保期的标志,1为起保，0未起保, 不做区分时为空
    * @paramType java.lang.String
    * @param ifstart - 保单起保期的标志,1为起保，0未起保, 不做区分时为空
     */
    public void setIfstart(String ifstart) {
        this.ifstart = ifstart;
    }

    /**
    * 获取-有无批单，有批单为TRUE，无批单为FALSE, 不做区分时为空
    * @return noEndorse
     */
    public String getNoEndorse() {
        return noEndorse;
    }

    /**
    * 设置-有无批单，有批单为TRUE，无批单为FALSE, 不做区分时为空
    * @paramType java.lang.String
    * @param noEndorse - 有无批单，有批单为TRUE，无批单为FALSE, 不做区分时为空
     */
    public void setNoEndorse(String noEndorse) {
        this.noEndorse = noEndorse;
    }

    /**
    * 获取-共保处理标志，默认为TRUE，TRUE表示和最终客户结算，FALSE表示和共保人结算
    * @return coinpay
     */
    public String getCoinpay() {
        return coinpay;
    }

    /**
    * 设置-共保处理标志，默认为TRUE，TRUE表示和最终客户结算，FALSE表示和共保人结算
    * @paramType java.lang.String
    * @param coinpay - 共保处理标志，默认为TRUE，TRUE表示和最终客户结算，FALSE表示和共保人结算
     */
    public void setCoinpay(String coinpay) {
        this.coinpay = coinpay;
    }

    /**
    * 获取-映射到policy_td的数据类型
    * @return businessattrPolicy
     */
    public String getBusinessattrPolicy() {
        return businessattrPolicy;
    }

    /**
    * 设置-映射到policy_td的数据类型
    * @paramType java.lang.String
    * @param businessattrPolicy - 映射到policy_td的数据类型
     */
    public void setBusinessattrPolicy(String businessattrPolicy) {
        this.businessattrPolicy = businessattrPolicy;
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
    * 获取-保单表的数据类型描述
    * @return datatypePolicyDesc
     */
    public String getDatatypePolicyDesc() {
        return datatypePolicyDesc;
    }

    /**
    * 设置-保单表的数据类型描述
    * @paramType java.lang.String
    * @param datatypePolicyDesc - 保单表的数据类型描述
     */
    public void setDatatypePolicyDesc(String datatypePolicyDesc) {
        this.datatypePolicyDesc = datatypePolicyDesc;
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
    public Integer getSignReversePayable() {
        return signReversePayable;
    }

    /**
    * 设置-插入代付款表时，金额正负是否反转，-1反转，1不反转
    * @paramType java.lang.Integer
    * @param signReversePayable - 插入代付款表时，金额正负是否反转，-1反转，1不反转
     */
    public void setSignReversePayable(Integer signReversePayable) {
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
    public Integer getSignReversePolcyevents() {
        return signReversePolcyevents;
    }

    /**
    * 设置-插入业务流水表时，金额正负是否反转，-1反转，1不反转
    * @paramType java.lang.Integer
    * @param signReversePolcyevents - 插入业务流水表时，金额正负是否反转，-1反转，1不反转
     */
    public void setSignReversePolcyevents(Integer signReversePolcyevents) {
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