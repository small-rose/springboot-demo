package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_reinsurer_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmReinsurerTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 物理表主键
     */
    private String seqreinsurer;

    /**
     * 再保人代码
     */
    private String reinsurercode;

    /**
     * 再保人名称
     */
    private String reinsurername;

    /**
     * 再保人英文名称
     */
    private String reinsurerenname;

    /**
     * 再保人地址
     */
    private String reinsureraddress;

    /**
     * 英文地址
     */
    private String reinsurerenaddress;

    /**
     * 联系电话
     */
    private String reinsurertel;

    /**
     * 联系人名称
     */
    private String linkman;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后修改时间
     */
    private Date lastopdate;

    /**
     * 状态 ,1:初始,2:落地成功:3:落地失败
     */
    private String status;

    /**
     * 数据来源
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
    * 获取-物理表主键
    * @return seqreinsurer
     */
    public String getSeqreinsurer() {
        return seqreinsurer;
    }

    /**
    * 设置-物理表主键
    * @paramType java.lang.String
    * @param seqreinsurer - 物理表主键
     */
    public void setSeqreinsurer(String seqreinsurer) {
        this.seqreinsurer = seqreinsurer;
    }

    /**
    * 获取-再保人代码
    * @return reinsurercode
     */
    public String getReinsurercode() {
        return reinsurercode;
    }

    /**
    * 设置-再保人代码
    * @paramType java.lang.String
    * @param reinsurercode - 再保人代码
     */
    public void setReinsurercode(String reinsurercode) {
        this.reinsurercode = reinsurercode;
    }

    /**
    * 获取-再保人名称
    * @return reinsurername
     */
    public String getReinsurername() {
        return reinsurername;
    }

    /**
    * 设置-再保人名称
    * @paramType java.lang.String
    * @param reinsurername - 再保人名称
     */
    public void setReinsurername(String reinsurername) {
        this.reinsurername = reinsurername;
    }

    /**
    * 获取-再保人英文名称
    * @return reinsurerenname
     */
    public String getReinsurerenname() {
        return reinsurerenname;
    }

    /**
    * 设置-再保人英文名称
    * @paramType java.lang.String
    * @param reinsurerenname - 再保人英文名称
     */
    public void setReinsurerenname(String reinsurerenname) {
        this.reinsurerenname = reinsurerenname;
    }

    /**
    * 获取-再保人地址
    * @return reinsureraddress
     */
    public String getReinsureraddress() {
        return reinsureraddress;
    }

    /**
    * 设置-再保人地址
    * @paramType java.lang.String
    * @param reinsureraddress - 再保人地址
     */
    public void setReinsureraddress(String reinsureraddress) {
        this.reinsureraddress = reinsureraddress;
    }

    /**
    * 获取-英文地址
    * @return reinsurerenaddress
     */
    public String getReinsurerenaddress() {
        return reinsurerenaddress;
    }

    /**
    * 设置-英文地址
    * @paramType java.lang.String
    * @param reinsurerenaddress - 英文地址
     */
    public void setReinsurerenaddress(String reinsurerenaddress) {
        this.reinsurerenaddress = reinsurerenaddress;
    }

    /**
    * 获取-联系电话
    * @return reinsurertel
     */
    public String getReinsurertel() {
        return reinsurertel;
    }

    /**
    * 设置-联系电话
    * @paramType java.lang.String
    * @param reinsurertel - 联系电话
     */
    public void setReinsurertel(String reinsurertel) {
        this.reinsurertel = reinsurertel;
    }

    /**
    * 获取-联系人名称
    * @return linkman
     */
    public String getLinkman() {
        return linkman;
    }

    /**
    * 设置-联系人名称
    * @paramType java.lang.String
    * @param linkman - 联系人名称
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman;
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
    * 获取-最后修改时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后修改时间
    * @paramType java.util.Date
    * @param lastopdate - 最后修改时间
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-状态 ,1:初始,2:落地成功:3:落地失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态 ,1:初始,2:落地成功:3:落地失败
    * @paramType java.lang.String
    * @param status - 状态 ,1:初始,2:落地成功:3:落地失败
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-数据来源
    * @return source
     */
    public String getSource() {
        return source;
    }

    /**
    * 设置-数据来源
    * @paramType java.lang.String
    * @param source - 数据来源
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