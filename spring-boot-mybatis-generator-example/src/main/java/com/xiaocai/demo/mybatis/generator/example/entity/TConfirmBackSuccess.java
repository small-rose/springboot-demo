package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : t_confirm_back_success
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class TConfirmBackSuccess {
    /**
     * 主键
     */
    private Long no;

    /**
     * 申请号
     */
    private String applyno;

    /**
     * 支付方式
     */
    private String type;

    /**
     * 回复次数
     */
    private String num;

    /**
     * 状态
     */
    private String status;

    /**
     * 记录是支付成功还是支付失败( 1 收付成功    2 收付失败(需要说明原因))
     */
    private String paystatus;

    /**
     * 银行确认时间(yyyyMMddHHmmss)
     */
    private String consumetime;

    /**
     * 最后处理时间(yyyy-MM-dd HH:mm:ss)
     */
    private Date handletime;

    /**
     * 业务单据号
     */
    private String businessno;

    /**
     * 业务类型
     */
    private String businesstype;

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
    * 获取-支付方式
    * @return type
     */
    public String getType() {
        return type;
    }

    /**
    * 设置-支付方式
    * @paramType java.lang.String
    * @param type - 支付方式
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
    * 获取-回复次数
    * @return num
     */
    public String getNum() {
        return num;
    }

    /**
    * 设置-回复次数
    * @paramType java.lang.String
    * @param num - 回复次数
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**
    * 获取-状态
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态
    * @paramType java.lang.String
    * @param status - 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-记录是支付成功还是支付失败( 1 收付成功    2 收付失败(需要说明原因))
    * @return paystatus
     */
    public String getPaystatus() {
        return paystatus;
    }

    /**
    * 设置-记录是支付成功还是支付失败( 1 收付成功    2 收付失败(需要说明原因))
    * @paramType java.lang.String
    * @param paystatus - 记录是支付成功还是支付失败( 1 收付成功    2 收付失败(需要说明原因))
     */
    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus;
    }

    /**
    * 获取-银行确认时间(yyyyMMddHHmmss)
    * @return consumetime
     */
    public String getConsumetime() {
        return consumetime;
    }

    /**
    * 设置-银行确认时间(yyyyMMddHHmmss)
    * @paramType java.lang.String
    * @param consumetime - 银行确认时间(yyyyMMddHHmmss)
     */
    public void setConsumetime(String consumetime) {
        this.consumetime = consumetime;
    }

    /**
    * 获取-最后处理时间(yyyy-MM-dd HH:mm:ss)
    * @return handletime
     */
    public Date getHandletime() {
        return handletime;
    }

    /**
    * 设置-最后处理时间(yyyy-MM-dd HH:mm:ss)
    * @paramType java.util.Date
    * @param handletime - 最后处理时间(yyyy-MM-dd HH:mm:ss)
     */
    public void setHandletime(Date handletime) {
        this.handletime = handletime;
    }

    /**
    * 获取-业务单据号
    * @return businessno
     */
    public String getBusinessno() {
        return businessno;
    }

    /**
    * 设置-业务单据号
    * @paramType java.lang.String
    * @param businessno - 业务单据号
     */
    public void setBusinessno(String businessno) {
        this.businessno = businessno;
    }

    /**
    * 获取-业务类型
    * @return businesstype
     */
    public String getBusinesstype() {
        return businesstype;
    }

    /**
    * 设置-业务类型
    * @paramType java.lang.String
    * @param businesstype - 业务类型
     */
    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype;
    }
}