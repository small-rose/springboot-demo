package cn.xiaocai.demo.camunda.workflow.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TaskQueryParam extends BasePageParam {
    /**
     * 任务处理者
     */
    private String assignee;
    /**
     * 流程定义ID
     */
    private String processDefinitionKey;
    /**
     * 任务定义ID
     */
    private String taskDefinitionKey;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 是否附加查询流程变量
     */
    private Boolean withProcessVariables;

    /**
     * 开始时间 - 起始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startedAfter;
    /**
     * 开始时间 - 结束时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startedBefore;

    /**
     * 是否已完成
     */
    private Boolean finished;

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getProcessDefinitionKey() {
        return processDefinitionKey;
    }

    public void setProcessDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
    }

    public String getTaskDefinitionKey() {
        return taskDefinitionKey;
    }

    public void setTaskDefinitionKey(String taskDefinitionKey) {
        this.taskDefinitionKey = taskDefinitionKey;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Boolean getWithProcessVariables() {
        return withProcessVariables;
    }

    public void setWithProcessVariables(Boolean withProcessVariables) {
        this.withProcessVariables = withProcessVariables;
    }

    public Date getStartedAfter() {
        return startedAfter;
    }

    public void setStartedAfter(Date startedAfter) {
        this.startedAfter = startedAfter;
    }

    public Date getStartedBefore() {
        return startedBefore;
    }

    public void setStartedBefore(Date startedBefore) {
        this.startedBefore = startedBefore;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }
}
