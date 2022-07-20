package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_defaultset_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmDefaultsetTc {
    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 日结单分类类型
     */
    private String dailyaudittype;

    /**
     * 0： 不控制，允许操作员自行录入客户名，客户id系统全部记为0 1： 控制，所有客户信息必须选自客户管理系统
     */
    private String ifcuscontrol;

    /**
     * 是否开通双账期
     */
    private String nextflag;

    /**
     * 0 不是逐级内往 1 是逐级内往
     */
    private String ifgradually;

    /**
     * 如果是0表示不需要控制
     */
    private BigDecimal passvaliddays;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 打印工具
     */
    private String printtool;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * 是否允许多对多的匹配
     */
    private String manytomany;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 是否控制预收应付内往 用于控制收款放预收、待付时是否允许跨财务机构： 0 不允许跨财务机构，不允许跨分公司 1 允许跨财务机构，但是不允许跨分公司 2 允许跨财务机构，允许跨分公司 注意： 财务机构和分公司都应该是根据选择的业务部门来获取的，必须保证这三者的一致性
     */
    private String ifunitcontrol;

    /**
     * 0 不控制 1 控制现金账户余额个人余额不能小于零 2 控制现金账户隔热余额和银行账户余额不能小于零 注意： 不存在银行账户个人余额的概念，因此我们不需要关心power表里面的银行账户余额问题； 另外，永远不要控制虚拟账户的余额
     */
    private String ifbalancecontrol;

    /**
     * 查询天数跨度
     */
    private BigDecimal querydays;

    /**
     * 0:控制时间段周一到周五9：0019：00 1:不做业务日结复核 2:不控制
     */
    private String ifstopaudit;

    /**
     * 可用的服务器IP，IP分割符为‘:’。如果为NULL或“”或ALL或all时，不校验
     */
    private String availableserverips;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 外币保单的可结算次数
     */
    private BigDecimal settleoptimes;

    /**
     * 是否从p13登陆
     */
    private String ifp13login;

    /**
     * 新见费出单起始时间
     */
    private Date newinpaymentdate;

    /**
     * 是否走新出单
     */
    private String ifnewinpayment;

    /**
     * 字段值为8位的控制代码，控制待付款支付方式，对应PAYMENTMETHOD字段：0不启用该控制、1启用控制， 其中00000001：控制手续费、佣金；00000010：控制退保批单；00000100：控制赔款，其他字段备用
     */
    private String ifcontrolpaytype;

    /**
     * add by zx 20130427
     */
    private String ifselectsmall;

    /**
     * 是否银行支付
     */
    private String ifbankpay;

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
    * 获取-日结单分类类型
    * @return dailyaudittype
     */
    public String getDailyaudittype() {
        return dailyaudittype;
    }

    /**
    * 设置-日结单分类类型
    * @paramType java.lang.String
    * @param dailyaudittype - 日结单分类类型
     */
    public void setDailyaudittype(String dailyaudittype) {
        this.dailyaudittype = dailyaudittype;
    }

    /**
    * 获取-0： 不控制，允许操作员自行录入客户名，客户id系统全部记为0 1： 控制，所有客户信息必须选自客户管理系统
    * @return ifcuscontrol
     */
    public String getIfcuscontrol() {
        return ifcuscontrol;
    }

    /**
    * 设置-0： 不控制，允许操作员自行录入客户名，客户id系统全部记为0 1： 控制，所有客户信息必须选自客户管理系统
    * @paramType java.lang.String
    * @param ifcuscontrol - 0： 不控制，允许操作员自行录入客户名，客户id系统全部记为0 1： 控制，所有客户信息必须选自客户管理系统
     */
    public void setIfcuscontrol(String ifcuscontrol) {
        this.ifcuscontrol = ifcuscontrol;
    }

    /**
    * 获取-是否开通双账期
    * @return nextflag
     */
    public String getNextflag() {
        return nextflag;
    }

    /**
    * 设置-是否开通双账期
    * @paramType java.lang.String
    * @param nextflag - 是否开通双账期
     */
    public void setNextflag(String nextflag) {
        this.nextflag = nextflag;
    }

    /**
    * 获取-0 不是逐级内往 1 是逐级内往
    * @return ifgradually
     */
    public String getIfgradually() {
        return ifgradually;
    }

    /**
    * 设置-0 不是逐级内往 1 是逐级内往
    * @paramType java.lang.String
    * @param ifgradually - 0 不是逐级内往 1 是逐级内往
     */
    public void setIfgradually(String ifgradually) {
        this.ifgradually = ifgradually;
    }

    /**
    * 获取-如果是0表示不需要控制
    * @return passvaliddays
     */
    public BigDecimal getPassvaliddays() {
        return passvaliddays;
    }

    /**
    * 设置-如果是0表示不需要控制
    * @paramType java.math.BigDecimal
    * @param passvaliddays - 如果是0表示不需要控制
     */
    public void setPassvaliddays(BigDecimal passvaliddays) {
        this.passvaliddays = passvaliddays;
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
    * 获取-打印工具
    * @return printtool
     */
    public String getPrinttool() {
        return printtool;
    }

    /**
    * 设置-打印工具
    * @paramType java.lang.String
    * @param printtool - 打印工具
     */
    public void setPrinttool(String printtool) {
        this.printtool = printtool;
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
    * 获取-是否允许多对多的匹配
    * @return manytomany
     */
    public String getManytomany() {
        return manytomany;
    }

    /**
    * 设置-是否允许多对多的匹配
    * @paramType java.lang.String
    * @param manytomany - 是否允许多对多的匹配
     */
    public void setManytomany(String manytomany) {
        this.manytomany = manytomany;
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
    * 获取-是否控制预收应付内往 用于控制收款放预收、待付时是否允许跨财务机构： 0 不允许跨财务机构，不允许跨分公司 1 允许跨财务机构，但是不允许跨分公司 2 允许跨财务机构，允许跨分公司 注意： 财务机构和分公司都应该是根据选择的业务部门来获取的，必须保证这三者的一致性
    * @return ifunitcontrol
     */
    public String getIfunitcontrol() {
        return ifunitcontrol;
    }

    /**
    * 设置-是否控制预收应付内往 用于控制收款放预收、待付时是否允许跨财务机构： 0 不允许跨财务机构，不允许跨分公司 1 允许跨财务机构，但是不允许跨分公司 2 允许跨财务机构，允许跨分公司 注意： 财务机构和分公司都应该是根据选择的业务部门来获取的，必须保证这三者的一致性
    * @paramType java.lang.String
    * @param ifunitcontrol - 是否控制预收应付内往 用于控制收款放预收、待付时是否允许跨财务机构： 0 不允许跨财务机构，不允许跨分公司 1 允许跨财务机构，但是不允许跨分公司 2 允许跨财务机构，允许跨分公司 注意： 财务机构和分公司都应该是根据选择的业务部门来获取的，必须保证这三者的一致性
     */
    public void setIfunitcontrol(String ifunitcontrol) {
        this.ifunitcontrol = ifunitcontrol;
    }

    /**
    * 获取-0 不控制 1 控制现金账户余额个人余额不能小于零 2 控制现金账户隔热余额和银行账户余额不能小于零 注意： 不存在银行账户个人余额的概念，因此我们不需要关心power表里面的银行账户余额问题； 另外，永远不要控制虚拟账户的余额
    * @return ifbalancecontrol
     */
    public String getIfbalancecontrol() {
        return ifbalancecontrol;
    }

    /**
    * 设置-0 不控制 1 控制现金账户余额个人余额不能小于零 2 控制现金账户隔热余额和银行账户余额不能小于零 注意： 不存在银行账户个人余额的概念，因此我们不需要关心power表里面的银行账户余额问题； 另外，永远不要控制虚拟账户的余额
    * @paramType java.lang.String
    * @param ifbalancecontrol - 0 不控制 1 控制现金账户余额个人余额不能小于零 2 控制现金账户隔热余额和银行账户余额不能小于零 注意： 不存在银行账户个人余额的概念，因此我们不需要关心power表里面的银行账户余额问题； 另外，永远不要控制虚拟账户的余额
     */
    public void setIfbalancecontrol(String ifbalancecontrol) {
        this.ifbalancecontrol = ifbalancecontrol;
    }

    /**
    * 获取-查询天数跨度
    * @return querydays
     */
    public BigDecimal getQuerydays() {
        return querydays;
    }

    /**
    * 设置-查询天数跨度
    * @paramType java.math.BigDecimal
    * @param querydays - 查询天数跨度
     */
    public void setQuerydays(BigDecimal querydays) {
        this.querydays = querydays;
    }

    /**
    * 获取-0:控制时间段周一到周五9：0019：00 1:不做业务日结复核 2:不控制
    * @return ifstopaudit
     */
    public String getIfstopaudit() {
        return ifstopaudit;
    }

    /**
    * 设置-0:控制时间段周一到周五9：0019：00 1:不做业务日结复核 2:不控制
    * @paramType java.lang.String
    * @param ifstopaudit - 0:控制时间段周一到周五9：0019：00 1:不做业务日结复核 2:不控制
     */
    public void setIfstopaudit(String ifstopaudit) {
        this.ifstopaudit = ifstopaudit;
    }

    /**
    * 获取-可用的服务器IP，IP分割符为‘:’。如果为NULL或“”或ALL或all时，不校验
    * @return availableserverips
     */
    public String getAvailableserverips() {
        return availableserverips;
    }

    /**
    * 设置-可用的服务器IP，IP分割符为‘:’。如果为NULL或“”或ALL或all时，不校验
    * @paramType java.lang.String
    * @param availableserverips - 可用的服务器IP，IP分割符为‘:’。如果为NULL或“”或ALL或all时，不校验
     */
    public void setAvailableserverips(String availableserverips) {
        this.availableserverips = availableserverips;
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
    * 获取-外币保单的可结算次数
    * @return settleoptimes
     */
    public BigDecimal getSettleoptimes() {
        return settleoptimes;
    }

    /**
    * 设置-外币保单的可结算次数
    * @paramType java.math.BigDecimal
    * @param settleoptimes - 外币保单的可结算次数
     */
    public void setSettleoptimes(BigDecimal settleoptimes) {
        this.settleoptimes = settleoptimes;
    }

    /**
    * 获取-是否从p13登陆
    * @return ifp13login
     */
    public String getIfp13login() {
        return ifp13login;
    }

    /**
    * 设置-是否从p13登陆
    * @paramType java.lang.String
    * @param ifp13login - 是否从p13登陆
     */
    public void setIfp13login(String ifp13login) {
        this.ifp13login = ifp13login;
    }

    /**
    * 获取-新见费出单起始时间
    * @return newinpaymentdate
     */
    public Date getNewinpaymentdate() {
        return newinpaymentdate;
    }

    /**
    * 设置-新见费出单起始时间
    * @paramType java.util.Date
    * @param newinpaymentdate - 新见费出单起始时间
     */
    public void setNewinpaymentdate(Date newinpaymentdate) {
        this.newinpaymentdate = newinpaymentdate;
    }

    /**
    * 获取-是否走新出单
    * @return ifnewinpayment
     */
    public String getIfnewinpayment() {
        return ifnewinpayment;
    }

    /**
    * 设置-是否走新出单
    * @paramType java.lang.String
    * @param ifnewinpayment - 是否走新出单
     */
    public void setIfnewinpayment(String ifnewinpayment) {
        this.ifnewinpayment = ifnewinpayment;
    }

    /**
    * 获取-字段值为8位的控制代码，控制待付款支付方式，对应PAYMENTMETHOD字段：0不启用该控制、1启用控制，
其中00000001：控制手续费、佣金；00000010：控制退保批单；00000100：控制赔款，其他字段备用
    * @return ifcontrolpaytype
     */
    public String getIfcontrolpaytype() {
        return ifcontrolpaytype;
    }

    /**
    * 设置-字段值为8位的控制代码，控制待付款支付方式，对应PAYMENTMETHOD字段：0不启用该控制、1启用控制，
其中00000001：控制手续费、佣金；00000010：控制退保批单；00000100：控制赔款，其他字段备用
    * @paramType java.lang.String
    * @param ifcontrolpaytype - 字段值为8位的控制代码，控制待付款支付方式，对应PAYMENTMETHOD字段：0不启用该控制、1启用控制，
其中00000001：控制手续费、佣金；00000010：控制退保批单；00000100：控制赔款，其他字段备用
     */
    public void setIfcontrolpaytype(String ifcontrolpaytype) {
        this.ifcontrolpaytype = ifcontrolpaytype;
    }

    /**
    * 获取-add by zx 20130427
    * @return ifselectsmall
     */
    public String getIfselectsmall() {
        return ifselectsmall;
    }

    /**
    * 设置-add by zx 20130427
    * @paramType java.lang.String
    * @param ifselectsmall - add by zx 20130427
     */
    public void setIfselectsmall(String ifselectsmall) {
        this.ifselectsmall = ifselectsmall;
    }

    /**
    * 获取-是否银行支付
    * @return ifbankpay
     */
    public String getIfbankpay() {
        return ifbankpay;
    }

    /**
    * 设置-是否银行支付
    * @paramType java.lang.String
    * @param ifbankpay - 是否银行支付
     */
    public void setIfbankpay(String ifbankpay) {
        this.ifbankpay = ifbankpay;
    }
}