package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_processlevel_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmProcesslevelTc {
    /**
     * 类型
     */
    private String type;

    /**
     * 层级
     */
    private String level;

    /**
     * 角色id
     */
    private String roleid;

    /**
     * 数据来源
     */
    private String datasource;

    /**
     * 类型名称
     */
    private String typename;

    /**
     * 权限（UNIT:机构 SUBCOMPANY:分公司）
     */
    private String power;

    /**
     * 是否生效（1:生效  0:失效）
     */
    private String ifvalid;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
    * 获取-类型
    * @return type
     */
    public String getType() {
        return type;
    }

    /**
    * 设置-类型
    * @paramType java.lang.String
    * @param type - 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
    * 获取-层级
    * @return level
     */
    public String getLevel() {
        return level;
    }

    /**
    * 设置-层级
    * @paramType java.lang.String
    * @param level - 层级
     */
    public void setLevel(String level) {
        this.level = level;
    }

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
    * 获取-数据来源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-数据来源
    * @paramType java.lang.String
    * @param datasource - 数据来源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-类型名称
    * @return typename
     */
    public String getTypename() {
        return typename;
    }

    /**
    * 设置-类型名称
    * @paramType java.lang.String
    * @param typename - 类型名称
     */
    public void setTypename(String typename) {
        this.typename = typename;
    }

    /**
    * 获取-权限（UNIT:机构 SUBCOMPANY:分公司）
    * @return power
     */
    public String getPower() {
        return power;
    }

    /**
    * 设置-权限（UNIT:机构 SUBCOMPANY:分公司）
    * @paramType java.lang.String
    * @param power - 权限（UNIT:机构 SUBCOMPANY:分公司）
     */
    public void setPower(String power) {
        this.power = power;
    }

    /**
    * 获取-是否生效（1:生效  0:失效）
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否生效（1:生效  0:失效）
    * @paramType java.lang.String
    * @param ifvalid - 是否生效（1:生效  0:失效）
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
    }

    /**
    * 获取-备注
    * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param remarks - 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
}