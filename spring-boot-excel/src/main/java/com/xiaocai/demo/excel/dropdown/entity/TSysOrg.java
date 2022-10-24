package com.xiaocai.demo.excel.dropdown.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 机构信息表（T_SYS_ORG）
 * </p>
 *
 * @author xuguoping
 * @since 2021-10-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("T_SYS_ORG")
public class TSysOrg implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 机构编号
     */
    @TableId(value = "ORG_CODE", type = IdType.INPUT)
    private String orgCode;

    /**
     * 父机构编号;-1：顶层机构
     */
    @TableField("FATHER_ORG_CODE")
    private String fatherOrgCode;

    /**
     * 机构名
     */
    @TableField("ORG_NAME")
    private String orgName;

    /**
     * 联系人
     */
    @TableField("CONTACT_NAME")
    private String contactName;

    /**
     * 联系电话
     */
    @TableField("CONTACT_PHONE")
    private String contactPhone;

    /**
     * 邮箱
     */
    @TableField("EMAIL")
    private String email;

    /**
     * 机构地址
     */
    @TableField("ORG_ADDR")
    private String orgAddr;

    /**
     * 机构省份
     */
    @TableField("PROVINCE")
    private String province;

    /**
     * 状态;00：正常状态；01：停用状态
     */
    @TableField("STATUS")
    private String status;

    /**
     * 创建人
     */
    @TableField("CREATED_BY")
    private String createdBy;

    /**
     * 创建时间
     */
    @TableField("CREATED_TIME")
    private Date createdTime;

    /**
     * 更新人
     */
    @TableField("UPDATED_BY")
    private String updatedBy;

    /**
     * 更新时间
     */
    @TableField("UPDATED_TIME")
    private Date updatedTime;

    @TableField("UNION_ORG_CODE")
    private String unionOrgCode;

    @TableField("NUM")
    private String num;

    @TableField("SYNC_FLAG")
    private String syncFlag;

    @TableField("ORG_LEVEL")
    private Integer orgLevel;
}
