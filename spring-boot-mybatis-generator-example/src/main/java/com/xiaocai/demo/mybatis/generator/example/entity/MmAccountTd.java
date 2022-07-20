package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_account_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmAccountTd {
    /**
     * 柜面账户唯一编码
     */
    private Long mmaccountid;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 财务机构代码
     */
    private String unitcode;

    /**
     * 财务机构名称
     */
    private String unitname;

    /**
     * 账户在财务系统中的唯一编码
     */
    private String accountno;

    /**
     * 账户名称
     */
    private String accountname;

    /**
     * 币种代码
     */
    private String currencycode;

    /**
     * 开户行代码（网点代码12位cnaps号）
     */
    private String bankno;

    /**
     * 开户行银行网点名称
     */
    private String bankname;

    /**
     * 余额
     */
    private BigDecimal bankbalance;

    /**
     * 启用日期
     */
    private Date openingdate;

    /**
     * 关闭日期
     */
    private Date closingdate;

    /**
     * 账户现银属性: 1-现金账户,3-银行账户，5-内往账户 ，6-虚拟账户，8-集中付款（不使用）
     */
    private String accattribute;

    /**
     * 账户收付属性: 1 只用于收款,2 只用于付款,3 用于收款或付款
     */
    private String accattribute2;

    /**
     * 是否网上银行
     */
    private String ifnetbank;

    /**
     * 银行类型编码
     */
    private String banktype;

    /**
     * 网银签约人代码
     */
    private String assignercode;

    /**
     * 网银签约人姓名
     */
    private String assignername;

    /**
     * 网银签约日期
     */
    private Date assigndate;

    /**
     * 账户文件格式编码
     */
    private BigDecimal fromatcode;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 是否生效
     */
    private String ifvalid;

    /**
     * 银行账户在财务系统中的科目代码，或虚拟账户的科目代码
     */
    private String erpaccountcode;

    /**
     * 是否可以修改(0 不可以，1可以)
     */
    private String ifedit;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 账户所有人
     */
    private String accountowner;

    /**
     * ZZ-一般户,Z9-传统险银保合作帐户,TB-退保支出户,Z8-网销业务保费收入 ,JH-激活卡业务收入账户,Z1-保费收入专户,ZE-工资帐户,ZA-费用专用户,ZL-理财险保费收入户,Z11-外币一般户,ZC-国税专户 ,ZK-理财险费用支出户,ZH-理财险赔款支出户,Z2-银保合作帐户,ZN-理财险满期金支出户,DX-电销保费收入账户,Z5-中介费用专户 ,ZM-赔款专户,Z4-POS机专用户
     */
    private String accattribute3;

    /**
     * 财务系统中账户表主键，用于财务系统接口，据此进行账户信息的变更， 需要将上线的每一家分公司的账户表中的p07accountno对应的主键都维护进来
     */
    private String accaccountid;

    /**
     * 银行代码
     */
    private String bankcode;

    /**
     * 商户号，网银报盘时使用
     */
    private String merchantno;

    /**
     * 批量导入用的格式模板，对应mm_format_tc.formatid
     */
    private BigDecimal impformatid;

    /**
     * 银行代码名称
     */
    private String bankcodename;

    /**
     * 账户描述
     */
    private String description;

    /**
     * 备用字段1
     */
    private String segment1;

    /**
     * 备用字段2
     */
    private String segment2;

    /**
     * 备用字段3
     */
    private String segment3;

    /**
     * 备用字段4
     */
    private String segment4;

    /**
     * 银行类型编码:1 非银企直连账户  2 银企直连账户
     */
    private String ifdirect;

    /**
    * 获取-柜面账户唯一编码
    * @return mmaccountid
     */
    public Long getMmaccountid() {
        return mmaccountid;
    }

    /**
    * 设置-柜面账户唯一编码
    * @paramType java.lang.Long
    * @param mmaccountid - 柜面账户唯一编码
     */
    public void setMmaccountid(Long mmaccountid) {
        this.mmaccountid = mmaccountid;
    }

    /**
    * 获取-分公司代码
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司代码
    * @paramType java.lang.String
    * @param subcompany - 分公司代码
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-财务机构代码
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-财务机构代码
    * @paramType java.lang.String
    * @param unitcode - 财务机构代码
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    /**
    * 获取-财务机构名称
    * @return unitname
     */
    public String getUnitname() {
        return unitname;
    }

    /**
    * 设置-财务机构名称
    * @paramType java.lang.String
    * @param unitname - 财务机构名称
     */
    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    /**
    * 获取-账户在财务系统中的唯一编码
    * @return accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
    * 设置-账户在财务系统中的唯一编码
    * @paramType java.lang.String
    * @param accountno - 账户在财务系统中的唯一编码
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
    * 获取-账户名称
    * @return accountname
     */
    public String getAccountname() {
        return accountname;
    }

    /**
    * 设置-账户名称
    * @paramType java.lang.String
    * @param accountname - 账户名称
     */
    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    /**
    * 获取-币种代码
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种代码
    * @paramType java.lang.String
    * @param currencycode - 币种代码
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-开户行代码（网点代码12位cnaps号）
    * @return bankno
     */
    public String getBankno() {
        return bankno;
    }

    /**
    * 设置-开户行代码（网点代码12位cnaps号）
    * @paramType java.lang.String
    * @param bankno - 开户行代码（网点代码12位cnaps号）
     */
    public void setBankno(String bankno) {
        this.bankno = bankno;
    }

    /**
    * 获取-开户行银行网点名称
    * @return bankname
     */
    public String getBankname() {
        return bankname;
    }

    /**
    * 设置-开户行银行网点名称
    * @paramType java.lang.String
    * @param bankname - 开户行银行网点名称
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
    * 获取-余额
    * @return bankbalance
     */
    public BigDecimal getBankbalance() {
        return bankbalance;
    }

    /**
    * 设置-余额
    * @paramType java.math.BigDecimal
    * @param bankbalance - 余额
     */
    public void setBankbalance(BigDecimal bankbalance) {
        this.bankbalance = bankbalance;
    }

    /**
    * 获取-启用日期
    * @return openingdate
     */
    public Date getOpeningdate() {
        return openingdate;
    }

    /**
    * 设置-启用日期
    * @paramType java.util.Date
    * @param openingdate - 启用日期
     */
    public void setOpeningdate(Date openingdate) {
        this.openingdate = openingdate;
    }

    /**
    * 获取-关闭日期
    * @return closingdate
     */
    public Date getClosingdate() {
        return closingdate;
    }

    /**
    * 设置-关闭日期
    * @paramType java.util.Date
    * @param closingdate - 关闭日期
     */
    public void setClosingdate(Date closingdate) {
        this.closingdate = closingdate;
    }

    /**
    * 获取-账户现银属性: 1-现金账户,3-银行账户，5-内往账户 ，6-虚拟账户，8-集中付款（不使用）
    * @return accattribute
     */
    public String getAccattribute() {
        return accattribute;
    }

    /**
    * 设置-账户现银属性: 1-现金账户,3-银行账户，5-内往账户 ，6-虚拟账户，8-集中付款（不使用）
    * @paramType java.lang.String
    * @param accattribute - 账户现银属性: 1-现金账户,3-银行账户，5-内往账户 ，6-虚拟账户，8-集中付款（不使用）
     */
    public void setAccattribute(String accattribute) {
        this.accattribute = accattribute;
    }

    /**
    * 获取-账户收付属性: 1 只用于收款,2 只用于付款,3 用于收款或付款
    * @return accattribute2
     */
    public String getAccattribute2() {
        return accattribute2;
    }

    /**
    * 设置-账户收付属性: 1 只用于收款,2 只用于付款,3 用于收款或付款
    * @paramType java.lang.String
    * @param accattribute2 - 账户收付属性: 1 只用于收款,2 只用于付款,3 用于收款或付款
     */
    public void setAccattribute2(String accattribute2) {
        this.accattribute2 = accattribute2;
    }

    /**
    * 获取-是否网上银行
    * @return ifnetbank
     */
    public String getIfnetbank() {
        return ifnetbank;
    }

    /**
    * 设置-是否网上银行
    * @paramType java.lang.String
    * @param ifnetbank - 是否网上银行
     */
    public void setIfnetbank(String ifnetbank) {
        this.ifnetbank = ifnetbank;
    }

    /**
    * 获取-银行类型编码
    * @return banktype
     */
    public String getBanktype() {
        return banktype;
    }

    /**
    * 设置-银行类型编码
    * @paramType java.lang.String
    * @param banktype - 银行类型编码
     */
    public void setBanktype(String banktype) {
        this.banktype = banktype;
    }

    /**
    * 获取-网银签约人代码
    * @return assignercode
     */
    public String getAssignercode() {
        return assignercode;
    }

    /**
    * 设置-网银签约人代码
    * @paramType java.lang.String
    * @param assignercode - 网银签约人代码
     */
    public void setAssignercode(String assignercode) {
        this.assignercode = assignercode;
    }

    /**
    * 获取-网银签约人姓名
    * @return assignername
     */
    public String getAssignername() {
        return assignername;
    }

    /**
    * 设置-网银签约人姓名
    * @paramType java.lang.String
    * @param assignername - 网银签约人姓名
     */
    public void setAssignername(String assignername) {
        this.assignername = assignername;
    }

    /**
    * 获取-网银签约日期
    * @return assigndate
     */
    public Date getAssigndate() {
        return assigndate;
    }

    /**
    * 设置-网银签约日期
    * @paramType java.util.Date
    * @param assigndate - 网银签约日期
     */
    public void setAssigndate(Date assigndate) {
        this.assigndate = assigndate;
    }

    /**
    * 获取-账户文件格式编码
    * @return fromatcode
     */
    public BigDecimal getFromatcode() {
        return fromatcode;
    }

    /**
    * 设置-账户文件格式编码
    * @paramType java.math.BigDecimal
    * @param fromatcode - 账户文件格式编码
     */
    public void setFromatcode(BigDecimal fromatcode) {
        this.fromatcode = fromatcode;
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
    * 获取-最后操作日期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作日期
    * @paramType java.util.Date
    * @param lastopdate - 最后操作日期
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
    * 获取-是否生效
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否生效
    * @paramType java.lang.String
    * @param ifvalid - 是否生效
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
    }

    /**
    * 获取-银行账户在财务系统中的科目代码，或虚拟账户的科目代码
    * @return erpaccountcode
     */
    public String getErpaccountcode() {
        return erpaccountcode;
    }

    /**
    * 设置-银行账户在财务系统中的科目代码，或虚拟账户的科目代码
    * @paramType java.lang.String
    * @param erpaccountcode - 银行账户在财务系统中的科目代码，或虚拟账户的科目代码
     */
    public void setErpaccountcode(String erpaccountcode) {
        this.erpaccountcode = erpaccountcode;
    }

    /**
    * 获取-是否可以修改(0 不可以，1可以)
    * @return ifedit
     */
    public String getIfedit() {
        return ifedit;
    }

    /**
    * 设置-是否可以修改(0 不可以，1可以)
    * @paramType java.lang.String
    * @param ifedit - 是否可以修改(0 不可以，1可以)
     */
    public void setIfedit(String ifedit) {
        this.ifedit = ifedit;
    }

    /**
    * 获取-手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
    * @paramType java.lang.String
    * @param modifydesc - 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-账户所有人
    * @return accountowner
     */
    public String getAccountowner() {
        return accountowner;
    }

    /**
    * 设置-账户所有人
    * @paramType java.lang.String
    * @param accountowner - 账户所有人
     */
    public void setAccountowner(String accountowner) {
        this.accountowner = accountowner;
    }

    /**
    * 获取-ZZ-一般户,Z9-传统险银保合作帐户,TB-退保支出户,Z8-网销业务保费收入
,JH-激活卡业务收入账户,Z1-保费收入专户,ZE-工资帐户,ZA-费用专用户,ZL-理财险保费收入户,Z11-外币一般户,ZC-国税专户
,ZK-理财险费用支出户,ZH-理财险赔款支出户,Z2-银保合作帐户,ZN-理财险满期金支出户,DX-电销保费收入账户,Z5-中介费用专户
,ZM-赔款专户,Z4-POS机专用户
    * @return accattribute3
     */
    public String getAccattribute3() {
        return accattribute3;
    }

    /**
    * 设置-ZZ-一般户,Z9-传统险银保合作帐户,TB-退保支出户,Z8-网销业务保费收入
,JH-激活卡业务收入账户,Z1-保费收入专户,ZE-工资帐户,ZA-费用专用户,ZL-理财险保费收入户,Z11-外币一般户,ZC-国税专户
,ZK-理财险费用支出户,ZH-理财险赔款支出户,Z2-银保合作帐户,ZN-理财险满期金支出户,DX-电销保费收入账户,Z5-中介费用专户
,ZM-赔款专户,Z4-POS机专用户
    * @paramType java.lang.String
    * @param accattribute3 - ZZ-一般户,Z9-传统险银保合作帐户,TB-退保支出户,Z8-网销业务保费收入
,JH-激活卡业务收入账户,Z1-保费收入专户,ZE-工资帐户,ZA-费用专用户,ZL-理财险保费收入户,Z11-外币一般户,ZC-国税专户
,ZK-理财险费用支出户,ZH-理财险赔款支出户,Z2-银保合作帐户,ZN-理财险满期金支出户,DX-电销保费收入账户,Z5-中介费用专户
,ZM-赔款专户,Z4-POS机专用户
     */
    public void setAccattribute3(String accattribute3) {
        this.accattribute3 = accattribute3;
    }

    /**
    * 获取-财务系统中账户表主键，用于财务系统接口，据此进行账户信息的变更，
需要将上线的每一家分公司的账户表中的p07accountno对应的主键都维护进来
    * @return accaccountid
     */
    public String getAccaccountid() {
        return accaccountid;
    }

    /**
    * 设置-财务系统中账户表主键，用于财务系统接口，据此进行账户信息的变更，
需要将上线的每一家分公司的账户表中的p07accountno对应的主键都维护进来
    * @paramType java.lang.String
    * @param accaccountid - 财务系统中账户表主键，用于财务系统接口，据此进行账户信息的变更，
需要将上线的每一家分公司的账户表中的p07accountno对应的主键都维护进来
     */
    public void setAccaccountid(String accaccountid) {
        this.accaccountid = accaccountid;
    }

    /**
    * 获取-银行代码
    * @return bankcode
     */
    public String getBankcode() {
        return bankcode;
    }

    /**
    * 设置-银行代码
    * @paramType java.lang.String
    * @param bankcode - 银行代码
     */
    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    /**
    * 获取-商户号，网银报盘时使用
    * @return merchantno
     */
    public String getMerchantno() {
        return merchantno;
    }

    /**
    * 设置-商户号，网银报盘时使用
    * @paramType java.lang.String
    * @param merchantno - 商户号，网银报盘时使用
     */
    public void setMerchantno(String merchantno) {
        this.merchantno = merchantno;
    }

    /**
    * 获取-批量导入用的格式模板，对应mm_format_tc.formatid
    * @return impformatid
     */
    public BigDecimal getImpformatid() {
        return impformatid;
    }

    /**
    * 设置-批量导入用的格式模板，对应mm_format_tc.formatid
    * @paramType java.math.BigDecimal
    * @param impformatid - 批量导入用的格式模板，对应mm_format_tc.formatid
     */
    public void setImpformatid(BigDecimal impformatid) {
        this.impformatid = impformatid;
    }

    /**
    * 获取-银行代码名称
    * @return bankcodename
     */
    public String getBankcodename() {
        return bankcodename;
    }

    /**
    * 设置-银行代码名称
    * @paramType java.lang.String
    * @param bankcodename - 银行代码名称
     */
    public void setBankcodename(String bankcodename) {
        this.bankcodename = bankcodename;
    }

    /**
    * 获取-账户描述
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-账户描述
    * @paramType java.lang.String
    * @param description - 账户描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    * 获取-备用字段1
    * @return segment1
     */
    public String getSegment1() {
        return segment1;
    }

    /**
    * 设置-备用字段1
    * @paramType java.lang.String
    * @param segment1 - 备用字段1
     */
    public void setSegment1(String segment1) {
        this.segment1 = segment1;
    }

    /**
    * 获取-备用字段2
    * @return segment2
     */
    public String getSegment2() {
        return segment2;
    }

    /**
    * 设置-备用字段2
    * @paramType java.lang.String
    * @param segment2 - 备用字段2
     */
    public void setSegment2(String segment2) {
        this.segment2 = segment2;
    }

    /**
    * 获取-备用字段3
    * @return segment3
     */
    public String getSegment3() {
        return segment3;
    }

    /**
    * 设置-备用字段3
    * @paramType java.lang.String
    * @param segment3 - 备用字段3
     */
    public void setSegment3(String segment3) {
        this.segment3 = segment3;
    }

    /**
    * 获取-备用字段4
    * @return segment4
     */
    public String getSegment4() {
        return segment4;
    }

    /**
    * 设置-备用字段4
    * @paramType java.lang.String
    * @param segment4 - 备用字段4
     */
    public void setSegment4(String segment4) {
        this.segment4 = segment4;
    }

    /**
    * 获取-银行类型编码:1 非银企直连账户  2 银企直连账户
    * @return ifdirect
     */
    public String getIfdirect() {
        return ifdirect;
    }

    /**
    * 设置-银行类型编码:1 非银企直连账户  2 银企直连账户
    * @paramType java.lang.String
    * @param ifdirect - 银行类型编码:1 非银企直连账户  2 银企直连账户
     */
    public void setIfdirect(String ifdirect) {
        this.ifdirect = ifdirect;
    }
}