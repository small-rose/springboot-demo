package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_platformfile_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPlatformfileTd {
    /**
     * 主键
     */
    private String id;

    /**
     * 财务机构代码
     */
    private String unitcode;

    /**
     * 批次号
     */
    private String batchno;

    /**
     * 账户id
     */
    private Long mmaccountid;

    /**
     * 账户号码
     */
    private String accountno;

    /**
     * 交易平台id
     */
    private String platformid;

    /**
     * 盘片对应明细记录的记录数
     */
    private BigDecimal detailcount;

    /**
     * 盘片对应明细记录的总金额
     */
    private BigDecimal sumamount;

    /**
     * 盘片文件下载路径
     */
    private String filepath;

    /**
     * 操作员
     */
    private String opcode;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 导出日期
     */
    private String outputdate;

    /**
     * 导出时间，默认000000
     */
    private String optime;

    /**
     * 时间戳
     */
    private Date createdate;

    /**
     * 最后操作人代码
     */
    private String lastopcode;

    /**
     * 最后修改时间
     */
    private Date lastopdate;

    /**
     * 修改说明
     */
    private String modifydesc;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 盘片状态 1无需下载 2盘片待下载 3作废 4已下载 5回盘中 6回盘完成
     */
    private String filestatus;

    /**
     * 盘片下载次数
     */
    private Integer downloadcounts;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 贷方总金额，即收款总金额
     */
    private BigDecimal crsumamount;

    /**
     * 贷方总记录
     */
    private Integer crsumcount;

    /**
     * 借方总金额，即付款总金额
     */
    private BigDecimal drsumamount;

    /**
     * 借方总记录
     */
    private Integer drsumcount;

    /**
     * 商户号，网银报盘时使用
     */
    private String merchantno;

    /**
     * 盘片文件名（含后缀，不含文件路径）
     */
    private String filename;

    /**
     * 成功总笔数
     */
    private BigDecimal successcount;

    /**
     * 成功总金额
     */
    private BigDecimal successamount;

    /**
     * 失败总笔数
     */
    private BigDecimal failcount;

    /**
     * 失败总金额
     */
    private BigDecimal failamount;

    /**
    * 获取-主键
    * @return id
     */
    public String getId() {
        return id;
    }

    /**
    * 设置-主键
    * @paramType java.lang.String
    * @param id - 主键
     */
    public void setId(String id) {
        this.id = id;
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
    * 获取-批次号
    * @return batchno
     */
    public String getBatchno() {
        return batchno;
    }

    /**
    * 设置-批次号
    * @paramType java.lang.String
    * @param batchno - 批次号
     */
    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    /**
    * 获取-账户id
    * @return mmaccountid
     */
    public Long getMmaccountid() {
        return mmaccountid;
    }

    /**
    * 设置-账户id
    * @paramType java.lang.Long
    * @param mmaccountid - 账户id
     */
    public void setMmaccountid(Long mmaccountid) {
        this.mmaccountid = mmaccountid;
    }

    /**
    * 获取-账户号码
    * @return accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
    * 设置-账户号码
    * @paramType java.lang.String
    * @param accountno - 账户号码
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
    * 获取-交易平台id
    * @return platformid
     */
    public String getPlatformid() {
        return platformid;
    }

    /**
    * 设置-交易平台id
    * @paramType java.lang.String
    * @param platformid - 交易平台id
     */
    public void setPlatformid(String platformid) {
        this.platformid = platformid;
    }

    /**
    * 获取-盘片对应明细记录的记录数
    * @return detailcount
     */
    public BigDecimal getDetailcount() {
        return detailcount;
    }

    /**
    * 设置-盘片对应明细记录的记录数
    * @paramType java.math.BigDecimal
    * @param detailcount - 盘片对应明细记录的记录数
     */
    public void setDetailcount(BigDecimal detailcount) {
        this.detailcount = detailcount;
    }

    /**
    * 获取-盘片对应明细记录的总金额
    * @return sumamount
     */
    public BigDecimal getSumamount() {
        return sumamount;
    }

    /**
    * 设置-盘片对应明细记录的总金额
    * @paramType java.math.BigDecimal
    * @param sumamount - 盘片对应明细记录的总金额
     */
    public void setSumamount(BigDecimal sumamount) {
        this.sumamount = sumamount;
    }

    /**
    * 获取-盘片文件下载路径
    * @return filepath
     */
    public String getFilepath() {
        return filepath;
    }

    /**
    * 设置-盘片文件下载路径
    * @paramType java.lang.String
    * @param filepath - 盘片文件下载路径
     */
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    /**
    * 获取-操作员
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作员
    * @paramType java.lang.String
    * @param opcode - 操作员
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-操作日期
    * @return opdate
     */
    public Date getOpdate() {
        return opdate;
    }

    /**
    * 设置-操作日期
    * @paramType java.util.Date
    * @param opdate - 操作日期
     */
    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }

    /**
    * 获取-导出日期
    * @return outputdate
     */
    public String getOutputdate() {
        return outputdate;
    }

    /**
    * 设置-导出日期
    * @paramType java.lang.String
    * @param outputdate - 导出日期
     */
    public void setOutputdate(String outputdate) {
        this.outputdate = outputdate;
    }

    /**
    * 获取-导出时间，默认000000
    * @return optime
     */
    public String getOptime() {
        return optime;
    }

    /**
    * 设置-导出时间，默认000000
    * @paramType java.lang.String
    * @param optime - 导出时间，默认000000
     */
    public void setOptime(String optime) {
        this.optime = optime;
    }

    /**
    * 获取-时间戳
    * @return createdate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
    * 设置-时间戳
    * @paramType java.util.Date
    * @param createdate - 时间戳
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
    * 获取-最后操作人代码
    * @return lastopcode
     */
    public String getLastopcode() {
        return lastopcode;
    }

    /**
    * 设置-最后操作人代码
    * @paramType java.lang.String
    * @param lastopcode - 最后操作人代码
     */
    public void setLastopcode(String lastopcode) {
        this.lastopcode = lastopcode;
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
    * 获取-修改说明
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-修改说明
    * @paramType java.lang.String
    * @param modifydesc - 修改说明
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
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
    * 获取-盘片状态 1无需下载 2盘片待下载 3作废 4已下载 5回盘中 6回盘完成
    * @return filestatus
     */
    public String getFilestatus() {
        return filestatus;
    }

    /**
    * 设置-盘片状态 1无需下载 2盘片待下载 3作废 4已下载 5回盘中 6回盘完成
    * @paramType java.lang.String
    * @param filestatus - 盘片状态 1无需下载 2盘片待下载 3作废 4已下载 5回盘中 6回盘完成
     */
    public void setFilestatus(String filestatus) {
        this.filestatus = filestatus;
    }

    /**
    * 获取-盘片下载次数
    * @return downloadcounts
     */
    public Integer getDownloadcounts() {
        return downloadcounts;
    }

    /**
    * 设置-盘片下载次数
    * @paramType java.lang.Integer
    * @param downloadcounts - 盘片下载次数
     */
    public void setDownloadcounts(Integer downloadcounts) {
        this.downloadcounts = downloadcounts;
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
    * 获取-贷方总金额，即收款总金额
    * @return crsumamount
     */
    public BigDecimal getCrsumamount() {
        return crsumamount;
    }

    /**
    * 设置-贷方总金额，即收款总金额
    * @paramType java.math.BigDecimal
    * @param crsumamount - 贷方总金额，即收款总金额
     */
    public void setCrsumamount(BigDecimal crsumamount) {
        this.crsumamount = crsumamount;
    }

    /**
    * 获取-贷方总记录
    * @return crsumcount
     */
    public Integer getCrsumcount() {
        return crsumcount;
    }

    /**
    * 设置-贷方总记录
    * @paramType java.lang.Integer
    * @param crsumcount - 贷方总记录
     */
    public void setCrsumcount(Integer crsumcount) {
        this.crsumcount = crsumcount;
    }

    /**
    * 获取-借方总金额，即付款总金额
    * @return drsumamount
     */
    public BigDecimal getDrsumamount() {
        return drsumamount;
    }

    /**
    * 设置-借方总金额，即付款总金额
    * @paramType java.math.BigDecimal
    * @param drsumamount - 借方总金额，即付款总金额
     */
    public void setDrsumamount(BigDecimal drsumamount) {
        this.drsumamount = drsumamount;
    }

    /**
    * 获取-借方总记录
    * @return drsumcount
     */
    public Integer getDrsumcount() {
        return drsumcount;
    }

    /**
    * 设置-借方总记录
    * @paramType java.lang.Integer
    * @param drsumcount - 借方总记录
     */
    public void setDrsumcount(Integer drsumcount) {
        this.drsumcount = drsumcount;
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
    * 获取-盘片文件名（含后缀，不含文件路径）
    * @return filename
     */
    public String getFilename() {
        return filename;
    }

    /**
    * 设置-盘片文件名（含后缀，不含文件路径）
    * @paramType java.lang.String
    * @param filename - 盘片文件名（含后缀，不含文件路径）
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
    * 获取-成功总笔数
    * @return successcount
     */
    public BigDecimal getSuccesscount() {
        return successcount;
    }

    /**
    * 设置-成功总笔数
    * @paramType java.math.BigDecimal
    * @param successcount - 成功总笔数
     */
    public void setSuccesscount(BigDecimal successcount) {
        this.successcount = successcount;
    }

    /**
    * 获取-成功总金额
    * @return successamount
     */
    public BigDecimal getSuccessamount() {
        return successamount;
    }

    /**
    * 设置-成功总金额
    * @paramType java.math.BigDecimal
    * @param successamount - 成功总金额
     */
    public void setSuccessamount(BigDecimal successamount) {
        this.successamount = successamount;
    }

    /**
    * 获取-失败总笔数
    * @return failcount
     */
    public BigDecimal getFailcount() {
        return failcount;
    }

    /**
    * 设置-失败总笔数
    * @paramType java.math.BigDecimal
    * @param failcount - 失败总笔数
     */
    public void setFailcount(BigDecimal failcount) {
        this.failcount = failcount;
    }

    /**
    * 获取-失败总金额
    * @return failamount
     */
    public BigDecimal getFailamount() {
        return failamount;
    }

    /**
    * 设置-失败总金额
    * @paramType java.math.BigDecimal
    * @param failamount - 失败总金额
     */
    public void setFailamount(BigDecimal failamount) {
        this.failamount = failamount;
    }
}