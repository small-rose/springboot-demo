package com.xiaocai.demo.dynamic.entity;

import java.util.Date;

/**
 *  
 * @Table : t_order
 * @author : zzy
 * @date : 2022-03-12 15:51:51
 * @modify : 
 */
public class TOrder {
    /**
     * id
     */
    private Long id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 账户id
     */
    private Long accId;

    /**
     * 订单总金额
     */
    private Long totalAmount;

    /**
     * 订单创建时间
     */
    private Date creatTime;

    /**
     * 订单取消时间
     */
    private Date cancelTime;

    /**
     * 订单送达日期
     */
    private Date reachDate;

    /**
     * 备注
     */
    private String mark;

    /**
    * 获取-id
    * @return id
     */
    public Long getId() {
        return id;
    }

    /**
    * 设置-id
    * @paramType java.lang.Long
    * @param id - id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    * 获取-订单号
    * @return orderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
    * 设置-订单号
    * @paramType java.lang.String
    * @param orderNo - 订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
    * 获取-账户id
    * @return accId
     */
    public Long getAccId() {
        return accId;
    }

    /**
    * 设置-账户id
    * @paramType java.lang.Long
    * @param accId - 账户id
     */
    public void setAccId(Long accId) {
        this.accId = accId;
    }

    /**
    * 获取-订单总金额
    * @return totalAmount
     */
    public Long getTotalAmount() {
        return totalAmount;
    }

    /**
    * 设置-订单总金额
    * @paramType java.lang.Long
    * @param totalAmount - 订单总金额
     */
    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
    * 获取-订单创建时间
    * @return creatTime
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
    * 设置-订单创建时间
    * @paramType java.util.Date
    * @param creatTime - 订单创建时间
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
    * 获取-订单取消时间
    * @return cancelTime
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
    * 设置-订单取消时间
    * @paramType java.util.Date
    * @param cancelTime - 订单取消时间
     */
    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    /**
    * 获取-订单送达日期
    * @return reachDate
     */
    public Date getReachDate() {
        return reachDate;
    }

    /**
    * 设置-订单送达日期
    * @paramType java.util.Date
    * @param reachDate - 订单送达日期
     */
    public void setReachDate(Date reachDate) {
        this.reachDate = reachDate;
    }

    /**
    * 获取-备注
    * @return mark
     */
    public String getMark() {
        return mark;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param mark - 备注
     */
    public void setMark(String mark) {
        this.mark = mark;
    }
}