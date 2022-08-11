package cn.xiaocai.demo.camunda.workflow.constants;

public class ProcessConstants {

    //流程图 -processDefinitionKey
    public static final String PROCESSDEFINITIONKEY_DEPT = "dept_tongbao"; //部门组提交需部门组审核流程图

    public static final String PROCESSDEFINITIONKEY_DEPT_AUDIT = "dept_audit_tongbao";//部门组提交无需部门组审核流程图

    public static final String  PROCESSDEFINITIONKEY_BRANCH_PRE = "branch_pre_tongbao";//分公司初审提交申请流程图

    public static final String  PROCESSDEFINITIONKEY_BRANCH = "branch_tongbao";//分公司复核提交申请流程图

    public static final String  PROCESSDEFINITIONKEY_ZGS = "zgs_tongbao";//总公司提交申请流程图

    /**
     * 任务 - column名称
     */
    public static final String COLUMN_ID = "ID_";
    public static final String COLUMN_NAME = "NAME_";
    public static final String COLUMN_CREATE_TIME = "CREATE_TIME_";
    /**
     * 历史任务 - column名称
     */
    public static final String COLUMN_START_TIME = "START_TIME_";
    public static final String COLUMN_END_TIME = "END_TIME_";
    public static final String COLUMN_DURATION = "DURATION_";

    /**
     * 流程常量 - 排序顺序
     */
    public static final String SORT_DESC = "desc";
    public static final String SORT_ASC = "asc";
}
