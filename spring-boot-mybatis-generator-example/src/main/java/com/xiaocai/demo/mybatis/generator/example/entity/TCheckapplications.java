package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : t_checkapplications
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class TCheckapplications {
    /**
     * id主键
     */
    private String id;

    /**
     * 支付申请号
     */
    private String applyno;

    /**
     * 金额
     */
    private String amount;

    /**
     * 申请时间
     */
    private Date createtime;

    /**
     * 支付方式
     */
    private String paytype;

    /**
     * 标志
     */
    private String flag;

    /**
     * 备注
     */
    private String remark;

    /**
     * 最后操作时间
     */
    private Date lasthandletime;

    /**
     * 校验码
     */
    private String checkno;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 币种
     */
    private String currencytype;

    /**
    * 获取-id主键
    * @return id
     */
    public String getId() {
        return id;
    }

    /**
    * 设置-id主键
    * @paramType java.lang.String
    * @param id - id主键
     */
    public void setId(String id) {
        this.id = id;
    }

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
    * 获取-金额
    * @return amount
     */
    public String getAmount() {
        return amount;
    }

    /**
    * 设置-金额
    * @paramType java.lang.String
    * @param amount - 金额
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
    * 获取-申请时间
    * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
    * 设置-申请时间
    * @paramType java.util.Date
    * @param createtime - 申请时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
    * 获取-支付方式
    * @return paytype
     */
    public String getPaytype() {
        return paytype;
    }

    /**
    * 设置-支付方式
    * @paramType java.lang.String
    * @param paytype - 支付方式
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    /**
    * 获取-标志
    * @return flag
     */
    public String getFlag() {
        return flag;
    }

    /**
    * 设置-标志
    * @paramType java.lang.String
    * @param flag - 标志
     */
    public void setFlag(String flag) {
        this.flag = flag;
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
    * 获取-最后操作时间
    * @return lasthandletime
     */
    public Date getLasthandletime() {
        return lasthandletime;
    }

    /**
    * 设置-最后操作时间
    * @paramType java.util.Date
    * @param lasthandletime - 最后操作时间
     */
    public void setLasthandletime(Date lasthandletime) {
        this.lasthandletime = lasthandletime;
    }

    /**
    * 获取-校验码
    * @return checkno
     */
    public String getCheckno() {
        return checkno;
    }

    /**
    * 设置-校验码
    * @paramType java.lang.String
    * @param checkno - 校验码
     */
    public void setCheckno(String checkno) {
        this.checkno = checkno;
    }

    /**
    * 获取-分公司
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司
    * @paramType java.lang.String
    * @param subcompany - 分公司
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-币种
    * @return currencytype
     */
    public String getCurrencytype() {
        return currencytype;
    }

    /**
    * 设置-币种
    * @paramType java.lang.String
    * @param currencytype - 币种
     */
    public void setCurrencytype(String currencytype) {
        this.currencytype = currencytype;
    }
}