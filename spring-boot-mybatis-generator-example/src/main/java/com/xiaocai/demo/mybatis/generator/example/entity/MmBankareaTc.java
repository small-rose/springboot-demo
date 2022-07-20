package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_bankarea_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmBankareaTc {
    /**
     * 银行大类
     */
    private Long bankcode;

    /**
     * 区域代码
     */
    private Long areacode;

    /**
     * 地区名称
     */
    private String areaname;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
    * 获取-银行大类
    * @return bankcode
     */
    public Long getBankcode() {
        return bankcode;
    }

    /**
    * 设置-银行大类
    * @paramType java.lang.Long
    * @param bankcode - 银行大类
     */
    public void setBankcode(Long bankcode) {
        this.bankcode = bankcode;
    }

    /**
    * 获取-区域代码
    * @return areacode
     */
    public Long getAreacode() {
        return areacode;
    }

    /**
    * 设置-区域代码
    * @paramType java.lang.Long
    * @param areacode - 区域代码
     */
    public void setAreacode(Long areacode) {
        this.areacode = areacode;
    }

    /**
    * 获取-地区名称
    * @return areaname
     */
    public String getAreaname() {
        return areaname;
    }

    /**
    * 设置-地区名称
    * @paramType java.lang.String
    * @param areaname - 地区名称
     */
    public void setAreaname(String areaname) {
        this.areaname = areaname;
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
}