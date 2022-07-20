package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : xxl_job_logglue
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class XxlJobLogglue {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 任务，主键ID
     */
    private Integer jobId;

    /**
     * GLUE类型
     */
    private String glueType;

    /**
     * GLUE源代码
     */
    private String glueSource;

    /**
     * GLUE备注
     */
    private String glueRemark;

    /**
     * 增加时间
     */
    private Date addTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
    * 获取-主键
    * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Integer
    * @param id - 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
    * 获取-任务，主键ID
    * @return jobId
     */
    public Integer getJobId() {
        return jobId;
    }

    /**
    * 设置-任务，主键ID
    * @paramType java.lang.Integer
    * @param jobId - 任务，主键ID
     */
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    /**
    * 获取-GLUE类型
    * @return glueType
     */
    public String getGlueType() {
        return glueType;
    }

    /**
    * 设置-GLUE类型
    * @paramType java.lang.String
    * @param glueType - GLUE类型
     */
    public void setGlueType(String glueType) {
        this.glueType = glueType;
    }

    /**
    * 获取-GLUE源代码
    * @return glueSource
     */
    public String getGlueSource() {
        return glueSource;
    }

    /**
    * 设置-GLUE源代码
    * @paramType java.lang.String
    * @param glueSource - GLUE源代码
     */
    public void setGlueSource(String glueSource) {
        this.glueSource = glueSource;
    }

    /**
    * 获取-GLUE备注
    * @return glueRemark
     */
    public String getGlueRemark() {
        return glueRemark;
    }

    /**
    * 设置-GLUE备注
    * @paramType java.lang.String
    * @param glueRemark - GLUE备注
     */
    public void setGlueRemark(String glueRemark) {
        this.glueRemark = glueRemark;
    }

    /**
    * 获取-增加时间
    * @return addTime
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
    * 设置-增加时间
    * @paramType java.util.Date
    * @param addTime - 增加时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
    * 获取-更新时间
    * @return updateTime
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
    * 设置-更新时间
    * @paramType java.util.Date
    * @param updateTime - 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}