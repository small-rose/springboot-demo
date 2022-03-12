package com.xiaocai.demo.mutilds.model.mysql;

import java.math.BigDecimal;
import java.util.Date;

public class MysqlOrder {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.ID
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.order_no
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    private String orderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.acc_id
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    private Long accId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.total_amount
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    private BigDecimal totalAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.creat_time
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    private Date creatTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.cancel_time
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    private Date cancelTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.reach_date
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    private Date reachDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.mark
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    private String mark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.ID
     *
     * @return the value of t_order.ID
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.ID
     *
     * @param id the value for t_order.ID
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.order_no
     *
     * @return the value of t_order.order_no
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.order_no
     *
     * @param orderNo the value for t_order.order_no
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.acc_id
     *
     * @return the value of t_order.acc_id
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    public Long getAccId() {
        return accId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.acc_id
     *
     * @param accId the value for t_order.acc_id
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    public void setAccId(Long accId) {
        this.accId = accId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.total_amount
     *
     * @return the value of t_order.total_amount
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.total_amount
     *
     * @param totalAmount the value for t_order.total_amount
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.creat_time
     *
     * @return the value of t_order.creat_time
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.creat_time
     *
     * @param creatTime the value for t_order.creat_time
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.cancel_time
     *
     * @return the value of t_order.cancel_time
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.cancel_time
     *
     * @param cancelTime the value for t_order.cancel_time
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.reach_date
     *
     * @return the value of t_order.reach_date
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    public Date getReachDate() {
        return reachDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.reach_date
     *
     * @param reachDate the value for t_order.reach_date
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    public void setReachDate(Date reachDate) {
        this.reachDate = reachDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.mark
     *
     * @return the value of t_order.mark
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    public String getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.mark
     *
     * @param mark the value for t_order.mark
     *
     * @mbg.generated Thu Feb 24 14:14:50 CST 2022
     */
    public void setMark(String mark) {
        this.mark = mark;
    }
}