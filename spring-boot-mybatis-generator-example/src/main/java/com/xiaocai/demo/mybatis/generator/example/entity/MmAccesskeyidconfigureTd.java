package com.xiaocai.demo.mybatis.generator.example.entity;

/**
 *  
 * @Table : mm_accesskeyidconfigure_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmAccesskeyidconfigureTd {
    /**
     * 主键
     */
    private Long accesskeyid;

    /**
     * 组织名称
     */
    private String orgname;

    /**
     * 税号
     */
    private String taxpayerno;

    /**
     * 分公司
     */
    private String subcompany;

    /**
    * 获取-主键
    * @return accesskeyid
     */
    public Long getAccesskeyid() {
        return accesskeyid;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param accesskeyid - 主键
     */
    public void setAccesskeyid(Long accesskeyid) {
        this.accesskeyid = accesskeyid;
    }

    /**
    * 获取-组织名称
    * @return orgname
     */
    public String getOrgname() {
        return orgname;
    }

    /**
    * 设置-组织名称
    * @paramType java.lang.String
    * @param orgname - 组织名称
     */
    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    /**
    * 获取-税号
    * @return taxpayerno
     */
    public String getTaxpayerno() {
        return taxpayerno;
    }

    /**
    * 设置-税号
    * @paramType java.lang.String
    * @param taxpayerno - 税号
     */
    public void setTaxpayerno(String taxpayerno) {
        this.taxpayerno = taxpayerno;
    }

    /**
    * 获取-分公司
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司
    * @paramType java.lang.String
    * @param subcompany - 分公司
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }
}