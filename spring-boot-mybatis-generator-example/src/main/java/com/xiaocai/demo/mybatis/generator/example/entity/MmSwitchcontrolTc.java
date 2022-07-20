package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_switchcontrol_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmSwitchcontrolTc {
    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 类型大类
     */
    private String switchedsys;

    /**
     * 是否切换生效：ifvalid=1为生效；ifvalid=0为未生效
     */
    private String ifvalid;

    /**
     * 备注说明
     */
    private String description;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 配置
     */
    private String switchinfo;

    /**
     * 接口地址类型：1webservice,2servlet
     */
    private String intftype;

    /**
    * 获取-分公司代码
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司代码
    * @paramType java.lang.String
    * @param subcompany - 分公司代码
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-类型大类
    * @return switchedsys
     */
    public String getSwitchedsys() {
        return switchedsys;
    }

    /**
    * 设置-类型大类
    * @paramType java.lang.String
    * @param switchedsys - 类型大类
     */
    public void setSwitchedsys(String switchedsys) {
        this.switchedsys = switchedsys;
    }

    /**
    * 获取-是否切换生效：ifvalid=1为生效；ifvalid=0为未生效
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否切换生效：ifvalid=1为生效；ifvalid=0为未生效
    * @paramType java.lang.String
    * @param ifvalid - 是否切换生效：ifvalid=1为生效；ifvalid=0为未生效
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
    }

    /**
    * 获取-备注说明
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-备注说明
    * @paramType java.lang.String
    * @param description - 备注说明
     */
    public void setDescription(String description) {
        this.description = description;
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
    * 获取-配置
    * @return switchinfo
     */
    public String getSwitchinfo() {
        return switchinfo;
    }

    /**
    * 设置-配置
    * @paramType java.lang.String
    * @param switchinfo - 配置
     */
    public void setSwitchinfo(String switchinfo) {
        this.switchinfo = switchinfo;
    }

    /**
    * 获取-接口地址类型：1webservice,2servlet
    * @return intftype
     */
    public String getIntftype() {
        return intftype;
    }

    /**
    * 设置-接口地址类型：1webservice,2servlet
    * @paramType java.lang.String
    * @param intftype - 接口地址类型：1webservice,2servlet
     */
    public void setIntftype(String intftype) {
        this.intftype = intftype;
    }
}