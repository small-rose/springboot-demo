package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_erpclasses_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmErpclassesTc {
    /**
     * 财务险种代码
     */
    private String erpclassescode;

    /**
     * 财务险种名称
     */
    private String erpclassesname;

    /**
     * 启用标识 1启用 0失效
     */
    private String enabledflag;

    /**
     * 失效日期
     */
    private Date disabledate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后更新日期
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 财务险类
     */
    private String erpclasseskind;

    /**
     * 财务险类名称
     */
    private String erpclasseskindname;

    /**
     * 描述
     */
    private String modifydesc;

    /**
    * 获取-财务险种代码
    * @return erpclassescode
     */
    public String getErpclassescode() {
        return erpclassescode;
    }

    /**
    * 设置-财务险种代码
    * @paramType java.lang.String
    * @param erpclassescode - 财务险种代码
     */
    public void setErpclassescode(String erpclassescode) {
        this.erpclassescode = erpclassescode;
    }

    /**
    * 获取-财务险种名称
    * @return erpclassesname
     */
    public String getErpclassesname() {
        return erpclassesname;
    }

    /**
    * 设置-财务险种名称
    * @paramType java.lang.String
    * @param erpclassesname - 财务险种名称
     */
    public void setErpclassesname(String erpclassesname) {
        this.erpclassesname = erpclassesname;
    }

    /**
    * 获取-启用标识 1启用 0失效
    * @return enabledflag
     */
    public String getEnabledflag() {
        return enabledflag;
    }

    /**
    * 设置-启用标识 1启用 0失效
    * @paramType java.lang.String
    * @param enabledflag - 启用标识 1启用 0失效
     */
    public void setEnabledflag(String enabledflag) {
        this.enabledflag = enabledflag;
    }

    /**
    * 获取-失效日期
    * @return disabledate
     */
    public Date getDisabledate() {
        return disabledate;
    }

    /**
    * 设置-失效日期
    * @paramType java.util.Date
    * @param disabledate - 失效日期
     */
    public void setDisabledate(Date disabledate) {
        this.disabledate = disabledate;
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
    * 获取-最后更新日期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后更新日期
    * @paramType java.util.Date
    * @param lastopdate - 最后更新日期
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - 版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-财务险类
    * @return erpclasseskind
     */
    public String getErpclasseskind() {
        return erpclasseskind;
    }

    /**
    * 设置-财务险类
    * @paramType java.lang.String
    * @param erpclasseskind - 财务险类
     */
    public void setErpclasseskind(String erpclasseskind) {
        this.erpclasseskind = erpclasseskind;
    }

    /**
    * 获取-财务险类名称
    * @return erpclasseskindname
     */
    public String getErpclasseskindname() {
        return erpclasseskindname;
    }

    /**
    * 设置-财务险类名称
    * @paramType java.lang.String
    * @param erpclasseskindname - 财务险类名称
     */
    public void setErpclasseskindname(String erpclasseskindname) {
        this.erpclasseskindname = erpclasseskindname;
    }

    /**
    * 获取-描述
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-描述
    * @paramType java.lang.String
    * @param modifydesc - 描述
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }
}