package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_invatinvoicedetail_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmInvatinvoicedetailTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 和主表关联键
     */
    private Long seqinvoicedetail;

    /**
     * 发票上的货物或应税劳务、服务名称
     */
    private String taxitem;

    /**
     * 规格型号
     */
    private String model;

    /**
     * 单位
     */
    private String company;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 数量
     */
    private Long vnum;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 税率
     */
    private BigDecimal taxesrate;

    /**
     * 税额
     */
    private BigDecimal taxesamount;

    /**
     * 描述
     */
    private String modifydesc;

    /**
     * 01-货物及加工、修理修配劳务的进项,02-运输服务的进项,03-电信服务的进项,04-建筑安装服务的进项,05-金融保险服务的进项,06-有形动产租赁的进项,07-有形动产租赁服务的进项,08-不动产租赁服务的进项,09-取得无形资产,10-受让土地使用权的进项,11-生活服务的进项,12-用于购建不动产并一次性抵扣的进项,13-通行费的进项,14-其他的进项 
     */
    private String indetail;

    /**
     * 0：固定资产,1：不动产,2：无形资产,3：其他非资产,4：首次购买税控专用设备,5：税控专用设备技术维护费
     */
    private String dectype;

    /**
     * 0:可抵扣,1:不可抵扣,2：无法划分,3：视同销售
     */
    private String dkstatus;

    /**
     * 系统来源：,XSZC 销管,DZGL 单管,AUTOUW 车承保,AUTOCLAIM 车理赔,CLAIM 非车理赔,UNDERWRITING 非车承保，ISoftStone_RI 再保，ecargo ecargo 
     */
    private String srcflag;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 备注
     */
    private String reserve1;

    /**
     * 备注
     */
    private String reserve2;

    /**
     * 备注
     */
    private String reserve3;

    /**
     * 备注
     */
    private Date reserve4;

    /**
     * 版本号
     */
    private String hibernateversion;

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
    * 获取-和主表关联键
    * @return seqinvoicedetail
     */
    public Long getSeqinvoicedetail() {
        return seqinvoicedetail;
    }

    /**
    * 设置-和主表关联键
    * @paramType java.lang.Long
    * @param seqinvoicedetail - 和主表关联键
     */
    public void setSeqinvoicedetail(Long seqinvoicedetail) {
        this.seqinvoicedetail = seqinvoicedetail;
    }

    /**
    * 获取-发票上的货物或应税劳务、服务名称
    * @return taxitem
     */
    public String getTaxitem() {
        return taxitem;
    }

    /**
    * 设置-发票上的货物或应税劳务、服务名称
    * @paramType java.lang.String
    * @param taxitem - 发票上的货物或应税劳务、服务名称
     */
    public void setTaxitem(String taxitem) {
        this.taxitem = taxitem;
    }

    /**
    * 获取-规格型号
    * @return model
     */
    public String getModel() {
        return model;
    }

    /**
    * 设置-规格型号
    * @paramType java.lang.String
    * @param model - 规格型号
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
    * 获取-单位
    * @return company
     */
    public String getCompany() {
        return company;
    }

    /**
    * 设置-单位
    * @paramType java.lang.String
    * @param company - 单位
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
    * 获取-单价
    * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
    * 设置-单价
    * @paramType java.math.BigDecimal
    * @param price - 单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
    * 获取-数量
    * @return vnum
     */
    public Long getVnum() {
        return vnum;
    }

    /**
    * 设置-数量
    * @paramType java.lang.Long
    * @param vnum - 数量
     */
    public void setVnum(Long vnum) {
        this.vnum = vnum;
    }

    /**
    * 获取-金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-金额
    * @paramType java.math.BigDecimal
    * @param amount - 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-税率
    * @return taxesrate
     */
    public BigDecimal getTaxesrate() {
        return taxesrate;
    }

    /**
    * 设置-税率
    * @paramType java.math.BigDecimal
    * @param taxesrate - 税率
     */
    public void setTaxesrate(BigDecimal taxesrate) {
        this.taxesrate = taxesrate;
    }

    /**
    * 获取-税额
    * @return taxesamount
     */
    public BigDecimal getTaxesamount() {
        return taxesamount;
    }

    /**
    * 设置-税额
    * @paramType java.math.BigDecimal
    * @param taxesamount - 税额
     */
    public void setTaxesamount(BigDecimal taxesamount) {
        this.taxesamount = taxesamount;
    }

    /**
    * 获取-描述
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-描述
    * @paramType java.lang.String
    * @param modifydesc - 描述
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-01-货物及加工、修理修配劳务的进项,02-运输服务的进项,03-电信服务的进项,04-建筑安装服务的进项,05-金融保险服务的进项,06-有形动产租赁的进项,07-有形动产租赁服务的进项,08-不动产租赁服务的进项,09-取得无形资产,10-受让土地使用权的进项,11-生活服务的进项,12-用于购建不动产并一次性抵扣的进项,13-通行费的进项,14-其他的进项 
    * @return indetail
     */
    public String getIndetail() {
        return indetail;
    }

    /**
    * 设置-01-货物及加工、修理修配劳务的进项,02-运输服务的进项,03-电信服务的进项,04-建筑安装服务的进项,05-金融保险服务的进项,06-有形动产租赁的进项,07-有形动产租赁服务的进项,08-不动产租赁服务的进项,09-取得无形资产,10-受让土地使用权的进项,11-生活服务的进项,12-用于购建不动产并一次性抵扣的进项,13-通行费的进项,14-其他的进项 
    * @paramType java.lang.String
    * @param indetail - 01-货物及加工、修理修配劳务的进项,02-运输服务的进项,03-电信服务的进项,04-建筑安装服务的进项,05-金融保险服务的进项,06-有形动产租赁的进项,07-有形动产租赁服务的进项,08-不动产租赁服务的进项,09-取得无形资产,10-受让土地使用权的进项,11-生活服务的进项,12-用于购建不动产并一次性抵扣的进项,13-通行费的进项,14-其他的进项 
     */
    public void setIndetail(String indetail) {
        this.indetail = indetail;
    }

    /**
    * 获取-0：固定资产,1：不动产,2：无形资产,3：其他非资产,4：首次购买税控专用设备,5：税控专用设备技术维护费
    * @return dectype
     */
    public String getDectype() {
        return dectype;
    }

    /**
    * 设置-0：固定资产,1：不动产,2：无形资产,3：其他非资产,4：首次购买税控专用设备,5：税控专用设备技术维护费
    * @paramType java.lang.String
    * @param dectype - 0：固定资产,1：不动产,2：无形资产,3：其他非资产,4：首次购买税控专用设备,5：税控专用设备技术维护费
     */
    public void setDectype(String dectype) {
        this.dectype = dectype;
    }

    /**
    * 获取-0:可抵扣,1:不可抵扣,2：无法划分,3：视同销售
    * @return dkstatus
     */
    public String getDkstatus() {
        return dkstatus;
    }

    /**
    * 设置-0:可抵扣,1:不可抵扣,2：无法划分,3：视同销售
    * @paramType java.lang.String
    * @param dkstatus - 0:可抵扣,1:不可抵扣,2：无法划分,3：视同销售
     */
    public void setDkstatus(String dkstatus) {
        this.dkstatus = dkstatus;
    }

    /**
    * 获取-系统来源：,XSZC 销管,DZGL 单管,AUTOUW 车承保,AUTOCLAIM 车理赔,CLAIM 非车理赔,UNDERWRITING 非车承保，ISoftStone_RI 再保，ecargo ecargo 
    * @return srcflag
     */
    public String getSrcflag() {
        return srcflag;
    }

    /**
    * 设置-系统来源：,XSZC 销管,DZGL 单管,AUTOUW 车承保,AUTOCLAIM 车理赔,CLAIM 非车理赔,UNDERWRITING 非车承保，ISoftStone_RI 再保，ecargo ecargo 
    * @paramType java.lang.String
    * @param srcflag - 系统来源：,XSZC 销管,DZGL 单管,AUTOUW 车承保,AUTOCLAIM 车理赔,CLAIM 非车理赔,UNDERWRITING 非车承保，ISoftStone_RI 再保，ecargo ecargo 
     */
    public void setSrcflag(String srcflag) {
        this.srcflag = srcflag;
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
    * 获取-备注
    * @return reserve1
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param reserve1 - 备注
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    /**
    * 获取-备注
    * @return reserve2
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param reserve2 - 备注
     */
    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

    /**
    * 获取-备注
    * @return reserve3
     */
    public String getReserve3() {
        return reserve3;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param reserve3 - 备注
     */
    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3;
    }

    /**
    * 获取-备注
    * @return reserve4
     */
    public Date getReserve4() {
        return reserve4;
    }

    /**
    * 设置-备注
    * @paramType java.util.Date
    * @param reserve4 - 备注
     */
    public void setReserve4(Date reserve4) {
        this.reserve4 = reserve4;
    }

    /**
    * 获取-版本号
    * @return hibernateversion
     */
    public String getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本号
    * @paramType java.lang.String
    * @param hibernateversion - 版本号
     */
    public void setHibernateversion(String hibernateversion) {
        this.hibernateversion = hibernateversion;
    }
}