package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_mirror_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmMirrorTd {
    /**
     * 切片id
     */
    private Long mirrorid;

    /**
     * 切片日期
     */
    private Date mirrordate;

    /**
     * 分公司汇总
     */
    private String subcompany;

    /**
     * 切片类型,1:储金,2:预收,3:待付,4:应收,5:再保,6:保险卡预收台帐,7:保险卡预付,8:保险卡应付,9:在途应收,10待摊手续费,11预付赔款
     */
    private Integer mirrortype;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 版本控制
     */
    private Long hibernateversion;

    /**
     * 0 日切 1 月切
     */
    private String opstatus;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 操作员代码
     */
    private String opcode;

    /**
     * 审核人代码
     */
    private String auditcode;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
    * 获取-切片id
    * @return mirrorid
     */
    public Long getMirrorid() {
        return mirrorid;
    }

    /**
    * 设置-切片id
    * @paramType java.lang.Long
    * @param mirrorid - 切片id
     */
    public void setMirrorid(Long mirrorid) {
        this.mirrorid = mirrorid;
    }

    /**
    * 获取-切片日期
    * @return mirrordate
     */
    public Date getMirrordate() {
        return mirrordate;
    }

    /**
    * 设置-切片日期
    * @paramType java.util.Date
    * @param mirrordate - 切片日期
     */
    public void setMirrordate(Date mirrordate) {
        this.mirrordate = mirrordate;
    }

    /**
    * 获取-分公司汇总
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司汇总
    * @paramType java.lang.String
    * @param subcompany - 分公司汇总
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-切片类型,1:储金,2:预收,3:待付,4:应收,5:再保,6:保险卡预收台帐,7:保险卡预付,8:保险卡应付,9:在途应收,10待摊手续费,11预付赔款
    * @return mirrortype
     */
    public Integer getMirrortype() {
        return mirrortype;
    }

    /**
    * 设置-切片类型,1:储金,2:预收,3:待付,4:应收,5:再保,6:保险卡预收台帐,7:保险卡预付,8:保险卡应付,9:在途应收,10待摊手续费,11预付赔款
    * @paramType java.lang.Integer
    * @param mirrortype - 切片类型,1:储金,2:预收,3:待付,4:应收,5:再保,6:保险卡预收台帐,7:保险卡预付,8:保险卡应付,9:在途应收,10待摊手续费,11预付赔款
     */
    public void setMirrortype(Integer mirrortype) {
        this.mirrortype = mirrortype;
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
    * 获取-版本控制
    * @return hibernateversion
     */
    public Long getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本控制
    * @paramType java.lang.Long
    * @param hibernateversion - 版本控制
     */
    public void setHibernateversion(Long hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-0 日切 1 月切
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-0 日切 1 月切
    * @paramType java.lang.String
    * @param opstatus - 0 日切 1 月切
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
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
    * 获取-操作员代码
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作员代码
    * @paramType java.lang.String
    * @param opcode - 操作员代码
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-审核人代码
    * @return auditcode
     */
    public String getAuditcode() {
        return auditcode;
    }

    /**
    * 设置-审核人代码
    * @paramType java.lang.String
    * @param auditcode - 审核人代码
     */
    public void setAuditcode(String auditcode) {
        this.auditcode = auditcode;
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