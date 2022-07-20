package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_bankcode_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmBankcodeTc {
    /**
     * 主键
     */
    private Long urid;

    /**
     * 银行编码
     */
    private String bankcode;

    /**
     * 银行简称
     */
    private String bankshortname;

    /**
     * 银行名称
     */
    private String bankname;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * HIBERNATE版本号
     */
    private Short hibernateversion;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 是否有效，0 无效、1有效
     */
    private String ifvalid;

    /**
     * 通用银行代码
     */
    private String bankcode2;

    /**
     * 付款处理中选择银行：1 显示
     */
    private String isdisplay;

    /**
     * 银企直联对应的银行代码（如果有多条银企直联代码，则需要在codemaping表做映射）
     */
    private String refbankcode;

    /**
     * 银企直联对应的银行银行名称
     */
    private String refbankname;

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
    * 获取-银行编码
    * @return bankcode
     */
    public String getBankcode() {
        return bankcode;
    }

    /**
    * 设置-银行编码
    * @paramType java.lang.String
    * @param bankcode - 银行编码
     */
    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    /**
    * 获取-银行简称
    * @return bankshortname
     */
    public String getBankshortname() {
        return bankshortname;
    }

    /**
    * 设置-银行简称
    * @paramType java.lang.String
    * @param bankshortname - 银行简称
     */
    public void setBankshortname(String bankshortname) {
        this.bankshortname = bankshortname;
    }

    /**
    * 获取-银行名称
    * @return bankname
     */
    public String getBankname() {
        return bankname;
    }

    /**
    * 设置-银行名称
    * @paramType java.lang.String
    * @param bankname - 银行名称
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
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
    * 获取-HIBERNATE版本号
    * @return hibernateversion
     */
    public Short getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATE版本号
    * @paramType java.lang.Short
    * @param hibernateversion - HIBERNATE版本号
     */
    public void setHibernateversion(Short hibernateversion) {
        this.hibernateversion = hibernateversion;
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
    * 获取-是否有效，0 无效、1有效
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否有效，0 无效、1有效
    * @paramType java.lang.String
    * @param ifvalid - 是否有效，0 无效、1有效
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
    }

    /**
    * 获取-通用银行代码
    * @return bankcode2
     */
    public String getBankcode2() {
        return bankcode2;
    }

    /**
    * 设置-通用银行代码
    * @paramType java.lang.String
    * @param bankcode2 - 通用银行代码
     */
    public void setBankcode2(String bankcode2) {
        this.bankcode2 = bankcode2;
    }

    /**
    * 获取-付款处理中选择银行：1 显示
    * @return isdisplay
     */
    public String getIsdisplay() {
        return isdisplay;
    }

    /**
    * 设置-付款处理中选择银行：1 显示
    * @paramType java.lang.String
    * @param isdisplay - 付款处理中选择银行：1 显示
     */
    public void setIsdisplay(String isdisplay) {
        this.isdisplay = isdisplay;
    }

    /**
    * 获取-银企直联对应的银行代码（如果有多条银企直联代码，则需要在codemaping表做映射）
    * @return refbankcode
     */
    public String getRefbankcode() {
        return refbankcode;
    }

    /**
    * 设置-银企直联对应的银行代码（如果有多条银企直联代码，则需要在codemaping表做映射）
    * @paramType java.lang.String
    * @param refbankcode - 银企直联对应的银行代码（如果有多条银企直联代码，则需要在codemaping表做映射）
     */
    public void setRefbankcode(String refbankcode) {
        this.refbankcode = refbankcode;
    }

    /**
    * 获取-银企直联对应的银行银行名称
    * @return refbankname
     */
    public String getRefbankname() {
        return refbankname;
    }

    /**
    * 设置-银企直联对应的银行银行名称
    * @paramType java.lang.String
    * @param refbankname - 银企直联对应的银行银行名称
     */
    public void setRefbankname(String refbankname) {
        this.refbankname = refbankname;
    }
}