package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_login_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmLoginTd {
    /**
     * 操作员代码
     */
    private Long opcode;

    /**
     * 客户端IP
     */
    private String clientip;

    /**
     * 客户端电脑名称
     */
    private String clientname;

    /**
     * 备用
     */
    private String version;

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
    * 获取-操作员代码
    * @return opcode
     */
    public Long getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作员代码
    * @paramType java.lang.Long
    * @param opcode - 操作员代码
     */
    public void setOpcode(Long opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-客户端IP
    * @return clientip
     */
    public String getClientip() {
        return clientip;
    }

    /**
    * 设置-客户端IP
    * @paramType java.lang.String
    * @param clientip - 客户端IP
     */
    public void setClientip(String clientip) {
        this.clientip = clientip;
    }

    /**
    * 获取-客户端电脑名称
    * @return clientname
     */
    public String getClientname() {
        return clientname;
    }

    /**
    * 设置-客户端电脑名称
    * @paramType java.lang.String
    * @param clientname - 客户端电脑名称
     */
    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    /**
    * 获取-备用
    * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
    * 设置-备用
    * @paramType java.lang.String
    * @param version - 备用
     */
    public void setVersion(String version) {
        this.version = version;
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