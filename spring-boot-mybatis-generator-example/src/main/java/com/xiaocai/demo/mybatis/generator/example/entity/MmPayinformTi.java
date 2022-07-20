package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_payinform_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPayinformTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 被拆分接口表记录mm_policylist_ti的id
     */
    private Long seqpayinformti;

    /**
     * 关联字段，等于mm_policy_ti.id
     */
    private Long seqpayti;

    /**
     * 客户在银行的户名
     */
    private String custaccountname;

    /**
     * 客户账号
     */
    private String custaccountno;

    /**
     * 客户开户行名称
     */
    private String bankname;

    /**
     * 客户开户行代码
     */
    private String custbankno;

    /**
     * 客户开户行所在市
     */
    private String bankcity;

    /**
     * 客户开户行所在省份
     */
    private String bankprovince;

    /**
     * 客户开户行直联号
     */
    private String banktype;

    /**
     * 银行指令类型 0：公对私 1：公对公
     */
    private String ispaypublic;

    /**
     * 加急标志 0：普通（默认）1：加急
     */
    private String fastflag;

    /**
     * 短信通知标志 1:是 0：否
     */
    private String smsflag;

    /**
     * 客户手机号
     */
    private String mobilenumber;

    /**
     * 卡折标志 1:存折 2：借记卡 3：贷记卡 4：准贷记卡，默认借记卡
     */
    private String cardflag;

    /**
     * 客户电子邮箱
     */
    private String custemail;

    /**
     * 客户代理银行地址
     */
    private String custagebtbankname;

    /**
     * 客户银行在代理银行的账号
     */
    private String custagentbankaddr;

    /**
     * 客户在代理银行的账号
     */
    private String custagentaccountno;

    /**
     * 客户地址
     */
    private String custaddress;

    /**
     * 客户常驻国家名称
     */
    private String custcountryname;

    /**
     * 客户常驻国家代码
     */
    private String custcountrycode;

    /**
     * 卡户账户区域默认为0，0：国内 1：国外
     */
    private String custaccountarea;

    /**
     * 状态，1 初始状态 2落地成功 3落地失败
     */
    private String status;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后修改时间
     */
    private Date lastopdate;

    /**
     * hibernate版本号
     */
    private Integer hibernateversion;

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
    * 获取-被拆分接口表记录mm_policylist_ti的id
    * @return seqpayinformti
     */
    public Long getSeqpayinformti() {
        return seqpayinformti;
    }

    /**
    * 设置-被拆分接口表记录mm_policylist_ti的id
    * @paramType java.lang.Long
    * @param seqpayinformti - 被拆分接口表记录mm_policylist_ti的id
     */
    public void setSeqpayinformti(Long seqpayinformti) {
        this.seqpayinformti = seqpayinformti;
    }

    /**
    * 获取-关联字段，等于mm_policy_ti.id
    * @return seqpayti
     */
    public Long getSeqpayti() {
        return seqpayti;
    }

    /**
    * 设置-关联字段，等于mm_policy_ti.id
    * @paramType java.lang.Long
    * @param seqpayti - 关联字段，等于mm_policy_ti.id
     */
    public void setSeqpayti(Long seqpayti) {
        this.seqpayti = seqpayti;
    }

    /**
    * 获取-客户在银行的户名
    * @return custaccountname
     */
    public String getCustaccountname() {
        return custaccountname;
    }

    /**
    * 设置-客户在银行的户名
    * @paramType java.lang.String
    * @param custaccountname - 客户在银行的户名
     */
    public void setCustaccountname(String custaccountname) {
        this.custaccountname = custaccountname;
    }

    /**
    * 获取-客户账号
    * @return custaccountno
     */
    public String getCustaccountno() {
        return custaccountno;
    }

    /**
    * 设置-客户账号
    * @paramType java.lang.String
    * @param custaccountno - 客户账号
     */
    public void setCustaccountno(String custaccountno) {
        this.custaccountno = custaccountno;
    }

    /**
    * 获取-客户开户行名称
    * @return bankname
     */
    public String getBankname() {
        return bankname;
    }

    /**
    * 设置-客户开户行名称
    * @paramType java.lang.String
    * @param bankname - 客户开户行名称
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
    * 获取-客户开户行代码
    * @return custbankno
     */
    public String getCustbankno() {
        return custbankno;
    }

    /**
    * 设置-客户开户行代码
    * @paramType java.lang.String
    * @param custbankno - 客户开户行代码
     */
    public void setCustbankno(String custbankno) {
        this.custbankno = custbankno;
    }

    /**
    * 获取-客户开户行所在市
    * @return bankcity
     */
    public String getBankcity() {
        return bankcity;
    }

    /**
    * 设置-客户开户行所在市
    * @paramType java.lang.String
    * @param bankcity - 客户开户行所在市
     */
    public void setBankcity(String bankcity) {
        this.bankcity = bankcity;
    }

    /**
    * 获取-客户开户行所在省份
    * @return bankprovince
     */
    public String getBankprovince() {
        return bankprovince;
    }

    /**
    * 设置-客户开户行所在省份
    * @paramType java.lang.String
    * @param bankprovince - 客户开户行所在省份
     */
    public void setBankprovince(String bankprovince) {
        this.bankprovince = bankprovince;
    }

    /**
    * 获取-客户开户行直联号
    * @return banktype
     */
    public String getBanktype() {
        return banktype;
    }

    /**
    * 设置-客户开户行直联号
    * @paramType java.lang.String
    * @param banktype - 客户开户行直联号
     */
    public void setBanktype(String banktype) {
        this.banktype = banktype;
    }

    /**
    * 获取-银行指令类型 0：公对私 1：公对公
    * @return ispaypublic
     */
    public String getIspaypublic() {
        return ispaypublic;
    }

    /**
    * 设置-银行指令类型 0：公对私 1：公对公
    * @paramType java.lang.String
    * @param ispaypublic - 银行指令类型 0：公对私 1：公对公
     */
    public void setIspaypublic(String ispaypublic) {
        this.ispaypublic = ispaypublic;
    }

    /**
    * 获取-加急标志 0：普通（默认）1：加急
    * @return fastflag
     */
    public String getFastflag() {
        return fastflag;
    }

    /**
    * 设置-加急标志 0：普通（默认）1：加急
    * @paramType java.lang.String
    * @param fastflag - 加急标志 0：普通（默认）1：加急
     */
    public void setFastflag(String fastflag) {
        this.fastflag = fastflag;
    }

    /**
    * 获取-短信通知标志 1:是 0：否
    * @return smsflag
     */
    public String getSmsflag() {
        return smsflag;
    }

    /**
    * 设置-短信通知标志 1:是 0：否
    * @paramType java.lang.String
    * @param smsflag - 短信通知标志 1:是 0：否
     */
    public void setSmsflag(String smsflag) {
        this.smsflag = smsflag;
    }

    /**
    * 获取-客户手机号
    * @return mobilenumber
     */
    public String getMobilenumber() {
        return mobilenumber;
    }

    /**
    * 设置-客户手机号
    * @paramType java.lang.String
    * @param mobilenumber - 客户手机号
     */
    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    /**
    * 获取-卡折标志 1:存折 2：借记卡 3：贷记卡 4：准贷记卡，默认借记卡
    * @return cardflag
     */
    public String getCardflag() {
        return cardflag;
    }

    /**
    * 设置-卡折标志 1:存折 2：借记卡 3：贷记卡 4：准贷记卡，默认借记卡
    * @paramType java.lang.String
    * @param cardflag - 卡折标志 1:存折 2：借记卡 3：贷记卡 4：准贷记卡，默认借记卡
     */
    public void setCardflag(String cardflag) {
        this.cardflag = cardflag;
    }

    /**
    * 获取-客户电子邮箱
    * @return custemail
     */
    public String getCustemail() {
        return custemail;
    }

    /**
    * 设置-客户电子邮箱
    * @paramType java.lang.String
    * @param custemail - 客户电子邮箱
     */
    public void setCustemail(String custemail) {
        this.custemail = custemail;
    }

    /**
    * 获取-客户代理银行地址
    * @return custagebtbankname
     */
    public String getCustagebtbankname() {
        return custagebtbankname;
    }

    /**
    * 设置-客户代理银行地址
    * @paramType java.lang.String
    * @param custagebtbankname - 客户代理银行地址
     */
    public void setCustagebtbankname(String custagebtbankname) {
        this.custagebtbankname = custagebtbankname;
    }

    /**
    * 获取-客户银行在代理银行的账号
    * @return custagentbankaddr
     */
    public String getCustagentbankaddr() {
        return custagentbankaddr;
    }

    /**
    * 设置-客户银行在代理银行的账号
    * @paramType java.lang.String
    * @param custagentbankaddr - 客户银行在代理银行的账号
     */
    public void setCustagentbankaddr(String custagentbankaddr) {
        this.custagentbankaddr = custagentbankaddr;
    }

    /**
    * 获取-客户在代理银行的账号
    * @return custagentaccountno
     */
    public String getCustagentaccountno() {
        return custagentaccountno;
    }

    /**
    * 设置-客户在代理银行的账号
    * @paramType java.lang.String
    * @param custagentaccountno - 客户在代理银行的账号
     */
    public void setCustagentaccountno(String custagentaccountno) {
        this.custagentaccountno = custagentaccountno;
    }

    /**
    * 获取-客户地址
    * @return custaddress
     */
    public String getCustaddress() {
        return custaddress;
    }

    /**
    * 设置-客户地址
    * @paramType java.lang.String
    * @param custaddress - 客户地址
     */
    public void setCustaddress(String custaddress) {
        this.custaddress = custaddress;
    }

    /**
    * 获取-客户常驻国家名称
    * @return custcountryname
     */
    public String getCustcountryname() {
        return custcountryname;
    }

    /**
    * 设置-客户常驻国家名称
    * @paramType java.lang.String
    * @param custcountryname - 客户常驻国家名称
     */
    public void setCustcountryname(String custcountryname) {
        this.custcountryname = custcountryname;
    }

    /**
    * 获取-客户常驻国家代码
    * @return custcountrycode
     */
    public String getCustcountrycode() {
        return custcountrycode;
    }

    /**
    * 设置-客户常驻国家代码
    * @paramType java.lang.String
    * @param custcountrycode - 客户常驻国家代码
     */
    public void setCustcountrycode(String custcountrycode) {
        this.custcountrycode = custcountrycode;
    }

    /**
    * 获取-卡户账户区域默认为0，0：国内 1：国外
    * @return custaccountarea
     */
    public String getCustaccountarea() {
        return custaccountarea;
    }

    /**
    * 设置-卡户账户区域默认为0，0：国内 1：国外
    * @paramType java.lang.String
    * @param custaccountarea - 卡户账户区域默认为0，0：国内 1：国外
     */
    public void setCustaccountarea(String custaccountarea) {
        this.custaccountarea = custaccountarea;
    }

    /**
    * 获取-状态，1 初始状态 2落地成功 3落地失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态，1 初始状态 2落地成功 3落地失败
    * @paramType java.lang.String
    * @param status - 状态，1 初始状态 2落地成功 3落地失败
     */
    public void setStatus(String status) {
        this.status = status;
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
    * 获取-hibernate版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-hibernate版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - hibernate版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }
}