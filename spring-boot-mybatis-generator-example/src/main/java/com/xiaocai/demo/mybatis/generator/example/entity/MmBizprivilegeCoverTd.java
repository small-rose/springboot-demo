package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_bizprivilege_cover_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmBizprivilegeCoverTd {
    /**
     * 人员代码
     */
    private String opcode;

    /**
     * 业务部门代码
     */
    private String departmentcode;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 查询权限(查询模块中用查询权限sqlstring1，把POWERMARK>=1的内容拼成sql 生产模块中用操作权限sqlstring2，把POWERMARK=2的内容拼成sql    比如： 账户余额查询用查询权限，收款操作查账户用操作权限； 台帐查询用部门查询权限，收款查保单用部门操作权限)
     */
    private String powermark;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 后备权限
     */
    private String bakpowermark;

    /**
     * 状态
     */
    private String status;

    /**
    * 获取-人员代码
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-人员代码
    * @paramType java.lang.String
    * @param opcode - 人员代码
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-业务部门代码
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-业务部门代码
    * @paramType java.lang.String
    * @param departmentcode - 业务部门代码
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
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
    * 获取-查询权限(查询模块中用查询权限sqlstring1，把POWERMARK>=1的内容拼成sql 生产模块中用操作权限sqlstring2，把POWERMARK=2的内容拼成sql    比如： 账户余额查询用查询权限，收款操作查账户用操作权限； 台帐查询用部门查询权限，收款查保单用部门操作权限)
    * @return powermark
     */
    public String getPowermark() {
        return powermark;
    }

    /**
    * 设置-查询权限(查询模块中用查询权限sqlstring1，把POWERMARK>=1的内容拼成sql 生产模块中用操作权限sqlstring2，把POWERMARK=2的内容拼成sql    比如： 账户余额查询用查询权限，收款操作查账户用操作权限； 台帐查询用部门查询权限，收款查保单用部门操作权限)
    * @paramType java.lang.String
    * @param powermark - 查询权限(查询模块中用查询权限sqlstring1，把POWERMARK>=1的内容拼成sql 生产模块中用操作权限sqlstring2，把POWERMARK=2的内容拼成sql    比如： 账户余额查询用查询权限，收款操作查账户用操作权限； 台帐查询用部门查询权限，收款查保单用部门操作权限)
     */
    public void setPowermark(String powermark) {
        this.powermark = powermark;
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
    * 获取-后备权限
    * @return bakpowermark
     */
    public String getBakpowermark() {
        return bakpowermark;
    }

    /**
    * 设置-后备权限
    * @paramType java.lang.String
    * @param bakpowermark - 后备权限
     */
    public void setBakpowermark(String bakpowermark) {
        this.bakpowermark = bakpowermark;
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
}