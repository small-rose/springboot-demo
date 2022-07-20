package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_deposit_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmDepositTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 批次号
     */
    private String rcptno;

    /**
     * 条件字段1
     */
    private String column1;

    /**
     * 条件字段2
     */
    private String column2;

    /**
     * 条件字段3
     */
    private String column3;

    /**
     * 条件字段4
     */
    private String column4;

    /**
     * 条件字段5
     */
    private String column5;

    /**
     * 条件字段6
     */
    private String column6;

    /**
     * 条件字段7
     */
    private String column7;

    /**
     * 描述
     */
    private String memo;

    /**
     * 导入状态 1成功 0失败
     */
    private String status;

    /**
     * 导入失败原因
     */
    private String reason;

    /**
     * 模板名字 applicant_template
     */
    private String template;

    /**
     * 导入时间
     */
    private Date importdate;

    /**
    * 获取-主键
    * @return id
     */
    public Long getId() {
        return id;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param id - 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    * 获取-批次号
    * @return rcptno
     */
    public String getRcptno() {
        return rcptno;
    }

    /**
    * 设置-批次号
    * @paramType java.lang.String
    * @param rcptno - 批次号
     */
    public void setRcptno(String rcptno) {
        this.rcptno = rcptno;
    }

    /**
    * 获取-条件字段1
    * @return column1
     */
    public String getColumn1() {
        return column1;
    }

    /**
    * 设置-条件字段1
    * @paramType java.lang.String
    * @param column1 - 条件字段1
     */
    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    /**
    * 获取-条件字段2
    * @return column2
     */
    public String getColumn2() {
        return column2;
    }

    /**
    * 设置-条件字段2
    * @paramType java.lang.String
    * @param column2 - 条件字段2
     */
    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    /**
    * 获取-条件字段3
    * @return column3
     */
    public String getColumn3() {
        return column3;
    }

    /**
    * 设置-条件字段3
    * @paramType java.lang.String
    * @param column3 - 条件字段3
     */
    public void setColumn3(String column3) {
        this.column3 = column3;
    }

    /**
    * 获取-条件字段4
    * @return column4
     */
    public String getColumn4() {
        return column4;
    }

    /**
    * 设置-条件字段4
    * @paramType java.lang.String
    * @param column4 - 条件字段4
     */
    public void setColumn4(String column4) {
        this.column4 = column4;
    }

    /**
    * 获取-条件字段5
    * @return column5
     */
    public String getColumn5() {
        return column5;
    }

    /**
    * 设置-条件字段5
    * @paramType java.lang.String
    * @param column5 - 条件字段5
     */
    public void setColumn5(String column5) {
        this.column5 = column5;
    }

    /**
    * 获取-条件字段6
    * @return column6
     */
    public String getColumn6() {
        return column6;
    }

    /**
    * 设置-条件字段6
    * @paramType java.lang.String
    * @param column6 - 条件字段6
     */
    public void setColumn6(String column6) {
        this.column6 = column6;
    }

    /**
    * 获取-条件字段7
    * @return column7
     */
    public String getColumn7() {
        return column7;
    }

    /**
    * 设置-条件字段7
    * @paramType java.lang.String
    * @param column7 - 条件字段7
     */
    public void setColumn7(String column7) {
        this.column7 = column7;
    }

    /**
    * 获取-描述
    * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
    * 设置-描述
    * @paramType java.lang.String
    * @param memo - 描述
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
    * 获取-导入状态 1成功 0失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-导入状态 1成功 0失败
    * @paramType java.lang.String
    * @param status - 导入状态 1成功 0失败
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-导入失败原因
    * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
    * 设置-导入失败原因
    * @paramType java.lang.String
    * @param reason - 导入失败原因
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
    * 获取-模板名字 applicant_template
    * @return template
     */
    public String getTemplate() {
        return template;
    }

    /**
    * 设置-模板名字 applicant_template
    * @paramType java.lang.String
    * @param template - 模板名字 applicant_template
     */
    public void setTemplate(String template) {
        this.template = template;
    }

    /**
    * 获取-导入时间
    * @return importdate
     */
    public Date getImportdate() {
        return importdate;
    }

    /**
    * 设置-导入时间
    * @paramType java.util.Date
    * @param importdate - 导入时间
     */
    public void setImportdate(Date importdate) {
        this.importdate = importdate;
    }
}