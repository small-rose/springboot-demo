package com.xiaocai.demo.mybatis.generator.example.entity;

/**
 *  
 * @Table : t_cache
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class TCache {
    /**
     * id
     */
    private Long id;

    /**
     * 缓存名称
     */
    private String cacheName;

    /**
     * 数据库表名
     */
    private String dbTable;

    /**
     * 状态: 0=无效,1=有效
     */
    private String status;

    /**
    * 获取-id
    * @return id
     */
    public Long getId() {
        return id;
    }

    /**
    * 设置-id
    * @paramType java.lang.Long
    * @param id - id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    * 获取-缓存名称
    * @return cacheName
     */
    public String getCacheName() {
        return cacheName;
    }

    /**
    * 设置-缓存名称
    * @paramType java.lang.String
    * @param cacheName - 缓存名称
     */
    public void setCacheName(String cacheName) {
        this.cacheName = cacheName;
    }

    /**
    * 获取-数据库表名
    * @return dbTable
     */
    public String getDbTable() {
        return dbTable;
    }

    /**
    * 设置-数据库表名
    * @paramType java.lang.String
    * @param dbTable - 数据库表名
     */
    public void setDbTable(String dbTable) {
        this.dbTable = dbTable;
    }

    /**
    * 获取-状态: 0=无效,1=有效
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态: 0=无效,1=有效
    * @paramType java.lang.String
    * @param status - 状态: 0=无效,1=有效
     */
    public void setStatus(String status) {
        this.status = status;
    }
}