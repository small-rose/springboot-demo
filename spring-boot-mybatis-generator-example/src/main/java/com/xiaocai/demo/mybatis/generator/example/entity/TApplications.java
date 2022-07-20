package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : t_applications
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class TApplications {
    /**
     * 支付申请号
     */
    private String applyno;

    /**
     * 支付号对应的收款金额
     */
    private String amount;

    /**
     * 支付号对应的校验码长度最多8位
     */
    private String checkCode;

    /**
     * 备注信息可用于描述一些有数据维护修改单的修改数据备注，也可用于描述撤销支付号原因
     */
    private String remark;

    /**
     * 保险商户号
     */
    private String insuMidno;

    /**
     * 对应支票支付方式的支票操作员姓名
     */
    private String opcode;

    /**
     * 对应支票支付方式支付确认用户密码
     */
    private String oppw;

    /**
     * I:初始化  C:处理完  G:撤销  F:处理失败  9:待审核
     */
    private String status;

    /**
     * 系统最后操作时间
     */
    private Date timestamp;

    /**
     * 系统内部交易流水号
     */
    private String tano;

    /**
     * 支付申请用户对应提供给各业务系统的用户名
     */
    private String userid;

    /**
     * 银行每次查询该值加1，针对银行已经查询过的申请不能撤销。
     */
    private BigDecimal checkcount;

    /**
     * 识别号，用于校验消费时对应的终端号。
     */
    private String recognitionid;

    /**
     * 支付类型：1为人 工确认到账，2为自动确认到账
     */
    private String paytype;

    /**
     * 业务系统补录的支票号
     */
    private String checkno;

    /**
     * 支票流水号
     */
    private String checkserral;

    /**
     * 用于校验是否允许消费，最迟消费时间需要在起保前10分钟
     */
    private String policystartdate;

    /**
     * 7位分公司简码
     */
    private String subcompany;

    /**
     * 支付号对应的支付币种
     */
    private String currencytype;

    /**
     * 超过正常起保时间后的消费时间
     */
    private String paranormalday;

    /**
     * 被保险人名称
     */
    private String insuredname;

    /**
     * 业务归属部门
     */
    private String departmentcode;

    /**
     * 客户在银行的户名
     */
    private String custaccountname;

    /**
     * 客户开户行账号
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
     * 银行指令类型1：公对公 2：公对私
     */
    private String ispaypublic;

    /**
     * 扣款业务时使用，客户的手机号（江苏车承保投保人手机号码字段传此值）
     */
    private String mobilenumber;

    /**
     * 客户账户的卡折类型：1 存折、2 借记卡、3 贷记卡、4准贷记卡
     */
    private String cardflag;

    /**
     * 证件类型，默认为0： 0  身份证 1  户口簿 2  护照 3  军官证 4  士兵证 5  港澳居民来往内地通行证 6  台湾同胞来往内地通行证 7  临时身份证 8  外国人居留证 9  警官证 99  其他证件
     */
    private String certificatetype;

    /**
     * 证件号码
     */
    private String certificateno;

    /**
     * 客户电子邮箱
     */
    private String custemail;

    /**
     * 收款日期
     */
    private Date inpaymentdate;

    /**
     * 交易时间
     */
    private String inpaymenttime;

    /**
     * 支付方式(01 现金收款、02 POS刷卡、03 客户转账、04 批量扣款、05 银保通、06 支票收款、07 WEB在线支付、08 快钱垫付、09语音在线支付、98上海平台)
     */
    private String payway;

    /**
     * 消费渠道对应d(user表userid)
     */
    private String paychannel;

    /**
     * 银行大类代码
     */
    private String bankcode;

    /**
     * 是否对账
     */
    private String ifreconciliation;

    /**
     * 合并收款渠道
     */
    private String mergeChannel;

    /**
     * 业务来源
     */
    private String fatherno;

    /**
     * 是否合并收款
     */
    private String ifmerge;

    /**
     * 合并/分别收款操作员
     */
    private String mergesplitopcode;

    /**
     * 支付渠道
     */
    private String beginpaychannel;

    /**
     * 银行指令代码
     */
    private String directbankcode;

    /**
     * 银行指令代码
     */
    private String directOrderbankcode;

    /**
     * 信用卡有效期YYMM
     */
    private String expirydate;

    /**
     * 信用卡分期业务分期期数
     */
    private String stagenum;

    /**
     * 支付确认返回界面地址
     */
    private String backurl;

    /**
     * 车主名称（江苏车承保必传）
     */
    private String vehicleownername;

    /**
     * 车主性质代码，代码参见3.3.16（江苏车承保必传）
     */
    private String vehicleownernature;

    /**
     * 车主证件类型，代码参见3.3.17（江苏车承保必传）
     */
    private String vehicleowneridcode;

    /**
     * 车主证件号码（江苏车承保必传）
     */
    private String vehicleowneridno;

    /**
     * 车主手机号码
     */
    private String vehicleownerphoneno;

    /**
     * 投保人证件类型，（江苏车承保必传）
     */
    private String applicantidcode;

    /**
     * 是否需认证（1：认证；0：无需认证）江苏车险默认为1，其他地区或者不传默认为0
     */
    private String iscertificate;

    /**
     * 投保人证件类型(1:个人 2:团体)
     */
    private String applicantnature;

    /**
     * 江苏实名认编码
     */
    private String authenticationno;

    /**
     * 江苏实名认结果
     */
    private String authenticationresult;

    /**
     * 实名认证结果，1 代表成功 其他 代表失败
     */
    private String certificateresult;

    /**
     * 最终支付时缴费账号,缴费方式POS 银行卡号，微信：微信openid,支付宝：alipay
     */
    private String payaccount;

    /**
     * 最终支付时支付渠道，WEIXIN 微信,POS 银行卡 ALIPAY 支付宝
     */
    private String paybktranchnl;

    /**
     * 支付方式
     */
    private String paywaysource;

    /**
     * 目的银行账户
     */
    private String accountno;

    /**
     * 目的银行名称
     */
    private String accountname;

    /**
     * 支付协议号，商户订单号
     */
    private String payprotocolno;

    /**
     * 申请金额
     */
    private String applyamount;

    /**
     * 财务机构
     */
    private String unitcode;

    /**
     * 记录数据处理次数
     */
    private String handletimes;

    /**
     * 支付流水对账码
     */
    private String payid;

    /**
     * 上海平台支付号
     */
    private String cipaymentno;

    /**
     * 腾讯返回的openid值;支付宝返回的userid
     */
    private String txOpenid;

    /**
     * 腾讯返回的code值;支付宝返回的code
     */
    private String txCode;

    /**
     * 0或者空展示二维码，1：直接支付
     */
    private String paymentno;

    /**
     * 拉起付款页面需要的支付信息
     */
    private String payInfo;

    /**
    * 获取-支付申请号
    * @return applyno
     */
    public String getApplyno() {
        return applyno;
    }

    /**
    * 设置-支付申请号
    * @paramType java.lang.String
    * @param applyno - 支付申请号
     */
    public void setApplyno(String applyno) {
        this.applyno = applyno;
    }

    /**
    * 获取-支付号对应的收款金额
    * @return amount
     */
    public String getAmount() {
        return amount;
    }

    /**
    * 设置-支付号对应的收款金额
    * @paramType java.lang.String
    * @param amount - 支付号对应的收款金额
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
    * 获取-支付号对应的校验码长度最多8位
    * @return checkCode
     */
    public String getCheckCode() {
        return checkCode;
    }

    /**
    * 设置-支付号对应的校验码长度最多8位
    * @paramType java.lang.String
    * @param checkCode - 支付号对应的校验码长度最多8位
     */
    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    /**
    * 获取-备注信息可用于描述一些有数据维护修改单的修改数据备注，也可用于描述撤销支付号原因
    * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
    * 设置-备注信息可用于描述一些有数据维护修改单的修改数据备注，也可用于描述撤销支付号原因
    * @paramType java.lang.String
    * @param remark - 备注信息可用于描述一些有数据维护修改单的修改数据备注，也可用于描述撤销支付号原因
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
    * 获取-保险商户号
    * @return insuMidno
     */
    public String getInsuMidno() {
        return insuMidno;
    }

    /**
    * 设置-保险商户号
    * @paramType java.lang.String
    * @param insuMidno - 保险商户号
     */
    public void setInsuMidno(String insuMidno) {
        this.insuMidno = insuMidno;
    }

    /**
    * 获取-对应支票支付方式的支票操作员姓名
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-对应支票支付方式的支票操作员姓名
    * @paramType java.lang.String
    * @param opcode - 对应支票支付方式的支票操作员姓名
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-对应支票支付方式支付确认用户密码
    * @return oppw
     */
    public String getOppw() {
        return oppw;
    }

    /**
    * 设置-对应支票支付方式支付确认用户密码
    * @paramType java.lang.String
    * @param oppw - 对应支票支付方式支付确认用户密码
     */
    public void setOppw(String oppw) {
        this.oppw = oppw;
    }

    /**
    * 获取-I:初始化  C:处理完  G:撤销  F:处理失败  9:待审核
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-I:初始化  C:处理完  G:撤销  F:处理失败  9:待审核
    * @paramType java.lang.String
    * @param status - I:初始化  C:处理完  G:撤销  F:处理失败  9:待审核
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-系统最后操作时间
    * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
    * 设置-系统最后操作时间
    * @paramType java.util.Date
    * @param timestamp - 系统最后操作时间
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
    * 获取-系统内部交易流水号
    * @return tano
     */
    public String getTano() {
        return tano;
    }

    /**
    * 设置-系统内部交易流水号
    * @paramType java.lang.String
    * @param tano - 系统内部交易流水号
     */
    public void setTano(String tano) {
        this.tano = tano;
    }

    /**
    * 获取-支付申请用户对应提供给各业务系统的用户名
    * @return userid
     */
    public String getUserid() {
        return userid;
    }

    /**
    * 设置-支付申请用户对应提供给各业务系统的用户名
    * @paramType java.lang.String
    * @param userid - 支付申请用户对应提供给各业务系统的用户名
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
    * 获取-银行每次查询该值加1，针对银行已经查询过的申请不能撤销。
    * @return checkcount
     */
    public BigDecimal getCheckcount() {
        return checkcount;
    }

    /**
    * 设置-银行每次查询该值加1，针对银行已经查询过的申请不能撤销。
    * @paramType java.math.BigDecimal
    * @param checkcount - 银行每次查询该值加1，针对银行已经查询过的申请不能撤销。
     */
    public void setCheckcount(BigDecimal checkcount) {
        this.checkcount = checkcount;
    }

    /**
    * 获取-识别号，用于校验消费时对应的终端号。
    * @return recognitionid
     */
    public String getRecognitionid() {
        return recognitionid;
    }

    /**
    * 设置-识别号，用于校验消费时对应的终端号。
    * @paramType java.lang.String
    * @param recognitionid - 识别号，用于校验消费时对应的终端号。
     */
    public void setRecognitionid(String recognitionid) {
        this.recognitionid = recognitionid;
    }

    /**
    * 获取-支付类型：1为人 工确认到账，2为自动确认到账
    * @return paytype
     */
    public String getPaytype() {
        return paytype;
    }

    /**
    * 设置-支付类型：1为人 工确认到账，2为自动确认到账
    * @paramType java.lang.String
    * @param paytype - 支付类型：1为人 工确认到账，2为自动确认到账
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    /**
    * 获取-业务系统补录的支票号
    * @return checkno
     */
    public String getCheckno() {
        return checkno;
    }

    /**
    * 设置-业务系统补录的支票号
    * @paramType java.lang.String
    * @param checkno - 业务系统补录的支票号
     */
    public void setCheckno(String checkno) {
        this.checkno = checkno;
    }

    /**
    * 获取-支票流水号
    * @return checkserral
     */
    public String getCheckserral() {
        return checkserral;
    }

    /**
    * 设置-支票流水号
    * @paramType java.lang.String
    * @param checkserral - 支票流水号
     */
    public void setCheckserral(String checkserral) {
        this.checkserral = checkserral;
    }

    /**
    * 获取-用于校验是否允许消费，最迟消费时间需要在起保前10分钟
    * @return policystartdate
     */
    public String getPolicystartdate() {
        return policystartdate;
    }

    /**
    * 设置-用于校验是否允许消费，最迟消费时间需要在起保前10分钟
    * @paramType java.lang.String
    * @param policystartdate - 用于校验是否允许消费，最迟消费时间需要在起保前10分钟
     */
    public void setPolicystartdate(String policystartdate) {
        this.policystartdate = policystartdate;
    }

    /**
    * 获取-7位分公司简码
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-7位分公司简码
    * @paramType java.lang.String
    * @param subcompany - 7位分公司简码
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-支付号对应的支付币种
    * @return currencytype
     */
    public String getCurrencytype() {
        return currencytype;
    }

    /**
    * 设置-支付号对应的支付币种
    * @paramType java.lang.String
    * @param currencytype - 支付号对应的支付币种
     */
    public void setCurrencytype(String currencytype) {
        this.currencytype = currencytype;
    }

    /**
    * 获取-超过正常起保时间后的消费时间
    * @return paranormalday
     */
    public String getParanormalday() {
        return paranormalday;
    }

    /**
    * 设置-超过正常起保时间后的消费时间
    * @paramType java.lang.String
    * @param paranormalday - 超过正常起保时间后的消费时间
     */
    public void setParanormalday(String paranormalday) {
        this.paranormalday = paranormalday;
    }

    /**
    * 获取-被保险人名称
    * @return insuredname
     */
    public String getInsuredname() {
        return insuredname;
    }

    /**
    * 设置-被保险人名称
    * @paramType java.lang.String
    * @param insuredname - 被保险人名称
     */
    public void setInsuredname(String insuredname) {
        this.insuredname = insuredname;
    }

    /**
    * 获取-业务归属部门
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-业务归属部门
    * @paramType java.lang.String
    * @param departmentcode - 业务归属部门
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
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
    * 获取-客户开户行账号
    * @return custaccountno
     */
    public String getCustaccountno() {
        return custaccountno;
    }

    /**
    * 设置-客户开户行账号
    * @paramType java.lang.String
    * @param custaccountno - 客户开户行账号
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
    * 获取-银行指令类型1：公对公 2：公对私
    * @return ispaypublic
     */
    public String getIspaypublic() {
        return ispaypublic;
    }

    /**
    * 设置-银行指令类型1：公对公 2：公对私
    * @paramType java.lang.String
    * @param ispaypublic - 银行指令类型1：公对公 2：公对私
     */
    public void setIspaypublic(String ispaypublic) {
        this.ispaypublic = ispaypublic;
    }

    /**
    * 获取-扣款业务时使用，客户的手机号（江苏车承保投保人手机号码字段传此值）
    * @return mobilenumber
     */
    public String getMobilenumber() {
        return mobilenumber;
    }

    /**
    * 设置-扣款业务时使用，客户的手机号（江苏车承保投保人手机号码字段传此值）
    * @paramType java.lang.String
    * @param mobilenumber - 扣款业务时使用，客户的手机号（江苏车承保投保人手机号码字段传此值）
     */
    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    /**
    * 获取-客户账户的卡折类型：1 存折、2 借记卡、3 贷记卡、4准贷记卡
    * @return cardflag
     */
    public String getCardflag() {
        return cardflag;
    }

    /**
    * 设置-客户账户的卡折类型：1 存折、2 借记卡、3 贷记卡、4准贷记卡
    * @paramType java.lang.String
    * @param cardflag - 客户账户的卡折类型：1 存折、2 借记卡、3 贷记卡、4准贷记卡
     */
    public void setCardflag(String cardflag) {
        this.cardflag = cardflag;
    }

    /**
    * 获取-证件类型，默认为0：
0  身份证
1  户口簿
2  护照
3  军官证
4  士兵证
5  港澳居民来往内地通行证
6  台湾同胞来往内地通行证
7  临时身份证
8  外国人居留证
9  警官证
99  其他证件
    * @return certificatetype
     */
    public String getCertificatetype() {
        return certificatetype;
    }

    /**
    * 设置-证件类型，默认为0：
0  身份证
1  户口簿
2  护照
3  军官证
4  士兵证
5  港澳居民来往内地通行证
6  台湾同胞来往内地通行证
7  临时身份证
8  外国人居留证
9  警官证
99  其他证件
    * @paramType java.lang.String
    * @param certificatetype - 证件类型，默认为0：
0  身份证
1  户口簿
2  护照
3  军官证
4  士兵证
5  港澳居民来往内地通行证
6  台湾同胞来往内地通行证
7  临时身份证
8  外国人居留证
9  警官证
99  其他证件
     */
    public void setCertificatetype(String certificatetype) {
        this.certificatetype = certificatetype;
    }

    /**
    * 获取-证件号码
    * @return certificateno
     */
    public String getCertificateno() {
        return certificateno;
    }

    /**
    * 设置-证件号码
    * @paramType java.lang.String
    * @param certificateno - 证件号码
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
    * 获取-收款日期
    * @return inpaymentdate
     */
    public Date getInpaymentdate() {
        return inpaymentdate;
    }

    /**
    * 设置-收款日期
    * @paramType java.util.Date
    * @param inpaymentdate - 收款日期
     */
    public void setInpaymentdate(Date inpaymentdate) {
        this.inpaymentdate = inpaymentdate;
    }

    /**
    * 获取-交易时间
    * @return inpaymenttime
     */
    public String getInpaymenttime() {
        return inpaymenttime;
    }

    /**
    * 设置-交易时间
    * @paramType java.lang.String
    * @param inpaymenttime - 交易时间
     */
    public void setInpaymenttime(String inpaymenttime) {
        this.inpaymenttime = inpaymenttime;
    }

    /**
    * 获取-支付方式(01 现金收款、02 POS刷卡、03 客户转账、04 批量扣款、05 银保通、06 支票收款、07 WEB在线支付、08 快钱垫付、09语音在线支付、98上海平台)
    * @return payway
     */
    public String getPayway() {
        return payway;
    }

    /**
    * 设置-支付方式(01 现金收款、02 POS刷卡、03 客户转账、04 批量扣款、05 银保通、06 支票收款、07 WEB在线支付、08 快钱垫付、09语音在线支付、98上海平台)
    * @paramType java.lang.String
    * @param payway - 支付方式(01 现金收款、02 POS刷卡、03 客户转账、04 批量扣款、05 银保通、06 支票收款、07 WEB在线支付、08 快钱垫付、09语音在线支付、98上海平台)
     */
    public void setPayway(String payway) {
        this.payway = payway;
    }

    /**
    * 获取-消费渠道对应d(user表userid)
    * @return paychannel
     */
    public String getPaychannel() {
        return paychannel;
    }

    /**
    * 设置-消费渠道对应d(user表userid)
    * @paramType java.lang.String
    * @param paychannel - 消费渠道对应d(user表userid)
     */
    public void setPaychannel(String paychannel) {
        this.paychannel = paychannel;
    }

    /**
    * 获取-银行大类代码
    * @return bankcode
     */
    public String getBankcode() {
        return bankcode;
    }

    /**
    * 设置-银行大类代码
    * @paramType java.lang.String
    * @param bankcode - 银行大类代码
     */
    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    /**
    * 获取-是否对账
    * @return ifreconciliation
     */
    public String getIfreconciliation() {
        return ifreconciliation;
    }

    /**
    * 设置-是否对账
    * @paramType java.lang.String
    * @param ifreconciliation - 是否对账
     */
    public void setIfreconciliation(String ifreconciliation) {
        this.ifreconciliation = ifreconciliation;
    }

    /**
    * 获取-合并收款渠道
    * @return mergeChannel
     */
    public String getMergeChannel() {
        return mergeChannel;
    }

    /**
    * 设置-合并收款渠道
    * @paramType java.lang.String
    * @param mergeChannel - 合并收款渠道
     */
    public void setMergeChannel(String mergeChannel) {
        this.mergeChannel = mergeChannel;
    }

    /**
    * 获取-业务来源
    * @return fatherno
     */
    public String getFatherno() {
        return fatherno;
    }

    /**
    * 设置-业务来源
    * @paramType java.lang.String
    * @param fatherno - 业务来源
     */
    public void setFatherno(String fatherno) {
        this.fatherno = fatherno;
    }

    /**
    * 获取-是否合并收款
    * @return ifmerge
     */
    public String getIfmerge() {
        return ifmerge;
    }

    /**
    * 设置-是否合并收款
    * @paramType java.lang.String
    * @param ifmerge - 是否合并收款
     */
    public void setIfmerge(String ifmerge) {
        this.ifmerge = ifmerge;
    }

    /**
    * 获取-合并/分别收款操作员
    * @return mergesplitopcode
     */
    public String getMergesplitopcode() {
        return mergesplitopcode;
    }

    /**
    * 设置-合并/分别收款操作员
    * @paramType java.lang.String
    * @param mergesplitopcode - 合并/分别收款操作员
     */
    public void setMergesplitopcode(String mergesplitopcode) {
        this.mergesplitopcode = mergesplitopcode;
    }

    /**
    * 获取-支付渠道
    * @return beginpaychannel
     */
    public String getBeginpaychannel() {
        return beginpaychannel;
    }

    /**
    * 设置-支付渠道
    * @paramType java.lang.String
    * @param beginpaychannel - 支付渠道
     */
    public void setBeginpaychannel(String beginpaychannel) {
        this.beginpaychannel = beginpaychannel;
    }

    /**
    * 获取-银行指令代码
    * @return directbankcode
     */
    public String getDirectbankcode() {
        return directbankcode;
    }

    /**
    * 设置-银行指令代码
    * @paramType java.lang.String
    * @param directbankcode - 银行指令代码
     */
    public void setDirectbankcode(String directbankcode) {
        this.directbankcode = directbankcode;
    }

    /**
    * 获取-银行指令代码
    * @return directOrderbankcode
     */
    public String getDirectOrderbankcode() {
        return directOrderbankcode;
    }

    /**
    * 设置-银行指令代码
    * @paramType java.lang.String
    * @param directOrderbankcode - 银行指令代码
     */
    public void setDirectOrderbankcode(String directOrderbankcode) {
        this.directOrderbankcode = directOrderbankcode;
    }

    /**
    * 获取-信用卡有效期YYMM
    * @return expirydate
     */
    public String getExpirydate() {
        return expirydate;
    }

    /**
    * 设置-信用卡有效期YYMM
    * @paramType java.lang.String
    * @param expirydate - 信用卡有效期YYMM
     */
    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }

    /**
    * 获取-信用卡分期业务分期期数
    * @return stagenum
     */
    public String getStagenum() {
        return stagenum;
    }

    /**
    * 设置-信用卡分期业务分期期数
    * @paramType java.lang.String
    * @param stagenum - 信用卡分期业务分期期数
     */
    public void setStagenum(String stagenum) {
        this.stagenum = stagenum;
    }

    /**
    * 获取-支付确认返回界面地址
    * @return backurl
     */
    public String getBackurl() {
        return backurl;
    }

    /**
    * 设置-支付确认返回界面地址
    * @paramType java.lang.String
    * @param backurl - 支付确认返回界面地址
     */
    public void setBackurl(String backurl) {
        this.backurl = backurl;
    }

    /**
    * 获取-车主名称（江苏车承保必传）
    * @return vehicleownername
     */
    public String getVehicleownername() {
        return vehicleownername;
    }

    /**
    * 设置-车主名称（江苏车承保必传）
    * @paramType java.lang.String
    * @param vehicleownername - 车主名称（江苏车承保必传）
     */
    public void setVehicleownername(String vehicleownername) {
        this.vehicleownername = vehicleownername;
    }

    /**
    * 获取-车主性质代码，代码参见3.3.16（江苏车承保必传）
    * @return vehicleownernature
     */
    public String getVehicleownernature() {
        return vehicleownernature;
    }

    /**
    * 设置-车主性质代码，代码参见3.3.16（江苏车承保必传）
    * @paramType java.lang.String
    * @param vehicleownernature - 车主性质代码，代码参见3.3.16（江苏车承保必传）
     */
    public void setVehicleownernature(String vehicleownernature) {
        this.vehicleownernature = vehicleownernature;
    }

    /**
    * 获取-车主证件类型，代码参见3.3.17（江苏车承保必传）
    * @return vehicleowneridcode
     */
    public String getVehicleowneridcode() {
        return vehicleowneridcode;
    }

    /**
    * 设置-车主证件类型，代码参见3.3.17（江苏车承保必传）
    * @paramType java.lang.String
    * @param vehicleowneridcode - 车主证件类型，代码参见3.3.17（江苏车承保必传）
     */
    public void setVehicleowneridcode(String vehicleowneridcode) {
        this.vehicleowneridcode = vehicleowneridcode;
    }

    /**
    * 获取-车主证件号码（江苏车承保必传）
    * @return vehicleowneridno
     */
    public String getVehicleowneridno() {
        return vehicleowneridno;
    }

    /**
    * 设置-车主证件号码（江苏车承保必传）
    * @paramType java.lang.String
    * @param vehicleowneridno - 车主证件号码（江苏车承保必传）
     */
    public void setVehicleowneridno(String vehicleowneridno) {
        this.vehicleowneridno = vehicleowneridno;
    }

    /**
    * 获取-车主手机号码
    * @return vehicleownerphoneno
     */
    public String getVehicleownerphoneno() {
        return vehicleownerphoneno;
    }

    /**
    * 设置-车主手机号码
    * @paramType java.lang.String
    * @param vehicleownerphoneno - 车主手机号码
     */
    public void setVehicleownerphoneno(String vehicleownerphoneno) {
        this.vehicleownerphoneno = vehicleownerphoneno;
    }

    /**
    * 获取-投保人证件类型，（江苏车承保必传）
    * @return applicantidcode
     */
    public String getApplicantidcode() {
        return applicantidcode;
    }

    /**
    * 设置-投保人证件类型，（江苏车承保必传）
    * @paramType java.lang.String
    * @param applicantidcode - 投保人证件类型，（江苏车承保必传）
     */
    public void setApplicantidcode(String applicantidcode) {
        this.applicantidcode = applicantidcode;
    }

    /**
    * 获取-是否需认证（1：认证；0：无需认证）江苏车险默认为1，其他地区或者不传默认为0
    * @return iscertificate
     */
    public String getIscertificate() {
        return iscertificate;
    }

    /**
    * 设置-是否需认证（1：认证；0：无需认证）江苏车险默认为1，其他地区或者不传默认为0
    * @paramType java.lang.String
    * @param iscertificate - 是否需认证（1：认证；0：无需认证）江苏车险默认为1，其他地区或者不传默认为0
     */
    public void setIscertificate(String iscertificate) {
        this.iscertificate = iscertificate;
    }

    /**
    * 获取-投保人证件类型(1:个人 2:团体)
    * @return applicantnature
     */
    public String getApplicantnature() {
        return applicantnature;
    }

    /**
    * 设置-投保人证件类型(1:个人 2:团体)
    * @paramType java.lang.String
    * @param applicantnature - 投保人证件类型(1:个人 2:团体)
     */
    public void setApplicantnature(String applicantnature) {
        this.applicantnature = applicantnature;
    }

    /**
    * 获取-江苏实名认编码
    * @return authenticationno
     */
    public String getAuthenticationno() {
        return authenticationno;
    }

    /**
    * 设置-江苏实名认编码
    * @paramType java.lang.String
    * @param authenticationno - 江苏实名认编码
     */
    public void setAuthenticationno(String authenticationno) {
        this.authenticationno = authenticationno;
    }

    /**
    * 获取-江苏实名认结果
    * @return authenticationresult
     */
    public String getAuthenticationresult() {
        return authenticationresult;
    }

    /**
    * 设置-江苏实名认结果
    * @paramType java.lang.String
    * @param authenticationresult - 江苏实名认结果
     */
    public void setAuthenticationresult(String authenticationresult) {
        this.authenticationresult = authenticationresult;
    }

    /**
    * 获取-实名认证结果，1 代表成功 其他 代表失败
    * @return certificateresult
     */
    public String getCertificateresult() {
        return certificateresult;
    }

    /**
    * 设置-实名认证结果，1 代表成功 其他 代表失败
    * @paramType java.lang.String
    * @param certificateresult - 实名认证结果，1 代表成功 其他 代表失败
     */
    public void setCertificateresult(String certificateresult) {
        this.certificateresult = certificateresult;
    }

    /**
    * 获取-最终支付时缴费账号,缴费方式POS 银行卡号，微信：微信openid,支付宝：alipay
    * @return payaccount
     */
    public String getPayaccount() {
        return payaccount;
    }

    /**
    * 设置-最终支付时缴费账号,缴费方式POS 银行卡号，微信：微信openid,支付宝：alipay
    * @paramType java.lang.String
    * @param payaccount - 最终支付时缴费账号,缴费方式POS 银行卡号，微信：微信openid,支付宝：alipay
     */
    public void setPayaccount(String payaccount) {
        this.payaccount = payaccount;
    }

    /**
    * 获取-最终支付时支付渠道，WEIXIN 微信,POS 银行卡 ALIPAY 支付宝
    * @return paybktranchnl
     */
    public String getPaybktranchnl() {
        return paybktranchnl;
    }

    /**
    * 设置-最终支付时支付渠道，WEIXIN 微信,POS 银行卡 ALIPAY 支付宝
    * @paramType java.lang.String
    * @param paybktranchnl - 最终支付时支付渠道，WEIXIN 微信,POS 银行卡 ALIPAY 支付宝
     */
    public void setPaybktranchnl(String paybktranchnl) {
        this.paybktranchnl = paybktranchnl;
    }

    /**
    * 获取-支付方式
    * @return paywaysource
     */
    public String getPaywaysource() {
        return paywaysource;
    }

    /**
    * 设置-支付方式
    * @paramType java.lang.String
    * @param paywaysource - 支付方式
     */
    public void setPaywaysource(String paywaysource) {
        this.paywaysource = paywaysource;
    }

    /**
    * 获取-目的银行账户
    * @return accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
    * 设置-目的银行账户
    * @paramType java.lang.String
    * @param accountno - 目的银行账户
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
    * 获取-目的银行名称
    * @return accountname
     */
    public String getAccountname() {
        return accountname;
    }

    /**
    * 设置-目的银行名称
    * @paramType java.lang.String
    * @param accountname - 目的银行名称
     */
    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    /**
    * 获取-支付协议号，商户订单号
    * @return payprotocolno
     */
    public String getPayprotocolno() {
        return payprotocolno;
    }

    /**
    * 设置-支付协议号，商户订单号
    * @paramType java.lang.String
    * @param payprotocolno - 支付协议号，商户订单号
     */
    public void setPayprotocolno(String payprotocolno) {
        this.payprotocolno = payprotocolno;
    }

    /**
    * 获取-申请金额
    * @return applyamount
     */
    public String getApplyamount() {
        return applyamount;
    }

    /**
    * 设置-申请金额
    * @paramType java.lang.String
    * @param applyamount - 申请金额
     */
    public void setApplyamount(String applyamount) {
        this.applyamount = applyamount;
    }

    /**
    * 获取-财务机构
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-财务机构
    * @paramType java.lang.String
    * @param unitcode - 财务机构
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    /**
    * 获取-记录数据处理次数
    * @return handletimes
     */
    public String getHandletimes() {
        return handletimes;
    }

    /**
    * 设置-记录数据处理次数
    * @paramType java.lang.String
    * @param handletimes - 记录数据处理次数
     */
    public void setHandletimes(String handletimes) {
        this.handletimes = handletimes;
    }

    /**
    * 获取-支付流水对账码
    * @return payid
     */
    public String getPayid() {
        return payid;
    }

    /**
    * 设置-支付流水对账码
    * @paramType java.lang.String
    * @param payid - 支付流水对账码
     */
    public void setPayid(String payid) {
        this.payid = payid;
    }

    /**
    * 获取-上海平台支付号
    * @return cipaymentno
     */
    public String getCipaymentno() {
        return cipaymentno;
    }

    /**
    * 设置-上海平台支付号
    * @paramType java.lang.String
    * @param cipaymentno - 上海平台支付号
     */
    public void setCipaymentno(String cipaymentno) {
        this.cipaymentno = cipaymentno;
    }

    /**
    * 获取-腾讯返回的openid值;支付宝返回的userid
    * @return txOpenid
     */
    public String getTxOpenid() {
        return txOpenid;
    }

    /**
    * 设置-腾讯返回的openid值;支付宝返回的userid
    * @paramType java.lang.String
    * @param txOpenid - 腾讯返回的openid值;支付宝返回的userid
     */
    public void setTxOpenid(String txOpenid) {
        this.txOpenid = txOpenid;
    }

    /**
    * 获取-腾讯返回的code值;支付宝返回的code
    * @return txCode
     */
    public String getTxCode() {
        return txCode;
    }

    /**
    * 设置-腾讯返回的code值;支付宝返回的code
    * @paramType java.lang.String
    * @param txCode - 腾讯返回的code值;支付宝返回的code
     */
    public void setTxCode(String txCode) {
        this.txCode = txCode;
    }

    /**
    * 获取-0或者空展示二维码，1：直接支付
    * @return paymentno
     */
    public String getPaymentno() {
        return paymentno;
    }

    /**
    * 设置-0或者空展示二维码，1：直接支付
    * @paramType java.lang.String
    * @param paymentno - 0或者空展示二维码，1：直接支付
     */
    public void setPaymentno(String paymentno) {
        this.paymentno = paymentno;
    }

    /**
    * 获取-拉起付款页面需要的支付信息
    * @return payInfo
     */
    public String getPayInfo() {
        return payInfo;
    }

    /**
    * 设置-拉起付款页面需要的支付信息
    * @paramType java.lang.String
    * @param payInfo - 拉起付款页面需要的支付信息
     */
    public void setPayInfo(String payInfo) {
        this.payInfo = payInfo;
    }
}