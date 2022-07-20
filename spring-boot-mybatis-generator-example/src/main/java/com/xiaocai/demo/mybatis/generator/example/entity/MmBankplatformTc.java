package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_bankplatform_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmBankplatformTc {
    /**
     * 主键
     */
    private String platformid;

    /**
     * 交易平台名称
     */
    private String platformname;

    /**
     * 回盘导入格式ID
     */
    private BigDecimal inputformatid;

    /**
     * 出盘导出格式ID
     */
    private BigDecimal outputformatid;

    /**
     * 0非银企直连 ,1银企直连,2现金
     */
    private String ifdirect;

    /**
     * 是否有效
     */
    private String ifvalid;

    /**
     * 时间戳
     */
    private Date createdate;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 盘片上限记录数
     */
    private BigDecimal discmaxnum;

    /**
     * 交易平台简称，用于生成凭证摘要时使用
     */
    private String shortname;

    /**
     * 授权文件格式
     */
    private BigDecimal authorizationid;

    /**
     * old交易平台唯一编码
     */
    private String oldplatformid;

    /**
    * 获取-主键
    * @return platformid
     */
    public String getPlatformid() {
        return platformid;
    }

    /**
    * 设置-主键
    * @paramType java.lang.String
    * @param platformid - 主键
     */
    public void setPlatformid(String platformid) {
        this.platformid = platformid;
    }

    /**
    * 获取-交易平台名称
    * @return platformname
     */
    public String getPlatformname() {
        return platformname;
    }

    /**
    * 设置-交易平台名称
    * @paramType java.lang.String
    * @param platformname - 交易平台名称
     */
    public void setPlatformname(String platformname) {
        this.platformname = platformname;
    }

    /**
    * 获取-回盘导入格式ID
    * @return inputformatid
     */
    public BigDecimal getInputformatid() {
        return inputformatid;
    }

    /**
    * 设置-回盘导入格式ID
    * @paramType java.math.BigDecimal
    * @param inputformatid - 回盘导入格式ID
     */
    public void setInputformatid(BigDecimal inputformatid) {
        this.inputformatid = inputformatid;
    }

    /**
    * 获取-出盘导出格式ID
    * @return outputformatid
     */
    public BigDecimal getOutputformatid() {
        return outputformatid;
    }

    /**
    * 设置-出盘导出格式ID
    * @paramType java.math.BigDecimal
    * @param outputformatid - 出盘导出格式ID
     */
    public void setOutputformatid(BigDecimal outputformatid) {
        this.outputformatid = outputformatid;
    }

    /**
    * 获取-0非银企直连 ,1银企直连,2现金
    * @return ifdirect
     */
    public String getIfdirect() {
        return ifdirect;
    }

    /**
    * 设置-0非银企直连 ,1银企直连,2现金
    * @paramType java.lang.String
    * @param ifdirect - 0非银企直连 ,1银企直连,2现金
     */
    public void setIfdirect(String ifdirect) {
        this.ifdirect = ifdirect;
    }

    /**
    * 获取-是否有效
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否有效
    * @paramType java.lang.String
    * @param ifvalid - 是否有效
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
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
    * 获取-盘片上限记录数
    * @return discmaxnum
     */
    public BigDecimal getDiscmaxnum() {
        return discmaxnum;
    }

    /**
    * 设置-盘片上限记录数
    * @paramType java.math.BigDecimal
    * @param discmaxnum - 盘片上限记录数
     */
    public void setDiscmaxnum(BigDecimal discmaxnum) {
        this.discmaxnum = discmaxnum;
    }

    /**
    * 获取-交易平台简称，用于生成凭证摘要时使用
    * @return shortname
     */
    public String getShortname() {
        return shortname;
    }

    /**
    * 设置-交易平台简称，用于生成凭证摘要时使用
    * @paramType java.lang.String
    * @param shortname - 交易平台简称，用于生成凭证摘要时使用
     */
    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    /**
    * 获取-授权文件格式
    * @return authorizationid
     */
    public BigDecimal getAuthorizationid() {
        return authorizationid;
    }

    /**
    * 设置-授权文件格式
    * @paramType java.math.BigDecimal
    * @param authorizationid - 授权文件格式
     */
    public void setAuthorizationid(BigDecimal authorizationid) {
        this.authorizationid = authorizationid;
    }

    /**
    * 获取-old交易平台唯一编码
    * @return oldplatformid
     */
    public String getOldplatformid() {
        return oldplatformid;
    }

    /**
    * 设置-old交易平台唯一编码
    * @paramType java.lang.String
    * @param oldplatformid - old交易平台唯一编码
     */
    public void setOldplatformid(String oldplatformid) {
        this.oldplatformid = oldplatformid;
    }
}