package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_switchcontrol_detail_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmSwitchcontrolDetailTc {
    /**
     * 类型大类
     */
    private String name;

    /**
     * 类型代码
     */
    private String value;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 转换名称（总行）
     */
    private String value1;

    /**
     * 备注
     */
    private String remarks;

    /**
    * 获取-类型大类
    * @return name
     */
    public String getName() {
        return name;
    }

    /**
    * 设置-类型大类
    * @paramType java.lang.String
    * @param name - 类型大类
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
    * 获取-类型代码
    * @return value
     */
    public String getValue() {
        return value;
    }

    /**
    * 设置-类型代码
    * @paramType java.lang.String
    * @param value - 类型代码
     */
    public void setValue(String value) {
        this.value = value;
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
    * 获取-转换名称（总行）
    * @return value1
     */
    public String getValue1() {
        return value1;
    }

    /**
    * 设置-转换名称（总行）
    * @paramType java.lang.String
    * @param value1 - 转换名称（总行）
     */
    public void setValue1(String value1) {
        this.value1 = value1;
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
}