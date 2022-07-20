package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;

/**
 *  
 * @Table : mm_querytaskcode_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmQuerytaskcodeTc {
    /**
     * 任务代码
     */
    private String taskcode;

    /**
     * 标识查询类型对应的处理实现类bean名称
     */
    private String tasktype;

    /**
     * 查询类型所属的模块的名称
     */
    private String modename;

    /**
     * 是否走后台任务调度，1为是，0为否，默认为1
     */
    private String isdispatch;

    /**
     * 任务权重
     */
    private BigDecimal power;

    /**
     * 是否过滤任务参数(默认为1，表示同一类型相同参数的任务只会有一个，0为否)
     */
    private String istaskfilt;

    /**
     * 异步任务执行SQL
     */
    private String sqlstr;

    /**
     * 文件名
     */
    private String fieldname;

    /**
    * 获取-任务代码
    * @return taskcode
     */
    public String getTaskcode() {
        return taskcode;
    }

    /**
    * 设置-任务代码
    * @paramType java.lang.String
    * @param taskcode - 任务代码
     */
    public void setTaskcode(String taskcode) {
        this.taskcode = taskcode;
    }

    /**
    * 获取-标识查询类型对应的处理实现类bean名称
    * @return tasktype
     */
    public String getTasktype() {
        return tasktype;
    }

    /**
    * 设置-标识查询类型对应的处理实现类bean名称
    * @paramType java.lang.String
    * @param tasktype - 标识查询类型对应的处理实现类bean名称
     */
    public void setTasktype(String tasktype) {
        this.tasktype = tasktype;
    }

    /**
    * 获取-查询类型所属的模块的名称
    * @return modename
     */
    public String getModename() {
        return modename;
    }

    /**
    * 设置-查询类型所属的模块的名称
    * @paramType java.lang.String
    * @param modename - 查询类型所属的模块的名称
     */
    public void setModename(String modename) {
        this.modename = modename;
    }

    /**
    * 获取-是否走后台任务调度，1为是，0为否，默认为1
    * @return isdispatch
     */
    public String getIsdispatch() {
        return isdispatch;
    }

    /**
    * 设置-是否走后台任务调度，1为是，0为否，默认为1
    * @paramType java.lang.String
    * @param isdispatch - 是否走后台任务调度，1为是，0为否，默认为1
     */
    public void setIsdispatch(String isdispatch) {
        this.isdispatch = isdispatch;
    }

    /**
    * 获取-任务权重
    * @return power
     */
    public BigDecimal getPower() {
        return power;
    }

    /**
    * 设置-任务权重
    * @paramType java.math.BigDecimal
    * @param power - 任务权重
     */
    public void setPower(BigDecimal power) {
        this.power = power;
    }

    /**
    * 获取-是否过滤任务参数(默认为1，表示同一类型相同参数的任务只会有一个，0为否)
    * @return istaskfilt
     */
    public String getIstaskfilt() {
        return istaskfilt;
    }

    /**
    * 设置-是否过滤任务参数(默认为1，表示同一类型相同参数的任务只会有一个，0为否)
    * @paramType java.lang.String
    * @param istaskfilt - 是否过滤任务参数(默认为1，表示同一类型相同参数的任务只会有一个，0为否)
     */
    public void setIstaskfilt(String istaskfilt) {
        this.istaskfilt = istaskfilt;
    }

    /**
    * 获取-异步任务执行SQL
    * @return sqlstr
     */
    public String getSqlstr() {
        return sqlstr;
    }

    /**
    * 设置-异步任务执行SQL
    * @paramType java.lang.String
    * @param sqlstr - 异步任务执行SQL
     */
    public void setSqlstr(String sqlstr) {
        this.sqlstr = sqlstr;
    }

    /**
    * 获取-文件名
    * @return fieldname
     */
    public String getFieldname() {
        return fieldname;
    }

    /**
    * 设置-文件名
    * @paramType java.lang.String
    * @param fieldname - 文件名
     */
    public void setFieldname(String fieldname) {
        this.fieldname = fieldname;
    }
}