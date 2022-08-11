package cn.xiaocai.demo.camunda.workflow.util;

import cn.hutool.core.bean.BeanUtil;
import cn.xiaocai.demo.camunda.workflow.constants.ProcessConstants;
import cn.xiaocai.demo.camunda.workflow.entity.BasePageParam;
import cn.xiaocai.demo.camunda.workflow.entity.TaskVo;
import org.camunda.bpm.engine.history.HistoricTaskInstanceQuery;
import org.camunda.bpm.engine.history.HistoricVariableInstance;
import org.camunda.bpm.engine.impl.AbstractQuery;
import org.camunda.bpm.engine.impl.Direction;
import org.camunda.bpm.engine.impl.QueryPropertyImpl;
import org.camunda.bpm.engine.runtime.VariableInstance;
import org.camunda.bpm.engine.task.Task;
import org.camunda.bpm.engine.task.TaskQuery;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.engine.variable.value.FileValue;
import org.camunda.bpm.engine.variable.value.ObjectValue;
import org.springframework.beans.BeanUtils;
import org.springframework.util.StringUtils;

import java.io.File;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class CamundaTools {

    private static final Map<String, Consumer<TaskQuery>> ORDER_KEY_TO_TASK_QUERY_CONSUMER_MAP = new HashMap<>();
    private static final Map<String, Consumer<TaskQuery>> ORDER_SORT_TO_TASK_QUERY_CONSUMER_MAP = new HashMap<>(4);

    private static final Map<String, Consumer<HistoricTaskInstanceQuery>> ORDER_KEY_TO_HISTORIC_TASK_INSTANCE_QUERY_CONSUMER_MAP = new HashMap<>();
    private static final Map<String, Consumer<HistoricTaskInstanceQuery>> ORDER_SORT_TO_HISTORIC_TASK_INSTANCE_QUERY_CONSUMER_MAP = new HashMap<>(4);

    static {
        //设置排序key（参见：TaskQueryProperty）
        ORDER_KEY_TO_TASK_QUERY_CONSUMER_MAP.put(ProcessConstants.COLUMN_ID, TaskQuery::orderByTaskId);
        ORDER_KEY_TO_TASK_QUERY_CONSUMER_MAP.put(ProcessConstants.COLUMN_NAME, TaskQuery::orderByTaskName);
        ORDER_KEY_TO_TASK_QUERY_CONSUMER_MAP.put(ProcessConstants.COLUMN_CREATE_TIME, TaskQuery::orderByTaskCreateTime);

        //设置排序规则
        ORDER_SORT_TO_TASK_QUERY_CONSUMER_MAP.put(ProcessConstants.SORT_ASC, taskQuery -> {
        });
        ORDER_SORT_TO_TASK_QUERY_CONSUMER_MAP.put(ProcessConstants.SORT_ASC.toUpperCase(), taskQuery -> {
        });
        ORDER_SORT_TO_TASK_QUERY_CONSUMER_MAP.put(ProcessConstants.SORT_DESC, TaskQuery::desc);
        ORDER_SORT_TO_TASK_QUERY_CONSUMER_MAP.put(ProcessConstants.SORT_DESC.toUpperCase(), TaskQuery::desc);

        //设置排序key（参见：TaskQueryProperty）
        ORDER_KEY_TO_HISTORIC_TASK_INSTANCE_QUERY_CONSUMER_MAP.put(ProcessConstants.COLUMN_ID, HistoricTaskInstanceQuery::orderByTaskId);
        ORDER_KEY_TO_HISTORIC_TASK_INSTANCE_QUERY_CONSUMER_MAP.put(ProcessConstants.COLUMN_START_TIME, HistoricTaskInstanceQuery::orderByHistoricActivityInstanceStartTime);
        ORDER_KEY_TO_HISTORIC_TASK_INSTANCE_QUERY_CONSUMER_MAP.put(ProcessConstants.COLUMN_END_TIME, HistoricTaskInstanceQuery::orderByHistoricTaskInstanceEndTime);
        ORDER_KEY_TO_HISTORIC_TASK_INSTANCE_QUERY_CONSUMER_MAP.put(ProcessConstants.COLUMN_DURATION, HistoricTaskInstanceQuery::orderByHistoricTaskInstanceDuration);

        //设置排序规则
        ORDER_SORT_TO_HISTORIC_TASK_INSTANCE_QUERY_CONSUMER_MAP.put(ProcessConstants.SORT_ASC, taskQuery -> {
        });
        ORDER_SORT_TO_HISTORIC_TASK_INSTANCE_QUERY_CONSUMER_MAP.put(ProcessConstants.SORT_ASC.toUpperCase(), taskQuery -> {
        });
        ORDER_SORT_TO_HISTORIC_TASK_INSTANCE_QUERY_CONSUMER_MAP.put(ProcessConstants.SORT_DESC, HistoricTaskInstanceQuery::desc);
        ORDER_SORT_TO_HISTORIC_TASK_INSTANCE_QUERY_CONSUMER_MAP.put(ProcessConstants.SORT_DESC.toUpperCase(), HistoricTaskInstanceQuery::desc);
    }

    /**
     * 设置TaskQuery排序参数
     *
     * @param taskQuery     TaskQuery对象
     * @param basePageParam 基础查询参数
     */
    public static void setTaskQueryOrderBy(TaskQuery taskQuery, BasePageParam basePageParam) {
        //设置排序规则
        ORDER_KEY_TO_TASK_QUERY_CONSUMER_MAP.keySet().stream()
                .filter(orderKey -> orderKey.equals(basePageParam.getOrderBy()))
                .findFirst()
                .ifPresent(orderKey -> {
                    ORDER_KEY_TO_TASK_QUERY_CONSUMER_MAP.get(orderKey).accept(taskQuery);
                });
        ORDER_SORT_TO_TASK_QUERY_CONSUMER_MAP.keySet().stream()
                .filter(orderSort -> orderSort.equals(basePageParam.getOrderSort()))
                .findFirst()
                .ifPresent(orderSort -> {//ifPresent 用于对过滤出的数据如果存在。如果经过过滤条件后，有数据的话就可以进行修改。
                    ORDER_SORT_TO_TASK_QUERY_CONSUMER_MAP.get(orderSort).accept(taskQuery);
                });
    }

    /**
     * 设置TaskQuery排序参数
     *
     * @param historicTaskInstanceQuery HistoricTaskInstance对象
     * @param basePageParam             基础查询参数
     */
    public static void setHistoricTaskInstanceQueryOrderBy(HistoricTaskInstanceQuery historicTaskInstanceQuery, BasePageParam basePageParam) {
        //设置排序规则
        ORDER_KEY_TO_HISTORIC_TASK_INSTANCE_QUERY_CONSUMER_MAP.keySet().stream()
                .filter(orderKey -> orderKey.equals(basePageParam.getOrderBy()))
                .findFirst()
                .ifPresent(orderKey -> {
                    ORDER_KEY_TO_HISTORIC_TASK_INSTANCE_QUERY_CONSUMER_MAP.get(orderKey).accept(historicTaskInstanceQuery);
                });
        ORDER_SORT_TO_HISTORIC_TASK_INSTANCE_QUERY_CONSUMER_MAP.keySet().stream()
                .filter(orderSort -> orderSort.equals(basePageParam.getOrderSort()))
                .findFirst()
                .ifPresent(orderKey -> {
                    ORDER_SORT_TO_HISTORIC_TASK_INSTANCE_QUERY_CONSUMER_MAP.get(orderKey).accept(historicTaskInstanceQuery);
                });
    }


    /**
     * 转换Task对象为TaskVo
     *
     * @param task 任务
     * @return 任务VO
     */
    public static <T> TaskVo<T> convertTask(Task task) {
        TaskVo<T> taskVo = new TaskVo<T>();
        BeanUtils.copyProperties(task, taskVo);
        return taskVo;
    }

    /**
     * 转换Java Pojo为Map
     *
     * @param processVariables
     * @return
     */
    public static Map convertProcessVariablesFromEntity(Object processVariables) {
        Map processVariablesMap = processVariables instanceof Map
                ? (Map) processVariables
                : BeanUtil.beanToMap(processVariables);
        return processVariablesMap;
    }

    /**
     * 转换name和value对为Map
     *
     * @param nameValPairs
     * @return
     */
    public static Map convertProcessVariablesFromPair(Object... nameValPairs) {
        if (null == nameValPairs || 0 >= nameValPairs.length) {
            return null;
        }
        Map processVariablesMap = new HashMap(nameValPairs.length / 2);
        for (int i = 0; i + 1 < nameValPairs.length; i += 2) {
            processVariablesMap.put(nameValPairs[i], nameValPairs[i + 1]);
        }
        return processVariablesMap;
    }


    /**
     * 转换VariableInstance列表为Map
     *
     * @param variableInstanceList
     * @return
     */
    public static Map<String, Object> convertVariableInstances(List<VariableInstance> variableInstanceList) {
        //添加流程变量到taskVo中
        Map<String, Object> processVariables = variableInstanceList.stream()
                .collect(Collectors.toMap(VariableInstance::getName, VariableInstance::getValue));
        return processVariables;
    }

    /**
     * 根据变量名获取一个流程变量
     * 用于会签时获取默认的变量：nrOfActiveInstances：当前活动的实例数量，即还没有完成的实例数量，nrOfInstances：会签中总共的实例数
     * nrOfCompletedInstances：已经完成的实例数量
     * @param variableInstanceList
     * @param variableName
     * @return
     */
    public static Map<String, Object> getVariableInstancesByName(List<VariableInstance> variableInstanceList,String variableName){
        Map<String, Object> result = new HashMap<>();
        Optional<VariableInstance> processVariablesOptional = variableInstanceList.stream().filter(item->item.getName().equals(variableName)).findFirst();
        if (processVariablesOptional.isPresent()) {
            // 存在
            VariableInstance variableInstance =  processVariablesOptional.get();
            result.put(variableName,variableInstance.getValue());
            return result;
        } else {
            return null;
        }
    }

    /**
     * 转换HistoricVariableInstance列表为Map
     *
     * @param variableInstanceList
     * @return
     */
    public static Map<String, Object> convertHistoricVariableInstances(List<HistoricVariableInstance> variableInstanceList) {
        //添加流程变量到taskVo中
        Map<String, Object> processVariables = variableInstanceList.stream()
                .collect(Collectors.toMap(HistoricVariableInstance::getName, HistoricVariableInstance::getValue));
        return processVariables;
    }

    /**
     * 转换分页参数为起始index
     *
     * @param basePageParam 基础分页参数
     * @return 起始index
     */
    public static Integer getPageStartIndex(BasePageParam basePageParam) {
        return (basePageParam.getPageNo() - 1) * basePageParam.getPageSize();
    }

    public static void setQueryOrderBy(AbstractQuery abstractQuery, BasePageParam basePageParam) {
        if (null == abstractQuery || null == basePageParam || !StringUtils.hasText(basePageParam.getOrderBy())) {
            return;
        }
        //参见：TaskQueryProperty,
        abstractQuery.orderBy(new QueryPropertyImpl(basePageParam.getOrderBy()));
        abstractQuery.direction("desc".equals(basePageParam.getOrderSort()) ? Direction.DESCENDING : Direction.ASCENDING);
    }

    /**
     * 消费非空值
     *
     * @param setter
     * @param propValue
     * @param <T>
     */
    public static <T> void setNotNull(Consumer<T> setter, T propValue) {
        if (null == propValue || (propValue instanceof String && !StringUtils.hasText((String) propValue))) {
            return;
        }
        setter.accept(propValue);
    }

    /**
     * 消费非空值
     *
     * @param setter
     * @param propValues
     * @param <T>
     */
    public static <T> void setArrayNotNull(Consumer<T[]> setter, T...propValues) {
        if (null == propValues || 0 >= propValues.length) {
            return;
        }
        setter.accept(propValues);
    }

    /**
     * 转换对象为Double类型
     *
     * @param obj
     * @return
     */
    public static Double convertDouble(Object obj) {
        if (null == obj) {
            return null;
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        return Double.parseDouble(obj.toString());
    }

    /**
     * 转换对象为BigDecimal类型
     *
     * @param obj
     * @return
     */
    public static BigDecimal convertDecimal(Object obj) {
        if (null == obj) {
            return null;
        }
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        return new BigDecimal(obj.toString());
    }


    /**
     * 转换Java队形为Camunda ObjectValue(序列化格式为Java)
     *
     * @param obj Java对象
     * @param <T> Java对象类型
     * @return Camunda ObjectValue
     */
    public static <T> ObjectValue convertObjectValueForJava(T obj) {
        return Variables.objectValue(obj)
                .serializationDataFormat(Variables.SerializationDataFormats.JAVA)
                .create();
    }


    /**
     * 转换Java对象为Camunda ObjectValue(序列化格式为Json)
     *
     * @param obj Java对象
     * @param <T> Java对象类型
     * @return Camunda ObjectValue
     */
    public static <T> ObjectValue convertObjectValueForJson(T obj) {
        return Variables.objectValue(obj)
                .serializationDataFormat(Variables.SerializationDataFormats.JSON)
                .create();
    }

    /**
     * 转换Camunda序列化后的字符串为Java对象
     *
     * @param serializedObjStr
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T deserializeObjectValueStr(String serializedObjStr, Class<T> clazz) {
        return Variables.serializedObjectValue(serializedObjStr)
                .serializationDataFormat(Variables.SerializationDataFormats.JAVA)
                .objectTypeName(clazz.getTypeName())
                .create()
                .getValue(clazz);
    }

    /**
     * 转换文件为Camunda FileValue
     *
     * @param fileName
     * @param file
     * @param <T>
     * @return
     */
    public static <T> FileValue convertFile(String fileName, File file) {
        return Variables.fileValue(fileName)
                .file(file)
                //.mimeType("text/plain")
                .encoding("UTF-8")
                .create();
    }
}
