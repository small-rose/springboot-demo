package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_paystatus_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPaystatusTd {
    /**
     * 待付款流水号
     */
    private Long payableno;

    /**
     * 支付状态 1:应付未付（待付款表状态为0); 2:发资金未返盘（盘片表已抽档未返盘）;3:退回前端未返回（待付款表状态为7）;4:支付成功（无需支付且已核销或盘片表支付状态为成功）;5:支付失败（支付失败且未退回前端的）
     */
    private String paystatus;

    /**
     * 收付流水号，记录最新的
     */
    private Long sourceno;

    /**
     * 盘片明细表id，记录最新的
     */
    private Long platformdetailid;

    /**
     * 付款日期。付款日期
     */
    private Date paydate;

    /**
     * 支付成功日期。资金系统回写
     */
    private Date paymadedate;

    /**
     * 支付结果代码
     */
    private String payresultcode;

    /**
     * 支付信息。交易支付信息（包含支付成功信息、支付失败信息）
     */
    private String payresultinfo;

    /**
     * 退票日期。
     */
    private Date refundtime;

    /**
     * 资金返回信息
     */
    private String refundinfo;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后更新日期。初始为创建日期
     */
    private Date lastopdate;

    /**
     * hibernate版本号
     */
    private Integer hibernateversion;

    /**
    * 获取-待付款流水号
    * @return payableno
     */
    public Long getPayableno() {
        return payableno;
    }

    /**
    * 设置-待付款流水号
    * @paramType java.lang.Long
    * @param payableno - 待付款流水号
     */
    public void setPayableno(Long payableno) {
        this.payableno = payableno;
    }

    /**
    * 获取-支付状态 1:应付未付（待付款表状态为0); 2:发资金未返盘（盘片表已抽档未返盘）;3:退回前端未返回（待付款表状态为7）;4:支付成功（无需支付且已核销或盘片表支付状态为成功）;5:支付失败（支付失败且未退回前端的）
    * @return paystatus
     */
    public String getPaystatus() {
        return paystatus;
    }

    /**
    * 设置-支付状态 1:应付未付（待付款表状态为0); 2:发资金未返盘（盘片表已抽档未返盘）;3:退回前端未返回（待付款表状态为7）;4:支付成功（无需支付且已核销或盘片表支付状态为成功）;5:支付失败（支付失败且未退回前端的）
    * @paramType java.lang.String
    * @param paystatus - 支付状态 1:应付未付（待付款表状态为0); 2:发资金未返盘（盘片表已抽档未返盘）;3:退回前端未返回（待付款表状态为7）;4:支付成功（无需支付且已核销或盘片表支付状态为成功）;5:支付失败（支付失败且未退回前端的）
     */
    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus;
    }

    /**
    * 获取-收付流水号，记录最新的
    * @return sourceno
     */
    public Long getSourceno() {
        return sourceno;
    }

    /**
    * 设置-收付流水号，记录最新的
    * @paramType java.lang.Long
    * @param sourceno - 收付流水号，记录最新的
     */
    public void setSourceno(Long sourceno) {
        this.sourceno = sourceno;
    }

    /**
    * 获取-盘片明细表id，记录最新的
    * @return platformdetailid
     */
    public Long getPlatformdetailid() {
        return platformdetailid;
    }

    /**
    * 设置-盘片明细表id，记录最新的
    * @paramType java.lang.Long
    * @param platformdetailid - 盘片明细表id，记录最新的
     */
    public void setPlatformdetailid(Long platformdetailid) {
        this.platformdetailid = platformdetailid;
    }

    /**
    * 获取-付款日期。付款日期
    * @return paydate
     */
    public Date getPaydate() {
        return paydate;
    }

    /**
    * 设置-付款日期。付款日期
    * @paramType java.util.Date
    * @param paydate - 付款日期。付款日期
     */
    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    /**
    * 获取-支付成功日期。资金系统回写
    * @return paymadedate
     */
    public Date getPaymadedate() {
        return paymadedate;
    }

    /**
    * 设置-支付成功日期。资金系统回写
    * @paramType java.util.Date
    * @param paymadedate - 支付成功日期。资金系统回写
     */
    public void setPaymadedate(Date paymadedate) {
        this.paymadedate = paymadedate;
    }

    /**
    * 获取-支付结果代码
    * @return payresultcode
     */
    public String getPayresultcode() {
        return payresultcode;
    }

    /**
    * 设置-支付结果代码
    * @paramType java.lang.String
    * @param payresultcode - 支付结果代码
     */
    public void setPayresultcode(String payresultcode) {
        this.payresultcode = payresultcode;
    }

    /**
    * 获取-支付信息。交易支付信息（包含支付成功信息、支付失败信息）
    * @return payresultinfo
     */
    public String getPayresultinfo() {
        return payresultinfo;
    }

    /**
    * 设置-支付信息。交易支付信息（包含支付成功信息、支付失败信息）
    * @paramType java.lang.String
    * @param payresultinfo - 支付信息。交易支付信息（包含支付成功信息、支付失败信息）
     */
    public void setPayresultinfo(String payresultinfo) {
        this.payresultinfo = payresultinfo;
    }

    /**
    * 获取-退票日期。
    * @return refundtime
     */
    public Date getRefundtime() {
        return refundtime;
    }

    /**
    * 设置-退票日期。
    * @paramType java.util.Date
    * @param refundtime - 退票日期。
     */
    public void setRefundtime(Date refundtime) {
        this.refundtime = refundtime;
    }

    /**
    * 获取-资金返回信息
    * @return refundinfo
     */
    public String getRefundinfo() {
        return refundinfo;
    }

    /**
    * 设置-资金返回信息
    * @paramType java.lang.String
    * @param refundinfo - 资金返回信息
     */
    public void setRefundinfo(String refundinfo) {
        this.refundinfo = refundinfo;
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
    * 获取-最后更新日期。初始为创建日期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后更新日期。初始为创建日期
    * @paramType java.util.Date
    * @param lastopdate - 最后更新日期。初始为创建日期
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-hibernate版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-hibernate版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - hibernate版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }
}