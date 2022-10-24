package com.xiaocai.demo.excel.easydrop.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.HeadStyle;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.xiaocai.demo.excel.easydrop.annotation.DropDownSetField;
import com.xiaocai.demo.excel.easydrop.service.casecade.MidBranchDataServiceImpl;
import com.xiaocai.demo.excel.easydrop.service.casecade.SubBranchDataServiceImpl;
import com.xiaocai.demo.excel.easydrop.service.casecade.SubcompanyDataServiceImpl;
import com.xiaocai.demo.excel.easydrop.service.impl.AuditStatusDropDownSetImpl;
import com.xiaocai.demo.excel.easydrop.service.impl.CustTypeDropDownSetImpl;
import com.xiaocai.demo.excel.easydrop.service.impl.DataSourceDropDownSetImpl;
import com.xiaocai.demo.excel.easydrop.service.impl.DataStatusDropDownSetImpl;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@ApiModel(description = "共享业务清单明细导入请求对象")
public class GXDetailListVO implements Serializable {
//    @ExcelIgnore
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
     * 分公司code
     */
    @ApiModelProperty(value = "分公司",required=false)
    @ExcelProperty(value = "*分公司")
    @ColumnWidth(25)
    @DropDownSetField(sourceClass = SubcompanyDataServiceImpl.class, methodName = "getSubcompany")
    private String branchCode;

    @ApiModelProperty(value="中支公司",required = false)
    @ColumnWidth(32)
    @ExcelProperty(value = "*中支公司")
    @DropDownSetField(sourceClass = MidBranchDataServiceImpl.class, methodName = "getMidBranch",
            beforeFieldName = "branchCode")
    private String midBranchCode	;

    @ApiModelProperty(value="支公司",required = false)
    @ColumnWidth(35)
    @ExcelProperty(value = "*支公司")
    @DropDownSetField(sourceClass = SubBranchDataServiceImpl.class, methodName = "getSubBranch",
            beforeFieldName = "midBranchCode")
    private String subBranchCode	;


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
    @DropDownSetField(sourceClass = DataStatusDropDownSetImpl.class)
    private String dataStatus;

    /**
     * 审核状态
     */
    @ApiModelProperty(value = "审核状态",required=false)
    @ExcelProperty(value = "审核状态")
    @ColumnWidth(25)
    @DropDownSetField(sourceClass = AuditStatusDropDownSetImpl.class)
    private String auditStatus;

    /**
     * 客户类型
     */
    @ApiModelProperty(value = "客户类型",required=false)
    @ExcelProperty(value = "客户类型")
    @ColumnWidth(25)
    @DropDownSetField(sourceClass = CustTypeDropDownSetImpl.class)
    private String custType;

    /**
     * 保单生效时间
     */
    @ApiModelProperty(value = "保单生效时间",required=false)
    @ExcelProperty(value = "保单生效时间")
    @ColumnWidth(25)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date effectTime;

    /**
     * 投保人
     */
    @ApiModelProperty(value = "投保人",required=false)
    @ExcelProperty(value = "投保人")
    @ColumnWidth(25)
    private String policyHolder;

    /**
     * 被保人
     */
    @ApiModelProperty(value = "被保人",required=false)
    @ExcelProperty(value = "被保人")
    @ColumnWidth(25)
    private String insured;


    /**
     * 签单保费
     */
    @ApiModelProperty(value = "签单保费",required=false)
    @ExcelProperty(value = "签单保费")
    @ColumnWidth(25)
    private BigDecimal premium;

    /**
     * 保单成本率
     */
    @ApiModelProperty(value = "保单成本率",required=false)
    @ExcelProperty(value = "保单成本率")
    @ColumnWidth(25)
    private BigDecimal profitScale;

    /**
     * 起保时间
     */
    @ApiModelProperty(value = "起保时间",required=false)
    @ExcelProperty(value = "起保时间")
    @ColumnWidth(25)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    /**
     * 终保时间
     */
    @ApiModelProperty(value = "终保时间",required=false)
    @ExcelProperty(value = "终保时间")
    @ColumnWidth(25)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    /**
     * 分公司
     */
    @ExcelIgnore
    private String branchName;

    /**
     * 共保协议号
     */
    @ApiModelProperty(value = "共保协议号",required=false)
    @ExcelProperty(value = "共保协议号")
    @ColumnWidth(25)
    private String gbAgrtCode;


}
