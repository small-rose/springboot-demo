package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : t_consume_list
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class TConsumeList {
    /**
     * 主键
     */
    private Long no;

    /**
     * 申请号
     */
    private String applyno;

    /**
     * 交易流水号
     */
    private String tano;

    /**
     * 卡号
     */
    private String cardNo;

    /**
     * 消费金额
     */
    private String subAmount;

    /**
     * POS批次号
     */
    private String batchNo;

    /**
     * POS票据号
     */
    private String cashNo;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
    * 获取-主键
    * @return no
     */
    public Long getNo() {
        return no;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param no - 主键
     */
    public void setNo(Long no) {
        this.no = no;
    }

    /**
    * 获取-申请号
    * @return applyno
     */
    public String getApplyno() {
        return applyno;
    }

    /**
    * 设置-申请号
    * @paramType java.lang.String
    * @param applyno - 申请号
     */
    public void setApplyno(String applyno) {
        this.applyno = applyno;
    }

    /**
    * 获取-交易流水号
    * @return tano
     */
    public String getTano() {
        return tano;
    }

    /**
    * 设置-交易流水号
    * @paramType java.lang.String
    * @param tano - 交易流水号
     */
    public void setTano(String tano) {
        this.tano = tano;
    }

    /**
    * 获取-卡号
    * @return cardNo
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
    * 设置-卡号
    * @paramType java.lang.String
    * @param cardNo - 卡号
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
    * 获取-消费金额
    * @return subAmount
     */
    public String getSubAmount() {
        return subAmount;
    }

    /**
    * 设置-消费金额
    * @paramType java.lang.String
    * @param subAmount - 消费金额
     */
    public void setSubAmount(String subAmount) {
        this.subAmount = subAmount;
    }

    /**
    * 获取-POS批次号
    * @return batchNo
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
    * 设置-POS批次号
    * @paramType java.lang.String
    * @param batchNo - POS批次号
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    /**
    * 获取-POS票据号
    * @return cashNo
     */
    public String getCashNo() {
        return cashNo;
    }

    /**
    * 设置-POS票据号
    * @paramType java.lang.String
    * @param cashNo - POS票据号
     */
    public void setCashNo(String cashNo) {
        this.cashNo = cashNo;
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
}