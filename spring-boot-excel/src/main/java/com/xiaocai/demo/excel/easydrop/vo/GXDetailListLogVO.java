package com.xiaocai.demo.excel.easydrop.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.HeadStyle;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.xiaocai.demo.excel.easydrop.annotation.DropDownSetField;
import com.xiaocai.demo.excel.easydrop.service.drop.AuditStatusDropDownSetImpl;
import com.xiaocai.demo.excel.easydrop.service.drop.BranchCodeDropDownSetImpl;
import com.xiaocai.demo.excel.easydrop.service.drop.CustTypeDropDownSetImpl;
import com.xiaocai.demo.excel.easydrop.service.drop.DataSourceDropDownSetImpl;
import com.xiaocai.demo.excel.easydrop.service.drop.DataStatusDropDownSetImpl;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@ApiModel(description = "共享业务清单明细导入日志对象")
public class GXDetailListLogVO implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 保单号
     */
    @ApiModelProperty(value = "保单号",required=false)
    @ExcelProperty(value = "*保单号")
    @ColumnWidth(25)
    @HeadStyle(fillBackgroundColor = 10)
    private String policyNo;

    /**
     * 分公司
     */
    @ApiModelProperty(value = "分公司",required=false)
    @ExcelProperty(value = "*分公司")
    @ColumnWidth(25)
    @TableField("BRANCH_CODE")
    @DropDownSetField(sourceClass = BranchCodeDropDownSetImpl.class)
    private String branchCode;

    /**
     * 保单类型
     *//*
    @ApiModelProperty(value = "保单类型",required=false)
    @ExcelProperty(value = "保单类型")
    @ColumnWidth(25)
    @DropDownSetField(sourceClass = PolicyTypeDropDownSetImpl.class)
    private String policyType;*/

    /**
     * 数据来源
     */
    @ApiModelProperty(value = "数据来源",required=false)
    @ExcelProperty(value = "*数据来源")
    @ColumnWidth(25)
    @DropDownSetField(sourceClass = DataSourceDropDownSetImpl.class)
    private String dataSource;

    /**
     * 数据状态
     */
    @ApiModelProperty(value = "数据状态",required=false)
    @ExcelProperty(value = "数据状态")
    @ColumnWidth(25)
    @TableField("DATA_STATUS")
    @DropDownSetField(sourceClass = DataStatusDropDownSetImpl.class)
    private String dataStatus;

    /**
     * 审核状态
     */
    @ApiModelProperty(value = "审核状态",required=false)
    @ExcelProperty(value = "审核状态")
    @ColumnWidth(25)
    @TableField("AUDIT_STATUS")
    @DropDownSetField(sourceClass = AuditStatusDropDownSetImpl.class)
    private String auditStatus;

    /**
     * 客户类型
     */
    @ApiModelProperty(value = "客户类型",required=false)
    @ExcelProperty(value = "客户类型")
    @ColumnWidth(25)
    @TableField("CUST_TYPE")
    @DropDownSetField(sourceClass = CustTypeDropDownSetImpl.class)
    private String custType;

    /**
     * 保单生效时间
     */
    @ApiModelProperty(value = "保单生效时间",required=false)
    @ExcelProperty(value = "保单生效时间")
    @ColumnWidth(25)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("EFFECT_TIME")
    private Date effectTime;

    /**
     * 投保人
     */
    @ApiModelProperty(value = "投保人",required=false)
    @ExcelProperty(value = "投保人")
    @ColumnWidth(25)
    @TableField("POLICY_HOLDER")
    private String policyHolder;

    /**
     * 被保人
     */
    @ApiModelProperty(value = "被保人",required=false)
    @ExcelProperty(value = "被保人")
    @ColumnWidth(25)
    @TableField("INSURED")
    private String insured;

    /**
     * 统保代码
     */
    @ApiModelProperty(value = "统保代码",required=false)
    @ExcelProperty(value = "统保代码")
    @ColumnWidth(25)
    @TableField("TB_CODE")
    private String tbCode;

    /**
     * 签单保费
     */
    @ApiModelProperty(value = "签单保费",required=false)
    @ExcelProperty(value = "签单保费")
    @ColumnWidth(25)
    @TableField("PREMIUM")
    private BigDecimal premium;

    /**
     * 保单成本率
     */
    @ApiModelProperty(value = "保单成本率",required=false)
    @ExcelProperty(value = "保单成本率")
    @ColumnWidth(25)
    @TableField("PROFIT_SCALE")
    private BigDecimal profitScale;

    /**
     * 起保时间
     */
    @ApiModelProperty(value = "起保时间",required=false)
    @ExcelProperty(value = "起保时间"/*,converter = EasyExcelLocalDateConverter.class*/)
    @ColumnWidth(25)
    @TableField("START_TIME")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    /**
     * 终保时间
     */
    @ApiModelProperty(value = "终保时间",required=false)
    @ExcelProperty(value = "终保时间"/*,converter = EasyExcelLocalDateConverter.class*/)
    @ColumnWidth(25)
    @TableField("END_TIME")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    /**
     * 分公司code
     */
    @ExcelIgnore
    @TableField("BRANCH_NAME")
    private String branchName;


    /**
     * 共保协议号
     */
    @ApiModelProperty(value = "共保协议号",required=false)
    @ExcelProperty(value = "共保协议号")
    @ColumnWidth(25)
    @TableField("GB_AGRT_CODE")
    private String gbAgrtCode;

    /**
     * 机构A分摊保费
     */
    @ApiModelProperty(value = "机构A分摊保费",required=false)
    @ExcelProperty(value = "机构A分摊保费")
    @ColumnWidth(25)
    @TableField("A_SHARE_AMOUNT")
    private BigDecimal aShareAmount;

    /**
     * 机构B分摊保费
     */
    @ApiModelProperty(value = "机构B分摊保费",required=false)
    @ExcelProperty(value = "机构B分摊保费")
    @ColumnWidth(25)
    @TableField("B_SHARE_AMOUNT")
    private BigDecimal bShareAmount;

    /**
     * 机构A分摊利润
     */
    @ApiModelProperty(value = "机构A分摊利润",required=false)
    @ExcelProperty(value = "机构A分摊利润")
    @ColumnWidth(25)
    @TableField("A_PROFIT_AMOUNT")
    private BigDecimal aProfitAmount;


    /**
     * 机构B分摊利润
     */
    @ApiModelProperty(value = "机构B分摊利润",required=false)
    @ExcelProperty(value = "机构B分摊利润")
    @ColumnWidth(25)
    @TableField("B_PROFIT_AMOUNT")
    private BigDecimal bProfitAmount;

    /**
     * 校验错误信息
     */
    @ApiModelProperty(value = "校验错误信息",required=false)
    @ColumnWidth(50)
    @ExcelProperty(value = "校验错误信息")
    private String errorInfo;

    @ApiModelProperty(value = "比较字段请求时无需填写",required=false)
    @ExcelIgnore
    private String compareColumn;

}
