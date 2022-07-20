package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_voucherno_useable_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmVouchernoUseableTd {
    /**
     * 财务机构代码
     */
    private String unitcode;

    /**
     * 账期
     */
    private String accountdate;

    /**
     * 凭证号
     */
    private Long voucherno;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 生成次数
     */
    private BigDecimal seq;

    /**
     * 是否有效
     */
    private String ifvalidate;

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
    * 获取-账期
    * @return accountdate
     */
    public String getAccountdate() {
        return accountdate;
    }

    /**
    * 设置-账期
    * @paramType java.lang.String
    * @param accountdate - 账期
     */
    public void setAccountdate(String accountdate) {
        this.accountdate = accountdate;
    }

    /**
    * 获取-凭证号
    * @return voucherno
     */
    public Long getVoucherno() {
        return voucherno;
    }

    /**
    * 设置-凭证号
    * @paramType java.lang.Long
    * @param voucherno - 凭证号
     */
    public void setVoucherno(Long voucherno) {
        this.voucherno = voucherno;
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
    * 获取-生成次数
    * @return seq
     */
    public BigDecimal getSeq() {
        return seq;
    }

    /**
    * 设置-生成次数
    * @paramType java.math.BigDecimal
    * @param seq - 生成次数
     */
    public void setSeq(BigDecimal seq) {
        this.seq = seq;
    }

    /**
    * 获取-是否有效
    * @return ifvalidate
     */
    public String getIfvalidate() {
        return ifvalidate;
    }

    /**
    * 设置-是否有效
    * @paramType java.lang.String
    * @param ifvalidate - 是否有效
     */
    public void setIfvalidate(String ifvalidate) {
        this.ifvalidate = ifvalidate;
    }
}