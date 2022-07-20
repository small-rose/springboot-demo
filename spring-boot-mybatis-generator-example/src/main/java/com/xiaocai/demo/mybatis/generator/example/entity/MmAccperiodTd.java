package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_accperiod_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmAccperiodTd {
    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 账期年
     */
    private Long accountyear;

    /**
     * 账期月
     */
    private Long accountmonth;

    /**
     * 账期起始日
     */
    private Date accstartdate;

    /**
     * 账期终止日
     */
    private Date accenddate;

    /**
     * 0已开账， 1已关账， 2月结中 3预插入的账期记录，未开账
     */
    private String isclosed;

    /**
     * 财务年月
     */
    private String accountyearmonth;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 类型
     */
    private String opttype;

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
    * 获取-账期年
    * @return accountyear
     */
    public Long getAccountyear() {
        return accountyear;
    }

    /**
    * 设置-账期年
    * @paramType java.lang.Long
    * @param accountyear - 账期年
     */
    public void setAccountyear(Long accountyear) {
        this.accountyear = accountyear;
    }

    /**
    * 获取-账期月
    * @return accountmonth
     */
    public Long getAccountmonth() {
        return accountmonth;
    }

    /**
    * 设置-账期月
    * @paramType java.lang.Long
    * @param accountmonth - 账期月
     */
    public void setAccountmonth(Long accountmonth) {
        this.accountmonth = accountmonth;
    }

    /**
    * 获取-账期起始日
    * @return accstartdate
     */
    public Date getAccstartdate() {
        return accstartdate;
    }

    /**
    * 设置-账期起始日
    * @paramType java.util.Date
    * @param accstartdate - 账期起始日
     */
    public void setAccstartdate(Date accstartdate) {
        this.accstartdate = accstartdate;
    }

    /**
    * 获取-账期终止日
    * @return accenddate
     */
    public Date getAccenddate() {
        return accenddate;
    }

    /**
    * 设置-账期终止日
    * @paramType java.util.Date
    * @param accenddate - 账期终止日
     */
    public void setAccenddate(Date accenddate) {
        this.accenddate = accenddate;
    }

    /**
    * 获取-0已开账， 1已关账， 2月结中 3预插入的账期记录，未开账
    * @return isclosed
     */
    public String getIsclosed() {
        return isclosed;
    }

    /**
    * 设置-0已开账， 1已关账， 2月结中 3预插入的账期记录，未开账
    * @paramType java.lang.String
    * @param isclosed - 0已开账， 1已关账， 2月结中 3预插入的账期记录，未开账
     */
    public void setIsclosed(String isclosed) {
        this.isclosed = isclosed;
    }

    /**
    * 获取-财务年月
    * @return accountyearmonth
     */
    public String getAccountyearmonth() {
        return accountyearmonth;
    }

    /**
    * 设置-财务年月
    * @paramType java.lang.String
    * @param accountyearmonth - 财务年月
     */
    public void setAccountyearmonth(String accountyearmonth) {
        this.accountyearmonth = accountyearmonth;
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
    * 获取-类型
    * @return opttype
     */
    public String getOpttype() {
        return opttype;
    }

    /**
    * 设置-类型
    * @paramType java.lang.String
    * @param opttype - 类型
     */
    public void setOpttype(String opttype) {
        this.opttype = opttype;
    }
}