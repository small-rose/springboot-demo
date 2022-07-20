package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_erp_outer_to
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmErpOuterTo {
    /**
     * 流水号
     */
    private Long id;

    /**
     * 00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误
     */
    private String status;

    /**
     * 生成时间
     */
    private Date createtime;

    /**
     * 最后操作时间
     */
    private Date optime;

    /**
     * 对应业务主键
     */
    private String objectid;

    /**
     * 备注
     */
    private String note;

    /**
     * 业务类型
     */
    private String type;

    /**
     * 批次号
     */
    private String batchid;

    /**
    * 获取-流水号
    * @return id
     */
    public Long getId() {
        return id;
    }

    /**
    * 设置-流水号
    * @paramType java.lang.Long
    * @param id - 流水号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    * 获取-00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误
    * @paramType java.lang.String
    * @param status - 00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-生成时间
    * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
    * 设置-生成时间
    * @paramType java.util.Date
    * @param createtime - 生成时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
    * 获取-最后操作时间
    * @return optime
     */
    public Date getOptime() {
        return optime;
    }

    /**
    * 设置-最后操作时间
    * @paramType java.util.Date
    * @param optime - 最后操作时间
     */
    public void setOptime(Date optime) {
        this.optime = optime;
    }

    /**
    * 获取-对应业务主键
    * @return objectid
     */
    public String getObjectid() {
        return objectid;
    }

    /**
    * 设置-对应业务主键
    * @paramType java.lang.String
    * @param objectid - 对应业务主键
     */
    public void setObjectid(String objectid) {
        this.objectid = objectid;
    }

    /**
    * 获取-备注
    * @return note
     */
    public String getNote() {
        return note;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param note - 备注
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
    * 获取-业务类型
    * @return type
     */
    public String getType() {
        return type;
    }

    /**
    * 设置-业务类型
    * @paramType java.lang.String
    * @param type - 业务类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
    * 获取-批次号
    * @return batchid
     */
    public String getBatchid() {
        return batchid;
    }

    /**
    * 设置-批次号
    * @paramType java.lang.String
    * @param batchid - 批次号
     */
    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }
}