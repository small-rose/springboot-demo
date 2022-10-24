package com.xiaocai.demo.excel.dropdown.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.HeadStyle;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.xiaocai.demo.excel.dropdown.annotation.ExcelDropDown;
import com.xiaocai.demo.excel.dropdown.annotation.ExcelFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Project : businessVehicleIntelligent
 * @Author : zengfangling
 * @Description : [ ImportRenewalVo ] 说明：无
 * @Function :  功能说明：无
 * @Date : 2022/9/28 15:04
 * @Version ： 1.0
 **/
@Data
@ApiModel(description = "应续保单导入请求对象")
@ExcelFile(enableDataValidation = true,  fileName = "测试级联下拉excel.xlsx")
public class ImportRenewalVo implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value="批次号",required = true)
    @ColumnWidth(25)
    @ExcelProperty(value = "*批次号")
    @HeadStyle(fillBackgroundColor = 10)
    private String batchNo	;

    @ApiModelProperty(value="分公司",required = true)
    @ColumnWidth(25)
    @ExcelProperty(value = "*分公司")
    @ExcelDropDown(datasourceMethod = "com.xiaocai.demo.excel.dropdown.service.RenewalSubDropDownImpl.getBranchCode",
            columnWidth = (int)((20 + 0.72) * 256))
    private String branchCode	;

    @ApiModelProperty(value="中支公司",required = true)
    @ColumnWidth(25)
    @ExcelProperty(value = "*中支公司")
    @ExcelDropDown(datasourceMethod = "com.xiaocai.demo.excel.dropdown.service.RenewalSubDropDownImpl.getMidBranchCode",
            beforeFieldName = "branchCode",columnWidth = (int)((32 + 0.72) * 256))
    private String midBranchCode	;

    @ApiModelProperty(value="支公司",required = true)
    @ColumnWidth(25)
    @ExcelProperty(value = "*支公司")
    @ExcelDropDown(datasourceMethod = "com.xiaocai.demo.excel.dropdown.service.RenewalSubDropDownImpl.getSubBranchCode",
            beforeFieldName = "midBranchCode",columnWidth = (int)((35 + 0.72) * 256))
    private String subBranchCode	;

    @ApiModelProperty(value="经办人",required = true)
    @ColumnWidth(25)
    @ExcelProperty(value = "*经办人")
    private String handlerName	;

    @ApiModelProperty(value="投保人",required = true)
    @ColumnWidth(25)
    @ExcelProperty(value = "*投保人")
    private String applicantName	;

    @ApiModelProperty(value="客户名称",required = true)
    @ColumnWidth(25)
    @ExcelProperty(value = "*客户名称")
    private String customerName	;

    @ApiModelProperty(value="客户标签",required = true)
    @ColumnWidth(25)
    @ExcelProperty(value = "*客户标签")
    private String customerTag	;

    @ApiModelProperty(value="续保客户类型",required = true)
    @ColumnWidth(25)
    @ExcelProperty(value = "*续保客户类型")
    @ExcelDropDown(datasourceMethod = "com.xiaocai.demo.excel.dropdown.service.RenewalSubDropDownImpl.getXBType")
//    @ExcelDropDown(datasourceMethod ="")  测试先不整
    private String customerType	;

    @ApiModelProperty(value="车辆使用性质（商业险）",required = true)
    @ColumnWidth(25)
    @ExcelProperty(value = "*车辆使用性质（商业险）")
    @ExcelDropDown(columnWidth = (int)((40 + 0.72) * 256))
    private String vehicleNature	;

    @ApiModelProperty(value="车辆数",required = true)
    @ColumnWidth(25)
    @ExcelProperty(value = "*车辆数")
    private String vehicleCount	;

    @ApiModelProperty(value="跟踪进度",required = false)
    @ColumnWidth(25)
    @ExcelProperty(value = "跟踪进度")
    private String progress	;

    @ApiModelProperty(value="应续年月",required = true)
    @ColumnWidth(25)
    @ExcelProperty(value = "*应续年月")
    private Date renewalDate	;


    @ApiModelProperty(value="更新时间",required = true)
    @ColumnWidth(25)
    @ExcelProperty(value = "*更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime	;

//    /**
//     * 校验错误信息
//     */
//    @ApiModelProperty(value = "校验错误信息",required=false)
//    @ExcelIgnore
//    private String errorInfo;
}
