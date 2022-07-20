package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_classesrate_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmClassesrateTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 险种代码
     */
    private String classescode;

    /**
     * 税费类型（1：营业税、2：教育费附加、3：城建税、4：河道及堤防维护税、5：其他税种）
     */
    private String ratetype;

    /**
     * 税费率
     */
    private BigDecimal rate;

    /**
     * 操作人
     */
    private String opcode;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * HIBERNATEVERSION版本
     */
    private Integer hibernateversion;

    /**
     * 状态  1生效 3作废
     */
    private String status;

    /**
     * 最后操作人
     */
    private String lastopcode;

    /**
     * 有些分公司的货运险营业税和教育费附加要免税  0 无免税 1 内陆货运险免税  2 进口免税  3 出口免税  4 进出口免税  5 都免税
     */
    private String noratetype;

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
    * 获取-险种代码
    * @return classescode
     */
    public String getClassescode() {
        return classescode;
    }

    /**
    * 设置-险种代码
    * @paramType java.lang.String
    * @param classescode - 险种代码
     */
    public void setClassescode(String classescode) {
        this.classescode = classescode;
    }

    /**
    * 获取-税费类型（1：营业税、2：教育费附加、3：城建税、4：河道及堤防维护税、5：其他税种）
    * @return ratetype
     */
    public String getRatetype() {
        return ratetype;
    }

    /**
    * 设置-税费类型（1：营业税、2：教育费附加、3：城建税、4：河道及堤防维护税、5：其他税种）
    * @paramType java.lang.String
    * @param ratetype - 税费类型（1：营业税、2：教育费附加、3：城建税、4：河道及堤防维护税、5：其他税种）
     */
    public void setRatetype(String ratetype) {
        this.ratetype = ratetype;
    }

    /**
    * 获取-税费率
    * @return rate
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
    * 设置-税费率
    * @paramType java.math.BigDecimal
    * @param rate - 税费率
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
    * 获取-操作人
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作人
    * @paramType java.lang.String
    * @param opcode - 操作人
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
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
    * 获取-HIBERNATEVERSION版本
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATEVERSION版本
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATEVERSION版本
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-状态  1生效 3作废
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态  1生效 3作废
    * @paramType java.lang.String
    * @param status - 状态  1生效 3作废
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-最后操作人
    * @return lastopcode
     */
    public String getLastopcode() {
        return lastopcode;
    }

    /**
    * 设置-最后操作人
    * @paramType java.lang.String
    * @param lastopcode - 最后操作人
     */
    public void setLastopcode(String lastopcode) {
        this.lastopcode = lastopcode;
    }

    /**
    * 获取-有些分公司的货运险营业税和教育费附加要免税  0 无免税 1 内陆货运险免税  2 进口免税  3 出口免税  4 进出口免税  5 都免税
    * @return noratetype
     */
    public String getNoratetype() {
        return noratetype;
    }

    /**
    * 设置-有些分公司的货运险营业税和教育费附加要免税  0 无免税 1 内陆货运险免税  2 进口免税  3 出口免税  4 进出口免税  5 都免税
    * @paramType java.lang.String
    * @param noratetype - 有些分公司的货运险营业税和教育费附加要免税  0 无免税 1 内陆货运险免税  2 进口免税  3 出口免税  4 进出口免税  5 都免税
     */
    public void setNoratetype(String noratetype) {
        this.noratetype = noratetype;
    }
}