package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : d_bankpower
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class DBankpower {
    /**
     * 平台用户代码
     */
    private Long userid;

    /**
     * 所属分公司代码
     */
    private String subcompany;

    /**
     * 是否有效 0无效，1有效，默认0
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
    * 获取-平台用户代码
    * @return userid
     */
    public Long getUserid() {
        return userid;
    }

    /**
    * 设置-平台用户代码
    * @paramType java.lang.Long
    * @param userid - 平台用户代码
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
    * 获取-所属分公司代码
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-所属分公司代码
    * @paramType java.lang.String
    * @param subcompany - 所属分公司代码
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-是否有效 0无效，1有效，默认0
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否有效 0无效，1有效，默认0
    * @paramType java.lang.String
    * @param ifvalid - 是否有效 0无效，1有效，默认0
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
}