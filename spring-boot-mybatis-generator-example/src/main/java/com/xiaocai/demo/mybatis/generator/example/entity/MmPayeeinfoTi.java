package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_payeeinfo_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPayeeinfoTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 数据源
     */
    private String datasource;

    /**
     * 业务类型
     */
    private String certitype;

    /**
     * 业务数据主键
     */
    private String custseq;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 支付申请号
     */
    private String inpaymentno;

    /**
     * 赔案号
     */
    private String claimno;

    /**
     * 批量处理号
     */
    private String summaryno;

    /**
     * 客户代码
     */
    private String customercode;

    /**
     * 客户名称
     */
    private String customername;

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
     * 客户开户行代码（开户行联行号）
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
     * 银行指令类型1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口)
     */
    private String ispaypublic;

    /**
     * 客户手机号
     */
    private String mobilenumber;

    /**
     * 指定收付方式
     */
    private String inpaymentmethod;

    /**
     * 例外状态
     */
    private String exstatus;

    /**
     * 例外原因
     */
    private String exceptioncause;

    /**
     * 业务系统对结算信息的额外描述。由前端录入。
     */
    private String description;

    /**
     * 业务系统发起时间
     */
    private Date optime;

    /**
     * 加急标志。  "0 - 普通 1 - 加急"
     */
    private String fastflag;

    /**
     * 卡折标志(1:存折 2：借记卡 3：贷记卡 4：准贷记卡，默认借记卡)
     */
    private String cardflag;

    /**
     * 证件类型
     */
    private String certificatetype;

    /**
     * 证件号
     */
    private String certificateno;

    /**
     * 客户电子邮箱
     */
    private String custemail;

    /**
     * 短信通知标志
     */
    private String smsflag;

    /**
     * 客户代理银行名称
     */
    private String custagentbankname;

    /**
     * 客户代理银行地址
     */
    private String custagentbankaddr;

    /**
     * 客户银行在代理银行的帐号
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
     * 1.初始状态,2落地成功,3.落地失败.
     */
    private String status;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 客户账户区域，转账付款必填，默认为0。0 - 国内 1 - 国外
     */
    private String custaccountarea;

    /**
     * 客户银行地址，境外汇款时使用
     */
    private String custbankaddr;

    /**
     * Swift Code：即国际银行代码，境外汇款时使用
     */
    private String custbankswiftcode;

    /**
     * 国内外费用承担：1汇款人OUR、2收款人BEN、3共同SHA
     */
    private String custchargetype;

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
    * 获取-数据源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-数据源
    * @paramType java.lang.String
    * @param datasource - 数据源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-业务类型
    * @return certitype
     */
    public String getCertitype() {
        return certitype;
    }

    /**
    * 设置-业务类型
    * @paramType java.lang.String
    * @param certitype - 业务类型
     */
    public void setCertitype(String certitype) {
        this.certitype = certitype;
    }

    /**
    * 获取-业务数据主键
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-业务数据主键
    * @paramType java.lang.String
    * @param custseq - 业务数据主键
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
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
    * 获取-支付申请号
    * @return inpaymentno
     */
    public String getInpaymentno() {
        return inpaymentno;
    }

    /**
    * 设置-支付申请号
    * @paramType java.lang.String
    * @param inpaymentno - 支付申请号
     */
    public void setInpaymentno(String inpaymentno) {
        this.inpaymentno = inpaymentno;
    }

    /**
    * 获取-赔案号
    * @return claimno
     */
    public String getClaimno() {
        return claimno;
    }

    /**
    * 设置-赔案号
    * @paramType java.lang.String
    * @param claimno - 赔案号
     */
    public void setClaimno(String claimno) {
        this.claimno = claimno;
    }

    /**
    * 获取-批量处理号
    * @return summaryno
     */
    public String getSummaryno() {
        return summaryno;
    }

    /**
    * 设置-批量处理号
    * @paramType java.lang.String
    * @param summaryno - 批量处理号
     */
    public void setSummaryno(String summaryno) {
        this.summaryno = summaryno;
    }

    /**
    * 获取-客户代码
    * @return customercode
     */
    public String getCustomercode() {
        return customercode;
    }

    /**
    * 设置-客户代码
    * @paramType java.lang.String
    * @param customercode - 客户代码
     */
    public void setCustomercode(String customercode) {
        this.customercode = customercode;
    }

    /**
    * 获取-客户名称
    * @return customername
     */
    public String getCustomername() {
        return customername;
    }

    /**
    * 设置-客户名称
    * @paramType java.lang.String
    * @param customername - 客户名称
     */
    public void setCustomername(String customername) {
        this.customername = customername;
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
    * 获取-客户开户行代码（开户行联行号）
    * @return custbankno
     */
    public String getCustbankno() {
        return custbankno;
    }

    /**
    * 设置-客户开户行代码（开户行联行号）
    * @paramType java.lang.String
    * @param custbankno - 客户开户行代码（开户行联行号）
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
    * 获取-银行指令类型1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口)
    * @return ispaypublic
     */
    public String getIspaypublic() {
        return ispaypublic;
    }

    /**
    * 设置-银行指令类型1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口)
    * @paramType java.lang.String
    * @param ispaypublic - 银行指令类型1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口)
     */
    public void setIspaypublic(String ispaypublic) {
        this.ispaypublic = ispaypublic;
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
    * 获取-指定收付方式
    * @return inpaymentmethod
     */
    public String getInpaymentmethod() {
        return inpaymentmethod;
    }

    /**
    * 设置-指定收付方式
    * @paramType java.lang.String
    * @param inpaymentmethod - 指定收付方式
     */
    public void setInpaymentmethod(String inpaymentmethod) {
        this.inpaymentmethod = inpaymentmethod;
    }

    /**
    * 获取-例外状态
    * @return exstatus
     */
    public String getExstatus() {
        return exstatus;
    }

    /**
    * 设置-例外状态
    * @paramType java.lang.String
    * @param exstatus - 例外状态
     */
    public void setExstatus(String exstatus) {
        this.exstatus = exstatus;
    }

    /**
    * 获取-例外原因
    * @return exceptioncause
     */
    public String getExceptioncause() {
        return exceptioncause;
    }

    /**
    * 设置-例外原因
    * @paramType java.lang.String
    * @param exceptioncause - 例外原因
     */
    public void setExceptioncause(String exceptioncause) {
        this.exceptioncause = exceptioncause;
    }

    /**
    * 获取-业务系统对结算信息的额外描述。由前端录入。
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-业务系统对结算信息的额外描述。由前端录入。
    * @paramType java.lang.String
    * @param description - 业务系统对结算信息的额外描述。由前端录入。
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    * 获取-业务系统发起时间
    * @return optime
     */
    public Date getOptime() {
        return optime;
    }

    /**
    * 设置-业务系统发起时间
    * @paramType java.util.Date
    * @param optime - 业务系统发起时间
     */
    public void setOptime(Date optime) {
        this.optime = optime;
    }

    /**
    * 获取-加急标志。  "0 - 普通 1 - 加急"
    * @return fastflag
     */
    public String getFastflag() {
        return fastflag;
    }

    /**
    * 设置-加急标志。  "0 - 普通 1 - 加急"
    * @paramType java.lang.String
    * @param fastflag - 加急标志。  "0 - 普通 1 - 加急"
     */
    public void setFastflag(String fastflag) {
        this.fastflag = fastflag;
    }

    /**
    * 获取-卡折标志(1:存折 2：借记卡 3：贷记卡 4：准贷记卡，默认借记卡)
    * @return cardflag
     */
    public String getCardflag() {
        return cardflag;
    }

    /**
    * 设置-卡折标志(1:存折 2：借记卡 3：贷记卡 4：准贷记卡，默认借记卡)
    * @paramType java.lang.String
    * @param cardflag - 卡折标志(1:存折 2：借记卡 3：贷记卡 4：准贷记卡，默认借记卡)
     */
    public void setCardflag(String cardflag) {
        this.cardflag = cardflag;
    }

    /**
    * 获取-证件类型
    * @return certificatetype
     */
    public String getCertificatetype() {
        return certificatetype;
    }

    /**
    * 设置-证件类型
    * @paramType java.lang.String
    * @param certificatetype - 证件类型
     */
    public void setCertificatetype(String certificatetype) {
        this.certificatetype = certificatetype;
    }

    /**
    * 获取-证件号
    * @return certificateno
     */
    public String getCertificateno() {
        return certificateno;
    }

    /**
    * 设置-证件号
    * @paramType java.lang.String
    * @param certificateno - 证件号
     */
    public void setCertificateno(String certificateno) {
        this.certificateno = certificateno;
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
    * 获取-短信通知标志
    * @return smsflag
     */
    public String getSmsflag() {
        return smsflag;
    }

    /**
    * 设置-短信通知标志
    * @paramType java.lang.String
    * @param smsflag - 短信通知标志
     */
    public void setSmsflag(String smsflag) {
        this.smsflag = smsflag;
    }

    /**
    * 获取-客户代理银行名称
    * @return custagentbankname
     */
    public String getCustagentbankname() {
        return custagentbankname;
    }

    /**
    * 设置-客户代理银行名称
    * @paramType java.lang.String
    * @param custagentbankname - 客户代理银行名称
     */
    public void setCustagentbankname(String custagentbankname) {
        this.custagentbankname = custagentbankname;
    }

    /**
    * 获取-客户代理银行地址
    * @return custagentbankaddr
     */
    public String getCustagentbankaddr() {
        return custagentbankaddr;
    }

    /**
    * 设置-客户代理银行地址
    * @paramType java.lang.String
    * @param custagentbankaddr - 客户代理银行地址
     */
    public void setCustagentbankaddr(String custagentbankaddr) {
        this.custagentbankaddr = custagentbankaddr;
    }

    /**
    * 获取-客户银行在代理银行的帐号
    * @return custagentaccountno
     */
    public String getCustagentaccountno() {
        return custagentaccountno;
    }

    /**
    * 设置-客户银行在代理银行的帐号
    * @paramType java.lang.String
    * @param custagentaccountno - 客户银行在代理银行的帐号
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
    * 获取-1.初始状态,2落地成功,3.落地失败.
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-1.初始状态,2落地成功,3.落地失败.
    * @paramType java.lang.String
    * @param status - 1.初始状态,2落地成功,3.落地失败.
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
    * 获取-客户账户区域，转账付款必填，默认为0。0 - 国内 1 - 国外
    * @return custaccountarea
     */
    public String getCustaccountarea() {
        return custaccountarea;
    }

    /**
    * 设置-客户账户区域，转账付款必填，默认为0。0 - 国内 1 - 国外
    * @paramType java.lang.String
    * @param custaccountarea - 客户账户区域，转账付款必填，默认为0。0 - 国内 1 - 国外
     */
    public void setCustaccountarea(String custaccountarea) {
        this.custaccountarea = custaccountarea;
    }

    /**
    * 获取-客户银行地址，境外汇款时使用
    * @return custbankaddr
     */
    public String getCustbankaddr() {
        return custbankaddr;
    }

    /**
    * 设置-客户银行地址，境外汇款时使用
    * @paramType java.lang.String
    * @param custbankaddr - 客户银行地址，境外汇款时使用
     */
    public void setCustbankaddr(String custbankaddr) {
        this.custbankaddr = custbankaddr;
    }

    /**
    * 获取-Swift Code：即国际银行代码，境外汇款时使用
    * @return custbankswiftcode
     */
    public String getCustbankswiftcode() {
        return custbankswiftcode;
    }

    /**
    * 设置-Swift Code：即国际银行代码，境外汇款时使用
    * @paramType java.lang.String
    * @param custbankswiftcode - Swift Code：即国际银行代码，境外汇款时使用
     */
    public void setCustbankswiftcode(String custbankswiftcode) {
        this.custbankswiftcode = custbankswiftcode;
    }

    /**
    * 获取-国内外费用承担：1汇款人OUR、2收款人BEN、3共同SHA
    * @return custchargetype
     */
    public String getCustchargetype() {
        return custchargetype;
    }

    /**
    * 设置-国内外费用承担：1汇款人OUR、2收款人BEN、3共同SHA
    * @paramType java.lang.String
    * @param custchargetype - 国内外费用承担：1汇款人OUR、2收款人BEN、3共同SHA
     */
    public void setCustchargetype(String custchargetype) {
        this.custchargetype = custchargetype;
    }
}