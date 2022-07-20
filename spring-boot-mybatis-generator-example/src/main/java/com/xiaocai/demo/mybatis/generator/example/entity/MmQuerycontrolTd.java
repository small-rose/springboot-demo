package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_querycontrol_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmQuerycontrolTd {
    /**
     * 申请号
     */
    private Long applyno;

    /**
     * 详见任务代码表
     */
    private String taskcode;

    /**
     * 用户提交申请的时间
     */
    private Date applytime;

    /**
     * 后台任务处理完成的时间点
     */
    private Date finishedtime;

    /**
     * 结果类型，1 文字， 2 url
     */
    private Short resulttype;

    /**
     * 反馈给客户的信息或者提取号
     */
    private String result;

    /**
     * 记录后台返回信息，或者其他一些，不需要返回给客户但对维护有用的信息。
     */
    private String note;

    /**
     * 1申请提交；2处理中；3完成；4已提取；5文件已过时；A任务处理出错或任务未完成； 对于4已提取，只有结果只允许一次提取时可能有用，一般情况下不用。
     */
    private String status;

    /**
     * 用于记录任务执行所需要的参数，如台帐切片的时间、机构、台帐类型等。
     */
    private String param;

    /**
     * 任务优先级，初始为0
     */
    private Long pri;

    /**
     * 任务重复执行的次数，初始(第一次执行)为0，以后再执行时，在当前基础上加1
     */
    private Long againnum;

    /**
     * 查询类型所属的模块的名称
     */
    private String modename;

    /**
     * SQL大字段
     */
    private String sqlstr;

    /**
     * SQL对应中文对照
     */
    private String fieldname;

    /**
     * SQLSTR1
     */
    private String sqlstr1;

    /**
     * SQLSTR2
     */
    private String sqlstr2;

    /**
     * SQLSTR3
     */
    private String sqlstr3;

    /**
     * SQLSTR4
     */
    private String sqlstr4;

    /**
     * SQLSTR5
     */
    private String sqlstr5;

    /**
     * SQLSTR6
     */
    private String sqlstr6;

    /**
     * SQLSTR7
     */
    private String sqlstr7;

    /**
     * SQLSTR8
     */
    private String sqlstr8;

    /**
     * SQLSTR9
     */
    private String sqlstr9;

    /**
     * SQLSTR10
     */
    private String sqlstr10;

    /**
     * SQLSTR11
     */
    private String sqlstr11;

    /**
     * SQLSTR12
     */
    private String sqlstr12;

    /**
     * SQLSTR13
     */
    private String sqlstr13;

    /**
     * SQLSTR14
     */
    private String sqlstr14;

    /**
     * SQLSTR15
     */
    private String sqlstr15;

    /**
     * SQLSTR16
     */
    private String sqlstr16;

    /**
     * SQLSTR17
     */
    private String sqlstr17;

    /**
     * SQLSTR18
     */
    private String sqlstr18;

    /**
     * SQLSTR19
     */
    private String sqlstr19;

    /**
     * SQLSTR20
     */
    private String sqlstr20;

    /**
    * 获取-申请号
    * @return applyno
     */
    public Long getApplyno() {
        return applyno;
    }

    /**
    * 设置-申请号
    * @paramType java.lang.Long
    * @param applyno - 申请号
     */
    public void setApplyno(Long applyno) {
        this.applyno = applyno;
    }

    /**
    * 获取-详见任务代码表
    * @return taskcode
     */
    public String getTaskcode() {
        return taskcode;
    }

    /**
    * 设置-详见任务代码表
    * @paramType java.lang.String
    * @param taskcode - 详见任务代码表
     */
    public void setTaskcode(String taskcode) {
        this.taskcode = taskcode;
    }

    /**
    * 获取-用户提交申请的时间
    * @return applytime
     */
    public Date getApplytime() {
        return applytime;
    }

    /**
    * 设置-用户提交申请的时间
    * @paramType java.util.Date
    * @param applytime - 用户提交申请的时间
     */
    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    /**
    * 获取-后台任务处理完成的时间点
    * @return finishedtime
     */
    public Date getFinishedtime() {
        return finishedtime;
    }

    /**
    * 设置-后台任务处理完成的时间点
    * @paramType java.util.Date
    * @param finishedtime - 后台任务处理完成的时间点
     */
    public void setFinishedtime(Date finishedtime) {
        this.finishedtime = finishedtime;
    }

    /**
    * 获取-结果类型，1 文字， 2 url
    * @return resulttype
     */
    public Short getResulttype() {
        return resulttype;
    }

    /**
    * 设置-结果类型，1 文字， 2 url
    * @paramType java.lang.Short
    * @param resulttype - 结果类型，1 文字， 2 url
     */
    public void setResulttype(Short resulttype) {
        this.resulttype = resulttype;
    }

    /**
    * 获取-反馈给客户的信息或者提取号
    * @return result
     */
    public String getResult() {
        return result;
    }

    /**
    * 设置-反馈给客户的信息或者提取号
    * @paramType java.lang.String
    * @param result - 反馈给客户的信息或者提取号
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
    * 获取-记录后台返回信息，或者其他一些，不需要返回给客户但对维护有用的信息。
    * @return note
     */
    public String getNote() {
        return note;
    }

    /**
    * 设置-记录后台返回信息，或者其他一些，不需要返回给客户但对维护有用的信息。
    * @paramType java.lang.String
    * @param note - 记录后台返回信息，或者其他一些，不需要返回给客户但对维护有用的信息。
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
    * 获取-1申请提交；2处理中；3完成；4已提取；5文件已过时；A任务处理出错或任务未完成；
对于4已提取，只有结果只允许一次提取时可能有用，一般情况下不用。
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-1申请提交；2处理中；3完成；4已提取；5文件已过时；A任务处理出错或任务未完成；
对于4已提取，只有结果只允许一次提取时可能有用，一般情况下不用。
    * @paramType java.lang.String
    * @param status - 1申请提交；2处理中；3完成；4已提取；5文件已过时；A任务处理出错或任务未完成；
对于4已提取，只有结果只允许一次提取时可能有用，一般情况下不用。
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-用于记录任务执行所需要的参数，如台帐切片的时间、机构、台帐类型等。
    * @return param
     */
    public String getParam() {
        return param;
    }

    /**
    * 设置-用于记录任务执行所需要的参数，如台帐切片的时间、机构、台帐类型等。
    * @paramType java.lang.String
    * @param param - 用于记录任务执行所需要的参数，如台帐切片的时间、机构、台帐类型等。
     */
    public void setParam(String param) {
        this.param = param;
    }

    /**
    * 获取-任务优先级，初始为0
    * @return pri
     */
    public Long getPri() {
        return pri;
    }

    /**
    * 设置-任务优先级，初始为0
    * @paramType java.lang.Long
    * @param pri - 任务优先级，初始为0
     */
    public void setPri(Long pri) {
        this.pri = pri;
    }

    /**
    * 获取-任务重复执行的次数，初始(第一次执行)为0，以后再执行时，在当前基础上加1
    * @return againnum
     */
    public Long getAgainnum() {
        return againnum;
    }

    /**
    * 设置-任务重复执行的次数，初始(第一次执行)为0，以后再执行时，在当前基础上加1
    * @paramType java.lang.Long
    * @param againnum - 任务重复执行的次数，初始(第一次执行)为0，以后再执行时，在当前基础上加1
     */
    public void setAgainnum(Long againnum) {
        this.againnum = againnum;
    }

    /**
    * 获取-查询类型所属的模块的名称
    * @return modename
     */
    public String getModename() {
        return modename;
    }

    /**
    * 设置-查询类型所属的模块的名称
    * @paramType java.lang.String
    * @param modename - 查询类型所属的模块的名称
     */
    public void setModename(String modename) {
        this.modename = modename;
    }

    /**
    * 获取-SQL大字段
    * @return sqlstr
     */
    public String getSqlstr() {
        return sqlstr;
    }

    /**
    * 设置-SQL大字段
    * @paramType java.lang.String
    * @param sqlstr - SQL大字段
     */
    public void setSqlstr(String sqlstr) {
        this.sqlstr = sqlstr;
    }

    /**
    * 获取-SQL对应中文对照
    * @return fieldname
     */
    public String getFieldname() {
        return fieldname;
    }

    /**
    * 设置-SQL对应中文对照
    * @paramType java.lang.String
    * @param fieldname - SQL对应中文对照
     */
    public void setFieldname(String fieldname) {
        this.fieldname = fieldname;
    }

    /**
    * 获取-SQLSTR1
    * @return sqlstr1
     */
    public String getSqlstr1() {
        return sqlstr1;
    }

    /**
    * 设置-SQLSTR1
    * @paramType java.lang.String
    * @param sqlstr1 - SQLSTR1
     */
    public void setSqlstr1(String sqlstr1) {
        this.sqlstr1 = sqlstr1;
    }

    /**
    * 获取-SQLSTR2
    * @return sqlstr2
     */
    public String getSqlstr2() {
        return sqlstr2;
    }

    /**
    * 设置-SQLSTR2
    * @paramType java.lang.String
    * @param sqlstr2 - SQLSTR2
     */
    public void setSqlstr2(String sqlstr2) {
        this.sqlstr2 = sqlstr2;
    }

    /**
    * 获取-SQLSTR3
    * @return sqlstr3
     */
    public String getSqlstr3() {
        return sqlstr3;
    }

    /**
    * 设置-SQLSTR3
    * @paramType java.lang.String
    * @param sqlstr3 - SQLSTR3
     */
    public void setSqlstr3(String sqlstr3) {
        this.sqlstr3 = sqlstr3;
    }

    /**
    * 获取-SQLSTR4
    * @return sqlstr4
     */
    public String getSqlstr4() {
        return sqlstr4;
    }

    /**
    * 设置-SQLSTR4
    * @paramType java.lang.String
    * @param sqlstr4 - SQLSTR4
     */
    public void setSqlstr4(String sqlstr4) {
        this.sqlstr4 = sqlstr4;
    }

    /**
    * 获取-SQLSTR5
    * @return sqlstr5
     */
    public String getSqlstr5() {
        return sqlstr5;
    }

    /**
    * 设置-SQLSTR5
    * @paramType java.lang.String
    * @param sqlstr5 - SQLSTR5
     */
    public void setSqlstr5(String sqlstr5) {
        this.sqlstr5 = sqlstr5;
    }

    /**
    * 获取-SQLSTR6
    * @return sqlstr6
     */
    public String getSqlstr6() {
        return sqlstr6;
    }

    /**
    * 设置-SQLSTR6
    * @paramType java.lang.String
    * @param sqlstr6 - SQLSTR6
     */
    public void setSqlstr6(String sqlstr6) {
        this.sqlstr6 = sqlstr6;
    }

    /**
    * 获取-SQLSTR7
    * @return sqlstr7
     */
    public String getSqlstr7() {
        return sqlstr7;
    }

    /**
    * 设置-SQLSTR7
    * @paramType java.lang.String
    * @param sqlstr7 - SQLSTR7
     */
    public void setSqlstr7(String sqlstr7) {
        this.sqlstr7 = sqlstr7;
    }

    /**
    * 获取-SQLSTR8
    * @return sqlstr8
     */
    public String getSqlstr8() {
        return sqlstr8;
    }

    /**
    * 设置-SQLSTR8
    * @paramType java.lang.String
    * @param sqlstr8 - SQLSTR8
     */
    public void setSqlstr8(String sqlstr8) {
        this.sqlstr8 = sqlstr8;
    }

    /**
    * 获取-SQLSTR9
    * @return sqlstr9
     */
    public String getSqlstr9() {
        return sqlstr9;
    }

    /**
    * 设置-SQLSTR9
    * @paramType java.lang.String
    * @param sqlstr9 - SQLSTR9
     */
    public void setSqlstr9(String sqlstr9) {
        this.sqlstr9 = sqlstr9;
    }

    /**
    * 获取-SQLSTR10
    * @return sqlstr10
     */
    public String getSqlstr10() {
        return sqlstr10;
    }

    /**
    * 设置-SQLSTR10
    * @paramType java.lang.String
    * @param sqlstr10 - SQLSTR10
     */
    public void setSqlstr10(String sqlstr10) {
        this.sqlstr10 = sqlstr10;
    }

    /**
    * 获取-SQLSTR11
    * @return sqlstr11
     */
    public String getSqlstr11() {
        return sqlstr11;
    }

    /**
    * 设置-SQLSTR11
    * @paramType java.lang.String
    * @param sqlstr11 - SQLSTR11
     */
    public void setSqlstr11(String sqlstr11) {
        this.sqlstr11 = sqlstr11;
    }

    /**
    * 获取-SQLSTR12
    * @return sqlstr12
     */
    public String getSqlstr12() {
        return sqlstr12;
    }

    /**
    * 设置-SQLSTR12
    * @paramType java.lang.String
    * @param sqlstr12 - SQLSTR12
     */
    public void setSqlstr12(String sqlstr12) {
        this.sqlstr12 = sqlstr12;
    }

    /**
    * 获取-SQLSTR13
    * @return sqlstr13
     */
    public String getSqlstr13() {
        return sqlstr13;
    }

    /**
    * 设置-SQLSTR13
    * @paramType java.lang.String
    * @param sqlstr13 - SQLSTR13
     */
    public void setSqlstr13(String sqlstr13) {
        this.sqlstr13 = sqlstr13;
    }

    /**
    * 获取-SQLSTR14
    * @return sqlstr14
     */
    public String getSqlstr14() {
        return sqlstr14;
    }

    /**
    * 设置-SQLSTR14
    * @paramType java.lang.String
    * @param sqlstr14 - SQLSTR14
     */
    public void setSqlstr14(String sqlstr14) {
        this.sqlstr14 = sqlstr14;
    }

    /**
    * 获取-SQLSTR15
    * @return sqlstr15
     */
    public String getSqlstr15() {
        return sqlstr15;
    }

    /**
    * 设置-SQLSTR15
    * @paramType java.lang.String
    * @param sqlstr15 - SQLSTR15
     */
    public void setSqlstr15(String sqlstr15) {
        this.sqlstr15 = sqlstr15;
    }

    /**
    * 获取-SQLSTR16
    * @return sqlstr16
     */
    public String getSqlstr16() {
        return sqlstr16;
    }

    /**
    * 设置-SQLSTR16
    * @paramType java.lang.String
    * @param sqlstr16 - SQLSTR16
     */
    public void setSqlstr16(String sqlstr16) {
        this.sqlstr16 = sqlstr16;
    }

    /**
    * 获取-SQLSTR17
    * @return sqlstr17
     */
    public String getSqlstr17() {
        return sqlstr17;
    }

    /**
    * 设置-SQLSTR17
    * @paramType java.lang.String
    * @param sqlstr17 - SQLSTR17
     */
    public void setSqlstr17(String sqlstr17) {
        this.sqlstr17 = sqlstr17;
    }

    /**
    * 获取-SQLSTR18
    * @return sqlstr18
     */
    public String getSqlstr18() {
        return sqlstr18;
    }

    /**
    * 设置-SQLSTR18
    * @paramType java.lang.String
    * @param sqlstr18 - SQLSTR18
     */
    public void setSqlstr18(String sqlstr18) {
        this.sqlstr18 = sqlstr18;
    }

    /**
    * 获取-SQLSTR19
    * @return sqlstr19
     */
    public String getSqlstr19() {
        return sqlstr19;
    }

    /**
    * 设置-SQLSTR19
    * @paramType java.lang.String
    * @param sqlstr19 - SQLSTR19
     */
    public void setSqlstr19(String sqlstr19) {
        this.sqlstr19 = sqlstr19;
    }

    /**
    * 获取-SQLSTR20
    * @return sqlstr20
     */
    public String getSqlstr20() {
        return sqlstr20;
    }

    /**
    * 设置-SQLSTR20
    * @paramType java.lang.String
    * @param sqlstr20 - SQLSTR20
     */
    public void setSqlstr20(String sqlstr20) {
        this.sqlstr20 = sqlstr20;
    }
}