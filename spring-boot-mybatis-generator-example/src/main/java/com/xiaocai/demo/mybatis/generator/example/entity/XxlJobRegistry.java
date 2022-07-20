package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : xxl_job_registry
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class XxlJobRegistry {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 执行器主键
     */
    private String registryGroup;

    /**
     * 执行key
     */
    private String registryKey;

    /**
     * 执行value
     */
    private String registryValue;

    /**
     * 更新时间
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
    * 获取-执行器主键
    * @return registryGroup
     */
    public String getRegistryGroup() {
        return registryGroup;
    }

    /**
    * 设置-执行器主键
    * @paramType java.lang.String
    * @param registryGroup - 执行器主键
     */
    public void setRegistryGroup(String registryGroup) {
        this.registryGroup = registryGroup;
    }

    /**
    * 获取-执行key
    * @return registryKey
     */
    public String getRegistryKey() {
        return registryKey;
    }

    /**
    * 设置-执行key
    * @paramType java.lang.String
    * @param registryKey - 执行key
     */
    public void setRegistryKey(String registryKey) {
        this.registryKey = registryKey;
    }

    /**
    * 获取-执行value
    * @return registryValue
     */
    public String getRegistryValue() {
        return registryValue;
    }

    /**
    * 设置-执行value
    * @paramType java.lang.String
    * @param registryValue - 执行value
     */
    public void setRegistryValue(String registryValue) {
        this.registryValue = registryValue;
    }

    /**
    * 获取-更新时间
    * @return updateTime
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
    * 设置-更新时间
    * @paramType java.util.Date
    * @param updateTime - 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}