package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_taxesinfo_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTaxesinfoTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 唯一流水号
     */
    private String custseq;

    /**
     * 1修改纳税人信息
     */
    private String datatype;

    /**
     * 数据来源
     */
    private String datasource;

    /**
     * 纳税人代码
     */
    private String taxpayercode;

    /**
     * 纳税人名称
     */
    private String taxpayername;

    /**
     * 纳税人识别号
     */
    private String taxpayer;

    /**
     * 纳税人地址
     */
    private String taxesaddress;

    /**
     * 纳税人电话
     */
    private String taxesphone;

    /**
     * 纳税人手机号
     */
    private String taxesmobilephone;

    /**
     * 纳税人邮箱
     */
    private String taxesemail;

    /**
     * 纳税人开户银行
     */
    private String taxesbankname;

    /**
     * 纳税人开户银行账号
     */
    private String taxesaccountno;

    /**
     * 纳税人身份：01增值税一般纳税人 02增值税小规模纳税人 03非增值税纳税人 04个人 05其他
     */
    private String taxespayertype;

    /**
     * 纳税人证件类型 01身份证、02护照、03军官证、04士兵证、05港澳居民来往内地通行证、06台湾居民来往大陆通行证、07其他
     */
    private String taxescertificatetype;

    /**
     * 纳税人证件号
     */
    private String taxescertificateno;

    /**
     * 开具发票类型：004增值税专用发票 007增值税普通发票 026电子发票 000其他或暂不开票
     */
    private String invoicetype;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后修改时间
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 0初始；2成功；3失败
     */
    private String status;

    /**
     * 备注
     */
    private String description;

    /**
     * 错误代码
     */
    private String returncode;

    /**
     * 错误信息
     */
    private String returnmssage;

    /**
     * 发票备注信息
     */
    private String invoiceremark;

    /**
     * 指令类型 1-修改开票信息,2-新增开票信息
     */
    private String optype;

    /**
     * 开票要素ID
     */
    private String informid;

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
    * 获取-保单号
    * @return policyno
     */
    public String getPolicyno() {
        return policyno;
    }

    /**
    * 设置-保单号
    * @paramType java.lang.String
    * @param policyno - 保单号
     */
    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    /**
    * 获取-批单号
    * @return endorseno
     */
    public String getEndorseno() {
        return endorseno;
    }

    /**
    * 设置-批单号
    * @paramType java.lang.String
    * @param endorseno - 批单号
     */
    public void setEndorseno(String endorseno) {
        this.endorseno = endorseno;
    }

    /**
    * 获取-唯一流水号
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-唯一流水号
    * @paramType java.lang.String
    * @param custseq - 唯一流水号
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
    }

    /**
    * 获取-1修改纳税人信息
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-1修改纳税人信息
    * @paramType java.lang.String
    * @param datatype - 1修改纳税人信息
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    /**
    * 获取-数据来源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-数据来源
    * @paramType java.lang.String
    * @param datasource - 数据来源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-纳税人代码
    * @return taxpayercode
     */
    public String getTaxpayercode() {
        return taxpayercode;
    }

    /**
    * 设置-纳税人代码
    * @paramType java.lang.String
    * @param taxpayercode - 纳税人代码
     */
    public void setTaxpayercode(String taxpayercode) {
        this.taxpayercode = taxpayercode;
    }

    /**
    * 获取-纳税人名称
    * @return taxpayername
     */
    public String getTaxpayername() {
        return taxpayername;
    }

    /**
    * 设置-纳税人名称
    * @paramType java.lang.String
    * @param taxpayername - 纳税人名称
     */
    public void setTaxpayername(String taxpayername) {
        this.taxpayername = taxpayername;
    }

    /**
    * 获取-纳税人识别号
    * @return taxpayer
     */
    public String getTaxpayer() {
        return taxpayer;
    }

    /**
    * 设置-纳税人识别号
    * @paramType java.lang.String
    * @param taxpayer - 纳税人识别号
     */
    public void setTaxpayer(String taxpayer) {
        this.taxpayer = taxpayer;
    }

    /**
    * 获取-纳税人地址
    * @return taxesaddress
     */
    public String getTaxesaddress() {
        return taxesaddress;
    }

    /**
    * 设置-纳税人地址
    * @paramType java.lang.String
    * @param taxesaddress - 纳税人地址
     */
    public void setTaxesaddress(String taxesaddress) {
        this.taxesaddress = taxesaddress;
    }

    /**
    * 获取-纳税人电话
    * @return taxesphone
     */
    public String getTaxesphone() {
        return taxesphone;
    }

    /**
    * 设置-纳税人电话
    * @paramType java.lang.String
    * @param taxesphone - 纳税人电话
     */
    public void setTaxesphone(String taxesphone) {
        this.taxesphone = taxesphone;
    }

    /**
    * 获取-纳税人手机号
    * @return taxesmobilephone
     */
    public String getTaxesmobilephone() {
        return taxesmobilephone;
    }

    /**
    * 设置-纳税人手机号
    * @paramType java.lang.String
    * @param taxesmobilephone - 纳税人手机号
     */
    public void setTaxesmobilephone(String taxesmobilephone) {
        this.taxesmobilephone = taxesmobilephone;
    }

    /**
    * 获取-纳税人邮箱
    * @return taxesemail
     */
    public String getTaxesemail() {
        return taxesemail;
    }

    /**
    * 设置-纳税人邮箱
    * @paramType java.lang.String
    * @param taxesemail - 纳税人邮箱
     */
    public void setTaxesemail(String taxesemail) {
        this.taxesemail = taxesemail;
    }

    /**
    * 获取-纳税人开户银行
    * @return taxesbankname
     */
    public String getTaxesbankname() {
        return taxesbankname;
    }

    /**
    * 设置-纳税人开户银行
    * @paramType java.lang.String
    * @param taxesbankname - 纳税人开户银行
     */
    public void setTaxesbankname(String taxesbankname) {
        this.taxesbankname = taxesbankname;
    }

    /**
    * 获取-纳税人开户银行账号
    * @return taxesaccountno
     */
    public String getTaxesaccountno() {
        return taxesaccountno;
    }

    /**
    * 设置-纳税人开户银行账号
    * @paramType java.lang.String
    * @param taxesaccountno - 纳税人开户银行账号
     */
    public void setTaxesaccountno(String taxesaccountno) {
        this.taxesaccountno = taxesaccountno;
    }

    /**
    * 获取-纳税人身份：01增值税一般纳税人 02增值税小规模纳税人 03非增值税纳税人 04个人 05其他
    * @return taxespayertype
     */
    public String getTaxespayertype() {
        return taxespayertype;
    }

    /**
    * 设置-纳税人身份：01增值税一般纳税人 02增值税小规模纳税人 03非增值税纳税人 04个人 05其他
    * @paramType java.lang.String
    * @param taxespayertype - 纳税人身份：01增值税一般纳税人 02增值税小规模纳税人 03非增值税纳税人 04个人 05其他
     */
    public void setTaxespayertype(String taxespayertype) {
        this.taxespayertype = taxespayertype;
    }

    /**
    * 获取-纳税人证件类型 01身份证、02护照、03军官证、04士兵证、05港澳居民来往内地通行证、06台湾居民来往大陆通行证、07其他
    * @return taxescertificatetype
     */
    public String getTaxescertificatetype() {
        return taxescertificatetype;
    }

    /**
    * 设置-纳税人证件类型 01身份证、02护照、03军官证、04士兵证、05港澳居民来往内地通行证、06台湾居民来往大陆通行证、07其他
    * @paramType java.lang.String
    * @param taxescertificatetype - 纳税人证件类型 01身份证、02护照、03军官证、04士兵证、05港澳居民来往内地通行证、06台湾居民来往大陆通行证、07其他
     */
    public void setTaxescertificatetype(String taxescertificatetype) {
        this.taxescertificatetype = taxescertificatetype;
    }

    /**
    * 获取-纳税人证件号
    * @return taxescertificateno
     */
    public String getTaxescertificateno() {
        return taxescertificateno;
    }

    /**
    * 设置-纳税人证件号
    * @paramType java.lang.String
    * @param taxescertificateno - 纳税人证件号
     */
    public void setTaxescertificateno(String taxescertificateno) {
        this.taxescertificateno = taxescertificateno;
    }

    /**
    * 获取-开具发票类型：004增值税专用发票 007增值税普通发票 026电子发票 000其他或暂不开票
    * @return invoicetype
     */
    public String getInvoicetype() {
        return invoicetype;
    }

    /**
    * 设置-开具发票类型：004增值税专用发票 007增值税普通发票 026电子发票 000其他或暂不开票
    * @paramType java.lang.String
    * @param invoicetype - 开具发票类型：004增值税专用发票 007增值税普通发票 026电子发票 000其他或暂不开票
     */
    public void setInvoicetype(String invoicetype) {
        this.invoicetype = invoicetype;
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
    * 获取-最后修改时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后修改时间
    * @paramType java.util.Date
    * @param lastopdate - 最后修改时间
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
    * 获取-0初始；2成功；3失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-0初始；2成功；3失败
    * @paramType java.lang.String
    * @param status - 0初始；2成功；3失败
     */
    public void setStatus(String status) {
        this.status = status;
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

    /**
    * 获取-错误代码
    * @return returncode
     */
    public String getReturncode() {
        return returncode;
    }

    /**
    * 设置-错误代码
    * @paramType java.lang.String
    * @param returncode - 错误代码
     */
    public void setReturncode(String returncode) {
        this.returncode = returncode;
    }

    /**
    * 获取-错误信息
    * @return returnmssage
     */
    public String getReturnmssage() {
        return returnmssage;
    }

    /**
    * 设置-错误信息
    * @paramType java.lang.String
    * @param returnmssage - 错误信息
     */
    public void setReturnmssage(String returnmssage) {
        this.returnmssage = returnmssage;
    }

    /**
    * 获取-发票备注信息
    * @return invoiceremark
     */
    public String getInvoiceremark() {
        return invoiceremark;
    }

    /**
    * 设置-发票备注信息
    * @paramType java.lang.String
    * @param invoiceremark - 发票备注信息
     */
    public void setInvoiceremark(String invoiceremark) {
        this.invoiceremark = invoiceremark;
    }

    /**
    * 获取-指令类型 1-修改开票信息,2-新增开票信息
    * @return optype
     */
    public String getOptype() {
        return optype;
    }

    /**
    * 设置-指令类型 1-修改开票信息,2-新增开票信息
    * @paramType java.lang.String
    * @param optype - 指令类型 1-修改开票信息,2-新增开票信息
     */
    public void setOptype(String optype) {
        this.optype = optype;
    }

    /**
    * 获取-开票要素ID
    * @return informid
     */
    public String getInformid() {
        return informid;
    }

    /**
    * 设置-开票要素ID
    * @paramType java.lang.String
    * @param informid - 开票要素ID
     */
    public void setInformid(String informid) {
        this.informid = informid;
    }
}