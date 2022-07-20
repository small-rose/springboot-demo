package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_bankflowauthorization_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmBankflowauthorizationTd {
    /**
     * 主键
     */
    private Long authorizaedid;

    /**
     * 待核销收款流水号
     */
    private Long usableno;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 财务机构
     */
    private String unitcode;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 已使用金额
     */
    private BigDecimal usedamount;

    /**
     * 状态，0初始状态，1 部分核销 2全额核销 3作废
     */
    private String opstatus;

    /**
     * 操作人
     */
    private String opcode;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 备注
     */
    private String modifydesc;

    /**
    * 获取-主键
    * @return authorizaedid
     */
    public Long getAuthorizaedid() {
        return authorizaedid;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param authorizaedid - 主键
     */
    public void setAuthorizaedid(Long authorizaedid) {
        this.authorizaedid = authorizaedid;
    }

    /**
    * 获取-待核销收款流水号
    * @return usableno
     */
    public Long getUsableno() {
        return usableno;
    }

    /**
    * 设置-待核销收款流水号
    * @paramType java.lang.Long
    * @param usableno - 待核销收款流水号
     */
    public void setUsableno(Long usableno) {
        this.usableno = usableno;
    }

    /**
    * 获取-分公司
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司
    * @paramType java.lang.String
    * @param subcompany - 分公司
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-财务机构
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-财务机构
    * @paramType java.lang.String
    * @param unitcode - 财务机构
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    /**
    * 获取-金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-金额
    * @paramType java.math.BigDecimal
    * @param amount - 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-已使用金额
    * @return usedamount
     */
    public BigDecimal getUsedamount() {
        return usedamount;
    }

    /**
    * 设置-已使用金额
    * @paramType java.math.BigDecimal
    * @param usedamount - 已使用金额
     */
    public void setUsedamount(BigDecimal usedamount) {
        this.usedamount = usedamount;
    }

    /**
    * 获取-状态，0初始状态，1 部分核销 2全额核销 3作废
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-状态，0初始状态，1 部分核销 2全额核销 3作废
    * @paramType java.lang.String
    * @param opstatus - 状态，0初始状态，1 部分核销 2全额核销 3作废
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
    }

    /**
    * 获取-操作人
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作人
    * @paramType java.lang.String
    * @param opcode - 操作人
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
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
    * 获取-备注
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param modifydesc - 备注
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }
}