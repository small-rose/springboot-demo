package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : d_recognition
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class DRecognition {
    /**
     * 主键
     */
    private Long id;

    /**
     * 平台用户代码
     */
    private String userid;

    /**
     * 识别号
     */
    private String recognitionid;

    /**
     * 终端号
     */
    private String tidno;

    /**
     * 银行ID
     */
    private String bankid;

    /**
     * pos机所属分公司代码
     */
    private String subcompany;

    /**
     * pos机所属业务部门代码
     */
    private String departmentcode;

    /**
     * pos所属商户号
     */
    private String insuMidno;

    /**
     * pos机类型1:移动pos,2固定pos
     */
    private String ptype;

    /**
     * 是否见费出单专用1:是,0:否
     */
    private String feeflag;

    /**
     * 操作人
     */
    private String opcode;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 手工修改说明
     */
    private String modifydesc;

    /**
     * 保费收入户
     */
    private String accountno;

    /**
     * 结算账户，即实际的银行账户
     */
    private String bankno;

    /**
     * 结算账户名称
     */
    private String bankname;

    /**
     * 申请号
     */
    private String applyno;

    /**
     * 终端名称
     */
    private String tidname;

    /**
     * 商户名称
     */
    private String insuMidnoName;

    /**
     * 终端安装地址
     */
    private String addr;

    /**
     * 终端联系人
     */
    private String tiduser;

    /**
     * 终端联系电话
     */
    private String tel;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否有效 0无效 1有效
     */
    private String ifvalid;

    /**
     * 1待审核 2审核通过 3删除 4审核不通过
     */
    private String opstatus;

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
    * 获取-平台用户代码
    * @return userid
     */
    public String getUserid() {
        return userid;
    }

    /**
    * 设置-平台用户代码
    * @paramType java.lang.String
    * @param userid - 平台用户代码
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
    * 获取-识别号
    * @return recognitionid
     */
    public String getRecognitionid() {
        return recognitionid;
    }

    /**
    * 设置-识别号
    * @paramType java.lang.String
    * @param recognitionid - 识别号
     */
    public void setRecognitionid(String recognitionid) {
        this.recognitionid = recognitionid;
    }

    /**
    * 获取-终端号
    * @return tidno
     */
    public String getTidno() {
        return tidno;
    }

    /**
    * 设置-终端号
    * @paramType java.lang.String
    * @param tidno - 终端号
     */
    public void setTidno(String tidno) {
        this.tidno = tidno;
    }

    /**
    * 获取-银行ID
    * @return bankid
     */
    public String getBankid() {
        return bankid;
    }

    /**
    * 设置-银行ID
    * @paramType java.lang.String
    * @param bankid - 银行ID
     */
    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    /**
    * 获取-pos机所属分公司代码
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-pos机所属分公司代码
    * @paramType java.lang.String
    * @param subcompany - pos机所属分公司代码
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-pos机所属业务部门代码
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-pos机所属业务部门代码
    * @paramType java.lang.String
    * @param departmentcode - pos机所属业务部门代码
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    /**
    * 获取-pos所属商户号
    * @return insuMidno
     */
    public String getInsuMidno() {
        return insuMidno;
    }

    /**
    * 设置-pos所属商户号
    * @paramType java.lang.String
    * @param insuMidno - pos所属商户号
     */
    public void setInsuMidno(String insuMidno) {
        this.insuMidno = insuMidno;
    }

    /**
    * 获取-pos机类型1:移动pos,2固定pos
    * @return ptype
     */
    public String getPtype() {
        return ptype;
    }

    /**
    * 设置-pos机类型1:移动pos,2固定pos
    * @paramType java.lang.String
    * @param ptype - pos机类型1:移动pos,2固定pos
     */
    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    /**
    * 获取-是否见费出单专用1:是,0:否
    * @return feeflag
     */
    public String getFeeflag() {
        return feeflag;
    }

    /**
    * 设置-是否见费出单专用1:是,0:否
    * @paramType java.lang.String
    * @param feeflag - 是否见费出单专用1:是,0:否
     */
    public void setFeeflag(String feeflag) {
        this.feeflag = feeflag;
    }

    /**
    * 获取-操作人
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作人
    * @paramType java.lang.String
    * @param opcode - 操作人
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
    * 获取-最后操作时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作时间
    * @paramType java.util.Date
    * @param lastopdate - 最后操作时间
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
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
    * 获取-保费收入户
    * @return accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
    * 设置-保费收入户
    * @paramType java.lang.String
    * @param accountno - 保费收入户
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
    * 获取-结算账户，即实际的银行账户
    * @return bankno
     */
    public String getBankno() {
        return bankno;
    }

    /**
    * 设置-结算账户，即实际的银行账户
    * @paramType java.lang.String
    * @param bankno - 结算账户，即实际的银行账户
     */
    public void setBankno(String bankno) {
        this.bankno = bankno;
    }

    /**
    * 获取-结算账户名称
    * @return bankname
     */
    public String getBankname() {
        return bankname;
    }

    /**
    * 设置-结算账户名称
    * @paramType java.lang.String
    * @param bankname - 结算账户名称
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
    * 获取-申请号
    * @return applyno
     */
    public String getApplyno() {
        return applyno;
    }

    /**
    * 设置-申请号
    * @paramType java.lang.String
    * @param applyno - 申请号
     */
    public void setApplyno(String applyno) {
        this.applyno = applyno;
    }

    /**
    * 获取-终端名称
    * @return tidname
     */
    public String getTidname() {
        return tidname;
    }

    /**
    * 设置-终端名称
    * @paramType java.lang.String
    * @param tidname - 终端名称
     */
    public void setTidname(String tidname) {
        this.tidname = tidname;
    }

    /**
    * 获取-商户名称
    * @return insuMidnoName
     */
    public String getInsuMidnoName() {
        return insuMidnoName;
    }

    /**
    * 设置-商户名称
    * @paramType java.lang.String
    * @param insuMidnoName - 商户名称
     */
    public void setInsuMidnoName(String insuMidnoName) {
        this.insuMidnoName = insuMidnoName;
    }

    /**
    * 获取-终端安装地址
    * @return addr
     */
    public String getAddr() {
        return addr;
    }

    /**
    * 设置-终端安装地址
    * @paramType java.lang.String
    * @param addr - 终端安装地址
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
    * 获取-终端联系人
    * @return tiduser
     */
    public String getTiduser() {
        return tiduser;
    }

    /**
    * 设置-终端联系人
    * @paramType java.lang.String
    * @param tiduser - 终端联系人
     */
    public void setTiduser(String tiduser) {
        this.tiduser = tiduser;
    }

    /**
    * 获取-终端联系电话
    * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
    * 设置-终端联系电话
    * @paramType java.lang.String
    * @param tel - 终端联系电话
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
    * 获取-备注
    * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param remark - 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
    * 获取-是否有效 0无效 1有效
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否有效 0无效 1有效
    * @paramType java.lang.String
    * @param ifvalid - 是否有效 0无效 1有效
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
    }

    /**
    * 获取-1待审核 2审核通过 3删除 4审核不通过
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-1待审核 2审核通过 3删除 4审核不通过
    * @paramType java.lang.String
    * @param opstatus - 1待审核 2审核通过 3删除 4审核不通过
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
    }
}