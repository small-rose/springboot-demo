package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : d_paytype
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class DPaytype {
    /**
     * 主键
     */
    private Long id;

    /**
     * 支付类型1人工确认，2自动确认
     */
    private String paytype;

    /**
     * 支付方式01 现金收款、02 POS刷卡、03 客户转账、04 批量扣款、 05 银保通、06 支票收款、07 WEB在线支付、08 快钱垫付、 09语音在线支付、98上海平台
     */
    private String payway;

    /**
     * 消费渠道对应d_user表userid
     */
    private String paychannel;

    /**
     * 是否走在途1是,0否
     */
    private String iffund;

    /**
     * 业务开展范围：具体分公司代码
     */
    private String subcompany;

    /**
     * 险种范围：具体险种代码
     */
    private String classcode;

    /**
     * 操作人
     */
    private String opcode;

    /**
     * 操作时间
     */
    private Date opdate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 手工修改
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
    * 获取-支付类型1人工确认，2自动确认
    * @return paytype
     */
    public String getPaytype() {
        return paytype;
    }

    /**
    * 设置-支付类型1人工确认，2自动确认
    * @paramType java.lang.String
    * @param paytype - 支付类型1人工确认，2自动确认
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    /**
    * 获取-支付方式01 现金收款、02 POS刷卡、03 客户转账、04 批量扣款、
05 银保通、06 支票收款、07 WEB在线支付、08 快钱垫付、
09语音在线支付、98上海平台
    * @return payway
     */
    public String getPayway() {
        return payway;
    }

    /**
    * 设置-支付方式01 现金收款、02 POS刷卡、03 客户转账、04 批量扣款、
05 银保通、06 支票收款、07 WEB在线支付、08 快钱垫付、
09语音在线支付、98上海平台
    * @paramType java.lang.String
    * @param payway - 支付方式01 现金收款、02 POS刷卡、03 客户转账、04 批量扣款、
05 银保通、06 支票收款、07 WEB在线支付、08 快钱垫付、
09语音在线支付、98上海平台
     */
    public void setPayway(String payway) {
        this.payway = payway;
    }

    /**
    * 获取-消费渠道对应d_user表userid
    * @return paychannel
     */
    public String getPaychannel() {
        return paychannel;
    }

    /**
    * 设置-消费渠道对应d_user表userid
    * @paramType java.lang.String
    * @param paychannel - 消费渠道对应d_user表userid
     */
    public void setPaychannel(String paychannel) {
        this.paychannel = paychannel;
    }

    /**
    * 获取-是否走在途1是,0否
    * @return iffund
     */
    public String getIffund() {
        return iffund;
    }

    /**
    * 设置-是否走在途1是,0否
    * @paramType java.lang.String
    * @param iffund - 是否走在途1是,0否
     */
    public void setIffund(String iffund) {
        this.iffund = iffund;
    }

    /**
    * 获取-业务开展范围：具体分公司代码
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-业务开展范围：具体分公司代码
    * @paramType java.lang.String
    * @param subcompany - 业务开展范围：具体分公司代码
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-险种范围：具体险种代码
    * @return classcode
     */
    public String getClasscode() {
        return classcode;
    }

    /**
    * 设置-险种范围：具体险种代码
    * @paramType java.lang.String
    * @param classcode - 险种范围：具体险种代码
     */
    public void setClasscode(String classcode) {
        this.classcode = classcode;
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
    * 获取-操作时间
    * @return opdate
     */
    public Date getOpdate() {
        return opdate;
    }

    /**
    * 设置-操作时间
    * @paramType java.util.Date
    * @param opdate - 操作时间
     */
    public void setOpdate(Date opdate) {
        this.opdate = opdate;
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
    * 获取-手工修改
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改
    * @paramType java.lang.String
    * @param modifydesc - 手工修改
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }
}