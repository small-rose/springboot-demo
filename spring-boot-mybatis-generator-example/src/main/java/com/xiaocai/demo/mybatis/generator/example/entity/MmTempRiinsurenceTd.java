package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;

/**
 *  
 * @Table : mm_temp_riinsurence_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTempRiinsurenceTd {
    /**
     * 再保人代码
     */
    private Long reinsurercode;

    /**
     * 机构
     */
    private String subcompany;

    /**
     * 险种
     */
    private String classescode;

    /**
     * 合同类型
     */
    private String contracttype;

    /**
     * 类别(S:溢额　Q:成数,主要指合同分保的区分)
     */
    private String qstype;

    /**
     * 根据该金额判断业务类型
     */
    private BigDecimal busamount;

    /**
     * 帐单期
     */
    private String tabperiod;

    /**
     * 币种
     */
    private String currencycode;

    /**
    * 获取-再保人代码
    * @return reinsurercode
     */
    public Long getReinsurercode() {
        return reinsurercode;
    }

    /**
    * 设置-再保人代码
    * @paramType java.lang.Long
    * @param reinsurercode - 再保人代码
     */
    public void setReinsurercode(Long reinsurercode) {
        this.reinsurercode = reinsurercode;
    }

    /**
    * 获取-机构
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-机构
    * @paramType java.lang.String
    * @param subcompany - 机构
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-险种
    * @return classescode
     */
    public String getClassescode() {
        return classescode;
    }

    /**
    * 设置-险种
    * @paramType java.lang.String
    * @param classescode - 险种
     */
    public void setClassescode(String classescode) {
        this.classescode = classescode;
    }

    /**
    * 获取-合同类型
    * @return contracttype
     */
    public String getContracttype() {
        return contracttype;
    }

    /**
    * 设置-合同类型
    * @paramType java.lang.String
    * @param contracttype - 合同类型
     */
    public void setContracttype(String contracttype) {
        this.contracttype = contracttype;
    }

    /**
    * 获取-类别(S:溢额　Q:成数,主要指合同分保的区分)
    * @return qstype
     */
    public String getQstype() {
        return qstype;
    }

    /**
    * 设置-类别(S:溢额　Q:成数,主要指合同分保的区分)
    * @paramType java.lang.String
    * @param qstype - 类别(S:溢额　Q:成数,主要指合同分保的区分)
     */
    public void setQstype(String qstype) {
        this.qstype = qstype;
    }

    /**
    * 获取-根据该金额判断业务类型
    * @return busamount
     */
    public BigDecimal getBusamount() {
        return busamount;
    }

    /**
    * 设置-根据该金额判断业务类型
    * @paramType java.math.BigDecimal
    * @param busamount - 根据该金额判断业务类型
     */
    public void setBusamount(BigDecimal busamount) {
        this.busamount = busamount;
    }

    /**
    * 获取-帐单期
    * @return tabperiod
     */
    public String getTabperiod() {
        return tabperiod;
    }

    /**
    * 设置-帐单期
    * @paramType java.lang.String
    * @param tabperiod - 帐单期
     */
    public void setTabperiod(String tabperiod) {
        this.tabperiod = tabperiod;
    }

    /**
    * 获取-币种
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种
    * @paramType java.lang.String
    * @param currencycode - 币种
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }
}