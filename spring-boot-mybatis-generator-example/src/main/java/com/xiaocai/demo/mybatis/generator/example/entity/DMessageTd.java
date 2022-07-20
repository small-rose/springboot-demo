package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : d_message_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class DMessageTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 通知类型  mail：邮件 、message:短信 、
     */
    private String type;

    /**
     * 环节，后台自动解析autoAnalysis
     */
    private String source;

    /**
     * 内容
     */
    private String cotent;

    /**
     * 发件人
     */
    private String sender;

    /**
     * 接收人，有多个接收人以逗号隔开，发送程序统一处理
     */
    private String receiver;

    /**
     * 用来关联具体异常环节的数据，若有id，可以写入这里，如自动核对时写入相关id
     */
    private String key1;

    /**
     * 用来关联具体异常环节的数据，若没有id，可以写入一段小描述，如对账单解析时写入文件名
     */
    private String key2;

    /**
     * 时间截
     */
    private Date timestamp;

    /**
     * 发送状态 00待发送 11已发送 Z1待重发
     */
    private String status;

    /**
     * 发送时间
     */
    private Date sendtime;

    /**
     * 发送异常信息
     */
    private String msg;

    /**
     * 发送次数
     */
    private Integer cout;

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
    * 获取-通知类型  mail：邮件 、message:短信 、
    * @return type
     */
    public String getType() {
        return type;
    }

    /**
    * 设置-通知类型  mail：邮件 、message:短信 、
    * @paramType java.lang.String
    * @param type - 通知类型  mail：邮件 、message:短信 、
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
    * 获取-环节，后台自动解析autoAnalysis
    * @return source
     */
    public String getSource() {
        return source;
    }

    /**
    * 设置-环节，后台自动解析autoAnalysis
    * @paramType java.lang.String
    * @param source - 环节，后台自动解析autoAnalysis
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
    * 获取-内容
    * @return cotent
     */
    public String getCotent() {
        return cotent;
    }

    /**
    * 设置-内容
    * @paramType java.lang.String
    * @param cotent - 内容
     */
    public void setCotent(String cotent) {
        this.cotent = cotent;
    }

    /**
    * 获取-发件人
    * @return sender
     */
    public String getSender() {
        return sender;
    }

    /**
    * 设置-发件人
    * @paramType java.lang.String
    * @param sender - 发件人
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
    * 获取-接收人，有多个接收人以逗号隔开，发送程序统一处理
    * @return receiver
     */
    public String getReceiver() {
        return receiver;
    }

    /**
    * 设置-接收人，有多个接收人以逗号隔开，发送程序统一处理
    * @paramType java.lang.String
    * @param receiver - 接收人，有多个接收人以逗号隔开，发送程序统一处理
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
    * 获取-用来关联具体异常环节的数据，若有id，可以写入这里，如自动核对时写入相关id
    * @return key1
     */
    public String getKey1() {
        return key1;
    }

    /**
    * 设置-用来关联具体异常环节的数据，若有id，可以写入这里，如自动核对时写入相关id
    * @paramType java.lang.String
    * @param key1 - 用来关联具体异常环节的数据，若有id，可以写入这里，如自动核对时写入相关id
     */
    public void setKey1(String key1) {
        this.key1 = key1;
    }

    /**
    * 获取-用来关联具体异常环节的数据，若没有id，可以写入一段小描述，如对账单解析时写入文件名
    * @return key2
     */
    public String getKey2() {
        return key2;
    }

    /**
    * 设置-用来关联具体异常环节的数据，若没有id，可以写入一段小描述，如对账单解析时写入文件名
    * @paramType java.lang.String
    * @param key2 - 用来关联具体异常环节的数据，若没有id，可以写入一段小描述，如对账单解析时写入文件名
     */
    public void setKey2(String key2) {
        this.key2 = key2;
    }

    /**
    * 获取-时间截
    * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
    * 设置-时间截
    * @paramType java.util.Date
    * @param timestamp - 时间截
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
    * 获取-发送状态 00待发送 11已发送 Z1待重发
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-发送状态 00待发送 11已发送 Z1待重发
    * @paramType java.lang.String
    * @param status - 发送状态 00待发送 11已发送 Z1待重发
     */
    public void setStatus(String status) {
        this.status = status;
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
    * 获取-发送异常信息
    * @return msg
     */
    public String getMsg() {
        return msg;
    }

    /**
    * 设置-发送异常信息
    * @paramType java.lang.String
    * @param msg - 发送异常信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
    * 获取-发送次数
    * @return cout
     */
    public Integer getCout() {
        return cout;
    }

    /**
    * 设置-发送次数
    * @paramType java.lang.Integer
    * @param cout - 发送次数
     */
    public void setCout(Integer cout) {
        this.cout = cout;
    }
}