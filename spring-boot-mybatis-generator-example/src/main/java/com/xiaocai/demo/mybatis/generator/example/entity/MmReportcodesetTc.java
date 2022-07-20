package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_reportcodeset_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmReportcodesetTc {
    /**
     * 报送险种
     */
    private Long classcode;

    /**
     * 应收账龄区间起
     */
    private BigDecimal long1;

    /**
     * 应收账龄区间止
     */
    private BigDecimal long2;

    /**
     * 应收余额期初期末标识：0期初，1期末
     */
    private String balanceflag;

    /**
     * 对应偿付能力因子代码
     */
    private String recode;

    /**
     * 时间戳
     */
    private Date tinestamp;

    /**
     * HIBERNATEVERSION版本号
     */
    private Integer hibernateversion;

    /**
     * 对应偿付能力因子名称
     */
    private String recname;

    /**
    * 获取-报送险种
    * @return classcode
     */
    public Long getClasscode() {
        return classcode;
    }

    /**
    * 设置-报送险种
    * @paramType java.lang.Long
    * @param classcode - 报送险种
     */
    public void setClasscode(Long classcode) {
        this.classcode = classcode;
    }

    /**
    * 获取-应收账龄区间起
    * @return long1
     */
    public BigDecimal getLong1() {
        return long1;
    }

    /**
    * 设置-应收账龄区间起
    * @paramType java.math.BigDecimal
    * @param long1 - 应收账龄区间起
     */
    public void setLong1(BigDecimal long1) {
        this.long1 = long1;
    }

    /**
    * 获取-应收账龄区间止
    * @return long2
     */
    public BigDecimal getLong2() {
        return long2;
    }

    /**
    * 设置-应收账龄区间止
    * @paramType java.math.BigDecimal
    * @param long2 - 应收账龄区间止
     */
    public void setLong2(BigDecimal long2) {
        this.long2 = long2;
    }

    /**
    * 获取-应收余额期初期末标识：0期初，1期末
    * @return balanceflag
     */
    public String getBalanceflag() {
        return balanceflag;
    }

    /**
    * 设置-应收余额期初期末标识：0期初，1期末
    * @paramType java.lang.String
    * @param balanceflag - 应收余额期初期末标识：0期初，1期末
     */
    public void setBalanceflag(String balanceflag) {
        this.balanceflag = balanceflag;
    }

    /**
    * 获取-对应偿付能力因子代码
    * @return recode
     */
    public String getRecode() {
        return recode;
    }

    /**
    * 设置-对应偿付能力因子代码
    * @paramType java.lang.String
    * @param recode - 对应偿付能力因子代码
     */
    public void setRecode(String recode) {
        this.recode = recode;
    }

    /**
    * 获取-时间戳
    * @return tinestamp
     */
    public Date getTinestamp() {
        return tinestamp;
    }

    /**
    * 设置-时间戳
    * @paramType java.util.Date
    * @param tinestamp - 时间戳
     */
    public void setTinestamp(Date tinestamp) {
        this.tinestamp = tinestamp;
    }

    /**
    * 获取-HIBERNATEVERSION版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATEVERSION版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATEVERSION版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-对应偿付能力因子名称
    * @return recname
     */
    public String getRecname() {
        return recname;
    }

    /**
    * 设置-对应偿付能力因子名称
    * @paramType java.lang.String
    * @param recname - 对应偿付能力因子名称
     */
    public void setRecname(String recname) {
        this.recname = recname;
    }
}