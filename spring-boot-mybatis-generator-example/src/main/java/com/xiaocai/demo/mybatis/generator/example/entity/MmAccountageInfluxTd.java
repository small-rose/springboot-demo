package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_accountage_influx_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmAccountageInfluxTd {
    /**
     * INFLUXID
     */
    private Long influxid;

    /**
     * 切片id
     */
    private Long mirrorid;

    /**
     * 机构代码
     */
    private String unitcode;

    /**
     * 截止日期
     */
    private Date mirrordate;

    /**
     * 险类描述
     */
    private String classeskindname;

    /**
     * 险种
     */
    private String classescode;

    /**
     * 期末余额合计
     */
    private BigDecimal remains;

    /**
     * 未到缴费期的分期付款业务金额
     */
    private BigDecimal remainsUndued;

    /**
     * 未到缴费期金额
     */
    private BigDecimal sumremainsUndued;

    /**
     * 滚动12个月保费收入
     */
    private BigDecimal sum12monthRemains;

    /**
     * 账龄1M以内期末余额
     */
    private BigDecimal remainsDate1;

    /**
     * 账龄1M-3M期末余额
     */
    private BigDecimal remainsDate2;

    /**
     * 账龄3M-6M期末余额
     */
    private BigDecimal remainsDate3;

    /**
     * 账龄6M-9M期末余额
     */
    private BigDecimal remainsDate4;

    /**
     * 账龄9M-1Y期末余额
     */
    private BigDecimal remainsDate5;

    /**
     * 账龄1Y-2Y期末余额
     */
    private BigDecimal remainsDate6;

    /**
     * 账龄2Y-3Y期末余额
     */
    private BigDecimal remainsDate7;

    /**
     * 账龄3Y-5Y期末余额
     */
    private BigDecimal remainsDate8;

    /**
     * 账龄5Y-10Y期末余额
     */
    private BigDecimal remainsDate9;

    /**
     * 账龄10Y以上期末
     */
    private BigDecimal remainsDate10;

    /**
     * 账龄类型，1:储金，2:预收，3:待付，4:应收
     */
    private String agetype;

    /**
     * 1：成功 2：失败 3：接口不通
     */
    private String status;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 错误信息
     */
    private String errormsg;

    /**
    * 获取-INFLUXID
    * @return influxid
     */
    public Long getInfluxid() {
        return influxid;
    }

    /**
    * 设置-INFLUXID
    * @paramType java.lang.Long
    * @param influxid - INFLUXID
     */
    public void setInfluxid(Long influxid) {
        this.influxid = influxid;
    }

    /**
    * 获取-切片id
    * @return mirrorid
     */
    public Long getMirrorid() {
        return mirrorid;
    }

    /**
    * 设置-切片id
    * @paramType java.lang.Long
    * @param mirrorid - 切片id
     */
    public void setMirrorid(Long mirrorid) {
        this.mirrorid = mirrorid;
    }

    /**
    * 获取-机构代码
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-机构代码
    * @paramType java.lang.String
    * @param unitcode - 机构代码
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    /**
    * 获取-截止日期
    * @return mirrordate
     */
    public Date getMirrordate() {
        return mirrordate;
    }

    /**
    * 设置-截止日期
    * @paramType java.util.Date
    * @param mirrordate - 截止日期
     */
    public void setMirrordate(Date mirrordate) {
        this.mirrordate = mirrordate;
    }

    /**
    * 获取-险类描述
    * @return classeskindname
     */
    public String getClasseskindname() {
        return classeskindname;
    }

    /**
    * 设置-险类描述
    * @paramType java.lang.String
    * @param classeskindname - 险类描述
     */
    public void setClasseskindname(String classeskindname) {
        this.classeskindname = classeskindname;
    }

    /**
    * 获取-险种
    * @return classescode
     */
    public String getClassescode() {
        return classescode;
    }

    /**
    * 设置-险种
    * @paramType java.lang.String
    * @param classescode - 险种
     */
    public void setClassescode(String classescode) {
        this.classescode = classescode;
    }

    /**
    * 获取-期末余额合计
    * @return remains
     */
    public BigDecimal getRemains() {
        return remains;
    }

    /**
    * 设置-期末余额合计
    * @paramType java.math.BigDecimal
    * @param remains - 期末余额合计
     */
    public void setRemains(BigDecimal remains) {
        this.remains = remains;
    }

    /**
    * 获取-未到缴费期的分期付款业务金额
    * @return remainsUndued
     */
    public BigDecimal getRemainsUndued() {
        return remainsUndued;
    }

    /**
    * 设置-未到缴费期的分期付款业务金额
    * @paramType java.math.BigDecimal
    * @param remainsUndued - 未到缴费期的分期付款业务金额
     */
    public void setRemainsUndued(BigDecimal remainsUndued) {
        this.remainsUndued = remainsUndued;
    }

    /**
    * 获取-未到缴费期金额
    * @return sumremainsUndued
     */
    public BigDecimal getSumremainsUndued() {
        return sumremainsUndued;
    }

    /**
    * 设置-未到缴费期金额
    * @paramType java.math.BigDecimal
    * @param sumremainsUndued - 未到缴费期金额
     */
    public void setSumremainsUndued(BigDecimal sumremainsUndued) {
        this.sumremainsUndued = sumremainsUndued;
    }

    /**
    * 获取-滚动12个月保费收入
    * @return sum12monthRemains
     */
    public BigDecimal getSum12monthRemains() {
        return sum12monthRemains;
    }

    /**
    * 设置-滚动12个月保费收入
    * @paramType java.math.BigDecimal
    * @param sum12monthRemains - 滚动12个月保费收入
     */
    public void setSum12monthRemains(BigDecimal sum12monthRemains) {
        this.sum12monthRemains = sum12monthRemains;
    }

    /**
    * 获取-账龄1M以内期末余额
    * @return remainsDate1
     */
    public BigDecimal getRemainsDate1() {
        return remainsDate1;
    }

    /**
    * 设置-账龄1M以内期末余额
    * @paramType java.math.BigDecimal
    * @param remainsDate1 - 账龄1M以内期末余额
     */
    public void setRemainsDate1(BigDecimal remainsDate1) {
        this.remainsDate1 = remainsDate1;
    }

    /**
    * 获取-账龄1M-3M期末余额
    * @return remainsDate2
     */
    public BigDecimal getRemainsDate2() {
        return remainsDate2;
    }

    /**
    * 设置-账龄1M-3M期末余额
    * @paramType java.math.BigDecimal
    * @param remainsDate2 - 账龄1M-3M期末余额
     */
    public void setRemainsDate2(BigDecimal remainsDate2) {
        this.remainsDate2 = remainsDate2;
    }

    /**
    * 获取-账龄3M-6M期末余额
    * @return remainsDate3
     */
    public BigDecimal getRemainsDate3() {
        return remainsDate3;
    }

    /**
    * 设置-账龄3M-6M期末余额
    * @paramType java.math.BigDecimal
    * @param remainsDate3 - 账龄3M-6M期末余额
     */
    public void setRemainsDate3(BigDecimal remainsDate3) {
        this.remainsDate3 = remainsDate3;
    }

    /**
    * 获取-账龄6M-9M期末余额
    * @return remainsDate4
     */
    public BigDecimal getRemainsDate4() {
        return remainsDate4;
    }

    /**
    * 设置-账龄6M-9M期末余额
    * @paramType java.math.BigDecimal
    * @param remainsDate4 - 账龄6M-9M期末余额
     */
    public void setRemainsDate4(BigDecimal remainsDate4) {
        this.remainsDate4 = remainsDate4;
    }

    /**
    * 获取-账龄9M-1Y期末余额
    * @return remainsDate5
     */
    public BigDecimal getRemainsDate5() {
        return remainsDate5;
    }

    /**
    * 设置-账龄9M-1Y期末余额
    * @paramType java.math.BigDecimal
    * @param remainsDate5 - 账龄9M-1Y期末余额
     */
    public void setRemainsDate5(BigDecimal remainsDate5) {
        this.remainsDate5 = remainsDate5;
    }

    /**
    * 获取-账龄1Y-2Y期末余额
    * @return remainsDate6
     */
    public BigDecimal getRemainsDate6() {
        return remainsDate6;
    }

    /**
    * 设置-账龄1Y-2Y期末余额
    * @paramType java.math.BigDecimal
    * @param remainsDate6 - 账龄1Y-2Y期末余额
     */
    public void setRemainsDate6(BigDecimal remainsDate6) {
        this.remainsDate6 = remainsDate6;
    }

    /**
    * 获取-账龄2Y-3Y期末余额
    * @return remainsDate7
     */
    public BigDecimal getRemainsDate7() {
        return remainsDate7;
    }

    /**
    * 设置-账龄2Y-3Y期末余额
    * @paramType java.math.BigDecimal
    * @param remainsDate7 - 账龄2Y-3Y期末余额
     */
    public void setRemainsDate7(BigDecimal remainsDate7) {
        this.remainsDate7 = remainsDate7;
    }

    /**
    * 获取-账龄3Y-5Y期末余额
    * @return remainsDate8
     */
    public BigDecimal getRemainsDate8() {
        return remainsDate8;
    }

    /**
    * 设置-账龄3Y-5Y期末余额
    * @paramType java.math.BigDecimal
    * @param remainsDate8 - 账龄3Y-5Y期末余额
     */
    public void setRemainsDate8(BigDecimal remainsDate8) {
        this.remainsDate8 = remainsDate8;
    }

    /**
    * 获取-账龄5Y-10Y期末余额
    * @return remainsDate9
     */
    public BigDecimal getRemainsDate9() {
        return remainsDate9;
    }

    /**
    * 设置-账龄5Y-10Y期末余额
    * @paramType java.math.BigDecimal
    * @param remainsDate9 - 账龄5Y-10Y期末余额
     */
    public void setRemainsDate9(BigDecimal remainsDate9) {
        this.remainsDate9 = remainsDate9;
    }

    /**
    * 获取-账龄10Y以上期末
    * @return remainsDate10
     */
    public BigDecimal getRemainsDate10() {
        return remainsDate10;
    }

    /**
    * 设置-账龄10Y以上期末
    * @paramType java.math.BigDecimal
    * @param remainsDate10 - 账龄10Y以上期末
     */
    public void setRemainsDate10(BigDecimal remainsDate10) {
        this.remainsDate10 = remainsDate10;
    }

    /**
    * 获取-账龄类型，1:储金，2:预收，3:待付，4:应收
    * @return agetype
     */
    public String getAgetype() {
        return agetype;
    }

    /**
    * 设置-账龄类型，1:储金，2:预收，3:待付，4:应收
    * @paramType java.lang.String
    * @param agetype - 账龄类型，1:储金，2:预收，3:待付，4:应收
     */
    public void setAgetype(String agetype) {
        this.agetype = agetype;
    }

    /**
    * 获取-1：成功 2：失败 3：接口不通
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-1：成功 2：失败 3：接口不通
    * @paramType java.lang.String
    * @param status - 1：成功 2：失败 3：接口不通
     */
    public void setStatus(String status) {
        this.status = status;
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
    * 获取-最后操作时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作时间
    * @paramType java.util.Date
    * @param lastopdate - 最后操作时间
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - 版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-批次号
    * @return batchid
     */
    public String getBatchid() {
        return batchid;
    }

    /**
    * 设置-批次号
    * @paramType java.lang.String
    * @param batchid - 批次号
     */
    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    /**
    * 获取-错误信息
    * @return errormsg
     */
    public String getErrormsg() {
        return errormsg;
    }

    /**
    * 设置-错误信息
    * @paramType java.lang.String
    * @param errormsg - 错误信息
     */
    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }
}