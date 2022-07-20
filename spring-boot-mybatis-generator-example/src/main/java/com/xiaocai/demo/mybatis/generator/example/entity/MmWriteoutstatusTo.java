package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_writeoutstatus_to
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmWriteoutstatusTo {
    /**
     * 主键
     */
    private Long id;

    /**
     * 传送批次号
     */
    private String batchId;

    /**
     * 回写的数据源
     */
    private String datasource;

    /**
     * 回写类型：1;承保,2:赔款,3:手续费,4:再保
     */
    private String writeouttype;

    /**
     * 传送状态：00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误
     */
    private String status;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 代理点代码(用来判断是否要回写渠道系统)
     */
    private String agentcode;

    /**
     * 回写次数
     */
    private Long count;

    /**
     * 接口服务方返回码
     */
    private String rtncode;

    /**
     * 接口服务方返回描述
     */
    private String rtnmsg;

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
    * 获取-传送批次号
    * @return batchId
     */
    public String getBatchId() {
        return batchId;
    }

    /**
    * 设置-传送批次号
    * @paramType java.lang.String
    * @param batchId - 传送批次号
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    /**
    * 获取-回写的数据源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-回写的数据源
    * @paramType java.lang.String
    * @param datasource - 回写的数据源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-回写类型：1;承保,2:赔款,3:手续费,4:再保
    * @return writeouttype
     */
    public String getWriteouttype() {
        return writeouttype;
    }

    /**
    * 设置-回写类型：1;承保,2:赔款,3:手续费,4:再保
    * @paramType java.lang.String
    * @param writeouttype - 回写类型：1;承保,2:赔款,3:手续费,4:再保
     */
    public void setWriteouttype(String writeouttype) {
        this.writeouttype = writeouttype;
    }

    /**
    * 获取-传送状态：00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-传送状态：00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误
    * @paramType java.lang.String
    * @param status - 传送状态：00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误
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
    * 获取-代理点代码(用来判断是否要回写渠道系统)
    * @return agentcode
     */
    public String getAgentcode() {
        return agentcode;
    }

    /**
    * 设置-代理点代码(用来判断是否要回写渠道系统)
    * @paramType java.lang.String
    * @param agentcode - 代理点代码(用来判断是否要回写渠道系统)
     */
    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode;
    }

    /**
    * 获取-回写次数
    * @return count
     */
    public Long getCount() {
        return count;
    }

    /**
    * 设置-回写次数
    * @paramType java.lang.Long
    * @param count - 回写次数
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
    * 获取-接口服务方返回码
    * @return rtncode
     */
    public String getRtncode() {
        return rtncode;
    }

    /**
    * 设置-接口服务方返回码
    * @paramType java.lang.String
    * @param rtncode - 接口服务方返回码
     */
    public void setRtncode(String rtncode) {
        this.rtncode = rtncode;
    }

    /**
    * 获取-接口服务方返回描述
    * @return rtnmsg
     */
    public String getRtnmsg() {
        return rtnmsg;
    }

    /**
    * 设置-接口服务方返回描述
    * @paramType java.lang.String
    * @param rtnmsg - 接口服务方返回描述
     */
    public void setRtnmsg(String rtnmsg) {
        this.rtnmsg = rtnmsg;
    }
}