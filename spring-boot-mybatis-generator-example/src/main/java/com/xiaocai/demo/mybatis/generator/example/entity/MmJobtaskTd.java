package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_jobtask_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmJobtaskTd {
    /**
     * 业务号
     */
    private String businessno;

    /**
     * 任务类型:JFCD_MATCH见费出单核销、 POLICY_ONWAY保单到账挂在途、FUNDPAY 银企直连付款
     */
    private String tasktype;

    /**
     * 状态：1 未处理 、2成功、3失败
     */
    private String status;

    /**
     * 出错信息
     */
    private String errmsg;

    /**
     * 处理次数
     */
    private Integer count;

    /**
     * 操作人
     */
    private String opcode;

    /**
     * 最后操作人
     */
    private String lastopcode;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 备用字段1
     */
    private String segment1;

    /**
     * 备用字段2
     */
    private String segment2;

    /**
     * 备用字段3
     */
    private String segment3;

    /**
    * 获取-业务号
    * @return businessno
     */
    public String getBusinessno() {
        return businessno;
    }

    /**
    * 设置-业务号
    * @paramType java.lang.String
    * @param businessno - 业务号
     */
    public void setBusinessno(String businessno) {
        this.businessno = businessno;
    }

    /**
    * 获取-任务类型:JFCD_MATCH见费出单核销、 POLICY_ONWAY保单到账挂在途、FUNDPAY 银企直连付款
    * @return tasktype
     */
    public String getTasktype() {
        return tasktype;
    }

    /**
    * 设置-任务类型:JFCD_MATCH见费出单核销、 POLICY_ONWAY保单到账挂在途、FUNDPAY 银企直连付款
    * @paramType java.lang.String
    * @param tasktype - 任务类型:JFCD_MATCH见费出单核销、 POLICY_ONWAY保单到账挂在途、FUNDPAY 银企直连付款
     */
    public void setTasktype(String tasktype) {
        this.tasktype = tasktype;
    }

    /**
    * 获取-状态：1 未处理 、2成功、3失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态：1 未处理 、2成功、3失败
    * @paramType java.lang.String
    * @param status - 状态：1 未处理 、2成功、3失败
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-出错信息
    * @return errmsg
     */
    public String getErrmsg() {
        return errmsg;
    }

    /**
    * 设置-出错信息
    * @paramType java.lang.String
    * @param errmsg - 出错信息
     */
    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    /**
    * 获取-处理次数
    * @return count
     */
    public Integer getCount() {
        return count;
    }

    /**
    * 设置-处理次数
    * @paramType java.lang.Integer
    * @param count - 处理次数
     */
    public void setCount(Integer count) {
        this.count = count;
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

    /**
    * 获取-备用字段2
    * @return segment2
     */
    public String getSegment2() {
        return segment2;
    }

    /**
    * 设置-备用字段2
    * @paramType java.lang.String
    * @param segment2 - 备用字段2
     */
    public void setSegment2(String segment2) {
        this.segment2 = segment2;
    }

    /**
    * 获取-备用字段3
    * @return segment3
     */
    public String getSegment3() {
        return segment3;
    }

    /**
    * 设置-备用字段3
    * @paramType java.lang.String
    * @param segment3 - 备用字段3
     */
    public void setSegment3(String segment3) {
        this.segment3 = segment3;
    }
}