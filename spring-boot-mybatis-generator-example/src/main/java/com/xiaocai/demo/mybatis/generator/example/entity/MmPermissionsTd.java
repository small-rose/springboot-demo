package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_permissions_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPermissionsTd {
    /**
     * 主键
     */
    private Long permissionsid;

    /**
     * 业务号(业务数据主键)
     */
    private Long businesscode;

    /**
     * 操作员代码
     */
    private String opcode;

    /**
     * 授权人
     */
    private String authorizedperson;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 权限类型(0:未授权 1:授权)
     */
    private String authorizedtype;

    /**
     * HIBERNATEVERSION版本号
     */
    private Integer hibernateversion;

    /**
     * 0:未授权 1:授权
     */
    private String powertype;

    /**
    * 获取-主键
    * @return permissionsid
     */
    public Long getPermissionsid() {
        return permissionsid;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param permissionsid - 主键
     */
    public void setPermissionsid(Long permissionsid) {
        this.permissionsid = permissionsid;
    }

    /**
    * 获取-业务号(业务数据主键)
    * @return businesscode
     */
    public Long getBusinesscode() {
        return businesscode;
    }

    /**
    * 设置-业务号(业务数据主键)
    * @paramType java.lang.Long
    * @param businesscode - 业务号(业务数据主键)
     */
    public void setBusinesscode(Long businesscode) {
        this.businesscode = businesscode;
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
    * 获取-授权人
    * @return authorizedperson
     */
    public String getAuthorizedperson() {
        return authorizedperson;
    }

    /**
    * 设置-授权人
    * @paramType java.lang.String
    * @param authorizedperson - 授权人
     */
    public void setAuthorizedperson(String authorizedperson) {
        this.authorizedperson = authorizedperson;
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
    * 获取-权限类型(0:未授权 1:授权)
    * @return authorizedtype
     */
    public String getAuthorizedtype() {
        return authorizedtype;
    }

    /**
    * 设置-权限类型(0:未授权 1:授权)
    * @paramType java.lang.String
    * @param authorizedtype - 权限类型(0:未授权 1:授权)
     */
    public void setAuthorizedtype(String authorizedtype) {
        this.authorizedtype = authorizedtype;
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
    * 获取-0:未授权 1:授权
    * @return powertype
     */
    public String getPowertype() {
        return powertype;
    }

    /**
    * 设置-0:未授权 1:授权
    * @paramType java.lang.String
    * @param powertype - 0:未授权 1:授权
     */
    public void setPowertype(String powertype) {
        this.powertype = powertype;
    }
}