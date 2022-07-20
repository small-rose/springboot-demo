package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : d_bankgateway
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class DBankgateway {
    /**
     * 主键
     */
    private Long seqid;

    /**
     * 收单行代码
     */
    private String orderBankcode;

    /**
     * 收单行名称
     */
    private String orderBankname;

    /**
     * 支付行代码
     */
    private String bankcode;

    /**
     * 支付行名称
     */
    private String bankname;

    /**
     * 组合代码
     */
    private String grouptype;

    /**
     * 账号(用户名)
     */
    private String requestId;

    /**
     * 银行网关地址
     */
    private String requestUrl;

    /**
     * 银行退款接口地址
     */
    private String refundUrl;

    /**
     * 签名密钥
     */
    private String signkey;

    /**
     * 签名方法如MD5，01：RSA2
     */
    private String signtype;

    /**
     * 结算商户号
     */
    private String insuMidno;

    /**
     * 结算银行账号
     */
    private String accountno;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 收款方式
     */
    private String paytype;

    /**
     * 字符编码
     */
    private String charset;

    /**
     * 展示地址
     */
    private String showUrl;

    /**
     * 异步通知地址
     */
    private String notifyUrl;

    /**
     * 同步通知地址
     */
    private String returnUrl;

    /**
     * 退款异步通知地址
     */
    private String refundNotifyUrl;

    /**
     * 银行通知消息验证地址
     */
    private String veryfyUrl;

    /**
     * 传输协议如http,https
     */
    private String transport;

    /**
     * 是否有效，1有效，0无效，默认0，2车险对接银联支付宝微信
     */
    private String ifvalid;

    /**
     * 客户支付方式,如可使用信用卡,快捷支付,分期等方式
     */
    private String paymethod;

    /**
     * 自动登陆标识(支付宝专用),Y 使用,  N不使用
     */
    private String defaultLogin;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 上次修改时间
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 手工修改说明
     */
    private String modifydesc;

    /**
     * 柜台号
     */
    private String posid;

    /**
     * 移动版银行支付网关地址
     */
    private String mobileRequestUrl;

    /**
     * 合同号（商户与第三方签订的合同号）
     */
    private String contractid;

    /**
     * 不具有业务意义，用于区分配置类型（如同sap_code_mapping 中的typename）
     */
    private String typename;

    /**
     * 操作员号
     */
    private String userId;

    /**
     * 操作员交易密码
     */
    private String password;

    /**
     * 客户号
     */
    private String custId;

    /**
     * 00网银支付网关,01批量代扣网关,02直连支付网关,03腾讯微信直连,04招行直连网关,05支付宝直联,06银联支付宝
     */
    private String type;

    /**
     * 结算银行账户名
     */
    private String accountname;

    /**
     * 单笔限额(包含)
     */
    private BigDecimal singleMaxamount;

    /**
     * 整包限额(包含)
     */
    private BigDecimal packetMaxamount;

    /**
     * 整个包允许的最大笔数(包含)
     */
    private BigDecimal packetMaxcount;

    /**
     * 银行处理结果是否需要审核后生效 00无需审核,01需要审核
     */
    private String ifcheckresult;

    /**
     * 微信请求code 的请求地址
     */
    private String txcodeurl;

    /**
     * 微信回调收付系统的授权code的地址
     */
    private String txredirecturl;

    /**
     * 微信请求openid 的地址
     */
    private String txauthurl;

    /**
     * 微信实名认证用户授权地址
     */
    private String txuserauthurl;

    /**
     * 微信实名认证用户授权回调地址
     */
    private String txauthredirecturl;

    /**
     * 微信公众号支付实名认证保险下单接口
     */
    private String wxauthJsapiurl;

    /**
     * 银行网关地址备用
     */
    private String requestUrl2;

    /**
     * 订单查询接口地址
     */
    private String orderqueryUrl;

    /**
     * 订单查询接口地址备用
     */
    private String orderqueryUrl2;

    /**
     * 验签公钥
     */
    private String checkkey;

    /**
     * 招行接口调用校验头信息
     */
    private String appid;

    /**
     * 招行接口调用校验头信息
     */
    private String appsecret;

    /**
     * 招行关闭订单地址
     */
    private String ordercloseUrl;

    /**
     * 终端号
     */
    private String tid;

    /**
     * 业务类型
     */
    private String instmid;

    /**
     * 车险实名模式(中保信模式为 CIITC；深圳模式为 SZ；江苏模式为 JS；上海模式为 SH；不验证模式为NF)
     */
    private String fixinsurance;

    /**
     * 认证方式
     */
    private String authorization;

    /**
     * 银商分配的 4 位来源编号
     */
    private String msgsrcid;

    /**
     * 商户证书地址
     */
    private String mchCert;

    /**
     * 前端支付页面地址
     */
    private String payPageUrl;

    /**
    * 获取-主键
    * @return seqid
     */
    public Long getSeqid() {
        return seqid;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param seqid - 主键
     */
    public void setSeqid(Long seqid) {
        this.seqid = seqid;
    }

    /**
    * 获取-收单行代码
    * @return orderBankcode
     */
    public String getOrderBankcode() {
        return orderBankcode;
    }

    /**
    * 设置-收单行代码
    * @paramType java.lang.String
    * @param orderBankcode - 收单行代码
     */
    public void setOrderBankcode(String orderBankcode) {
        this.orderBankcode = orderBankcode;
    }

    /**
    * 获取-收单行名称
    * @return orderBankname
     */
    public String getOrderBankname() {
        return orderBankname;
    }

    /**
    * 设置-收单行名称
    * @paramType java.lang.String
    * @param orderBankname - 收单行名称
     */
    public void setOrderBankname(String orderBankname) {
        this.orderBankname = orderBankname;
    }

    /**
    * 获取-支付行代码
    * @return bankcode
     */
    public String getBankcode() {
        return bankcode;
    }

    /**
    * 设置-支付行代码
    * @paramType java.lang.String
    * @param bankcode - 支付行代码
     */
    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    /**
    * 获取-支付行名称
    * @return bankname
     */
    public String getBankname() {
        return bankname;
    }

    /**
    * 设置-支付行名称
    * @paramType java.lang.String
    * @param bankname - 支付行名称
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
    * 获取-组合代码
    * @return grouptype
     */
    public String getGrouptype() {
        return grouptype;
    }

    /**
    * 设置-组合代码
    * @paramType java.lang.String
    * @param grouptype - 组合代码
     */
    public void setGrouptype(String grouptype) {
        this.grouptype = grouptype;
    }

    /**
    * 获取-账号(用户名)
    * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    /**
    * 设置-账号(用户名)
    * @paramType java.lang.String
    * @param requestId - 账号(用户名)
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
    * 获取-银行网关地址
    * @return requestUrl
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    /**
    * 设置-银行网关地址
    * @paramType java.lang.String
    * @param requestUrl - 银行网关地址
     */
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    /**
    * 获取-银行退款接口地址
    * @return refundUrl
     */
    public String getRefundUrl() {
        return refundUrl;
    }

    /**
    * 设置-银行退款接口地址
    * @paramType java.lang.String
    * @param refundUrl - 银行退款接口地址
     */
    public void setRefundUrl(String refundUrl) {
        this.refundUrl = refundUrl;
    }

    /**
    * 获取-签名密钥
    * @return signkey
     */
    public String getSignkey() {
        return signkey;
    }

    /**
    * 设置-签名密钥
    * @paramType java.lang.String
    * @param signkey - 签名密钥
     */
    public void setSignkey(String signkey) {
        this.signkey = signkey;
    }

    /**
    * 获取-签名方法如MD5，01：RSA2
    * @return signtype
     */
    public String getSigntype() {
        return signtype;
    }

    /**
    * 设置-签名方法如MD5，01：RSA2
    * @paramType java.lang.String
    * @param signtype - 签名方法如MD5，01：RSA2
     */
    public void setSigntype(String signtype) {
        this.signtype = signtype;
    }

    /**
    * 获取-结算商户号
    * @return insuMidno
     */
    public String getInsuMidno() {
        return insuMidno;
    }

    /**
    * 设置-结算商户号
    * @paramType java.lang.String
    * @param insuMidno - 结算商户号
     */
    public void setInsuMidno(String insuMidno) {
        this.insuMidno = insuMidno;
    }

    /**
    * 获取-结算银行账号
    * @return accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
    * 设置-结算银行账号
    * @paramType java.lang.String
    * @param accountno - 结算银行账号
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
    * 获取-币种
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种
    * @paramType java.lang.String
    * @param currencycode - 币种
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-收款方式
    * @return paytype
     */
    public String getPaytype() {
        return paytype;
    }

    /**
    * 设置-收款方式
    * @paramType java.lang.String
    * @param paytype - 收款方式
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    /**
    * 获取-字符编码
    * @return charset
     */
    public String getCharset() {
        return charset;
    }

    /**
    * 设置-字符编码
    * @paramType java.lang.String
    * @param charset - 字符编码
     */
    public void setCharset(String charset) {
        this.charset = charset;
    }

    /**
    * 获取-展示地址
    * @return showUrl
     */
    public String getShowUrl() {
        return showUrl;
    }

    /**
    * 设置-展示地址
    * @paramType java.lang.String
    * @param showUrl - 展示地址
     */
    public void setShowUrl(String showUrl) {
        this.showUrl = showUrl;
    }

    /**
    * 获取-异步通知地址
    * @return notifyUrl
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
    * 设置-异步通知地址
    * @paramType java.lang.String
    * @param notifyUrl - 异步通知地址
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
    * 获取-同步通知地址
    * @return returnUrl
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
    * 设置-同步通知地址
    * @paramType java.lang.String
    * @param returnUrl - 同步通知地址
     */
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    /**
    * 获取-退款异步通知地址
    * @return refundNotifyUrl
     */
    public String getRefundNotifyUrl() {
        return refundNotifyUrl;
    }

    /**
    * 设置-退款异步通知地址
    * @paramType java.lang.String
    * @param refundNotifyUrl - 退款异步通知地址
     */
    public void setRefundNotifyUrl(String refundNotifyUrl) {
        this.refundNotifyUrl = refundNotifyUrl;
    }

    /**
    * 获取-银行通知消息验证地址
    * @return veryfyUrl
     */
    public String getVeryfyUrl() {
        return veryfyUrl;
    }

    /**
    * 设置-银行通知消息验证地址
    * @paramType java.lang.String
    * @param veryfyUrl - 银行通知消息验证地址
     */
    public void setVeryfyUrl(String veryfyUrl) {
        this.veryfyUrl = veryfyUrl;
    }

    /**
    * 获取-传输协议如http,https
    * @return transport
     */
    public String getTransport() {
        return transport;
    }

    /**
    * 设置-传输协议如http,https
    * @paramType java.lang.String
    * @param transport - 传输协议如http,https
     */
    public void setTransport(String transport) {
        this.transport = transport;
    }

    /**
    * 获取-是否有效，1有效，0无效，默认0，2车险对接银联支付宝微信
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否有效，1有效，0无效，默认0，2车险对接银联支付宝微信
    * @paramType java.lang.String
    * @param ifvalid - 是否有效，1有效，0无效，默认0，2车险对接银联支付宝微信
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
    }

    /**
    * 获取-客户支付方式,如可使用信用卡,快捷支付,分期等方式
    * @return paymethod
     */
    public String getPaymethod() {
        return paymethod;
    }

    /**
    * 设置-客户支付方式,如可使用信用卡,快捷支付,分期等方式
    * @paramType java.lang.String
    * @param paymethod - 客户支付方式,如可使用信用卡,快捷支付,分期等方式
     */
    public void setPaymethod(String paymethod) {
        this.paymethod = paymethod;
    }

    /**
    * 获取-自动登陆标识(支付宝专用),Y 使用,  N不使用
    * @return defaultLogin
     */
    public String getDefaultLogin() {
        return defaultLogin;
    }

    /**
    * 设置-自动登陆标识(支付宝专用),Y 使用,  N不使用
    * @paramType java.lang.String
    * @param defaultLogin - 自动登陆标识(支付宝专用),Y 使用,  N不使用
     */
    public void setDefaultLogin(String defaultLogin) {
        this.defaultLogin = defaultLogin;
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
    * 获取-上次修改时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-上次修改时间
    * @paramType java.util.Date
    * @param lastopdate - 上次修改时间
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
    * 获取-手工修改说明
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改说明
    * @paramType java.lang.String
    * @param modifydesc - 手工修改说明
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-柜台号
    * @return posid
     */
    public String getPosid() {
        return posid;
    }

    /**
    * 设置-柜台号
    * @paramType java.lang.String
    * @param posid - 柜台号
     */
    public void setPosid(String posid) {
        this.posid = posid;
    }

    /**
    * 获取-移动版银行支付网关地址
    * @return mobileRequestUrl
     */
    public String getMobileRequestUrl() {
        return mobileRequestUrl;
    }

    /**
    * 设置-移动版银行支付网关地址
    * @paramType java.lang.String
    * @param mobileRequestUrl - 移动版银行支付网关地址
     */
    public void setMobileRequestUrl(String mobileRequestUrl) {
        this.mobileRequestUrl = mobileRequestUrl;
    }

    /**
    * 获取-合同号（商户与第三方签订的合同号）
    * @return contractid
     */
    public String getContractid() {
        return contractid;
    }

    /**
    * 设置-合同号（商户与第三方签订的合同号）
    * @paramType java.lang.String
    * @param contractid - 合同号（商户与第三方签订的合同号）
     */
    public void setContractid(String contractid) {
        this.contractid = contractid;
    }

    /**
    * 获取-不具有业务意义，用于区分配置类型（如同sap_code_mapping 中的typename）
    * @return typename
     */
    public String getTypename() {
        return typename;
    }

    /**
    * 设置-不具有业务意义，用于区分配置类型（如同sap_code_mapping 中的typename）
    * @paramType java.lang.String
    * @param typename - 不具有业务意义，用于区分配置类型（如同sap_code_mapping 中的typename）
     */
    public void setTypename(String typename) {
        this.typename = typename;
    }

    /**
    * 获取-操作员号
    * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
    * 设置-操作员号
    * @paramType java.lang.String
    * @param userId - 操作员号
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
    * 获取-操作员交易密码
    * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
    * 设置-操作员交易密码
    * @paramType java.lang.String
    * @param password - 操作员交易密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
    * 获取-客户号
    * @return custId
     */
    public String getCustId() {
        return custId;
    }

    /**
    * 设置-客户号
    * @paramType java.lang.String
    * @param custId - 客户号
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
    * 获取-00网银支付网关,01批量代扣网关,02直连支付网关,03腾讯微信直连,04招行直连网关,05支付宝直联,06银联支付宝
    * @return type
     */
    public String getType() {
        return type;
    }

    /**
    * 设置-00网银支付网关,01批量代扣网关,02直连支付网关,03腾讯微信直连,04招行直连网关,05支付宝直联,06银联支付宝
    * @paramType java.lang.String
    * @param type - 00网银支付网关,01批量代扣网关,02直连支付网关,03腾讯微信直连,04招行直连网关,05支付宝直联,06银联支付宝
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
    * 获取-结算银行账户名
    * @return accountname
     */
    public String getAccountname() {
        return accountname;
    }

    /**
    * 设置-结算银行账户名
    * @paramType java.lang.String
    * @param accountname - 结算银行账户名
     */
    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    /**
    * 获取-单笔限额(包含)
    * @return singleMaxamount
     */
    public BigDecimal getSingleMaxamount() {
        return singleMaxamount;
    }

    /**
    * 设置-单笔限额(包含)
    * @paramType java.math.BigDecimal
    * @param singleMaxamount - 单笔限额(包含)
     */
    public void setSingleMaxamount(BigDecimal singleMaxamount) {
        this.singleMaxamount = singleMaxamount;
    }

    /**
    * 获取-整包限额(包含)
    * @return packetMaxamount
     */
    public BigDecimal getPacketMaxamount() {
        return packetMaxamount;
    }

    /**
    * 设置-整包限额(包含)
    * @paramType java.math.BigDecimal
    * @param packetMaxamount - 整包限额(包含)
     */
    public void setPacketMaxamount(BigDecimal packetMaxamount) {
        this.packetMaxamount = packetMaxamount;
    }

    /**
    * 获取-整个包允许的最大笔数(包含)
    * @return packetMaxcount
     */
    public BigDecimal getPacketMaxcount() {
        return packetMaxcount;
    }

    /**
    * 设置-整个包允许的最大笔数(包含)
    * @paramType java.math.BigDecimal
    * @param packetMaxcount - 整个包允许的最大笔数(包含)
     */
    public void setPacketMaxcount(BigDecimal packetMaxcount) {
        this.packetMaxcount = packetMaxcount;
    }

    /**
    * 获取-银行处理结果是否需要审核后生效 00无需审核,01需要审核
    * @return ifcheckresult
     */
    public String getIfcheckresult() {
        return ifcheckresult;
    }

    /**
    * 设置-银行处理结果是否需要审核后生效 00无需审核,01需要审核
    * @paramType java.lang.String
    * @param ifcheckresult - 银行处理结果是否需要审核后生效 00无需审核,01需要审核
     */
    public void setIfcheckresult(String ifcheckresult) {
        this.ifcheckresult = ifcheckresult;
    }

    /**
    * 获取-微信请求code 的请求地址
    * @return txcodeurl
     */
    public String getTxcodeurl() {
        return txcodeurl;
    }

    /**
    * 设置-微信请求code 的请求地址
    * @paramType java.lang.String
    * @param txcodeurl - 微信请求code 的请求地址
     */
    public void setTxcodeurl(String txcodeurl) {
        this.txcodeurl = txcodeurl;
    }

    /**
    * 获取-微信回调收付系统的授权code的地址
    * @return txredirecturl
     */
    public String getTxredirecturl() {
        return txredirecturl;
    }

    /**
    * 设置-微信回调收付系统的授权code的地址
    * @paramType java.lang.String
    * @param txredirecturl - 微信回调收付系统的授权code的地址
     */
    public void setTxredirecturl(String txredirecturl) {
        this.txredirecturl = txredirecturl;
    }

    /**
    * 获取-微信请求openid 的地址
    * @return txauthurl
     */
    public String getTxauthurl() {
        return txauthurl;
    }

    /**
    * 设置-微信请求openid 的地址
    * @paramType java.lang.String
    * @param txauthurl - 微信请求openid 的地址
     */
    public void setTxauthurl(String txauthurl) {
        this.txauthurl = txauthurl;
    }

    /**
    * 获取-微信实名认证用户授权地址
    * @return txuserauthurl
     */
    public String getTxuserauthurl() {
        return txuserauthurl;
    }

    /**
    * 设置-微信实名认证用户授权地址
    * @paramType java.lang.String
    * @param txuserauthurl - 微信实名认证用户授权地址
     */
    public void setTxuserauthurl(String txuserauthurl) {
        this.txuserauthurl = txuserauthurl;
    }

    /**
    * 获取-微信实名认证用户授权回调地址
    * @return txauthredirecturl
     */
    public String getTxauthredirecturl() {
        return txauthredirecturl;
    }

    /**
    * 设置-微信实名认证用户授权回调地址
    * @paramType java.lang.String
    * @param txauthredirecturl - 微信实名认证用户授权回调地址
     */
    public void setTxauthredirecturl(String txauthredirecturl) {
        this.txauthredirecturl = txauthredirecturl;
    }

    /**
    * 获取-微信公众号支付实名认证保险下单接口
    * @return wxauthJsapiurl
     */
    public String getWxauthJsapiurl() {
        return wxauthJsapiurl;
    }

    /**
    * 设置-微信公众号支付实名认证保险下单接口
    * @paramType java.lang.String
    * @param wxauthJsapiurl - 微信公众号支付实名认证保险下单接口
     */
    public void setWxauthJsapiurl(String wxauthJsapiurl) {
        this.wxauthJsapiurl = wxauthJsapiurl;
    }

    /**
    * 获取-银行网关地址备用
    * @return requestUrl2
     */
    public String getRequestUrl2() {
        return requestUrl2;
    }

    /**
    * 设置-银行网关地址备用
    * @paramType java.lang.String
    * @param requestUrl2 - 银行网关地址备用
     */
    public void setRequestUrl2(String requestUrl2) {
        this.requestUrl2 = requestUrl2;
    }

    /**
    * 获取-订单查询接口地址
    * @return orderqueryUrl
     */
    public String getOrderqueryUrl() {
        return orderqueryUrl;
    }

    /**
    * 设置-订单查询接口地址
    * @paramType java.lang.String
    * @param orderqueryUrl - 订单查询接口地址
     */
    public void setOrderqueryUrl(String orderqueryUrl) {
        this.orderqueryUrl = orderqueryUrl;
    }

    /**
    * 获取-订单查询接口地址备用
    * @return orderqueryUrl2
     */
    public String getOrderqueryUrl2() {
        return orderqueryUrl2;
    }

    /**
    * 设置-订单查询接口地址备用
    * @paramType java.lang.String
    * @param orderqueryUrl2 - 订单查询接口地址备用
     */
    public void setOrderqueryUrl2(String orderqueryUrl2) {
        this.orderqueryUrl2 = orderqueryUrl2;
    }

    /**
    * 获取-验签公钥
    * @return checkkey
     */
    public String getCheckkey() {
        return checkkey;
    }

    /**
    * 设置-验签公钥
    * @paramType java.lang.String
    * @param checkkey - 验签公钥
     */
    public void setCheckkey(String checkkey) {
        this.checkkey = checkkey;
    }

    /**
    * 获取-招行接口调用校验头信息
    * @return appid
     */
    public String getAppid() {
        return appid;
    }

    /**
    * 设置-招行接口调用校验头信息
    * @paramType java.lang.String
    * @param appid - 招行接口调用校验头信息
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
    * 获取-招行接口调用校验头信息
    * @return appsecret
     */
    public String getAppsecret() {
        return appsecret;
    }

    /**
    * 设置-招行接口调用校验头信息
    * @paramType java.lang.String
    * @param appsecret - 招行接口调用校验头信息
     */
    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }

    /**
    * 获取-招行关闭订单地址
    * @return ordercloseUrl
     */
    public String getOrdercloseUrl() {
        return ordercloseUrl;
    }

    /**
    * 设置-招行关闭订单地址
    * @paramType java.lang.String
    * @param ordercloseUrl - 招行关闭订单地址
     */
    public void setOrdercloseUrl(String ordercloseUrl) {
        this.ordercloseUrl = ordercloseUrl;
    }

    /**
    * 获取-终端号
    * @return tid
     */
    public String getTid() {
        return tid;
    }

    /**
    * 设置-终端号
    * @paramType java.lang.String
    * @param tid - 终端号
     */
    public void setTid(String tid) {
        this.tid = tid;
    }

    /**
    * 获取-业务类型
    * @return instmid
     */
    public String getInstmid() {
        return instmid;
    }

    /**
    * 设置-业务类型
    * @paramType java.lang.String
    * @param instmid - 业务类型
     */
    public void setInstmid(String instmid) {
        this.instmid = instmid;
    }

    /**
    * 获取-车险实名模式(中保信模式为 CIITC；深圳模式为 SZ；江苏模式为 JS；上海模式为 SH；不验证模式为NF)
    * @return fixinsurance
     */
    public String getFixinsurance() {
        return fixinsurance;
    }

    /**
    * 设置-车险实名模式(中保信模式为 CIITC；深圳模式为 SZ；江苏模式为 JS；上海模式为 SH；不验证模式为NF)
    * @paramType java.lang.String
    * @param fixinsurance - 车险实名模式(中保信模式为 CIITC；深圳模式为 SZ；江苏模式为 JS；上海模式为 SH；不验证模式为NF)
     */
    public void setFixinsurance(String fixinsurance) {
        this.fixinsurance = fixinsurance;
    }

    /**
    * 获取-认证方式
    * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    /**
    * 设置-认证方式
    * @paramType java.lang.String
    * @param authorization - 认证方式
     */
    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    /**
    * 获取-银商分配的 4 位来源编号
    * @return msgsrcid
     */
    public String getMsgsrcid() {
        return msgsrcid;
    }

    /**
    * 设置-银商分配的 4 位来源编号
    * @paramType java.lang.String
    * @param msgsrcid - 银商分配的 4 位来源编号
     */
    public void setMsgsrcid(String msgsrcid) {
        this.msgsrcid = msgsrcid;
    }

    /**
    * 获取-商户证书地址
    * @return mchCert
     */
    public String getMchCert() {
        return mchCert;
    }

    /**
    * 设置-商户证书地址
    * @paramType java.lang.String
    * @param mchCert - 商户证书地址
     */
    public void setMchCert(String mchCert) {
        this.mchCert = mchCert;
    }

    /**
    * 获取-前端支付页面地址
    * @return payPageUrl
     */
    public String getPayPageUrl() {
        return payPageUrl;
    }

    /**
    * 设置-前端支付页面地址
    * @paramType java.lang.String
    * @param payPageUrl - 前端支付页面地址
     */
    public void setPayPageUrl(String payPageUrl) {
        this.payPageUrl = payPageUrl;
    }
}