package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;

/**
 *  
 * @Table : mm_land_condition_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmLandConditionTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 业务类型,1:保单,2:赔案,3:手续费,5:准备金
     */
    private String certitype;

    /**
     * policylist表的datatype
     */
    private String datatype;

    /**
     * 默认为空，只有特殊类型的批改才需要本子段，需要包： 03 批改投保人、 04 批改被保人、 05 约定汇率约定币种或约定金额调整、 55 差错调整（系统外处理） 01保单， 02批增， 06披减， 07批退 
     */
    private String endorsetype;

    /**
     * 接口表中的金额正负
     */
    private BigDecimal signTi;

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
     * 共保代收处理方式  true 为只有F 司外共保代收 ，false 为F 司外共保代收 + G 应付司外共保代收
     */
    private String oldcoinsType;

    /**
     * 类别 Y:溢额/成数、 S:溢额、　Q:成数、 C:超赔、T:比例
     */
    private String qstype;

    /**
     * 分保类型:1法定，2合同，4临分
     */
    private String contracttype;

    /**
     * 分入分出 0：分出 1：分入
     */
    private String opttype;

    /**
     * 账单：0实际账单，1预估账单，2冲销预估账单; 保单：0普通保单(小保单),1预约协议(大保单)
     */
    private String protocolflag;

    /**
     * 摘要
     */
    private String descriptions;

    /**
     * 保单：0普通保单(小保单),1预约协议(大保单)
     */
    private String totalprotocolflag;

    /**
     * 是否价税分离 0 否 1 是 2进项税转出
     */
    private String isVat;

    /**
     * "0 - 国内 1 - 国外"
     */
    private String countryarea;

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
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-policylist表的datatype
    * @paramType java.lang.String
    * @param datatype - policylist表的datatype
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    /**
    * 获取-默认为空，只有特殊类型的批改才需要本子段，需要包：
03 批改投保人、
04 批改被保人、
05 约定汇率约定币种或约定金额调整、
55 差错调整（系统外处理）
01保单，
02批增，
06披减，
07批退

    * @return endorsetype
     */
    public String getEndorsetype() {
        return endorsetype;
    }

    /**
    * 设置-默认为空，只有特殊类型的批改才需要本子段，需要包：
03 批改投保人、
04 批改被保人、
05 约定汇率约定币种或约定金额调整、
55 差错调整（系统外处理）
01保单，
02批增，
06披减，
07批退

    * @paramType java.lang.String
    * @param endorsetype - 默认为空，只有特殊类型的批改才需要本子段，需要包：
03 批改投保人、
04 批改被保人、
05 约定汇率约定币种或约定金额调整、
55 差错调整（系统外处理）
01保单，
02批增，
06披减，
07批退

     */
    public void setEndorsetype(String endorsetype) {
        this.endorsetype = endorsetype;
    }

    /**
    * 获取-接口表中的金额正负
    * @return signTi
     */
    public BigDecimal getSignTi() {
        return signTi;
    }

    /**
    * 设置-接口表中的金额正负
    * @paramType java.math.BigDecimal
    * @param signTi - 接口表中的金额正负
     */
    public void setSignTi(BigDecimal signTi) {
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
    * 获取-类别 Y:溢额/成数、 S:溢额、　Q:成数、 C:超赔、T:比例
    * @return qstype
     */
    public String getQstype() {
        return qstype;
    }

    /**
    * 设置-类别 Y:溢额/成数、 S:溢额、　Q:成数、 C:超赔、T:比例
    * @paramType java.lang.String
    * @param qstype - 类别 Y:溢额/成数、 S:溢额、　Q:成数、 C:超赔、T:比例
     */
    public void setQstype(String qstype) {
        this.qstype = qstype;
    }

    /**
    * 获取-分保类型:1法定，2合同，4临分
    * @return contracttype
     */
    public String getContracttype() {
        return contracttype;
    }

    /**
    * 设置-分保类型:1法定，2合同，4临分
    * @paramType java.lang.String
    * @param contracttype - 分保类型:1法定，2合同，4临分
     */
    public void setContracttype(String contracttype) {
        this.contracttype = contracttype;
    }

    /**
    * 获取-分入分出 0：分出 1：分入
    * @return opttype
     */
    public String getOpttype() {
        return opttype;
    }

    /**
    * 设置-分入分出 0：分出 1：分入
    * @paramType java.lang.String
    * @param opttype - 分入分出 0：分出 1：分入
     */
    public void setOpttype(String opttype) {
        this.opttype = opttype;
    }

    /**
    * 获取-账单：0实际账单，1预估账单，2冲销预估账单; 保单：0普通保单(小保单),1预约协议(大保单)
    * @return protocolflag
     */
    public String getProtocolflag() {
        return protocolflag;
    }

    /**
    * 设置-账单：0实际账单，1预估账单，2冲销预估账单; 保单：0普通保单(小保单),1预约协议(大保单)
    * @paramType java.lang.String
    * @param protocolflag - 账单：0实际账单，1预估账单，2冲销预估账单; 保单：0普通保单(小保单),1预约协议(大保单)
     */
    public void setProtocolflag(String protocolflag) {
        this.protocolflag = protocolflag;
    }

    /**
    * 获取-摘要
    * @return descriptions
     */
    public String getDescriptions() {
        return descriptions;
    }

    /**
    * 设置-摘要
    * @paramType java.lang.String
    * @param descriptions - 摘要
     */
    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    /**
    * 获取-保单：0普通保单(小保单),1预约协议(大保单)
    * @return totalprotocolflag
     */
    public String getTotalprotocolflag() {
        return totalprotocolflag;
    }

    /**
    * 设置-保单：0普通保单(小保单),1预约协议(大保单)
    * @paramType java.lang.String
    * @param totalprotocolflag - 保单：0普通保单(小保单),1预约协议(大保单)
     */
    public void setTotalprotocolflag(String totalprotocolflag) {
        this.totalprotocolflag = totalprotocolflag;
    }

    /**
    * 获取-是否价税分离 0 否 1 是 2进项税转出
    * @return isVat
     */
    public String getIsVat() {
        return isVat;
    }

    /**
    * 设置-是否价税分离 0 否 1 是 2进项税转出
    * @paramType java.lang.String
    * @param isVat - 是否价税分离 0 否 1 是 2进项税转出
     */
    public void setIsVat(String isVat) {
        this.isVat = isVat;
    }

    /**
    * 获取-"0 - 国内 1 - 国外"
    * @return countryarea
     */
    public String getCountryarea() {
        return countryarea;
    }

    /**
    * 设置-"0 - 国内 1 - 国外"
    * @paramType java.lang.String
    * @param countryarea - "0 - 国内 1 - 国外"
     */
    public void setCountryarea(String countryarea) {
        this.countryarea = countryarea;
    }
}