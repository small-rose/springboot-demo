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
    private Integer id;

    /**
     * 任务名称
     */
    @Column(name = "jobName")
    private String jobName;

    /**
     * cron表达式
     */
    @Column(name = "cronExpression")
    private String cronExpression;

    /**
     * 服务名称
     */
    @Column(name = "beanName")
    private String beanName;

    /**
     * 方法名称
     */
    @Column(name = "methodName")
    private String methodName;

    /**
     * 状态 1.启动 2.暂停
     */
    @Column(name = "status")
    private int status;

    /**
     * 是否删除 0.否 1.是
     */
    @Column(name = "deleteFlag")
    private int deleteFlag;

    /**
     * 创建人id
     */
    @Column(name = "creatorId")
    private Integer creatorId;

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
