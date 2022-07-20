package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;

/**
 *  
 * @Table : mm_systemset_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmSystemsetTc {
    /**
     * 客户名称
     */
    private String customername;

    /**
     * 业务数据从TI接口表TD表时，机构转换的方式。0：无需转换；1：需要加上3位机构简称如SHH；2：依据MM_SUBCOMPANY_MAPPING_TC表的BUSSUBCOMPANY获得ERPSUBCOMPANY,写入TD表
     */
    private String def1;

    /**
     * 业务数据进入收付系统时，部门转换的方式。0：无需转换；1：保留；2：依据MM_DEPARMENT_MAPPING_TC表的BUSDEPARTMENT_TC获得ERPDEPARTMENTCODE,写入TD表
     */
    private String def2;

    /**
     * 业务数据进入收付系统时，险种转换的方式。0：无需转换；1：保留；2：依据MM_CLASSCODEMAPPING_TC表的busclasscode获得ERPCLASSESCODE,写入TD表
     */
    private String def3;

    /**
     * 打印时的公司抬头，比如日结单打印。
     */
    private String def4;

    /**
     * 日结单大类，太保：3，中银：1
     */
    private String dailyaudittype;

    /**
     * 是否允许跨机构划账 0 不允许，1 允许跨机构
     */
    private String accountto;

    /**
     * 手续费是否允许部分付款 0 不允许 1 允许
     */
    private String applyfee;

    /**
     * 收款是否可跨机构指定部门(在非匹配保单的情况下)  0 不允许 1 允许
     */
    private String inpaymentto;

    /**
     * 车船税是否判生效 0 判断,1 不判,强制生效
     */
    private String taxifeffect;

    /**
     * 手续费是否判断生效 0 不判断，都生效,1 需要判断
     */
    private String applyfeeifeffect;

    /**
     * 每页显示行数，涉及分页显示的页面，按照这个参数确定每页行数。比如太保是20，中银也许需要100
     */
    private BigDecimal pagenum;

    /**
     * 是否允许异币种收款，即直接的货币兑换，港币收美元等，0 不允许 1 允许
     */
    private String ifexchange;

    /**
     * 操作员密码是否使用MD5加密；0不加密，1加密
     */
    private String ifmd5;

    /**
     * 账户下拉框控件宽度字段(单位像素)
     */
    private BigDecimal accountcontrolsize;

    /**
     * 付款界面汇兑损益汇兑手续费输入框是否隐藏，1为隐藏，0为不隐藏
     */
    private String paymentagiotageinputhiden;

    /**
     * 新增用户时设置的默认密码
     */
    private String defaultpassword;

    /**
     * 货币兑换允许的误差率，如：0.2 表示可以上下浮动20%
     */
    private BigDecimal floating;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * tmnch双账期时，是否允许做大账期的日结 0 否  1是
     */
    private String dailyreportcontrol;

    /**
     * 人民币反洗钱限额
     */
    private BigDecimal limitedcny;

    /**
     * 美元反洗钱限额
     */
    private BigDecimal limitedusd;

    /**
     * 收付款处理菜单的导入功能中导入的excel能导入数据的最大行数
     */
    private BigDecimal importrows;

    /**
     * 控制币种结算的汇率向下手工调整的幅度，100表示不允许手工下调
     */
    private BigDecimal rateDowncontrol;

    /**
     * 汇兑损益浮动金额
     */
    private BigDecimal exchangegl;

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
    * 获取-业务数据从TI接口表TD表时，机构转换的方式。0：无需转换；1：需要加上3位机构简称如SHH；2：依据MM_SUBCOMPANY_MAPPING_TC表的BUSSUBCOMPANY获得ERPSUBCOMPANY,写入TD表
    * @return def1
     */
    public String getDef1() {
        return def1;
    }

    /**
    * 设置-业务数据从TI接口表TD表时，机构转换的方式。0：无需转换；1：需要加上3位机构简称如SHH；2：依据MM_SUBCOMPANY_MAPPING_TC表的BUSSUBCOMPANY获得ERPSUBCOMPANY,写入TD表
    * @paramType java.lang.String
    * @param def1 - 业务数据从TI接口表TD表时，机构转换的方式。0：无需转换；1：需要加上3位机构简称如SHH；2：依据MM_SUBCOMPANY_MAPPING_TC表的BUSSUBCOMPANY获得ERPSUBCOMPANY,写入TD表
     */
    public void setDef1(String def1) {
        this.def1 = def1;
    }

    /**
    * 获取-业务数据进入收付系统时，部门转换的方式。0：无需转换；1：保留；2：依据MM_DEPARMENT_MAPPING_TC表的BUSDEPARTMENT_TC获得ERPDEPARTMENTCODE,写入TD表
    * @return def2
     */
    public String getDef2() {
        return def2;
    }

    /**
    * 设置-业务数据进入收付系统时，部门转换的方式。0：无需转换；1：保留；2：依据MM_DEPARMENT_MAPPING_TC表的BUSDEPARTMENT_TC获得ERPDEPARTMENTCODE,写入TD表
    * @paramType java.lang.String
    * @param def2 - 业务数据进入收付系统时，部门转换的方式。0：无需转换；1：保留；2：依据MM_DEPARMENT_MAPPING_TC表的BUSDEPARTMENT_TC获得ERPDEPARTMENTCODE,写入TD表
     */
    public void setDef2(String def2) {
        this.def2 = def2;
    }

    /**
    * 获取-业务数据进入收付系统时，险种转换的方式。0：无需转换；1：保留；2：依据MM_CLASSCODEMAPPING_TC表的busclasscode获得ERPCLASSESCODE,写入TD表
    * @return def3
     */
    public String getDef3() {
        return def3;
    }

    /**
    * 设置-业务数据进入收付系统时，险种转换的方式。0：无需转换；1：保留；2：依据MM_CLASSCODEMAPPING_TC表的busclasscode获得ERPCLASSESCODE,写入TD表
    * @paramType java.lang.String
    * @param def3 - 业务数据进入收付系统时，险种转换的方式。0：无需转换；1：保留；2：依据MM_CLASSCODEMAPPING_TC表的busclasscode获得ERPCLASSESCODE,写入TD表
     */
    public void setDef3(String def3) {
        this.def3 = def3;
    }

    /**
    * 获取-打印时的公司抬头，比如日结单打印。
    * @return def4
     */
    public String getDef4() {
        return def4;
    }

    /**
    * 设置-打印时的公司抬头，比如日结单打印。
    * @paramType java.lang.String
    * @param def4 - 打印时的公司抬头，比如日结单打印。
     */
    public void setDef4(String def4) {
        this.def4 = def4;
    }

    /**
    * 获取-日结单大类，太保：3，中银：1
    * @return dailyaudittype
     */
    public String getDailyaudittype() {
        return dailyaudittype;
    }

    /**
    * 设置-日结单大类，太保：3，中银：1
    * @paramType java.lang.String
    * @param dailyaudittype - 日结单大类，太保：3，中银：1
     */
    public void setDailyaudittype(String dailyaudittype) {
        this.dailyaudittype = dailyaudittype;
    }

    /**
    * 获取-是否允许跨机构划账 0 不允许，1 允许跨机构
    * @return accountto
     */
    public String getAccountto() {
        return accountto;
    }

    /**
    * 设置-是否允许跨机构划账 0 不允许，1 允许跨机构
    * @paramType java.lang.String
    * @param accountto - 是否允许跨机构划账 0 不允许，1 允许跨机构
     */
    public void setAccountto(String accountto) {
        this.accountto = accountto;
    }

    /**
    * 获取-手续费是否允许部分付款 0 不允许 1 允许
    * @return applyfee
     */
    public String getApplyfee() {
        return applyfee;
    }

    /**
    * 设置-手续费是否允许部分付款 0 不允许 1 允许
    * @paramType java.lang.String
    * @param applyfee - 手续费是否允许部分付款 0 不允许 1 允许
     */
    public void setApplyfee(String applyfee) {
        this.applyfee = applyfee;
    }

    /**
    * 获取-收款是否可跨机构指定部门(在非匹配保单的情况下)  0 不允许 1 允许
    * @return inpaymentto
     */
    public String getInpaymentto() {
        return inpaymentto;
    }

    /**
    * 设置-收款是否可跨机构指定部门(在非匹配保单的情况下)  0 不允许 1 允许
    * @paramType java.lang.String
    * @param inpaymentto - 收款是否可跨机构指定部门(在非匹配保单的情况下)  0 不允许 1 允许
     */
    public void setInpaymentto(String inpaymentto) {
        this.inpaymentto = inpaymentto;
    }

    /**
    * 获取-车船税是否判生效 0 判断,1 不判,强制生效
    * @return taxifeffect
     */
    public String getTaxifeffect() {
        return taxifeffect;
    }

    /**
    * 设置-车船税是否判生效 0 判断,1 不判,强制生效
    * @paramType java.lang.String
    * @param taxifeffect - 车船税是否判生效 0 判断,1 不判,强制生效
     */
    public void setTaxifeffect(String taxifeffect) {
        this.taxifeffect = taxifeffect;
    }

    /**
    * 获取-手续费是否判断生效 0 不判断，都生效,1 需要判断
    * @return applyfeeifeffect
     */
    public String getApplyfeeifeffect() {
        return applyfeeifeffect;
    }

    /**
    * 设置-手续费是否判断生效 0 不判断，都生效,1 需要判断
    * @paramType java.lang.String
    * @param applyfeeifeffect - 手续费是否判断生效 0 不判断，都生效,1 需要判断
     */
    public void setApplyfeeifeffect(String applyfeeifeffect) {
        this.applyfeeifeffect = applyfeeifeffect;
    }

    /**
    * 获取-每页显示行数，涉及分页显示的页面，按照这个参数确定每页行数。比如太保是20，中银也许需要100
    * @return pagenum
     */
    public BigDecimal getPagenum() {
        return pagenum;
    }

    /**
    * 设置-每页显示行数，涉及分页显示的页面，按照这个参数确定每页行数。比如太保是20，中银也许需要100
    * @paramType java.math.BigDecimal
    * @param pagenum - 每页显示行数，涉及分页显示的页面，按照这个参数确定每页行数。比如太保是20，中银也许需要100
     */
    public void setPagenum(BigDecimal pagenum) {
        this.pagenum = pagenum;
    }

    /**
    * 获取-是否允许异币种收款，即直接的货币兑换，港币收美元等，0 不允许 1 允许
    * @return ifexchange
     */
    public String getIfexchange() {
        return ifexchange;
    }

    /**
    * 设置-是否允许异币种收款，即直接的货币兑换，港币收美元等，0 不允许 1 允许
    * @paramType java.lang.String
    * @param ifexchange - 是否允许异币种收款，即直接的货币兑换，港币收美元等，0 不允许 1 允许
     */
    public void setIfexchange(String ifexchange) {
        this.ifexchange = ifexchange;
    }

    /**
    * 获取-操作员密码是否使用MD5加密；0不加密，1加密
    * @return ifmd5
     */
    public String getIfmd5() {
        return ifmd5;
    }

    /**
    * 设置-操作员密码是否使用MD5加密；0不加密，1加密
    * @paramType java.lang.String
    * @param ifmd5 - 操作员密码是否使用MD5加密；0不加密，1加密
     */
    public void setIfmd5(String ifmd5) {
        this.ifmd5 = ifmd5;
    }

    /**
    * 获取-账户下拉框控件宽度字段(单位像素)
    * @return accountcontrolsize
     */
    public BigDecimal getAccountcontrolsize() {
        return accountcontrolsize;
    }

    /**
    * 设置-账户下拉框控件宽度字段(单位像素)
    * @paramType java.math.BigDecimal
    * @param accountcontrolsize - 账户下拉框控件宽度字段(单位像素)
     */
    public void setAccountcontrolsize(BigDecimal accountcontrolsize) {
        this.accountcontrolsize = accountcontrolsize;
    }

    /**
    * 获取-付款界面汇兑损益汇兑手续费输入框是否隐藏，1为隐藏，0为不隐藏
    * @return paymentagiotageinputhiden
     */
    public String getPaymentagiotageinputhiden() {
        return paymentagiotageinputhiden;
    }

    /**
    * 设置-付款界面汇兑损益汇兑手续费输入框是否隐藏，1为隐藏，0为不隐藏
    * @paramType java.lang.String
    * @param paymentagiotageinputhiden - 付款界面汇兑损益汇兑手续费输入框是否隐藏，1为隐藏，0为不隐藏
     */
    public void setPaymentagiotageinputhiden(String paymentagiotageinputhiden) {
        this.paymentagiotageinputhiden = paymentagiotageinputhiden;
    }

    /**
    * 获取-新增用户时设置的默认密码
    * @return defaultpassword
     */
    public String getDefaultpassword() {
        return defaultpassword;
    }

    /**
    * 设置-新增用户时设置的默认密码
    * @paramType java.lang.String
    * @param defaultpassword - 新增用户时设置的默认密码
     */
    public void setDefaultpassword(String defaultpassword) {
        this.defaultpassword = defaultpassword;
    }

    /**
    * 获取-货币兑换允许的误差率，如：0.2 表示可以上下浮动20%
    * @return floating
     */
    public BigDecimal getFloating() {
        return floating;
    }

    /**
    * 设置-货币兑换允许的误差率，如：0.2 表示可以上下浮动20%
    * @paramType java.math.BigDecimal
    * @param floating - 货币兑换允许的误差率，如：0.2 表示可以上下浮动20%
     */
    public void setFloating(BigDecimal floating) {
        this.floating = floating;
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
    * 获取-tmnch双账期时，是否允许做大账期的日结 0 否  1是
    * @return dailyreportcontrol
     */
    public String getDailyreportcontrol() {
        return dailyreportcontrol;
    }

    /**
    * 设置-tmnch双账期时，是否允许做大账期的日结 0 否  1是
    * @paramType java.lang.String
    * @param dailyreportcontrol - tmnch双账期时，是否允许做大账期的日结 0 否  1是
     */
    public void setDailyreportcontrol(String dailyreportcontrol) {
        this.dailyreportcontrol = dailyreportcontrol;
    }

    /**
    * 获取-人民币反洗钱限额
    * @return limitedcny
     */
    public BigDecimal getLimitedcny() {
        return limitedcny;
    }

    /**
    * 设置-人民币反洗钱限额
    * @paramType java.math.BigDecimal
    * @param limitedcny - 人民币反洗钱限额
     */
    public void setLimitedcny(BigDecimal limitedcny) {
        this.limitedcny = limitedcny;
    }

    /**
    * 获取-美元反洗钱限额
    * @return limitedusd
     */
    public BigDecimal getLimitedusd() {
        return limitedusd;
    }

    /**
    * 设置-美元反洗钱限额
    * @paramType java.math.BigDecimal
    * @param limitedusd - 美元反洗钱限额
     */
    public void setLimitedusd(BigDecimal limitedusd) {
        this.limitedusd = limitedusd;
    }

    /**
    * 获取-收付款处理菜单的导入功能中导入的excel能导入数据的最大行数
    * @return importrows
     */
    public BigDecimal getImportrows() {
        return importrows;
    }

    /**
    * 设置-收付款处理菜单的导入功能中导入的excel能导入数据的最大行数
    * @paramType java.math.BigDecimal
    * @param importrows - 收付款处理菜单的导入功能中导入的excel能导入数据的最大行数
     */
    public void setImportrows(BigDecimal importrows) {
        this.importrows = importrows;
    }

    /**
    * 获取-控制币种结算的汇率向下手工调整的幅度，100表示不允许手工下调
    * @return rateDowncontrol
     */
    public BigDecimal getRateDowncontrol() {
        return rateDowncontrol;
    }

    /**
    * 设置-控制币种结算的汇率向下手工调整的幅度，100表示不允许手工下调
    * @paramType java.math.BigDecimal
    * @param rateDowncontrol - 控制币种结算的汇率向下手工调整的幅度，100表示不允许手工下调
     */
    public void setRateDowncontrol(BigDecimal rateDowncontrol) {
        this.rateDowncontrol = rateDowncontrol;
    }

    /**
    * 获取-汇兑损益浮动金额
    * @return exchangegl
     */
    public BigDecimal getExchangegl() {
        return exchangegl;
    }

    /**
    * 设置-汇兑损益浮动金额
    * @paramType java.math.BigDecimal
    * @param exchangegl - 汇兑损益浮动金额
     */
    public void setExchangegl(BigDecimal exchangegl) {
        this.exchangegl = exchangegl;
    }
}