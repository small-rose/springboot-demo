package com.xiaocai.demo.mybatis.generator.example.entity;

/**
 *  
 * @Table : hicmi_mid_acc_detail
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class HicmiMidAccDetail {
    /**
     * 主键
     */
    private Long id;

    /**
     * sub表关联id
     */
    private Long mainId;

    /**
     * 主表关联id
     */
    private Long subId;

    /**
     * 流水号（与主表保持一致）
     */
    private String trdnm;

    /**
     * 外系统该凭证下分录数据唯一标识
     */
    private String detail;

    /**
     * 辅助核算类型编码
     */
    private String pkChecktype;

    /**
     * 辅助核算值
     */
    private String pkCheckvalue;

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
    * 获取-sub表关联id
    * @return mainId
     */
    public Long getMainId() {
        return mainId;
    }

    /**
    * 设置-sub表关联id
    * @paramType java.lang.Long
    * @param mainId - sub表关联id
     */
    public void setMainId(Long mainId) {
        this.mainId = mainId;
    }

    /**
    * 获取-主表关联id
    * @return subId
     */
    public Long getSubId() {
        return subId;
    }

    /**
    * 设置-主表关联id
    * @paramType java.lang.Long
    * @param subId - 主表关联id
     */
    public void setSubId(Long subId) {
        this.subId = subId;
    }

    /**
    * 获取-流水号（与主表保持一致）
    * @return trdnm
     */
    public String getTrdnm() {
        return trdnm;
    }

    /**
    * 设置-流水号（与主表保持一致）
    * @paramType java.lang.String
    * @param trdnm - 流水号（与主表保持一致）
     */
    public void setTrdnm(String trdnm) {
        this.trdnm = trdnm;
    }

    /**
    * 获取-外系统该凭证下分录数据唯一标识
    * @return detail
     */
    public String getDetail() {
        return detail;
    }

    /**
    * 设置-外系统该凭证下分录数据唯一标识
    * @paramType java.lang.String
    * @param detail - 外系统该凭证下分录数据唯一标识
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
    * 获取-辅助核算类型编码
    * @return pkChecktype
     */
    public String getPkChecktype() {
        return pkChecktype;
    }

    /**
    * 设置-辅助核算类型编码
    * @paramType java.lang.String
    * @param pkChecktype - 辅助核算类型编码
     */
    public void setPkChecktype(String pkChecktype) {
        this.pkChecktype = pkChecktype;
    }

    /**
    * 获取-辅助核算值
    * @return pkCheckvalue
     */
    public String getPkCheckvalue() {
        return pkCheckvalue;
    }

    /**
    * 设置-辅助核算值
    * @paramType java.lang.String
    * @param pkCheckvalue - 辅助核算值
     */
    public void setPkCheckvalue(String pkCheckvalue) {
        this.pkCheckvalue = pkCheckvalue;
    }
}