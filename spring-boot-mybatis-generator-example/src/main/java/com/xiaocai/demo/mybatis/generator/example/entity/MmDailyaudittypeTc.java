package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_dailyaudittype_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmDailyaudittypeTc {
    /**
     * 日结单类型
     */
    private String dailyaudittype;

    /**
     * 业务类型
     */
    private String businesstype;

    /**
     * 日结单分类小类
     */
    private String dailyauditcode;

    /**
     * 日结单分类名称
     */
    private String dailyauditname;

    /**
     * 是否需要复核，备用字段，目前默认全都是需要  0 不需要 1 需要
     */
    private String ifcheck;

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
    * 获取-日结单类型
    * @return dailyaudittype
     */
    public String getDailyaudittype() {
        return dailyaudittype;
    }

    /**
    * 设置-日结单类型
    * @paramType java.lang.String
    * @param dailyaudittype - 日结单类型
     */
    public void setDailyaudittype(String dailyaudittype) {
        this.dailyaudittype = dailyaudittype;
    }

    /**
    * 获取-业务类型
    * @return businesstype
     */
    public String getBusinesstype() {
        return businesstype;
    }

    /**
    * 设置-业务类型
    * @paramType java.lang.String
    * @param businesstype - 业务类型
     */
    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype;
    }

    /**
    * 获取-日结单分类小类
    * @return dailyauditcode
     */
    public String getDailyauditcode() {
        return dailyauditcode;
    }

    /**
    * 设置-日结单分类小类
    * @paramType java.lang.String
    * @param dailyauditcode - 日结单分类小类
     */
    public void setDailyauditcode(String dailyauditcode) {
        this.dailyauditcode = dailyauditcode;
    }

    /**
    * 获取-日结单分类名称
    * @return dailyauditname
     */
    public String getDailyauditname() {
        return dailyauditname;
    }

    /**
    * 设置-日结单分类名称
    * @paramType java.lang.String
    * @param dailyauditname - 日结单分类名称
     */
    public void setDailyauditname(String dailyauditname) {
        this.dailyauditname = dailyauditname;
    }

    /**
    * 获取-是否需要复核，备用字段，目前默认全都是需要  0 不需要 1 需要
    * @return ifcheck
     */
    public String getIfcheck() {
        return ifcheck;
    }

    /**
    * 设置-是否需要复核，备用字段，目前默认全都是需要  0 不需要 1 需要
    * @paramType java.lang.String
    * @param ifcheck - 是否需要复核，备用字段，目前默认全都是需要  0 不需要 1 需要
     */
    public void setIfcheck(String ifcheck) {
        this.ifcheck = ifcheck;
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
}