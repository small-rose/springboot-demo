package cn.xiaocai.demo.camunda.workflow.entity;

public class ProcessVariablesQueryParam {
    /**
     * 流程实例ID
     */
    private String processInstanceId;
    /**
     * 任务ID
     */
    private String taskId;
    /**
     * 流程变量名称
     */
    private String variableName;

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }
}
