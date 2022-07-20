package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_sendmessage_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmSendmessageTc {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 关联业务表主键
     */
    private Long seqno;

    /**
     * 1短信，2邮件
     */
    private String mark;

    /**
     * 模板类型
     */
    private String type;

    /**
     * 发送状态（0未发送，1已发送，3发送失败）
     */
    private String sendstatus;

    /**
     * 内容
     */
    private String message;

    /**
     * 内容分隔符
     */
    private String messagesplit;

    /**
     * 收件人/收信人
     */
    private String receiver;

    /**
     * 发送时间
     */
    private Date sendtime;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
    * 获取-主键id
    * @return id
     */
    public Long getId() {
        return id;
    }

    /**
    * 设置-主键id
    * @paramType java.lang.Long
    * @param id - 主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    * 获取-关联业务表主键
    * @return seqno
     */
    public Long getSeqno() {
        return seqno;
    }

    /**
    * 设置-关联业务表主键
    * @paramType java.lang.Long
    * @param seqno - 关联业务表主键
     */
    public void setSeqno(Long seqno) {
        this.seqno = seqno;
    }

    /**
    * 获取-1短信，2邮件
    * @return mark
     */
    public String getMark() {
        return mark;
    }

    /**
    * 设置-1短信，2邮件
    * @paramType java.lang.String
    * @param mark - 1短信，2邮件
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
    * 获取-模板类型
    * @return type
     */
    public String getType() {
        return type;
    }

    /**
    * 设置-模板类型
    * @paramType java.lang.String
    * @param type - 模板类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
    * 获取-发送状态（0未发送，1已发送，3发送失败）
    * @return sendstatus
     */
    public String getSendstatus() {
        return sendstatus;
    }

    /**
    * 设置-发送状态（0未发送，1已发送，3发送失败）
    * @paramType java.lang.String
    * @param sendstatus - 发送状态（0未发送，1已发送，3发送失败）
     */
    public void setSendstatus(String sendstatus) {
        this.sendstatus = sendstatus;
    }

    /**
    * 获取-内容
    * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
    * 设置-内容
    * @paramType java.lang.String
    * @param message - 内容
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
    * 获取-内容分隔符
    * @return messagesplit
     */
    public String getMessagesplit() {
        return messagesplit;
    }

    /**
    * 设置-内容分隔符
    * @paramType java.lang.String
    * @param messagesplit - 内容分隔符
     */
    public void setMessagesplit(String messagesplit) {
        this.messagesplit = messagesplit;
    }

    /**
    * 获取-收件人/收信人
    * @return receiver
     */
    public String getReceiver() {
        return receiver;
    }

    /**
    * 设置-收件人/收信人
    * @paramType java.lang.String
    * @param receiver - 收件人/收信人
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
    * 获取-发送时间
    * @return sendtime
     */
    public Date getSendtime() {
        return sendtime;
    }

    /**
    * 设置-发送时间
    * @paramType java.util.Date
    * @param sendtime - 发送时间
     */
    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
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
}