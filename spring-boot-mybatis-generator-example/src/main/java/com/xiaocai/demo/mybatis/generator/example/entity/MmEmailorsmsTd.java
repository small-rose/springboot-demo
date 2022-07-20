package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_emailorsms_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmEmailorsmsTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 邮件或短信id
     */
    private Long msgid;

    /**
     * 信息标题
     */
    private String msgtitle;

    /**
     * 信息头
     */
    private String msghead;

    /**
     * 信息尾
     */
    private String msgtail;

    /**
     * 信息正文内容
     */
    private String contents;

    /**
     * 创建人
     */
    private String opcode;

    /**
     * 是否有效，0-否，1-是
     */
    private String ifvalid;

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
     * 备注
     */
    private String description;

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
    * 获取-邮件或短信id
    * @return msgid
     */
    public Long getMsgid() {
        return msgid;
    }

    /**
    * 设置-邮件或短信id
    * @paramType java.lang.Long
    * @param msgid - 邮件或短信id
     */
    public void setMsgid(Long msgid) {
        this.msgid = msgid;
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
    * 获取-信息正文内容
    * @return contents
     */
    public String getContents() {
        return contents;
    }

    /**
    * 设置-信息正文内容
    * @paramType java.lang.String
    * @param contents - 信息正文内容
     */
    public void setContents(String contents) {
        this.contents = contents;
    }

    /**
    * 获取-创建人
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-创建人
    * @paramType java.lang.String
    * @param opcode - 创建人
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-是否有效，0-否，1-是
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否有效，0-否，1-是
    * @paramType java.lang.String
    * @param ifvalid - 是否有效，0-否，1-是
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
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
    * 获取-备注
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param description - 备注
     */
    public void setDescription(String description) {
        this.description = description;
    }
}