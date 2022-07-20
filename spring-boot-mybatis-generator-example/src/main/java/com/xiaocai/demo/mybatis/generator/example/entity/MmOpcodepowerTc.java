package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_opcodepower_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmOpcodepowerTc {
    /**
     * 分公司代码
     */
    private Long subcompany;

    /**
     * 权限代码
     */
    private Long powercode;

    /**
     * 业务对象代码
     */
    private Long objectcode;

    /**
     * 操作员代码
     */
    private Long opcode;

    /**
     * 权限级别
     */
    private Long powerlevel;

    /**
     * 权限名称同ams(powertype_tc表powername字段)
     */
    private String powername;

    /**
     * 业务对象名称(具体对应财务机构代码或账户代码，看选择的ams_powertype_tc表powercode值,如选择的财务机构类型，那就取财务机构名称)
     */
    private String objectname;

    /**
     * 是否有效(0：无效，1：有效)
     */
    private String ifvalid;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 创建日期
     */
    private Date createtime;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 摘要
     */
    private String modifydesc;

    /**
    * 获取-分公司代码
    * @return subcompany
     */
    public Long getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司代码
    * @paramType java.lang.Long
    * @param subcompany - 分公司代码
     */
    public void setSubcompany(Long subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-权限代码
    * @return powercode
     */
    public Long getPowercode() {
        return powercode;
    }

    /**
    * 设置-权限代码
    * @paramType java.lang.Long
    * @param powercode - 权限代码
     */
    public void setPowercode(Long powercode) {
        this.powercode = powercode;
    }

    /**
    * 获取-业务对象代码
    * @return objectcode
     */
    public Long getObjectcode() {
        return objectcode;
    }

    /**
    * 设置-业务对象代码
    * @paramType java.lang.Long
    * @param objectcode - 业务对象代码
     */
    public void setObjectcode(Long objectcode) {
        this.objectcode = objectcode;
    }

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
    * 获取-权限级别
    * @return powerlevel
     */
    public Long getPowerlevel() {
        return powerlevel;
    }

    /**
    * 设置-权限级别
    * @paramType java.lang.Long
    * @param powerlevel - 权限级别
     */
    public void setPowerlevel(Long powerlevel) {
        this.powerlevel = powerlevel;
    }

    /**
    * 获取-权限名称同ams(powertype_tc表powername字段)
    * @return powername
     */
    public String getPowername() {
        return powername;
    }

    /**
    * 设置-权限名称同ams(powertype_tc表powername字段)
    * @paramType java.lang.String
    * @param powername - 权限名称同ams(powertype_tc表powername字段)
     */
    public void setPowername(String powername) {
        this.powername = powername;
    }

    /**
    * 获取-业务对象名称(具体对应财务机构代码或账户代码，看选择的ams_powertype_tc表powercode值,如选择的财务机构类型，那就取财务机构名称)
    * @return objectname
     */
    public String getObjectname() {
        return objectname;
    }

    /**
    * 设置-业务对象名称(具体对应财务机构代码或账户代码，看选择的ams_powertype_tc表powercode值,如选择的财务机构类型，那就取财务机构名称)
    * @paramType java.lang.String
    * @param objectname - 业务对象名称(具体对应财务机构代码或账户代码，看选择的ams_powertype_tc表powercode值,如选择的财务机构类型，那就取财务机构名称)
     */
    public void setObjectname(String objectname) {
        this.objectname = objectname;
    }

    /**
    * 获取-是否有效(0：无效，1：有效)
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否有效(0：无效，1：有效)
    * @paramType java.lang.String
    * @param ifvalid - 是否有效(0：无效，1：有效)
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
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
    * 获取-创建日期
    * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
    * 设置-创建日期
    * @paramType java.util.Date
    * @param createtime - 创建日期
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
    * 获取-版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - 版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-摘要
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-摘要
    * @paramType java.lang.String
    * @param modifydesc - 摘要
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }
}