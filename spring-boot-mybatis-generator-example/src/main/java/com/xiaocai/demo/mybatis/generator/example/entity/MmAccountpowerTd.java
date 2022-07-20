package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_accountpower_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmAccountpowerTd {
    /**
     * 操作员
     */
    private String opcode;

    /**
     * MM_ACCOUNT_TD主键
     */
    private Long mmaccountid;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 权限类型
     */
    private String powermark;

    /**
     * 现金余额，某帐户分配到某操作员头上的金额，只对现金账户有意义
     */
    private BigDecimal cashbalance;

    /**
     * 支票张数
     */
    private BigDecimal checksnum;

    /**
     * 授权日期
     */
    private Date applydate;

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
    * 获取-MM_ACCOUNT_TD主键
    * @return mmaccountid
     */
    public Long getMmaccountid() {
        return mmaccountid;
    }

    /**
    * 设置-MM_ACCOUNT_TD主键
    * @paramType java.lang.Long
    * @param mmaccountid - MM_ACCOUNT_TD主键
     */
    public void setMmaccountid(Long mmaccountid) {
        this.mmaccountid = mmaccountid;
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
    * 获取-权限类型
    * @return powermark
     */
    public String getPowermark() {
        return powermark;
    }

    /**
    * 设置-权限类型
    * @paramType java.lang.String
    * @param powermark - 权限类型
     */
    public void setPowermark(String powermark) {
        this.powermark = powermark;
    }

    /**
    * 获取-现金余额，某帐户分配到某操作员头上的金额，只对现金账户有意义
    * @return cashbalance
     */
    public BigDecimal getCashbalance() {
        return cashbalance;
    }

    /**
    * 设置-现金余额，某帐户分配到某操作员头上的金额，只对现金账户有意义
    * @paramType java.math.BigDecimal
    * @param cashbalance - 现金余额，某帐户分配到某操作员头上的金额，只对现金账户有意义
     */
    public void setCashbalance(BigDecimal cashbalance) {
        this.cashbalance = cashbalance;
    }

    /**
    * 获取-支票张数
    * @return checksnum
     */
    public BigDecimal getChecksnum() {
        return checksnum;
    }

    /**
    * 设置-支票张数
    * @paramType java.math.BigDecimal
    * @param checksnum - 支票张数
     */
    public void setChecksnum(BigDecimal checksnum) {
        this.checksnum = checksnum;
    }

    /**
    * 获取-授权日期
    * @return applydate
     */
    public Date getApplydate() {
        return applydate;
    }

    /**
    * 设置-授权日期
    * @paramType java.util.Date
    * @param applydate - 授权日期
     */
    public void setApplydate(Date applydate) {
        this.applydate = applydate;
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
}