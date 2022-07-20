package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_financecheckpower_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmFinancecheckpowerTc {
    /**
     * 分公司代码
     */
    private Long subcompany;

    /**
     * 操作员
     */
    private Long opcode;

    /**
     * 机构代码
     */
    private Long unitcode;

    /**
     * 是否生效(0:无效 1:有效)
     */
    private String ifvalid;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 最后修改时间
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
    * 获取-分公司代码
    * @return subcompany
     */
    public Long getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司代码
    * @paramType java.lang.Long
    * @param subcompany - 分公司代码
     */
    public void setSubcompany(Long subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-操作员
    * @return opcode
     */
    public Long getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作员
    * @paramType java.lang.Long
    * @param opcode - 操作员
     */
    public void setOpcode(Long opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-机构代码
    * @return unitcode
     */
    public Long getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-机构代码
    * @paramType java.lang.Long
    * @param unitcode - 机构代码
     */
    public void setUnitcode(Long unitcode) {
        this.unitcode = unitcode;
    }

    /**
    * 获取-是否生效(0:无效 1:有效)
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否生效(0:无效 1:有效)
    * @paramType java.lang.String
    * @param ifvalid - 是否生效(0:无效 1:有效)
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
    }

    /**
    * 获取-创建时间
    * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
    * 设置-创建时间
    * @paramType java.util.Date
    * @param createtime - 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
    * 获取-最后修改时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后修改时间
    * @paramType java.util.Date
    * @param lastopdate - 最后修改时间
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