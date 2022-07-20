package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_commonpower_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmCommonpowerTd {
    /**
     * 权限类型
     */
    private String powertype;

    /**
     * 所属人
     */
    private Long owner;

    /**
     * 权限对象
     */
    private String powerobj;

    /**
     * 权限级别
     */
    private BigDecimal powergrade;

    /**
     * 是否默认
     */
    private String isdefault;

    /**
     * 操作人
     */
    private String opcode;

    /**
     * 最后操作人
     */
    private String lastopcode;

    /**
     * 记录生成时间
     */
    private Date createdate;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * HIBERNATEVERSION版本号
     */
    private Integer hibernateversion;

    /**
     * 手工修改数据描述
     */
    private String modifydesc;

    /**
     * 是否包含下级机构
     */
    private String ifinclude;

    /**
    * 获取-权限类型
    * @return powertype
     */
    public String getPowertype() {
        return powertype;
    }

    /**
    * 设置-权限类型
    * @paramType java.lang.String
    * @param powertype - 权限类型
     */
    public void setPowertype(String powertype) {
        this.powertype = powertype;
    }

    /**
    * 获取-所属人
    * @return owner
     */
    public Long getOwner() {
        return owner;
    }

    /**
    * 设置-所属人
    * @paramType java.lang.Long
    * @param owner - 所属人
     */
    public void setOwner(Long owner) {
        this.owner = owner;
    }

    /**
    * 获取-权限对象
    * @return powerobj
     */
    public String getPowerobj() {
        return powerobj;
    }

    /**
    * 设置-权限对象
    * @paramType java.lang.String
    * @param powerobj - 权限对象
     */
    public void setPowerobj(String powerobj) {
        this.powerobj = powerobj;
    }

    /**
    * 获取-权限级别
    * @return powergrade
     */
    public BigDecimal getPowergrade() {
        return powergrade;
    }

    /**
    * 设置-权限级别
    * @paramType java.math.BigDecimal
    * @param powergrade - 权限级别
     */
    public void setPowergrade(BigDecimal powergrade) {
        this.powergrade = powergrade;
    }

    /**
    * 获取-是否默认
    * @return isdefault
     */
    public String getIsdefault() {
        return isdefault;
    }

    /**
    * 设置-是否默认
    * @paramType java.lang.String
    * @param isdefault - 是否默认
     */
    public void setIsdefault(String isdefault) {
        this.isdefault = isdefault;
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
    * 获取-最后操作人
    * @return lastopcode
     */
    public String getLastopcode() {
        return lastopcode;
    }

    /**
    * 设置-最后操作人
    * @paramType java.lang.String
    * @param lastopcode - 最后操作人
     */
    public void setLastopcode(String lastopcode) {
        this.lastopcode = lastopcode;
    }

    /**
    * 获取-记录生成时间
    * @return createdate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
    * 设置-记录生成时间
    * @paramType java.util.Date
    * @param createdate - 记录生成时间
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
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
    * 获取-HIBERNATEVERSION版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATEVERSION版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATEVERSION版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-手工修改数据描述
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改数据描述
    * @paramType java.lang.String
    * @param modifydesc - 手工修改数据描述
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-是否包含下级机构
    * @return ifinclude
     */
    public String getIfinclude() {
        return ifinclude;
    }

    /**
    * 设置-是否包含下级机构
    * @paramType java.lang.String
    * @param ifinclude - 是否包含下级机构
     */
    public void setIfinclude(String ifinclude) {
        this.ifinclude = ifinclude;
    }
}