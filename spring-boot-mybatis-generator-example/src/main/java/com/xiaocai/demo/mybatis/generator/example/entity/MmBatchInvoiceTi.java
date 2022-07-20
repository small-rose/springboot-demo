package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_batch_invoice_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmBatchInvoiceTi {
    /**
     * 主键
     */
    private String id;

    /**
     * 流水号，不可重复
     */
    private String taskid;

    /**
     * 0-只修改不开票，1-修改合并开票（仅限电子发票合并开票）
     */
    private String printflag;

    /**
     * 发票抬头
     */
    private String invoicehead;

    /**
     * 0-纸质普票；1-纸质专票；2-电子发票
     */
    private String invoicetype;

    /**
     * 客户纳税人识别号
     */
    private String taxpayerno;

    /**
     * 客户电话
     */
    private String taxpayermobile;

    /**
     * 客户地址
     */
    private String taxpayeraddress;

    /**
     * 客户开户行名称
     */
    private String taxpayeropenaccount;

    /**
     * 客户银行账号
     */
    private String taxpayerbankno;

    /**
     * 电子发票接收手机号
     */
    private String taxpayercellphone;

    /**
     * 电子发票接收邮箱
     */
    private String taxpayeremail;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Short hibernateversion;

    /**
     * 状态,0:初始状态  1:更新纳税人信息完成  2:批量生成发票完成
     */
    private String status;

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
    * 获取-流水号，不可重复
    * @return taskid
     */
    public String getTaskid() {
        return taskid;
    }

    /**
    * 设置-流水号，不可重复
    * @paramType java.lang.String
    * @param taskid - 流水号，不可重复
     */
    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    /**
    * 获取-0-只修改不开票，1-修改合并开票（仅限电子发票合并开票）
    * @return printflag
     */
    public String getPrintflag() {
        return printflag;
    }

    /**
    * 设置-0-只修改不开票，1-修改合并开票（仅限电子发票合并开票）
    * @paramType java.lang.String
    * @param printflag - 0-只修改不开票，1-修改合并开票（仅限电子发票合并开票）
     */
    public void setPrintflag(String printflag) {
        this.printflag = printflag;
    }

    /**
    * 获取-发票抬头
    * @return invoicehead
     */
    public String getInvoicehead() {
        return invoicehead;
    }

    /**
    * 设置-发票抬头
    * @paramType java.lang.String
    * @param invoicehead - 发票抬头
     */
    public void setInvoicehead(String invoicehead) {
        this.invoicehead = invoicehead;
    }

    /**
    * 获取-0-纸质普票；1-纸质专票；2-电子发票
    * @return invoicetype
     */
    public String getInvoicetype() {
        return invoicetype;
    }

    /**
    * 设置-0-纸质普票；1-纸质专票；2-电子发票
    * @paramType java.lang.String
    * @param invoicetype - 0-纸质普票；1-纸质专票；2-电子发票
     */
    public void setInvoicetype(String invoicetype) {
        this.invoicetype = invoicetype;
    }

    /**
    * 获取-客户纳税人识别号
    * @return taxpayerno
     */
    public String getTaxpayerno() {
        return taxpayerno;
    }

    /**
    * 设置-客户纳税人识别号
    * @paramType java.lang.String
    * @param taxpayerno - 客户纳税人识别号
     */
    public void setTaxpayerno(String taxpayerno) {
        this.taxpayerno = taxpayerno;
    }

    /**
    * 获取-客户电话
    * @return taxpayermobile
     */
    public String getTaxpayermobile() {
        return taxpayermobile;
    }

    /**
    * 设置-客户电话
    * @paramType java.lang.String
    * @param taxpayermobile - 客户电话
     */
    public void setTaxpayermobile(String taxpayermobile) {
        this.taxpayermobile = taxpayermobile;
    }

    /**
    * 获取-客户地址
    * @return taxpayeraddress
     */
    public String getTaxpayeraddress() {
        return taxpayeraddress;
    }

    /**
    * 设置-客户地址
    * @paramType java.lang.String
    * @param taxpayeraddress - 客户地址
     */
    public void setTaxpayeraddress(String taxpayeraddress) {
        this.taxpayeraddress = taxpayeraddress;
    }

    /**
    * 获取-客户开户行名称
    * @return taxpayeropenaccount
     */
    public String getTaxpayeropenaccount() {
        return taxpayeropenaccount;
    }

    /**
    * 设置-客户开户行名称
    * @paramType java.lang.String
    * @param taxpayeropenaccount - 客户开户行名称
     */
    public void setTaxpayeropenaccount(String taxpayeropenaccount) {
        this.taxpayeropenaccount = taxpayeropenaccount;
    }

    /**
    * 获取-客户银行账号
    * @return taxpayerbankno
     */
    public String getTaxpayerbankno() {
        return taxpayerbankno;
    }

    /**
    * 设置-客户银行账号
    * @paramType java.lang.String
    * @param taxpayerbankno - 客户银行账号
     */
    public void setTaxpayerbankno(String taxpayerbankno) {
        this.taxpayerbankno = taxpayerbankno;
    }

    /**
    * 获取-电子发票接收手机号
    * @return taxpayercellphone
     */
    public String getTaxpayercellphone() {
        return taxpayercellphone;
    }

    /**
    * 设置-电子发票接收手机号
    * @paramType java.lang.String
    * @param taxpayercellphone - 电子发票接收手机号
     */
    public void setTaxpayercellphone(String taxpayercellphone) {
        this.taxpayercellphone = taxpayercellphone;
    }

    /**
    * 获取-电子发票接收邮箱
    * @return taxpayeremail
     */
    public String getTaxpayeremail() {
        return taxpayeremail;
    }

    /**
    * 设置-电子发票接收邮箱
    * @paramType java.lang.String
    * @param taxpayeremail - 电子发票接收邮箱
     */
    public void setTaxpayeremail(String taxpayeremail) {
        this.taxpayeremail = taxpayeremail;
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
    * 获取-版本号
    * @return hibernateversion
     */
    public Short getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本号
    * @paramType java.lang.Short
    * @param hibernateversion - 版本号
     */
    public void setHibernateversion(Short hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-状态,0:初始状态  1:更新纳税人信息完成  2:批量生成发票完成
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态,0:初始状态  1:更新纳税人信息完成  2:批量生成发票完成
    * @paramType java.lang.String
    * @param status - 状态,0:初始状态  1:更新纳税人信息完成  2:批量生成发票完成
     */
    public void setStatus(String status) {
        this.status = status;
    }
}