package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_inpaymenttype_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmInpaymenttypeTc {
    /**
     * 业务类型1
     */
    private String processtype1;

    /**
     * 业务类型2
     */
    private String processtype2;

    /**
     * 业务类型1名称
     */
    private String processtype1name;

    /**
     * 业务类型2名称
     */
    private String processtype2name;

    /**
     * 财务处理类型1
     */
    private String accbusiness1;

    /**
     * 财务处理类型2
     */
    private String accbusiness2;

    /**
     * 财务处理类型3
     */
    private String accbusiness3;

    /**
     * 财务处理类型4
     */
    private String accbusiness4;

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
     * 是否有效，0为无效，1为有效。
     */
    private String ifvalid;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
    * 获取-业务类型1
    * @return processtype1
     */
    public String getProcesstype1() {
        return processtype1;
    }

    /**
    * 设置-业务类型1
    * @paramType java.lang.String
    * @param processtype1 - 业务类型1
     */
    public void setProcesstype1(String processtype1) {
        this.processtype1 = processtype1;
    }

    /**
    * 获取-业务类型2
    * @return processtype2
     */
    public String getProcesstype2() {
        return processtype2;
    }

    /**
    * 设置-业务类型2
    * @paramType java.lang.String
    * @param processtype2 - 业务类型2
     */
    public void setProcesstype2(String processtype2) {
        this.processtype2 = processtype2;
    }

    /**
    * 获取-业务类型1名称
    * @return processtype1name
     */
    public String getProcesstype1name() {
        return processtype1name;
    }

    /**
    * 设置-业务类型1名称
    * @paramType java.lang.String
    * @param processtype1name - 业务类型1名称
     */
    public void setProcesstype1name(String processtype1name) {
        this.processtype1name = processtype1name;
    }

    /**
    * 获取-业务类型2名称
    * @return processtype2name
     */
    public String getProcesstype2name() {
        return processtype2name;
    }

    /**
    * 设置-业务类型2名称
    * @paramType java.lang.String
    * @param processtype2name - 业务类型2名称
     */
    public void setProcesstype2name(String processtype2name) {
        this.processtype2name = processtype2name;
    }

    /**
    * 获取-财务处理类型1
    * @return accbusiness1
     */
    public String getAccbusiness1() {
        return accbusiness1;
    }

    /**
    * 设置-财务处理类型1
    * @paramType java.lang.String
    * @param accbusiness1 - 财务处理类型1
     */
    public void setAccbusiness1(String accbusiness1) {
        this.accbusiness1 = accbusiness1;
    }

    /**
    * 获取-财务处理类型2
    * @return accbusiness2
     */
    public String getAccbusiness2() {
        return accbusiness2;
    }

    /**
    * 设置-财务处理类型2
    * @paramType java.lang.String
    * @param accbusiness2 - 财务处理类型2
     */
    public void setAccbusiness2(String accbusiness2) {
        this.accbusiness2 = accbusiness2;
    }

    /**
    * 获取-财务处理类型3
    * @return accbusiness3
     */
    public String getAccbusiness3() {
        return accbusiness3;
    }

    /**
    * 设置-财务处理类型3
    * @paramType java.lang.String
    * @param accbusiness3 - 财务处理类型3
     */
    public void setAccbusiness3(String accbusiness3) {
        this.accbusiness3 = accbusiness3;
    }

    /**
    * 获取-财务处理类型4
    * @return accbusiness4
     */
    public String getAccbusiness4() {
        return accbusiness4;
    }

    /**
    * 设置-财务处理类型4
    * @paramType java.lang.String
    * @param accbusiness4 - 财务处理类型4
     */
    public void setAccbusiness4(String accbusiness4) {
        this.accbusiness4 = accbusiness4;
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
    * 获取-是否有效，0为无效，1为有效。
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否有效，0为无效，1为有效。
    * @paramType java.lang.String
    * @param ifvalid - 是否有效，0为无效，1为有效。
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
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
}