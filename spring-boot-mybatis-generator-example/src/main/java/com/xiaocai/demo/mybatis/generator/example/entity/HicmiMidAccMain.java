package com.xiaocai.demo.mybatis.generator.example.entity;

/**
 *  
 * @Table : hicmi_mid_acc_main
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class HicmiMidAccMain {
    /**
     * 主键
     */
    private Long id;

    /**
     * 主表主键
     */
    private Long trdnm;

    /**
     * 所属集团编码
     */
    private String pkGroup;

    /**
     * 制单人编码
     */
    private String pkPrepared;

    /**
     * 业务单元编码
     */
    private String pkOrg;

    /**
     * 组织版本编码
     */
    private String pkOrgV;

    /**
     * 凭证类别
     */
    private String pkVouchertype;

    /**
     * 会计年度
     */
    private String cYear;

    /**
     * 来源系统
     */
    private String pkSystem;

    /**
     * 凭证类型值
     */
    private Byte voucherkind;

    /**
     * 核算账簿编码
     */
    private String pkAccountingbook;

    /**
     * 作废标志（Y/N）
     */
    private String discardflag;

    /**
     * 会计期间
     */
    private String period;

    /**
     * 凭证号
     */
    private Integer cNo;

    /**
     * 附单据数
     */
    private Integer attachment;

    /**
     * 制单日期
     */
    private String prepareddate;

    /**
     * 出纳
     */
    private String pkCasher;

    /**
     * 签字标志（此字段应填写？Y/N）
     */
    private String signflag;

    /**
     * 审核人
     */
    private String pkChecked;

    /**
     * 记账日期
     */
    private String tallydate;

    /**
     * 记账人
     */
    private String pkManager;

    /**
     * 同步状态（0=未同步，1=成功，9=失败）
     */
    private String translateStatus;

    /**
     * 同步错误原因
     */
    private String translateMes;

    /**
     * ERP主键
     */
    private String pkNcid;

    /**
     * 汇总日志表唯一标识
     */
    private String batchno;

    /**
     * 备用1
     */
    private String free1;

    /**
     * 备用2
     */
    private String free2;

    /**
     * 备用3
     */
    private String free3;

    /**
     * 备用4
     */
    private String free4;

    /**
     * 备用5
     */
    private String free5;

    /**
     * 备用6
     */
    private String free6;

    /**
     * 备用7
     */
    private String free7;

    /**
     * 备用8
     */
    private String free8;

    /**
     * 备用9
     */
    private String free9;

    /**
     * 备用10
     */
    private String free10;

    /**
     * 摘要
     */
    private String explanation;

    /**
     * 同步状态
     */
    private String status;

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
    * 获取-主表主键
    * @return trdnm
     */
    public Long getTrdnm() {
        return trdnm;
    }

    /**
    * 设置-主表主键
    * @paramType java.lang.Long
    * @param trdnm - 主表主键
     */
    public void setTrdnm(Long trdnm) {
        this.trdnm = trdnm;
    }

    /**
    * 获取-所属集团编码
    * @return pkGroup
     */
    public String getPkGroup() {
        return pkGroup;
    }

    /**
    * 设置-所属集团编码
    * @paramType java.lang.String
    * @param pkGroup - 所属集团编码
     */
    public void setPkGroup(String pkGroup) {
        this.pkGroup = pkGroup;
    }

    /**
    * 获取-制单人编码
    * @return pkPrepared
     */
    public String getPkPrepared() {
        return pkPrepared;
    }

    /**
    * 设置-制单人编码
    * @paramType java.lang.String
    * @param pkPrepared - 制单人编码
     */
    public void setPkPrepared(String pkPrepared) {
        this.pkPrepared = pkPrepared;
    }

    /**
    * 获取-业务单元编码
    * @return pkOrg
     */
    public String getPkOrg() {
        return pkOrg;
    }

    /**
    * 设置-业务单元编码
    * @paramType java.lang.String
    * @param pkOrg - 业务单元编码
     */
    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg;
    }

    /**
    * 获取-组织版本编码
    * @return pkOrgV
     */
    public String getPkOrgV() {
        return pkOrgV;
    }

    /**
    * 设置-组织版本编码
    * @paramType java.lang.String
    * @param pkOrgV - 组织版本编码
     */
    public void setPkOrgV(String pkOrgV) {
        this.pkOrgV = pkOrgV;
    }

    /**
    * 获取-凭证类别
    * @return pkVouchertype
     */
    public String getPkVouchertype() {
        return pkVouchertype;
    }

    /**
    * 设置-凭证类别
    * @paramType java.lang.String
    * @param pkVouchertype - 凭证类别
     */
    public void setPkVouchertype(String pkVouchertype) {
        this.pkVouchertype = pkVouchertype;
    }

    /**
    * 获取-会计年度
    * @return cYear
     */
    public String getcYear() {
        return cYear;
    }

    /**
    * 设置-会计年度
    * @paramType java.lang.String
    * @param cYear - 会计年度
     */
    public void setcYear(String cYear) {
        this.cYear = cYear;
    }

    /**
    * 获取-来源系统
    * @return pkSystem
     */
    public String getPkSystem() {
        return pkSystem;
    }

    /**
    * 设置-来源系统
    * @paramType java.lang.String
    * @param pkSystem - 来源系统
     */
    public void setPkSystem(String pkSystem) {
        this.pkSystem = pkSystem;
    }

    /**
    * 获取-凭证类型值
    * @return voucherkind
     */
    public Byte getVoucherkind() {
        return voucherkind;
    }

    /**
    * 设置-凭证类型值
    * @paramType java.lang.Byte
    * @param voucherkind - 凭证类型值
     */
    public void setVoucherkind(Byte voucherkind) {
        this.voucherkind = voucherkind;
    }

    /**
    * 获取-核算账簿编码
    * @return pkAccountingbook
     */
    public String getPkAccountingbook() {
        return pkAccountingbook;
    }

    /**
    * 设置-核算账簿编码
    * @paramType java.lang.String
    * @param pkAccountingbook - 核算账簿编码
     */
    public void setPkAccountingbook(String pkAccountingbook) {
        this.pkAccountingbook = pkAccountingbook;
    }

    /**
    * 获取-作废标志（Y/N）
    * @return discardflag
     */
    public String getDiscardflag() {
        return discardflag;
    }

    /**
    * 设置-作废标志（Y/N）
    * @paramType java.lang.String
    * @param discardflag - 作废标志（Y/N）
     */
    public void setDiscardflag(String discardflag) {
        this.discardflag = discardflag;
    }

    /**
    * 获取-会计期间
    * @return period
     */
    public String getPeriod() {
        return period;
    }

    /**
    * 设置-会计期间
    * @paramType java.lang.String
    * @param period - 会计期间
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
    * 获取-凭证号
    * @return cNo
     */
    public Integer getcNo() {
        return cNo;
    }

    /**
    * 设置-凭证号
    * @paramType java.lang.Integer
    * @param cNo - 凭证号
     */
    public void setcNo(Integer cNo) {
        this.cNo = cNo;
    }

    /**
    * 获取-附单据数
    * @return attachment
     */
    public Integer getAttachment() {
        return attachment;
    }

    /**
    * 设置-附单据数
    * @paramType java.lang.Integer
    * @param attachment - 附单据数
     */
    public void setAttachment(Integer attachment) {
        this.attachment = attachment;
    }

    /**
    * 获取-制单日期
    * @return prepareddate
     */
    public String getPrepareddate() {
        return prepareddate;
    }

    /**
    * 设置-制单日期
    * @paramType java.lang.String
    * @param prepareddate - 制单日期
     */
    public void setPrepareddate(String prepareddate) {
        this.prepareddate = prepareddate;
    }

    /**
    * 获取-出纳
    * @return pkCasher
     */
    public String getPkCasher() {
        return pkCasher;
    }

    /**
    * 设置-出纳
    * @paramType java.lang.String
    * @param pkCasher - 出纳
     */
    public void setPkCasher(String pkCasher) {
        this.pkCasher = pkCasher;
    }

    /**
    * 获取-签字标志（此字段应填写？Y/N）
    * @return signflag
     */
    public String getSignflag() {
        return signflag;
    }

    /**
    * 设置-签字标志（此字段应填写？Y/N）
    * @paramType java.lang.String
    * @param signflag - 签字标志（此字段应填写？Y/N）
     */
    public void setSignflag(String signflag) {
        this.signflag = signflag;
    }

    /**
    * 获取-审核人
    * @return pkChecked
     */
    public String getPkChecked() {
        return pkChecked;
    }

    /**
    * 设置-审核人
    * @paramType java.lang.String
    * @param pkChecked - 审核人
     */
    public void setPkChecked(String pkChecked) {
        this.pkChecked = pkChecked;
    }

    /**
    * 获取-记账日期
    * @return tallydate
     */
    public String getTallydate() {
        return tallydate;
    }

    /**
    * 设置-记账日期
    * @paramType java.lang.String
    * @param tallydate - 记账日期
     */
    public void setTallydate(String tallydate) {
        this.tallydate = tallydate;
    }

    /**
    * 获取-记账人
    * @return pkManager
     */
    public String getPkManager() {
        return pkManager;
    }

    /**
    * 设置-记账人
    * @paramType java.lang.String
    * @param pkManager - 记账人
     */
    public void setPkManager(String pkManager) {
        this.pkManager = pkManager;
    }

    /**
    * 获取-同步状态（0=未同步，1=成功，9=失败）
    * @return translateStatus
     */
    public String getTranslateStatus() {
        return translateStatus;
    }

    /**
    * 设置-同步状态（0=未同步，1=成功，9=失败）
    * @paramType java.lang.String
    * @param translateStatus - 同步状态（0=未同步，1=成功，9=失败）
     */
    public void setTranslateStatus(String translateStatus) {
        this.translateStatus = translateStatus;
    }

    /**
    * 获取-同步错误原因
    * @return translateMes
     */
    public String getTranslateMes() {
        return translateMes;
    }

    /**
    * 设置-同步错误原因
    * @paramType java.lang.String
    * @param translateMes - 同步错误原因
     */
    public void setTranslateMes(String translateMes) {
        this.translateMes = translateMes;
    }

    /**
    * 获取-ERP主键
    * @return pkNcid
     */
    public String getPkNcid() {
        return pkNcid;
    }

    /**
    * 设置-ERP主键
    * @paramType java.lang.String
    * @param pkNcid - ERP主键
     */
    public void setPkNcid(String pkNcid) {
        this.pkNcid = pkNcid;
    }

    /**
    * 获取-汇总日志表唯一标识
    * @return batchno
     */
    public String getBatchno() {
        return batchno;
    }

    /**
    * 设置-汇总日志表唯一标识
    * @paramType java.lang.String
    * @param batchno - 汇总日志表唯一标识
     */
    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    /**
    * 获取-备用1
    * @return free1
     */
    public String getFree1() {
        return free1;
    }

    /**
    * 设置-备用1
    * @paramType java.lang.String
    * @param free1 - 备用1
     */
    public void setFree1(String free1) {
        this.free1 = free1;
    }

    /**
    * 获取-备用2
    * @return free2
     */
    public String getFree2() {
        return free2;
    }

    /**
    * 设置-备用2
    * @paramType java.lang.String
    * @param free2 - 备用2
     */
    public void setFree2(String free2) {
        this.free2 = free2;
    }

    /**
    * 获取-备用3
    * @return free3
     */
    public String getFree3() {
        return free3;
    }

    /**
    * 设置-备用3
    * @paramType java.lang.String
    * @param free3 - 备用3
     */
    public void setFree3(String free3) {
        this.free3 = free3;
    }

    /**
    * 获取-备用4
    * @return free4
     */
    public String getFree4() {
        return free4;
    }

    /**
    * 设置-备用4
    * @paramType java.lang.String
    * @param free4 - 备用4
     */
    public void setFree4(String free4) {
        this.free4 = free4;
    }

    /**
    * 获取-备用5
    * @return free5
     */
    public String getFree5() {
        return free5;
    }

    /**
    * 设置-备用5
    * @paramType java.lang.String
    * @param free5 - 备用5
     */
    public void setFree5(String free5) {
        this.free5 = free5;
    }

    /**
    * 获取-备用6
    * @return free6
     */
    public String getFree6() {
        return free6;
    }

    /**
    * 设置-备用6
    * @paramType java.lang.String
    * @param free6 - 备用6
     */
    public void setFree6(String free6) {
        this.free6 = free6;
    }

    /**
    * 获取-备用7
    * @return free7
     */
    public String getFree7() {
        return free7;
    }

    /**
    * 设置-备用7
    * @paramType java.lang.String
    * @param free7 - 备用7
     */
    public void setFree7(String free7) {
        this.free7 = free7;
    }

    /**
    * 获取-备用8
    * @return free8
     */
    public String getFree8() {
        return free8;
    }

    /**
    * 设置-备用8
    * @paramType java.lang.String
    * @param free8 - 备用8
     */
    public void setFree8(String free8) {
        this.free8 = free8;
    }

    /**
    * 获取-备用9
    * @return free9
     */
    public String getFree9() {
        return free9;
    }

    /**
    * 设置-备用9
    * @paramType java.lang.String
    * @param free9 - 备用9
     */
    public void setFree9(String free9) {
        this.free9 = free9;
    }

    /**
    * 获取-备用10
    * @return free10
     */
    public String getFree10() {
        return free10;
    }

    /**
    * 设置-备用10
    * @paramType java.lang.String
    * @param free10 - 备用10
     */
    public void setFree10(String free10) {
        this.free10 = free10;
    }

    /**
    * 获取-摘要
    * @return explanation
     */
    public String getExplanation() {
        return explanation;
    }

    /**
    * 设置-摘要
    * @paramType java.lang.String
    * @param explanation - 摘要
     */
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    /**
    * 获取-同步状态
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-同步状态
    * @paramType java.lang.String
    * @param status - 同步状态
     */
    public void setStatus(String status) {
        this.status = status;
    }
}