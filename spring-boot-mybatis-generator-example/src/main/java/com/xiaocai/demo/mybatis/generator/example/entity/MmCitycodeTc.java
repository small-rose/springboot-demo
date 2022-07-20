package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_citycode_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmCitycodeTc {
    /**
     * 地区代码
     */
    private String addrcode;

    /**
     * 地区名称
     */
    private String addrname;

    /**
     * 级别
     */
    private String addrlevel;

    /**
     * 所在地市名称
     */
    private String cityname;

    /**
     * 所在地市代码
     */
    private String citycode;

    /**
     * 所在省名称
     */
    private String provname;

    /**
     * 所在省代码
     */
    private String provcode;

    /**
     * 时间戳
     */
    private Date createdate;

    /**
    * 获取-地区代码
    * @return addrcode
     */
    public String getAddrcode() {
        return addrcode;
    }

    /**
    * 设置-地区代码
    * @paramType java.lang.String
    * @param addrcode - 地区代码
     */
    public void setAddrcode(String addrcode) {
        this.addrcode = addrcode;
    }

    /**
    * 获取-地区名称
    * @return addrname
     */
    public String getAddrname() {
        return addrname;
    }

    /**
    * 设置-地区名称
    * @paramType java.lang.String
    * @param addrname - 地区名称
     */
    public void setAddrname(String addrname) {
        this.addrname = addrname;
    }

    /**
    * 获取-级别
    * @return addrlevel
     */
    public String getAddrlevel() {
        return addrlevel;
    }

    /**
    * 设置-级别
    * @paramType java.lang.String
    * @param addrlevel - 级别
     */
    public void setAddrlevel(String addrlevel) {
        this.addrlevel = addrlevel;
    }

    /**
    * 获取-所在地市名称
    * @return cityname
     */
    public String getCityname() {
        return cityname;
    }

    /**
    * 设置-所在地市名称
    * @paramType java.lang.String
    * @param cityname - 所在地市名称
     */
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    /**
    * 获取-所在地市代码
    * @return citycode
     */
    public String getCitycode() {
        return citycode;
    }

    /**
    * 设置-所在地市代码
    * @paramType java.lang.String
    * @param citycode - 所在地市代码
     */
    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    /**
    * 获取-所在省名称
    * @return provname
     */
    public String getProvname() {
        return provname;
    }

    /**
    * 设置-所在省名称
    * @paramType java.lang.String
    * @param provname - 所在省名称
     */
    public void setProvname(String provname) {
        this.provname = provname;
    }

    /**
    * 获取-所在省代码
    * @return provcode
     */
    public String getProvcode() {
        return provcode;
    }

    /**
    * 设置-所在省代码
    * @paramType java.lang.String
    * @param provcode - 所在省代码
     */
    public void setProvcode(String provcode) {
        this.provcode = provcode;
    }

    /**
    * 获取-时间戳
    * @return createdate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
    * 设置-时间戳
    * @paramType java.util.Date
    * @param createdate - 时间戳
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}