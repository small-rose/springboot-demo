package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_writeoutmodule_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmWriteoutmoduleTc {
    /**
     * 业务类型
     */
    private String businesstype;

    /**
     * 回写模板号
     */
    private Long moduleno;

    /**
     * 1;承保,2:赔款,3:手续费,4:再保
     */
    private String writeouttype;

    /**
     * 入账标志
     */
    private BigDecimal signenter;

    /**
     * 挂帐标志
     */
    private BigDecimal signhang;

    /**
     * 实收标志
     */
    private BigDecimal signreal;

    /**
     * 是否不需要回写：0有效，1无效
     */
    private String disabled;

    /**
     * 根据回写类型不同，数据类型编码不同，从模板得到 1、承保对应：1:保费,2:储金,3:储金折保费,4:车船税 5:储金返还,6:储金利息 2、理赔对应：01标的赔款，02核赔费，03查勘费，04代查勘费，05施救费，06其他费用，07预付赔款，08损余收回 09代垫付 10代垫付追偿（红字） 11冲消预付赔款 12 垫付
     */
    private String datatype;

    /**
     * 名称
     */
    private String name;

    /**
     * 来源表，根据businessno回找的表。应付款：mm_payablemoney_td;保单：mm_policy_td;手续费：mm_applyfee_td
     */
    private String sourcetable;

    /**
     * 操作员
     */
    private String opcode;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * HIBERNATEVERSION版本号
     */
    private Integer hibernateversion;

    /**
     * 手工修改数据说明
     */
    private String modifydesc;

    /**
     * 是否回写到报表取数表 0回写 1 不回写
     */
    private String signreport;

    /**
    * 获取-业务类型
    * @return businesstype
     */
    public String getBusinesstype() {
        return businesstype;
    }

    /**
    * 设置-业务类型
    * @paramType java.lang.String
    * @param businesstype - 业务类型
     */
    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype;
    }

    /**
    * 获取-回写模板号
    * @return moduleno
     */
    public Long getModuleno() {
        return moduleno;
    }

    /**
    * 设置-回写模板号
    * @paramType java.lang.Long
    * @param moduleno - 回写模板号
     */
    public void setModuleno(Long moduleno) {
        this.moduleno = moduleno;
    }

    /**
    * 获取-1;承保,2:赔款,3:手续费,4:再保
    * @return writeouttype
     */
    public String getWriteouttype() {
        return writeouttype;
    }

    /**
    * 设置-1;承保,2:赔款,3:手续费,4:再保
    * @paramType java.lang.String
    * @param writeouttype - 1;承保,2:赔款,3:手续费,4:再保
     */
    public void setWriteouttype(String writeouttype) {
        this.writeouttype = writeouttype;
    }

    /**
    * 获取-入账标志
    * @return signenter
     */
    public BigDecimal getSignenter() {
        return signenter;
    }

    /**
    * 设置-入账标志
    * @paramType java.math.BigDecimal
    * @param signenter - 入账标志
     */
    public void setSignenter(BigDecimal signenter) {
        this.signenter = signenter;
    }

    /**
    * 获取-挂帐标志
    * @return signhang
     */
    public BigDecimal getSignhang() {
        return signhang;
    }

    /**
    * 设置-挂帐标志
    * @paramType java.math.BigDecimal
    * @param signhang - 挂帐标志
     */
    public void setSignhang(BigDecimal signhang) {
        this.signhang = signhang;
    }

    /**
    * 获取-实收标志
    * @return signreal
     */
    public BigDecimal getSignreal() {
        return signreal;
    }

    /**
    * 设置-实收标志
    * @paramType java.math.BigDecimal
    * @param signreal - 实收标志
     */
    public void setSignreal(BigDecimal signreal) {
        this.signreal = signreal;
    }

    /**
    * 获取-是否不需要回写：0有效，1无效
    * @return disabled
     */
    public String getDisabled() {
        return disabled;
    }

    /**
    * 设置-是否不需要回写：0有效，1无效
    * @paramType java.lang.String
    * @param disabled - 是否不需要回写：0有效，1无效
     */
    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    /**
    * 获取-根据回写类型不同，数据类型编码不同，从模板得到 1、承保对应：1:保费,2:储金,3:储金折保费,4:车船税 5:储金返还,6:储金利息 2、理赔对应：01标的赔款，02核赔费，03查勘费，04代查勘费，05施救费，06其他费用，07预付赔款，08损余收回 09代垫付 10代垫付追偿（红字） 11冲消预付赔款 12 垫付
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-根据回写类型不同，数据类型编码不同，从模板得到 1、承保对应：1:保费,2:储金,3:储金折保费,4:车船税 5:储金返还,6:储金利息 2、理赔对应：01标的赔款，02核赔费，03查勘费，04代查勘费，05施救费，06其他费用，07预付赔款，08损余收回 09代垫付 10代垫付追偿（红字） 11冲消预付赔款 12 垫付
    * @paramType java.lang.String
    * @param datatype - 根据回写类型不同，数据类型编码不同，从模板得到 1、承保对应：1:保费,2:储金,3:储金折保费,4:车船税 5:储金返还,6:储金利息 2、理赔对应：01标的赔款，02核赔费，03查勘费，04代查勘费，05施救费，06其他费用，07预付赔款，08损余收回 09代垫付 10代垫付追偿（红字） 11冲消预付赔款 12 垫付
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
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
    * 获取-来源表，根据businessno回找的表。应付款：mm_payablemoney_td;保单：mm_policy_td;手续费：mm_applyfee_td
    * @return sourcetable
     */
    public String getSourcetable() {
        return sourcetable;
    }

    /**
    * 设置-来源表，根据businessno回找的表。应付款：mm_payablemoney_td;保单：mm_policy_td;手续费：mm_applyfee_td
    * @paramType java.lang.String
    * @param sourcetable - 来源表，根据businessno回找的表。应付款：mm_payablemoney_td;保单：mm_policy_td;手续费：mm_applyfee_td
     */
    public void setSourcetable(String sourcetable) {
        this.sourcetable = sourcetable;
    }

    /**
    * 获取-操作员
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作员
    * @paramType java.lang.String
    * @param opcode - 操作员
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
    * 获取-手工修改数据说明
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改数据说明
    * @paramType java.lang.String
    * @param modifydesc - 手工修改数据说明
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-是否回写到报表取数表 0回写 1 不回写
    * @return signreport
     */
    public String getSignreport() {
        return signreport;
    }

    /**
    * 设置-是否回写到报表取数表 0回写 1 不回写
    * @paramType java.lang.String
    * @param signreport - 是否回写到报表取数表 0回写 1 不回写
     */
    public void setSignreport(String signreport) {
        this.signreport = signreport;
    }
}