package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_invoice_backdetail_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmInvoiceBackdetailTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 接口主表流水单编号
     */
    private Long seqinvoice;

    /**
     * 发票行性质  0 正常行 1 折扣行 2 被折扣行
     */
    private BigDecimal fphxz;

    /**
     * 项目名称
     */
    private String xmmc;

    /**
     * 规格型号
     */
    private String ggxh;

    /**
     * 单位
     */
    private String dw;

    /**
     * 项目数量
     */
    private BigDecimal xmsl;

    /**
     * 项目单价
     */
    private BigDecimal xmdj;

    /**
     * 项目金额
     */
    private BigDecimal xmje;

    /**
     * 税率
     */
    private BigDecimal sl;

    /**
     * 税额
     */
    private BigDecimal se;

    /**
     * 含税标志 0 不含税 1 含税
     */
    private BigDecimal hsbz;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 手动修改记录
     */
    private String modifydesc;

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
    * 获取-接口主表流水单编号
    * @return seqinvoice
     */
    public Long getSeqinvoice() {
        return seqinvoice;
    }

    /**
    * 设置-接口主表流水单编号
    * @paramType java.lang.Long
    * @param seqinvoice - 接口主表流水单编号
     */
    public void setSeqinvoice(Long seqinvoice) {
        this.seqinvoice = seqinvoice;
    }

    /**
    * 获取-发票行性质  0 正常行 1 折扣行 2 被折扣行
    * @return fphxz
     */
    public BigDecimal getFphxz() {
        return fphxz;
    }

    /**
    * 设置-发票行性质  0 正常行 1 折扣行 2 被折扣行
    * @paramType java.math.BigDecimal
    * @param fphxz - 发票行性质  0 正常行 1 折扣行 2 被折扣行
     */
    public void setFphxz(BigDecimal fphxz) {
        this.fphxz = fphxz;
    }

    /**
    * 获取-项目名称
    * @return xmmc
     */
    public String getXmmc() {
        return xmmc;
    }

    /**
    * 设置-项目名称
    * @paramType java.lang.String
    * @param xmmc - 项目名称
     */
    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    /**
    * 获取-规格型号
    * @return ggxh
     */
    public String getGgxh() {
        return ggxh;
    }

    /**
    * 设置-规格型号
    * @paramType java.lang.String
    * @param ggxh - 规格型号
     */
    public void setGgxh(String ggxh) {
        this.ggxh = ggxh;
    }

    /**
    * 获取-单位
    * @return dw
     */
    public String getDw() {
        return dw;
    }

    /**
    * 设置-单位
    * @paramType java.lang.String
    * @param dw - 单位
     */
    public void setDw(String dw) {
        this.dw = dw;
    }

    /**
    * 获取-项目数量
    * @return xmsl
     */
    public BigDecimal getXmsl() {
        return xmsl;
    }

    /**
    * 设置-项目数量
    * @paramType java.math.BigDecimal
    * @param xmsl - 项目数量
     */
    public void setXmsl(BigDecimal xmsl) {
        this.xmsl = xmsl;
    }

    /**
    * 获取-项目单价
    * @return xmdj
     */
    public BigDecimal getXmdj() {
        return xmdj;
    }

    /**
    * 设置-项目单价
    * @paramType java.math.BigDecimal
    * @param xmdj - 项目单价
     */
    public void setXmdj(BigDecimal xmdj) {
        this.xmdj = xmdj;
    }

    /**
    * 获取-项目金额
    * @return xmje
     */
    public BigDecimal getXmje() {
        return xmje;
    }

    /**
    * 设置-项目金额
    * @paramType java.math.BigDecimal
    * @param xmje - 项目金额
     */
    public void setXmje(BigDecimal xmje) {
        this.xmje = xmje;
    }

    /**
    * 获取-税率
    * @return sl
     */
    public BigDecimal getSl() {
        return sl;
    }

    /**
    * 设置-税率
    * @paramType java.math.BigDecimal
    * @param sl - 税率
     */
    public void setSl(BigDecimal sl) {
        this.sl = sl;
    }

    /**
    * 获取-税额
    * @return se
     */
    public BigDecimal getSe() {
        return se;
    }

    /**
    * 设置-税额
    * @paramType java.math.BigDecimal
    * @param se - 税额
     */
    public void setSe(BigDecimal se) {
        this.se = se;
    }

    /**
    * 获取-含税标志 0 不含税 1 含税
    * @return hsbz
     */
    public BigDecimal getHsbz() {
        return hsbz;
    }

    /**
    * 设置-含税标志 0 不含税 1 含税
    * @paramType java.math.BigDecimal
    * @param hsbz - 含税标志 0 不含税 1 含税
     */
    public void setHsbz(BigDecimal hsbz) {
        this.hsbz = hsbz;
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
    * 获取-手动修改记录
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手动修改记录
    * @paramType java.lang.String
    * @param modifydesc - 手动修改记录
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }
}