package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : ats_back_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class AtsBackTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 交易来源
     */
    private String transsource;

    /**
     * 交易编码
     */
    private String transcode;

    /**
     * 交易日期，格式是yyyyMMdd
     */
    private Date transdate;

    /**
     * 交易时间，格式是HH24miss
     */
    private String transtime;

    /**
     * 交易流水号
     */
    private String transseq;

    /**
     * 提交批号
     */
    private String reqseqid;

    /**
     * 指令提交日期
     */
    private Date begindate;

    /**
     * 资金返回的票据号
     */
    private String reqreserved1;

    /**
     * 保留字段
     */
    private String reqreserved2;

    /**
     * 指令顺序号,提交接口的RdSeq字段
     */
    private String rdseq;

    /**
     * 企业方账户所属银行
     */
    private String corpbank;

    /**
     * 企业方账户
     */
    private String corpact;

    /**
     * 总账科目
     */
    private String corpactsubject;

    /**
     * 企业方账户所在机构
     */
    private String corpentity;

    /**
     * 交易方账户
     */
    private String oppact;

    /**
     * 支付状态.2:成功 3:失败 6：退票
     */
    private String transstate;

    /**
     * 交易返回码
     */
    private String payinfocode;

    /**
     * 交易返回描述
     */
    private String payinfo;

    /**
     * "交易失败类型0-正常1-提交效验失败2-手工作废作废3-支付失败"
     */
    private String failtype;

    /**
     * 银行反馈时间
     */
    private String paymadedate;

    /**
     * 来源系统单据号码
     */
    private String sourcenotecode;

    /**
     * 唯一业务号（有效数据唯一，用于判断重复）
     */
    private String paymentcode;

    /**
     * 对账码(支付成功的情况下是有值的)
     */
    private String abstract;

    /**
     * 明细保留字段
     */
    private String reqreserved3;

    /**
     * 明细保留字段
     */
    private String reqreserved4;

    /**
     * 时间戳(yyyy-MM-dd hh24:mi:ss)
     */
    private Date timestamp;

    /**
     * 最后操作时间(yyyy-MM-dd hh24:mi:ss)
     */
    private Date lastopdate;

    /**
     * HIBERNATEVERSION版本号
     */
    private Integer hibernateversion;

    /**
     * 手工修改说明
     */
    private String modifydesc;

    /**
     * 应答交易返回码：success 、fail、exception
     */
    private String rtncode;

    /**
     * 应答交易返回描述
     */
    private String rtnmsg;

    /**
     * 收付系统处理的批次号
     */
    private String bpbatchid;

    /**
     * 收付系统处理状态:0 未处理；1处理中；2处理成功；3处理失败
     */
    private String bpstatus;

    /**
     * 原路原退 退款批次号
     */
    private String reqreserved5;

    /**
     * 原路原退 退款投保单号
     */
    private String reqreserved6;

    /**
     * 原路原退 退款金额
     */
    private String reqreserved7;

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
    * 获取-交易来源
    * @return transsource
     */
    public String getTranssource() {
        return transsource;
    }

    /**
    * 设置-交易来源
    * @paramType java.lang.String
    * @param transsource - 交易来源
     */
    public void setTranssource(String transsource) {
        this.transsource = transsource;
    }

    /**
    * 获取-交易编码
    * @return transcode
     */
    public String getTranscode() {
        return transcode;
    }

    /**
    * 设置-交易编码
    * @paramType java.lang.String
    * @param transcode - 交易编码
     */
    public void setTranscode(String transcode) {
        this.transcode = transcode;
    }

    /**
    * 获取-交易日期，格式是yyyyMMdd
    * @return transdate
     */
    public Date getTransdate() {
        return transdate;
    }

    /**
    * 设置-交易日期，格式是yyyyMMdd
    * @paramType java.util.Date
    * @param transdate - 交易日期，格式是yyyyMMdd
     */
    public void setTransdate(Date transdate) {
        this.transdate = transdate;
    }

    /**
    * 获取-交易时间，格式是HH24miss
    * @return transtime
     */
    public String getTranstime() {
        return transtime;
    }

    /**
    * 设置-交易时间，格式是HH24miss
    * @paramType java.lang.String
    * @param transtime - 交易时间，格式是HH24miss
     */
    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

    /**
    * 获取-交易流水号
    * @return transseq
     */
    public String getTransseq() {
        return transseq;
    }

    /**
    * 设置-交易流水号
    * @paramType java.lang.String
    * @param transseq - 交易流水号
     */
    public void setTransseq(String transseq) {
        this.transseq = transseq;
    }

    /**
    * 获取-提交批号
    * @return reqseqid
     */
    public String getReqseqid() {
        return reqseqid;
    }

    /**
    * 设置-提交批号
    * @paramType java.lang.String
    * @param reqseqid - 提交批号
     */
    public void setReqseqid(String reqseqid) {
        this.reqseqid = reqseqid;
    }

    /**
    * 获取-指令提交日期
    * @return begindate
     */
    public Date getBegindate() {
        return begindate;
    }

    /**
    * 设置-指令提交日期
    * @paramType java.util.Date
    * @param begindate - 指令提交日期
     */
    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    /**
    * 获取-资金返回的票据号
    * @return reqreserved1
     */
    public String getReqreserved1() {
        return reqreserved1;
    }

    /**
    * 设置-资金返回的票据号
    * @paramType java.lang.String
    * @param reqreserved1 - 资金返回的票据号
     */
    public void setReqreserved1(String reqreserved1) {
        this.reqreserved1 = reqreserved1;
    }

    /**
    * 获取-保留字段
    * @return reqreserved2
     */
    public String getReqreserved2() {
        return reqreserved2;
    }

    /**
    * 设置-保留字段
    * @paramType java.lang.String
    * @param reqreserved2 - 保留字段
     */
    public void setReqreserved2(String reqreserved2) {
        this.reqreserved2 = reqreserved2;
    }

    /**
    * 获取-指令顺序号,提交接口的RdSeq字段
    * @return rdseq
     */
    public String getRdseq() {
        return rdseq;
    }

    /**
    * 设置-指令顺序号,提交接口的RdSeq字段
    * @paramType java.lang.String
    * @param rdseq - 指令顺序号,提交接口的RdSeq字段
     */
    public void setRdseq(String rdseq) {
        this.rdseq = rdseq;
    }

    /**
    * 获取-企业方账户所属银行
    * @return corpbank
     */
    public String getCorpbank() {
        return corpbank;
    }

    /**
    * 设置-企业方账户所属银行
    * @paramType java.lang.String
    * @param corpbank - 企业方账户所属银行
     */
    public void setCorpbank(String corpbank) {
        this.corpbank = corpbank;
    }

    /**
    * 获取-企业方账户
    * @return corpact
     */
    public String getCorpact() {
        return corpact;
    }

    /**
    * 设置-企业方账户
    * @paramType java.lang.String
    * @param corpact - 企业方账户
     */
    public void setCorpact(String corpact) {
        this.corpact = corpact;
    }

    /**
    * 获取-总账科目
    * @return corpactsubject
     */
    public String getCorpactsubject() {
        return corpactsubject;
    }

    /**
    * 设置-总账科目
    * @paramType java.lang.String
    * @param corpactsubject - 总账科目
     */
    public void setCorpactsubject(String corpactsubject) {
        this.corpactsubject = corpactsubject;
    }

    /**
    * 获取-企业方账户所在机构
    * @return corpentity
     */
    public String getCorpentity() {
        return corpentity;
    }

    /**
    * 设置-企业方账户所在机构
    * @paramType java.lang.String
    * @param corpentity - 企业方账户所在机构
     */
    public void setCorpentity(String corpentity) {
        this.corpentity = corpentity;
    }

    /**
    * 获取-交易方账户
    * @return oppact
     */
    public String getOppact() {
        return oppact;
    }

    /**
    * 设置-交易方账户
    * @paramType java.lang.String
    * @param oppact - 交易方账户
     */
    public void setOppact(String oppact) {
        this.oppact = oppact;
    }

    /**
    * 获取-支付状态.2:成功 3:失败 6：退票
    * @return transstate
     */
    public String getTransstate() {
        return transstate;
    }

    /**
    * 设置-支付状态.2:成功 3:失败 6：退票
    * @paramType java.lang.String
    * @param transstate - 支付状态.2:成功 3:失败 6：退票
     */
    public void setTransstate(String transstate) {
        this.transstate = transstate;
    }

    /**
    * 获取-交易返回码
    * @return payinfocode
     */
    public String getPayinfocode() {
        return payinfocode;
    }

    /**
    * 设置-交易返回码
    * @paramType java.lang.String
    * @param payinfocode - 交易返回码
     */
    public void setPayinfocode(String payinfocode) {
        this.payinfocode = payinfocode;
    }

    /**
    * 获取-交易返回描述
    * @return payinfo
     */
    public String getPayinfo() {
        return payinfo;
    }

    /**
    * 设置-交易返回描述
    * @paramType java.lang.String
    * @param payinfo - 交易返回描述
     */
    public void setPayinfo(String payinfo) {
        this.payinfo = payinfo;
    }

    /**
    * 获取-"交易失败类型0-正常1-提交效验失败2-手工作废作废3-支付失败"
    * @return failtype
     */
    public String getFailtype() {
        return failtype;
    }

    /**
    * 设置-"交易失败类型0-正常1-提交效验失败2-手工作废作废3-支付失败"
    * @paramType java.lang.String
    * @param failtype - "交易失败类型0-正常1-提交效验失败2-手工作废作废3-支付失败"
     */
    public void setFailtype(String failtype) {
        this.failtype = failtype;
    }

    /**
    * 获取-银行反馈时间
    * @return paymadedate
     */
    public String getPaymadedate() {
        return paymadedate;
    }

    /**
    * 设置-银行反馈时间
    * @paramType java.lang.String
    * @param paymadedate - 银行反馈时间
     */
    public void setPaymadedate(String paymadedate) {
        this.paymadedate = paymadedate;
    }

    /**
    * 获取-来源系统单据号码
    * @return sourcenotecode
     */
    public String getSourcenotecode() {
        return sourcenotecode;
    }

    /**
    * 设置-来源系统单据号码
    * @paramType java.lang.String
    * @param sourcenotecode - 来源系统单据号码
     */
    public void setSourcenotecode(String sourcenotecode) {
        this.sourcenotecode = sourcenotecode;
    }

    /**
    * 获取-唯一业务号（有效数据唯一，用于判断重复）
    * @return paymentcode
     */
    public String getPaymentcode() {
        return paymentcode;
    }

    /**
    * 设置-唯一业务号（有效数据唯一，用于判断重复）
    * @paramType java.lang.String
    * @param paymentcode - 唯一业务号（有效数据唯一，用于判断重复）
     */
    public void setPaymentcode(String paymentcode) {
        this.paymentcode = paymentcode;
    }

    /**
    * 获取-对账码(支付成功的情况下是有值的)
    * @return abstract
     */
    public String getAbstract() {
        return abstract;
    }

    /**
    * 设置-对账码(支付成功的情况下是有值的)
    * @paramType java.lang.String
    * @param abstract - 对账码(支付成功的情况下是有值的)
     */
    public void setAbstract(String abstract) {
        this.abstract = abstract;
    }

    /**
    * 获取-明细保留字段
    * @return reqreserved3
     */
    public String getReqreserved3() {
        return reqreserved3;
    }

    /**
    * 设置-明细保留字段
    * @paramType java.lang.String
    * @param reqreserved3 - 明细保留字段
     */
    public void setReqreserved3(String reqreserved3) {
        this.reqreserved3 = reqreserved3;
    }

    /**
    * 获取-明细保留字段
    * @return reqreserved4
     */
    public String getReqreserved4() {
        return reqreserved4;
    }

    /**
    * 设置-明细保留字段
    * @paramType java.lang.String
    * @param reqreserved4 - 明细保留字段
     */
    public void setReqreserved4(String reqreserved4) {
        this.reqreserved4 = reqreserved4;
    }

    /**
    * 获取-时间戳(yyyy-MM-dd hh24:mi:ss)
    * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
    * 设置-时间戳(yyyy-MM-dd hh24:mi:ss)
    * @paramType java.util.Date
    * @param timestamp - 时间戳(yyyy-MM-dd hh24:mi:ss)
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
    * 获取-最后操作时间(yyyy-MM-dd hh24:mi:ss)
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作时间(yyyy-MM-dd hh24:mi:ss)
    * @paramType java.util.Date
    * @param lastopdate - 最后操作时间(yyyy-MM-dd hh24:mi:ss)
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
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
    * 获取-手工修改说明
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改说明
    * @paramType java.lang.String
    * @param modifydesc - 手工修改说明
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-应答交易返回码：success 、fail、exception
    * @return rtncode
     */
    public String getRtncode() {
        return rtncode;
    }

    /**
    * 设置-应答交易返回码：success 、fail、exception
    * @paramType java.lang.String
    * @param rtncode - 应答交易返回码：success 、fail、exception
     */
    public void setRtncode(String rtncode) {
        this.rtncode = rtncode;
    }

    /**
    * 获取-应答交易返回描述
    * @return rtnmsg
     */
    public String getRtnmsg() {
        return rtnmsg;
    }

    /**
    * 设置-应答交易返回描述
    * @paramType java.lang.String
    * @param rtnmsg - 应答交易返回描述
     */
    public void setRtnmsg(String rtnmsg) {
        this.rtnmsg = rtnmsg;
    }

    /**
    * 获取-收付系统处理的批次号
    * @return bpbatchid
     */
    public String getBpbatchid() {
        return bpbatchid;
    }

    /**
    * 设置-收付系统处理的批次号
    * @paramType java.lang.String
    * @param bpbatchid - 收付系统处理的批次号
     */
    public void setBpbatchid(String bpbatchid) {
        this.bpbatchid = bpbatchid;
    }

    /**
    * 获取-收付系统处理状态:0 未处理；1处理中；2处理成功；3处理失败
    * @return bpstatus
     */
    public String getBpstatus() {
        return bpstatus;
    }

    /**
    * 设置-收付系统处理状态:0 未处理；1处理中；2处理成功；3处理失败
    * @paramType java.lang.String
    * @param bpstatus - 收付系统处理状态:0 未处理；1处理中；2处理成功；3处理失败
     */
    public void setBpstatus(String bpstatus) {
        this.bpstatus = bpstatus;
    }

    /**
    * 获取-原路原退 退款批次号
    * @return reqreserved5
     */
    public String getReqreserved5() {
        return reqreserved5;
    }

    /**
    * 设置-原路原退 退款批次号
    * @paramType java.lang.String
    * @param reqreserved5 - 原路原退 退款批次号
     */
    public void setReqreserved5(String reqreserved5) {
        this.reqreserved5 = reqreserved5;
    }

    /**
    * 获取-原路原退 退款投保单号
    * @return reqreserved6
     */
    public String getReqreserved6() {
        return reqreserved6;
    }

    /**
    * 设置-原路原退 退款投保单号
    * @paramType java.lang.String
    * @param reqreserved6 - 原路原退 退款投保单号
     */
    public void setReqreserved6(String reqreserved6) {
        this.reqreserved6 = reqreserved6;
    }

    /**
    * 获取-原路原退 退款金额
    * @return reqreserved7
     */
    public String getReqreserved7() {
        return reqreserved7;
    }

    /**
    * 设置-原路原退 退款金额
    * @paramType java.lang.String
    * @param reqreserved7 - 原路原退 退款金额
     */
    public void setReqreserved7(String reqreserved7) {
        this.reqreserved7 = reqreserved7;
    }
}