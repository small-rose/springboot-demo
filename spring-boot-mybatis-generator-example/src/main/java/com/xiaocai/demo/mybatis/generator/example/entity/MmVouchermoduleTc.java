package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_vouchermodule_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmVouchermoduleTc {
    /**
     * 业务类型(businessone+businesstwo)
     */
    private String businesstype;

    /**
     * 模板号
     */
    private String moduleno;

    /**
     * 模板类别，为支持多模板设定而设，暂时只使用1
     */
    private String moduletype;

    /**
     * 借贷方向，表示金额应放借方还是贷方
     */
    private BigDecimal balancetype;

    /**
     * 会计科目代码，只能是明细科目
     */
    private String erpaccountcode;

    /**
     * 符号正负，负数表示金额取原金额（日结单明细表金额）*-1 
     */
    private BigDecimal sign;

    /**
     * 摘要
     */
    private String description;

    /**
     * 插入时间戳
     */
    private Date timestamp;

    /**
     * 最后更新时间
     */
    private Date lastopdate;

    /**
     * 对方内往科目
     */
    private String transinner;

    /**
     * 记录版本号，记录更新的次数
     */
    private Integer hibernateversion;

    /**
     * 记录是否有效，0为有效，其他为冻结
     */
    private BigDecimal modulestatus;

    /**
     * 最后更新人
     */
    private String lastopcode;

    /**
     * 业务流水号在日结单明细表中取数逻辑，1：取newno 2：取odlno
     */
    private String businessnotype;

    /**
     * 现金流量编码
     */
    private String cashflow;

    /**
    * 获取-业务类型(businessone+businesstwo)
    * @return businesstype
     */
    public String getBusinesstype() {
        return businesstype;
    }

    /**
    * 设置-业务类型(businessone+businesstwo)
    * @paramType java.lang.String
    * @param businesstype - 业务类型(businessone+businesstwo)
     */
    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype;
    }

    /**
    * 获取-模板号
    * @return moduleno
     */
    public String getModuleno() {
        return moduleno;
    }

    /**
    * 设置-模板号
    * @paramType java.lang.String
    * @param moduleno - 模板号
     */
    public void setModuleno(String moduleno) {
        this.moduleno = moduleno;
    }

    /**
    * 获取-模板类别，为支持多模板设定而设，暂时只使用1
    * @return moduletype
     */
    public String getModuletype() {
        return moduletype;
    }

    /**
    * 设置-模板类别，为支持多模板设定而设，暂时只使用1
    * @paramType java.lang.String
    * @param moduletype - 模板类别，为支持多模板设定而设，暂时只使用1
     */
    public void setModuletype(String moduletype) {
        this.moduletype = moduletype;
    }

    /**
    * 获取-借贷方向，表示金额应放借方还是贷方
    * @return balancetype
     */
    public BigDecimal getBalancetype() {
        return balancetype;
    }

    /**
    * 设置-借贷方向，表示金额应放借方还是贷方
    * @paramType java.math.BigDecimal
    * @param balancetype - 借贷方向，表示金额应放借方还是贷方
     */
    public void setBalancetype(BigDecimal balancetype) {
        this.balancetype = balancetype;
    }

    /**
    * 获取-会计科目代码，只能是明细科目
    * @return erpaccountcode
     */
    public String getErpaccountcode() {
        return erpaccountcode;
    }

    /**
    * 设置-会计科目代码，只能是明细科目
    * @paramType java.lang.String
    * @param erpaccountcode - 会计科目代码，只能是明细科目
     */
    public void setErpaccountcode(String erpaccountcode) {
        this.erpaccountcode = erpaccountcode;
    }

    /**
    * 获取-符号正负，负数表示金额取原金额（日结单明细表金额）*-1 
    * @return sign
     */
    public BigDecimal getSign() {
        return sign;
    }

    /**
    * 设置-符号正负，负数表示金额取原金额（日结单明细表金额）*-1 
    * @paramType java.math.BigDecimal
    * @param sign - 符号正负，负数表示金额取原金额（日结单明细表金额）*-1 
     */
    public void setSign(BigDecimal sign) {
        this.sign = sign;
    }

    /**
    * 获取-摘要
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-摘要
    * @paramType java.lang.String
    * @param description - 摘要
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    * 获取-插入时间戳
    * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
    * 设置-插入时间戳
    * @paramType java.util.Date
    * @param timestamp - 插入时间戳
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
    * 获取-最后更新时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后更新时间
    * @paramType java.util.Date
    * @param lastopdate - 最后更新时间
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-对方内往科目
    * @return transinner
     */
    public String getTransinner() {
        return transinner;
    }

    /**
    * 设置-对方内往科目
    * @paramType java.lang.String
    * @param transinner - 对方内往科目
     */
    public void setTransinner(String transinner) {
        this.transinner = transinner;
    }

    /**
    * 获取-记录版本号，记录更新的次数
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-记录版本号，记录更新的次数
    * @paramType java.lang.Integer
    * @param hibernateversion - 记录版本号，记录更新的次数
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-记录是否有效，0为有效，其他为冻结
    * @return modulestatus
     */
    public BigDecimal getModulestatus() {
        return modulestatus;
    }

    /**
    * 设置-记录是否有效，0为有效，其他为冻结
    * @paramType java.math.BigDecimal
    * @param modulestatus - 记录是否有效，0为有效，其他为冻结
     */
    public void setModulestatus(BigDecimal modulestatus) {
        this.modulestatus = modulestatus;
    }

    /**
    * 获取-最后更新人
    * @return lastopcode
     */
    public String getLastopcode() {
        return lastopcode;
    }

    /**
    * 设置-最后更新人
    * @paramType java.lang.String
    * @param lastopcode - 最后更新人
     */
    public void setLastopcode(String lastopcode) {
        this.lastopcode = lastopcode;
    }

    /**
    * 获取-业务流水号在日结单明细表中取数逻辑，1：取newno 2：取odlno
    * @return businessnotype
     */
    public String getBusinessnotype() {
        return businessnotype;
    }

    /**
    * 设置-业务流水号在日结单明细表中取数逻辑，1：取newno 2：取odlno
    * @paramType java.lang.String
    * @param businessnotype - 业务流水号在日结单明细表中取数逻辑，1：取newno 2：取odlno
     */
    public void setBusinessnotype(String businessnotype) {
        this.businessnotype = businessnotype;
    }

    /**
    * 获取-现金流量编码
    * @return cashflow
     */
    public String getCashflow() {
        return cashflow;
    }

    /**
    * 设置-现金流量编码
    * @paramType java.lang.String
    * @param cashflow - 现金流量编码
     */
    public void setCashflow(String cashflow) {
        this.cashflow = cashflow;
    }
}