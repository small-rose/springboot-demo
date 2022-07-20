package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_subcompany_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmSubcompanyTc {
    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 分公司名称
     */
    private String subcompanyname;

    /**
     * 分公司代码简写
     */
    private String shortsubcompany;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * HIBERNATEVERSION版本号
     */
    private Integer hibernateversion;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 分公司简称
     */
    private String shortsubcompanyname;

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
    * 获取-分公司名称
    * @return subcompanyname
     */
    public String getSubcompanyname() {
        return subcompanyname;
    }

    /**
    * 设置-分公司名称
    * @paramType java.lang.String
    * @param subcompanyname - 分公司名称
     */
    public void setSubcompanyname(String subcompanyname) {
        this.subcompanyname = subcompanyname;
    }

    /**
    * 获取-分公司代码简写
    * @return shortsubcompany
     */
    public String getShortsubcompany() {
        return shortsubcompany;
    }

    /**
    * 设置-分公司代码简写
    * @paramType java.lang.String
    * @param shortsubcompany - 分公司代码简写
     */
    public void setShortsubcompany(String shortsubcompany) {
        this.shortsubcompany = shortsubcompany;
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
    * 获取-分公司简称
    * @return shortsubcompanyname
     */
    public String getShortsubcompanyname() {
        return shortsubcompanyname;
    }

    /**
    * 设置-分公司简称
    * @paramType java.lang.String
    * @param shortsubcompanyname - 分公司简称
     */
    public void setShortsubcompanyname(String shortsubcompanyname) {
        this.shortsubcompanyname = shortsubcompanyname;
    }
}