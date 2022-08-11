package cn.xiaocai.demo.camunda.workflow.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value="Assignee", description="任务处理人对象")
public class Assignee implements Serializable {

    @ApiModelProperty(value = "分公司代码")
    private String branchCode;

    @ApiModelProperty(value = "分公司名称")
    private String branchName;

    @ApiModelProperty(value = "中支公司代码")
    private String deptCode;

    @ApiModelProperty(value = "中支公司名称")
    private String deptName;

    @ApiModelProperty(value = "支公司")
    private String sectionCode;

    @ApiModelProperty(value = "支公司名称")
    private String sectionName;

    @ApiModelProperty(value = "任务处理人代码")
    private String assignee;

    @ApiModelProperty(value = "任务处理人名称")
    private String assigneeName;
}
