package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_xmlio_log
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmXmlioLog {
    /**
     * 主键
     */
    private Long id;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * xml内容
     */
    private String xml;

    /**
     * 操作时间
     */
    private Date opdate;

    /**
     * 数据类型
     */
    private String type;

    /**
     * 数据来源
     */
    private String recivesource;

    /**
     * 相关接口表名称
     */
    private String tablename;

    /**
    * 获取-主键
    * @return id
     */
    public Long getId() {
        return id;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param id - 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    * 获取-批次号
    * @return batchid
     */
    public String getBatchid() {
        return batchid;
    }

    /**
    * 设置-批次号
    * @paramType java.lang.String
    * @param batchid - 批次号
     */
    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    /**
    * 获取-xml内容
    * @return xml
     */
    public String getXml() {
        return xml;
    }

    /**
    * 设置-xml内容
    * @paramType java.lang.String
    * @param xml - xml内容
     */
    public void setXml(String xml) {
        this.xml = xml;
    }

    /**
    * 获取-操作时间
    * @return opdate
     */
    public Date getOpdate() {
        return opdate;
    }

    /**
    * 设置-操作时间
    * @paramType java.util.Date
    * @param opdate - 操作时间
     */
    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }

    /**
    * 获取-数据类型
    * @return type
     */
    public String getType() {
        return type;
    }

    /**
    * 设置-数据类型
    * @paramType java.lang.String
    * @param type - 数据类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
    * 获取-数据来源
    * @return recivesource
     */
    public String getRecivesource() {
        return recivesource;
    }

    /**
    * 设置-数据来源
    * @paramType java.lang.String
    * @param recivesource - 数据来源
     */
    public void setRecivesource(String recivesource) {
        this.recivesource = recivesource;
    }

    /**
    * 获取-相关接口表名称
    * @return tablename
     */
    public String getTablename() {
        return tablename;
    }

    /**
    * 设置-相关接口表名称
    * @paramType java.lang.String
    * @param tablename - 相关接口表名称
     */
    public void setTablename(String tablename) {
        this.tablename = tablename;
    }
}