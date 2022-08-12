package cn.xiaocai.demo.camunda.workflow.controller;

import cn.xiaocai.demo.camunda.workflow.constants.ProcessConstants;
import cn.xiaocai.demo.camunda.workflow.entity.ResultResponse;
import cn.xiaocai.demo.camunda.workflow.entity.TaskQueryParam;
import cn.xiaocai.demo.camunda.workflow.entity.TaskVo;
import cn.xiaocai.demo.camunda.workflow.service.CamundaCommonService;
import cn.xiaocai.demo.camunda.workflow.service.PaymentService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import java.io.InputStream;
import java.util.*;

/**
 * https://www.jianshu.com/p/934850762910
 * SELECT * FROM `act_ru_task`;
 * SELECT * FROM  `act_hi_taskinst`;
 * SELECT * FROM `act_hi_actinst`;存储任务状态
 */

@Controller
@RequestMapping("/api/workflow")
@Api(value = "工作流接口", tags = {"工作流接口"})
public class WorkFlowController {

    @Autowired
    private CamundaCommonService camundaCommonService;

    @Autowired
    private PaymentService paymentService;


    @ApiOperation("发布类路径下的流程文件")
    @RequestMapping(value = "/classpath/deploy", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse deployProcessFromClassPath(@ApiParam("流程名") @RequestParam String deploymentName, @ApiParam("流程文件名") @RequestParam String bpmnName){
        ResultResponse result = new ResultResponse();
        try{
            result = camundaCommonService.deployProcessFromClassPath(deploymentName,bpmnName);
            result.setSuccess(true);
            return result;
        }catch (Exception e){
            result.setData("流程名为：" + deploymentName + " 的流程发布失败");
            result.setMessage(e.getMessage());
            result.setSuccess(false);
            return result;
        }
    }

    @ApiOperation("流程文件上传并发布")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "file", paramType="form", value = "流程文件", dataType="__file", required = false)
    })
    @RequestMapping(value = "/bpmnFile/deploy", method = RequestMethod.POST)
    @ResponseBody
    public ResultResponse deployProcessFromFile(@ApiParam("流程文件") @RequestParam("file") CommonsMultipartFile file){
        ResultResponse result = new ResultResponse();
        try{
            InputStream is = file.getInputStream();
            result = camundaCommonService.deployProcessFromFile(file.getOriginalFilename(),is);
            result.setSuccess(true);
            return result;
        }catch (Exception e){
            result.setData("流程名为：" + file.getOriginalFilename() + " 的流程发布失败");
            result.setSuccess(false);
            result.setMessage(e.getMessage());
            return result;
        }
    }

    @ApiOperation("启动一个流程图")
    @RequestMapping(value = "/startProcessWithInitiator", method = RequestMethod.POST)
    @ResponseBody
    public ResultResponse startProcessWithInitiator(@ApiParam("流程图名字") @RequestParam String processDefinitionKey, @ApiParam("流程发起人") @RequestParam String initiator, @ApiParam("业务主键") @RequestParam String businessKey){
        ResultResponse result = new ResultResponse();
        try{
            Map<String,Object> map = new HashMap<>();
            List<String> assigneeList = new ArrayList<>(4);
            assigneeList.add("userOne");
            assigneeList.add("userTwo");
            assigneeList.add("userThree");
            map.put("assigneeList",assigneeList);
            String processInstanceId = camundaCommonService.startProcessInstance(processDefinitionKey, businessKey,map,initiator);
            result.setSuccess(true);
            result.setCode(200);
            if (processInstanceId == null){
                result.setData("未找到对应的流程，流程名为：" + processDefinitionKey);
             }else {
                result.setData("启动流程名为：" + processDefinitionKey + " ,流程Id为：" + processInstanceId);
             }
            return result;
        }catch (Exception e){
            result.setData("流程启动失败");
            result.setCode(500);
            result.setSuccess(false);
            result.setMessage(e.getMessage());
            return result;
        }
    }


    @ApiOperation("加签")
    @RequestMapping(value = "/addInstance", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse addInstance(@ApiParam("流程实例ID") @RequestParam String processInstanceId, @ApiParam("会签节点的activityId") @RequestParam String activityId, @ApiParam("加签的处理人") @RequestParam String assignee){
        ResultResponse result = new ResultResponse();
        try{
            camundaCommonService.addInstance(processInstanceId,activityId,assignee);
            result.setData("会签加签成功");
            result.setSuccess(true);
            return result;
        }catch (Exception e){
            result.setData("会签加签失败");
            result.setSuccess(false);
            result.setMessage(e.getMessage());
            return result;
        }
    }

    @ApiOperation("流程跳转")
    @RequestMapping(value = "/jumpNode", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse jumpNode(@ApiParam("流程实例ID") @RequestParam String processInstanceId, @ApiParam("目标节点ID") @RequestParam String targetActivityId){
        ResultResponse result = new ResultResponse();
        try{
            return camundaCommonService.jumpNode(processInstanceId,targetActivityId);
        }catch (Exception e){
            result.setData("流程跳转失败");
            result.setSuccess(false);
            result.setMessage(e.getMessage());
            return result;
        }
    }




    @ApiOperation("批量挂起流程实例")
    @RequestMapping(value = "/batchUpdateProcessInstanceSuspensionState", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse batchUpdateProcessInstanceSuspensionState(@ApiParam("流程实例ID，多个实例ID用逗号分隔") @RequestParam String processInstanceId){
        ResultResponse result = new ResultResponse();
        try {
            String[] paramArr = processInstanceId.split(",");
            result = camundaCommonService.batchUpdateProcessInstanceSuspensionState(Arrays.asList(paramArr),"admin");
            result.setSuccess(true);
            return result;
        }catch (Exception e){
            result.setData("批量挂起流程实例失败");
            result.setSuccess(false);
            result.setMessage(e.getMessage());
            return result;
        }
    }

    @ApiOperation("批量激活流程实例")
    @RequestMapping(value = "/batchUpdateProcessInstanceActivateState", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse batchUpdateProcessInstanceActivateState(@ApiParam("流程实例ID，多个实例ID用逗号分隔") @RequestParam String processInstanceId){
        ResultResponse result = new ResultResponse();
        try {
            String[] paramArr = processInstanceId.split(",");
            result = camundaCommonService.batchUpdateProcessInstanceActivateState(Arrays.asList(paramArr),"admin");
            result.setSuccess(true);
            return result;
        }catch (Exception e){
            result.setData("批量激活流程实例失败");
            result.setSuccess(false);
            result.setMessage(e.getMessage());
            return result;
        }

    }

    @ApiOperation("获取流程实例中的变量")
    @RequestMapping(value = "/getRuntimeProcessVariables", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse getRuntimeProcessVariables(@ApiParam("流程实例ID") @RequestParam String processInstanceId){
        ResultResponse result = new ResultResponse();
        try{
            Map  resultMap = camundaCommonService.getRuntimeProcessVariables(processInstanceId);
            result.setData(resultMap);
            result.setSuccess(true);
            return result;
        }catch (Exception e){
            result.setData("获取流程实例中变量失败");
            result.setSuccess(false);
            result.setMessage(e.getMessage());
            return result;
        }
    }

    @ApiOperation("获取流程实例中的变量(单个变量)")
    @RequestMapping(value = "/getRuntimeProcessSingleVariable", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse getRuntimeProcessVariables(@ApiParam("流程实例ID") @RequestParam String processInstanceId, @ApiParam("变量名") @RequestParam String variableName){
        ResultResponse result = new ResultResponse();
        try{
            Map  resultMap = camundaCommonService.getRuntimeSingleProcessVariable(processInstanceId,variableName);
            result.setData(resultMap);
            result.setSuccess(true);
            return result;
        }catch (Exception e){
            result.setData("获取流程实例中单个变量失败");
            result.setSuccess(false);
            result.setMessage(e.getMessage());
            return result;
        }
    }

    @ApiOperation("根据流程实例ID获取当前活动任务")
    @RequestMapping(value = "/getActiveByProcessInstanceId", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse getActiveByProcessInstanceId(@ApiParam("流程实例ID") @RequestParam String processInstanceId){
        ResultResponse result = new ResultResponse();
        try{
            String taskId = camundaCommonService.getActiveByProcessInstanceId(processInstanceId);
            result.setData(taskId);
            result.setSuccess(true);
            return result;
        }catch (Exception e){
            result.setData("获取当前活动任务失败");
            result.setSuccess(false);
            result.setMessage(e.getMessage());
            return result;
        }
    }

    @ApiOperation("重新启动流程实例")
    @RequestMapping(value = "/restartProcessInstances", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse restartProcessInstances(@ApiParam("流程定义Key") @RequestParam String processDefinitionKey, @ApiParam("业务主键") @RequestParam String businessKey, @ApiParam("操作人员代码") @RequestParam String opCode){
        ResultResponse result = new ResultResponse();
        try{
            Map<String,Object> map = new HashMap<>();
            map.put("employee",opCode);
            result = camundaCommonService.restartProcessInstances(processDefinitionKey,null,map,opCode);
            result.setSuccess(true);
            return result;
        }catch (Exception e){
            result.setData("重新启动流程失败！");
            result.setSuccess(false);
            result.setMessage(e.getMessage());
            return result;
        }
    }

    @ApiOperation("从任意节点启动流程实例")
    @RequestMapping(value = "/createProcessInstanceByKey", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse createProcessInstanceByKey(@ApiParam("流程定义Key") @RequestParam String processDefinitionKey, @ApiParam("业务主键") @RequestParam String businessKey, @ApiParam("节点ID") @RequestParam String activityId, @ApiParam("操作人员代码") @RequestParam String opCode){
        ResultResponse result = new ResultResponse();
        try {
            result = camundaCommonService.createProcessInstanceByKey(processDefinitionKey, businessKey, activityId, opCode);
            result.setSuccess(true);
            return result;
        }catch (Exception e){
            result.setData("启动流程失败！");
            result.setSuccess(false);
            result.setMessage(e.getMessage());
            return result;
        }
    }

    @RequestMapping(value = "/queryCompletedTaskList", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse queryCompletedTaskList(@RequestParam int pageNum, @RequestParam int pageSize, @RequestParam String assignee){
        try{
            return camundaCommonService.queryCompletedTaskList(pageNum,pageSize,assignee);
        }catch (Exception e){
            return new ResultResponse().data("查询历史任务失败");
        }
    }

    @ApiOperation("完成一个任务")
    @RequestMapping(value = "/compeletTaskById", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse compeletTaskById(@ApiParam("任务ID") @RequestParam String taskId){
        ResultResponse result = new ResultResponse();
        try{
            Map<String,Object> map = new HashMap<>();
            map.put("dept_approve",false);//不通过
            result = camundaCommonService.compeletTaskById(taskId,map);
            result.setSuccess(true);
            return result;
        }catch (Exception e){
            result.setData("完成任务id为：" + taskId + "时出错");
            result.setSuccess(false);
            result.setMessage(e.getMessage());
            return result;
        }
    }

    @ApiOperation("驳回一个任务")
    @RequestMapping(value = "/reject", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse reject(@ApiParam("任务ID") @RequestParam String taskId){
        ResultResponse result = new ResultResponse();
        try{
            result = camundaCommonService.reject(taskId);
            result.setSuccess(true);
            return result;
        }catch (Exception e){
            result.setData("任务id为：" + taskId + "驳回时出错");
            result.setSuccess(false);
            result.setMessage(e.getMessage());
            return result;
        }
    }

    @ApiOperation("指定任务处理人")
    @RequestMapping(value = "/claimTask", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse claimTask(@ApiParam("任务ID") @RequestParam String taskId, @ApiParam("任务处理人") @RequestParam String assignee){
        ResultResponse result = new ResultResponse();
        try{
            result = camundaCommonService.claimTask(taskId,assignee);
            result.setSuccess(true);
            return result;
        }catch (Exception e){
            result.setData("任务id为：" + taskId + "领取失败！");
            result.setSuccess(false);
            result.setMessage(e.getMessage());
            return result;
        }
    }

    @ApiOperation("获取流程发起人")
    @RequestMapping(value = "/getProcessStarter", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse getProcessStarter(@ApiParam("流程实例id") @RequestParam String processInstanceId){
        ResultResponse result = new ResultResponse();
        try{
            String starter = camundaCommonService.getProcessStarter(processInstanceId);
            result.setData(starter);
            result.setMessage("获取流程发起人成功");
            result.setSuccess(true);
            return result;
        }catch (Exception e){
            result.setData("获取流程发起人失败！");
            result.setSuccess(false);
            result.setMessage(e.getMessage());
            return result;
        }
    }

    @ApiIgnore
    @RequestMapping(value = "/getNextTaskInfos", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse getNextTaskInfos(@ApiParam("流程实例ID") @RequestParam String processInstanceId){
        try{
            Map<String, Object> condition = new HashMap<>();
            condition.put("dept_approve",false);//不通过
            return new ResultResponse().data(camundaCommonService.getNextTaskJsonInfos(processInstanceId,condition));
        }catch (Exception e){
            return new ResultResponse().data("获取下一个节点信息失败！");
        }
    }

    @ApiIgnore
    @RequestMapping(value = "/submitStartForm", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse submitStartForm(@RequestParam String processDefinitionId){
        try{
            return camundaCommonService.submitStartForm(processDefinitionId);
        }catch (Exception e){
            return new ResultResponse().data("开始节点表单提交失败！");
        }
    }

    @ApiIgnore
    @RequestMapping(value = "/submitTaskForm", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse submitTaskForm(@RequestParam String taskId){
        try{
            return camundaCommonService.submitTaskForm(taskId);
        }catch (Exception e){
            return new ResultResponse().data("任务节点表单提交失败！");
        }
    }

    @ApiIgnore
    @RequestMapping(value = "/getStartFormData", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse getStartFormData(@RequestParam String processDefinitionId){
        try{
            return camundaCommonService.getStartFormData(processDefinitionId);
        }catch (Exception e){
            return new ResultResponse().data("获取开始节点表单数据失败！");
        }
    }

    @ApiIgnore
    @RequestMapping(value = "/getTaskFormData", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse getTaskFormData(@RequestParam String taskId){
        try{
            return camundaCommonService.getTaskFormData(taskId);
        }catch (Exception e){
            return new ResultResponse().data("获取任务节点表单数据失败！");
        }
    }

    @RequestMapping(value = "/camunda/queryToDoTaskList", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse queryToDoTaskList(@RequestParam String paymentId){
        try{
            TaskQueryParam taskQueryParam = new TaskQueryParam();
            //taskQueryParam.setAssignee("admin");
            taskQueryParam.setPageNo(1);
            taskQueryParam.setPageSize(5);
            taskQueryParam.setOrderBy(ProcessConstants.COLUMN_CREATE_TIME);
            taskQueryParam.setOrderSort(ProcessConstants.SORT_DESC);
            taskQueryParam.setWithProcessVariables(true);
            PageInfo<TaskVo<String>> data =  camundaCommonService.queryToDoTaskList(taskQueryParam,"employee",
                    (payId) -> { return paymentService.getPaymentInfo(payId);});
            return new ResultResponse().data(data);
        }catch (Exception e){
            return new ResultResponse().data("获取任务节点表单数据失败！");
        }
    }

    @ApiOperation(value = "调度审核人接口",response = ResultResponse.class)
    @RequestMapping(value = "/dispatchAssignee", method = RequestMethod.POST)
    @ResponseBody
    public ResultResponse dispatchAssignee(@ApiParam("任务Id") @RequestParam("taskId") String taskId, @ApiParam(value = "审核人代码",required = false) @RequestParam(value = "assignee",required = false) String assignee){
        ResultResponse response = new ResultResponse();
        try {
            camundaCommonService.setAssignee(taskId,assignee);
            response.setSuccess(true);
            response.setCode(200);
            response.setMessage("调度审核人接口调用成功");
        }catch (Exception e){
            response.setSuccess(false);
            response.setCode(500);
            response.setMessage("调度审核人接口调用失败 ：" + e.getMessage());
        }
        return response;
    }

    @ApiOperation(value = "审核记录查询接口",response = ResultResponse.class)
    @RequestMapping(value = "/findCommentByProcessInstanceId", method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse findComment(@ApiParam("流程实例Id") @RequestParam("processInstanceId") String processInstanceId){
        ResultResponse response = new ResultResponse();
        try {
            return camundaCommonService.taskGetComment(processInstanceId);

        }catch (Exception e){
            response.setSuccess(false);
            response.setCode(500);
            response.setMessage("审核记录查询接口失败 ：" + e.getMessage());
        }
        return response;
    }
}
