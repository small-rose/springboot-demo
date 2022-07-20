package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_agentcode_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmAgentcodeTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 业务系统中的主键
     */
    private String seqagent;

    /**
     * 代理点代码
     */
    private String agentcode;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 代理点名称
     */
    private String agentname;

    /**
     * 保险公司原来代理点代码
     */
    private String reallagentcode;

    /**
     * 代理点地址
     */
    private String agencyaddress;

    /**
     * 代理点邮编
     */
    private String agencypostcode;

    /**
     * 代理点电话
     */
    private String agencyphone;

    /**
     * 联系人
     */
    private String linkman;

    /**
     * 是否生效
     */
    private String ifvalid;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 状态 1 初始状态，2 落地成功 3 落地失败
     */
    private String status;

    /**
     * 数据来源 core 老业务系统 newcore新一代
     */
    private String source;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
    * 获取-主键
    * @return id
     */
    public Long getId() {
        return id;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param id - 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    * 获取-业务系统中的主键
    * @return seqagent
     */
    public String getSeqagent() {
        return seqagent;
    }

    /**
    * 设置-业务系统中的主键
    * @paramType java.lang.String
    * @param seqagent - 业务系统中的主键
     */
    public void setSeqagent(String seqagent) {
        this.seqagent = seqagent;
    }

    /**
    * 获取-代理点代码
    * @return agentcode
     */
    public String getAgentcode() {
        return agentcode;
    }

    /**
    * 设置-代理点代码
    * @paramType java.lang.String
    * @param agentcode - 代理点代码
     */
    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode;
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
    * 获取-代理点名称
    * @return agentname
     */
    public String getAgentname() {
        return agentname;
    }

    /**
    * 设置-代理点名称
    * @paramType java.lang.String
    * @param agentname - 代理点名称
     */
    public void setAgentname(String agentname) {
        this.agentname = agentname;
    }

    /**
    * 获取-保险公司原来代理点代码
    * @return reallagentcode
     */
    public String getReallagentcode() {
        return reallagentcode;
    }

    /**
    * 设置-保险公司原来代理点代码
    * @paramType java.lang.String
    * @param reallagentcode - 保险公司原来代理点代码
     */
    public void setReallagentcode(String reallagentcode) {
        this.reallagentcode = reallagentcode;
    }

    /**
    * 获取-代理点地址
    * @return agencyaddress
     */
    public String getAgencyaddress() {
        return agencyaddress;
    }

    /**
    * 设置-代理点地址
    * @paramType java.lang.String
    * @param agencyaddress - 代理点地址
     */
    public void setAgencyaddress(String agencyaddress) {
        this.agencyaddress = agencyaddress;
    }

    /**
    * 获取-代理点邮编
    * @return agencypostcode
     */
    public String getAgencypostcode() {
        return agencypostcode;
    }

    /**
    * 设置-代理点邮编
    * @paramType java.lang.String
    * @param agencypostcode - 代理点邮编
     */
    public void setAgencypostcode(String agencypostcode) {
        this.agencypostcode = agencypostcode;
    }

    /**
    * 获取-代理点电话
    * @return agencyphone
     */
    public String getAgencyphone() {
        return agencyphone;
    }

    /**
    * 设置-代理点电话
    * @paramType java.lang.String
    * @param agencyphone - 代理点电话
     */
    public void setAgencyphone(String agencyphone) {
        this.agencyphone = agencyphone;
    }

    /**
    * 获取-联系人
    * @return linkman
     */
    public String getLinkman() {
        return linkman;
    }

    /**
    * 设置-联系人
    * @paramType java.lang.String
    * @param linkman - 联系人
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    /**
    * 获取-是否生效
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否生效
    * @paramType java.lang.String
    * @param ifvalid - 是否生效
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
    }

    /**
    * 获取-电子邮件
    * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
    * 设置-电子邮件
    * @paramType java.lang.String
    * @param email - 电子邮件
     */
    public void setEmail(String email) {
        this.email = email;
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
    * 获取-状态 1 初始状态，2 落地成功 3 落地失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态 1 初始状态，2 落地成功 3 落地失败
    * @paramType java.lang.String
    * @param status - 状态 1 初始状态，2 落地成功 3 落地失败
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-数据来源 core 老业务系统 newcore新一代
    * @return source
     */
    public String getSource() {
        return source;
    }

    /**
    * 设置-数据来源 core 老业务系统 newcore新一代
    * @paramType java.lang.String
    * @param source - 数据来源 core 老业务系统 newcore新一代
     */
    public void setSource(String source) {
        this.source = source;
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
}