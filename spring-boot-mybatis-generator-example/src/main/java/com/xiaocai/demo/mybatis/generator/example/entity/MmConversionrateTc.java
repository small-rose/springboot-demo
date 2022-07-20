package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_conversionrate_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmConversionrateTc {
    /**
     * 主键
     */
    private Long seqrate;

    /**
     * 被兑换货币币种代码
     */
    private String currencycode1;

    /**
     * 兑换货币币种代码
     */
    private String currencycode2;

    /**
     * 生效时间
     */
    private Date startdate;

    /**
     * 失效时间
     */
    private Date enddate;

    /**
     * 汇率
     */
    private BigDecimal exchangerate;

    /**
     * 操作员
     */
    private String opcode;

    /**
     * 记录日期
     */
    private Date recorddate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 币种1标识(被兑换货币)
     */
    private String currencysign1;

    /**
     * 币种1名称
     */
    private String currencyname1;

    /**
     * 币种2标识(兑换币种)
     */
    private String currencysign2;

    /**
     * 币种2名称
     */
    private String currencyname2;

    /**
     * 0=月计划汇率；1=日交易汇率
     */
    private String type;

    /**
     * 描述
     */
    private String description;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
    * 获取-主键
    * @return seqrate
     */
    public Long getSeqrate() {
        return seqrate;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param seqrate - 主键
     */
    public void setSeqrate(Long seqrate) {
        this.seqrate = seqrate;
    }

    /**
    * 获取-被兑换货币币种代码
    * @return currencycode1
     */
    public String getCurrencycode1() {
        return currencycode1;
    }

    /**
    * 设置-被兑换货币币种代码
    * @paramType java.lang.String
    * @param currencycode1 - 被兑换货币币种代码
     */
    public void setCurrencycode1(String currencycode1) {
        this.currencycode1 = currencycode1;
    }

    /**
    * 获取-兑换货币币种代码
    * @return currencycode2
     */
    public String getCurrencycode2() {
        return currencycode2;
    }

    /**
    * 设置-兑换货币币种代码
    * @paramType java.lang.String
    * @param currencycode2 - 兑换货币币种代码
     */
    public void setCurrencycode2(String currencycode2) {
        this.currencycode2 = currencycode2;
    }

    /**
    * 获取-生效时间
    * @return startdate
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
    * 设置-生效时间
    * @paramType java.util.Date
    * @param startdate - 生效时间
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
    * 获取-失效时间
    * @return enddate
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
    * 设置-失效时间
    * @paramType java.util.Date
    * @param enddate - 失效时间
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
    * 获取-汇率
    * @return exchangerate
     */
    public BigDecimal getExchangerate() {
        return exchangerate;
    }

    /**
    * 设置-汇率
    * @paramType java.math.BigDecimal
    * @param exchangerate - 汇率
     */
    public void setExchangerate(BigDecimal exchangerate) {
        this.exchangerate = exchangerate;
    }

    /**
    * 获取-操作员
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作员
    * @paramType java.lang.String
    * @param opcode - 操作员
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-记录日期
    * @return recorddate
     */
    public Date getRecorddate() {
        return recorddate;
    }

    /**
    * 设置-记录日期
    * @paramType java.util.Date
    * @param recorddate - 记录日期
     */
    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
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
    * 获取-HIBERNATE版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATE版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATE版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
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
    * 获取-币种1标识(被兑换货币)
    * @return currencysign1
     */
    public String getCurrencysign1() {
        return currencysign1;
    }

    /**
    * 设置-币种1标识(被兑换货币)
    * @paramType java.lang.String
    * @param currencysign1 - 币种1标识(被兑换货币)
     */
    public void setCurrencysign1(String currencysign1) {
        this.currencysign1 = currencysign1;
    }

    /**
    * 获取-币种1名称
    * @return currencyname1
     */
    public String getCurrencyname1() {
        return currencyname1;
    }

    /**
    * 设置-币种1名称
    * @paramType java.lang.String
    * @param currencyname1 - 币种1名称
     */
    public void setCurrencyname1(String currencyname1) {
        this.currencyname1 = currencyname1;
    }

    /**
    * 获取-币种2标识(兑换币种)
    * @return currencysign2
     */
    public String getCurrencysign2() {
        return currencysign2;
    }

    /**
    * 设置-币种2标识(兑换币种)
    * @paramType java.lang.String
    * @param currencysign2 - 币种2标识(兑换币种)
     */
    public void setCurrencysign2(String currencysign2) {
        this.currencysign2 = currencysign2;
    }

    /**
    * 获取-币种2名称
    * @return currencyname2
     */
    public String getCurrencyname2() {
        return currencyname2;
    }

    /**
    * 设置-币种2名称
    * @paramType java.lang.String
    * @param currencyname2 - 币种2名称
     */
    public void setCurrencyname2(String currencyname2) {
        this.currencyname2 = currencyname2;
    }

    /**
    * 获取-0=月计划汇率；1=日交易汇率
    * @return type
     */
    public String getType() {
        return type;
    }

    /**
    * 设置-0=月计划汇率；1=日交易汇率
    * @paramType java.lang.String
    * @param type - 0=月计划汇率；1=日交易汇率
     */
    public void setType(String type) {
        this.type = type;
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
}