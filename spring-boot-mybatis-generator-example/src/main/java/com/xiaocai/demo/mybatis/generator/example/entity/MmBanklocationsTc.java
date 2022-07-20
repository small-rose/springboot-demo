package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_banklocations_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmBanklocationsTc {
    /**
     * 主键
     */
    private Long urid;

    /**
     * 代码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 系统银行
     */
    private BigDecimal sybankid;

    /**
     * 标准区域
     */
    private String standardareaid;

    /**
     * 创建日期
     */
    private Date createdon;

    /**
     * 最近一次修改日期
     */
    private Date lastmodifiedon;

    /**
    * 获取-主键
    * @return urid
     */
    public Long getUrid() {
        return urid;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param urid - 主键
     */
    public void setUrid(Long urid) {
        this.urid = urid;
    }

    /**
    * 获取-代码
    * @return code
     */
    public String getCode() {
        return code;
    }

    /**
    * 设置-代码
    * @paramType java.lang.String
    * @param code - 代码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
    * 获取-名称
    * @return name
     */
    public String getName() {
        return name;
    }

    /**
    * 设置-名称
    * @paramType java.lang.String
    * @param name - 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
    * 获取-系统银行
    * @return sybankid
     */
    public BigDecimal getSybankid() {
        return sybankid;
    }

    /**
    * 设置-系统银行
    * @paramType java.math.BigDecimal
    * @param sybankid - 系统银行
     */
    public void setSybankid(BigDecimal sybankid) {
        this.sybankid = sybankid;
    }

    /**
    * 获取-标准区域
    * @return standardareaid
     */
    public String getStandardareaid() {
        return standardareaid;
    }

    /**
    * 设置-标准区域
    * @paramType java.lang.String
    * @param standardareaid - 标准区域
     */
    public void setStandardareaid(String standardareaid) {
        this.standardareaid = standardareaid;
    }

    /**
    * 获取-创建日期
    * @return createdon
     */
    public Date getCreatedon() {
        return createdon;
    }

    /**
    * 设置-创建日期
    * @paramType java.util.Date
    * @param createdon - 创建日期
     */
    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    /**
    * 获取-最近一次修改日期
    * @return lastmodifiedon
     */
    public Date getLastmodifiedon() {
        return lastmodifiedon;
    }

    /**
    * 设置-最近一次修改日期
    * @paramType java.util.Date
    * @param lastmodifiedon - 最近一次修改日期
     */
    public void setLastmodifiedon(Date lastmodifiedon) {
        this.lastmodifiedon = lastmodifiedon;
    }
}