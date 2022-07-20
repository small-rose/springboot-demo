package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : xxl_job_group
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class XxlJobGroup {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 执行器AppName
     */
    private String appName;

    /**
     * 执行器名称
     */
    private String title;

    /**
     * 执行器地址类型：0=自动注册、1=手动录入
     */
    private Byte addressType;

    /**
     * 执行器地址列表，多地址逗号分隔
     */
    private String addressList;

    /**
     * 最后更新时间
     */
    private Date updateTime;

    /**
    * 获取-主键
    * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Integer
    * @param id - 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
    * 获取-执行器AppName
    * @return appName
     */
    public String getAppName() {
        return appName;
    }

    /**
    * 设置-执行器AppName
    * @paramType java.lang.String
    * @param appName - 执行器AppName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
    * 获取-执行器名称
    * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
    * 设置-执行器名称
    * @paramType java.lang.String
    * @param title - 执行器名称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
    * 获取-执行器地址类型：0=自动注册、1=手动录入
    * @return addressType
     */
    public Byte getAddressType() {
        return addressType;
    }

    /**
    * 设置-执行器地址类型：0=自动注册、1=手动录入
    * @paramType java.lang.Byte
    * @param addressType - 执行器地址类型：0=自动注册、1=手动录入
     */
    public void setAddressType(Byte addressType) {
        this.addressType = addressType;
    }

    /**
    * 获取-执行器地址列表，多地址逗号分隔
    * @return addressList
     */
    public String getAddressList() {
        return addressList;
    }

    /**
    * 设置-执行器地址列表，多地址逗号分隔
    * @paramType java.lang.String
    * @param addressList - 执行器地址列表，多地址逗号分隔
     */
    public void setAddressList(String addressList) {
        this.addressList = addressList;
    }

    /**
    * 获取-最后更新时间
    * @return updateTime
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
    * 设置-最后更新时间
    * @paramType java.util.Date
    * @param updateTime - 最后更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}