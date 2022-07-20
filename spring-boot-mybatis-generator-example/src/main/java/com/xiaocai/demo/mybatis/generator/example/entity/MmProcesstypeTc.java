package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_processtype_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmProcesstypeTc {
    /**
     * 业务类型
     */
    private String processtype;

    /**
     * 业务类型名称
     */
    private String processname;

    /**
     * 业务类型大类，1 表示核销时对应科目在贷方 、2 表示核销时对应科目在借方、 0 特殊类型（核销时的借贷不以自身类型为准，借贷都可以）
     */
    private String processkind;

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
     * 密码修改日期
     */
    private Date passwordopdate;

    /**
     * 是否有效，0为无效，1为有效。
     */
    private String ifvalid;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 会计科目代码
     */
    private String erpaccountcode;

    /**
     * 会计科目名称
     */
    private String erpaccountname;

    /**
    * 获取-业务类型
    * @return processtype
     */
    public String getProcesstype() {
        return processtype;
    }

    /**
    * 设置-业务类型
    * @paramType java.lang.String
    * @param processtype - 业务类型
     */
    public void setProcesstype(String processtype) {
        this.processtype = processtype;
    }

    /**
    * 获取-业务类型名称
    * @return processname
     */
    public String getProcessname() {
        return processname;
    }

    /**
    * 设置-业务类型名称
    * @paramType java.lang.String
    * @param processname - 业务类型名称
     */
    public void setProcessname(String processname) {
        this.processname = processname;
    }

    /**
    * 获取-业务类型大类，1 表示核销时对应科目在贷方 、2 表示核销时对应科目在借方、 0 特殊类型（核销时的借贷不以自身类型为准，借贷都可以）
    * @return processkind
     */
    public String getProcesskind() {
        return processkind;
    }

    /**
    * 设置-业务类型大类，1 表示核销时对应科目在贷方 、2 表示核销时对应科目在借方、 0 特殊类型（核销时的借贷不以自身类型为准，借贷都可以）
    * @paramType java.lang.String
    * @param processkind - 业务类型大类，1 表示核销时对应科目在贷方 、2 表示核销时对应科目在借方、 0 特殊类型（核销时的借贷不以自身类型为准，借贷都可以）
     */
    public void setProcesskind(String processkind) {
        this.processkind = processkind;
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
    * 获取-密码修改日期
    * @return passwordopdate
     */
    public Date getPasswordopdate() {
        return passwordopdate;
    }

    /**
    * 设置-密码修改日期
    * @paramType java.util.Date
    * @param passwordopdate - 密码修改日期
     */
    public void setPasswordopdate(Date passwordopdate) {
        this.passwordopdate = passwordopdate;
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

    /**
    * 获取-会计科目代码
    * @return erpaccountcode
     */
    public String getErpaccountcode() {
        return erpaccountcode;
    }

    /**
    * 设置-会计科目代码
    * @paramType java.lang.String
    * @param erpaccountcode - 会计科目代码
     */
    public void setErpaccountcode(String erpaccountcode) {
        this.erpaccountcode = erpaccountcode;
    }

    /**
    * 获取-会计科目名称
    * @return erpaccountname
     */
    public String getErpaccountname() {
        return erpaccountname;
    }

    /**
    * 设置-会计科目名称
    * @paramType java.lang.String
    * @param erpaccountname - 会计科目名称
     */
    public void setErpaccountname(String erpaccountname) {
        this.erpaccountname = erpaccountname;
    }
}