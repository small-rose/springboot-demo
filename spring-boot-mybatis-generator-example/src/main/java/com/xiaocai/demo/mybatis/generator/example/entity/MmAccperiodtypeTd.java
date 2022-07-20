package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_accperiodtype_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmAccperiodtypeTd {
    /**
     * 业务类型一：1保单，2赔案，3手续费，4再保，5准备金，7 车船税申报,8 结算单
     */
    private String certitype;

    /**
     * 业务类型二：类型一的明细化
     */
    private String datatype;

    /**
     * 账期类型: 0标识进入小账期；1标识进入大账期
     */
    private String flag;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * HIBERNATEVERSION版本
     */
    private Integer hibernateversion;

    /**
     * 手工修改描述
     */
    private String description;

    /**
     * 主键id
     */
    private String accperiodid;

    /**
    * 获取-业务类型一：1保单，2赔案，3手续费，4再保，5准备金，7 车船税申报,8 结算单
    * @return certitype
     */
    public String getCertitype() {
        return certitype;
    }

    /**
    * 设置-业务类型一：1保单，2赔案，3手续费，4再保，5准备金，7 车船税申报,8 结算单
    * @paramType java.lang.String
    * @param certitype - 业务类型一：1保单，2赔案，3手续费，4再保，5准备金，7 车船税申报,8 结算单
     */
    public void setCertitype(String certitype) {
        this.certitype = certitype;
    }

    /**
    * 获取-业务类型二：类型一的明细化
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-业务类型二：类型一的明细化
    * @paramType java.lang.String
    * @param datatype - 业务类型二：类型一的明细化
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    /**
    * 获取-账期类型: 0标识进入小账期；1标识进入大账期
    * @return flag
     */
    public String getFlag() {
        return flag;
    }

    /**
    * 设置-账期类型: 0标识进入小账期；1标识进入大账期
    * @paramType java.lang.String
    * @param flag - 账期类型: 0标识进入小账期；1标识进入大账期
     */
    public void setFlag(String flag) {
        this.flag = flag;
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
    * 获取-HIBERNATEVERSION版本
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATEVERSION版本
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATEVERSION版本
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-手工修改描述
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-手工修改描述
    * @paramType java.lang.String
    * @param description - 手工修改描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    * 获取-主键id
    * @return accperiodid
     */
    public String getAccperiodid() {
        return accperiodid;
    }

    /**
    * 设置-主键id
    * @paramType java.lang.String
    * @param accperiodid - 主键id
     */
    public void setAccperiodid(String accperiodid) {
        this.accperiodid = accperiodid;
    }
}