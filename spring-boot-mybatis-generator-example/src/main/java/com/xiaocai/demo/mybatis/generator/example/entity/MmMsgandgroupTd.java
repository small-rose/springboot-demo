package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_msgandgroup_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmMsgandgroupTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 邮件或短信id,同mm_emailorsms_td中的MSGID
     */
    private Long msgid;

    /**
     * 通讯类型，1 短信 2 邮件
     */
    private String transtype;

    /**
     * 通知类型：1 余额不足， 2 大额审批，3 数据接入失败，4 电子发票短链接，5 认领核销审批，6 认领退款审批，7 日结复核失败，8 生成凭证失败
     */
    private String msgtype;

    /**
     * 收件人分组类型：BALANCE 余额不足;LARGEPAYCHECK 大额审批;DATAACCESSFAIL 数据接入失败;INVOICESHORTLINK 电子发票短链接;CHARGEOFFCHECK 认领核销审批;CHARGEBACKCHECK 认领退款审批;AUDITFAIL 日结复核失败;VOUCHERFAIL 凭证生成失败
     */
    private String grouptype;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 业务来源
     */
    private String datasource;

    /**
     * 邮箱地址，当此字段有值时使用，多个人时使用";"隔开
     */
    private String emailaddress;

    /**
     * 抄送地址，当此字段有值时使用，多个人时使用";"隔开
     */
    private String emailccaddress;

    /**
     * 电话号码，当此字段有值时使用，多个人时使用";"隔开
     */
    private String telphone;

    /**
     * 创建人
     */
    private String opcode;

    /**
     * 最后修改人
     */
    private String lastopcode;

    /**
     * 邮件发送状态，00初始，01已发送，02发送失败
     */
    private String status;

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
    * 获取-邮件或短信id,同mm_emailorsms_td中的MSGID
    * @return msgid
     */
    public Long getMsgid() {
        return msgid;
    }

    /**
    * 设置-邮件或短信id,同mm_emailorsms_td中的MSGID
    * @paramType java.lang.Long
    * @param msgid - 邮件或短信id,同mm_emailorsms_td中的MSGID
     */
    public void setMsgid(Long msgid) {
        this.msgid = msgid;
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
    * 获取-通知类型：1 余额不足， 2 大额审批，3 数据接入失败，4 电子发票短链接，5 认领核销审批，6 认领退款审批，7 日结复核失败，8 生成凭证失败
    * @return msgtype
     */
    public String getMsgtype() {
        return msgtype;
    }

    /**
    * 设置-通知类型：1 余额不足， 2 大额审批，3 数据接入失败，4 电子发票短链接，5 认领核销审批，6 认领退款审批，7 日结复核失败，8 生成凭证失败
    * @paramType java.lang.String
    * @param msgtype - 通知类型：1 余额不足， 2 大额审批，3 数据接入失败，4 电子发票短链接，5 认领核销审批，6 认领退款审批，7 日结复核失败，8 生成凭证失败
     */
    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    /**
    * 获取-收件人分组类型：BALANCE 余额不足;LARGEPAYCHECK 大额审批;DATAACCESSFAIL 数据接入失败;INVOICESHORTLINK 电子发票短链接;CHARGEOFFCHECK 认领核销审批;CHARGEBACKCHECK 认领退款审批;AUDITFAIL 日结复核失败;VOUCHERFAIL 凭证生成失败
    * @return grouptype
     */
    public String getGrouptype() {
        return grouptype;
    }

    /**
    * 设置-收件人分组类型：BALANCE 余额不足;LARGEPAYCHECK 大额审批;DATAACCESSFAIL 数据接入失败;INVOICESHORTLINK 电子发票短链接;CHARGEOFFCHECK 认领核销审批;CHARGEBACKCHECK 认领退款审批;AUDITFAIL 日结复核失败;VOUCHERFAIL 凭证生成失败
    * @paramType java.lang.String
    * @param grouptype - 收件人分组类型：BALANCE 余额不足;LARGEPAYCHECK 大额审批;DATAACCESSFAIL 数据接入失败;INVOICESHORTLINK 电子发票短链接;CHARGEOFFCHECK 认领核销审批;CHARGEBACKCHECK 认领退款审批;AUDITFAIL 日结复核失败;VOUCHERFAIL 凭证生成失败
     */
    public void setGrouptype(String grouptype) {
        this.grouptype = grouptype;
    }

    /**
    * 获取-分公司
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司
    * @paramType java.lang.String
    * @param subcompany - 分公司
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-业务来源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-业务来源
    * @paramType java.lang.String
    * @param datasource - 业务来源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-邮箱地址，当此字段有值时使用，多个人时使用";"隔开
    * @return emailaddress
     */
    public String getEmailaddress() {
        return emailaddress;
    }

    /**
    * 设置-邮箱地址，当此字段有值时使用，多个人时使用";"隔开
    * @paramType java.lang.String
    * @param emailaddress - 邮箱地址，当此字段有值时使用，多个人时使用";"隔开
     */
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    /**
    * 获取-抄送地址，当此字段有值时使用，多个人时使用";"隔开
    * @return emailccaddress
     */
    public String getEmailccaddress() {
        return emailccaddress;
    }

    /**
    * 设置-抄送地址，当此字段有值时使用，多个人时使用";"隔开
    * @paramType java.lang.String
    * @param emailccaddress - 抄送地址，当此字段有值时使用，多个人时使用";"隔开
     */
    public void setEmailccaddress(String emailccaddress) {
        this.emailccaddress = emailccaddress;
    }

    /**
    * 获取-电话号码，当此字段有值时使用，多个人时使用";"隔开
    * @return telphone
     */
    public String getTelphone() {
        return telphone;
    }

    /**
    * 设置-电话号码，当此字段有值时使用，多个人时使用";"隔开
    * @paramType java.lang.String
    * @param telphone - 电话号码，当此字段有值时使用，多个人时使用";"隔开
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone;
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
    * 获取-最后修改人
    * @return lastopcode
     */
    public String getLastopcode() {
        return lastopcode;
    }

    /**
    * 设置-最后修改人
    * @paramType java.lang.String
    * @param lastopcode - 最后修改人
     */
    public void setLastopcode(String lastopcode) {
        this.lastopcode = lastopcode;
    }

    /**
    * 获取-邮件发送状态，00初始，01已发送，02发送失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-邮件发送状态，00初始，01已发送，02发送失败
    * @paramType java.lang.String
    * @param status - 邮件发送状态，00初始，01已发送，02发送失败
     */
    public void setStatus(String status) {
        this.status = status;
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