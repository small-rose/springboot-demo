package cn.xiaocai.demo.camunda.workflow.entity;

import org.camunda.bpm.engine.impl.persistence.entity.SuspensionState;
import org.camunda.bpm.engine.impl.persistence.entity.TaskEntity;
import org.camunda.bpm.engine.task.DelegationState;
import org.camunda.bpm.engine.task.Task;

import java.util.Date;
import java.util.Map;

/**
 * Task - 展示对象
 */
public class TaskVo<T> {

    private String id;
    private int revision;

    private String owner;
    private String assignee;
    private DelegationState delegationState;

    private String parentTaskId;

    private String name;
    private String description;
    private int priority = Task.PRIORITY_NORMAL;
    // The time when the task has been created
    private Date createTime;
    private Date dueDate;
    private Date followUpDate;
    private int suspensionState = SuspensionState.ACTIVE.getStateCode();
    private TaskEntity.TaskState lifecycleState = TaskEntity.TaskState.STATE_INIT;
    private String tenantId;

    //20220715增加任务状态
    private String status;

    // execution
    protected String executionId;

    protected String processInstanceId;

    protected String processDefinitionId;

    // caseExecution
    protected String caseExecutionId;

    protected String caseInstanceId;
    protected String caseDefinitionId;

    // taskDefinition
    protected String taskDefinitionKey;

    protected boolean isDeleted;
    protected String deleteReason;

    protected String eventName;
    protected boolean isFormKeyInitialized = false;
    //protected String formKey;

    /**
     * 当前流程实例对应的流程变量
     */
    private Map<String, Object> processVariables;
    /**
     * 流程业务数据
     */
    private T bizProcessData;

    /**
     * 任务业务数据
     */
    private T bizTaskData;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public DelegationState getDelegationState() {
        return delegationState;
    }

    public void setDelegationState(DelegationState delegationState) {
        this.delegationState = delegationState;
    }

    public String getParentTaskId() {
        return parentTaskId;
    }

    public void setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getFollowUpDate() {
        return followUpDate;
    }

    public void setFollowUpDate(Date followUpDate) {
        this.followUpDate = followUpDate;
    }

    public int getSuspensionState() {
        return suspensionState;
    }

    public void setSuspensionState(int suspensionState) {
        this.suspensionState = suspensionState;
    }

    public TaskEntity.TaskState getLifecycleState() {
        return lifecycleState;
    }

    public void setLifecycleState(TaskEntity.TaskState lifecycleState) {
        this.lifecycleState = lifecycleState;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public String getCaseExecutionId() {
        return caseExecutionId;
    }

    public void setCaseExecutionId(String caseExecutionId) {
        this.caseExecutionId = caseExecutionId;
    }

    public String getCaseInstanceId() {
        return caseInstanceId;
    }

    public void setCaseInstanceId(String caseInstanceId) {
        this.caseInstanceId = caseInstanceId;
    }

    public String getCaseDefinitionId() {
        return caseDefinitionId;
    }

    public void setCaseDefinitionId(String caseDefinitionId) {
        this.caseDefinitionId = caseDefinitionId;
    }

    public String getTaskDefinitionKey() {
        return taskDefinitionKey;
    }

    public void setTaskDefinitionKey(String taskDefinitionKey) {
        this.taskDefinitionKey = taskDefinitionKey;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getDeleteReason() {
        return deleteReason;
    }

    public void setDeleteReason(String deleteReason) {
        this.deleteReason = deleteReason;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public boolean isFormKeyInitialized() {
        return isFormKeyInitialized;
    }

    public void setFormKeyInitialized(boolean formKeyInitialized) {
        isFormKeyInitialized = formKeyInitialized;
    }

    public Map<String, Object> getProcessVariables() {
        return processVariables;
    }

    public void setProcessVariables(Map<String, Object> processVariables) {
        this.processVariables = processVariables;
    }

    public T getBizProcessData() {
        return bizProcessData;
    }

    public void setBizProcessData(T bizProcessData) {
        this.bizProcessData = bizProcessData;
    }

    public T getBizTaskData() {
        return bizTaskData;
    }

    public void setBizTaskData(T bizTaskData) {
        this.bizTaskData = bizTaskData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
