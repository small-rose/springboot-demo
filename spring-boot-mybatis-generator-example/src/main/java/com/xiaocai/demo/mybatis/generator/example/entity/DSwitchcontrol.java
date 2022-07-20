package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : d_switchcontrol
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class DSwitchcontrol {
    /**
     * id
     */
    private String id;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 分公司名称
     */
    private String subcompanyname;

    /**
     * 数据来源代码
     */
    private String channelcode;

    /**
     * 数据来源名称
     */
    private String channelname;

    /**
     * 收单行代码
     */
    private String bankid;

    /**
     * 收单行名称
     */
    private String bankname;

    /**
     * 是否打开：0 关闭；1打开
     */
    private String ifvalid;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 渠道类型：1pos;2web
     */
    private String type;

    /**
     * 备注
     */
    private String remark;

    /**
     * 模式
     */
    private String modetype;

    /**
     * 实名认证方式
     */
    private String realnamemode;

    /**
    * 获取-id
    * @return id
     */
    public String getId() {
        return id;
    }

    /**
    * 设置-id
    * @paramType java.lang.String
    * @param id - id
     */
    public void setId(String id) {
        this.id = id;
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
    * 获取-分公司名称
    * @return subcompanyname
     */
    public String getSubcompanyname() {
        return subcompanyname;
    }

    /**
    * 设置-分公司名称
    * @paramType java.lang.String
    * @param subcompanyname - 分公司名称
     */
    public void setSubcompanyname(String subcompanyname) {
        this.subcompanyname = subcompanyname;
    }

    /**
    * 获取-数据来源代码
    * @return channelcode
     */
    public String getChannelcode() {
        return channelcode;
    }

    /**
    * 设置-数据来源代码
    * @paramType java.lang.String
    * @param channelcode - 数据来源代码
     */
    public void setChannelcode(String channelcode) {
        this.channelcode = channelcode;
    }

    /**
    * 获取-数据来源名称
    * @return channelname
     */
    public String getChannelname() {
        return channelname;
    }

    /**
    * 设置-数据来源名称
    * @paramType java.lang.String
    * @param channelname - 数据来源名称
     */
    public void setChannelname(String channelname) {
        this.channelname = channelname;
    }

    /**
    * 获取-收单行代码
    * @return bankid
     */
    public String getBankid() {
        return bankid;
    }

    /**
    * 设置-收单行代码
    * @paramType java.lang.String
    * @param bankid - 收单行代码
     */
    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    /**
    * 获取-收单行名称
    * @return bankname
     */
    public String getBankname() {
        return bankname;
    }

    /**
    * 设置-收单行名称
    * @paramType java.lang.String
    * @param bankname - 收单行名称
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
    * 获取-是否打开：0 关闭；1打开
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否打开：0 关闭；1打开
    * @paramType java.lang.String
    * @param ifvalid - 是否打开：0 关闭；1打开
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
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
    * 获取-渠道类型：1pos;2web
    * @return type
     */
    public String getType() {
        return type;
    }

    /**
    * 设置-渠道类型：1pos;2web
    * @paramType java.lang.String
    * @param type - 渠道类型：1pos;2web
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
    * 获取-备注
    * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param remark - 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
    * 获取-模式
    * @return modetype
     */
    public String getModetype() {
        return modetype;
    }

    /**
    * 设置-模式
    * @paramType java.lang.String
    * @param modetype - 模式
     */
    public void setModetype(String modetype) {
        this.modetype = modetype;
    }

    /**
    * 获取-实名认证方式
    * @return realnamemode
     */
    public String getRealnamemode() {
        return realnamemode;
    }

    /**
    * 设置-实名认证方式
    * @paramType java.lang.String
    * @param realnamemode - 实名认证方式
     */
    public void setRealnamemode(String realnamemode) {
        this.realnamemode = realnamemode;
    }
}