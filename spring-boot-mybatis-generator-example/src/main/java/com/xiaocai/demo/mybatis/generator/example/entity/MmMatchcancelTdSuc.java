package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_matchcancel_td_suc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmMatchcancelTdSuc {
    /**
     * 主键
     */
    private Long id;

    /**
     * 取消类型(1.收款取消,2.付款取消,3.预收匹配取消,4.待付款匹配取消,5.多笔预收转待付款取消,6.多笔待付款转预收)
     */
    private String canceltype;

    /**
     * 所取消业务数据的主键ID(1.收款取消：所取消的收款数据的inpaymentid；2.付款取消：所取消的付款数据的inpaymentid；3.预收匹配取消：所取消的预收款useableno；4.待付款匹配取消：所取消的待付款payableno；5.多笔预收转待付款取消：所取消的待付款payableno；6.多笔待付款转预收：所取消预收款的useableno)
     */
    private Long mastno;

    /**
     * 所取消业务数据类型(1.收款取消时datatype在前台得不到，故不用传到后台：所取消的收款数据业务类型，如：911现金收款、921银行收款；2.付款取消时datatype在前台得不到，故不用传到后台：所取消的付款数据业务类型，如：921现金付款、922银行付款；3.预收匹配取消：所取消的预收款业务类型，如：401、408等等；4.待付款匹配取消：所取消的待付款业务类型，如：402、302等等；5.多笔预收转待付款取消：所取消的待付款数据业务类型,如：402；6.多笔待付款转预收：所取消预收款数据业务类型,如：408)
     */
    private String datatype;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 被取消记录的金额(只有收款取消、付款取消)
     */
    private BigDecimal amount;

    /**
     * 描述
     */
    private String description;

    /**
     * 状态
     */
    private String status;

    /**
     * 操作人
     */
    private String opcode;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 最后修改日期
     */
    private Date lastopdate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 数据版本号
     */
    private Integer hibernateversion;

    /**
     * 数据修改说明
     */
    private String modifydesc;

    /**
     * 结算单类型(0 非结算单、 1 保费结算单、2 赔款结算单、3 手续费结算单、4 再保结算单)
     */
    private String batchsettlementtype;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 存储生成方式:0批量导入,1手工录入,2系统接入
     */
    private String createtype;

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
    * 获取-取消类型(1.收款取消,2.付款取消,3.预收匹配取消,4.待付款匹配取消,5.多笔预收转待付款取消,6.多笔待付款转预收)
    * @return canceltype
     */
    public String getCanceltype() {
        return canceltype;
    }

    /**
    * 设置-取消类型(1.收款取消,2.付款取消,3.预收匹配取消,4.待付款匹配取消,5.多笔预收转待付款取消,6.多笔待付款转预收)
    * @paramType java.lang.String
    * @param canceltype - 取消类型(1.收款取消,2.付款取消,3.预收匹配取消,4.待付款匹配取消,5.多笔预收转待付款取消,6.多笔待付款转预收)
     */
    public void setCanceltype(String canceltype) {
        this.canceltype = canceltype;
    }

    /**
    * 获取-所取消业务数据的主键ID(1.收款取消：所取消的收款数据的inpaymentid；2.付款取消：所取消的付款数据的inpaymentid；3.预收匹配取消：所取消的预收款useableno；4.待付款匹配取消：所取消的待付款payableno；5.多笔预收转待付款取消：所取消的待付款payableno；6.多笔待付款转预收：所取消预收款的useableno)
    * @return mastno
     */
    public Long getMastno() {
        return mastno;
    }

    /**
    * 设置-所取消业务数据的主键ID(1.收款取消：所取消的收款数据的inpaymentid；2.付款取消：所取消的付款数据的inpaymentid；3.预收匹配取消：所取消的预收款useableno；4.待付款匹配取消：所取消的待付款payableno；5.多笔预收转待付款取消：所取消的待付款payableno；6.多笔待付款转预收：所取消预收款的useableno)
    * @paramType java.lang.Long
    * @param mastno - 所取消业务数据的主键ID(1.收款取消：所取消的收款数据的inpaymentid；2.付款取消：所取消的付款数据的inpaymentid；3.预收匹配取消：所取消的预收款useableno；4.待付款匹配取消：所取消的待付款payableno；5.多笔预收转待付款取消：所取消的待付款payableno；6.多笔待付款转预收：所取消预收款的useableno)
     */
    public void setMastno(Long mastno) {
        this.mastno = mastno;
    }

    /**
    * 获取-所取消业务数据类型(1.收款取消时datatype在前台得不到，故不用传到后台：所取消的收款数据业务类型，如：911现金收款、921银行收款；2.付款取消时datatype在前台得不到，故不用传到后台：所取消的付款数据业务类型，如：921现金付款、922银行付款；3.预收匹配取消：所取消的预收款业务类型，如：401、408等等；4.待付款匹配取消：所取消的待付款业务类型，如：402、302等等；5.多笔预收转待付款取消：所取消的待付款数据业务类型,如：402；6.多笔待付款转预收：所取消预收款数据业务类型,如：408)
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-所取消业务数据类型(1.收款取消时datatype在前台得不到，故不用传到后台：所取消的收款数据业务类型，如：911现金收款、921银行收款；2.付款取消时datatype在前台得不到，故不用传到后台：所取消的付款数据业务类型，如：921现金付款、922银行付款；3.预收匹配取消：所取消的预收款业务类型，如：401、408等等；4.待付款匹配取消：所取消的待付款业务类型，如：402、302等等；5.多笔预收转待付款取消：所取消的待付款数据业务类型,如：402；6.多笔待付款转预收：所取消预收款数据业务类型,如：408)
    * @paramType java.lang.String
    * @param datatype - 所取消业务数据类型(1.收款取消时datatype在前台得不到，故不用传到后台：所取消的收款数据业务类型，如：911现金收款、921银行收款；2.付款取消时datatype在前台得不到，故不用传到后台：所取消的付款数据业务类型，如：921现金付款、922银行付款；3.预收匹配取消：所取消的预收款业务类型，如：401、408等等；4.待付款匹配取消：所取消的待付款业务类型，如：402、302等等；5.多笔预收转待付款取消：所取消的待付款数据业务类型,如：402；6.多笔待付款转预收：所取消预收款数据业务类型,如：408)
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    /**
    * 获取-币种
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种
    * @paramType java.lang.String
    * @param currencycode - 币种
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-被取消记录的金额(只有收款取消、付款取消)
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-被取消记录的金额(只有收款取消、付款取消)
    * @paramType java.math.BigDecimal
    * @param amount - 被取消记录的金额(只有收款取消、付款取消)
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-描述
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-描述
    * @paramType java.lang.String
    * @param description - 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    * 获取-状态
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态
    * @paramType java.lang.String
    * @param status - 状态
     */
    public void setStatus(String status) {
        this.status = status;
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
    * 获取-最后修改日期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后修改日期
    * @paramType java.util.Date
    * @param lastopdate - 最后修改日期
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
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
    * 获取-数据版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-数据版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - 数据版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-数据修改说明
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-数据修改说明
    * @paramType java.lang.String
    * @param modifydesc - 数据修改说明
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-结算单类型(0 非结算单、 1 保费结算单、2 赔款结算单、3 手续费结算单、4 再保结算单)
    * @return batchsettlementtype
     */
    public String getBatchsettlementtype() {
        return batchsettlementtype;
    }

    /**
    * 设置-结算单类型(0 非结算单、 1 保费结算单、2 赔款结算单、3 手续费结算单、4 再保结算单)
    * @paramType java.lang.String
    * @param batchsettlementtype - 结算单类型(0 非结算单、 1 保费结算单、2 赔款结算单、3 手续费结算单、4 再保结算单)
     */
    public void setBatchsettlementtype(String batchsettlementtype) {
        this.batchsettlementtype = batchsettlementtype;
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
    * 获取-存储生成方式:0批量导入,1手工录入,2系统接入
    * @return createtype
     */
    public String getCreatetype() {
        return createtype;
    }

    /**
    * 设置-存储生成方式:0批量导入,1手工录入,2系统接入
    * @paramType java.lang.String
    * @param createtype - 存储生成方式:0批量导入,1手工录入,2系统接入
     */
    public void setCreatetype(String createtype) {
        this.createtype = createtype;
    }
}