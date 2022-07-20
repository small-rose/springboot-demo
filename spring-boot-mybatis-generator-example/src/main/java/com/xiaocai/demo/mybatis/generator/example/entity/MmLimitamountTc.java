package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_limitamount_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmLimitamountTc {
    /**
     * 主键
     */
    private Long id;

    /**
     * 限额类型
     */
    private String limittype;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 限制金额
     */
    private BigDecimal limitamount;

    /**
     * 是否有效 0无效 1有效
     */
    private String ifvalue;

    /**
     * 备注
     */
    private String remark;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

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
    * 获取-限额类型
    * @return limittype
     */
    public String getLimittype() {
        return limittype;
    }

    /**
    * 设置-限额类型
    * @paramType java.lang.String
    * @param limittype - 限额类型
     */
    public void setLimittype(String limittype) {
        this.limittype = limittype;
    }

    /**
    * 获取-分公司
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司
    * @paramType java.lang.String
    * @param subcompany - 分公司
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-限制金额
    * @return limitamount
     */
    public BigDecimal getLimitamount() {
        return limitamount;
    }

    /**
    * 设置-限制金额
    * @paramType java.math.BigDecimal
    * @param limitamount - 限制金额
     */
    public void setLimitamount(BigDecimal limitamount) {
        this.limitamount = limitamount;
    }

    /**
    * 获取-是否有效 0无效 1有效
    * @return ifvalue
     */
    public String getIfvalue() {
        return ifvalue;
    }

    /**
    * 设置-是否有效 0无效 1有效
    * @paramType java.lang.String
    * @param ifvalue - 是否有效 0无效 1有效
     */
    public void setIfvalue(String ifvalue) {
        this.ifvalue = ifvalue;
    }

    /**
    * 获取-备注
    * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param remark - 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
    * 获取-时间戳
    * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
    * 设置-时间戳
    * @paramType java.util.Date
    * @param timestamp - 时间戳
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
    * 获取-最后操作日期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作日期
    * @paramType java.util.Date
    * @param lastopdate - 最后操作日期
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }
}