package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_classescodemapping_in_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmClassescodemappingInTc {
    /**
     * 财务险种代码
     */
    private Long erpclassescode;

    /**
     * 业务险种代码
     */
    private Long busclassescode;

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
     * 发票开具险类代码
     */
    private String classkind;

    /**
     * 发票开具险类名称
     */
    private String classkindname;

    /**
     * 财务险种名称
     */
    private String erpclassesname;

    /**
     * 业务险种名称
     */
    private String busclassesname;

    /**
    * 获取-财务险种代码
    * @return erpclassescode
     */
    public Long getErpclassescode() {
        return erpclassescode;
    }

    /**
    * 设置-财务险种代码
    * @paramType java.lang.Long
    * @param erpclassescode - 财务险种代码
     */
    public void setErpclassescode(Long erpclassescode) {
        this.erpclassescode = erpclassescode;
    }

    /**
    * 获取-业务险种代码
    * @return busclassescode
     */
    public Long getBusclassescode() {
        return busclassescode;
    }

    /**
    * 设置-业务险种代码
    * @paramType java.lang.Long
    * @param busclassescode - 业务险种代码
     */
    public void setBusclassescode(Long busclassescode) {
        this.busclassescode = busclassescode;
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
    * 获取-发票开具险类代码
    * @return classkind
     */
    public String getClasskind() {
        return classkind;
    }

    /**
    * 设置-发票开具险类代码
    * @paramType java.lang.String
    * @param classkind - 发票开具险类代码
     */
    public void setClasskind(String classkind) {
        this.classkind = classkind;
    }

    /**
    * 获取-发票开具险类名称
    * @return classkindname
     */
    public String getClasskindname() {
        return classkindname;
    }

    /**
    * 设置-发票开具险类名称
    * @paramType java.lang.String
    * @param classkindname - 发票开具险类名称
     */
    public void setClasskindname(String classkindname) {
        this.classkindname = classkindname;
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
    * 获取-业务险种名称
    * @return busclassesname
     */
    public String getBusclassesname() {
        return busclassesname;
    }

    /**
    * 设置-业务险种名称
    * @paramType java.lang.String
    * @param busclassesname - 业务险种名称
     */
    public void setBusclassesname(String busclassesname) {
        this.busclassesname = busclassesname;
    }
}