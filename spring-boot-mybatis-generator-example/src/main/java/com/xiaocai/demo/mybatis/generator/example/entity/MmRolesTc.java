package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_roles_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmRolesTc {
    /**
     * 角色id
     */
    private String roleid;

    /**
     * 暂时不用分组(备用，全写0)
     */
    private String groupid;

    /**
     * 角色名称
     */
    private String rolename;

    /**
     * 备用，全插入0
     */
    private BigDecimal roleclass;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后修改时间
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
    * 获取-角色id
    * @return roleid
     */
    public String getRoleid() {
        return roleid;
    }

    /**
    * 设置-角色id
    * @paramType java.lang.String
    * @param roleid - 角色id
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    /**
    * 获取-暂时不用分组(备用，全写0)
    * @return groupid
     */
    public String getGroupid() {
        return groupid;
    }

    /**
    * 设置-暂时不用分组(备用，全写0)
    * @paramType java.lang.String
    * @param groupid - 暂时不用分组(备用，全写0)
     */
    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    /**
    * 获取-角色名称
    * @return rolename
     */
    public String getRolename() {
        return rolename;
    }

    /**
    * 设置-角色名称
    * @paramType java.lang.String
    * @param rolename - 角色名称
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    /**
    * 获取-备用，全插入0
    * @return roleclass
     */
    public BigDecimal getRoleclass() {
        return roleclass;
    }

    /**
    * 设置-备用，全插入0
    * @paramType java.math.BigDecimal
    * @param roleclass - 备用，全插入0
     */
    public void setRoleclass(BigDecimal roleclass) {
        this.roleclass = roleclass;
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
}