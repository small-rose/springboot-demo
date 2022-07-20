package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : d_user
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class DUser {
    /**
     * 平台用户代码
     */
    private String userid;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 用户说明
     */
    private String note;

    /**
     * 用户类型
     */
    private String type;

    /**
     * 两位编码缩写，用于申请号头两位。
     */
    private String shortno;

    /**
     * T 表示该用户需要校验终端 F 表示该用户无需校验终端 
     */
    private String ifchecktid;

    /**
     * 用户所属系统
     */
    private String usertype;

    /**
     * 是否校验商户号
     */
    private String ifcheckinsuremidno;

    /**
     * 用户是否有效，0无效，1有效，默认0
     */
    private String ifvalid;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 手工修改说明
     */
    private String modifydesc;

    /**
     * 是否较验分公司,T：需要较验; F:不需要较验
     */
    private String ifchecksubcompany;

    /**
     * 签名密钥
     */
    private String signkey;

    /**
     * 签名方法
     */
    private String signtype;

    /**
     * 是否较验分公司,T：需要较验; F:不需要较验
     */
    private String ifcheckunitcode;

    /**
    * 获取-平台用户代码
    * @return userid
     */
    public String getUserid() {
        return userid;
    }

    /**
    * 设置-平台用户代码
    * @paramType java.lang.String
    * @param userid - 平台用户代码
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
    * 获取-密码
    * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
    * 设置-密码
    * @paramType java.lang.String
    * @param pwd - 密码
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
    * 获取-用户说明
    * @return note
     */
    public String getNote() {
        return note;
    }

    /**
    * 设置-用户说明
    * @paramType java.lang.String
    * @param note - 用户说明
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
    * 获取-用户类型
    * @return type
     */
    public String getType() {
        return type;
    }

    /**
    * 设置-用户类型
    * @paramType java.lang.String
    * @param type - 用户类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
    * 获取-两位编码缩写，用于申请号头两位。
    * @return shortno
     */
    public String getShortno() {
        return shortno;
    }

    /**
    * 设置-两位编码缩写，用于申请号头两位。
    * @paramType java.lang.String
    * @param shortno - 两位编码缩写，用于申请号头两位。
     */
    public void setShortno(String shortno) {
        this.shortno = shortno;
    }

    /**
    * 获取-T 表示该用户需要校验终端
F 表示该用户无需校验终端

    * @return ifchecktid
     */
    public String getIfchecktid() {
        return ifchecktid;
    }

    /**
    * 设置-T 表示该用户需要校验终端
F 表示该用户无需校验终端

    * @paramType java.lang.String
    * @param ifchecktid - T 表示该用户需要校验终端
F 表示该用户无需校验终端

     */
    public void setIfchecktid(String ifchecktid) {
        this.ifchecktid = ifchecktid;
    }

    /**
    * 获取-用户所属系统
    * @return usertype
     */
    public String getUsertype() {
        return usertype;
    }

    /**
    * 设置-用户所属系统
    * @paramType java.lang.String
    * @param usertype - 用户所属系统
     */
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    /**
    * 获取-是否校验商户号
    * @return ifcheckinsuremidno
     */
    public String getIfcheckinsuremidno() {
        return ifcheckinsuremidno;
    }

    /**
    * 设置-是否校验商户号
    * @paramType java.lang.String
    * @param ifcheckinsuremidno - 是否校验商户号
     */
    public void setIfcheckinsuremidno(String ifcheckinsuremidno) {
        this.ifcheckinsuremidno = ifcheckinsuremidno;
    }

    /**
    * 获取-用户是否有效，0无效，1有效，默认0
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-用户是否有效，0无效，1有效，默认0
    * @paramType java.lang.String
    * @param ifvalid - 用户是否有效，0无效，1有效，默认0
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
    * 获取-手工修改说明
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改说明
    * @paramType java.lang.String
    * @param modifydesc - 手工修改说明
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-是否较验分公司,T：需要较验; F:不需要较验
    * @return ifchecksubcompany
     */
    public String getIfchecksubcompany() {
        return ifchecksubcompany;
    }

    /**
    * 设置-是否较验分公司,T：需要较验; F:不需要较验
    * @paramType java.lang.String
    * @param ifchecksubcompany - 是否较验分公司,T：需要较验; F:不需要较验
     */
    public void setIfchecksubcompany(String ifchecksubcompany) {
        this.ifchecksubcompany = ifchecksubcompany;
    }

    /**
    * 获取-签名密钥
    * @return signkey
     */
    public String getSignkey() {
        return signkey;
    }

    /**
    * 设置-签名密钥
    * @paramType java.lang.String
    * @param signkey - 签名密钥
     */
    public void setSignkey(String signkey) {
        this.signkey = signkey;
    }

    /**
    * 获取-签名方法
    * @return signtype
     */
    public String getSigntype() {
        return signtype;
    }

    /**
    * 设置-签名方法
    * @paramType java.lang.String
    * @param signtype - 签名方法
     */
    public void setSigntype(String signtype) {
        this.signtype = signtype;
    }

    /**
    * 获取-是否较验分公司,T：需要较验; F:不需要较验
    * @return ifcheckunitcode
     */
    public String getIfcheckunitcode() {
        return ifcheckunitcode;
    }

    /**
    * 设置-是否较验分公司,T：需要较验; F:不需要较验
    * @paramType java.lang.String
    * @param ifcheckunitcode - 是否较验分公司,T：需要较验; F:不需要较验
     */
    public void setIfcheckunitcode(String ifcheckunitcode) {
        this.ifcheckunitcode = ifcheckunitcode;
    }
}