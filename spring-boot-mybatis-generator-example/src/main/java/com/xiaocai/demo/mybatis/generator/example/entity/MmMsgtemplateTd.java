package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_msgtemplate_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmMsgtemplateTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 通讯类型，1 短信 2 邮件
     */
    private String transtype;

    /**
     * 分组类型，不同分组，模板不一样
     */
    private String grouptype;

    /**
     * 信息标题
     */
    private String msgtitle;

    /**
     * 信息头
     */
    private String msghead;

    /**
     * 信息正文模板
     */
    private String content;

    /**
     * 信息尾
     */
    private String msgtail;

    /**
     * 是否有效
     */
    private String ifvalid;

    /**
     * 描述
     */
    private String description;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后修改时间
     */
    private Date lastopdate;

    /**
     * 版本
     */
    private Integer hibernateversion;

    /**
     * 数据修改说明
     */
    private String modifydesc;

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
    * 获取-通讯类型，1 短信 2 邮件
    * @return transtype
     */
    public String getTranstype() {
        return transtype;
    }

    /**
    * 设置-通讯类型，1 短信 2 邮件
    * @paramType java.lang.String
    * @param transtype - 通讯类型，1 短信 2 邮件
     */
    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }

    /**
    * 获取-分组类型，不同分组，模板不一样
    * @return grouptype
     */
    public String getGrouptype() {
        return grouptype;
    }

    /**
    * 设置-分组类型，不同分组，模板不一样
    * @paramType java.lang.String
    * @param grouptype - 分组类型，不同分组，模板不一样
     */
    public void setGrouptype(String grouptype) {
        this.grouptype = grouptype;
    }

    /**
    * 获取-信息标题
    * @return msgtitle
     */
    public String getMsgtitle() {
        return msgtitle;
    }

    /**
    * 设置-信息标题
    * @paramType java.lang.String
    * @param msgtitle - 信息标题
     */
    public void setMsgtitle(String msgtitle) {
        this.msgtitle = msgtitle;
    }

    /**
    * 获取-信息头
    * @return msghead
     */
    public String getMsghead() {
        return msghead;
    }

    /**
    * 设置-信息头
    * @paramType java.lang.String
    * @param msghead - 信息头
     */
    public void setMsghead(String msghead) {
        this.msghead = msghead;
    }

    /**
    * 获取-信息正文模板
    * @return content
     */
    public String getContent() {
        return content;
    }

    /**
    * 设置-信息正文模板
    * @paramType java.lang.String
    * @param content - 信息正文模板
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
    * 获取-信息尾
    * @return msgtail
     */
    public String getMsgtail() {
        return msgtail;
    }

    /**
    * 设置-信息尾
    * @paramType java.lang.String
    * @param msgtail - 信息尾
     */
    public void setMsgtail(String msgtail) {
        this.msgtail = msgtail;
    }

    /**
    * 获取-是否有效
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否有效
    * @paramType java.lang.String
    * @param ifvalid - 是否有效
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
    }

    /**
    * 获取-描述
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-描述
    * @paramType java.lang.String
    * @param description - 描述
     */
    public void setDescription(String description) {
        this.description = description;
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
    * 获取-版本
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本
    * @paramType java.lang.Integer
    * @param hibernateversion - 版本
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-数据修改说明
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-数据修改说明
    * @paramType java.lang.String
    * @param modifydesc - 数据修改说明
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }
}