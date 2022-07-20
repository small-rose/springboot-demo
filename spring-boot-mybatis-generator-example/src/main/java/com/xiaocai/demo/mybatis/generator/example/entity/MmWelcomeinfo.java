package com.xiaocai.demo.mybatis.generator.example.entity;

/**
 *  
 * @Table : mm_welcomeinfo
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmWelcomeinfo {
    /**
     * 分公司代码
     */
    private Long subcompany;

    /**
     * 欢迎页面说明
     */
    private String welcomeinfo;

    /**
     * 描述
     */
    private String topwelcomeinfo;

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
    * 获取-欢迎页面说明
    * @return welcomeinfo
     */
    public String getWelcomeinfo() {
        return welcomeinfo;
    }

    /**
    * 设置-欢迎页面说明
    * @paramType java.lang.String
    * @param welcomeinfo - 欢迎页面说明
     */
    public void setWelcomeinfo(String welcomeinfo) {
        this.welcomeinfo = welcomeinfo;
    }

    /**
    * 获取-描述
    * @return topwelcomeinfo
     */
    public String getTopwelcomeinfo() {
        return topwelcomeinfo;
    }

    /**
    * 设置-描述
    * @paramType java.lang.String
    * @param topwelcomeinfo - 描述
     */
    public void setTopwelcomeinfo(String topwelcomeinfo) {
        this.topwelcomeinfo = topwelcomeinfo;
    }
}