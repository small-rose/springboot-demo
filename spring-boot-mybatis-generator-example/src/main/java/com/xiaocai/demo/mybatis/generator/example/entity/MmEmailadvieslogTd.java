package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_emailadvieslog_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmEmailadvieslogTd {
    /**
     * 主键
     */
    private Long emailid;

    /**
     * 邮件内容
     */
    private String emailcontent;

    /**
     * 邮件发送结果
     */
    private String emailresult;

    /**
     * 创建人
     */
    private String opcode;

    /**
     * 最后修改人
     */
    private String lastopcode;

    /**
     * 创建时间
     */
    private Date createdate;

    /**
     * 最后修改时间
     */
    private Date lastopdatae;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 备注
     */
    private String description;

    /**
    * 获取-主键
    * @return emailid
     */
    public Long getEmailid() {
        return emailid;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param emailid - 主键
     */
    public void setEmailid(Long emailid) {
        this.emailid = emailid;
    }

    /**
    * 获取-邮件内容
    * @return emailcontent
     */
    public String getEmailcontent() {
        return emailcontent;
    }

    /**
    * 设置-邮件内容
    * @paramType java.lang.String
    * @param emailcontent - 邮件内容
     */
    public void setEmailcontent(String emailcontent) {
        this.emailcontent = emailcontent;
    }

    /**
    * 获取-邮件发送结果
    * @return emailresult
     */
    public String getEmailresult() {
        return emailresult;
    }

    /**
    * 设置-邮件发送结果
    * @paramType java.lang.String
    * @param emailresult - 邮件发送结果
     */
    public void setEmailresult(String emailresult) {
        this.emailresult = emailresult;
    }

    /**
    * 获取-创建人
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-创建人
    * @paramType java.lang.String
    * @param opcode - 创建人
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-最后修改人
    * @return lastopcode
     */
    public String getLastopcode() {
        return lastopcode;
    }

    /**
    * 设置-最后修改人
    * @paramType java.lang.String
    * @param lastopcode - 最后修改人
     */
    public void setLastopcode(String lastopcode) {
        this.lastopcode = lastopcode;
    }

    /**
    * 获取-创建时间
    * @return createdate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
    * 设置-创建时间
    * @paramType java.util.Date
    * @param createdate - 创建时间
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
    * 获取-最后修改时间
    * @return lastopdatae
     */
    public Date getLastopdatae() {
        return lastopdatae;
    }

    /**
    * 设置-最后修改时间
    * @paramType java.util.Date
    * @param lastopdatae - 最后修改时间
     */
    public void setLastopdatae(Date lastopdatae) {
        this.lastopdatae = lastopdatae;
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
    * 获取-备注
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param description - 备注
     */
    public void setDescription(String description) {
        this.description = description;
    }
}