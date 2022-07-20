package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_voucher_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmVoucherTc {
    /**
     * 业务类型一代码
     */
    private String processtype1;

    /**
     * 业务类型二代码
     */
    private String processtype2;

    /**
     * 是否内部往来(0为非内往，1为内往)
     */
    private Long ifinternalcontact;

    /**
     * 业务类型一名称，对应MM_INPAYMENTTYPE_TC.PROCESSTYPE1NAME
     */
    private String processtype1name;

    /**
     * 业务类型二名称，对应MM_INPAYMENTTYPE_TC.PROCESSTYPE2NAME
     */
    private String processtype2name;

    /**
     * 财务类型一，对应P07财务四段式第一段
     */
    private String accbusiness1;

    /**
     * 财务类型二，对应P07财务四段式第二段
     */
    private String accbusiness2;

    /**
     * 财务类型三，对应P07财务四段式第三段
     */
    private String accbusiness3;

    /**
     * 财务类型四，对应P07财务四段式第四段
     */
    private String accbusiness4;

    /**
     * 账户属性，具体值同MM_ACCOUNT_TD.ACCATTRIBUTE。备用，暂时不处理
     */
    private String accattribute;

    /**
     * 借贷关系，描述业务类型组合所体现的财务中的借贷关系
     */
    private String debitandcredit;

    /**
     * 描述
     */
    private String description;

    /**
     * 是否有效，0为无效，1为有效。备用，暂时不处理
     */
    private String ifvalid;

    /**
     * 时间戳，新插入记录时的时间，默认为SYSDATE
     */
    private Date timestamp;

    /**
     * 最后操作时间，默认为SYSDATE
     */
    private Date lastopdate;

    /**
     * HIBERNATE版本号，乐观锁控制并发
     */
    private Integer hibernateversion;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
    * 获取-业务类型一代码
    * @return processtype1
     */
    public String getProcesstype1() {
        return processtype1;
    }

    /**
    * 设置-业务类型一代码
    * @paramType java.lang.String
    * @param processtype1 - 业务类型一代码
     */
    public void setProcesstype1(String processtype1) {
        this.processtype1 = processtype1;
    }

    /**
    * 获取-业务类型二代码
    * @return processtype2
     */
    public String getProcesstype2() {
        return processtype2;
    }

    /**
    * 设置-业务类型二代码
    * @paramType java.lang.String
    * @param processtype2 - 业务类型二代码
     */
    public void setProcesstype2(String processtype2) {
        this.processtype2 = processtype2;
    }

    /**
    * 获取-是否内部往来(0为非内往，1为内往)
    * @return ifinternalcontact
     */
    public Long getIfinternalcontact() {
        return ifinternalcontact;
    }

    /**
    * 设置-是否内部往来(0为非内往，1为内往)
    * @paramType java.lang.Long
    * @param ifinternalcontact - 是否内部往来(0为非内往，1为内往)
     */
    public void setIfinternalcontact(Long ifinternalcontact) {
        this.ifinternalcontact = ifinternalcontact;
    }

    /**
    * 获取-业务类型一名称，对应MM_INPAYMENTTYPE_TC.PROCESSTYPE1NAME
    * @return processtype1name
     */
    public String getProcesstype1name() {
        return processtype1name;
    }

    /**
    * 设置-业务类型一名称，对应MM_INPAYMENTTYPE_TC.PROCESSTYPE1NAME
    * @paramType java.lang.String
    * @param processtype1name - 业务类型一名称，对应MM_INPAYMENTTYPE_TC.PROCESSTYPE1NAME
     */
    public void setProcesstype1name(String processtype1name) {
        this.processtype1name = processtype1name;
    }

    /**
    * 获取-业务类型二名称，对应MM_INPAYMENTTYPE_TC.PROCESSTYPE2NAME
    * @return processtype2name
     */
    public String getProcesstype2name() {
        return processtype2name;
    }

    /**
    * 设置-业务类型二名称，对应MM_INPAYMENTTYPE_TC.PROCESSTYPE2NAME
    * @paramType java.lang.String
    * @param processtype2name - 业务类型二名称，对应MM_INPAYMENTTYPE_TC.PROCESSTYPE2NAME
     */
    public void setProcesstype2name(String processtype2name) {
        this.processtype2name = processtype2name;
    }

    /**
    * 获取-财务类型一，对应P07财务四段式第一段
    * @return accbusiness1
     */
    public String getAccbusiness1() {
        return accbusiness1;
    }

    /**
    * 设置-财务类型一，对应P07财务四段式第一段
    * @paramType java.lang.String
    * @param accbusiness1 - 财务类型一，对应P07财务四段式第一段
     */
    public void setAccbusiness1(String accbusiness1) {
        this.accbusiness1 = accbusiness1;
    }

    /**
    * 获取-财务类型二，对应P07财务四段式第二段
    * @return accbusiness2
     */
    public String getAccbusiness2() {
        return accbusiness2;
    }

    /**
    * 设置-财务类型二，对应P07财务四段式第二段
    * @paramType java.lang.String
    * @param accbusiness2 - 财务类型二，对应P07财务四段式第二段
     */
    public void setAccbusiness2(String accbusiness2) {
        this.accbusiness2 = accbusiness2;
    }

    /**
    * 获取-财务类型三，对应P07财务四段式第三段
    * @return accbusiness3
     */
    public String getAccbusiness3() {
        return accbusiness3;
    }

    /**
    * 设置-财务类型三，对应P07财务四段式第三段
    * @paramType java.lang.String
    * @param accbusiness3 - 财务类型三，对应P07财务四段式第三段
     */
    public void setAccbusiness3(String accbusiness3) {
        this.accbusiness3 = accbusiness3;
    }

    /**
    * 获取-财务类型四，对应P07财务四段式第四段
    * @return accbusiness4
     */
    public String getAccbusiness4() {
        return accbusiness4;
    }

    /**
    * 设置-财务类型四，对应P07财务四段式第四段
    * @paramType java.lang.String
    * @param accbusiness4 - 财务类型四，对应P07财务四段式第四段
     */
    public void setAccbusiness4(String accbusiness4) {
        this.accbusiness4 = accbusiness4;
    }

    /**
    * 获取-账户属性，具体值同MM_ACCOUNT_TD.ACCATTRIBUTE。备用，暂时不处理
    * @return accattribute
     */
    public String getAccattribute() {
        return accattribute;
    }

    /**
    * 设置-账户属性，具体值同MM_ACCOUNT_TD.ACCATTRIBUTE。备用，暂时不处理
    * @paramType java.lang.String
    * @param accattribute - 账户属性，具体值同MM_ACCOUNT_TD.ACCATTRIBUTE。备用，暂时不处理
     */
    public void setAccattribute(String accattribute) {
        this.accattribute = accattribute;
    }

    /**
    * 获取-借贷关系，描述业务类型组合所体现的财务中的借贷关系
    * @return debitandcredit
     */
    public String getDebitandcredit() {
        return debitandcredit;
    }

    /**
    * 设置-借贷关系，描述业务类型组合所体现的财务中的借贷关系
    * @paramType java.lang.String
    * @param debitandcredit - 借贷关系，描述业务类型组合所体现的财务中的借贷关系
     */
    public void setDebitandcredit(String debitandcredit) {
        this.debitandcredit = debitandcredit;
    }

    /**
    * 获取-描述
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-描述
    * @paramType java.lang.String
    * @param description - 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    * 获取-是否有效，0为无效，1为有效。备用，暂时不处理
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否有效，0为无效，1为有效。备用，暂时不处理
    * @paramType java.lang.String
    * @param ifvalid - 是否有效，0为无效，1为有效。备用，暂时不处理
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
    }

    /**
    * 获取-时间戳，新插入记录时的时间，默认为SYSDATE
    * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
    * 设置-时间戳，新插入记录时的时间，默认为SYSDATE
    * @paramType java.util.Date
    * @param timestamp - 时间戳，新插入记录时的时间，默认为SYSDATE
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
    * 获取-最后操作时间，默认为SYSDATE
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作时间，默认为SYSDATE
    * @paramType java.util.Date
    * @param lastopdate - 最后操作时间，默认为SYSDATE
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-HIBERNATE版本号，乐观锁控制并发
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATE版本号，乐观锁控制并发
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATE版本号，乐观锁控制并发
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
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
}