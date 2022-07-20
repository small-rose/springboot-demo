package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_dictcontent_td_bk_20211109
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmDictcontentTdBk20211109 {
    /**
     * 字典类型
     */
    private String busintypeid;

    /**
     * 字段内容
     */
    private String businid;

    /**
     * 字典内容名称
     */
    private String businname;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 大类
     */
    private String largecategory;

    /**
     * 说明
     */
    private String description;

    /**
     * 是否生效
     */
    private String ifvalid;

    /**
    * 获取-字典类型
    * @return busintypeid
     */
    public String getBusintypeid() {
        return busintypeid;
    }

    /**
    * 设置-字典类型
    * @paramType java.lang.String
    * @param busintypeid - 字典类型
     */
    public void setBusintypeid(String busintypeid) {
        this.busintypeid = busintypeid;
    }

    /**
    * 获取-字段内容
    * @return businid
     */
    public String getBusinid() {
        return businid;
    }

    /**
    * 设置-字段内容
    * @paramType java.lang.String
    * @param businid - 字段内容
     */
    public void setBusinid(String businid) {
        this.businid = businid;
    }

    /**
    * 获取-字典内容名称
    * @return businname
     */
    public String getBusinname() {
        return businname;
    }

    /**
    * 设置-字典内容名称
    * @paramType java.lang.String
    * @param businname - 字典内容名称
     */
    public void setBusinname(String businname) {
        this.businname = businname;
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
    * 获取-最后操作日期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作日期
    * @paramType java.util.Date
    * @param lastopdate - 最后操作日期
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-HIBERNATE版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATE版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATE版本号
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
    * 获取-大类
    * @return largecategory
     */
    public String getLargecategory() {
        return largecategory;
    }

    /**
    * 设置-大类
    * @paramType java.lang.String
    * @param largecategory - 大类
     */
    public void setLargecategory(String largecategory) {
        this.largecategory = largecategory;
    }

    /**
    * 获取-说明
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-说明
    * @paramType java.lang.String
    * @param description - 说明
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    * 获取-是否生效
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否生效
    * @paramType java.lang.String
    * @param ifvalid - 是否生效
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
    }
}