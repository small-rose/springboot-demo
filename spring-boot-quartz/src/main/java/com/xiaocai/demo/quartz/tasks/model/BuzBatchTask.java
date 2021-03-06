package com.xiaocai.demo.quartz.tasks.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ BatchTaskTd ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/18 17:35
 * @Version ： 1.0
 **/

@Entity
@Table(name = "mm_batch_task_td")
@Data
public class BuzBatchTask implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    /**
     * 任务名称
     */
    @Column(name = "job_Name")
    private String jobName;

    /**
     * 任务描述
     */
    @Column(name = "job_Desc")
    private String jobDesc;

    /**
     * 任务参数
     */
    @Column(name = "job_Parameter")
    private String jobParameter;

    /**
     * cron表达式
     */
    @Column(name = "cron_Expression")
    private String cronExpression;

    /**
     * 服务名称
     */
    @Column(name = "bean_Name")
    private String beanName;

    /**
     * 方法名称
     */
    @Column(name = "method_Name")
    private String methodName;

    /**
     * 状态 1.启动 2.暂停
     */
    @Column(name = "status")
    private int status;

    /**
     * 是否删除 0.否 1.是
     */
    @Column(name = "delete_Flag")
    private int deleteFlag;

    /**
     * 创建人id
     */
    @Column(name = "creatorId")
    private int creatorId;

    /**
     * 创建人
     */
    @Column(name = "creatorName")
    private String creatorName;

    /**
     * 创建时间
     */
    @Column(name = "createdTime")
    private LocalDateTime createdTime;

    /**
     * 更新时间
     */
    @Column(name = "updatedTime")
    private LocalDateTime updatedTime;
}
