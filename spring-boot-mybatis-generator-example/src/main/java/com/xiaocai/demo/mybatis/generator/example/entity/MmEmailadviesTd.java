package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_emailadvies_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmEmailadviesTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 邮件通知的类型，目前只有“1-可以做结算单，2-结算单撤销，3-结算单失败”
     */
    private String emailtype;

    /**
     * 邮件通知的分公司
     */
    private String subcompany;

    /**
     * 邮件通知的城市
     */
    private String department;

    /**
     * 邮件通知的渠道
     */
    private String channel;

    /**
     * 操作人
     */
    private String opcode;

    /**
     * 最后操作人
     */
    private String lastopcode;

    /**
     * 创建时间
     */
    private Date createdate;

    /**
     * 最后修改时间
     */
    private Date lastopdatae;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 备注
     */
    private String description;

    /**
     * 备用字段
     */
    private String segment;

    /**
     * 备用字段1
     */
    private String segment1;

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
    * 获取-邮件通知的类型，目前只有“1-可以做结算单，2-结算单撤销，3-结算单失败”
    * @return emailtype
     */
    public String getEmailtype() {
        return emailtype;
    }

    /**
    * 设置-邮件通知的类型，目前只有“1-可以做结算单，2-结算单撤销，3-结算单失败”
    * @paramType java.lang.String
    * @param emailtype - 邮件通知的类型，目前只有“1-可以做结算单，2-结算单撤销，3-结算单失败”
     */
    public void setEmailtype(String emailtype) {
        this.emailtype = emailtype;
    }

    /**
    * 获取-邮件通知的分公司
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-邮件通知的分公司
    * @paramType java.lang.String
    * @param subcompany - 邮件通知的分公司
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-邮件通知的城市
    * @return department
     */
    public String getDepartment() {
        return department;
    }

    /**
    * 设置-邮件通知的城市
    * @paramType java.lang.String
    * @param department - 邮件通知的城市
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
    * 获取-邮件通知的渠道
    * @return channel
     */
    public String getChannel() {
        return channel;
    }

    /**
    * 设置-邮件通知的渠道
    * @paramType java.lang.String
    * @param channel - 邮件通知的渠道
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
    * 获取-操作人
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作人
    * @paramType java.lang.String
    * @param opcode - 操作人
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-最后操作人
    * @return lastopcode
     */
    public String getLastopcode() {
        return lastopcode;
    }

    /**
    * 设置-最后操作人
    * @paramType java.lang.String
    * @param lastopcode - 最后操作人
     */
    public void setLastopcode(String lastopcode) {
        this.lastopcode = lastopcode;
    }

    /**
    * 获取-创建时间
    * @return createdate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
    * 设置-创建时间
    * @paramType java.util.Date
    * @param createdate - 创建时间
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
    * 获取-最后修改时间
    * @return lastopdatae
     */
    public Date getLastopdatae() {
        return lastopdatae;
    }

    /**
    * 设置-最后修改时间
    * @paramType java.util.Date
    * @param lastopdatae - 最后修改时间
     */
    public void setLastopdatae(Date lastopdatae) {
        this.lastopdatae = lastopdatae;
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

    /**
    * 获取-备用字段
    * @return segment
     */
    public String getSegment() {
        return segment;
    }

    /**
    * 设置-备用字段
    * @paramType java.lang.String
    * @param segment - 备用字段
     */
    public void setSegment(String segment) {
        this.segment = segment;
    }

    /**
    * 获取-备用字段1
    * @return segment1
     */
    public String getSegment1() {
        return segment1;
    }

    /**
    * 设置-备用字段1
    * @paramType java.lang.String
    * @param segment1 - 备用字段1
     */
    public void setSegment1(String segment1) {
        this.segment1 = segment1;
    }
}