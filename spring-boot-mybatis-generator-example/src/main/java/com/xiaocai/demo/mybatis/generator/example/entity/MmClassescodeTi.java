package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_classescode_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmClassescodeTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * MM_CLASSESCODE_TC主键
     */
    private Long seqclasses;

    /**
     * 险种代码
     */
    private String classescode;

    /**
     * 险种名称
     */
    private String classescodename;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 落地状态
     */
    private String status;

    /**
     * 系统来源
     */
    private String source;

    /**
     * 版本号
     */
    private Integer hibernateversion;

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
    * 获取-MM_CLASSESCODE_TC主键
    * @return seqclasses
     */
    public Long getSeqclasses() {
        return seqclasses;
    }

    /**
    * 设置-MM_CLASSESCODE_TC主键
    * @paramType java.lang.Long
    * @param seqclasses - MM_CLASSESCODE_TC主键
     */
    public void setSeqclasses(Long seqclasses) {
        this.seqclasses = seqclasses;
    }

    /**
    * 获取-险种代码
    * @return classescode
     */
    public String getClassescode() {
        return classescode;
    }

    /**
    * 设置-险种代码
    * @paramType java.lang.String
    * @param classescode - 险种代码
     */
    public void setClassescode(String classescode) {
        this.classescode = classescode;
    }

    /**
    * 获取-险种名称
    * @return classescodename
     */
    public String getClassescodename() {
        return classescodename;
    }

    /**
    * 设置-险种名称
    * @paramType java.lang.String
    * @param classescodename - 险种名称
     */
    public void setClassescodename(String classescodename) {
        this.classescodename = classescodename;
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
    * 获取-落地状态
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-落地状态
    * @paramType java.lang.String
    * @param status - 落地状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-系统来源
    * @return source
     */
    public String getSource() {
        return source;
    }

    /**
    * 设置-系统来源
    * @paramType java.lang.String
    * @param source - 系统来源
     */
    public void setSource(String source) {
        this.source = source;
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
}