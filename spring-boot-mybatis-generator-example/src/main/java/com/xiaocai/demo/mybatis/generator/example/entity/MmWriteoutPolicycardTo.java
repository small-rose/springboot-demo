package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_writeout_policycard_to
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmWriteoutPolicycardTo {
    /**
     * 主键
     */
    private Long id;

    /**
     * 传送批次号
     */
    private String batchid;

    /**
     * 日接单流水号(明细表唯一号)
     */
    private String seqreportno;

    /**
     * 业务类型：1;保费,2:手续费,3:绩效工资
     */
    private String certitype;

    /**
     * 业务类型：根据回写类型不同，业务类型编码不同，从模板得到 1、承保对应：1:保费,2:储金,3:储金折保费,4:车船税 5:储金返还,6:储金利息 2、理赔对应：01标的赔款，02核赔费，03查勘费，04代查勘费，05施救费，06其他费用，07预付赔款，08损余收回 09代垫付 10代垫付追偿（红字） 11冲消预付赔款 12 垫付
     */
    private String datatype;

    /**
     * 业务唯一号
     */
    private String businessno;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 唯一序号
     */
    private String custseq;

    /**
     * 结算单号
     */
    private String summaryno;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 实收付金额（记账币种）
     */
    private BigDecimal realamount;

    /**
     * 操作员代码
     */
    private String opcode;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 数据来源：sinosoft_card 卡管理系统
     */
    private String datasource;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 传送状态：00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误
     */
    private String status;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 实际支付标识 0 已支付 1 支付失败 2 支付取消
     */
    private String opflag;

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
    * 获取-传送批次号
    * @return batchid
     */
    public String getBatchid() {
        return batchid;
    }

    /**
    * 设置-传送批次号
    * @paramType java.lang.String
    * @param batchid - 传送批次号
     */
    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    /**
    * 获取-日接单流水号(明细表唯一号)
    * @return seqreportno
     */
    public String getSeqreportno() {
        return seqreportno;
    }

    /**
    * 设置-日接单流水号(明细表唯一号)
    * @paramType java.lang.String
    * @param seqreportno - 日接单流水号(明细表唯一号)
     */
    public void setSeqreportno(String seqreportno) {
        this.seqreportno = seqreportno;
    }

    /**
    * 获取-业务类型：1;保费,2:手续费,3:绩效工资
    * @return certitype
     */
    public String getCertitype() {
        return certitype;
    }

    /**
    * 设置-业务类型：1;保费,2:手续费,3:绩效工资
    * @paramType java.lang.String
    * @param certitype - 业务类型：1;保费,2:手续费,3:绩效工资
     */
    public void setCertitype(String certitype) {
        this.certitype = certitype;
    }

    /**
    * 获取-业务类型：根据回写类型不同，业务类型编码不同，从模板得到 1、承保对应：1:保费,2:储金,3:储金折保费,4:车船税 5:储金返还,6:储金利息 2、理赔对应：01标的赔款，02核赔费，03查勘费，04代查勘费，05施救费，06其他费用，07预付赔款，08损余收回 09代垫付 10代垫付追偿（红字） 11冲消预付赔款 12 垫付
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-业务类型：根据回写类型不同，业务类型编码不同，从模板得到 1、承保对应：1:保费,2:储金,3:储金折保费,4:车船税 5:储金返还,6:储金利息 2、理赔对应：01标的赔款，02核赔费，03查勘费，04代查勘费，05施救费，06其他费用，07预付赔款，08损余收回 09代垫付 10代垫付追偿（红字） 11冲消预付赔款 12 垫付
    * @paramType java.lang.String
    * @param datatype - 业务类型：根据回写类型不同，业务类型编码不同，从模板得到 1、承保对应：1:保费,2:储金,3:储金折保费,4:车船税 5:储金返还,6:储金利息 2、理赔对应：01标的赔款，02核赔费，03查勘费，04代查勘费，05施救费，06其他费用，07预付赔款，08损余收回 09代垫付 10代垫付追偿（红字） 11冲消预付赔款 12 垫付
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    /**
    * 获取-业务唯一号
    * @return businessno
     */
    public String getBusinessno() {
        return businessno;
    }

    /**
    * 设置-业务唯一号
    * @paramType java.lang.String
    * @param businessno - 业务唯一号
     */
    public void setBusinessno(String businessno) {
        this.businessno = businessno;
    }

    /**
    * 获取-分公司代码
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司代码
    * @paramType java.lang.String
    * @param subcompany - 分公司代码
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-唯一序号
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-唯一序号
    * @paramType java.lang.String
    * @param custseq - 唯一序号
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
    }

    /**
    * 获取-结算单号
    * @return summaryno
     */
    public String getSummaryno() {
        return summaryno;
    }

    /**
    * 设置-结算单号
    * @paramType java.lang.String
    * @param summaryno - 结算单号
     */
    public void setSummaryno(String summaryno) {
        this.summaryno = summaryno;
    }

    /**
    * 获取-金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-金额
    * @paramType java.math.BigDecimal
    * @param amount - 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-实收付金额（记账币种）
    * @return realamount
     */
    public BigDecimal getRealamount() {
        return realamount;
    }

    /**
    * 设置-实收付金额（记账币种）
    * @paramType java.math.BigDecimal
    * @param realamount - 实收付金额（记账币种）
     */
    public void setRealamount(BigDecimal realamount) {
        this.realamount = realamount;
    }

    /**
    * 获取-操作员代码
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作员代码
    * @paramType java.lang.String
    * @param opcode - 操作员代码
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-操作日期
    * @return opdate
     */
    public Date getOpdate() {
        return opdate;
    }

    /**
    * 设置-操作日期
    * @paramType java.util.Date
    * @param opdate - 操作日期
     */
    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }

    /**
    * 获取-数据来源：sinosoft_card 卡管理系统
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-数据来源：sinosoft_card 卡管理系统
    * @paramType java.lang.String
    * @param datasource - 数据来源：sinosoft_card 卡管理系统
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
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
    * 获取-传送状态：00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-传送状态：00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误
    * @paramType java.lang.String
    * @param status - 传送状态：00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-HIBERNATE版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATE版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATE版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
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
    * 获取-手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
    * @paramType java.lang.String
    * @param modifydesc - 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-实际支付标识 0 已支付 1 支付失败 2 支付取消
    * @return opflag
     */
    public String getOpflag() {
        return opflag;
    }

    /**
    * 设置-实际支付标识 0 已支付 1 支付失败 2 支付取消
    * @paramType java.lang.String
    * @param opflag - 实际支付标识 0 已支付 1 支付失败 2 支付取消
     */
    public void setOpflag(String opflag) {
        this.opflag = opflag;
    }
}